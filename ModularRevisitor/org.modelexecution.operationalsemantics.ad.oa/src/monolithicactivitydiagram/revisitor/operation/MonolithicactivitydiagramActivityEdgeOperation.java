package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramActivityEdgeOperation
extends common.revisitor.operation.CommonNamedElementOperation 
{
	void sendOffer(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	org.eclipse.emf.common.util.EList<adruntime.Token> takeOfferedTokens();
	Boolean hasOffer();
	Boolean isControlFlow();
	activitydiagram.ControlFlow asControlFlow();
}