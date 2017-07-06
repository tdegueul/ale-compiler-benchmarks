package monolithicactivitydiagram.revisitor.operation.impl;

public class MonolithicactivitydiagramActivityNodeOperationImpl implements monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNodeOperation
{
	
	private final activitydiagram.ActivityNode self;
	private final monolithicactivitydiagram.revisitor.MonolithicactivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNodeOperation, ? extends common.revisitor.operation.CommonInputOperation, ? extends common.revisitor.operation.CommonInputValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramJoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramMergeNodeOperation, ? extends common.revisitor.operation.CommonNamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOfferOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramTokenOperation, ? extends common.revisitor.operation.CommonTraceOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramValueOperation, ? extends common.revisitor.operation.CommonVariableOperation> alg;
	
	
	public MonolithicactivitydiagramActivityNodeOperationImpl(activitydiagram.ActivityNode self, monolithicactivitydiagram.revisitor.MonolithicactivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNodeOperation, ? extends common.revisitor.operation.CommonInputOperation, ? extends common.revisitor.operation.CommonInputValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramJoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramMergeNodeOperation, ? extends common.revisitor.operation.CommonNamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOfferOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramTokenOperation, ? extends common.revisitor.operation.CommonTraceOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramValueOperation, ? extends common.revisitor.operation.CommonVariableOperation>  alg) {
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
	public void sendOffers(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
		for(activitydiagram.ActivityEdge edge: self.getOutgoing()) {
			alg.$(edge).sendOffer(tokens);
		}
	}
	@Override
	public org.eclipse.emf.common.util.EList<activitydiagram.Token> takeOfferedTokens() {
		org.eclipse.emf.common.util.EList<activitydiagram.Token> allTokens = new org.eclipse.emf.common.util.BasicEList<>();;
		for(activitydiagram.ActivityEdge edge: self.getIncoming()) {
			org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens = alg.$(edge).takeOfferedTokens();
			for(activitydiagram.Token token: tokens) {
				alg.$(token).withdraw();
			}
			allTokens.addAll(tokens);
		}
		return allTokens;
	}
	@Override
	public void addTokens(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
		for(activitydiagram.Token token: tokens) {
			activitydiagram.Token transferredToken = alg.$(token).transfer(self);
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
	public void removeToken(activitydiagram.Token token) {
		self.getHeldTokens().remove(token);
	}
	@Override
	public void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
	}
}