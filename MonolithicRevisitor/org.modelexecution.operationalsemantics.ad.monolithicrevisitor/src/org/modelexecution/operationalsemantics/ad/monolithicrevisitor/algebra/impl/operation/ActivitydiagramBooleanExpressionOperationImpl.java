package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.Value;

public abstract class ActivitydiagramBooleanExpressionOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultBooleanExpressionOperation {

	private final activitydiagram.BooleanExpression booleanExpression;

	public ActivitydiagramBooleanExpressionOperationImpl(final activitydiagram.BooleanExpression self, Object algebra) {
		this.booleanExpression = self;
	}

	protected void assignValue(final Boolean value) {
		final BooleanValue resultValue = ActivitydiagramFactory.eINSTANCE.createBooleanValue();
		resultValue.setValue(value);
		BooleanVariable assignee = this.booleanExpression.getAssignee();
		assignee.setCurrentValue(resultValue);
	}

	protected boolean getCurrentValue(final BooleanVariable variable) {
		Boolean currentValue = null;
		final Value value = variable.getCurrentValue();
		if (value instanceof BooleanValue) {
			final BooleanValue booleanValue = (BooleanValue) value;
			currentValue = booleanValue.isValue();
		}
		return currentValue;
	}

}
