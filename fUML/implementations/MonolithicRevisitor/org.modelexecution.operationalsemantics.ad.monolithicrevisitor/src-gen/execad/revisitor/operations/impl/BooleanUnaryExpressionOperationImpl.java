package execad.revisitor.operations.impl;

import activitydiagram.BooleanUnaryExpression;
import activitydiagram.BooleanUnaryOperator;
import activitydiagram.revisitor.ActivitydiagramRevisitor;
import execad.revisitor.operations.ActionOperation;
import execad.revisitor.operations.ActivityEdgeOperation;
import execad.revisitor.operations.ActivityFinalNodeOperation;
import execad.revisitor.operations.ActivityNodeOperation;
import execad.revisitor.operations.ActivityOperation;
import execad.revisitor.operations.BooleanBinaryExpressionOperation;
import execad.revisitor.operations.BooleanExpressionOperation;
import execad.revisitor.operations.BooleanUnaryExpressionOperation;
import execad.revisitor.operations.BooleanVariableOperation;
import execad.revisitor.operations.DecisionNodeOperation;
import execad.revisitor.operations.ExpressionOperation;
import execad.revisitor.operations.ForkNodeOperation;
import execad.revisitor.operations.InitialNodeOperation;
import execad.revisitor.operations.IntegerCalculationExpressionOperation;
import execad.revisitor.operations.IntegerComparisonExpressionOperation;
import execad.revisitor.operations.IntegerExpressionOperation;
import execad.revisitor.operations.IntegerVariableOperation;
import execad.revisitor.operations.JoinNodeOperation;
import execad.revisitor.operations.MergeNodeOperation;
import execad.revisitor.operations.OfferOperation;
import execad.revisitor.operations.OpaqueActionOperation;
import execad.revisitor.operations.TokenOperation;
import execad.revisitor.operations.VariableOperation;
import execad.revisitor.operations.impl.BooleanExpressionOperationImpl;

@SuppressWarnings("all")
public class BooleanUnaryExpressionOperationImpl extends BooleanExpressionOperationImpl implements BooleanUnaryExpressionOperation {
  private BooleanUnaryExpression obj;
  
  private ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ActivityNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ActivityNodeOperation, ForkNodeOperation, TokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> alg;
  
  public BooleanUnaryExpressionOperationImpl(final BooleanUnaryExpression obj, final ActivitydiagramRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, Object, BooleanVariableOperation, ActivityEdgeOperation, ActivityNodeOperation, TokenOperation, DecisionNodeOperation, ActivityNodeOperation, ExpressionOperation, ActivityNodeOperation, ForkNodeOperation, TokenOperation, InitialNodeOperation, Object, Object, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, Object, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, Object, OfferOperation, OpaqueActionOperation, TokenOperation, Object, Object, VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void execute() {
    final boolean opValue = this.getCurrentValue(this.obj.getOperand());
    BooleanUnaryOperator _operator = this.obj.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case NOT:
          this.assignValue((!opValue));
          break;
        default:
          break;
      }
    }
  }
}
