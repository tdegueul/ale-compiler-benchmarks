package printingtfsm.revisitor.impl;

public interface PrintingtfsmRevisitorImpl extends printingtfsm.revisitor.PrintingtfsmRevisitor
	<printingfsm.revisitor.operation.PrintingfsmFinalStateOperation,printingfsm.revisitor.operation.PrintingfsmMachineOperation,printingfsm.revisitor.operation.PrintingfsmStateOperation,printingtfsm.revisitor.operation.PrintingtfsmTimedTransitionOperation,printingfsm.revisitor.operation.PrintingfsmTransitionOperation> {
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
	default printingtfsm.revisitor.operation.PrintingtfsmTimedTransitionOperation timedTransition(final tfsm.TimedTransition timedTransition) {
		return new printingtfsm.revisitor.operation.impl.PrintingtfsmTimedTransitionOperationImpl(timedTransition, this);
	} 
	@Override
	default printingtfsm.revisitor.operation.PrintingtfsmTimedTransitionOperation transition_timedTransition(final tfsm.TimedTransition timedTransition) {
		return new printingtfsm.revisitor.operation.impl.PrintingtfsmTimedTransitionOperationImpl(timedTransition, this);
	} 
	@Override
	default printingfsm.revisitor.operation.PrintingfsmTransitionOperation transition(final fsm.Transition transition) {
		return new printingfsm.revisitor.operation.impl.PrintingfsmTransitionOperationImpl(transition, this);
	} 
}
