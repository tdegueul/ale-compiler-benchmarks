package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.oabenchcase.algebra.impl.MonolithicRevisitorImpl;

public class ActivitydiagramControlTokenOperationImpl extends ActivitydiagramTokenOperation
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultControlTokenOperation {

	private final activitydiagram.ControlToken self;

	public ActivitydiagramControlTokenOperationImpl(final activitydiagram.ControlToken self,
			MonolithicRevisitorImpl algebra) {
		super(self, algebra);
		this.self = self;
	}

}
