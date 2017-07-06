package printingfsm.revisitor.impl;

public interface PrintingfsmRevisitorImpl extends printingfsm.revisitor.PrintingfsmRevisitor
	<printingfsm.revisitor.operation.PrintingfsmFinalStateOperation,printingfsm.revisitor.operation.PrintingfsmMachineOperation,printingfsm.revisitor.operation.PrintingfsmStateOperation,printingfsm.revisitor.operation.PrintingfsmTransitionOperation> {
	@Override
	default printingfsm.revisitor.operation.PrintingfsmFinalStateOperation finalState(final fsm.FinalState finalState) {
		return new printingfsm.revisitor.operation.impl.PrintingfsmFinalStateOperationImpl(finalState, this);
	} 
	@Override
	default printingfsm.revisitor.operation.PrintingfsmFinalStateOperation state_finalState(final fsm.FinalState finalState) {
		return new printingfsm.revisitor.operation.impl.PrintingfsmFinalStateOperationImpl(finalState, this);
	} 
	@Override
	default printingfsm.revisitor.operation.PrintingfsmMachineOperation machine(final fsm.Machine machine) {
		return new printingfsm.revisitor.operation.impl.PrintingfsmMachineOperationImpl(machine, this);
	} 
	@Override
	default printingfsm.revisitor.operation.PrintingfsmStateOperation state(final fsm.State state) {
		return new printingfsm.revisitor.operation.impl.PrintingfsmStateOperationImpl(state, this);
	} 
	@Override
	default printingfsm.revisitor.operation.PrintingfsmTransitionOperation transition(final fsm.Transition transition) {
		return new printingfsm.revisitor.operation.impl.PrintingfsmTransitionOperationImpl(transition, this);
	} 
}
