package monolithicactivitydiagram.revisitor.operations;

public interface ActivityEdgeOperation extends monolithicactivitydiagram.revisitor.operations.NamedElementOperation {
	Boolean isControlFlow();
	activitydiagram.ControlFlow asControlFlow();
	void sendOffer(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	org.eclipse.emf.common.util.EList<activitydiagram.Token> takeOfferedTokens();
	Boolean hasOffer();
}
