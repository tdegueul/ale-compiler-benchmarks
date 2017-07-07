package org.modelexecution.operationalsemantics.modularrevisitor.benchmark;

import java.io.IOException;
import java.text.MessageFormat;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import activitydiagram.ActivitydiagramFactory;
import adruntime.Activity_Aspect;
import adruntime.AdruntimePackage;
import adwithoutruntime.Activity;
import adwithoutruntime.ActivityFinalNode;
import adwithoutruntime.BooleanBinaryExpression;
import adwithoutruntime.BooleanUnaryExpression;
import adwithoutruntime.BooleanValue;
import adwithoutruntime.BooleanVariable;
import adwithoutruntime.ControlFlow;
import adwithoutruntime.DecisionNode;
import adwithoutruntime.ForkNode;
import adwithoutruntime.InitialNode;
import adwithoutruntime.IntegerCalculationExpression;
import adwithoutruntime.IntegerComparisonExpression;
import adwithoutruntime.IntegerValue;
import adwithoutruntime.IntegerVariable;
import adwithoutruntime.JoinNode;
import adwithoutruntime.MergeNode;
import adwithoutruntime.OpaqueAction;
import modularactivitydiagram.revisitor.ModularactivitydiagramRevisitor;
import modularactivitydiagram.revisitor.operations.ActionOperation;
import modularactivitydiagram.revisitor.operations.ActivityEdgeOperation;
import modularactivitydiagram.revisitor.operations.ActivityFinalNodeOperation;
import modularactivitydiagram.revisitor.operations.ActivityNodeOperation;
import modularactivitydiagram.revisitor.operations.ActivityOperation;
import modularactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation;
import modularactivitydiagram.revisitor.operations.BooleanExpressionOperation;
import modularactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation;
import modularactivitydiagram.revisitor.operations.BooleanValueOperation;
import modularactivitydiagram.revisitor.operations.BooleanVariableOperation;
import modularactivitydiagram.revisitor.operations.ControlFlowOperation;
import modularactivitydiagram.revisitor.operations.ControlNodeOperation;
import modularactivitydiagram.revisitor.operations.DecisionNodeOperation;
import modularactivitydiagram.revisitor.operations.ExecutableNodeOperation;
import modularactivitydiagram.revisitor.operations.ExpressionOperation;
import modularactivitydiagram.revisitor.operations.FinalNodeOperation;
import modularactivitydiagram.revisitor.operations.ForkNodeOperation;
import modularactivitydiagram.revisitor.operations.InitialNodeOperation;
import modularactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation;
import modularactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation;
import modularactivitydiagram.revisitor.operations.IntegerExpressionOperation;
import modularactivitydiagram.revisitor.operations.IntegerValueOperation;
import modularactivitydiagram.revisitor.operations.IntegerVariableOperation;
import modularactivitydiagram.revisitor.operations.JoinNodeOperation;
import modularactivitydiagram.revisitor.operations.MergeNodeOperation;
import modularactivitydiagram.revisitor.operations.NamedElementOperation;
import modularactivitydiagram.revisitor.operations.OpaqueActionOperation;
import modularactivitydiagram.revisitor.operations.ValueOperation;
import modularactivitydiagram.revisitor.operations.VariableOperation;

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
		final ModularactivitydiagramRevisitor modularRevisitorImpl = new ModularactivitydiagramRevisitor() {

			@Override
			public ActivityOperation activity(Activity a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public NamedElementOperation namedElement_activity(Activity a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ActivityFinalNodeOperation activityFinalNode(ActivityFinalNode a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public NamedElementOperation namedElement_activityFinalNode(ActivityFinalNode a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ActivityNodeOperation activityNode_activityFinalNode(ActivityFinalNode a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ControlNodeOperation controlNode_activityFinalNode(ActivityFinalNode a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public FinalNodeOperation finalNode_activityFinalNode(ActivityFinalNode a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public BooleanBinaryExpressionOperation booleanBinaryExpression(BooleanBinaryExpression b) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ExpressionOperation expression_booleanBinaryExpression(BooleanBinaryExpression b) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public BooleanExpressionOperation booleanExpression_booleanBinaryExpression(BooleanBinaryExpression b) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public BooleanUnaryExpressionOperation booleanUnaryExpression(BooleanUnaryExpression b) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ExpressionOperation expression_booleanUnaryExpression(BooleanUnaryExpression b) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public BooleanExpressionOperation booleanExpression_booleanUnaryExpression(BooleanUnaryExpression b) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public BooleanValueOperation booleanValue(BooleanValue b) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ValueOperation value_booleanValue(BooleanValue b) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public BooleanVariableOperation booleanVariable(BooleanVariable b) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public VariableOperation variable_booleanVariable(BooleanVariable b) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ControlFlowOperation controlFlow(ControlFlow c) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public NamedElementOperation namedElement_controlFlow(ControlFlow c) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ActivityEdgeOperation activityEdge_controlFlow(ControlFlow c) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public DecisionNodeOperation decisionNode(DecisionNode d) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public NamedElementOperation namedElement_decisionNode(DecisionNode d) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ActivityNodeOperation activityNode_decisionNode(DecisionNode d) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ControlNodeOperation controlNode_decisionNode(DecisionNode d) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ForkNodeOperation forkNode(ForkNode f) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public NamedElementOperation namedElement_forkNode(ForkNode f) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ActivityNodeOperation activityNode_forkNode(ForkNode f) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ControlNodeOperation controlNode_forkNode(ForkNode f) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public InitialNodeOperation initialNode(InitialNode i) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public NamedElementOperation namedElement_initialNode(InitialNode i) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ActivityNodeOperation activityNode_initialNode(InitialNode i) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ControlNodeOperation controlNode_initialNode(InitialNode i) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public IntegerCalculationExpressionOperation integerCalculationExpression(IntegerCalculationExpression i) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ExpressionOperation expression_integerCalculationExpression(IntegerCalculationExpression i) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public IntegerExpressionOperation integerExpression_integerCalculationExpression(
					IntegerCalculationExpression i) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public IntegerComparisonExpressionOperation integerComparisonExpression(IntegerComparisonExpression i) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ExpressionOperation expression_integerComparisonExpression(IntegerComparisonExpression i) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public IntegerExpressionOperation integerExpression_integerComparisonExpression(
					IntegerComparisonExpression i) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public IntegerValueOperation integerValue(IntegerValue i) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ValueOperation value_integerValue(IntegerValue i) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public IntegerVariableOperation integerVariable(IntegerVariable i) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public VariableOperation variable_integerVariable(IntegerVariable i) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public JoinNodeOperation joinNode(JoinNode j) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public NamedElementOperation namedElement_joinNode(JoinNode j) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ActivityNodeOperation activityNode_joinNode(JoinNode j) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ControlNodeOperation controlNode_joinNode(JoinNode j) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public MergeNodeOperation mergeNode(MergeNode m) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public NamedElementOperation namedElement_mergeNode(MergeNode m) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ActivityNodeOperation activityNode_mergeNode(MergeNode m) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ControlNodeOperation controlNode_mergeNode(MergeNode m) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public OpaqueActionOperation opaqueAction(OpaqueAction o) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public NamedElementOperation namedElement_opaqueAction(OpaqueAction o) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ActivityNodeOperation activityNode_opaqueAction(OpaqueAction o) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ExecutableNodeOperation executableNode_opaqueAction(OpaqueAction o) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ActionOperation action_opaqueAction(OpaqueAction o) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		final long start = System.currentTimeMillis();
		modularRevisitorImpl.$(activity).main(null);
		final long stop = System.currentTimeMillis();
		final long l = stop - start;
		return l;
	}

}
