package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.IntegerValue;

public class ActivitydiagramIntegerCalculationExpressionOperationImpl
extends ActivitydiagramIntegerExpressionOperationImpl
implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultIntegerCalculationExpressionOperation {


	private final activitydiagram.IntegerCalculationExpression integerCalculationExpression;

	public ActivitydiagramIntegerCalculationExpressionOperationImpl(final activitydiagram.IntegerCalculationExpression self, Object algebra) {
		super(self, algebra);
		this.integerCalculationExpression = self;
	}

	@Override
	public void execute() {
		final Integer operandValue1 = this.getCurrentValue(this.integerCalculationExpression.getOperand1());
		final Integer operandValue2 = this.getCurrentValue(this.integerCalculationExpression.getOperand2());

		Integer result = null;
		switch (this.integerCalculationExpression.getOperator()) {
		case ADD:
			result = operandValue1 + operandValue2;
			break;
		case SUBRACT:
			result = operandValue1 - operandValue2;
			break;
		}
		final IntegerValue resultValue = ActivitydiagramFactory.eINSTANCE.createIntegerValue();
		resultValue.setValue(result);
		this.integerCalculationExpression.getAssignee().setCurrentValue(resultValue);

	}




}
