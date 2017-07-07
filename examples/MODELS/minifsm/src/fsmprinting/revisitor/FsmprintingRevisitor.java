package fsmprinting.revisitor;

public interface FsmprintingRevisitor extends minifsm.revisitor.MinifsmRevisitor<fsmprinting.revisitor.operations.FinalStateOperation, fsmprinting.revisitor.operations.MachineOperation, fsmprinting.revisitor.operations.StateOperation, fsmprinting.revisitor.operations.TransitionOperation> {
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
	default fsmprinting.revisitor.operations.TransitionOperation transition(final minifsm.Transition t) {
		return new fsmprinting.revisitor.operations.impl.TransitionOperationImpl(t, this);
	}
}
