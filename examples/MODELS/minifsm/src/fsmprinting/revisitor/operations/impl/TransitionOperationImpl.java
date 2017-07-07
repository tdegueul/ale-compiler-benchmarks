package fsmprinting.revisitor.operations.impl;

public class TransitionOperationImpl implements fsmprinting.revisitor.operations.TransitionOperation {
	private final minifsm.Transition self;
	private final minifsm.revisitor.MinifsmRevisitor<? extends fsmprinting.revisitor.operations.FinalStateOperation, ? extends fsmprinting.revisitor.operations.MachineOperation, ? extends fsmprinting.revisitor.operations.StateOperation, ? extends fsmprinting.revisitor.operations.TransitionOperation> alg;


	public TransitionOperationImpl(minifsm.Transition self, minifsm.revisitor.MinifsmRevisitor<? extends fsmprinting.revisitor.operations.FinalStateOperation, ? extends fsmprinting.revisitor.operations.MachineOperation, ? extends fsmprinting.revisitor.operations.StateOperation, ? extends fsmprinting.revisitor.operations.TransitionOperation> alg) {
		this.self = self;
		this.alg = alg;
	}

	@Override
	public String print() {
		return self.getEvent() + " => " + self.getTgt().getName();
	}
}
