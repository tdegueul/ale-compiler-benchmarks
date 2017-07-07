package modularactivitydiagram.revisitor.operation;

public interface ModularactivitydiagramDecisionNode_AspectOperation
extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramDecisionNodeOperation, modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlNode_AspectOperation 
{
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	Boolean isReady();
}