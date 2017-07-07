package modularactivitydiagram.revisitor.operation;

public interface ModularactivitydiagramInitialNode_AspectOperation
extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramInitialNodeOperation, modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlNode_AspectOperation 
{
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	Boolean isReady();
	Boolean isInitialNode();
	adwithoutruntime.InitialNode asInitialNode();
}