package monolithicactivitydiagram.revisitor.operations.impl;

public class ActivityNodeOperationImpl implements monolithicactivitydiagram.revisitor.operations.ActivityNodeOperation {
	private final activitydiagram.ActivityNode self;
	private final activitydiagram.revisitor.ActivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operations.ActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.DecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.FinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.InitialNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.JoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.MergeNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.NamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operations.OfferOperation, ? extends monolithicactivitydiagram.revisitor.operations.OpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.TokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.TraceOperation, ? extends monolithicactivitydiagram.revisitor.operations.ValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.VariableOperation> alg;


	public ActivityNodeOperationImpl(activitydiagram.ActivityNode self, activitydiagram.revisitor.ActivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operations.ActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.DecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.FinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.InitialNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.JoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.MergeNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.NamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operations.OfferOperation, ? extends monolithicactivitydiagram.revisitor.operations.OpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.TokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.TraceOperation, ? extends monolithicactivitydiagram.revisitor.operations.ValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.VariableOperation> alg) {
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
		for (activitydiagram.ActivityEdge edge: self.getOutgoing()) {
			alg.$(edge).sendOffer(tokens);
		}
	}
	@Override
	public org.eclipse.emf.common.util.EList<activitydiagram.Token> takeOfferedTokens() {
		org.eclipse.emf.common.util.EList<activitydiagram.Token> allTokens = new org.eclipse.emf.common.util.BasicEList<>();
		for (activitydiagram.ActivityEdge edge: self.getIncoming()) {
			org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens = alg.$(edge).takeOfferedTokens();
			for (activitydiagram.Token token: tokens) {
				alg.$(token).withdraw();
			}
			allTokens.addAll(tokens);
		}
		return allTokens;
	}
	@Override
	public void addTokens(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
		for (activitydiagram.Token token: tokens) {
			activitydiagram.Token transferredToken = alg.$(token).transfer(self);
			self.getHeldTokens().add(transferredToken);
		}
	}
	@Override
	public Boolean hasOffers() {
		Boolean hasOffer = true;
		for (activitydiagram.ActivityEdge edge: self.getIncoming()) {
			if (!alg.$(edge).hasOffer()) {
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
