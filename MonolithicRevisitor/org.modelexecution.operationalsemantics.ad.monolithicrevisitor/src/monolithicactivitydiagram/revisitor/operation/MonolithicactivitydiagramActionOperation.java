package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramActionOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramExecutableNodeOperation 
{
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	void doAction();
	void sendOffers();
	Boolean isReady();
}