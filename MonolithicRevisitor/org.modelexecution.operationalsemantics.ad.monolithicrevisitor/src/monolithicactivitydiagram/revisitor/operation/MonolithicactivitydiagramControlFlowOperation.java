package monolithicactivitydiagram.revisitor.operation;

public interface MonolithicactivitydiagramControlFlowOperation
extends monolithicactivitydiagram.revisitor.operation.MonolithicactivitydiagramActivityEdgeOperation 
{
	Boolean isControlFlow();
	activitydiagram.ControlFlow asControlFlow();
}