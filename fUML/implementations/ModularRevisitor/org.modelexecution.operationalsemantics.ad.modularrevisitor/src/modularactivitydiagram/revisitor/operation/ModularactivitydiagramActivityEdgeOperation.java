package modularactivitydiagram.revisitor.operation;

public interface ModularactivitydiagramActivityEdgeOperation
extends common.revisitor.operation.CommonNamedElementOperation 
{
	void sendOffer(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	org.eclipse.emf.common.util.EList<adruntime.Token> takeOfferedTokens();
	Boolean hasOffer();
	Boolean isControlFlow();
	adwithoutruntime.ControlFlow asControlFlow();
}