package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramInitialNodeOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNodeOperation 
{
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	Boolean isReady();
	Boolean isInitialNode();
	activitydiagram.InitialNode asInitialNode();
}