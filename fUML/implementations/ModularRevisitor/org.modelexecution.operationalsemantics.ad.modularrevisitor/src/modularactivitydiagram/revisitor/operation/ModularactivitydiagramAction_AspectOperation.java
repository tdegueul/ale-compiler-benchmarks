package modularactivitydiagram.revisitor.operation;

public interface ModularactivitydiagramAction_AspectOperation
extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActionOperation, modularactivitydiagram.revisitor.operation.ModularactivitydiagramExecutableNode_AspectOperation 
{
	void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens);
	void doAction();
	void sendOffers();
	Boolean isReady();
}