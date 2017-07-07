package modularactivitydiagram.revisitor.operation;

public interface ModularactivitydiagramActivityEdge_AspectOperation
extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityEdgeOperation 
{
	Boolean isControlFlow();
	adwithoutruntime.ControlFlow asControlFlow();
	void sendOffer(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	org.eclipse.emf.common.util.EList<adruntime.Token> takeOfferedTokens();
	Boolean hasOffer();
}