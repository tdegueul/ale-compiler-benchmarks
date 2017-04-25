package org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.impl.operation;

import java.util.ArrayList;
import java.util.List;

import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.algebra.operation.Activitydiagram$defaultActivityEdgeOperation;
import org.modelexecution.operationalsemantics.ad.monolithicrevisitor.oabenchcase.algebra.impl.MonolithicRevisitorImpl;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.Offer;
import activitydiagram.Token;

public class ActivitydiagramActivityEdgeOperationImpl implements Activitydiagram$defaultActivityEdgeOperation {

	private final activitydiagram.ActivityEdge activityEdge;
	private MonolithicRevisitorImpl alg;

	public ActivitydiagramActivityEdgeOperationImpl(final activitydiagram.ActivityEdge self,
			MonolithicRevisitorImpl algebra) {
		this.activityEdge = self;
		this.alg = algebra;

	}

	@Override
	public void sendOffer(final List<Token> tokens) {
		final Offer offer = ActivitydiagramFactory.eINSTANCE.createOffer();
		for (final Token token : tokens) {
			offer.getOfferedTokens().add(token);
		}
		this.activityEdge.getOffers().add(offer);
	}

	@Override
	public List<Token> takeOfferedTokens() {
		final List<Token> tokens = new ArrayList<Token>();

		for (final Offer o : this.activityEdge.getOffers()) {
			tokens.addAll(o.getOfferedTokens());
		}
		this.activityEdge.getOffers().clear();

		return tokens;
	}

	@Override
	public boolean hasOffer() {
		for (final Offer o : this.activityEdge.getOffers()) {
			if (this.alg.$(o).hasTokens()) {
				return true;
			}
		}
		return false;
	}

}
