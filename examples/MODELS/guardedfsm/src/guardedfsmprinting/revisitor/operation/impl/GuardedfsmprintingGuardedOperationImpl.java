package guardedfsmprinting.revisitor.operation.impl;

public  class GuardedfsmprintingGuardedOperationImpl implements guardedfsmprinting.revisitor.operation.GuardedfsmprintingGuardedOperation
{
	
	private final guardedfsm.Guarded self;
	private final guardedfsmprinting.revisitor.GuardedfsmprintingRevisitor<? extends printexp.revisitor.operation.PrintexpAndOperation, ? extends printexp.revisitor.operation.PrintexpBinaryExpOperation, ? extends printexp.revisitor.operation.PrintexpExpOperation, ? extends printexp.revisitor.operation.PrintexpFalsOperation, ? extends fsmprinting.revisitor.operation.FsmprintingFinalStateOperation, ? extends guardedfsmprinting.revisitor.operation.GuardedfsmprintingGuardedOperation, ? extends printexp.revisitor.operation.PrintexpLitOperation, ? extends fsmprinting.revisitor.operation.FsmprintingMachineOperation, ? extends printexp.revisitor.operation.PrintexpOrOperation, ? extends fsmprinting.revisitor.operation.FsmprintingStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingTransitionOperation, ? extends printexp.revisitor.operation.PrintexpTruOperation> alg;
	
	private final fsmprinting.revisitor.operation.impl.FsmprintingTransitionOperationImpl fsmprintingdelegate;
	
	public GuardedfsmprintingGuardedOperationImpl(guardedfsm.Guarded self, guardedfsmprinting.revisitor.GuardedfsmprintingRevisitor<? extends printexp.revisitor.operation.PrintexpAndOperation, ? extends printexp.revisitor.operation.PrintexpBinaryExpOperation, ? extends printexp.revisitor.operation.PrintexpExpOperation, ? extends printexp.revisitor.operation.PrintexpFalsOperation, ? extends fsmprinting.revisitor.operation.FsmprintingFinalStateOperation, ? extends guardedfsmprinting.revisitor.operation.GuardedfsmprintingGuardedOperation, ? extends printexp.revisitor.operation.PrintexpLitOperation, ? extends fsmprinting.revisitor.operation.FsmprintingMachineOperation, ? extends printexp.revisitor.operation.PrintexpOrOperation, ? extends fsmprinting.revisitor.operation.FsmprintingStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingTransitionOperation, ? extends printexp.revisitor.operation.PrintexpTruOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
		this.fsmprintingdelegate = new fsmprinting.revisitor.operation.impl.FsmprintingTransitionOperationImpl(self, alg);
	}
	@Override
	public String print() {
		return this.fsmprintingdelegate.print() + " [" + alg.$(self.getGuard()).print() + "]";
	}
}