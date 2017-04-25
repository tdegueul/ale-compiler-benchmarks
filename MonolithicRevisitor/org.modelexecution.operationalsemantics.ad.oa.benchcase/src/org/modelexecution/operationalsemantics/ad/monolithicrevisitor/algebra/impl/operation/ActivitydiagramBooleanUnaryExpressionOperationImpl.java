package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

public class ActivitydiagramBooleanUnaryExpressionOperationImpl extends ActivitydiagramBooleanExpressionOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultBooleanUnaryExpressionOperation {

	private final activitydiagram.BooleanUnaryExpression booleanUnaryExpression;

	public ActivitydiagramBooleanUnaryExpressionOperationImpl(final activitydiagram.BooleanUnaryExpression self,
			Object algebra) {
		super(self, algebra);
		this.booleanUnaryExpression = self;
	}

	@Override
	public void execute() {
		final boolean operandValue = this.getCurrentValue(this.booleanUnaryExpression.getOperand());

		Boolean result = null;
		switch (this.booleanUnaryExpression.getOperator()) {
		case NOT:
			result = !operandValue;
			break;
		}
		this.assignValue(result);
	}

}
