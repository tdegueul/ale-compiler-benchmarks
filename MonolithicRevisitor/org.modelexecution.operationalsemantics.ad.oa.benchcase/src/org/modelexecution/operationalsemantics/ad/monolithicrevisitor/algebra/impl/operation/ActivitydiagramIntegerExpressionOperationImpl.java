package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import activitydiagram.IntegerValue;
import activitydiagram.Value;
import activitydiagram.Variable;

public abstract class ActivitydiagramIntegerExpressionOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultIntegerExpressionOperation {

	private final activitydiagram.IntegerExpression self;

	public ActivitydiagramIntegerExpressionOperationImpl(final activitydiagram.IntegerExpression self, Object algebra) {
		this.self = self;
	}
	
	protected Integer getCurrentValue(final Variable variable) {
		Integer currentValue = null;
		final Value value = variable.getCurrentValue();
		if (value instanceof IntegerValue) {
			final IntegerValue integerValue = (IntegerValue) value;
			currentValue = integerValue.getValue();
		}
		return currentValue;
	}

}
