package guardedfsmprinting.revisitor;

public interface GuardedfsmprintingRevisitor extends guardedfsm.revisitor.GuardedfsmRevisitor<printexp.revisitor.operations.AndOperation, printexp.revisitor.operations.BinaryExpOperation, printexp.revisitor.operations.ExpOperation, printexp.revisitor.operations.FalsOperation, fsmprinting.revisitor.operations.FinalStateOperation, guardedfsmprinting.revisitor.operations.GuardedOperation, printexp.revisitor.operations.LitOperation, fsmprinting.revisitor.operations.MachineOperation, printexp.revisitor.operations.OrOperation, fsmprinting.revisitor.operations.StateOperation, fsmprinting.revisitor.operations.TransitionOperation, printexp.revisitor.operations.TruOperation>,
	fsmprinting.revisitor.FsmprintingRevisitor,
	printexp.revisitor.PrintexpRevisitor {
	@Override
	default guardedfsmprinting.revisitor.operations.GuardedOperation guarded(final guardedfsm.Guarded g) {
		return new guardedfsmprinting.revisitor.operations.impl.GuardedOperationImpl(g, this);
	}
	@Override
	default guardedfsmprinting.revisitor.operations.GuardedOperation transition_guarded(final guardedfsm.Guarded g) {
		return new guardedfsmprinting.revisitor.operations.impl.GuardedOperationImpl(g, this);
	}
}
