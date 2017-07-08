package guardedfsmprinting.revisitor;

public interface GuardedfsmprintingRevisitor extends guardedfsm.revisitor.GuardedfsmRevisitor<printexp.revisitor.operations.AndOperation, printexp.revisitor.operations.BinaryExpOperation, printexp.revisitor.operations.ExpOperation, printexp.revisitor.operations.FalsOperation, fsmprinting.revisitor.operations.FinalStateOperation, guardedfsmprinting.revisitor.operations.GuardedOperation, printexp.revisitor.operations.LitOperation, fsmprinting.revisitor.operations.MachineOperation, printexp.revisitor.operations.OrOperation, fsmprinting.revisitor.operations.StateOperation, fsmprinting.revisitor.operations.TransitionOperation, printexp.revisitor.operations.TruOperation>,
	fsmprinting.revisitor.FsmprintingRevisitor,
	printexp.revisitor.PrintexpRevisitor {
	@Override
	default printexp.revisitor.operations.AndOperation and(final boolexp.And a) {
		return new printexp.revisitor.operations.impl.AndOperationImpl(a, this);
	}
	@Override
	default printexp.revisitor.operations.AndOperation exp_and(final boolexp.And a) {
		return new printexp.revisitor.operations.impl.AndOperationImpl(a, this);
	}
	@Override
	default printexp.revisitor.operations.AndOperation binaryExp_and(final boolexp.And a) {
		return new printexp.revisitor.operations.impl.AndOperationImpl(a, this);
	}
	@Override
	default printexp.revisitor.operations.FalsOperation fals(final boolexp.Fals f) {
		return new printexp.revisitor.operations.impl.FalsOperationImpl(f, this);
	}
	@Override
	default printexp.revisitor.operations.FalsOperation exp_fals(final boolexp.Fals f) {
		return new printexp.revisitor.operations.impl.FalsOperationImpl(f, this);
	}
	@Override
	default printexp.revisitor.operations.FalsOperation lit_fals(final boolexp.Fals f) {
		return new printexp.revisitor.operations.impl.FalsOperationImpl(f, this);
	}
	@Override
	default fsmprinting.revisitor.operations.FinalStateOperation finalState(final minifsm.FinalState f) {
		return new fsmprinting.revisitor.operations.impl.FinalStateOperationImpl(f, this);
	}
	@Override
	default fsmprinting.revisitor.operations.FinalStateOperation state_finalState(final minifsm.FinalState f) {
		return new fsmprinting.revisitor.operations.impl.FinalStateOperationImpl(f, this);
	}
	@Override
	default guardedfsmprinting.revisitor.operations.GuardedOperation guarded(final guardedfsm.Guarded g) {
		return new guardedfsmprinting.revisitor.operations.impl.GuardedOperationImpl(g, this);
	}
	@Override
	default guardedfsmprinting.revisitor.operations.GuardedOperation transition_guarded(final guardedfsm.Guarded g) {
		return new guardedfsmprinting.revisitor.operations.impl.GuardedOperationImpl(g, this);
	}
	@Override
	default fsmprinting.revisitor.operations.MachineOperation machine(final minifsm.Machine m) {
		return new fsmprinting.revisitor.operations.impl.MachineOperationImpl(m, this);
	}
	@Override
	default printexp.revisitor.operations.OrOperation or(final boolexp.Or o) {
		return new printexp.revisitor.operations.impl.OrOperationImpl(o, this);
	}
	@Override
	default printexp.revisitor.operations.OrOperation exp_or(final boolexp.Or o) {
		return new printexp.revisitor.operations.impl.OrOperationImpl(o, this);
	}
	@Override
	default printexp.revisitor.operations.OrOperation binaryExp_or(final boolexp.Or o) {
		return new printexp.revisitor.operations.impl.OrOperationImpl(o, this);
	}
	@Override
	default fsmprinting.revisitor.operations.StateOperation state(final minifsm.State s) {
		return new fsmprinting.revisitor.operations.impl.StateOperationImpl(s, this);
	}
	@Override
	default fsmprinting.revisitor.operations.TransitionOperation transition(final minifsm.Transition t) {
		return new fsmprinting.revisitor.operations.impl.TransitionOperationImpl(t, this);
	}
	@Override
	default printexp.revisitor.operations.TruOperation tru(final boolexp.Tru t) {
		return new printexp.revisitor.operations.impl.TruOperationImpl(t, this);
	}
	@Override
	default printexp.revisitor.operations.TruOperation exp_tru(final boolexp.Tru t) {
		return new printexp.revisitor.operations.impl.TruOperationImpl(t, this);
	}
	@Override
	default printexp.revisitor.operations.TruOperation lit_tru(final boolexp.Tru t) {
		return new printexp.revisitor.operations.impl.TruOperationImpl(t, this);
	}
}
