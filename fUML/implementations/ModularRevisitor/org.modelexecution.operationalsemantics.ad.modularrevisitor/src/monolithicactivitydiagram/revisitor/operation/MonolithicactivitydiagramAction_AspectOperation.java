package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramAction_AspectOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActionOperation, monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNode_AspectOperation 
{
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	void doAction();
	void sendOffers();
	Boolean isReady();
}