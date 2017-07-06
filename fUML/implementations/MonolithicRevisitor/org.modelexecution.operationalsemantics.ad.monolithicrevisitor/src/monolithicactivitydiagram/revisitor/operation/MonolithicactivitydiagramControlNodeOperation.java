package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramControlNodeOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNodeOperation 
{
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	Boolean isReady();
}