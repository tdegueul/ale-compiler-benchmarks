package activitydiagram.activitydiagram.algebra.operation;

public interface ActivitydiagramActivitydiagramActivityEdge_AspectOperation extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityEdgeOperation {
	org.eclipse.emf.common.util.EList<activitydiagram.Offer> getOffers();
	void sendOffer(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	org.eclipse.emf.common.util.EList<activitydiagram.Token> takeOfferedTokens();
	Boolean hasOffer();
}