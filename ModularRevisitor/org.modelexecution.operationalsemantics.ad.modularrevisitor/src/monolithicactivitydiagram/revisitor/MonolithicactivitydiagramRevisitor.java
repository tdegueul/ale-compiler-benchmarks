package monolithicactivitydiagram.revisitor;

public interface MonolithicactivitydiagramRevisitor<Activitydiagram__ActionT extends Activitydiagram__ExecutableNodeT,Adruntime__Action_AspectT,Activitydiagram__ActivityT extends Activitydiagram__NamedElementT,Activitydiagram__ActivityEdgeT extends Activitydiagram__NamedElementT,Adruntime__ActivityEdge_AspectT extends Activitydiagram__ActivityEdgeT,Activitydiagram__ActivityFinalNodeT extends Activitydiagram__FinalNodeT,Adruntime__ActivityFinalNode_AspectT,Activitydiagram__ActivityNodeT extends Activitydiagram__NamedElementT,Adruntime__ActivityNode_AspectT extends Activitydiagram__ActivityNodeT,Adruntime__Activity_AspectT extends Activitydiagram__ActivityT,Activitydiagram__BooleanBinaryExpressionT extends Activitydiagram__BooleanExpressionT,Adruntime__BooleanBinaryExpression_AspectT,Activitydiagram__BooleanExpressionT extends Activitydiagram__ExpressionT,Adruntime__BooleanExpression_AspectT extends Activitydiagram__BooleanExpressionT,Activitydiagram__BooleanUnaryExpressionT extends Activitydiagram__BooleanExpressionT,Adruntime__BooleanUnaryExpression_AspectT,Activitydiagram__BooleanValueT extends Activitydiagram__ValueT,Activitydiagram__BooleanVariableT extends Activitydiagram__VariableT,Adruntime__BooleanVariable_AspectT,Activitydiagram__ControlFlowT extends Activitydiagram__ActivityEdgeT,Adruntime__ControlFlow_AspectT,Activitydiagram__ControlNodeT extends Activitydiagram__ActivityNodeT,Adruntime__ControlNode_AspectT,Adruntime__ControlTokenT extends Adruntime__TokenT,Activitydiagram__DecisionNodeT extends Activitydiagram__ControlNodeT,Adruntime__DecisionNode_AspectT,Activitydiagram__ExecutableNodeT extends Activitydiagram__ActivityNodeT,Adruntime__ExecutableNode_AspectT,Activitydiagram__ExpressionT,Activitydiagram__FinalNodeT extends Activitydiagram__ControlNodeT,Adruntime__FinalNode_AspectT,Activitydiagram__ForkNodeT extends Activitydiagram__ControlNodeT,Adruntime__ForkNode_AspectT,Adruntime__ForkedTokenT extends Adruntime__TokenT,Activitydiagram__InitialNodeT extends Activitydiagram__ControlNodeT,Adruntime__InitialNode_AspectT,Adruntime__InputT,Adruntime__InputValueT,Activitydiagram__IntegerCalculationExpressionT extends Activitydiagram__IntegerExpressionT,Adruntime__IntegerCalculationExpression_AspectT,Activitydiagram__IntegerComparisonExpressionT extends Activitydiagram__IntegerExpressionT,Adruntime__IntegerComparisonExpression_AspectT,Activitydiagram__IntegerExpressionT extends Activitydiagram__ExpressionT,Adruntime__IntegerExpression_AspectT extends Activitydiagram__IntegerExpressionT,Activitydiagram__IntegerValueT extends Activitydiagram__ValueT,Activitydiagram__IntegerVariableT extends Activitydiagram__VariableT,Adruntime__IntegerVariable_AspectT,Activitydiagram__JoinNodeT extends Activitydiagram__ControlNodeT,Adruntime__JoinNode_AspectT,Activitydiagram__MergeNodeT extends Activitydiagram__ControlNodeT,Adruntime__MergeNode_AspectT,Activitydiagram__NamedElementT,Adruntime__OfferT,Activitydiagram__OpaqueActionT extends Activitydiagram__ActionT,Adruntime__OpaqueAction_AspectT,Adruntime__TokenT,Adruntime__TraceT,Activitydiagram__ValueT,Activitydiagram__VariableT,Adruntime__Variable_AspectT extends Activitydiagram__VariableT>
	 extends activitydiagram.revisitor.ActivitydiagramRevisitor<Activitydiagram__ActionT, Activitydiagram__ActivityT, Activitydiagram__ActivityEdgeT, Activitydiagram__ActivityFinalNodeT, Activitydiagram__ActivityNodeT, Activitydiagram__BooleanBinaryExpressionT, Activitydiagram__BooleanExpressionT, Activitydiagram__BooleanUnaryExpressionT, Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT, Activitydiagram__ControlFlowT, Activitydiagram__ControlNodeT, Activitydiagram__DecisionNodeT, Activitydiagram__ExecutableNodeT, Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT, Activitydiagram__ForkNodeT, Activitydiagram__InitialNodeT, Activitydiagram__IntegerCalculationExpressionT, Activitydiagram__IntegerComparisonExpressionT, Activitydiagram__IntegerExpressionT, Activitydiagram__IntegerValueT, Activitydiagram__IntegerVariableT, Activitydiagram__JoinNodeT, Activitydiagram__MergeNodeT, Activitydiagram__NamedElementT, Activitydiagram__OpaqueActionT, Activitydiagram__ValueT, Activitydiagram__VariableT>, adruntime.revisitor.AdruntimeRevisitor<Activitydiagram__ActionT, Adruntime__Action_AspectT, Activitydiagram__ActivityT, Activitydiagram__ActivityEdgeT, Adruntime__ActivityEdge_AspectT, Activitydiagram__ActivityFinalNodeT, Adruntime__ActivityFinalNode_AspectT, Activitydiagram__ActivityNodeT, Adruntime__ActivityNode_AspectT, Adruntime__Activity_AspectT, Activitydiagram__BooleanBinaryExpressionT, Adruntime__BooleanBinaryExpression_AspectT, Activitydiagram__BooleanExpressionT, Adruntime__BooleanExpression_AspectT, Activitydiagram__BooleanUnaryExpressionT, Adruntime__BooleanUnaryExpression_AspectT, Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT, Adruntime__BooleanVariable_AspectT, Activitydiagram__ControlFlowT, Adruntime__ControlFlow_AspectT, Activitydiagram__ControlNodeT, Adruntime__ControlNode_AspectT, Adruntime__ControlTokenT, Activitydiagram__DecisionNodeT, Adruntime__DecisionNode_AspectT, Activitydiagram__ExecutableNodeT, Adruntime__ExecutableNode_AspectT, Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT, Adruntime__FinalNode_AspectT, Activitydiagram__ForkNodeT, Adruntime__ForkNode_AspectT, Adruntime__ForkedTokenT, Activitydiagram__InitialNodeT, Adruntime__InitialNode_AspectT, Adruntime__InputT, Adruntime__InputValueT, Activitydiagram__IntegerCalculationExpressionT, Adruntime__IntegerCalculationExpression_AspectT, Activitydiagram__IntegerComparisonExpressionT, Adruntime__IntegerComparisonExpression_AspectT, Activitydiagram__IntegerExpressionT, Adruntime__IntegerExpression_AspectT, Activitydiagram__IntegerValueT, Activitydiagram__IntegerVariableT, Adruntime__IntegerVariable_AspectT, Activitydiagram__JoinNodeT, Adruntime__JoinNode_AspectT, Activitydiagram__MergeNodeT, Adruntime__MergeNode_AspectT, Activitydiagram__NamedElementT, Adruntime__OfferT, Activitydiagram__OpaqueActionT, Adruntime__OpaqueAction_AspectT, Adruntime__TokenT, Adruntime__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT, Adruntime__Variable_AspectT>
	
	 {
	
	default Adruntime__Activity_AspectT $(final adruntime.Activity_Aspect self) {
		return activity_Aspect(self);
	}
	default Adruntime__IntegerComparisonExpression_AspectT $(final adruntime.IntegerComparisonExpression_Aspect self) {
		return integerComparisonExpression_Aspect(self);
	}
	default Activitydiagram__IntegerExpressionT $(final activitydiagram.IntegerExpression self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_COMPARISON_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return integerExpression_integerComparisonExpression_Aspect((adruntime.IntegerComparisonExpression_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_CALCULATION_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return integerExpression_integerCalculationExpression_Aspect((adruntime.IntegerCalculationExpression_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INTEGER_CALCULATION_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return integerCalculationExpression((activitydiagram.IntegerCalculationExpression) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return integerExpression_Aspect((adruntime.IntegerExpression_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return integerComparisonExpression((activitydiagram.IntegerComparisonExpression) self);
		return null;
	}
	default Activitydiagram__IntegerCalculationExpressionT $(final activitydiagram.IntegerCalculationExpression self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_CALCULATION_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return integerCalculationExpression_integerCalculationExpression_Aspect((adruntime.IntegerCalculationExpression_Aspect) self);
		return integerCalculationExpression(self);
	}
	default Activitydiagram__ForkNodeT $(final activitydiagram.ForkNode self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.FORK_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return forkNode_forkNode_Aspect((adruntime.ForkNode_Aspect) self);
		return forkNode(self);
	}
	default Adruntime__IntegerExpression_AspectT $(final adruntime.IntegerExpression_Aspect self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_COMPARISON_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return integerExpression_Aspect_integerComparisonExpression_Aspect((adruntime.IntegerComparisonExpression_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_CALCULATION_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return integerExpression_Aspect_integerCalculationExpression_Aspect((adruntime.IntegerCalculationExpression_Aspect) self);
		return integerExpression_Aspect(self);
	}
	default Adruntime__ControlTokenT $(final adruntime.ControlToken self) {
		return controlToken(self);
	}
	default Activitydiagram__ActionT $(final activitydiagram.Action self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return action_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return opaqueAction((activitydiagram.OpaqueAction) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return action_action_Aspect((adruntime.Action_Aspect) self);
		return null;
	}
	default Activitydiagram__ExpressionT $(final activitydiagram.Expression self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_COMPARISON_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return expression_integerComparisonExpression_Aspect((adruntime.IntegerComparisonExpression_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INTEGER_CALCULATION_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return integerCalculationExpression((activitydiagram.IntegerCalculationExpression) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return integerExpression_Aspect((adruntime.IntegerExpression_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return integerComparisonExpression((activitydiagram.IntegerComparisonExpression) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_CALCULATION_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return expression_integerCalculationExpression_Aspect((adruntime.IntegerCalculationExpression_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_BINARY_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return expression_booleanBinaryExpression_Aspect((adruntime.BooleanBinaryExpression_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return booleanExpression_Aspect((adruntime.BooleanExpression_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return booleanBinaryExpression((activitydiagram.BooleanBinaryExpression) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_UNARY_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return expression_booleanUnaryExpression_Aspect((adruntime.BooleanUnaryExpression_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return booleanUnaryExpression((activitydiagram.BooleanUnaryExpression) self);
		return null;
	}
	default Adruntime__ActivityFinalNode_AspectT $(final adruntime.ActivityFinalNode_Aspect self) {
		return activityFinalNode_Aspect(self);
	}
	default Adruntime__ControlNode_AspectT $(final adruntime.ControlNode_Aspect self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_Aspect_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.DECISION_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_Aspect_decisionNode_Aspect((adruntime.DecisionNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.FORK_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_Aspect_forkNode_Aspect((adruntime.ForkNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.JOIN_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_Aspect_joinNode_Aspect((adruntime.JoinNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.MERGE_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_Aspect_mergeNode_Aspect((adruntime.MergeNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.FINAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_Aspect_finalNode_Aspect((adruntime.FinalNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INITIAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_Aspect_initialNode_Aspect((adruntime.InitialNode_Aspect) self);
		return controlNode_Aspect(self);
	}
	default Activitydiagram__IntegerComparisonExpressionT $(final activitydiagram.IntegerComparisonExpression self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_COMPARISON_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return integerComparisonExpression_integerComparisonExpression_Aspect((adruntime.IntegerComparisonExpression_Aspect) self);
		return integerComparisonExpression(self);
	}
	default Activitydiagram__ExecutableNodeT $(final activitydiagram.ExecutableNode self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return executableNode_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return opaqueAction((activitydiagram.OpaqueAction) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return executableNode_action_Aspect((adruntime.Action_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.EXECUTABLE_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return executableNode_executableNode_Aspect((adruntime.ExecutableNode_Aspect) self);
		return null;
	}
	default Adruntime__ActivityNode_AspectT $(final adruntime.ActivityNode_Aspect self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_Aspect_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.DECISION_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_Aspect_decisionNode_Aspect((adruntime.DecisionNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.FORK_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_Aspect_forkNode_Aspect((adruntime.ForkNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.JOIN_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_Aspect_joinNode_Aspect((adruntime.JoinNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.MERGE_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_Aspect_mergeNode_Aspect((adruntime.MergeNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.FINAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_Aspect_finalNode_Aspect((adruntime.FinalNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_Aspect_controlNode_Aspect((adruntime.ControlNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_Aspect_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_Aspect_action_Aspect((adruntime.Action_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.EXECUTABLE_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_Aspect_executableNode_Aspect((adruntime.ExecutableNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INITIAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_Aspect_initialNode_Aspect((adruntime.InitialNode_Aspect) self);
		return activityNode_Aspect(self);
	}
	default Adruntime__ControlFlow_AspectT $(final adruntime.ControlFlow_Aspect self) {
		return controlFlow_Aspect(self);
	}
	default Adruntime__IntegerCalculationExpression_AspectT $(final adruntime.IntegerCalculationExpression_Aspect self) {
		return integerCalculationExpression_Aspect(self);
	}
	default Adruntime__IntegerVariable_AspectT $(final adruntime.IntegerVariable_Aspect self) {
		return integerVariable_Aspect(self);
	}
	default Activitydiagram__MergeNodeT $(final activitydiagram.MergeNode self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.MERGE_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return mergeNode_mergeNode_Aspect((adruntime.MergeNode_Aspect) self);
		return mergeNode(self);
	}
	default Activitydiagram__ControlNodeT $(final activitydiagram.ControlNode self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.FORK_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return forkNode((activitydiagram.ForkNode) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.DECISION_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_decisionNode_Aspect((adruntime.DecisionNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_controlNode_Aspect((adruntime.ControlNode_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.MERGE_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return mergeNode((activitydiagram.MergeNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.JOIN_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return joinNode((activitydiagram.JoinNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.DECISION_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return decisionNode((activitydiagram.DecisionNode) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.FORK_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_forkNode_Aspect((adruntime.ForkNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.JOIN_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_joinNode_Aspect((adruntime.JoinNode_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.ACTIVITY_FINAL_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.FINAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_finalNode_Aspect((adruntime.FinalNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.MERGE_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_mergeNode_Aspect((adruntime.MergeNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INITIAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlNode_initialNode_Aspect((adruntime.InitialNode_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INITIAL_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return initialNode((activitydiagram.InitialNode) self);
		return null;
	}
	default Activitydiagram__ActivityNodeT $(final activitydiagram.ActivityNode self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.FORK_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return forkNode((activitydiagram.ForkNode) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_controlNode_Aspect((adruntime.ControlNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_Aspect((adruntime.ActivityNode_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.MERGE_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return mergeNode((activitydiagram.MergeNode) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.DECISION_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_decisionNode_Aspect((adruntime.DecisionNode_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.JOIN_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return joinNode((activitydiagram.JoinNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.DECISION_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return decisionNode((activitydiagram.DecisionNode) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.FORK_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_forkNode_Aspect((adruntime.ForkNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.JOIN_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_joinNode_Aspect((adruntime.JoinNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return opaqueAction((activitydiagram.OpaqueAction) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.EXECUTABLE_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_executableNode_Aspect((adruntime.ExecutableNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.FINAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_finalNode_Aspect((adruntime.FinalNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_action_Aspect((adruntime.Action_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.MERGE_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_mergeNode_Aspect((adruntime.MergeNode_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.ACTIVITY_FINAL_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INITIAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_initialNode_Aspect((adruntime.InitialNode_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INITIAL_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return initialNode((activitydiagram.InitialNode) self);
		return null;
	}
	default Adruntime__DecisionNode_AspectT $(final adruntime.DecisionNode_Aspect self) {
		return decisionNode_Aspect(self);
	}
	default Activitydiagram__ValueT $(final activitydiagram.Value self) {
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.BOOLEAN_VALUE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return booleanValue((activitydiagram.BooleanValue) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INTEGER_VALUE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return integerValue((activitydiagram.IntegerValue) self);
		return null;
	}
	default Activitydiagram__OpaqueActionT $(final activitydiagram.OpaqueAction self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return opaqueAction_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		return opaqueAction(self);
	}
	default Activitydiagram__ActivityT $(final activitydiagram.Activity self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activity_Aspect((adruntime.Activity_Aspect) self);
		return activity(self);
	}
	default Activitydiagram__IntegerVariableT $(final activitydiagram.IntegerVariable self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_VARIABLE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return integerVariable_integerVariable_Aspect((adruntime.IntegerVariable_Aspect) self);
		return integerVariable(self);
	}
	default Adruntime__TokenT $(final adruntime.Token self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_TOKEN && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlToken((adruntime.ControlToken) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.FORKED_TOKEN && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return forkedToken((adruntime.ForkedToken) self);
		return token(self);
	}
	default Activitydiagram__VariableT $(final activitydiagram.Variable self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_VARIABLE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return variable_integerVariable_Aspect((adruntime.IntegerVariable_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INTEGER_VARIABLE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return integerVariable((activitydiagram.IntegerVariable) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_VARIABLE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return variable_booleanVariable_Aspect((adruntime.BooleanVariable_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.BOOLEAN_VARIABLE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return booleanVariable((activitydiagram.BooleanVariable) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.VARIABLE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return variable_Aspect((adruntime.Variable_Aspect) self);
		return null;
	}
	default Activitydiagram__BooleanExpressionT $(final activitydiagram.BooleanExpression self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_BINARY_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return booleanExpression_booleanBinaryExpression_Aspect((adruntime.BooleanBinaryExpression_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return booleanExpression_Aspect((adruntime.BooleanExpression_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return booleanBinaryExpression((activitydiagram.BooleanBinaryExpression) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_UNARY_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return booleanExpression_booleanUnaryExpression_Aspect((adruntime.BooleanUnaryExpression_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return booleanUnaryExpression((activitydiagram.BooleanUnaryExpression) self);
		return null;
	}
	default Adruntime__InputValueT $(final adruntime.InputValue self) {
		return inputValue(self);
	}
	default Adruntime__InputT $(final adruntime.Input self) {
		return input(self);
	}
	default Activitydiagram__BooleanValueT $(final activitydiagram.BooleanValue self) {
		return booleanValue(self);
	}
	default Activitydiagram__JoinNodeT $(final activitydiagram.JoinNode self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.JOIN_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return joinNode_joinNode_Aspect((adruntime.JoinNode_Aspect) self);
		return joinNode(self);
	}
	default Activitydiagram__DecisionNodeT $(final activitydiagram.DecisionNode self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.DECISION_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return decisionNode_decisionNode_Aspect((adruntime.DecisionNode_Aspect) self);
		return decisionNode(self);
	}
	default Activitydiagram__BooleanVariableT $(final activitydiagram.BooleanVariable self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_VARIABLE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return booleanVariable_booleanVariable_Aspect((adruntime.BooleanVariable_Aspect) self);
		return booleanVariable(self);
	}
	default Activitydiagram__NamedElementT $(final activitydiagram.NamedElement self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activity_Aspect((adruntime.Activity_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.FORK_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return forkNode((activitydiagram.ForkNode) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return namedElement_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return namedElement_controlNode_Aspect((adruntime.ControlNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.FINAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return namedElement_finalNode_Aspect((adruntime.FinalNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INITIAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return namedElement_initialNode_Aspect((adruntime.InitialNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityNode_Aspect((adruntime.ActivityNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_FLOW_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return namedElement_controlFlow_Aspect((adruntime.ControlFlow_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.MERGE_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return namedElement_mergeNode_Aspect((adruntime.MergeNode_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.MERGE_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return mergeNode((activitydiagram.MergeNode) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.DECISION_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return namedElement_decisionNode_Aspect((adruntime.DecisionNode_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.ACTIVITY_FINAL_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.INITIAL_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return initialNode((activitydiagram.InitialNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.OPAQUE_ACTION && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return opaqueAction((activitydiagram.OpaqueAction) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.JOIN_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return namedElement_joinNode_Aspect((adruntime.JoinNode_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.ACTIVITY && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return activity((activitydiagram.Activity) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.JOIN_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return joinNode((activitydiagram.JoinNode) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.DECISION_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return decisionNode((activitydiagram.DecisionNode) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.FORK_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return namedElement_forkNode_Aspect((adruntime.ForkNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return namedElement_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return namedElement_action_Aspect((adruntime.Action_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.EXECUTABLE_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return namedElement_executableNode_Aspect((adruntime.ExecutableNode_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_EDGE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityEdge_Aspect((adruntime.ActivityEdge_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.CONTROL_FLOW && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return controlFlow((activitydiagram.ControlFlow) self);
		return null;
	}
	default Adruntime__OfferT $(final adruntime.Offer self) {
		return offer(self);
	}
	default Adruntime__BooleanVariable_AspectT $(final adruntime.BooleanVariable_Aspect self) {
		return booleanVariable_Aspect(self);
	}
	default Adruntime__ForkNode_AspectT $(final adruntime.ForkNode_Aspect self) {
		return forkNode_Aspect(self);
	}
	default Adruntime__BooleanExpression_AspectT $(final adruntime.BooleanExpression_Aspect self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_BINARY_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return booleanExpression_Aspect_booleanBinaryExpression_Aspect((adruntime.BooleanBinaryExpression_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_UNARY_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return booleanExpression_Aspect_booleanUnaryExpression_Aspect((adruntime.BooleanUnaryExpression_Aspect) self);
		return booleanExpression_Aspect(self);
	}
	default Adruntime__JoinNode_AspectT $(final adruntime.JoinNode_Aspect self) {
		return joinNode_Aspect(self);
	}
	default Adruntime__OpaqueAction_AspectT $(final adruntime.OpaqueAction_Aspect self) {
		return opaqueAction_Aspect(self);
	}
	default Adruntime__ExecutableNode_AspectT $(final adruntime.ExecutableNode_Aspect self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return executableNode_Aspect_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return executableNode_Aspect_action_Aspect((adruntime.Action_Aspect) self);
		return executableNode_Aspect(self);
	}
	default Adruntime__BooleanBinaryExpression_AspectT $(final adruntime.BooleanBinaryExpression_Aspect self) {
		return booleanBinaryExpression_Aspect(self);
	}
	default Activitydiagram__FinalNodeT $(final activitydiagram.FinalNode self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return finalNode_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.ACTIVITY_FINAL_NODE && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.FINAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return finalNode_finalNode_Aspect((adruntime.FinalNode_Aspect) self);
		return null;
	}
	default Adruntime__ForkedTokenT $(final adruntime.ForkedToken self) {
		return forkedToken(self);
	}
	default Adruntime__TraceT $(final adruntime.Trace self) {
		return trace(self);
	}
	default Activitydiagram__BooleanBinaryExpressionT $(final activitydiagram.BooleanBinaryExpression self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_BINARY_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return booleanBinaryExpression_booleanBinaryExpression_Aspect((adruntime.BooleanBinaryExpression_Aspect) self);
		return booleanBinaryExpression(self);
	}
	default Adruntime__Action_AspectT $(final adruntime.Action_Aspect self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.OPAQUE_ACTION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return action_Aspect_opaqueAction_Aspect((adruntime.OpaqueAction_Aspect) self);
		return action_Aspect(self);
	}
	default Adruntime__MergeNode_AspectT $(final adruntime.MergeNode_Aspect self) {
		return mergeNode_Aspect(self);
	}
	default Adruntime__ActivityEdge_AspectT $(final adruntime.ActivityEdge_Aspect self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_FLOW_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityEdge_Aspect_controlFlow_Aspect((adruntime.ControlFlow_Aspect) self);
		return activityEdge_Aspect(self);
	}
	default Activitydiagram__ActivityFinalNodeT $(final activitydiagram.ActivityFinalNode self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityFinalNode_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		return activityFinalNode(self);
	}
	default Adruntime__BooleanUnaryExpression_AspectT $(final adruntime.BooleanUnaryExpression_Aspect self) {
		return booleanUnaryExpression_Aspect(self);
	}
	default Activitydiagram__ActivityEdgeT $(final activitydiagram.ActivityEdge self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_FLOW_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityEdge_controlFlow_Aspect((adruntime.ControlFlow_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_EDGE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return activityEdge_Aspect((adruntime.ActivityEdge_Aspect) self);
		if(self.eClass().getClassifierID() == activitydiagram.ActivitydiagramPackage.CONTROL_FLOW && self.eClass().getEPackage() == activitydiagram.ActivitydiagramPackage.eINSTANCE) return controlFlow((activitydiagram.ControlFlow) self);
		return null;
	}
	default Adruntime__FinalNode_AspectT $(final adruntime.FinalNode_Aspect self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return finalNode_Aspect_activityFinalNode_Aspect((adruntime.ActivityFinalNode_Aspect) self);
		return finalNode_Aspect(self);
	}
	default Activitydiagram__InitialNodeT $(final activitydiagram.InitialNode self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INITIAL_NODE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return initialNode_initialNode_Aspect((adruntime.InitialNode_Aspect) self);
		return initialNode(self);
	}
	default Activitydiagram__BooleanUnaryExpressionT $(final activitydiagram.BooleanUnaryExpression self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_UNARY_EXPRESSION_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return booleanUnaryExpression_booleanUnaryExpression_Aspect((adruntime.BooleanUnaryExpression_Aspect) self);
		return booleanUnaryExpression(self);
	}
	default Adruntime__Variable_AspectT $(final adruntime.Variable_Aspect self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.INTEGER_VARIABLE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return variable_Aspect_integerVariable_Aspect((adruntime.IntegerVariable_Aspect) self);
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.BOOLEAN_VARIABLE_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return variable_Aspect_booleanVariable_Aspect((adruntime.BooleanVariable_Aspect) self);
		return variable_Aspect(self);
	}
	default Activitydiagram__IntegerValueT $(final activitydiagram.IntegerValue self) {
		return integerValue(self);
	}
	default Activitydiagram__ControlFlowT $(final activitydiagram.ControlFlow self) {
		if(self.eClass().getClassifierID() == adruntime.AdruntimePackage.CONTROL_FLOW_ASPECT && self.eClass().getEPackage() == adruntime.AdruntimePackage.eINSTANCE) return controlFlow_controlFlow_Aspect((adruntime.ControlFlow_Aspect) self);
		return controlFlow(self);
	}
	default Adruntime__InitialNode_AspectT $(final adruntime.InitialNode_Aspect self) {
		return initialNode_Aspect(self);
	}
}
