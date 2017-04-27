package activitydiagram.revisitor;

public interface ActivitydiagramRevisitor<Activitydiagram__ActionT extends Activitydiagram__ExecutableNodeT,Activitydiagram__ActivityT extends Activitydiagram__NamedElementT,Activitydiagram__ActivityEdgeT extends Activitydiagram__NamedElementT,Activitydiagram__ActivityFinalNodeT extends Activitydiagram__FinalNodeT,Activitydiagram__ActivityNodeT extends Activitydiagram__NamedElementT,Activitydiagram__BooleanBinaryExpressionT extends Activitydiagram__BooleanExpressionT,Activitydiagram__BooleanExpressionT extends Activitydiagram__ExpressionT,Activitydiagram__BooleanUnaryExpressionT extends Activitydiagram__BooleanExpressionT,Activitydiagram__BooleanValueT extends Activitydiagram__ValueT,Activitydiagram__BooleanVariableT extends Activitydiagram__VariableT,Activitydiagram__ControlFlowT extends Activitydiagram__ActivityEdgeT,Activitydiagram__ControlNodeT extends Activitydiagram__ActivityNodeT,Activitydiagram__ControlTokenT extends Activitydiagram__TokenT,Activitydiagram__DecisionNodeT extends Activitydiagram__ControlNodeT,Activitydiagram__ExecutableNodeT extends Activitydiagram__ActivityNodeT,Activitydiagram__ExpressionT,Activitydiagram__FinalNodeT extends Activitydiagram__ControlNodeT,Activitydiagram__ForkNodeT extends Activitydiagram__ControlNodeT,Activitydiagram__ForkedTokenT extends Activitydiagram__TokenT,Activitydiagram__InitialNodeT extends Activitydiagram__ControlNodeT,Activitydiagram__InputT,Activitydiagram__InputValueT,Activitydiagram__IntegerCalculationExpressionT extends Activitydiagram__IntegerExpressionT,Activitydiagram__IntegerComparisonExpressionT extends Activitydiagram__IntegerExpressionT,Activitydiagram__IntegerExpressionT extends Activitydiagram__ExpressionT,Activitydiagram__IntegerValueT extends Activitydiagram__ValueT,Activitydiagram__IntegerVariableT extends Activitydiagram__VariableT,Activitydiagram__JoinNodeT extends Activitydiagram__ControlNodeT,Activitydiagram__MergeNodeT extends Activitydiagram__ControlNodeT,Activitydiagram__NamedElementT,Activitydiagram__OfferT,Activitydiagram__OpaqueActionT extends Activitydiagram__ActionT,Activitydiagram__TokenT,Activitydiagram__TraceT,Activitydiagram__ValueT,Activitydiagram__VariableT>
	
	 {
Activitydiagram__ActivityT activity(final activitydiagram.Activity activity);
Activitydiagram__NamedElementT namedElement_activity(final activitydiagram.Activity activity);

Activitydiagram__ActivityFinalNodeT activityFinalNode(final activitydiagram.ActivityFinalNode activityFinalNode);
Activitydiagram__FinalNodeT finalNode_activityFinalNode(final activitydiagram.ActivityFinalNode activityFinalNode);
Activitydiagram__ControlNodeT controlNode_activityFinalNode(final activitydiagram.ActivityFinalNode activityFinalNode);
Activitydiagram__ActivityNodeT activityNode_activityFinalNode(final activitydiagram.ActivityFinalNode activityFinalNode);
Activitydiagram__NamedElementT namedElement_activityFinalNode(final activitydiagram.ActivityFinalNode activityFinalNode);

Activitydiagram__BooleanBinaryExpressionT booleanBinaryExpression(final activitydiagram.BooleanBinaryExpression booleanBinaryExpression);
Activitydiagram__ExpressionT expression_booleanBinaryExpression(final activitydiagram.BooleanBinaryExpression booleanBinaryExpression);
Activitydiagram__BooleanExpressionT booleanExpression_booleanBinaryExpression(final activitydiagram.BooleanBinaryExpression booleanBinaryExpression);

Activitydiagram__BooleanUnaryExpressionT booleanUnaryExpression(final activitydiagram.BooleanUnaryExpression booleanUnaryExpression);
Activitydiagram__ExpressionT expression_booleanUnaryExpression(final activitydiagram.BooleanUnaryExpression booleanUnaryExpression);
Activitydiagram__BooleanExpressionT booleanExpression_booleanUnaryExpression(final activitydiagram.BooleanUnaryExpression booleanUnaryExpression);

Activitydiagram__BooleanValueT booleanValue(final activitydiagram.BooleanValue booleanValue);
Activitydiagram__ValueT value_booleanValue(final activitydiagram.BooleanValue booleanValue);

Activitydiagram__BooleanVariableT booleanVariable(final activitydiagram.BooleanVariable booleanVariable);
Activitydiagram__VariableT variable_booleanVariable(final activitydiagram.BooleanVariable booleanVariable);

Activitydiagram__ControlFlowT controlFlow(final activitydiagram.ControlFlow controlFlow);
Activitydiagram__ActivityEdgeT activityEdge_controlFlow(final activitydiagram.ControlFlow controlFlow);
Activitydiagram__NamedElementT namedElement_controlFlow(final activitydiagram.ControlFlow controlFlow);

Activitydiagram__ControlTokenT controlToken(final activitydiagram.ControlToken controlToken);
Activitydiagram__TokenT token_controlToken(final activitydiagram.ControlToken controlToken);

Activitydiagram__DecisionNodeT decisionNode(final activitydiagram.DecisionNode decisionNode);
Activitydiagram__ActivityNodeT activityNode_decisionNode(final activitydiagram.DecisionNode decisionNode);
Activitydiagram__NamedElementT namedElement_decisionNode(final activitydiagram.DecisionNode decisionNode);
Activitydiagram__ControlNodeT controlNode_decisionNode(final activitydiagram.DecisionNode decisionNode);

Activitydiagram__ForkNodeT forkNode(final activitydiagram.ForkNode forkNode);
Activitydiagram__ActivityNodeT activityNode_forkNode(final activitydiagram.ForkNode forkNode);
Activitydiagram__NamedElementT namedElement_forkNode(final activitydiagram.ForkNode forkNode);
Activitydiagram__ControlNodeT controlNode_forkNode(final activitydiagram.ForkNode forkNode);

Activitydiagram__ForkedTokenT forkedToken(final activitydiagram.ForkedToken forkedToken);
Activitydiagram__TokenT token_forkedToken(final activitydiagram.ForkedToken forkedToken);

Activitydiagram__InitialNodeT initialNode(final activitydiagram.InitialNode initialNode);
Activitydiagram__ActivityNodeT activityNode_initialNode(final activitydiagram.InitialNode initialNode);
Activitydiagram__NamedElementT namedElement_initialNode(final activitydiagram.InitialNode initialNode);
Activitydiagram__ControlNodeT controlNode_initialNode(final activitydiagram.InitialNode initialNode);

Activitydiagram__InputT input(final activitydiagram.Input input);

Activitydiagram__InputValueT inputValue(final activitydiagram.InputValue inputValue);

Activitydiagram__IntegerCalculationExpressionT integerCalculationExpression(final activitydiagram.IntegerCalculationExpression integerCalculationExpression);
Activitydiagram__ExpressionT expression_integerCalculationExpression(final activitydiagram.IntegerCalculationExpression integerCalculationExpression);
Activitydiagram__IntegerExpressionT integerExpression_integerCalculationExpression(final activitydiagram.IntegerCalculationExpression integerCalculationExpression);

Activitydiagram__IntegerComparisonExpressionT integerComparisonExpression(final activitydiagram.IntegerComparisonExpression integerComparisonExpression);
Activitydiagram__ExpressionT expression_integerComparisonExpression(final activitydiagram.IntegerComparisonExpression integerComparisonExpression);
Activitydiagram__IntegerExpressionT integerExpression_integerComparisonExpression(final activitydiagram.IntegerComparisonExpression integerComparisonExpression);

Activitydiagram__IntegerValueT integerValue(final activitydiagram.IntegerValue integerValue);
Activitydiagram__ValueT value_integerValue(final activitydiagram.IntegerValue integerValue);

Activitydiagram__IntegerVariableT integerVariable(final activitydiagram.IntegerVariable integerVariable);
Activitydiagram__VariableT variable_integerVariable(final activitydiagram.IntegerVariable integerVariable);

Activitydiagram__JoinNodeT joinNode(final activitydiagram.JoinNode joinNode);
Activitydiagram__ActivityNodeT activityNode_joinNode(final activitydiagram.JoinNode joinNode);
Activitydiagram__NamedElementT namedElement_joinNode(final activitydiagram.JoinNode joinNode);
Activitydiagram__ControlNodeT controlNode_joinNode(final activitydiagram.JoinNode joinNode);

Activitydiagram__MergeNodeT mergeNode(final activitydiagram.MergeNode mergeNode);
Activitydiagram__ActivityNodeT activityNode_mergeNode(final activitydiagram.MergeNode mergeNode);
Activitydiagram__NamedElementT namedElement_mergeNode(final activitydiagram.MergeNode mergeNode);
Activitydiagram__ControlNodeT controlNode_mergeNode(final activitydiagram.MergeNode mergeNode);

Activitydiagram__OfferT offer(final activitydiagram.Offer offer);

Activitydiagram__OpaqueActionT opaqueAction(final activitydiagram.OpaqueAction opaqueAction);
Activitydiagram__ExecutableNodeT executableNode_opaqueAction(final activitydiagram.OpaqueAction opaqueAction);
Activitydiagram__ActionT action_opaqueAction(final activitydiagram.OpaqueAction opaqueAction);
Activitydiagram__ActivityNodeT activityNode_opaqueAction(final activitydiagram.OpaqueAction opaqueAction);
Activitydiagram__NamedElementT namedElement_opaqueAction(final activitydiagram.OpaqueAction opaqueAction);

Activitydiagram__TraceT trace(final activitydiagram.Trace trace);

	
	default Activitydiagram__VariableT $(final activitydiagram.Variable self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.BOOLEAN_VARIABLE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return booleanVariable((activitydiagram.BooleanVariable) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return integerVariable((activitydiagram.IntegerVariable) self);
		return null;
	}
	default Activitydiagram__ActivityFinalNodeT $(final activitydiagram.ActivityFinalNode self) {
		return activityFinalNode(self);
	}
	default Activitydiagram__TraceT $(final activitydiagram.Trace self) {
		return trace(self);
	}
	default Activitydiagram__BooleanUnaryExpressionT $(final activitydiagram.BooleanUnaryExpression self) {
		return booleanUnaryExpression(self);
	}
	default Activitydiagram__ActivityT $(final activitydiagram.Activity self) {
		return activity(self);
	}
	default Activitydiagram__ControlTokenT $(final activitydiagram.ControlToken self) {
		return controlToken(self);
	}
	default Activitydiagram__ValueT $(final activitydiagram.Value self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INTEGER_VALUE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return integerValue((activitydiagram.IntegerValue) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.BOOLEAN_VALUE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return booleanValue((activitydiagram.BooleanValue) self);
		return null;
	}
	default Activitydiagram__ActivityNodeT $(final activitydiagram.ActivityNode self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.ACTIVITY_FINAL_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.JOIN_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return joinNode((activitydiagram.JoinNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return opaqueAction((activitydiagram.OpaqueAction) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.FORK_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return forkNode((activitydiagram.ForkNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.MERGE_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return mergeNode((activitydiagram.MergeNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INITIAL_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return initialNode((activitydiagram.InitialNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.DECISION_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return decisionNode((activitydiagram.DecisionNode) self);
		return null;
	}
	default Activitydiagram__ControlFlowT $(final activitydiagram.ControlFlow self) {
		return controlFlow(self);
	}
	default Activitydiagram__IntegerExpressionT $(final activitydiagram.IntegerExpression self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return integerComparisonExpression((activitydiagram.IntegerComparisonExpression) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INTEGER_CALCULATION_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return integerCalculationExpression((activitydiagram.IntegerCalculationExpression) self);
		return null;
	}
	default Activitydiagram__JoinNodeT $(final activitydiagram.JoinNode self) {
		return joinNode(self);
	}
	default Activitydiagram__ActionT $(final activitydiagram.Action self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return opaqueAction((activitydiagram.OpaqueAction) self);
		return null;
	}
	default Activitydiagram__InputValueT $(final activitydiagram.InputValue self) {
		return inputValue(self);
	}
	default Activitydiagram__ExpressionT $(final activitydiagram.Expression self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return booleanUnaryExpression((activitydiagram.BooleanUnaryExpression) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return integerComparisonExpression((activitydiagram.IntegerComparisonExpression) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INTEGER_CALCULATION_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return integerCalculationExpression((activitydiagram.IntegerCalculationExpression) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return booleanBinaryExpression((activitydiagram.BooleanBinaryExpression) self);
		return null;
	}
	default Activitydiagram__IntegerComparisonExpressionT $(final activitydiagram.IntegerComparisonExpression self) {
		return integerComparisonExpression(self);
	}
	default Activitydiagram__NamedElementT $(final activitydiagram.NamedElement self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.ACTIVITY_FINAL_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.ACTIVITY && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return activity((activitydiagram.Activity) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.CONTROL_FLOW && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return controlFlow((activitydiagram.ControlFlow) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.JOIN_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return joinNode((activitydiagram.JoinNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return opaqueAction((activitydiagram.OpaqueAction) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.FORK_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return forkNode((activitydiagram.ForkNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.MERGE_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return mergeNode((activitydiagram.MergeNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INITIAL_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return initialNode((activitydiagram.InitialNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.DECISION_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return decisionNode((activitydiagram.DecisionNode) self);
		return null;
	}
	default Activitydiagram__ActivityEdgeT $(final activitydiagram.ActivityEdge self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.CONTROL_FLOW && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return controlFlow((activitydiagram.ControlFlow) self);
		return null;
	}
	default Activitydiagram__OpaqueActionT $(final activitydiagram.OpaqueAction self) {
		return opaqueAction(self);
	}
	default Activitydiagram__ForkedTokenT $(final activitydiagram.ForkedToken self) {
		return forkedToken(self);
	}
	default Activitydiagram__ExecutableNodeT $(final activitydiagram.ExecutableNode self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return opaqueAction((activitydiagram.OpaqueAction) self);
		return null;
	}
	default Activitydiagram__ForkNodeT $(final activitydiagram.ForkNode self) {
		return forkNode(self);
	}
	default Activitydiagram__MergeNodeT $(final activitydiagram.MergeNode self) {
		return mergeNode(self);
	}
	default Activitydiagram__IntegerValueT $(final activitydiagram.IntegerValue self) {
		return integerValue(self);
	}
	default Activitydiagram__TokenT $(final activitydiagram.Token self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.CONTROL_TOKEN && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return controlToken((activitydiagram.ControlToken) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.FORKED_TOKEN && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return forkedToken((activitydiagram.ForkedToken) self);
		return null;
	}
	default Activitydiagram__BooleanValueT $(final activitydiagram.BooleanValue self) {
		return booleanValue(self);
	}
	default Activitydiagram__FinalNodeT $(final activitydiagram.FinalNode self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.ACTIVITY_FINAL_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		return null;
	}
	default Activitydiagram__ControlNodeT $(final activitydiagram.ControlNode self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.ACTIVITY_FINAL_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.JOIN_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return joinNode((activitydiagram.JoinNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.FORK_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return forkNode((activitydiagram.ForkNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.MERGE_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return mergeNode((activitydiagram.MergeNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INITIAL_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return initialNode((activitydiagram.InitialNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.DECISION_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return decisionNode((activitydiagram.DecisionNode) self);
		return null;
	}
	default Activitydiagram__InitialNodeT $(final activitydiagram.InitialNode self) {
		return initialNode(self);
	}
	default Activitydiagram__BooleanVariableT $(final activitydiagram.BooleanVariable self) {
		return booleanVariable(self);
	}
	default Activitydiagram__OfferT $(final activitydiagram.Offer self) {
		return offer(self);
	}
	default Activitydiagram__DecisionNodeT $(final activitydiagram.DecisionNode self) {
		return decisionNode(self);
	}
	default Activitydiagram__IntegerVariableT $(final activitydiagram.IntegerVariable self) {
		return integerVariable(self);
	}
	default Activitydiagram__BooleanExpressionT $(final activitydiagram.BooleanExpression self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return booleanUnaryExpression((activitydiagram.BooleanUnaryExpression) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return booleanBinaryExpression((activitydiagram.BooleanBinaryExpression) self);
		return null;
	}
	default Activitydiagram__IntegerCalculationExpressionT $(final activitydiagram.IntegerCalculationExpression self) {
		return integerCalculationExpression(self);
	}
	default Activitydiagram__InputT $(final activitydiagram.Input self) {
		return input(self);
	}
	default Activitydiagram__BooleanBinaryExpressionT $(final activitydiagram.BooleanBinaryExpression self) {
		return booleanBinaryExpression(self);
	}
}
