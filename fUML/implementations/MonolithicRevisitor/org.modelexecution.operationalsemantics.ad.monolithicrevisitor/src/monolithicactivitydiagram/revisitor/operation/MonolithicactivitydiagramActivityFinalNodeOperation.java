package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramActivityFinalNodeOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramFinalNodeOperation 
{
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
}