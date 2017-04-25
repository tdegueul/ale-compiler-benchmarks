package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

public class ActivitydiagramBooleanBinaryExpressionOperationImpl extends ActivitydiagramBooleanExpressionOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultBooleanBinaryExpressionOperation {

	private final activitydiagram.BooleanBinaryExpression booleanBinaryExpression;

	public ActivitydiagramBooleanBinaryExpressionOperationImpl(final activitydiagram.BooleanBinaryExpression self,
			Object algebra) {
		super(self, algebra);
		this.booleanBinaryExpression = self;
	}

	@Override
	public void execute() {
		final boolean operandValue1 = this.getCurrentValue(this.booleanBinaryExpression.getOperand1());
		final boolean operandValue2 = this.getCurrentValue(this.booleanBinaryExpression.getOperand2());

		Boolean result = null;
		switch (this.booleanBinaryExpression.getOperator()) {
		case AND:
			result = operandValue1 && operandValue2;
			break;
		case OR:
			result = operandValue1 || operandValue2;
			break;
		}
		this.assignValue(result);

	}

}
