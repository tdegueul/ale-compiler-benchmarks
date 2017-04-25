package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.monolithic.algebra.impl.MonolithicRevisitorImpl;

import activitydiagram.ActivityEdge;

public class ActivitydiagramJoinNodeOperationImpl extends ActivitydiagramControlNodeOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultJoinNodeOperation {

	private final activitydiagram.JoinNode joinNode;
	private MonolithicRevisitorImpl alg;

	public ActivitydiagramJoinNodeOperationImpl(final activitydiagram.JoinNode self, MonolithicRevisitorImpl algebra) {
		super(self, algebra);
		this.joinNode = self;
		this.alg = algebra;
	}

	@Override
	public boolean isReady() {
		boolean ready = true;
		for (final ActivityEdge edge : this.joinNode.getIncoming()) {
			if (!this.alg.$(edge).hasOffer()) {
				ready = false;
			}
		}
		return ready;

	}

}
