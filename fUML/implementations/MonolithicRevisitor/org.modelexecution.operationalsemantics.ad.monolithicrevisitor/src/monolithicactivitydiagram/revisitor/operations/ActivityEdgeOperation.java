package monolithicactivitydiagram.revisitor.operations;

public interface ActivityEdgeOperation extends monolithicactivitydiagram.revisitor.operations.NamedElementOperation {
	void sendOffer(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	org.eclipse.emf.common.util.EList<activitydiagram.Token> takeOfferedTokens();
	Boolean hasOffer();
}
