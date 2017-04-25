package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.monolithic.algebra.impl.MonolithicRevisitorImpl;

import activitydiagram.ActivityEdge;

public class ActivitydiagramtMergeNodeOperation extends ActivitydiagramControlNodeOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultMergeNodeOperation {

	private final activitydiagram.MergeNode mergeNode;
	private MonolithicRevisitorImpl alg;

	public ActivitydiagramtMergeNodeOperation(final activitydiagram.MergeNode self, MonolithicRevisitorImpl algebra) {
		super(self, algebra);
		this.mergeNode = self;
		this.alg = algebra;
	}

	@Override
	public boolean hasOffers() {
		for (final ActivityEdge edge : this.mergeNode.getIncoming()) {
			if (this.alg.$(edge).hasOffer()) {
				return true;
			}
		}
		return false;
	}

}
