package fsmprinting.revisitor.operations.impl;

public class MachineOperationImpl implements fsmprinting.revisitor.operations.MachineOperation {
	private final minifsm.Machine self;
	private final minifsm.revisitor.MinifsmRevisitor<? extends fsmprinting.revisitor.operations.FinalStateOperation, ? extends fsmprinting.revisitor.operations.MachineOperation, ? extends fsmprinting.revisitor.operations.StateOperation, ? extends fsmprinting.revisitor.operations.TransitionOperation> alg;


	public MachineOperationImpl(minifsm.Machine self, minifsm.revisitor.MinifsmRevisitor<? extends fsmprinting.revisitor.operations.FinalStateOperation, ? extends fsmprinting.revisitor.operations.MachineOperation, ? extends fsmprinting.revisitor.operations.StateOperation, ? extends fsmprinting.revisitor.operations.TransitionOperation> alg) {
		this.self = self;
		this.alg = alg;
	}

	@Override
	public String print() {
		String ret = "";
		for (minifsm.State s: self.getStates()) {
			ret = ret + alg.$(s).print();
		}
		return ret;
	}
}
