package modularactivitydiagram.revisitor.operation;

public interface ModularactivitydiagramControlNode_AspectOperation
extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlNodeOperation, modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityNode_AspectOperation 
{
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	Boolean isReady();
}