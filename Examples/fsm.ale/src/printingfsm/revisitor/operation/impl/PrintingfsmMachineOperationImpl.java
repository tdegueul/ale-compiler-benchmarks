package printingfsm.revisitor.operation.impl;

public class PrintingfsmMachineOperationImpl implements printingfsm.revisitor.operation.PrintingfsmMachineOperation
{
	
	private final fsm.Machine self;
	private final printingfsm.revisitor.PrintingfsmRevisitor<? extends printingfsm.revisitor.operation.PrintingfsmFinalStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmMachineOperation, ? extends printingfsm.revisitor.operation.PrintingfsmStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmTransitionOperation> alg;
	
	
	public PrintingfsmMachineOperationImpl(fsm.Machine self, printingfsm.revisitor.PrintingfsmRevisitor<? extends printingfsm.revisitor.operation.PrintingfsmFinalStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmMachineOperation, ? extends printingfsm.revisitor.operation.PrintingfsmStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmTransitionOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public String print() {
		String ret = "";
		for(fsm.State s: self.getStates()) {
			ret = ret + alg.$(s).print() + "\n";
		}
		return ret;
	}
}