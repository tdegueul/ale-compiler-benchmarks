package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import java.util.List;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.oabenchcase.algebra.impl.MonolithicRevisitorImpl;

import activitydiagram.Token;

public class ActivitydiagramControlNodeOperationImpl extends ActivitydiagramActivityNodeOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultControlNodeOperation {

	private final activitydiagram.ControlNode self;

	public ActivitydiagramControlNodeOperationImpl(final activitydiagram.ControlNode self,
			MonolithicRevisitorImpl algebra) {
		super(self, algebra);
		this.self = self;
	}

	@Override
	public void fire(List<Token> tokens) {
		this.addTokens(tokens);
		this.sendOffers(tokens);

	}

	@Override
	public boolean isReady() {
		return super.isReady() && this.hasOffers();
	}

}
