package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.oabenchcase.algebra.impl.MonolithicRevisitorImpl;

import activitydiagram.ActivityNode;
import activitydiagram.Token;

public class ActivitydiagramTokenOperation
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultTokenOperation {

	private final activitydiagram.Token token;
	private MonolithicRevisitorImpl alg;

	public ActivitydiagramTokenOperation(final activitydiagram.Token self, MonolithicRevisitorImpl algebra) {
		this.token = self;
		this.alg = algebra;
	}

	@Override
	public void withdraw() {
		if (!this.isWithdrawn()) {
			this.alg.$(this.token.getHolder()).removeToken(this.token);
			this.token.setHolder(null);
		}

	}

	@Override
	public boolean isWithdrawn() {
		return this.token.getHolder() == null;
	}

	@Override
	public Token transfer(final ActivityNode holder) {
		if (this.token.getHolder() != null) {
			this.withdraw();
		}
		this.token.setHolder(holder);
		return this.token;
	}

}
