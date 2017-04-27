package printingfsm.revisitor.operation.impl;

public class PrintingfsmTransitionOperationImpl implements printingfsm.revisitor.operation.PrintingfsmTransitionOperation
{
	
	private final fsm.Transition self;
	private final printingfsm.revisitor.PrintingfsmRevisitor<? extends printingfsm.revisitor.operation.PrintingfsmFinalStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmMachineOperation, ? extends printingfsm.revisitor.operation.PrintingfsmStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmTransitionOperation> alg;
	
	
	public PrintingfsmTransitionOperationImpl(fsm.Transition self, printingfsm.revisitor.PrintingfsmRevisitor<? extends printingfsm.revisitor.operation.PrintingfsmFinalStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmMachineOperation, ? extends printingfsm.revisitor.operation.PrintingfsmStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmTransitionOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public String print() {
		return self.getEvent() + " => " + self.getTgt().getName();
	}
}