package monolithicactivitydiagram.revisitor.operation.impl;

public  class MonolithicactivitydiagramActivityOperationImpl implements monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityOperation
{
	
	private final activitydiagram.Activity self;
	private final monolithicactivitydiagram.revisitor.MonolithicactivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNodeOperation, ? extends common.revisitor.operation.CommonInputOperation, ? extends common.revisitor.operation.CommonInputValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramJoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramMergeNodeOperation, ? extends common.revisitor.operation.CommonNamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOfferOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramTokenOperation, ? extends common.revisitor.operation.CommonTraceOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramValueOperation, ? extends common.revisitor.operation.CommonVariableOperation> alg;
	
	
	public MonolithicactivitydiagramActivityOperationImpl(activitydiagram.Activity self, monolithicactivitydiagram.revisitor.MonolithicactivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNodeOperation, ? extends common.revisitor.operation.CommonInputOperation, ? extends common.revisitor.operation.CommonInputValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramJoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramMergeNodeOperation, ? extends common.revisitor.operation.CommonNamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOfferOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramTokenOperation, ? extends common.revisitor.operation.CommonTraceOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramValueOperation, ? extends common.revisitor.operation.CommonVariableOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public void initialize(org.eclipse.emf.common.util.EList<activitydiagram.InputValue> inputValues) {
		for(activitydiagram.Variable v: self.getLocals()) {
			v.setCurrentValue(v.getInitialValue());
		}
		if(inputValues != null) {
					for(activitydiagram.InputValue v: inputValues) {
						v.getVariable().setCurrentValue(v.getValue());
					}
				} 
	}
	@Override
	public void main(org.eclipse.emf.common.util.EList<activitydiagram.InputValue> inputValues) {
		alg.$(self).initialize(inputValues);
		alg.$(self).initializeTrace();
		alg.$(self).run();
	}
	@Override
	public void run() {
		alg.$(self).runNodes();
		alg.$(self).fireInitialNode();
		org.eclipse.emf.common.util.EList<activitydiagram.ActivityNode> enabledNodes = alg.$(self).getEnabledNodes();
		while(enabledNodes.size() > 0) {
			activitydiagram.ActivityNode nextNode = alg.$(self).selectNextNode(enabledNodes);
			alg.$(self).fireNode(nextNode);
			enabledNodes = alg.$(self).getEnabledNodes();
		}
	}
	@Override
	public activitydiagram.ActivityNode selectNextNode(org.eclipse.emf.common.util.EList<activitydiagram.ActivityNode> activityNodes) {
		return activityNodes.get(0);
	}
	@Override
	public org.eclipse.emf.common.util.EList<activitydiagram.ActivityNode> getEnabledNodes() {
		org.eclipse.emf.common.util.EList<activitydiagram.ActivityNode> enabledNodes = new org.eclipse.emf.common.util.BasicEList<>();;
		for(activitydiagram.ActivityNode node: self.getNodes()) {
			if(alg.$(node).isReady()) {
						enabledNodes.add(node);
					} 
		}
		return enabledNodes;
	}
	@Override
	public void fireInitialNode() {
		activitydiagram.InitialNode initialNode = alg.$(self).getInitialNode();
		alg.$(self).fireNode(initialNode);
	}
	@Override
	public void fireNode(activitydiagram.ActivityNode node) {
		org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens = alg.$(node).takeOfferedTokens();
		alg.$(node).fire(tokens);
		self.getTrace().getExecutedNodes().add(node);
	}
	@Override
	public activitydiagram.InitialNode getInitialNode() {
		for(activitydiagram.ActivityNode node: self.getNodes()) {
			if(alg.$(node).isInitialNode()) {
						return alg.$(node).asInitialNode();
					} 
		}
		return null;
	}
	@Override
	public void runNodes() {
		for(activitydiagram.ActivityNode node: self.getNodes()) {
			alg.$(node).run();
		}
	}
	@Override
	public void initializeTrace() {
		activitydiagram.Trace trace = activitydiagram.ActivitydiagramFactory.eINSTANCE.createTrace();
		self.setTrace(trace);
	}
	@Override
	public void terminate() {
		for(activitydiagram.ActivityNode node: self.getNodes()) {
			alg.$(node).terminate();
		}
	}
}