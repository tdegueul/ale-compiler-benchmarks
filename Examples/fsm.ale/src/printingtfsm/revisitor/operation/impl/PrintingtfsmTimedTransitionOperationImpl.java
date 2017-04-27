package printingtfsm.revisitor.operation.impl;

public class PrintingtfsmTimedTransitionOperationImpl implements printingtfsm.revisitor.operation.PrintingtfsmTimedTransitionOperation
{
	
	private final tfsm.TimedTransition self;
	private final printingtfsm.revisitor.PrintingtfsmRevisitor<? extends printingfsm.revisitor.operation.PrintingfsmFinalStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmMachineOperation, ? extends printingfsm.revisitor.operation.PrintingfsmStateOperation, ? extends printingtfsm.revisitor.operation.PrintingtfsmTimedTransitionOperation, ? extends printingfsm.revisitor.operation.PrintingfsmTransitionOperation> alg;
	
	private final printingfsm.revisitor.operation.impl.PrintingfsmTransitionOperationImpl printingfsmdelegate;
	
	public PrintingtfsmTimedTransitionOperationImpl(tfsm.TimedTransition self, printingtfsm.revisitor.PrintingtfsmRevisitor<? extends printingfsm.revisitor.operation.PrintingfsmFinalStateOperation, ? extends printingfsm.revisitor.operation.PrintingfsmMachineOperation, ? extends printingfsm.revisitor.operation.PrintingfsmStateOperation, ? extends printingtfsm.revisitor.operation.PrintingtfsmTimedTransitionOperation, ? extends printingfsm.revisitor.operation.PrintingfsmTransitionOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
		this.printingfsmdelegate = new printingfsm.revisitor.operation.impl.PrintingfsmTransitionOperationImpl(self, alg);
	}
	@Override
	public String print() {
		return self.getTime() + "@" + this.printingfsmdelegate.print();
	}
}