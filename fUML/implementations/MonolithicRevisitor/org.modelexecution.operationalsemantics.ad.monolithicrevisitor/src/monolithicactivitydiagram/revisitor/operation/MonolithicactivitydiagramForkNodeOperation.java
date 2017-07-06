package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramForkNodeOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNodeOperation 
{
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
}