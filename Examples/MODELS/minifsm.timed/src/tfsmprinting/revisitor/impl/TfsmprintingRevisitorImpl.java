package tfsmprinting.revisitor.impl;

public interface TfsmprintingRevisitorImpl extends tfsmprinting.revisitor.TfsmprintingRevisitor
	<fsmprinting.revisitor.operation.FsmprintingFinalStateOperation,fsmprinting.revisitor.operation.FsmprintingMachineOperation,fsmprinting.revisitor.operation.FsmprintingStateOperation,tfsmprinting.revisitor.operation.TfsmprintingTimedTransitionOperation,fsmprinting.revisitor.operation.FsmprintingTransitionOperation> {
	@Override
	default fsmprinting.revisitor.operation.FsmprintingFinalStateOperation finalState(final minifsm.FinalState finalState) {
		return new fsmprinting.revisitor.operation.impl.FsmprintingFinalStateOperationImpl(finalState, this);
	} 
	@Override
	default fsmprinting.revisitor.operation.FsmprintingFinalStateOperation state_finalState(final minifsm.FinalState finalState) {
		return new fsmprinting.revisitor.operation.impl.FsmprintingFinalStateOperationImpl(finalState, this);
	} 
	@Override
	default fsmprinting.revisitor.operation.FsmprintingMachineOperation machine(final minifsm.Machine machine) {
		return new fsmprinting.revisitor.operation.impl.FsmprintingMachineOperationImpl(machine, this);
	} 
	@Override
	default fsmprinting.revisitor.operation.FsmprintingStateOperation state(final minifsm.State state) {
		return new fsmprinting.revisitor.operation.impl.FsmprintingStateOperationImpl(state, this);
	} 
	@Override
	default tfsmprinting.revisitor.operation.TfsmprintingTimedTransitionOperation timedTransition(final timedminifsm.TimedTransition timedTransition) {
		return new tfsmprinting.revisitor.operation.impl.TfsmprintingTimedTransitionOperationImpl(timedTransition, this);
	} 
	@Override
	default tfsmprinting.revisitor.operation.TfsmprintingTimedTransitionOperation transition_timedTransition(final timedminifsm.TimedTransition timedTransition) {
		return new tfsmprinting.revisitor.operation.impl.TfsmprintingTimedTransitionOperationImpl(timedTransition, this);
	} 
	@Override
	default fsmprinting.revisitor.operation.FsmprintingTransitionOperation transition(final minifsm.Transition transition) {
		return new fsmprinting.revisitor.operation.impl.FsmprintingTransitionOperationImpl(transition, this);
	} 
}
