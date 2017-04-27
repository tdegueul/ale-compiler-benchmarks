package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramActivityEdgeOperation
extends common.revisitor.operation.CommonNamedElementOperation 
{
	Boolean isControlFlow();
	activitydiagram.ControlFlow asControlFlow();
	void sendOffer(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	org.eclipse.emf.common.util.EList<activitydiagram.Token> takeOfferedTokens();
	Boolean hasOffer();
}