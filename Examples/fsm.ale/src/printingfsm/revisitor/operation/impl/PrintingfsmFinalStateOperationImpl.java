package printingfsm.revisitor.operation.impl;

public class PrintingfsmFinalStateOperationImpl implements printingfsm.revisitor.operation.PrintingfsmFinalStateOperation
{
	
	private final fsm.FinalState self;
	private final printingfsm.revisitor.PrintingfsmRevisitor<? extends printingfsm.revisitor.operation.PrintingfsmFinalStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmMachineOperation, ? extends printingfsm.revisitor.operation.PrintingfsmStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmTransitionOperation> alg;
	
	private final printingfsm.revisitor.operation.impl.PrintingfsmStateOperationImpl printingfsmdelegate;
	
	public PrintingfsmFinalStateOperationImpl(fsm.FinalState self, printingfsm.revisitor.PrintingfsmRevisitor<? extends printingfsm.revisitor.operation.PrintingfsmFinalStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmMachineOperation, ? extends printingfsm.revisitor.operation.PrintingfsmStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmTransitionOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
		this.printingfsmdelegate = new printingfsm.revisitor.operation.impl.PrintingfsmStateOperationImpl(self, alg);
	}
	@Override
	public String print() {
		return "*" + this.printingfsmdelegate.print();
	}
}