package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.oabenchcase.algebra.impl.MonolithicRevisitorImpl;

import activitydiagram.Expression;

public class ActivitydiagramOpaqueActionOperationImpl extends ActivitydiagramActionOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultOpaqueActionOperation {

	private final activitydiagram.OpaqueAction opaqueAction;
	private MonolithicRevisitorImpl alg;

	public ActivitydiagramOpaqueActionOperationImpl(final activitydiagram.OpaqueAction self,
			MonolithicRevisitorImpl algebra) {
		super(self, algebra);
		this.opaqueAction = self;
		this.alg = algebra;
	}

	@Override
	public void doAction() {
		for (final Expression e : this.opaqueAction.getExpressions()) {
			this.alg.$(e).execute();
		}

	}

}
