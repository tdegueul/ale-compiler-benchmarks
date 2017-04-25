package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import java.util.List;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.oabenchcase.algebra.impl.MonolithicRevisitorImpl;

import activitydiagram.Token;

public class ActivitydiagramActivityFinalNodeOperationImpl extends ActivitydiagramFinalNodeOperation
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultActivityFinalNodeOperation {

	private final activitydiagram.ActivityFinalNode activityFinalNode;
	private MonolithicRevisitorImpl alg;

	public ActivitydiagramActivityFinalNodeOperationImpl(final activitydiagram.ActivityFinalNode self,
			MonolithicRevisitorImpl algebra) {
		super(self, algebra);
		this.activityFinalNode = self;
		this.alg = algebra;
	}

	@Override
	public void fire(final List<Token> tokens) {
		this.alg.$(this.activityFinalNode.getActivity()).terminate();

	}

}
