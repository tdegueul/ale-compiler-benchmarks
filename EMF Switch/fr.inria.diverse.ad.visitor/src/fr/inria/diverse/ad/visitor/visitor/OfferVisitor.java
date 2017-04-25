package fr.inria.diverse.ad.visitor.visitor;

import activitydiagram.Offer;
import activitydiagram.util.ActivitydiagramSwitch;
import fr.inria.diverse.ad.visitor.impl.operation.executable.offer.OfferOfferOperationImpl;
import fr.inria.diverse.ad.visitor.operation.OfferOperation;

public class OfferVisitor extends ActivitydiagramSwitch<OfferOperation> {
	
	private OfferVisitor() {}
	
	public final static OfferVisitor INSTANCE = new OfferVisitor();

	@Override
	public OfferOperation caseOffer(Offer object) {
		return new OfferOfferOperationImpl(object);
	}

}
