package activitydiagram.activitydiagram.algebra.operation;

public interface ActivitydiagramActivitydiagramOfferOperation  {
	org.eclipse.emf.common.util.EList<activitydiagram.Token> getOfferedTokens();
	Boolean hasTokens();
	void removeWithdrawnTokens();
}