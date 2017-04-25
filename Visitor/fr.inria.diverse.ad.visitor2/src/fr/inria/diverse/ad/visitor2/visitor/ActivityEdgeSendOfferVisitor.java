package fr.inria.diverse.ad.visitor2.visitor;

import java.util.List;

import org.springframework.stereotype.Service;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.ControlFlow;
import activitydiagram.Offer;
import activitydiagram.Token;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

@Service
public class ActivityEdgeSendOfferVisitor extends ActivityDiagramVisitorDefault<Void> {

	private ActivityEdgeSendOfferVisitor() {
		
	}
	
	
	public final static ActivityEdgeSendOfferVisitor INSTANCE = new ActivityEdgeSendOfferVisitor();
	
	@Override
	public Void visitControlFlow(ControlFlow controlFlow, Object ctx) {
		final Offer offer = ActivitydiagramFactory.eINSTANCE.createOffer();
		List<Token> tokens = (List<Token> ) ctx;
		for (final Token token :  tokens) {
			offer.getOfferedTokens().add(token);
		}
		controlFlow.getOffers().add(offer);

		return null;
	}

}
