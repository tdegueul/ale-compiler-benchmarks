package tfsmprinting.revisitor.operations.impl;

public class TimedTransitionOperationImpl implements tfsmprinting.revisitor.operations.TimedTransitionOperation {
	private final timedminifsm.TimedTransition self;
	private final timedminifsm.revisitor.TimedminifsmRevisitor<? extends fsmprinting.revisitor.operations.FinalStateOperation, ? extends fsmprinting.revisitor.operations.MachineOperation, ? extends fsmprinting.revisitor.operations.StateOperation, ? extends tfsmprinting.revisitor.operations.TimedTransitionOperation, ? extends fsmprinting.revisitor.operations.TransitionOperation> alg;

	private final fsmprinting.revisitor.operations.TransitionOperation fsmprintingdelegate;

	public TimedTransitionOperationImpl(timedminifsm.TimedTransition self, timedminifsm.revisitor.TimedminifsmRevisitor<? extends fsmprinting.revisitor.operations.FinalStateOperation, ? extends fsmprinting.revisitor.operations.MachineOperation, ? extends fsmprinting.revisitor.operations.StateOperation, ? extends tfsmprinting.revisitor.operations.TimedTransitionOperation, ? extends fsmprinting.revisitor.operations.TransitionOperation> alg) {
		this.self = self;
		this.alg = alg;
		this.fsmprintingdelegate = new fsmprinting.revisitor.operations.impl.TransitionOperationImpl(self, alg);
	}

	@Override
	public String print() {
		return this.fsmprintingdelegate.print() + " @ " + self.getTime();
	}
}
