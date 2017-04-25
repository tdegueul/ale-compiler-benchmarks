package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

public abstract class ActivitydiagramExpressionOperation
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultExpressionOperation {

	private final activitydiagram.Expression self;

	public ActivitydiagramExpressionOperation(final activitydiagram.Expression self, Object algebra) {
		this.self = self;
	}

}
