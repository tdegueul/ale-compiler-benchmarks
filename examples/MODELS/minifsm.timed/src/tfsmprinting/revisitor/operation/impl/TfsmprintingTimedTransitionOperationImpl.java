package tfsmprinting.revisitor.operation.impl;

public  class TfsmprintingTimedTransitionOperationImpl implements tfsmprinting.revisitor.operation.TfsmprintingTimedTransitionOperation
{
	
	private final timedminifsm.TimedTransition self;
	private final tfsmprinting.revisitor.TfsmprintingRevisitor<? extends fsmprinting.revisitor.operation.FsmprintingFinalStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingMachineOperation, ? extends fsmprinting.revisitor.operation.FsmprintingStateOperation, ? extends tfsmprinting.revisitor.operation.TfsmprintingTimedTransitionOperation, ? extends fsmprinting.revisitor.operation.FsmprintingTransitionOperation> alg;
	
	private final fsmprinting.revisitor.operation.impl.FsmprintingTransitionOperationImpl fsmprintingdelegate;
	
	public TfsmprintingTimedTransitionOperationImpl(timedminifsm.TimedTransition self, tfsmprinting.revisitor.TfsmprintingRevisitor<? extends fsmprinting.revisitor.operation.FsmprintingFinalStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingMachineOperation, ? extends fsmprinting.revisitor.operation.FsmprintingStateOperation, ? extends tfsmprinting.revisitor.operation.TfsmprintingTimedTransitionOperation, ? extends fsmprinting.revisitor.operation.FsmprintingTransitionOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
		this.fsmprintingdelegate = new fsmprinting.revisitor.operation.impl.FsmprintingTransitionOperationImpl(self, alg);
	}
	@Override
	public String print() {
		return this.fsmprintingdelegate.print() + " @ " + self.getTime();
	}
}