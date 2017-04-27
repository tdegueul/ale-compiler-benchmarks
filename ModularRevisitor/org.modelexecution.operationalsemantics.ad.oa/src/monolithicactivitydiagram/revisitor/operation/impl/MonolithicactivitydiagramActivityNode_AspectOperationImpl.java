package monolithicactivitydiagram.revisitor.operation.impl;

public class MonolithicactivitydiagramActivityNode_AspectOperationImpl implements monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNode_AspectOperation
{
	
	private final adruntime.ActivityNode_Aspect self;
	private final monolithicactivitydiagram.revisitor.MonolithicactivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramAction_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdge_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityFinalNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivity_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanBinaryExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanUnaryExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanValue_AspectOperation, ? extends common.revisitor.operation.CommonBooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanVariable_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlFlow_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNode_AspectOperation, ? extends common.revisitor.operation.CommonInputOperation, ? extends common.revisitor.operation.CommonInputValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerCalculationExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerComparisonExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerValue_AspectOperation, ? extends common.revisitor.operation.CommonIntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerVariable_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramJoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramJoinNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramMergeNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramMergeNode_AspectOperation, ? extends common.revisitor.operation.CommonNamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOfferOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOpaqueAction_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramTokenOperation, ? extends common.revisitor.operation.CommonTraceOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramValueOperation, ? extends common.revisitor.operation.CommonVariableOperation, ? extends common.revisitor.operation.CommonVariable_AspectOperation> alg;
	
	
	public MonolithicactivitydiagramActivityNode_AspectOperationImpl(adruntime.ActivityNode_Aspect self, monolithicactivitydiagram.revisitor.MonolithicactivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramAction_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdge_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityFinalNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivity_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanBinaryExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanUnaryExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanValue_AspectOperation, ? extends common.revisitor.operation.CommonBooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanVariable_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlFlow_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNode_AspectOperation, ? extends common.revisitor.operation.CommonInputOperation, ? extends common.revisitor.operation.CommonInputValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerCalculationExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerComparisonExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerExpression_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerValue_AspectOperation, ? extends common.revisitor.operation.CommonIntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerVariable_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramJoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramJoinNode_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramMergeNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramMergeNode_AspectOperation, ? extends common.revisitor.operation.CommonNamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOfferOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOpaqueAction_AspectOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramTokenOperation, ? extends common.revisitor.operation.CommonTraceOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramValueOperation, ? extends common.revisitor.operation.CommonVariableOperation, ? extends common.revisitor.operation.CommonVariable_AspectOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public Boolean isInitialNode() {
		return false;
	}
	@Override
	public activitydiagram.InitialNode asInitialNode() {
		return null;
	}
	@Override
	public void run() {
		self.setRunning(true);
	}
	@Override
	public Boolean isRunning() {
		return self.isRunning();
	}
	@Override
	public void terminate() {
		self.setRunning(false);
	}
	@Override
	public Boolean isReady() {
		return self.isRunning();
	}
	@Override
	public void sendOffers(org.eclipse.emf.common.util.EList<adruntime.Token> tokens) {
		for(activitydiagram.ActivityEdge edge: self.getOutgoing()) {
			alg.$(edge).sendOffer(tokens);
		}
	}
	@Override
	public org.eclipse.emf.common.util.EList<adruntime.Token> takeOfferedTokens() {
		org.eclipse.emf.common.util.EList<adruntime.Token> allTokens = new org.eclipse.emf.common.util.BasicEList<>();;
		for(activitydiagram.ActivityEdge edge: self.getIncoming()) {
			org.eclipse.emf.common.util.EList<adruntime.Token> tokens = alg.$(edge).takeOfferedTokens();
			for(adruntime.Token token: tokens) {
				alg.$(token).withdraw();
			}
			allTokens.addAll(tokens);
		}
		return allTokens;
	}
	@Override
	public void addTokens(org.eclipse.emf.common.util.EList<adruntime.Token> tokens) {
		for(adruntime.Token token: tokens) {
			adruntime.Token transferredToken = alg.$(token).transfer(self);
			self.getHeldTokens().add(transferredToken);
		}
	}
	@Override
	public Boolean hasOffers() {
		Boolean hasOffer = true;
		for(activitydiagram.ActivityEdge edge: self.getIncoming()) {
			if(!alg.$(edge).hasOffer()) {
						hasOffer = false;
					} 
		}
		return hasOffer;
	}
	@Override
	public void removeToken(adruntime.Token token) {
		self.getHeldTokens().remove(token);
	}
	@Override
	public void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens) {
	}
}