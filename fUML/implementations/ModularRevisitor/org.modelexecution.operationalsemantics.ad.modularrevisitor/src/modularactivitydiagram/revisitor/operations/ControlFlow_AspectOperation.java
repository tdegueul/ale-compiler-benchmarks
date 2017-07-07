package modularactivitydiagram.revisitor.operations;

public interface ControlFlow_AspectOperation extends modularactivitydiagram.revisitor.operations.ActivityEdge_AspectOperation, modularactivitydiagram.revisitor.operations.ControlFlowOperation {
	Boolean isControlFlow();
	adwithoutruntime.ControlFlow asControlFlow();
}
