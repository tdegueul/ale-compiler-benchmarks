package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramActivityEdge_AspectOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdgeOperation 
{
	Boolean isControlFlow();
	activitydiagram.ControlFlow asControlFlow();
	void sendOffer(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	org.eclipse.emf.common.util.EList<adruntime.Token> takeOfferedTokens();
	Boolean hasOffer();
}