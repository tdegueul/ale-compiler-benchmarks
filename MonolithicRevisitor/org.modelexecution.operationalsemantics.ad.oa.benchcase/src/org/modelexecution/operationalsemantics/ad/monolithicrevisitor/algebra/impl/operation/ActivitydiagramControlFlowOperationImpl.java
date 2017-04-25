package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.oabenchcase.algebra.impl.MonolithicRevisitorImpl;

public class ActivitydiagramControlFlowOperationImpl extends ActivitydiagramActivityEdgeOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultControlFlowOperation {

	private final activitydiagram.ControlFlow self;

	public ActivitydiagramControlFlowOperationImpl(final activitydiagram.ControlFlow self,
			MonolithicRevisitorImpl algebra) {
		super(self, algebra);
		this.self = self;
	}

}
