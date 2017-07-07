package org.modelexecution.operationalsemantics.modularrevisitor.benchmark;

import java.io.IOException;
import java.text.MessageFormat;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.ActivitydiagramPackage;
import adruntime.Activity_Aspect;
import adruntime.AdruntimePackage;
import modularactivitydiagram.revisitor.impl.ModularactivitydiagramRevisitorImpl;

public class Benchmark {

	private static final String MODELS_PATH = "{0}/{1}.xmi";

	public void start(final String model, final int warmup, final int iterations, final String xmiPath,
			final String prefix) throws IOException {
		final Result res = new Result();
		for (int i = 0; i < warmup; i++) {
			this.executeBenchmark(model, i, xmiPath);
		}

		for (int i = 0; i < iterations; i++) {

			res.getResults().add(this.executeBenchmark(model, i, xmiPath));
		}
		res.save(model, prefix);

	}

	private ResourceSetImpl init() {
		ActivitydiagramFactory.eINSTANCE.eClass();
		final AdruntimePackage a = AdruntimePackage.eINSTANCE;
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		return new ResourceSetImpl();
	}

	private Long executeBenchmark(final String modelPath, final int itt, final String xmiPath) {
		final Activity_Aspect activity = getActivity(modelPath, xmiPath);
		return doTheJob(activity);

	}

	private Activity_Aspect getActivity(final String modelPath, final String xmiPath) {
		final ResourceSetImpl resourceSet = this.init();
		final URI uri = URI.createURI(MessageFormat.format(MODELS_PATH, xmiPath, modelPath));
		final Resource resource = resourceSet.getResource(uri, true);
		final EObject eObject = resource.getContents().get(0);
		if (eObject instanceof Activity_Aspect) {
			return (Activity_Aspect) eObject;
		}
		return null;
	}

	private long doTheJob(final Activity_Aspect activity) {
		final ModularactivitydiagramRevisitorImpl modularRevisitorImpl = new ModularactivitydiagramRevisitorImpl() {
		};
		final long start = System.currentTimeMillis();
		modularRevisitorImpl.$(activity).main(null);
		final long stop = System.currentTimeMillis();
		final long l = stop - start;
		return l;
	}

}
