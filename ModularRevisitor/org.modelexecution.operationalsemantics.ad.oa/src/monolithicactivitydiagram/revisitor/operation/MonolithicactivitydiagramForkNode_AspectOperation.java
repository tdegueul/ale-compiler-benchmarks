package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramForkNode_AspectOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramForkNodeOperation, monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNode_AspectOperation 
{
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
}