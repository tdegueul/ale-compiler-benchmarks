package guardedfsmprinting.revisitor.operations.impl;

public class GuardedOperationImpl implements guardedfsmprinting.revisitor.operations.GuardedOperation {
	private final guardedfsm.Guarded self;
	private final guardedfsm.revisitor.GuardedfsmRevisitor<? extends printexp.revisitor.operations.AndOperation, ? extends printexp.revisitor.operations.BinaryExpOperation, ? extends printexp.revisitor.operations.ExpOperation, ? extends printexp.revisitor.operations.FalsOperation, ? extends fsmprinting.revisitor.operations.FinalStateOperation, ? extends guardedfsmprinting.revisitor.operations.GuardedOperation, ? extends printexp.revisitor.operations.LitOperation, ? extends fsmprinting.revisitor.operations.MachineOperation, ? extends printexp.revisitor.operations.OrOperation, ? extends fsmprinting.revisitor.operations.StateOperation, ? extends fsmprinting.revisitor.operations.TransitionOperation, ? extends printexp.revisitor.operations.TruOperation> alg;

	private final fsmprinting.revisitor.operations.TransitionOperation fsmprintingdelegate;

	public GuardedOperationImpl(guardedfsm.Guarded self, guardedfsm.revisitor.GuardedfsmRevisitor<? extends printexp.revisitor.operations.AndOperation, ? extends printexp.revisitor.operations.BinaryExpOperation, ? extends printexp.revisitor.operations.ExpOperation, ? extends printexp.revisitor.operations.FalsOperation, ? extends fsmprinting.revisitor.operations.FinalStateOperation, ? extends guardedfsmprinting.revisitor.operations.GuardedOperation, ? extends printexp.revisitor.operations.LitOperation, ? extends fsmprinting.revisitor.operations.MachineOperation, ? extends printexp.revisitor.operations.OrOperation, ? extends fsmprinting.revisitor.operations.StateOperation, ? extends fsmprinting.revisitor.operations.TransitionOperation, ? extends printexp.revisitor.operations.TruOperation> alg) {
		this.self = self;
		this.alg = alg;
		this.fsmprintingdelegate = new fsmprinting.revisitor.operations.impl.TransitionOperationImpl(self, alg);
	}

	@Override
	public String print() {
		return this.fsmprintingdelegate.print() + " [" + alg.$(self.getGuard()).print() + "]";
	}
}
