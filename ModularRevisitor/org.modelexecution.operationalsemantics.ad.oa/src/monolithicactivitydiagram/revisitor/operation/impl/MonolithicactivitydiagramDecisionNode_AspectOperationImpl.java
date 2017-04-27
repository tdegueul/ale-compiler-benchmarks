package monolithicactivitydiagram.revisitor.operation.impl;

public class MonolithicactivitydiagramDecisionNode_AspectOperationImpl implements monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNode_AspectOperation
{
	
	private final adruntime.DecisionNode_Aspect self;
	private final monolithicactivitydiagram.revisitor.MonolithicactivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramAction_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdge_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityFinalNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivity_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanBinaryExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanUnaryExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanValue_AspectOperation, ? extends common.revisitor.operation.CommonBooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanVariable_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlFlow_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNode_AspectOperation, ? extends common.revisitor.operation.CommonInputOperation, ? extends common.revisitor.operation.CommonInputValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerCalculationExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerComparisonExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerValue_AspectOperation, ? extends common.revisitor.operation.CommonIntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerVariable_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramJoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramJoinNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramMergeNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramMergeNode_AspectOperation, ? extends common.revisitor.operation.CommonNamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOfferOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOpaqueAction_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramTokenOperation, ? extends common.revisitor.operation.CommonTraceOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramValueOperation, ? extends common.revisitor.operation.CommonVariableOperation, ? extends common.revisitor.operation.CommonVariable_AspectOperation> alg;
	
	private final monolithicactivitydiagram.revisitor.operation.impl.MonolithicactivitydiagramControlNode_AspectOperationImpl monolithicactivitydiagramdelegate;
	
	public MonolithicactivitydiagramDecisionNode_AspectOperationImpl(adruntime.DecisionNode_Aspect self, monolithicactivitydiagram.revisitor.MonolithicactivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramAction_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdge_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityFinalNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivity_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanBinaryExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanUnaryExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanValue_AspectOperation, ? extends common.revisitor.operation.CommonBooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanVariable_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlFlow_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNode_AspectOperation, ? extends common.revisitor.operation.CommonInputOperation, ? extends common.revisitor.operation.CommonInputValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerCalculationExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerComparisonExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerValue_AspectOperation, ? extends common.revisitor.operation.CommonIntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerVariable_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramJoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramJoinNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramMergeNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramMergeNode_AspectOperation, ? extends common.revisitor.operation.CommonNamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOfferOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOpaqueAction_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramTokenOperation, ? extends common.revisitor.operation.CommonTraceOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramValueOperation, ? extends common.revisitor.operation.CommonVariableOperation, ? extends common.revisitor.operation.CommonVariable_AspectOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
		this.monolithicactivitydiagramdelegate = new monolithicactivitydiagram.revisitor.operation.impl.MonolithicactivitydiagramControlNode_AspectOperationImpl(self, alg);
	}
	@Override
	public void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens) {
		activitydiagram.ActivityEdge selectedEdge = null;
		for(activitydiagram.ActivityEdge edge: self.getOutgoing()) {
			if(alg.$(edge).isControlFlow()) {
						activitydiagram.ControlFlow controlFlow = alg.$(edge).asControlFlow();
						activitydiagram.Value guardValue = controlFlow.getGuard().getCurrentValue();
						if(alg.$(guardValue).isBooleanValue()) {
									activitydiagram.BooleanValue booleanValue = alg.$(guardValue).asBooleanValue();
									if(booleanValue.isValue()) {
												selectedEdge = edge;
												break;
											} 
								} 
					} 
		}
		if(selectedEdge != null) {
					alg.$(self).addTokens(tokens);
					alg.$(selectedEdge).sendOffer(tokens);
				} 
	}
	@Override
	public Boolean isReady() {
		Boolean ready = true;
		for(activitydiagram.ActivityEdge edge: self.getIncoming()) {
			if(!alg.$(edge).hasOffer()) {
						ready = false;
					} 
		}
		return ready;
	}
	@Override
	public Boolean isInitialNode() {
		return this.monolithicactivitydiagramdelegate.isInitialNode();
	}
	@Override
	public activitydiagram.InitialNode asInitialNode() {
		return this.monolithicactivitydiagramdelegate.asInitialNode();
	}
	@Override
	public void run() {
		this.monolithicactivitydiagramdelegate.run();
	}
	@Override
	public Boolean isRunning() {
		return this.monolithicactivitydiagramdelegate.isRunning();
	}
	@Override
	public void terminate() {
		this.monolithicactivitydiagramdelegate.terminate();
	}
	@Override
	public void sendOffers(org.eclipse.emf.common.util.EList<adruntime.Token> tokens) {
		this.monolithicactivitydiagramdelegate.sendOffers(tokens);
	}
	@Override
	public org.eclipse.emf.common.util.EList<adruntime.Token> takeOfferedTokens() {
		return this.monolithicactivitydiagramdelegate.takeOfferedTokens();
	}
	@Override
	public void addTokens(org.eclipse.emf.common.util.EList<adruntime.Token> tokens) {
		this.monolithicactivitydiagramdelegate.addTokens(tokens);
	}
	@Override
	public Boolean hasOffers() {
		return this.monolithicactivitydiagramdelegate.hasOffers();
	}
	@Override
	public void removeToken(adruntime.Token token) {
		this.monolithicactivitydiagramdelegate.removeToken(token);
	}
}