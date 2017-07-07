package fsmprinting.revisitor.operations.impl;

public class StateOperationImpl implements fsmprinting.revisitor.operations.StateOperation {
	private final minifsm.State self;
	private final minifsm.revisitor.MinifsmRevisitor<? extends fsmprinting.revisitor.operations.FinalStateOperation, ? extends fsmprinting.revisitor.operations.MachineOperation, ? extends fsmprinting.revisitor.operations.StateOperation, ? extends fsmprinting.revisitor.operations.TransitionOperation> alg;


	public StateOperationImpl(minifsm.State self, minifsm.revisitor.MinifsmRevisitor<? extends fsmprinting.revisitor.operations.FinalStateOperation, ? extends fsmprinting.revisitor.operations.MachineOperation, ? extends fsmprinting.revisitor.operations.StateOperation, ? extends fsmprinting.revisitor.operations.TransitionOperation> alg) {
		this.self = self;
		this.alg = alg;
	}

	@Override
	public String print() {
		String ret = "State " + self.getName() + "\n";
		for (minifsm.Transition t: self.getOut()) {
			ret = ret + "\t" + alg.$(t).print() + "\n";
		}
		return ret;
	}
}
