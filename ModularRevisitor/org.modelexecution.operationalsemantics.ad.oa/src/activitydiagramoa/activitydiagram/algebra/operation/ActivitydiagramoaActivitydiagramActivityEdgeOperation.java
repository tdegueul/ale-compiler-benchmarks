package activitydiagramoa.activitydiagram.algebra.operation;

public interface ActivitydiagramoaActivitydiagramActivityEdgeOperation extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultNamedElementOperation {
	org.eclipse.emf.common.util.EList<activitydiagram.Offer> getOffers();
	void sendOffer(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	org.eclipse.emf.common.util.EList<activitydiagram.Token> takeOfferedTokens();
	Boolean hasOffer();
}