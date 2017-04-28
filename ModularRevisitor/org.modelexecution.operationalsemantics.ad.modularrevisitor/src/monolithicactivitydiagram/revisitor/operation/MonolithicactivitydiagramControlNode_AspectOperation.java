package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramControlNode_AspectOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNodeOperation, monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityNode_AspectOperation 
{
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	Boolean isReady();
}