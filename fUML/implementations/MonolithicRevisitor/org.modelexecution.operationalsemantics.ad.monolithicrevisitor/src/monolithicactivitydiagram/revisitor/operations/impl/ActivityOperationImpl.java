package monolithicactivitydiagram.revisitor.operations.impl;

public class ActivityOperationImpl implements monolithicactivitydiagram.revisitor.operations.ActivityOperation {
	private final activitydiagram.Activity self;
	private final activitydiagram.revisitor.ActivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operations.ActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.DecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.FinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.InitialNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.JoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.MergeNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.NamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operations.OfferOperation, ? extends monolithicactivitydiagram.revisitor.operations.OpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.TokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.TraceOperation, ? extends monolithicactivitydiagram.revisitor.operations.ValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.VariableOperation> alg;


	public ActivityOperationImpl(activitydiagram.Activity self, activitydiagram.revisitor.ActivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operations.ActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.DecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.FinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.InitialNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.JoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.MergeNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.NamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operations.OfferOperation, ? extends monolithicactivitydiagram.revisitor.operations.OpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.TokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.TraceOperation, ? extends monolithicactivitydiagram.revisitor.operations.ValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.VariableOperation> alg) {
		this.self = self;
		this.alg = alg;
	}

	@Override
	public void initialize(org.eclipse.emf.common.util.EList<activitydiagram.InputValue> inputValues) {
		for (activitydiagram.Variable v: self.getLocals()) {
			v.setCurrentValue(v.getInitialValue());
		}
		if (inputValues != null) {
			for (activitydiagram.InputValue v: inputValues) {
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
		while (enabledNodes.size() > 0) {
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
		org.eclipse.emf.common.util.EList<activitydiagram.ActivityNode> enabledNodes = new org.eclipse.emf.common.util.BasicEList<>();
		for (activitydiagram.ActivityNode node: self.getNodes()) {
			if (alg.$(node).isReady()) {
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
		for (activitydiagram.ActivityNode node: self.getNodes()) {
			if (alg.$(node).isInitialNode()) {
				return alg.$(node).asInitialNode();
			} 
		}
		return null;
	}
	@Override
	public void runNodes() {
		for (activitydiagram.ActivityNode node: self.getNodes()) {
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
		for (activitydiagram.ActivityNode node: self.getNodes()) {
			alg.$(node).terminate();
		}
	}
}
