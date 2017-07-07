package modularactivitydiagram.revisitor.operations;

public interface ControlNode_AspectOperation extends modularactivitydiagram.revisitor.operations.ActivityNode_AspectOperation, modularactivitydiagram.revisitor.operations.ControlNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	Boolean isReady();
}
