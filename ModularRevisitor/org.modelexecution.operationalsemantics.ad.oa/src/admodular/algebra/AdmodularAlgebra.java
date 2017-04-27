package admodular.algebra;

public interface AdmodularAlgebra<Admodular__ActionT  extends Admodular__ExecutableNodeT ,Admodular__ActivityT  extends Admodular__NamedElementT ,Admodular__ActivityEdgeT  extends Admodular__NamedElementT ,Admodular__ActivityFinalNodeT  extends Admodular__FinalNodeT ,Admodular__ActivityNodeT  extends Admodular__NamedElementT ,Admodular__BooleanBinaryExpressionT  extends Admodular__BooleanExpressionT ,Admodular__BooleanExpressionT  extends Admodular__ExpressionT ,Admodular__BooleanUnaryExpressionT  extends Admodular__BooleanExpressionT ,Admodular__BooleanValueT  extends Admodular__ValueT ,Admodular__BooleanVariableT  extends Admodular__VariableT ,Admodular__ControlFlowT  extends Admodular__ActivityEdgeT ,Admodular__ControlNodeT  extends Admodular__ActivityNodeT ,Admodular__DecisionNodeT  extends Admodular__ControlNodeT ,Admodular__ExecutableNodeT  extends Admodular__ActivityNodeT ,Admodular__ExpressionT ,Admodular__FinalNodeT  extends Admodular__ControlNodeT ,Admodular__ForkNodeT  extends Admodular__ControlNodeT ,Admodular__InitialNodeT  extends Admodular__ControlNodeT ,Admodular__IntegerCalculationExpressionT  extends Admodular__IntegerExpressionT ,Admodular__IntegerComparisonExpressionT  extends Admodular__IntegerExpressionT ,Admodular__IntegerExpressionT  extends Admodular__ExpressionT ,Admodular__IntegerValueT  extends Admodular__ValueT ,Admodular__IntegerVariableT  extends Admodular__VariableT ,Admodular__JoinNodeT  extends Admodular__ControlNodeT ,Admodular__MergeNodeT  extends Admodular__ControlNodeT ,Admodular__NamedElementT ,Admodular__OpaqueActionT  extends Admodular__ActionT ,Admodular__ValueT ,Admodular__VariableT >
	 {
	Admodular__ActivityT  activity(final admodular.Activity activity);
	Admodular__NamedElementT  namedElement_activity(final admodular.Activity activity);
	
	Admodular__ActivityFinalNodeT  activityFinalNode(final admodular.ActivityFinalNode activityFinalNode);
	Admodular__NamedElementT  namedElement_activityFinalNode(final admodular.ActivityFinalNode activityFinalNode);
	Admodular__FinalNodeT  finalNode_activityFinalNode(final admodular.ActivityFinalNode activityFinalNode);
	Admodular__ControlNodeT  controlNode_activityFinalNode(final admodular.ActivityFinalNode activityFinalNode);
	Admodular__ActivityNodeT  activityNode_activityFinalNode(final admodular.ActivityFinalNode activityFinalNode);
	
	Admodular__BooleanBinaryExpressionT  booleanBinaryExpression(final admodular.BooleanBinaryExpression booleanBinaryExpression);
	Admodular__BooleanExpressionT  booleanExpression_booleanBinaryExpression(final admodular.BooleanBinaryExpression booleanBinaryExpression);
	Admodular__ExpressionT  expression_booleanBinaryExpression(final admodular.BooleanBinaryExpression booleanBinaryExpression);
	
	Admodular__BooleanUnaryExpressionT  booleanUnaryExpression(final admodular.BooleanUnaryExpression booleanUnaryExpression);
	Admodular__BooleanExpressionT  booleanExpression_booleanUnaryExpression(final admodular.BooleanUnaryExpression booleanUnaryExpression);
	Admodular__ExpressionT  expression_booleanUnaryExpression(final admodular.BooleanUnaryExpression booleanUnaryExpression);
	
	Admodular__BooleanValueT  booleanValue(final admodular.BooleanValue booleanValue);
	Admodular__ValueT  value_booleanValue(final admodular.BooleanValue booleanValue);
	
	Admodular__BooleanVariableT  booleanVariable(final admodular.BooleanVariable booleanVariable);
	Admodular__VariableT  variable_booleanVariable(final admodular.BooleanVariable booleanVariable);
	
	Admodular__ControlFlowT  controlFlow(final admodular.ControlFlow controlFlow);
	Admodular__NamedElementT  namedElement_controlFlow(final admodular.ControlFlow controlFlow);
	Admodular__ActivityEdgeT  activityEdge_controlFlow(final admodular.ControlFlow controlFlow);
	
	Admodular__DecisionNodeT  decisionNode(final admodular.DecisionNode decisionNode);
	Admodular__NamedElementT  namedElement_decisionNode(final admodular.DecisionNode decisionNode);
	Admodular__ActivityNodeT  activityNode_decisionNode(final admodular.DecisionNode decisionNode);
	Admodular__ControlNodeT  controlNode_decisionNode(final admodular.DecisionNode decisionNode);
	
	Admodular__ForkNodeT  forkNode(final admodular.ForkNode forkNode);
	Admodular__NamedElementT  namedElement_forkNode(final admodular.ForkNode forkNode);
	Admodular__ActivityNodeT  activityNode_forkNode(final admodular.ForkNode forkNode);
	Admodular__ControlNodeT  controlNode_forkNode(final admodular.ForkNode forkNode);
	
	Admodular__InitialNodeT  initialNode(final admodular.InitialNode initialNode);
	Admodular__NamedElementT  namedElement_initialNode(final admodular.InitialNode initialNode);
	Admodular__ActivityNodeT  activityNode_initialNode(final admodular.InitialNode initialNode);
	Admodular__ControlNodeT  controlNode_initialNode(final admodular.InitialNode initialNode);
	
	Admodular__IntegerCalculationExpressionT  integerCalculationExpression(final admodular.IntegerCalculationExpression integerCalculationExpression);
	Admodular__IntegerExpressionT  integerExpression_integerCalculationExpression(final admodular.IntegerCalculationExpression integerCalculationExpression);
	Admodular__ExpressionT  expression_integerCalculationExpression(final admodular.IntegerCalculationExpression integerCalculationExpression);
	
	Admodular__IntegerComparisonExpressionT  integerComparisonExpression(final admodular.IntegerComparisonExpression integerComparisonExpression);
	Admodular__IntegerExpressionT  integerExpression_integerComparisonExpression(final admodular.IntegerComparisonExpression integerComparisonExpression);
	Admodular__ExpressionT  expression_integerComparisonExpression(final admodular.IntegerComparisonExpression integerComparisonExpression);
	
	Admodular__IntegerValueT  integerValue(final admodular.IntegerValue integerValue);
	Admodular__ValueT  value_integerValue(final admodular.IntegerValue integerValue);
	
	Admodular__IntegerVariableT  integerVariable(final admodular.IntegerVariable integerVariable);
	Admodular__VariableT  variable_integerVariable(final admodular.IntegerVariable integerVariable);
	
	Admodular__JoinNodeT  joinNode(final admodular.JoinNode joinNode);
	Admodular__NamedElementT  namedElement_joinNode(final admodular.JoinNode joinNode);
	Admodular__ActivityNodeT  activityNode_joinNode(final admodular.JoinNode joinNode);
	Admodular__ControlNodeT  controlNode_joinNode(final admodular.JoinNode joinNode);
	
	Admodular__MergeNodeT  mergeNode(final admodular.MergeNode mergeNode);
	Admodular__NamedElementT  namedElement_mergeNode(final admodular.MergeNode mergeNode);
	Admodular__ActivityNodeT  activityNode_mergeNode(final admodular.MergeNode mergeNode);
	Admodular__ControlNodeT  controlNode_mergeNode(final admodular.MergeNode mergeNode);
	
	Admodular__OpaqueActionT  opaqueAction(final admodular.OpaqueAction opaqueAction);
	Admodular__ActionT  action_opaqueAction(final admodular.OpaqueAction opaqueAction);
	Admodular__ExecutableNodeT  executableNode_opaqueAction(final admodular.OpaqueAction opaqueAction);
	Admodular__NamedElementT  namedElement_opaqueAction(final admodular.OpaqueAction opaqueAction);
	Admodular__ActivityNodeT  activityNode_opaqueAction(final admodular.OpaqueAction opaqueAction);
	
	
	default Admodular__ActionT  $(final admodular.Action self) {
		if(self instanceof admodular.OpaqueAction) return opaqueAction((admodular.OpaqueAction) self);
		return null;
	}
	default Admodular__BooleanVariableT  $(final admodular.BooleanVariable self) {
		return booleanVariable(self);
	}
	default Admodular__BooleanValueT  $(final admodular.BooleanValue self) {
		return booleanValue(self);
	}
	default Admodular__OpaqueActionT  $(final admodular.OpaqueAction self) {
		return opaqueAction(self);
	}
	default Admodular__IntegerVariableT  $(final admodular.IntegerVariable self) {
		return integerVariable(self);
	}
	default Admodular__JoinNodeT  $(final admodular.JoinNode self) {
		return joinNode(self);
	}
	default Admodular__ForkNodeT  $(final admodular.ForkNode self) {
		return forkNode(self);
	}
	default Admodular__IntegerExpressionT  $(final admodular.IntegerExpression self) {
		if(self instanceof admodular.IntegerCalculationExpression) return integerCalculationExpression((admodular.IntegerCalculationExpression) self);
		if(self instanceof admodular.IntegerComparisonExpression) return integerComparisonExpression((admodular.IntegerComparisonExpression) self);
		return null;
	}
	default Admodular__ActivityNodeT  $(final admodular.ActivityNode self) {
		if(self instanceof admodular.OpaqueAction) return opaqueAction((admodular.OpaqueAction) self);
		if(self instanceof admodular.JoinNode) return joinNode((admodular.JoinNode) self);
		if(self instanceof admodular.ForkNode) return forkNode((admodular.ForkNode) self);
		if(self instanceof admodular.DecisionNode) return decisionNode((admodular.DecisionNode) self);
		if(self instanceof admodular.InitialNode) return initialNode((admodular.InitialNode) self);
		if(self instanceof admodular.ActivityFinalNode) return activityFinalNode((admodular.ActivityFinalNode) self);
		if(self instanceof admodular.MergeNode) return mergeNode((admodular.MergeNode) self);
		return null;
	}
	default Admodular__BooleanUnaryExpressionT  $(final admodular.BooleanUnaryExpression self) {
		return booleanUnaryExpression(self);
	}
	default Admodular__DecisionNodeT  $(final admodular.DecisionNode self) {
		return decisionNode(self);
	}
	default Admodular__IntegerCalculationExpressionT  $(final admodular.IntegerCalculationExpression self) {
		return integerCalculationExpression(self);
	}
	default Admodular__ExecutableNodeT  $(final admodular.ExecutableNode self) {
		if(self instanceof admodular.OpaqueAction) return opaqueAction((admodular.OpaqueAction) self);
		return null;
	}
	default Admodular__ControlFlowT  $(final admodular.ControlFlow self) {
		return controlFlow(self);
	}
	default Admodular__InitialNodeT  $(final admodular.InitialNode self) {
		return initialNode(self);
	}
	default Admodular__IntegerValueT  $(final admodular.IntegerValue self) {
		return integerValue(self);
	}
	default Admodular__ActivityFinalNodeT  $(final admodular.ActivityFinalNode self) {
		return activityFinalNode(self);
	}
	default Admodular__VariableT  $(final admodular.Variable self) {
		if(self instanceof admodular.BooleanVariable) return booleanVariable((admodular.BooleanVariable) self);
		if(self instanceof admodular.IntegerVariable) return integerVariable((admodular.IntegerVariable) self);
		return null;
	}
	default Admodular__IntegerComparisonExpressionT  $(final admodular.IntegerComparisonExpression self) {
		return integerComparisonExpression(self);
	}
	default Admodular__BooleanExpressionT  $(final admodular.BooleanExpression self) {
		if(self instanceof admodular.BooleanUnaryExpression) return booleanUnaryExpression((admodular.BooleanUnaryExpression) self);
		if(self instanceof admodular.BooleanBinaryExpression) return booleanBinaryExpression((admodular.BooleanBinaryExpression) self);
		return null;
	}
	default Admodular__FinalNodeT  $(final admodular.FinalNode self) {
		if(self instanceof admodular.ActivityFinalNode) return activityFinalNode((admodular.ActivityFinalNode) self);
		return null;
	}
	default Admodular__ControlNodeT  $(final admodular.ControlNode self) {
		if(self instanceof admodular.JoinNode) return joinNode((admodular.JoinNode) self);
		if(self instanceof admodular.ForkNode) return forkNode((admodular.ForkNode) self);
		if(self instanceof admodular.DecisionNode) return decisionNode((admodular.DecisionNode) self);
		if(self instanceof admodular.InitialNode) return initialNode((admodular.InitialNode) self);
		if(self instanceof admodular.ActivityFinalNode) return activityFinalNode((admodular.ActivityFinalNode) self);
		if(self instanceof admodular.MergeNode) return mergeNode((admodular.MergeNode) self);
		return null;
	}
	default Admodular__BooleanBinaryExpressionT  $(final admodular.BooleanBinaryExpression self) {
		return booleanBinaryExpression(self);
	}
	default Admodular__ActivityT  $(final admodular.Activity self) {
		return activity(self);
	}
	default Admodular__ActivityEdgeT  $(final admodular.ActivityEdge self) {
		if(self instanceof admodular.ControlFlow) return controlFlow((admodular.ControlFlow) self);
		return null;
	}
	default Admodular__ExpressionT  $(final admodular.Expression self) {
		if(self instanceof admodular.BooleanUnaryExpression) return booleanUnaryExpression((admodular.BooleanUnaryExpression) self);
		if(self instanceof admodular.IntegerCalculationExpression) return integerCalculationExpression((admodular.IntegerCalculationExpression) self);
		if(self instanceof admodular.IntegerComparisonExpression) return integerComparisonExpression((admodular.IntegerComparisonExpression) self);
		if(self instanceof admodular.BooleanBinaryExpression) return booleanBinaryExpression((admodular.BooleanBinaryExpression) self);
		return null;
	}
	default Admodular__NamedElementT  $(final admodular.NamedElement self) {
		if(self instanceof admodular.OpaqueAction) return opaqueAction((admodular.OpaqueAction) self);
		if(self instanceof admodular.JoinNode) return joinNode((admodular.JoinNode) self);
		if(self instanceof admodular.ForkNode) return forkNode((admodular.ForkNode) self);
		if(self instanceof admodular.DecisionNode) return decisionNode((admodular.DecisionNode) self);
		if(self instanceof admodular.InitialNode) return initialNode((admodular.InitialNode) self);
		if(self instanceof admodular.ActivityFinalNode) return activityFinalNode((admodular.ActivityFinalNode) self);
		if(self instanceof admodular.MergeNode) return mergeNode((admodular.MergeNode) self);
		if(self instanceof admodular.ControlFlow) return controlFlow((admodular.ControlFlow) self);
		if(self instanceof admodular.Activity) return activity((admodular.Activity) self);
		return null;
	}
	default Admodular__ValueT  $(final admodular.Value self) {
		if(self instanceof admodular.BooleanValue) return booleanValue((admodular.BooleanValue) self);
		if(self instanceof admodular.IntegerValue) return integerValue((admodular.IntegerValue) self);
		return null;
	}
	default Admodular__MergeNodeT  $(final admodular.MergeNode self) {
		return mergeNode(self);
	}
	
}
