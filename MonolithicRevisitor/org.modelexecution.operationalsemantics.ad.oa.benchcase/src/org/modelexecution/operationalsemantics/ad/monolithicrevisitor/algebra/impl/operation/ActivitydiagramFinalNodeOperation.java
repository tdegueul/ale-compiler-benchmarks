package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.oabenchcase.algebra.impl.MonolithicRevisitorImpl;

public abstract class ActivitydiagramFinalNodeOperation extends ActivitydiagramControlNodeOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultFinalNodeOperation {

	private final activitydiagram.FinalNode self;

	public ActivitydiagramFinalNodeOperation(final activitydiagram.FinalNode self, MonolithicRevisitorImpl algebra) {
		super(self, algebra);
		this.self = self;
	}

}
