package monolithicactivitydiagram.revisitor.operations;

public interface ControlFlowOperation extends monolithicactivitydiagram.revisitor.operations.ActivityEdgeOperation {
	Boolean isControlFlow();
	activitydiagram.ControlFlow asControlFlow();
}
