package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import java.util.ArrayList;
import java.util.List;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.oabenchcase.algebra.impl.MonolithicRevisitorImpl;

import activitydiagram.Token;

public class ActivitydiagramtOfferOperationImpl
		implements org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultOfferOperation {

	private final activitydiagram.Offer offer;
	private MonolithicRevisitorImpl alg;

	public ActivitydiagramtOfferOperationImpl(final activitydiagram.Offer self, MonolithicRevisitorImpl algebra) {
		this.offer = self;
		this.alg = algebra;
	}

	@Override
	public boolean hasTokens() {
		this.removeWithdrawnTokens();
		return this.offer.getOfferedTokens().size() > 0;
	}

	private void removeWithdrawnTokens() {
		final List<Token> tokensToBeRemoved = new ArrayList<Token>();
		for (final Token token : this.offer.getOfferedTokens()) {
			if (this.alg.$(token).isWithdrawn()) {
				tokensToBeRemoved.add(token);
			}
		}
		this.offer.getOfferedTokens().removeAll(tokensToBeRemoved);
	}

}
