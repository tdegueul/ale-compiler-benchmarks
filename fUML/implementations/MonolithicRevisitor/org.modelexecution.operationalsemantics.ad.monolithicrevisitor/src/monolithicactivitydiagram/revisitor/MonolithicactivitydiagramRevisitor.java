package monolithicactivitydiagram.revisitor;

public interface MonolithicactivitydiagramRevisitor extends activitydiagram.revisitor.ActivitydiagramRevisitor<monolithicactivitydiagram.revisitor.operations.ActionOperation, monolithicactivitydiagram.revisitor.operations.ActivityOperation, monolithicactivitydiagram.revisitor.operations.ActivityEdgeOperation, monolithicactivitydiagram.revisitor.operations.ActivityFinalNodeOperation, monolithicactivitydiagram.revisitor.operations.ActivityNodeOperation, monolithicactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation, monolithicactivitydiagram.revisitor.operations.BooleanExpressionOperation, monolithicactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation, monolithicactivitydiagram.revisitor.operations.BooleanValueOperation, monolithicactivitydiagram.revisitor.operations.BooleanVariableOperation, monolithicactivitydiagram.revisitor.operations.ControlFlowOperation, monolithicactivitydiagram.revisitor.operations.ControlNodeOperation, monolithicactivitydiagram.revisitor.operations.ControlTokenOperation, monolithicactivitydiagram.revisitor.operations.DecisionNodeOperation, monolithicactivitydiagram.revisitor.operations.ExecutableNodeOperation, monolithicactivitydiagram.revisitor.operations.ExpressionOperation, monolithicactivitydiagram.revisitor.operations.FinalNodeOperation, monolithicactivitydiagram.revisitor.operations.ForkNodeOperation, monolithicactivitydiagram.revisitor.operations.ForkedTokenOperation, monolithicactivitydiagram.revisitor.operations.InitialNodeOperation, monolithicactivitydiagram.revisitor.operations.InputOperation, monolithicactivitydiagram.revisitor.operations.InputValueOperation, monolithicactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation, monolithicactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation, monolithicactivitydiagram.revisitor.operations.IntegerExpressionOperation, monolithicactivitydiagram.revisitor.operations.IntegerValueOperation, monolithicactivitydiagram.revisitor.operations.IntegerVariableOperation, monolithicactivitydiagram.revisitor.operations.JoinNodeOperation, monolithicactivitydiagram.revisitor.operations.MergeNodeOperation, monolithicactivitydiagram.revisitor.operations.NamedElementOperation, monolithicactivitydiagram.revisitor.operations.OfferOperation, monolithicactivitydiagram.revisitor.operations.OpaqueActionOperation, monolithicactivitydiagram.revisitor.operations.TokenOperation, monolithicactivitydiagram.revisitor.operations.TraceOperation, monolithicactivitydiagram.revisitor.operations.ValueOperation, monolithicactivitydiagram.revisitor.operations.VariableOperation> {
	@Override
	default monolithicactivitydiagram.revisitor.operations.ActivityOperation activity(final activitydiagram.Activity a) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ActivityOperationImpl(a, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ActivityOperation namedElement_activity(final activitydiagram.Activity a) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ActivityOperationImpl(a, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ActivityFinalNodeOperation activityFinalNode(final activitydiagram.ActivityFinalNode a) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ActivityFinalNodeOperationImpl(a, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ActivityFinalNodeOperation namedElement_activityFinalNode(final activitydiagram.ActivityFinalNode a) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ActivityFinalNodeOperationImpl(a, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ActivityFinalNodeOperation activityNode_activityFinalNode(final activitydiagram.ActivityFinalNode a) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ActivityFinalNodeOperationImpl(a, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ActivityFinalNodeOperation controlNode_activityFinalNode(final activitydiagram.ActivityFinalNode a) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ActivityFinalNodeOperationImpl(a, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ActivityFinalNodeOperation finalNode_activityFinalNode(final activitydiagram.ActivityFinalNode a) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ActivityFinalNodeOperationImpl(a, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation booleanBinaryExpression(final activitydiagram.BooleanBinaryExpression b) {
		return new monolithicactivitydiagram.revisitor.operations.impl.BooleanBinaryExpressionOperationImpl(b, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation expression_booleanBinaryExpression(final activitydiagram.BooleanBinaryExpression b) {
		return new monolithicactivitydiagram.revisitor.operations.impl.BooleanBinaryExpressionOperationImpl(b, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation booleanExpression_booleanBinaryExpression(final activitydiagram.BooleanBinaryExpression b) {
		return new monolithicactivitydiagram.revisitor.operations.impl.BooleanBinaryExpressionOperationImpl(b, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation booleanUnaryExpression(final activitydiagram.BooleanUnaryExpression b) {
		return new monolithicactivitydiagram.revisitor.operations.impl.BooleanUnaryExpressionOperationImpl(b, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation expression_booleanUnaryExpression(final activitydiagram.BooleanUnaryExpression b) {
		return new monolithicactivitydiagram.revisitor.operations.impl.BooleanUnaryExpressionOperationImpl(b, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation booleanExpression_booleanUnaryExpression(final activitydiagram.BooleanUnaryExpression b) {
		return new monolithicactivitydiagram.revisitor.operations.impl.BooleanUnaryExpressionOperationImpl(b, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.BooleanValueOperation booleanValue(final activitydiagram.BooleanValue b) {
		return new monolithicactivitydiagram.revisitor.operations.impl.BooleanValueOperationImpl(b, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.BooleanValueOperation value_booleanValue(final activitydiagram.BooleanValue b) {
		return new monolithicactivitydiagram.revisitor.operations.impl.BooleanValueOperationImpl(b, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.BooleanVariableOperation booleanVariable(final activitydiagram.BooleanVariable b) {
		return new monolithicactivitydiagram.revisitor.operations.impl.BooleanVariableOperationImpl(b, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.BooleanVariableOperation variable_booleanVariable(final activitydiagram.BooleanVariable b) {
		return new monolithicactivitydiagram.revisitor.operations.impl.BooleanVariableOperationImpl(b, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ControlFlowOperation controlFlow(final activitydiagram.ControlFlow c) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ControlFlowOperationImpl(c, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ControlFlowOperation namedElement_controlFlow(final activitydiagram.ControlFlow c) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ControlFlowOperationImpl(c, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ControlFlowOperation activityEdge_controlFlow(final activitydiagram.ControlFlow c) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ControlFlowOperationImpl(c, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ControlTokenOperation controlToken(final activitydiagram.ControlToken c) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ControlTokenOperationImpl(c, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ControlTokenOperation token_controlToken(final activitydiagram.ControlToken c) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ControlTokenOperationImpl(c, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.DecisionNodeOperation decisionNode(final activitydiagram.DecisionNode d) {
		return new monolithicactivitydiagram.revisitor.operations.impl.DecisionNodeOperationImpl(d, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.DecisionNodeOperation namedElement_decisionNode(final activitydiagram.DecisionNode d) {
		return new monolithicactivitydiagram.revisitor.operations.impl.DecisionNodeOperationImpl(d, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.DecisionNodeOperation activityNode_decisionNode(final activitydiagram.DecisionNode d) {
		return new monolithicactivitydiagram.revisitor.operations.impl.DecisionNodeOperationImpl(d, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.DecisionNodeOperation controlNode_decisionNode(final activitydiagram.DecisionNode d) {
		return new monolithicactivitydiagram.revisitor.operations.impl.DecisionNodeOperationImpl(d, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ForkNodeOperation forkNode(final activitydiagram.ForkNode f) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ForkNodeOperationImpl(f, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ForkNodeOperation namedElement_forkNode(final activitydiagram.ForkNode f) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ForkNodeOperationImpl(f, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ForkNodeOperation activityNode_forkNode(final activitydiagram.ForkNode f) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ForkNodeOperationImpl(f, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ForkNodeOperation controlNode_forkNode(final activitydiagram.ForkNode f) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ForkNodeOperationImpl(f, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ForkedTokenOperation forkedToken(final activitydiagram.ForkedToken f) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ForkedTokenOperationImpl(f, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.ForkedTokenOperation token_forkedToken(final activitydiagram.ForkedToken f) {
		return new monolithicactivitydiagram.revisitor.operations.impl.ForkedTokenOperationImpl(f, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.InitialNodeOperation initialNode(final activitydiagram.InitialNode i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.InitialNodeOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.InitialNodeOperation namedElement_initialNode(final activitydiagram.InitialNode i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.InitialNodeOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.InitialNodeOperation activityNode_initialNode(final activitydiagram.InitialNode i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.InitialNodeOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.InitialNodeOperation controlNode_initialNode(final activitydiagram.InitialNode i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.InitialNodeOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.InputOperation input(final activitydiagram.Input i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.InputOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.InputValueOperation inputValue(final activitydiagram.InputValue i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.InputValueOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation integerCalculationExpression(final activitydiagram.IntegerCalculationExpression i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.IntegerCalculationExpressionOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation expression_integerCalculationExpression(final activitydiagram.IntegerCalculationExpression i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.IntegerCalculationExpressionOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation integerExpression_integerCalculationExpression(final activitydiagram.IntegerCalculationExpression i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.IntegerCalculationExpressionOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation integerComparisonExpression(final activitydiagram.IntegerComparisonExpression i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.IntegerComparisonExpressionOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation expression_integerComparisonExpression(final activitydiagram.IntegerComparisonExpression i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.IntegerComparisonExpressionOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation integerExpression_integerComparisonExpression(final activitydiagram.IntegerComparisonExpression i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.IntegerComparisonExpressionOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.IntegerValueOperation integerValue(final activitydiagram.IntegerValue i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.IntegerValueOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.IntegerValueOperation value_integerValue(final activitydiagram.IntegerValue i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.IntegerValueOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.IntegerVariableOperation integerVariable(final activitydiagram.IntegerVariable i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.IntegerVariableOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.IntegerVariableOperation variable_integerVariable(final activitydiagram.IntegerVariable i) {
		return new monolithicactivitydiagram.revisitor.operations.impl.IntegerVariableOperationImpl(i, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.JoinNodeOperation joinNode(final activitydiagram.JoinNode j) {
		return new monolithicactivitydiagram.revisitor.operations.impl.JoinNodeOperationImpl(j, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.JoinNodeOperation namedElement_joinNode(final activitydiagram.JoinNode j) {
		return new monolithicactivitydiagram.revisitor.operations.impl.JoinNodeOperationImpl(j, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.JoinNodeOperation activityNode_joinNode(final activitydiagram.JoinNode j) {
		return new monolithicactivitydiagram.revisitor.operations.impl.JoinNodeOperationImpl(j, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.JoinNodeOperation controlNode_joinNode(final activitydiagram.JoinNode j) {
		return new monolithicactivitydiagram.revisitor.operations.impl.JoinNodeOperationImpl(j, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.MergeNodeOperation mergeNode(final activitydiagram.MergeNode m) {
		return new monolithicactivitydiagram.revisitor.operations.impl.MergeNodeOperationImpl(m, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.MergeNodeOperation namedElement_mergeNode(final activitydiagram.MergeNode m) {
		return new monolithicactivitydiagram.revisitor.operations.impl.MergeNodeOperationImpl(m, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.MergeNodeOperation activityNode_mergeNode(final activitydiagram.MergeNode m) {
		return new monolithicactivitydiagram.revisitor.operations.impl.MergeNodeOperationImpl(m, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.MergeNodeOperation controlNode_mergeNode(final activitydiagram.MergeNode m) {
		return new monolithicactivitydiagram.revisitor.operations.impl.MergeNodeOperationImpl(m, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.OfferOperation offer(final activitydiagram.Offer o) {
		return new monolithicactivitydiagram.revisitor.operations.impl.OfferOperationImpl(o, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.OpaqueActionOperation opaqueAction(final activitydiagram.OpaqueAction o) {
		return new monolithicactivitydiagram.revisitor.operations.impl.OpaqueActionOperationImpl(o, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.OpaqueActionOperation namedElement_opaqueAction(final activitydiagram.OpaqueAction o) {
		return new monolithicactivitydiagram.revisitor.operations.impl.OpaqueActionOperationImpl(o, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.OpaqueActionOperation activityNode_opaqueAction(final activitydiagram.OpaqueAction o) {
		return new monolithicactivitydiagram.revisitor.operations.impl.OpaqueActionOperationImpl(o, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.OpaqueActionOperation executableNode_opaqueAction(final activitydiagram.OpaqueAction o) {
		return new monolithicactivitydiagram.revisitor.operations.impl.OpaqueActionOperationImpl(o, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.OpaqueActionOperation action_opaqueAction(final activitydiagram.OpaqueAction o) {
		return new monolithicactivitydiagram.revisitor.operations.impl.OpaqueActionOperationImpl(o, this);
	}
	@Override
	default monolithicactivitydiagram.revisitor.operations.TraceOperation trace(final activitydiagram.Trace t) {
		return new monolithicactivitydiagram.revisitor.operations.impl.TraceOperationImpl(t, this);
	}
}
