package printingfsm.revisitor.operation.impl;

public class PrintingfsmStateOperationImpl implements printingfsm.revisitor.operation.PrintingfsmStateOperation
{
	
	private final fsm.State self;
	private final printingfsm.revisitor.PrintingfsmRevisitor<? extends printingfsm.revisitor.operation.PrintingfsmFinalStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmMachineOperation, ? extends printingfsm.revisitor.operation.PrintingfsmStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmTransitionOperation> alg;
	
	
	public PrintingfsmStateOperationImpl(fsm.State self, printingfsm.revisitor.PrintingfsmRevisitor<? extends printingfsm.revisitor.operation.PrintingfsmFinalStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmMachineOperation, ? extends printingfsm.revisitor.operation.PrintingfsmStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmTransitionOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public String print() {
		return self.getName();
	}
}