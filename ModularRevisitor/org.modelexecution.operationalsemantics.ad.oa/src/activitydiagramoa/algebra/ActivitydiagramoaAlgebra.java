package activitydiagramoa.algebra;

import admodular.Action;
import admodular.Activity;
import admodular.ActivityEdge;
import admodular.ActivityFinalNode;
import admodular.ActivityNode;
import admodular.BooleanBinaryExpression;
import admodular.BooleanExpression;
import admodular.BooleanUnaryExpression;
import admodular.BooleanValue;
import admodular.BooleanVariable;
import admodular.ControlFlow;
import admodular.ControlNode;
import admodular.DecisionNode;
import admodular.ExecutableNode;
import admodular.Expression;
import admodular.FinalNode;
import admodular.ForkNode;
import admodular.InitialNode;
import admodular.IntegerCalculationExpression;
import admodular.IntegerComparisonExpression;
import admodular.IntegerExpression;
import admodular.IntegerValue;
import admodular.IntegerVariable;
import admodular.JoinNode;
import admodular.MergeNode;
import admodular.NamedElement;
import admodular.OpaqueAction;
import admodular.Value;
import admodular.Variable;
import admodular.impl.ActivityFinalNodeImpl;
import admodular.impl.ActivityImpl;
import admodular.impl.BooleanBinaryExpressionImpl;
import admodular.impl.BooleanUnaryExpressionImpl;
import admodular.impl.BooleanValueImpl;
import admodular.impl.BooleanVariableImpl;
import admodular.impl.ControlFlowImpl;
import admodular.impl.DecisionNodeImpl;
import admodular.impl.ForkNodeImpl;
import admodular.impl.InitialNodeImpl;
import admodular.impl.IntegerCalculationExpressionImpl;
import admodular.impl.IntegerComparisonExpressionImpl;
import admodular.impl.IntegerValueImpl;
import admodular.impl.IntegerVariableImpl;
import admodular.impl.JoinNodeImpl;
import admodular.impl.MergeNodeImpl;
import admodular.impl.OpaqueActionImpl;

public interface ActivitydiagramoaAlgebra<Activitydiagramoa__ActionT  extends Activitydiagramoa__ExecutableNodeT ,Activitydiagramoa__ActivityT  extends Activitydiagramoa__NamedElementT ,Activitydiagramoa__ActivityEdgeT  extends Activitydiagramoa__NamedElementT ,Activitydiagramoa__ActivityFinalNodeT  extends Activitydiagramoa__FinalNodeT ,Activitydiagramoa__ActivityNodeT  extends Activitydiagramoa__NamedElementT ,Activitydiagramoa__BooleanBinaryExpressionT  extends Activitydiagramoa__BooleanExpressionT ,Activitydiagramoa__BooleanExpressionT  extends Activitydiagramoa__ExpressionT ,Activitydiagramoa__BooleanUnaryExpressionT  extends Activitydiagramoa__BooleanExpressionT ,Activitydiagramoa__BooleanValueT  extends Activitydiagramoa__ValueT ,Activitydiagramoa__BooleanVariableT  extends Activitydiagramoa__VariableT ,Activitydiagramoa__ControlFlowT  extends Activitydiagramoa__ActivityEdgeT ,Activitydiagramoa__ControlNodeT  extends Activitydiagramoa__ActivityNodeT ,Activitydiagramoa__DecisionNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagramoa__ExecutableNodeT  extends Activitydiagramoa__ActivityNodeT ,Activitydiagramoa__ExpressionT ,Activitydiagramoa__FinalNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagramoa__ForkNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagramoa__InitialNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagramoa__IntegerCalculationExpressionT  extends Activitydiagramoa__IntegerExpressionT ,Activitydiagramoa__IntegerComparisonExpressionT  extends Activitydiagramoa__IntegerExpressionT ,Activitydiagramoa__IntegerExpressionT  extends Activitydiagramoa__ExpressionT ,Activitydiagramoa__IntegerValueT  extends Activitydiagramoa__ValueT ,Activitydiagramoa__IntegerVariableT  extends Activitydiagramoa__VariableT ,Activitydiagramoa__JoinNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagramoa__MergeNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagramoa__NamedElementT ,Activitydiagramoa__OpaqueActionT  extends Activitydiagramoa__ActionT ,Activitydiagramoa__ValueT ,Activitydiagramoa__VariableT >
	 {
	Activitydiagramoa__ActivityT  activity(final Activity activity);
	Activitydiagramoa__NamedElementT  namedElement_activity(final Activity activity);
	
	Activitydiagramoa__ActivityFinalNodeT  activityFinalNode(final ActivityFinalNode activityFinalNode);
	Activitydiagramoa__ActivityNodeT  activityNode_activityFinalNode(final ActivityFinalNode activityFinalNode);
	Activitydiagramoa__FinalNodeT  finalNode_activityFinalNode(final ActivityFinalNode activityFinalNode);
	Activitydiagramoa__ControlNodeT  controlNode_activityFinalNode(final ActivityFinalNode activityFinalNode);
	Activitydiagramoa__NamedElementT  namedElement_activityFinalNode(final ActivityFinalNode activityFinalNode);
	
	Activitydiagramoa__BooleanBinaryExpressionT  booleanBinaryExpression(final BooleanBinaryExpression booleanBinaryExpression);
	Activitydiagramoa__BooleanExpressionT  booleanExpression_booleanBinaryExpression(final BooleanBinaryExpression booleanBinaryExpression);
	Activitydiagramoa__ExpressionT  expression_booleanBinaryExpression(final BooleanBinaryExpression booleanBinaryExpression);
	
	Activitydiagramoa__BooleanUnaryExpressionT  booleanUnaryExpression(final BooleanUnaryExpression booleanUnaryExpression);
	Activitydiagramoa__BooleanExpressionT  booleanExpression_booleanUnaryExpression(final BooleanUnaryExpression booleanUnaryExpression);
	Activitydiagramoa__ExpressionT  expression_booleanUnaryExpression(final BooleanUnaryExpression booleanUnaryExpression);
	
	Activitydiagramoa__BooleanValueT  booleanValue(final BooleanValue booleanValue);
	Activitydiagramoa__ValueT  value_booleanValue(final BooleanValue booleanValue);
	
	Activitydiagramoa__BooleanVariableT  booleanVariable(final BooleanVariable booleanVariable);
	Activitydiagramoa__VariableT  variable_booleanVariable(final BooleanVariable booleanVariable);
	
	Activitydiagramoa__ControlFlowT  controlFlow(final ControlFlow controlFlow);
	Activitydiagramoa__ActivityEdgeT  activityEdge_controlFlow(final ControlFlow controlFlow);
	Activitydiagramoa__NamedElementT  namedElement_controlFlow(final ControlFlow controlFlow);
	
	Activitydiagramoa__DecisionNodeT  decisionNode(final DecisionNode decisionNode);
	Activitydiagramoa__NamedElementT  namedElement_decisionNode(final DecisionNode decisionNode);
	Activitydiagramoa__ActivityNodeT  activityNode_decisionNode(final DecisionNode decisionNode);
	Activitydiagramoa__ControlNodeT  controlNode_decisionNode(final DecisionNode decisionNode);
	
	Activitydiagramoa__ForkNodeT  forkNode(final ForkNode forkNode);
	Activitydiagramoa__NamedElementT  namedElement_forkNode(final ForkNode forkNode);
	Activitydiagramoa__ActivityNodeT  activityNode_forkNode(final ForkNode forkNode);
	Activitydiagramoa__ControlNodeT  controlNode_forkNode(final ForkNode forkNode);
	
	Activitydiagramoa__InitialNodeT  initialNode(final InitialNode initialNode);
	Activitydiagramoa__NamedElementT  namedElement_initialNode(final InitialNode initialNode);
	Activitydiagramoa__ActivityNodeT  activityNode_initialNode(final InitialNode initialNode);
	Activitydiagramoa__ControlNodeT  controlNode_initialNode(final InitialNode initialNode);
	
	Activitydiagramoa__IntegerCalculationExpressionT  integerCalculationExpression(final IntegerCalculationExpression integerCalculationExpression);
	Activitydiagramoa__IntegerExpressionT  integerExpression_integerCalculationExpression(final IntegerCalculationExpression integerCalculationExpression);
	Activitydiagramoa__ExpressionT  expression_integerCalculationExpression(final IntegerCalculationExpression integerCalculationExpression);
	
	Activitydiagramoa__IntegerComparisonExpressionT  integerComparisonExpression(final IntegerComparisonExpression integerComparisonExpression);
	Activitydiagramoa__IntegerExpressionT  integerExpression_integerComparisonExpression(final IntegerComparisonExpression integerComparisonExpression);
	Activitydiagramoa__ExpressionT  expression_integerComparisonExpression(final IntegerComparisonExpression integerComparisonExpression);
	
	Activitydiagramoa__IntegerValueT  integerValue(final IntegerValue integerValue);
	Activitydiagramoa__ValueT  value_integerValue(final IntegerValue integerValue);
	
	Activitydiagramoa__IntegerVariableT  integerVariable(final IntegerVariable integerVariable);
	Activitydiagramoa__VariableT  variable_integerVariable(final IntegerVariable integerVariable);
	
	Activitydiagramoa__JoinNodeT  joinNode(final JoinNode joinNode);
	Activitydiagramoa__NamedElementT  namedElement_joinNode(final JoinNode joinNode);
	Activitydiagramoa__ActivityNodeT  activityNode_joinNode(final JoinNode joinNode);
	Activitydiagramoa__ControlNodeT  controlNode_joinNode(final JoinNode joinNode);
	
	Activitydiagramoa__MergeNodeT  mergeNode(final MergeNode mergeNode);
	Activitydiagramoa__NamedElementT  namedElement_mergeNode(final MergeNode mergeNode);
	Activitydiagramoa__ActivityNodeT  activityNode_mergeNode(final MergeNode mergeNode);
	Activitydiagramoa__ControlNodeT  controlNode_mergeNode(final MergeNode mergeNode);
	
	Activitydiagramoa__OpaqueActionT  opaqueAction(final OpaqueAction opaqueAction);
	Activitydiagramoa__ActivityNodeT  activityNode_opaqueAction(final OpaqueAction opaqueAction);
	Activitydiagramoa__ExecutableNodeT  executableNode_opaqueAction(final OpaqueAction opaqueAction);
	Activitydiagramoa__NamedElementT  namedElement_opaqueAction(final OpaqueAction opaqueAction);
	Activitydiagramoa__ActionT  action_opaqueAction(final OpaqueAction opaqueAction);
	
	
	default Activitydiagramoa__BooleanValueT  $(final BooleanValue self) {
		return booleanValue(self);
	}
	default Activitydiagramoa__IntegerValueT  $(final IntegerValue self) {
		return integerValue(self);
	}
	default Activitydiagramoa__ActivityFinalNodeT  $(final ActivityFinalNode self) {
		return activityFinalNode(self);
	}
	default Activitydiagramoa__BooleanUnaryExpressionT  $(final BooleanUnaryExpression self) {
		return booleanUnaryExpression(self);
	}
	default Activitydiagramoa__BooleanBinaryExpressionT  $(final BooleanBinaryExpression self) {
		return booleanBinaryExpression(self);
	}
	default Activitydiagramoa__ControlNodeT  $(final ControlNode self) {
		if(self.getClass() == ActivityFinalNodeImpl.class) return activityFinalNode((ActivityFinalNode) self);
		if(self.getClass() == ForkNodeImpl.class) return forkNode((ForkNode) self);
		if(self.getClass() == InitialNodeImpl.class) return initialNode((InitialNode) self);
		if(self.getClass() == JoinNodeImpl.class) return joinNode((JoinNode) self);
		if(self.getClass() == MergeNodeImpl.class) return mergeNode((MergeNode) self);
		if(self.getClass() == DecisionNodeImpl.class) return decisionNode((DecisionNode) self);
		return null;
	}
	default Activitydiagramoa__OpaqueActionT  $(final OpaqueAction self) {
		return opaqueAction(self);
	}
	default Activitydiagramoa__IntegerCalculationExpressionT  $(final IntegerCalculationExpression self) {
		return integerCalculationExpression(self);
	}
	default Activitydiagramoa__IntegerVariableT  $(final IntegerVariable self) {
		return integerVariable(self);
	}
	default Activitydiagramoa__ExecutableNodeT  $(final ExecutableNode self) {
		if(self.getClass() == OpaqueActionImpl.class) return opaqueAction((OpaqueAction) self);
		return null;
	}
	default Activitydiagramoa__ActivityT  $(final Activity self) {
		return activity(self);
	}
	default Activitydiagramoa__IntegerComparisonExpressionT  $(final IntegerComparisonExpression self) {
		return integerComparisonExpression(self);
	}
	default Activitydiagramoa__ActivityEdgeT  $(final ActivityEdge self) {
		if(self.getClass() == ControlFlowImpl.class) return controlFlow((ControlFlow) self);
		return null;
	}
	default Activitydiagramoa__ControlFlowT  $(final ControlFlow self) {
		return controlFlow(self);
	}
	default Activitydiagramoa__NamedElementT  $(final NamedElement self) {
		if(self.getClass() == ActivityFinalNodeImpl.class) return activityFinalNode((ActivityFinalNode) self);
		if(self.getClass() == OpaqueActionImpl.class) return opaqueAction((OpaqueAction) self);
		if(self.getClass() == ActivityImpl.class) return activity((Activity) self);
		if(self.getClass() == ControlFlowImpl.class) return controlFlow((ControlFlow) self);
		if(self.getClass() == ForkNodeImpl.class) return forkNode((ForkNode) self);
		if(self.getClass() == InitialNodeImpl.class) return initialNode((InitialNode) self);
		if(self.getClass() == JoinNodeImpl.class) return joinNode((JoinNode) self);
		if(self.getClass() == MergeNodeImpl.class) return mergeNode((MergeNode) self);
		if(self.getClass() == DecisionNodeImpl.class) return decisionNode((DecisionNode) self);
		return null;
	}
	default Activitydiagramoa__VariableT  $(final Variable self) {
		if(self.getClass() == IntegerVariableImpl.class) return integerVariable((IntegerVariable) self);
		if(self.getClass() == BooleanVariableImpl.class) return booleanVariable((BooleanVariable) self);
		return null;
	}
	default Activitydiagramoa__ForkNodeT  $(final ForkNode self) {
		return forkNode(self);
	}
	default Activitydiagramoa__InitialNodeT  $(final InitialNode self) {
		return initialNode(self);
	}
	default Activitydiagramoa__BooleanExpressionT  $(final BooleanExpression self) {
		if(self.getClass() == BooleanUnaryExpressionImpl.class) return booleanUnaryExpression((BooleanUnaryExpression) self);
		if(self.getClass() == BooleanBinaryExpressionImpl.class) return booleanBinaryExpression((BooleanBinaryExpression) self);
		return null;
	}
	default Activitydiagramoa__ValueT  $(final Value self) {
		if(self.getClass() == BooleanValueImpl.class) return booleanValue((BooleanValue) self);
		if(self.getClass() == IntegerValueImpl.class) return integerValue((IntegerValue) self);
		return null;
	}
	default Activitydiagramoa__FinalNodeT  $(final FinalNode self) {
		if(self.getClass() == ActivityFinalNodeImpl.class) return activityFinalNode((ActivityFinalNode) self);
		return null;
	}
	default Activitydiagramoa__ActionT  $(final Action self) {
		if(self.getClass() == OpaqueActionImpl.class) return opaqueAction((OpaqueAction) self);
		return null;
	}
	default Activitydiagramoa__ExpressionT  $(final Expression self) {
		if(self.getClass() == BooleanUnaryExpressionImpl.class) return booleanUnaryExpression((BooleanUnaryExpression) self);
		if(self.getClass() == BooleanBinaryExpressionImpl.class) return booleanBinaryExpression((BooleanBinaryExpression) self);
		if(self.getClass() == IntegerCalculationExpressionImpl.class) return integerCalculationExpression((IntegerCalculationExpression) self);
		if(self.getClass() == IntegerComparisonExpressionImpl.class) return integerComparisonExpression((IntegerComparisonExpression) self);
		return null;
	}
	default Activitydiagramoa__JoinNodeT  $(final JoinNode self) {
		return joinNode(self);
	}
	default Activitydiagramoa__ActivityNodeT  $(final ActivityNode self) {
		if(self.getClass() == ActivityFinalNodeImpl.class) return activityFinalNode((ActivityFinalNode) self);
		if(self.getClass() == OpaqueActionImpl.class) return opaqueAction((OpaqueAction) self);
		if(self.getClass() == ForkNodeImpl.class) return forkNode((ForkNode) self);
		if(self.getClass() == InitialNodeImpl.class) return initialNode((InitialNode) self);
		if(self.getClass() == JoinNodeImpl.class) return joinNode((JoinNode) self);
		if(self.getClass() == MergeNodeImpl.class) return mergeNode((MergeNode) self);
		if(self.getClass() == DecisionNodeImpl.class) return decisionNode((DecisionNode) self);
		return null;
	}
	default Activitydiagramoa__MergeNodeT  $(final MergeNode self) {
		return mergeNode(self);
	}
	default Activitydiagramoa__IntegerExpressionT  $(final IntegerExpression self) {
		if(self.getClass() == IntegerCalculationExpressionImpl.class) return integerCalculationExpression((IntegerCalculationExpression) self);
		if(self.getClass() == IntegerComparisonExpressionImpl.class) return integerComparisonExpression((IntegerComparisonExpression) self);
		return null;
	}
	default Activitydiagramoa__BooleanVariableT  $(final BooleanVariable self) {
		return booleanVariable(self);
	}
	default Activitydiagramoa__DecisionNodeT  $(final DecisionNode self) {
		return decisionNode(self);
	}
	
}
