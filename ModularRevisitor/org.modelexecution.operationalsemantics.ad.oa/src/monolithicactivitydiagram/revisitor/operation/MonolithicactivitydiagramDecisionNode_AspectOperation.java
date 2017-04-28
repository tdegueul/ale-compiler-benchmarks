package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramDecisionNode_AspectOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramDecisionNodeOperation, monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNode_AspectOperation 
{
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	Boolean isReady();
}