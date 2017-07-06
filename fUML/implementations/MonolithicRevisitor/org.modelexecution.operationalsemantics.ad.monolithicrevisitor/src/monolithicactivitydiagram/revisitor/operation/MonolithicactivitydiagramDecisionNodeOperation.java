package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramDecisionNodeOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNodeOperation 
{
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	Boolean isReady();
}