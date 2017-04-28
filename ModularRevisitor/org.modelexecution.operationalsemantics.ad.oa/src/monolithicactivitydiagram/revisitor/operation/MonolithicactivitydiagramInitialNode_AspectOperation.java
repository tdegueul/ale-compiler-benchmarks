package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramInitialNode_AspectOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramInitialNodeOperation, monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramControlNode_AspectOperation 
{
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	Boolean isReady();
	Boolean isInitialNode();
	activitydiagram.InitialNode asInitialNode();
}