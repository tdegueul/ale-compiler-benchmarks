package monolithicactivitydiagram.revisitor.operation.impl;

public class MonolithicactivitydiagramInitialNodeOperationImpl implements monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNodeOperation
{
	
	private final activitydiagram.InitialNode self;
	private final monolithicactivitydiagram.revisitor.MonolithicactivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNodeOperation, ? extends common.revisitor.operation.CommonInputOperation, ? extends common.revisitor.operation.CommonInputValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramJoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramMergeNodeOperation, ? extends common.revisitor.operation.CommonNamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOfferOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramTokenOperation, ? extends common.revisitor.operation.CommonTraceOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramValueOperation, ? extends common.revisitor.operation.CommonVariableOperation> alg;
	
	private final monolithicactivitydiagram.revisitor.operation.impl.MonolithicactivitydiagramControlNodeOperationImpl monolithicactivitydiagramdelegate;
	
	public MonolithicactivitydiagramInitialNodeOperationImpl(activitydiagram.InitialNode self, monolithicactivitydiagram.revisitor.MonolithicactivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramBooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNodeOperation, ? extends common.revisitor.operation.CommonInputOperation, ? extends common.revisitor.operation.CommonInputValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramIntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramJoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramMergeNodeOperation, ? extends common.revisitor.operation.CommonNamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOfferOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramOpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramTokenOperation, ? extends common.revisitor.operation.CommonTraceOperation, ? extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramValueOperation, ? extends common.revisitor.operation.CommonVariableOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
		this.monolithicactivitydiagramdelegate = new monolithicactivitydiagram.revisitor.operation.impl.MonolithicactivitydiagramControlNodeOperationImpl(self, alg);
	}
	@Override
	public void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
		org.eclipse.emf.common.util.EList<activitydiagram.Token> producedTokens = new org.eclipse.emf.common.util.BasicEList<>();;
		producedTokens.add(activitydiagram.ActivitydiagramFactory.eINSTANCE.createControlToken());
		alg.$(self).addTokens(producedTokens);
		alg.$(self).sendOffers(producedTokens);
	}
	@Override
	public Boolean isReady() {
		return false;
	}
	@Override
	public Boolean isInitialNode() {
		return true;
	}
	@Override
	public activitydiagram.InitialNode asInitialNode() {
		return self;
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
	public void sendOffers(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
		this.monolithicactivitydiagramdelegate.sendOffers(tokens);
	}
	@Override
	public org.eclipse.emf.common.util.EList<activitydiagram.Token> takeOfferedTokens() {
		return this.monolithicactivitydiagramdelegate.takeOfferedTokens();
	}
	@Override
	public void addTokens(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
		this.monolithicactivitydiagramdelegate.addTokens(tokens);
	}
	@Override
	public Boolean hasOffers() {
		return this.monolithicactivitydiagramdelegate.hasOffers();
	}
	@Override
	public void removeToken(activitydiagram.Token token) {
		this.monolithicactivitydiagramdelegate.removeToken(token);
	}
}