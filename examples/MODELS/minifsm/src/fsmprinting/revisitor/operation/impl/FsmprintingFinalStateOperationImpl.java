package fsmprinting.revisitor.operation.impl;

public  class FsmprintingFinalStateOperationImpl implements fsmprinting.revisitor.operation.FsmprintingFinalStateOperation
{
	
	private final minifsm.FinalState self;
	private final fsmprinting.revisitor.FsmprintingRevisitor<? extends fsmprinting.revisitor.operation.FsmprintingFinalStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingMachineOperation, ? extends fsmprinting.revisitor.operation.FsmprintingStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingTransitionOperation> alg;
	
	private final fsmprinting.revisitor.operation.impl.FsmprintingStateOperationImpl fsmprintingdelegate;
	
	public FsmprintingFinalStateOperationImpl(minifsm.FinalState self, fsmprinting.revisitor.FsmprintingRevisitor<? extends fsmprinting.revisitor.operation.FsmprintingFinalStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingMachineOperation, ? extends fsmprinting.revisitor.operation.FsmprintingStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingTransitionOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
		this.fsmprintingdelegate = new fsmprinting.revisitor.operation.impl.FsmprintingStateOperationImpl(self, alg);
	}
	@Override
	public String print() {
		return "* " + this.fsmprintingdelegate.print();
	}
}