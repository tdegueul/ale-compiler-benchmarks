package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import java.util.ArrayList;
import java.util.List;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.oabenchcase.algebra.impl.MonolithicRevisitorImpl;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.ForkedToken;
import activitydiagram.Token;

public class ActivitydiagramForkNodeOperationImpl extends ActivitydiagramControlNodeOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultForkNodeOperation {

	private final activitydiagram.ForkNode forkNode;

	public ActivitydiagramForkNodeOperationImpl(final activitydiagram.ForkNode self, MonolithicRevisitorImpl algebra) {
		super(self, algebra);
		this.forkNode = self;
	}

	@Override
	public void fire(final List<Token> tokens) {
		final List<Token> forkedTokens = new ArrayList<Token>();
		for (final Token token : tokens) {
			final ForkedToken forkedToken = ActivitydiagramFactory.eINSTANCE.createForkedToken();
			forkedToken.setBaseToken(token);
			forkedToken.setRemainingOffersCount(this.forkNode.getOutgoing().size());
			forkedTokens.add(forkedToken);
		}
		this.addTokens(forkedTokens);
		this.sendOffers(forkedTokens);

	}

}
