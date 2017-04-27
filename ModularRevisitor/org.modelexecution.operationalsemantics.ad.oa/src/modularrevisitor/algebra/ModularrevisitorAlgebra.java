package modularrevisitor.algebra;

public interface ModularrevisitorAlgebra<Admodular__ActionT  extends Admodular__ExecutableNodeT ,Modularrevisitor__Action_AspectT ,Admodular__ActivityT  extends Admodular__NamedElementT ,Admodular__ActivityEdgeT  extends Admodular__NamedElementT ,Modularrevisitor__ActivityEdge_AspectT  extends Admodular__ActivityEdgeT ,Admodular__ActivityFinalNodeT  extends Admodular__FinalNodeT ,Modularrevisitor__ActivityFinalNode_AspectT ,Admodular__ActivityNodeT  extends Admodular__NamedElementT ,Modularrevisitor__ActivityNode_AspectT  extends Admodular__ActivityNodeT ,Modularrevisitor__Activity_AspectT  extends Admodular__ActivityT ,Admodular__BooleanBinaryExpressionT  extends Admodular__BooleanExpressionT ,Modularrevisitor__BooleanBinaryExpression_AspectT ,Admodular__BooleanExpressionT  extends Admodular__ExpressionT ,Modularrevisitor__BooleanExpression_AspectT  extends Admodular__BooleanExpressionT ,Admodular__BooleanUnaryExpressionT  extends Admodular__BooleanExpressionT ,Modularrevisitor__BooleanUnaryExpression_AspectT ,Admodular__BooleanValueT  extends Admodular__ValueT ,Modularrevisitor__BooleanValue_AspectT  extends Admodular__BooleanValueT ,Admodular__BooleanVariableT  extends Admodular__VariableT ,Modularrevisitor__BooleanVariable_AspectT ,Admodular__ControlFlowT  extends Admodular__ActivityEdgeT ,Modularrevisitor__ControlFlow_AspectT ,Admodular__ControlNodeT  extends Admodular__ActivityNodeT ,Modularrevisitor__ControlNode_AspectT ,Modularrevisitor__ControlTokenT  extends Modularrevisitor__TokenT ,Admodular__DecisionNodeT  extends Admodular__ControlNodeT ,Modularrevisitor__DecisionNode_AspectT ,Admodular__ExecutableNodeT  extends Admodular__ActivityNodeT ,Modularrevisitor__ExecutableNode_AspectT ,Admodular__ExpressionT ,Admodular__FinalNodeT  extends Admodular__ControlNodeT ,Modularrevisitor__FinalNode_AspectT ,Admodular__ForkNodeT  extends Admodular__ControlNodeT ,Modularrevisitor__ForkNode_AspectT ,Modularrevisitor__ForkedTokenT  extends Modularrevisitor__TokenT ,Admodular__InitialNodeT  extends Admodular__ControlNodeT ,Modularrevisitor__InitialNode_AspectT ,Modularrevisitor__InputT ,Modularrevisitor__InputValueT ,Admodular__IntegerCalculationExpressionT  extends Admodular__IntegerExpressionT ,Modularrevisitor__IntegerCalculationExpression_AspectT ,Admodular__IntegerComparisonExpressionT  extends Admodular__IntegerExpressionT ,Modularrevisitor__IntegerComparisonExpression_AspectT ,Admodular__IntegerExpressionT  extends Admodular__ExpressionT ,Modularrevisitor__IntegerExpression_AspectT  extends Admodular__IntegerExpressionT ,Admodular__IntegerValueT  extends Admodular__ValueT ,Modularrevisitor__IntegerValue_AspectT  extends Admodular__IntegerValueT ,Admodular__IntegerVariableT  extends Admodular__VariableT ,Modularrevisitor__IntegerVariable_AspectT ,Admodular__JoinNodeT  extends Admodular__ControlNodeT ,Modularrevisitor__JoinNode_AspectT ,Admodular__MergeNodeT  extends Admodular__ControlNodeT ,Modularrevisitor__MergeNode_AspectT ,Admodular__NamedElementT ,Modularrevisitor__OfferT ,Admodular__OpaqueActionT  extends Admodular__ActionT ,Modularrevisitor__OpaqueAction_AspectT ,Modularrevisitor__TokenT ,Modularrevisitor__TraceT ,Admodular__ValueT ,Admodular__VariableT ,Modularrevisitor__Variable_AspectT  extends Admodular__VariableT >
	 extends admodular.algebra.AdmodularAlgebra<Admodular__ActionT , Admodular__ActivityT , Admodular__ActivityEdgeT , Admodular__ActivityFinalNodeT , Admodular__ActivityNodeT , Admodular__BooleanBinaryExpressionT , Admodular__BooleanExpressionT , Admodular__BooleanUnaryExpressionT , Admodular__BooleanValueT , Admodular__BooleanVariableT , Admodular__ControlFlowT , Admodular__ControlNodeT , Admodular__DecisionNodeT , Admodular__ExecutableNodeT , Admodular__ExpressionT , Admodular__FinalNodeT , Admodular__ForkNodeT , Admodular__InitialNodeT , Admodular__IntegerCalculationExpressionT , Admodular__IntegerComparisonExpressionT , Admodular__IntegerExpressionT , Admodular__IntegerValueT , Admodular__IntegerVariableT , Admodular__JoinNodeT , Admodular__MergeNodeT , Admodular__NamedElementT , Admodular__OpaqueActionT , Admodular__ValueT , Admodular__VariableT > {
	Modularrevisitor__Action_AspectT  action_Aspect(final modularrevisitor.Action_Aspect action_Aspect);
	Admodular__NamedElementT  namedElement_action_Aspect(final modularrevisitor.Action_Aspect action_Aspect);
	Admodular__ActionT  action_action_Aspect(final modularrevisitor.Action_Aspect action_Aspect);
	Modularrevisitor__ActivityNode_AspectT  activityNode_Aspect_action_Aspect(final modularrevisitor.Action_Aspect action_Aspect);
	Admodular__ActivityNodeT  activityNode_action_Aspect(final modularrevisitor.Action_Aspect action_Aspect);
	Modularrevisitor__ExecutableNode_AspectT  executableNode_Aspect_action_Aspect(final modularrevisitor.Action_Aspect action_Aspect);
	Admodular__ExecutableNodeT  executableNode_action_Aspect(final modularrevisitor.Action_Aspect action_Aspect);
	
	Modularrevisitor__ActivityEdge_AspectT  activityEdge_Aspect(final modularrevisitor.ActivityEdge_Aspect activityEdge_Aspect);
	Admodular__ActivityEdgeT  activityEdge_activityEdge_Aspect(final modularrevisitor.ActivityEdge_Aspect activityEdge_Aspect);
	Admodular__NamedElementT  namedElement_activityEdge_Aspect(final modularrevisitor.ActivityEdge_Aspect activityEdge_Aspect);
	
	Modularrevisitor__ActivityFinalNode_AspectT  activityFinalNode_Aspect(final modularrevisitor.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Admodular__ActivityFinalNodeT  activityFinalNode_activityFinalNode_Aspect(final modularrevisitor.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Admodular__NamedElementT  namedElement_activityFinalNode_Aspect(final modularrevisitor.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Modularrevisitor__ActivityNode_AspectT  activityNode_Aspect_activityFinalNode_Aspect(final modularrevisitor.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Modularrevisitor__ControlNode_AspectT  controlNode_Aspect_activityFinalNode_Aspect(final modularrevisitor.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Admodular__ControlNodeT  controlNode_activityFinalNode_Aspect(final modularrevisitor.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Modularrevisitor__FinalNode_AspectT  finalNode_Aspect_activityFinalNode_Aspect(final modularrevisitor.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Admodular__FinalNodeT  finalNode_activityFinalNode_Aspect(final modularrevisitor.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Admodular__ActivityNodeT  activityNode_activityFinalNode_Aspect(final modularrevisitor.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	
	Modularrevisitor__ActivityNode_AspectT  activityNode_Aspect(final modularrevisitor.ActivityNode_Aspect activityNode_Aspect);
	Admodular__ActivityNodeT  activityNode_activityNode_Aspect(final modularrevisitor.ActivityNode_Aspect activityNode_Aspect);
	Admodular__NamedElementT  namedElement_activityNode_Aspect(final modularrevisitor.ActivityNode_Aspect activityNode_Aspect);
	
	Modularrevisitor__Activity_AspectT  activity_Aspect(final modularrevisitor.Activity_Aspect activity_Aspect);
	Admodular__NamedElementT  namedElement_activity_Aspect(final modularrevisitor.Activity_Aspect activity_Aspect);
	Admodular__ActivityT  activity_activity_Aspect(final modularrevisitor.Activity_Aspect activity_Aspect);
	
	Modularrevisitor__BooleanBinaryExpression_AspectT  booleanBinaryExpression_Aspect(final modularrevisitor.BooleanBinaryExpression_Aspect booleanBinaryExpression_Aspect);
	Admodular__BooleanExpressionT  booleanExpression_booleanBinaryExpression_Aspect(final modularrevisitor.BooleanBinaryExpression_Aspect booleanBinaryExpression_Aspect);
	Modularrevisitor__BooleanExpression_AspectT  booleanExpression_Aspect_booleanBinaryExpression_Aspect(final modularrevisitor.BooleanBinaryExpression_Aspect booleanBinaryExpression_Aspect);
	Admodular__ExpressionT  expression_booleanBinaryExpression_Aspect(final modularrevisitor.BooleanBinaryExpression_Aspect booleanBinaryExpression_Aspect);
	Admodular__BooleanBinaryExpressionT  booleanBinaryExpression_booleanBinaryExpression_Aspect(final modularrevisitor.BooleanBinaryExpression_Aspect booleanBinaryExpression_Aspect);
	
	Modularrevisitor__BooleanExpression_AspectT  booleanExpression_Aspect(final modularrevisitor.BooleanExpression_Aspect booleanExpression_Aspect);
	Admodular__ExpressionT  expression_booleanExpression_Aspect(final modularrevisitor.BooleanExpression_Aspect booleanExpression_Aspect);
	Admodular__BooleanExpressionT  booleanExpression_booleanExpression_Aspect(final modularrevisitor.BooleanExpression_Aspect booleanExpression_Aspect);
	
	Modularrevisitor__BooleanUnaryExpression_AspectT  booleanUnaryExpression_Aspect(final modularrevisitor.BooleanUnaryExpression_Aspect booleanUnaryExpression_Aspect);
	Admodular__BooleanExpressionT  booleanExpression_booleanUnaryExpression_Aspect(final modularrevisitor.BooleanUnaryExpression_Aspect booleanUnaryExpression_Aspect);
	Modularrevisitor__BooleanExpression_AspectT  booleanExpression_Aspect_booleanUnaryExpression_Aspect(final modularrevisitor.BooleanUnaryExpression_Aspect booleanUnaryExpression_Aspect);
	Admodular__BooleanUnaryExpressionT  booleanUnaryExpression_booleanUnaryExpression_Aspect(final modularrevisitor.BooleanUnaryExpression_Aspect booleanUnaryExpression_Aspect);
	Admodular__ExpressionT  expression_booleanUnaryExpression_Aspect(final modularrevisitor.BooleanUnaryExpression_Aspect booleanUnaryExpression_Aspect);
	
	Modularrevisitor__BooleanValue_AspectT  booleanValue_Aspect(final modularrevisitor.BooleanValue_Aspect booleanValue_Aspect);
	Admodular__ValueT  value_booleanValue_Aspect(final modularrevisitor.BooleanValue_Aspect booleanValue_Aspect);
	Admodular__BooleanValueT  booleanValue_booleanValue_Aspect(final modularrevisitor.BooleanValue_Aspect booleanValue_Aspect);
	
	Modularrevisitor__BooleanVariable_AspectT  booleanVariable_Aspect(final modularrevisitor.BooleanVariable_Aspect booleanVariable_Aspect);
	Admodular__VariableT  variable_booleanVariable_Aspect(final modularrevisitor.BooleanVariable_Aspect booleanVariable_Aspect);
	Modularrevisitor__Variable_AspectT  variable_Aspect_booleanVariable_Aspect(final modularrevisitor.BooleanVariable_Aspect booleanVariable_Aspect);
	Admodular__BooleanVariableT  booleanVariable_booleanVariable_Aspect(final modularrevisitor.BooleanVariable_Aspect booleanVariable_Aspect);
	
	Modularrevisitor__ControlFlow_AspectT  controlFlow_Aspect(final modularrevisitor.ControlFlow_Aspect controlFlow_Aspect);
	Admodular__NamedElementT  namedElement_controlFlow_Aspect(final modularrevisitor.ControlFlow_Aspect controlFlow_Aspect);
	Modularrevisitor__ActivityEdge_AspectT  activityEdge_Aspect_controlFlow_Aspect(final modularrevisitor.ControlFlow_Aspect controlFlow_Aspect);
	Admodular__ControlFlowT  controlFlow_controlFlow_Aspect(final modularrevisitor.ControlFlow_Aspect controlFlow_Aspect);
	Admodular__ActivityEdgeT  activityEdge_controlFlow_Aspect(final modularrevisitor.ControlFlow_Aspect controlFlow_Aspect);
	
	Modularrevisitor__ControlNode_AspectT  controlNode_Aspect(final modularrevisitor.ControlNode_Aspect controlNode_Aspect);
	Admodular__NamedElementT  namedElement_controlNode_Aspect(final modularrevisitor.ControlNode_Aspect controlNode_Aspect);
	Modularrevisitor__ActivityNode_AspectT  activityNode_Aspect_controlNode_Aspect(final modularrevisitor.ControlNode_Aspect controlNode_Aspect);
	Admodular__ActivityNodeT  activityNode_controlNode_Aspect(final modularrevisitor.ControlNode_Aspect controlNode_Aspect);
	Admodular__ControlNodeT  controlNode_controlNode_Aspect(final modularrevisitor.ControlNode_Aspect controlNode_Aspect);
	
	Modularrevisitor__ControlTokenT  controlToken(final modularrevisitor.ControlToken controlToken);
	Modularrevisitor__TokenT  token_controlToken(final modularrevisitor.ControlToken controlToken);
	
	Modularrevisitor__DecisionNode_AspectT  decisionNode_Aspect(final modularrevisitor.DecisionNode_Aspect decisionNode_Aspect);
	Admodular__DecisionNodeT  decisionNode_decisionNode_Aspect(final modularrevisitor.DecisionNode_Aspect decisionNode_Aspect);
	Admodular__NamedElementT  namedElement_decisionNode_Aspect(final modularrevisitor.DecisionNode_Aspect decisionNode_Aspect);
	Modularrevisitor__ActivityNode_AspectT  activityNode_Aspect_decisionNode_Aspect(final modularrevisitor.DecisionNode_Aspect decisionNode_Aspect);
	Admodular__ActivityNodeT  activityNode_decisionNode_Aspect(final modularrevisitor.DecisionNode_Aspect decisionNode_Aspect);
	Modularrevisitor__ControlNode_AspectT  controlNode_Aspect_decisionNode_Aspect(final modularrevisitor.DecisionNode_Aspect decisionNode_Aspect);
	Admodular__ControlNodeT  controlNode_decisionNode_Aspect(final modularrevisitor.DecisionNode_Aspect decisionNode_Aspect);
	
	Modularrevisitor__ExecutableNode_AspectT  executableNode_Aspect(final modularrevisitor.ExecutableNode_Aspect executableNode_Aspect);
	Admodular__NamedElementT  namedElement_executableNode_Aspect(final modularrevisitor.ExecutableNode_Aspect executableNode_Aspect);
	Modularrevisitor__ActivityNode_AspectT  activityNode_Aspect_executableNode_Aspect(final modularrevisitor.ExecutableNode_Aspect executableNode_Aspect);
	Admodular__ActivityNodeT  activityNode_executableNode_Aspect(final modularrevisitor.ExecutableNode_Aspect executableNode_Aspect);
	Admodular__ExecutableNodeT  executableNode_executableNode_Aspect(final modularrevisitor.ExecutableNode_Aspect executableNode_Aspect);
	
	Modularrevisitor__FinalNode_AspectT  finalNode_Aspect(final modularrevisitor.FinalNode_Aspect finalNode_Aspect);
	Admodular__NamedElementT  namedElement_finalNode_Aspect(final modularrevisitor.FinalNode_Aspect finalNode_Aspect);
	Admodular__FinalNodeT  finalNode_finalNode_Aspect(final modularrevisitor.FinalNode_Aspect finalNode_Aspect);
	Modularrevisitor__ActivityNode_AspectT  activityNode_Aspect_finalNode_Aspect(final modularrevisitor.FinalNode_Aspect finalNode_Aspect);
	Admodular__ActivityNodeT  activityNode_finalNode_Aspect(final modularrevisitor.FinalNode_Aspect finalNode_Aspect);
	Modularrevisitor__ControlNode_AspectT  controlNode_Aspect_finalNode_Aspect(final modularrevisitor.FinalNode_Aspect finalNode_Aspect);
	Admodular__ControlNodeT  controlNode_finalNode_Aspect(final modularrevisitor.FinalNode_Aspect finalNode_Aspect);
	
	Modularrevisitor__ForkNode_AspectT  forkNode_Aspect(final modularrevisitor.ForkNode_Aspect forkNode_Aspect);
	Admodular__ForkNodeT  forkNode_forkNode_Aspect(final modularrevisitor.ForkNode_Aspect forkNode_Aspect);
	Admodular__NamedElementT  namedElement_forkNode_Aspect(final modularrevisitor.ForkNode_Aspect forkNode_Aspect);
	Modularrevisitor__ActivityNode_AspectT  activityNode_Aspect_forkNode_Aspect(final modularrevisitor.ForkNode_Aspect forkNode_Aspect);
	Admodular__ActivityNodeT  activityNode_forkNode_Aspect(final modularrevisitor.ForkNode_Aspect forkNode_Aspect);
	Modularrevisitor__ControlNode_AspectT  controlNode_Aspect_forkNode_Aspect(final modularrevisitor.ForkNode_Aspect forkNode_Aspect);
	Admodular__ControlNodeT  controlNode_forkNode_Aspect(final modularrevisitor.ForkNode_Aspect forkNode_Aspect);
	
	Modularrevisitor__ForkedTokenT  forkedToken(final modularrevisitor.ForkedToken forkedToken);
	Modularrevisitor__TokenT  token_forkedToken(final modularrevisitor.ForkedToken forkedToken);
	
	Modularrevisitor__InitialNode_AspectT  initialNode_Aspect(final modularrevisitor.InitialNode_Aspect initialNode_Aspect);
	Admodular__NamedElementT  namedElement_initialNode_Aspect(final modularrevisitor.InitialNode_Aspect initialNode_Aspect);
	Modularrevisitor__ActivityNode_AspectT  activityNode_Aspect_initialNode_Aspect(final modularrevisitor.InitialNode_Aspect initialNode_Aspect);
	Admodular__ActivityNodeT  activityNode_initialNode_Aspect(final modularrevisitor.InitialNode_Aspect initialNode_Aspect);
	Modularrevisitor__ControlNode_AspectT  controlNode_Aspect_initialNode_Aspect(final modularrevisitor.InitialNode_Aspect initialNode_Aspect);
	Admodular__ControlNodeT  controlNode_initialNode_Aspect(final modularrevisitor.InitialNode_Aspect initialNode_Aspect);
	Admodular__InitialNodeT  initialNode_initialNode_Aspect(final modularrevisitor.InitialNode_Aspect initialNode_Aspect);
	
	Modularrevisitor__InputT  input(final modularrevisitor.Input input);
	
	Modularrevisitor__InputValueT  inputValue(final modularrevisitor.InputValue inputValue);
	
	Modularrevisitor__IntegerCalculationExpression_AspectT  integerCalculationExpression_Aspect(final modularrevisitor.IntegerCalculationExpression_Aspect integerCalculationExpression_Aspect);
	Modularrevisitor__IntegerExpression_AspectT  integerExpression_Aspect_integerCalculationExpression_Aspect(final modularrevisitor.IntegerCalculationExpression_Aspect integerCalculationExpression_Aspect);
	Admodular__IntegerCalculationExpressionT  integerCalculationExpression_integerCalculationExpression_Aspect(final modularrevisitor.IntegerCalculationExpression_Aspect integerCalculationExpression_Aspect);
	Admodular__IntegerExpressionT  integerExpression_integerCalculationExpression_Aspect(final modularrevisitor.IntegerCalculationExpression_Aspect integerCalculationExpression_Aspect);
	Admodular__ExpressionT  expression_integerCalculationExpression_Aspect(final modularrevisitor.IntegerCalculationExpression_Aspect integerCalculationExpression_Aspect);
	
	Modularrevisitor__IntegerComparisonExpression_AspectT  integerComparisonExpression_Aspect(final modularrevisitor.IntegerComparisonExpression_Aspect integerComparisonExpression_Aspect);
	Modularrevisitor__IntegerExpression_AspectT  integerExpression_Aspect_integerComparisonExpression_Aspect(final modularrevisitor.IntegerComparisonExpression_Aspect integerComparisonExpression_Aspect);
	Admodular__IntegerComparisonExpressionT  integerComparisonExpression_integerComparisonExpression_Aspect(final modularrevisitor.IntegerComparisonExpression_Aspect integerComparisonExpression_Aspect);
	Admodular__IntegerExpressionT  integerExpression_integerComparisonExpression_Aspect(final modularrevisitor.IntegerComparisonExpression_Aspect integerComparisonExpression_Aspect);
	Admodular__ExpressionT  expression_integerComparisonExpression_Aspect(final modularrevisitor.IntegerComparisonExpression_Aspect integerComparisonExpression_Aspect);
	
	Modularrevisitor__IntegerExpression_AspectT  integerExpression_Aspect(final modularrevisitor.IntegerExpression_Aspect integerExpression_Aspect);
	Admodular__IntegerExpressionT  integerExpression_integerExpression_Aspect(final modularrevisitor.IntegerExpression_Aspect integerExpression_Aspect);
	Admodular__ExpressionT  expression_integerExpression_Aspect(final modularrevisitor.IntegerExpression_Aspect integerExpression_Aspect);
	
	Modularrevisitor__IntegerValue_AspectT  integerValue_Aspect(final modularrevisitor.IntegerValue_Aspect integerValue_Aspect);
	Admodular__IntegerValueT  integerValue_integerValue_Aspect(final modularrevisitor.IntegerValue_Aspect integerValue_Aspect);
	Admodular__ValueT  value_integerValue_Aspect(final modularrevisitor.IntegerValue_Aspect integerValue_Aspect);
	
	Modularrevisitor__IntegerVariable_AspectT  integerVariable_Aspect(final modularrevisitor.IntegerVariable_Aspect integerVariable_Aspect);
	Admodular__VariableT  variable_integerVariable_Aspect(final modularrevisitor.IntegerVariable_Aspect integerVariable_Aspect);
	Modularrevisitor__Variable_AspectT  variable_Aspect_integerVariable_Aspect(final modularrevisitor.IntegerVariable_Aspect integerVariable_Aspect);
	Admodular__IntegerVariableT  integerVariable_integerVariable_Aspect(final modularrevisitor.IntegerVariable_Aspect integerVariable_Aspect);
	
	Modularrevisitor__JoinNode_AspectT  joinNode_Aspect(final modularrevisitor.JoinNode_Aspect joinNode_Aspect);
	Admodular__JoinNodeT  joinNode_joinNode_Aspect(final modularrevisitor.JoinNode_Aspect joinNode_Aspect);
	Admodular__NamedElementT  namedElement_joinNode_Aspect(final modularrevisitor.JoinNode_Aspect joinNode_Aspect);
	Modularrevisitor__ActivityNode_AspectT  activityNode_Aspect_joinNode_Aspect(final modularrevisitor.JoinNode_Aspect joinNode_Aspect);
	Admodular__ActivityNodeT  activityNode_joinNode_Aspect(final modularrevisitor.JoinNode_Aspect joinNode_Aspect);
	Modularrevisitor__ControlNode_AspectT  controlNode_Aspect_joinNode_Aspect(final modularrevisitor.JoinNode_Aspect joinNode_Aspect);
	Admodular__ControlNodeT  controlNode_joinNode_Aspect(final modularrevisitor.JoinNode_Aspect joinNode_Aspect);
	
	Modularrevisitor__MergeNode_AspectT  mergeNode_Aspect(final modularrevisitor.MergeNode_Aspect mergeNode_Aspect);
	Admodular__NamedElementT  namedElement_mergeNode_Aspect(final modularrevisitor.MergeNode_Aspect mergeNode_Aspect);
	Modularrevisitor__ActivityNode_AspectT  activityNode_Aspect_mergeNode_Aspect(final modularrevisitor.MergeNode_Aspect mergeNode_Aspect);
	Admodular__ActivityNodeT  activityNode_mergeNode_Aspect(final modularrevisitor.MergeNode_Aspect mergeNode_Aspect);
	Modularrevisitor__ControlNode_AspectT  controlNode_Aspect_mergeNode_Aspect(final modularrevisitor.MergeNode_Aspect mergeNode_Aspect);
	Admodular__MergeNodeT  mergeNode_mergeNode_Aspect(final modularrevisitor.MergeNode_Aspect mergeNode_Aspect);
	Admodular__ControlNodeT  controlNode_mergeNode_Aspect(final modularrevisitor.MergeNode_Aspect mergeNode_Aspect);
	
	Modularrevisitor__OfferT  offer(final modularrevisitor.Offer offer);
	
	Modularrevisitor__OpaqueAction_AspectT  opaqueAction_Aspect(final modularrevisitor.OpaqueAction_Aspect opaqueAction_Aspect);
	Admodular__NamedElementT  namedElement_opaqueAction_Aspect(final modularrevisitor.OpaqueAction_Aspect opaqueAction_Aspect);
	Modularrevisitor__Action_AspectT  action_Aspect_opaqueAction_Aspect(final modularrevisitor.OpaqueAction_Aspect opaqueAction_Aspect);
	Modularrevisitor__ActivityNode_AspectT  activityNode_Aspect_opaqueAction_Aspect(final modularrevisitor.OpaqueAction_Aspect opaqueAction_Aspect);
	Admodular__ActionT  action_opaqueAction_Aspect(final modularrevisitor.OpaqueAction_Aspect opaqueAction_Aspect);
	Admodular__ActivityNodeT  activityNode_opaqueAction_Aspect(final modularrevisitor.OpaqueAction_Aspect opaqueAction_Aspect);
	Admodular__OpaqueActionT  opaqueAction_opaqueAction_Aspect(final modularrevisitor.OpaqueAction_Aspect opaqueAction_Aspect);
	Modularrevisitor__ExecutableNode_AspectT  executableNode_Aspect_opaqueAction_Aspect(final modularrevisitor.OpaqueAction_Aspect opaqueAction_Aspect);
	Admodular__ExecutableNodeT  executableNode_opaqueAction_Aspect(final modularrevisitor.OpaqueAction_Aspect opaqueAction_Aspect);
	
	Modularrevisitor__TokenT  token(final modularrevisitor.Token token);
	
	Modularrevisitor__TraceT  trace(final modularrevisitor.Trace trace);
	
	Modularrevisitor__Variable_AspectT  variable_Aspect(final modularrevisitor.Variable_Aspect variable_Aspect);
	Admodular__VariableT  variable_variable_Aspect(final modularrevisitor.Variable_Aspect variable_Aspect);
	
	
	default Modularrevisitor__ActivityNode_AspectT  $(final modularrevisitor.ActivityNode_Aspect self) {
		if(self instanceof modularrevisitor.FinalNode_Aspect) return activityNode_Aspect_finalNode_Aspect((modularrevisitor.FinalNode_Aspect) self);
		if(self instanceof modularrevisitor.ForkNode_Aspect) return activityNode_Aspect_forkNode_Aspect((modularrevisitor.ForkNode_Aspect) self);
		if(self instanceof modularrevisitor.Action_Aspect) return activityNode_Aspect_action_Aspect((modularrevisitor.Action_Aspect) self);
		if(self instanceof modularrevisitor.ActivityFinalNode_Aspect) return activityNode_Aspect_activityFinalNode_Aspect((modularrevisitor.ActivityFinalNode_Aspect) self);
		if(self instanceof modularrevisitor.JoinNode_Aspect) return activityNode_Aspect_joinNode_Aspect((modularrevisitor.JoinNode_Aspect) self);
		if(self instanceof modularrevisitor.OpaqueAction_Aspect) return activityNode_Aspect_opaqueAction_Aspect((modularrevisitor.OpaqueAction_Aspect) self);
		if(self instanceof modularrevisitor.ExecutableNode_Aspect) return activityNode_Aspect_executableNode_Aspect((modularrevisitor.ExecutableNode_Aspect) self);
		if(self instanceof modularrevisitor.MergeNode_Aspect) return activityNode_Aspect_mergeNode_Aspect((modularrevisitor.MergeNode_Aspect) self);
		if(self instanceof modularrevisitor.InitialNode_Aspect) return activityNode_Aspect_initialNode_Aspect((modularrevisitor.InitialNode_Aspect) self);
		if(self instanceof modularrevisitor.DecisionNode_Aspect) return activityNode_Aspect_decisionNode_Aspect((modularrevisitor.DecisionNode_Aspect) self);
		if(self instanceof modularrevisitor.ControlNode_Aspect) return activityNode_Aspect_controlNode_Aspect((modularrevisitor.ControlNode_Aspect) self);
		return activityNode_Aspect(self);
	}
	default Modularrevisitor__InputValueT  $(final modularrevisitor.InputValue self) {
		return inputValue(self);
	}
	default Modularrevisitor__ControlTokenT  $(final modularrevisitor.ControlToken self) {
		return controlToken(self);
	}
	default Modularrevisitor__OfferT  $(final modularrevisitor.Offer self) {
		return offer(self);
	}
	default Modularrevisitor__FinalNode_AspectT  $(final modularrevisitor.FinalNode_Aspect self) {
		if(self instanceof modularrevisitor.ActivityFinalNode_Aspect) return finalNode_Aspect_activityFinalNode_Aspect((modularrevisitor.ActivityFinalNode_Aspect) self);
		return finalNode_Aspect(self);
	}
	default Admodular__ActionT  $(final admodular.Action self) {
		if(self instanceof modularrevisitor.OpaqueAction_Aspect) return action_opaqueAction_Aspect((modularrevisitor.OpaqueAction_Aspect) self);
		if(self instanceof modularrevisitor.Action_Aspect) return action_action_Aspect((modularrevisitor.Action_Aspect) self);
		if(self instanceof admodular.OpaqueAction) return opaqueAction((admodular.OpaqueAction) self);
		return null;
	}
	default Modularrevisitor__IntegerComparisonExpression_AspectT  $(final modularrevisitor.IntegerComparisonExpression_Aspect self) {
		return integerComparisonExpression_Aspect(self);
	}
	default Admodular__ActivityFinalNodeT  $(final admodular.ActivityFinalNode self) {
		if(self instanceof modularrevisitor.ActivityFinalNode_Aspect) return activityFinalNode_activityFinalNode_Aspect((modularrevisitor.ActivityFinalNode_Aspect) self);
		return activityFinalNode(self);
	}
	default Modularrevisitor__ForkNode_AspectT  $(final modularrevisitor.ForkNode_Aspect self) {
		return forkNode_Aspect(self);
	}
	default Modularrevisitor__Action_AspectT  $(final modularrevisitor.Action_Aspect self) {
		if(self instanceof modularrevisitor.OpaqueAction_Aspect) return action_Aspect_opaqueAction_Aspect((modularrevisitor.OpaqueAction_Aspect) self);
		return action_Aspect(self);
	}
	default Modularrevisitor__BooleanValue_AspectT  $(final modularrevisitor.BooleanValue_Aspect self) {
		return booleanValue_Aspect(self);
	}
	default Admodular__IntegerVariableT  $(final admodular.IntegerVariable self) {
		if(self instanceof modularrevisitor.IntegerVariable_Aspect) return integerVariable_integerVariable_Aspect((modularrevisitor.IntegerVariable_Aspect) self);
		return integerVariable(self);
	}
	default Modularrevisitor__ActivityFinalNode_AspectT  $(final modularrevisitor.ActivityFinalNode_Aspect self) {
		return activityFinalNode_Aspect(self);
	}
	default Modularrevisitor__IntegerVariable_AspectT  $(final modularrevisitor.IntegerVariable_Aspect self) {
		return integerVariable_Aspect(self);
	}
	default Admodular__ExpressionT  $(final admodular.Expression self) {
		if(self instanceof modularrevisitor.IntegerComparisonExpression_Aspect) return expression_integerComparisonExpression_Aspect((modularrevisitor.IntegerComparisonExpression_Aspect) self);
		if(self instanceof modularrevisitor.IntegerExpression_Aspect) return integerExpression_Aspect((modularrevisitor.IntegerExpression_Aspect) self);
		if(self instanceof admodular.IntegerCalculationExpression) return integerCalculationExpression((admodular.IntegerCalculationExpression) self);
		if(self instanceof modularrevisitor.BooleanBinaryExpression_Aspect) return expression_booleanBinaryExpression_Aspect((modularrevisitor.BooleanBinaryExpression_Aspect) self);
		if(self instanceof admodular.BooleanBinaryExpression) return booleanBinaryExpression((admodular.BooleanBinaryExpression) self);
		if(self instanceof admodular.IntegerComparisonExpression) return integerComparisonExpression((admodular.IntegerComparisonExpression) self);
		if(self instanceof modularrevisitor.BooleanUnaryExpression_Aspect) return expression_booleanUnaryExpression_Aspect((modularrevisitor.BooleanUnaryExpression_Aspect) self);
		if(self instanceof modularrevisitor.BooleanExpression_Aspect) return booleanExpression_Aspect((modularrevisitor.BooleanExpression_Aspect) self);
		if(self instanceof admodular.BooleanUnaryExpression) return booleanUnaryExpression((admodular.BooleanUnaryExpression) self);
		if(self instanceof modularrevisitor.IntegerCalculationExpression_Aspect) return expression_integerCalculationExpression_Aspect((modularrevisitor.IntegerCalculationExpression_Aspect) self);
		return null;
	}
	default Modularrevisitor__IntegerExpression_AspectT  $(final modularrevisitor.IntegerExpression_Aspect self) {
		if(self instanceof modularrevisitor.IntegerComparisonExpression_Aspect) return integerExpression_Aspect_integerComparisonExpression_Aspect((modularrevisitor.IntegerComparisonExpression_Aspect) self);
		if(self instanceof modularrevisitor.IntegerCalculationExpression_Aspect) return integerExpression_Aspect_integerCalculationExpression_Aspect((modularrevisitor.IntegerCalculationExpression_Aspect) self);
		return integerExpression_Aspect(self);
	}
	default Admodular__FinalNodeT  $(final admodular.FinalNode self) {
		if(self instanceof modularrevisitor.ActivityFinalNode_Aspect) return finalNode_activityFinalNode_Aspect((modularrevisitor.ActivityFinalNode_Aspect) self);
		if(self instanceof modularrevisitor.FinalNode_Aspect) return finalNode_finalNode_Aspect((modularrevisitor.FinalNode_Aspect) self);
		if(self instanceof admodular.ActivityFinalNode) return activityFinalNode((admodular.ActivityFinalNode) self);
		return null;
	}
	default Admodular__IntegerCalculationExpressionT  $(final admodular.IntegerCalculationExpression self) {
		if(self instanceof modularrevisitor.IntegerCalculationExpression_Aspect) return integerCalculationExpression_integerCalculationExpression_Aspect((modularrevisitor.IntegerCalculationExpression_Aspect) self);
		return integerCalculationExpression(self);
	}
	default Admodular__BooleanBinaryExpressionT  $(final admodular.BooleanBinaryExpression self) {
		if(self instanceof modularrevisitor.BooleanBinaryExpression_Aspect) return booleanBinaryExpression_booleanBinaryExpression_Aspect((modularrevisitor.BooleanBinaryExpression_Aspect) self);
		return booleanBinaryExpression(self);
	}
	default Modularrevisitor__IntegerValue_AspectT  $(final modularrevisitor.IntegerValue_Aspect self) {
		return integerValue_Aspect(self);
	}
	default Modularrevisitor__BooleanVariable_AspectT  $(final modularrevisitor.BooleanVariable_Aspect self) {
		return booleanVariable_Aspect(self);
	}
	default Admodular__ForkNodeT  $(final admodular.ForkNode self) {
		if(self instanceof modularrevisitor.ForkNode_Aspect) return forkNode_forkNode_Aspect((modularrevisitor.ForkNode_Aspect) self);
		return forkNode(self);
	}
	default Admodular__IntegerValueT  $(final admodular.IntegerValue self) {
		if(self instanceof modularrevisitor.IntegerValue_Aspect) return integerValue_Aspect((modularrevisitor.IntegerValue_Aspect) self);
		return integerValue(self);
	}
	default Modularrevisitor__ForkedTokenT  $(final modularrevisitor.ForkedToken self) {
		return forkedToken(self);
	}
	default Modularrevisitor__JoinNode_AspectT  $(final modularrevisitor.JoinNode_Aspect self) {
		return joinNode_Aspect(self);
	}
	default Admodular__IntegerComparisonExpressionT  $(final admodular.IntegerComparisonExpression self) {
		if(self instanceof modularrevisitor.IntegerComparisonExpression_Aspect) return integerComparisonExpression_integerComparisonExpression_Aspect((modularrevisitor.IntegerComparisonExpression_Aspect) self);
		return integerComparisonExpression(self);
	}
	default Admodular__BooleanValueT  $(final admodular.BooleanValue self) {
		if(self instanceof modularrevisitor.BooleanValue_Aspect) return booleanValue_Aspect((modularrevisitor.BooleanValue_Aspect) self);
		return booleanValue(self);
	}
	default Modularrevisitor__BooleanBinaryExpression_AspectT  $(final modularrevisitor.BooleanBinaryExpression_Aspect self) {
		return booleanBinaryExpression_Aspect(self);
	}
	default Modularrevisitor__ExecutableNode_AspectT  $(final modularrevisitor.ExecutableNode_Aspect self) {
		if(self instanceof modularrevisitor.OpaqueAction_Aspect) return executableNode_Aspect_opaqueAction_Aspect((modularrevisitor.OpaqueAction_Aspect) self);
		if(self instanceof modularrevisitor.Action_Aspect) return executableNode_Aspect_action_Aspect((modularrevisitor.Action_Aspect) self);
		return executableNode_Aspect(self);
	}
	default Modularrevisitor__OpaqueAction_AspectT  $(final modularrevisitor.OpaqueAction_Aspect self) {
		return opaqueAction_Aspect(self);
	}
	default Admodular__ValueT  $(final admodular.Value self) {
		if(self instanceof modularrevisitor.BooleanValue_Aspect) return booleanValue_Aspect((modularrevisitor.BooleanValue_Aspect) self);
		if(self instanceof modularrevisitor.IntegerValue_Aspect) return integerValue_Aspect((modularrevisitor.IntegerValue_Aspect) self);
		if(self instanceof admodular.IntegerValue) return integerValue((admodular.IntegerValue) self);
		if(self instanceof admodular.BooleanValue) return booleanValue((admodular.BooleanValue) self);
		return null;
	}
	default Admodular__BooleanVariableT  $(final admodular.BooleanVariable self) {
		if(self instanceof modularrevisitor.BooleanVariable_Aspect) return booleanVariable_booleanVariable_Aspect((modularrevisitor.BooleanVariable_Aspect) self);
		return booleanVariable(self);
	}
	default Modularrevisitor__MergeNode_AspectT  $(final modularrevisitor.MergeNode_Aspect self) {
		return mergeNode_Aspect(self);
	}
	default Admodular__OpaqueActionT  $(final admodular.OpaqueAction self) {
		if(self instanceof modularrevisitor.OpaqueAction_Aspect) return opaqueAction_opaqueAction_Aspect((modularrevisitor.OpaqueAction_Aspect) self);
		return opaqueAction(self);
	}
	default Admodular__ActivityT  $(final admodular.Activity self) {
		if(self instanceof modularrevisitor.Activity_Aspect) return activity_Aspect((modularrevisitor.Activity_Aspect) self);
		return activity(self);
	}
	default Modularrevisitor__ControlNode_AspectT  $(final modularrevisitor.ControlNode_Aspect self) {
		if(self instanceof modularrevisitor.FinalNode_Aspect) return controlNode_Aspect_finalNode_Aspect((modularrevisitor.FinalNode_Aspect) self);
		if(self instanceof modularrevisitor.ForkNode_Aspect) return controlNode_Aspect_forkNode_Aspect((modularrevisitor.ForkNode_Aspect) self);
		if(self instanceof modularrevisitor.ActivityFinalNode_Aspect) return controlNode_Aspect_activityFinalNode_Aspect((modularrevisitor.ActivityFinalNode_Aspect) self);
		if(self instanceof modularrevisitor.JoinNode_Aspect) return controlNode_Aspect_joinNode_Aspect((modularrevisitor.JoinNode_Aspect) self);
		if(self instanceof modularrevisitor.MergeNode_Aspect) return controlNode_Aspect_mergeNode_Aspect((modularrevisitor.MergeNode_Aspect) self);
		if(self instanceof modularrevisitor.InitialNode_Aspect) return controlNode_Aspect_initialNode_Aspect((modularrevisitor.InitialNode_Aspect) self);
		if(self instanceof modularrevisitor.DecisionNode_Aspect) return controlNode_Aspect_decisionNode_Aspect((modularrevisitor.DecisionNode_Aspect) self);
		return controlNode_Aspect(self);
	}
	default Admodular__ControlNodeT  $(final admodular.ControlNode self) {
		if(self instanceof modularrevisitor.FinalNode_Aspect) return controlNode_finalNode_Aspect((modularrevisitor.FinalNode_Aspect) self);
		if(self instanceof admodular.ActivityFinalNode) return activityFinalNode((admodular.ActivityFinalNode) self);
		if(self instanceof modularrevisitor.ForkNode_Aspect) return controlNode_forkNode_Aspect((modularrevisitor.ForkNode_Aspect) self);
		if(self instanceof modularrevisitor.ActivityFinalNode_Aspect) return controlNode_activityFinalNode_Aspect((modularrevisitor.ActivityFinalNode_Aspect) self);
		if(self instanceof admodular.ForkNode) return forkNode((admodular.ForkNode) self);
		if(self instanceof modularrevisitor.JoinNode_Aspect) return controlNode_joinNode_Aspect((modularrevisitor.JoinNode_Aspect) self);
		if(self instanceof modularrevisitor.MergeNode_Aspect) return controlNode_mergeNode_Aspect((modularrevisitor.MergeNode_Aspect) self);
		if(self instanceof modularrevisitor.InitialNode_Aspect) return controlNode_initialNode_Aspect((modularrevisitor.InitialNode_Aspect) self);
		if(self instanceof modularrevisitor.ControlNode_Aspect) return controlNode_controlNode_Aspect((modularrevisitor.ControlNode_Aspect) self);
		if(self instanceof admodular.JoinNode) return joinNode((admodular.JoinNode) self);
		if(self instanceof admodular.MergeNode) return mergeNode((admodular.MergeNode) self);
		if(self instanceof modularrevisitor.DecisionNode_Aspect) return controlNode_decisionNode_Aspect((modularrevisitor.DecisionNode_Aspect) self);
		if(self instanceof admodular.DecisionNode) return decisionNode((admodular.DecisionNode) self);
		if(self instanceof admodular.InitialNode) return initialNode((admodular.InitialNode) self);
		return null;
	}
	default Admodular__JoinNodeT  $(final admodular.JoinNode self) {
		if(self instanceof modularrevisitor.JoinNode_Aspect) return joinNode_joinNode_Aspect((modularrevisitor.JoinNode_Aspect) self);
		return joinNode(self);
	}
	default Admodular__ControlFlowT  $(final admodular.ControlFlow self) {
		if(self instanceof modularrevisitor.ControlFlow_Aspect) return controlFlow_controlFlow_Aspect((modularrevisitor.ControlFlow_Aspect) self);
		return controlFlow(self);
	}
	default Admodular__IntegerExpressionT  $(final admodular.IntegerExpression self) {
		if(self instanceof modularrevisitor.IntegerComparisonExpression_Aspect) return integerExpression_integerComparisonExpression_Aspect((modularrevisitor.IntegerComparisonExpression_Aspect) self);
		if(self instanceof modularrevisitor.IntegerCalculationExpression_Aspect) return integerExpression_integerCalculationExpression_Aspect((modularrevisitor.IntegerCalculationExpression_Aspect) self);
		if(self instanceof modularrevisitor.IntegerExpression_Aspect) return integerExpression_Aspect((modularrevisitor.IntegerExpression_Aspect) self);
		if(self instanceof admodular.IntegerCalculationExpression) return integerCalculationExpression((admodular.IntegerCalculationExpression) self);
		if(self instanceof admodular.IntegerComparisonExpression) return integerComparisonExpression((admodular.IntegerComparisonExpression) self);
		return null;
	}
	default Modularrevisitor__InputT  $(final modularrevisitor.Input self) {
		return input(self);
	}
	default Admodular__ExecutableNodeT  $(final admodular.ExecutableNode self) {
		if(self instanceof modularrevisitor.OpaqueAction_Aspect) return executableNode_opaqueAction_Aspect((modularrevisitor.OpaqueAction_Aspect) self);
		if(self instanceof modularrevisitor.Action_Aspect) return executableNode_action_Aspect((modularrevisitor.Action_Aspect) self);
		if(self instanceof admodular.OpaqueAction) return opaqueAction((admodular.OpaqueAction) self);
		if(self instanceof modularrevisitor.ExecutableNode_Aspect) return executableNode_executableNode_Aspect((modularrevisitor.ExecutableNode_Aspect) self);
		return null;
	}
	default Modularrevisitor__ActivityEdge_AspectT  $(final modularrevisitor.ActivityEdge_Aspect self) {
		if(self instanceof modularrevisitor.ControlFlow_Aspect) return activityEdge_Aspect_controlFlow_Aspect((modularrevisitor.ControlFlow_Aspect) self);
		return activityEdge_Aspect(self);
	}
	default Modularrevisitor__Variable_AspectT  $(final modularrevisitor.Variable_Aspect self) {
		if(self instanceof modularrevisitor.IntegerVariable_Aspect) return variable_Aspect_integerVariable_Aspect((modularrevisitor.IntegerVariable_Aspect) self);
		if(self instanceof modularrevisitor.BooleanVariable_Aspect) return variable_Aspect_booleanVariable_Aspect((modularrevisitor.BooleanVariable_Aspect) self);
		return variable_Aspect(self);
	}
	default Admodular__ActivityEdgeT  $(final admodular.ActivityEdge self) {
		if(self instanceof modularrevisitor.ControlFlow_Aspect) return activityEdge_controlFlow_Aspect((modularrevisitor.ControlFlow_Aspect) self);
		if(self instanceof admodular.ControlFlow) return controlFlow((admodular.ControlFlow) self);
		if(self instanceof modularrevisitor.ActivityEdge_Aspect) return activityEdge_Aspect((modularrevisitor.ActivityEdge_Aspect) self);
		return null;
	}
	default Modularrevisitor__BooleanUnaryExpression_AspectT  $(final modularrevisitor.BooleanUnaryExpression_Aspect self) {
		return booleanUnaryExpression_Aspect(self);
	}
	default Admodular__BooleanExpressionT  $(final admodular.BooleanExpression self) {
		if(self instanceof modularrevisitor.BooleanBinaryExpression_Aspect) return booleanExpression_booleanBinaryExpression_Aspect((modularrevisitor.BooleanBinaryExpression_Aspect) self);
		if(self instanceof admodular.BooleanBinaryExpression) return booleanBinaryExpression((admodular.BooleanBinaryExpression) self);
		if(self instanceof modularrevisitor.BooleanUnaryExpression_Aspect) return booleanExpression_booleanUnaryExpression_Aspect((modularrevisitor.BooleanUnaryExpression_Aspect) self);
		if(self instanceof modularrevisitor.BooleanExpression_Aspect) return booleanExpression_Aspect((modularrevisitor.BooleanExpression_Aspect) self);
		if(self instanceof admodular.BooleanUnaryExpression) return booleanUnaryExpression((admodular.BooleanUnaryExpression) self);
		return null;
	}
	default Admodular__ActivityNodeT  $(final admodular.ActivityNode self) {
		if(self instanceof modularrevisitor.FinalNode_Aspect) return activityNode_finalNode_Aspect((modularrevisitor.FinalNode_Aspect) self);
		if(self instanceof modularrevisitor.Action_Aspect) return activityNode_action_Aspect((modularrevisitor.Action_Aspect) self);
		if(self instanceof modularrevisitor.ActivityNode_Aspect) return activityNode_Aspect((modularrevisitor.ActivityNode_Aspect) self);
		if(self instanceof admodular.ActivityFinalNode) return activityFinalNode((admodular.ActivityFinalNode) self);
		if(self instanceof modularrevisitor.ForkNode_Aspect) return activityNode_forkNode_Aspect((modularrevisitor.ForkNode_Aspect) self);
		if(self instanceof modularrevisitor.ActivityFinalNode_Aspect) return activityNode_activityFinalNode_Aspect((modularrevisitor.ActivityFinalNode_Aspect) self);
		if(self instanceof admodular.ForkNode) return forkNode((admodular.ForkNode) self);
		if(self instanceof modularrevisitor.JoinNode_Aspect) return activityNode_joinNode_Aspect((modularrevisitor.JoinNode_Aspect) self);
		if(self instanceof modularrevisitor.OpaqueAction_Aspect) return activityNode_opaqueAction_Aspect((modularrevisitor.OpaqueAction_Aspect) self);
		if(self instanceof modularrevisitor.ExecutableNode_Aspect) return activityNode_executableNode_Aspect((modularrevisitor.ExecutableNode_Aspect) self);
		if(self instanceof modularrevisitor.MergeNode_Aspect) return activityNode_mergeNode_Aspect((modularrevisitor.MergeNode_Aspect) self);
		if(self instanceof admodular.OpaqueAction) return opaqueAction((admodular.OpaqueAction) self);
		if(self instanceof modularrevisitor.InitialNode_Aspect) return activityNode_initialNode_Aspect((modularrevisitor.InitialNode_Aspect) self);
		if(self instanceof modularrevisitor.ControlNode_Aspect) return activityNode_controlNode_Aspect((modularrevisitor.ControlNode_Aspect) self);
		if(self instanceof admodular.JoinNode) return joinNode((admodular.JoinNode) self);
		if(self instanceof admodular.DecisionNode) return decisionNode((admodular.DecisionNode) self);
		if(self instanceof admodular.MergeNode) return mergeNode((admodular.MergeNode) self);
		if(self instanceof modularrevisitor.DecisionNode_Aspect) return activityNode_decisionNode_Aspect((modularrevisitor.DecisionNode_Aspect) self);
		if(self instanceof admodular.InitialNode) return initialNode((admodular.InitialNode) self);
		return null;
	}
	default Admodular__VariableT  $(final admodular.Variable self) {
		if(self instanceof modularrevisitor.IntegerVariable_Aspect) return variable_integerVariable_Aspect((modularrevisitor.IntegerVariable_Aspect) self);
		if(self instanceof admodular.IntegerVariable) return integerVariable((admodular.IntegerVariable) self);
		if(self instanceof modularrevisitor.BooleanVariable_Aspect) return variable_booleanVariable_Aspect((modularrevisitor.BooleanVariable_Aspect) self);
		if(self instanceof admodular.BooleanVariable) return booleanVariable((admodular.BooleanVariable) self);
		if(self instanceof modularrevisitor.Variable_Aspect) return variable_Aspect((modularrevisitor.Variable_Aspect) self);
		return null;
	}
	default Modularrevisitor__InitialNode_AspectT  $(final modularrevisitor.InitialNode_Aspect self) {
		return initialNode_Aspect(self);
	}
	default Admodular__MergeNodeT  $(final admodular.MergeNode self) {
		if(self instanceof modularrevisitor.MergeNode_Aspect) return mergeNode_mergeNode_Aspect((modularrevisitor.MergeNode_Aspect) self);
		return mergeNode(self);
	}
	default Modularrevisitor__ControlFlow_AspectT  $(final modularrevisitor.ControlFlow_Aspect self) {
		return controlFlow_Aspect(self);
	}
	default Admodular__NamedElementT  $(final admodular.NamedElement self) {
		if(self instanceof modularrevisitor.FinalNode_Aspect) return namedElement_finalNode_Aspect((modularrevisitor.FinalNode_Aspect) self);
		if(self instanceof modularrevisitor.Action_Aspect) return namedElement_action_Aspect((modularrevisitor.Action_Aspect) self);
		if(self instanceof modularrevisitor.ActivityNode_Aspect) return activityNode_Aspect((modularrevisitor.ActivityNode_Aspect) self);
		if(self instanceof admodular.ActivityFinalNode) return activityFinalNode((admodular.ActivityFinalNode) self);
		if(self instanceof modularrevisitor.ForkNode_Aspect) return namedElement_forkNode_Aspect((modularrevisitor.ForkNode_Aspect) self);
		if(self instanceof modularrevisitor.ActivityFinalNode_Aspect) return namedElement_activityFinalNode_Aspect((modularrevisitor.ActivityFinalNode_Aspect) self);
		if(self instanceof admodular.ForkNode) return forkNode((admodular.ForkNode) self);
		if(self instanceof modularrevisitor.JoinNode_Aspect) return namedElement_joinNode_Aspect((modularrevisitor.JoinNode_Aspect) self);
		if(self instanceof modularrevisitor.OpaqueAction_Aspect) return namedElement_opaqueAction_Aspect((modularrevisitor.OpaqueAction_Aspect) self);
		if(self instanceof modularrevisitor.ExecutableNode_Aspect) return namedElement_executableNode_Aspect((modularrevisitor.ExecutableNode_Aspect) self);
		if(self instanceof modularrevisitor.MergeNode_Aspect) return namedElement_mergeNode_Aspect((modularrevisitor.MergeNode_Aspect) self);
		if(self instanceof admodular.OpaqueAction) return opaqueAction((admodular.OpaqueAction) self);
		if(self instanceof modularrevisitor.Activity_Aspect) return activity_Aspect((modularrevisitor.Activity_Aspect) self);
		if(self instanceof admodular.Activity) return activity((admodular.Activity) self);
		if(self instanceof modularrevisitor.ControlNode_Aspect) return namedElement_controlNode_Aspect((modularrevisitor.ControlNode_Aspect) self);
		if(self instanceof admodular.JoinNode) return joinNode((admodular.JoinNode) self);
		if(self instanceof modularrevisitor.InitialNode_Aspect) return namedElement_initialNode_Aspect((modularrevisitor.InitialNode_Aspect) self);
		if(self instanceof admodular.MergeNode) return mergeNode((admodular.MergeNode) self);
		if(self instanceof admodular.ControlFlow) return controlFlow((admodular.ControlFlow) self);
		if(self instanceof modularrevisitor.ControlFlow_Aspect) return namedElement_controlFlow_Aspect((modularrevisitor.ControlFlow_Aspect) self);
		if(self instanceof modularrevisitor.ActivityEdge_Aspect) return activityEdge_Aspect((modularrevisitor.ActivityEdge_Aspect) self);
		if(self instanceof modularrevisitor.DecisionNode_Aspect) return namedElement_decisionNode_Aspect((modularrevisitor.DecisionNode_Aspect) self);
		if(self instanceof admodular.DecisionNode) return decisionNode((admodular.DecisionNode) self);
		if(self instanceof admodular.InitialNode) return initialNode((admodular.InitialNode) self);
		return null;
	}
	default Modularrevisitor__DecisionNode_AspectT  $(final modularrevisitor.DecisionNode_Aspect self) {
		return decisionNode_Aspect(self);
	}
	default Admodular__DecisionNodeT  $(final admodular.DecisionNode self) {
		if(self instanceof modularrevisitor.DecisionNode_Aspect) return decisionNode_decisionNode_Aspect((modularrevisitor.DecisionNode_Aspect) self);
		return decisionNode(self);
	}
	default Modularrevisitor__BooleanExpression_AspectT  $(final modularrevisitor.BooleanExpression_Aspect self) {
		if(self instanceof modularrevisitor.BooleanBinaryExpression_Aspect) return booleanExpression_Aspect_booleanBinaryExpression_Aspect((modularrevisitor.BooleanBinaryExpression_Aspect) self);
		if(self instanceof modularrevisitor.BooleanUnaryExpression_Aspect) return booleanExpression_Aspect_booleanUnaryExpression_Aspect((modularrevisitor.BooleanUnaryExpression_Aspect) self);
		return booleanExpression_Aspect(self);
	}
	default Modularrevisitor__IntegerCalculationExpression_AspectT  $(final modularrevisitor.IntegerCalculationExpression_Aspect self) {
		return integerCalculationExpression_Aspect(self);
	}
	default Modularrevisitor__TraceT  $(final modularrevisitor.Trace self) {
		return trace(self);
	}
	default Modularrevisitor__TokenT  $(final modularrevisitor.Token self) {
		if(self instanceof modularrevisitor.ControlToken) return controlToken((modularrevisitor.ControlToken) self);
		if(self instanceof modularrevisitor.ForkedToken) return forkedToken((modularrevisitor.ForkedToken) self);
		return token(self);
	}
	default Admodular__BooleanUnaryExpressionT  $(final admodular.BooleanUnaryExpression self) {
		if(self instanceof modularrevisitor.BooleanUnaryExpression_Aspect) return booleanUnaryExpression_booleanUnaryExpression_Aspect((modularrevisitor.BooleanUnaryExpression_Aspect) self);
		return booleanUnaryExpression(self);
	}
	default Modularrevisitor__Activity_AspectT  $(final modularrevisitor.Activity_Aspect self) {
		return activity_Aspect(self);
	}
	default Admodular__InitialNodeT  $(final admodular.InitialNode self) {
		if(self instanceof modularrevisitor.InitialNode_Aspect) return initialNode_initialNode_Aspect((modularrevisitor.InitialNode_Aspect) self);
		return initialNode(self);
	}
	
}
