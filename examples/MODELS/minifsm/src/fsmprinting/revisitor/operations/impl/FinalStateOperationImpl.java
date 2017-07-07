package fsmprinting.revisitor.operations.impl;

public class FinalStateOperationImpl implements fsmprinting.revisitor.operations.FinalStateOperation {
	private final minifsm.FinalState self;
	private final minifsm.revisitor.MinifsmRevisitor<? extends fsmprinting.revisitor.operations.FinalStateOperation, ? extends fsmprinting.revisitor.operations.MachineOperation, ? extends fsmprinting.revisitor.operations.StateOperation, ? extends fsmprinting.revisitor.operations.TransitionOperation> alg;

	private final fsmprinting.revisitor.operations.StateOperation fsmprintingdelegate;

	public FinalStateOperationImpl(minifsm.FinalState self, minifsm.revisitor.MinifsmRevisitor<? extends fsmprinting.revisitor.operations.FinalStateOperation, ? extends fsmprinting.revisitor.operations.MachineOperation, ? extends fsmprinting.revisitor.operations.StateOperation, ? extends fsmprinting.revisitor.operations.TransitionOperation> alg) {
		this.self = self;
		this.alg = alg;
		this.fsmprintingdelegate = new fsmprinting.revisitor.operations.impl.StateOperationImpl(self, alg);
	}

	@Override
	public String print() {
		return "* " + this.fsmprintingdelegate.print();
	}
}
