package org.modelexecution.operationalsemantics.monolithicrevisitor.benchmark;


import java.io.IOException;
import java.text.MessageFormat;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import activitydiagram.Activity;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.ActivitydiagramPackage;
import monolithicactivitydiagram.revisitor.impl.MonolithicactivitydiagramRevisitorImpl;
import monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityOperation;

public class Benchmark {

	private static final String MODELS_PATH = "{0}/{1}.xmi";

	public void start(final String model, final int warmup, final int iterations, String xmiPath, String prefix) throws IOException {

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
		ActivitydiagramPackage a = ActivitydiagramPackage.eINSTANCE;
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		return new ResourceSetImpl(); 
	}

	private Long executeBenchmark(String modelPath, int itt, String xmiPath) {
		final Activity activity = getActivity(modelPath, xmiPath);
		return doTheJob(activity);

	}


	private Activity getActivity(String modelPath, String xmiPath) {
		ResourceSetImpl resourceSet = this.init();
		final URI uri = URI.createURI(MessageFormat.format(MODELS_PATH, xmiPath, modelPath));
		final Resource resource = resourceSet.getResource(uri, true);
		final EObject eObject = resource.getContents().get(0);
		if (eObject instanceof Activity) {
			return (Activity) eObject;
		}
		return null;
	}
	
	
	private long doTheJob(final Activity activity) {
		MonolithicactivitydiagramActivityOperation $ = new MonolithicactivitydiagramRevisitorImpl() {
		}.$(activity);
		final long start = System.currentTimeMillis();
		$.main(null);
		final long stop = System.currentTimeMillis();
		long l = stop - start;
		return l;
	}

}
