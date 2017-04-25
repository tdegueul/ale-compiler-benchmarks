package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.BooleanValue;

public class ActivitydiagramIntegerComparisonExpressionOperationImpl extends ActivitydiagramIntegerExpressionOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultIntegerComparisonExpressionOperation {

	private final activitydiagram.IntegerComparisonExpression integerComparisonExpression;

	public ActivitydiagramIntegerComparisonExpressionOperationImpl(
			final activitydiagram.IntegerComparisonExpression self, Object algebra) {
		super(self, algebra);
		this.integerComparisonExpression = self;
	}

	@Override
	public void execute() {
		final int operandValue1 = this.getCurrentValue(this.integerComparisonExpression.getOperand1());
		final int operandValue2 = this.getCurrentValue(this.integerComparisonExpression.getOperand2());

		Boolean result = null;
		switch (this.integerComparisonExpression.getOperator()) {
		case EQUALS:
			result = operandValue1 == operandValue2;
			break;
		case GREATER:
			result = operandValue1 > operandValue2;
			break;
		case GREATER_EQUALS:
			result = operandValue1 >= operandValue2;
			break;
		case SMALLER:
			result = operandValue1 < operandValue2;
			break;
		case SMALLER_EQUALS:
			result = operandValue1 <= operandValue2;
			break;
		}
		final BooleanValue resultValue = ActivitydiagramFactory.eINSTANCE.createBooleanValue();
		resultValue.setValue(result);
		this.integerComparisonExpression.getAssignee().setCurrentValue(resultValue);
	}

}
