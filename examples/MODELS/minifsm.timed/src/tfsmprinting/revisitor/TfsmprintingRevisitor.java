package tfsmprinting.revisitor;

public interface TfsmprintingRevisitor extends timedminifsm.revisitor.TimedminifsmRevisitor<fsmprinting.revisitor.operations.FinalStateOperation, fsmprinting.revisitor.operations.MachineOperation, fsmprinting.revisitor.operations.StateOperation, tfsmprinting.revisitor.operations.TimedTransitionOperation, fsmprinting.revisitor.operations.TransitionOperation>,
	fsmprinting.revisitor.FsmprintingRevisitor {
	@Override
	default tfsmprinting.revisitor.operations.TimedTransitionOperation timedTransition(final timedminifsm.TimedTransition t) {
		return new tfsmprinting.revisitor.operations.impl.TimedTransitionOperationImpl(t, this);
	}
	@Override
	default tfsmprinting.revisitor.operations.TimedTransitionOperation transition_timedTransition(final timedminifsm.TimedTransition t) {
		return new tfsmprinting.revisitor.operations.impl.TimedTransitionOperationImpl(t, this);
	}
}
