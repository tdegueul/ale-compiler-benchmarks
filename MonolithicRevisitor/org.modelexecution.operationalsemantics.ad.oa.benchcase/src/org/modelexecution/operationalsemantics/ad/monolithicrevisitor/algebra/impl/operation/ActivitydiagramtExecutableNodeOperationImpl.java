package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.oabenchcase.algebra.impl.MonolithicRevisitorImpl;

public abstract class ActivitydiagramtExecutableNodeOperationImpl extends ActivitydiagramActivityNodeOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultExecutableNodeOperation {

	private final activitydiagram.ExecutableNode self;
	private MonolithicRevisitorImpl alg;

	public ActivitydiagramtExecutableNodeOperationImpl(final activitydiagram.ExecutableNode self,
			MonolithicRevisitorImpl algebra) {
		super(self, algebra);
		this.self = self;
		this.alg = algebra;
	}

}
