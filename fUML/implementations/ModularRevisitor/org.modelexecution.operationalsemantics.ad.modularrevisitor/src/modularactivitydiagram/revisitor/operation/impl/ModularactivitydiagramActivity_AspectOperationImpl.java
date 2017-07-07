package modularactivitydiagram.revisitor.operation.impl;

public  class ModularactivitydiagramActivity_AspectOperationImpl implements modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivity_AspectOperation
{
	
	private final adruntime.Activity_Aspect self;
	private final modularactivitydiagram.revisitor.ModularactivitydiagramRevisitor<? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramAction_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityEdgeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityEdge_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityFinalNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityFinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivity_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanBinaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanBinaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanUnaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanUnaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanValueOperation, ? extends common.revisitor.operation.CommonBooleanVariableOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlFlowOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlFlow_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlTokenOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramDecisionNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramDecisionNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramExecutableNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramExecutableNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramFinalNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramFinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramForkNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramForkNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramForkedTokenOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramInitialNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramInitialNode_AspectOperation, ? extends common.revisitor.operation.CommonInputOperation, ? extends common.revisitor.operation.CommonInputValueOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerCalculationExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerCalculationExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerComparisonExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerComparisonExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerValueOperation, ? extends common.revisitor.operation.CommonIntegerVariableOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramJoinNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramJoinNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramMergeNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramMergeNode_AspectOperation, ? extends common.revisitor.operation.CommonNamedElementOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramOfferOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramOpaqueActionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramOpaqueAction_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramTokenOperation, ? extends common.revisitor.operation.CommonTraceOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramValueOperation, ? extends common.revisitor.operation.CommonVariableOperation, ? extends common.revisitor.operation.CommonVariable_AspectOperation> alg;
	
	
	public ModularactivitydiagramActivity_AspectOperationImpl(adruntime.Activity_Aspect self, modularactivitydiagram.revisitor.ModularactivitydiagramRevisitor<? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramAction_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityEdgeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityEdge_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityFinalNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityFinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivity_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanBinaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanBinaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanUnaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanUnaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanValueOperation, ? extends common.revisitor.operation.CommonBooleanVariableOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlFlowOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlFlow_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlTokenOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramDecisionNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramDecisionNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramExecutableNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramExecutableNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramFinalNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramFinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramForkNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramForkNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramForkedTokenOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramInitialNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramInitialNode_AspectOperation, ? extends common.revisitor.operation.CommonInputOperation, ? extends common.revisitor.operation.CommonInputValueOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerCalculationExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerCalculationExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerComparisonExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerComparisonExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerValueOperation, ? extends common.revisitor.operation.CommonIntegerVariableOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramJoinNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramJoinNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramMergeNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramMergeNode_AspectOperation, ? extends common.revisitor.operation.CommonNamedElementOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramOfferOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramOpaqueActionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramOpaqueAction_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramTokenOperation, ? extends common.revisitor.operation.CommonTraceOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramValueOperation, ? extends common.revisitor.operation.CommonVariableOperation, ? extends common.revisitor.operation.CommonVariable_AspectOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public void initialize(org.eclipse.emf.common.util.EList<adruntime.InputValue> inputValues) {
		for(adwithoutruntime.Variable v: self.getLocals()) {
			v.setCurrentValue(v.getInitialValue());
		}
		if(inputValues != null) {
					for(adruntime.InputValue v: inputValues) {
						v.getVariable().setCurrentValue(v.getValue());
					}
				} 
	}
	@Override
	public void main(org.eclipse.emf.common.util.EList<adruntime.InputValue> inputValues) {
		alg.$(self).initialize(inputValues);
		alg.$(self).initializeTrace();
		alg.$(self).run();
	}
	@Override
	public void run() {
		alg.$(self).runNodes();
		alg.$(self).fireInitialNode();
		org.eclipse.emf.common.util.EList<adwithoutruntime.ActivityNode> enabledNodes = alg.$(self).getEnabledNodes();
		while(enabledNodes.size() > 0) {
			adwithoutruntime.ActivityNode nextNode = alg.$(self).selectNextNode(enabledNodes);
			alg.$(self).fireNode(nextNode);
			enabledNodes = alg.$(self).getEnabledNodes();
		}
	}
	@Override
	public adwithoutruntime.ActivityNode selectNextNode(org.eclipse.emf.common.util.EList<adwithoutruntime.ActivityNode> activityNodes) {
		return activityNodes.get(0);
	}
	@Override
	public org.eclipse.emf.common.util.EList<adwithoutruntime.ActivityNode> getEnabledNodes() {
		org.eclipse.emf.common.util.EList<adwithoutruntime.ActivityNode> enabledNodes = new org.eclipse.emf.common.util.BasicEList<>();;
		for(adwithoutruntime.ActivityNode node: self.getNodes()) {
			if(alg.$(node).isReady()) {
						enabledNodes.add(node);
					} 
		}
		return enabledNodes;
	}
	@Override
	public void fireInitialNode() {
		adwithoutruntime.InitialNode initialNode = alg.$(self).getInitialNode();
		alg.$(self).fireNode(initialNode);
	}
	@Override
	public void fireNode(adwithoutruntime.ActivityNode node) {
		org.eclipse.emf.common.util.EList<adruntime.Token> tokens = alg.$(node).takeOfferedTokens();
		alg.$(node).fire(tokens);
		self.getTrace().getExecutedNodes().add(node);
	}
	@Override
	public adwithoutruntime.InitialNode getInitialNode() {
		for(adwithoutruntime.ActivityNode node: self.getNodes()) {
			if(alg.$(node).isInitialNode()) {
						return alg.$(node).asInitialNode();
					} 
		}
		return null;
	}
	@Override
	public void runNodes() {
		for(adwithoutruntime.ActivityNode node: self.getNodes()) {
			alg.$(node).run();
		}
	}
	@Override
	public void initializeTrace() {
		adruntime.Trace trace = adruntime.AdruntimeFactory.eINSTANCE.createTrace();
		self.setTrace(trace);
	}
	@Override
	public void terminate() {
		for(adwithoutruntime.ActivityNode node: self.getNodes()) {
			alg.$(node).terminate();
		}
	}
}