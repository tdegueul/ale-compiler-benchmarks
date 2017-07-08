package tfsmprinting.revisitor;

public interface TfsmprintingRevisitor extends timedminifsm.revisitor.TimedminifsmRevisitor<fsmprinting.revisitor.operations.FinalStateOperation, fsmprinting.revisitor.operations.MachineOperation, fsmprinting.revisitor.operations.StateOperation, tfsmprinting.revisitor.operations.TimedTransitionOperation, fsmprinting.revisitor.operations.TransitionOperation>,
	fsmprinting.revisitor.FsmprintingRevisitor {
	@Override
	default fsmprinting.revisitor.operations.FinalStateOperation finalState(final minifsm.FinalState f) {
		return new fsmprinting.revisitor.operations.impl.FinalStateOperationImpl(f, this);
	}
	@Override
	default fsmprinting.revisitor.operations.FinalStateOperation state_finalState(final minifsm.FinalState f) {
		return new fsmprinting.revisitor.operations.impl.FinalStateOperationImpl(f, this);
	}
	@Override
	default fsmprinting.revisitor.operations.MachineOperation machine(final minifsm.Machine m) {
		return new fsmprinting.revisitor.operations.impl.MachineOperationImpl(m, this);
	}
	@Override
	default fsmprinting.revisitor.operations.StateOperation state(final minifsm.State s) {
		return new fsmprinting.revisitor.operations.impl.StateOperationImpl(s, this);
	}
	@Override
	default tfsmprinting.revisitor.operations.TimedTransitionOperation timedTransition(final timedminifsm.TimedTransition t) {
		return new tfsmprinting.revisitor.operations.impl.TimedTransitionOperationImpl(t, this);
	}
	@Override
	default tfsmprinting.revisitor.operations.TimedTransitionOperation transition_timedTransition(final timedminifsm.TimedTransition t) {
		return new tfsmprinting.revisitor.operations.impl.TimedTransitionOperationImpl(t, this);
	}
	@Override
	default fsmprinting.revisitor.operations.TransitionOperation transition(final minifsm.Transition t) {
		return new fsmprinting.revisitor.operations.impl.TransitionOperationImpl(t, this);
	}
}
