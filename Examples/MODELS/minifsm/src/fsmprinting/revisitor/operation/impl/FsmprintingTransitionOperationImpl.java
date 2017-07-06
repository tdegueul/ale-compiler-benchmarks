package fsmprinting.revisitor.operation.impl;

public class FsmprintingTransitionOperationImpl implements fsmprinting.revisitor.operation.FsmprintingTransitionOperation
{
	
	private final minifsm.Transition self;
	private final fsmprinting.revisitor.FsmprintingRevisitor<? extends fsmprinting.revisitor.operation.FsmprintingFinalStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingMachineOperation, ? extends fsmprinting.revisitor.operation.FsmprintingStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingTransitionOperation> alg;
	
	
	public FsmprintingTransitionOperationImpl(minifsm.Transition self, fsmprinting.revisitor.FsmprintingRevisitor<? extends fsmprinting.revisitor.operation.FsmprintingFinalStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingMachineOperation, ? extends fsmprinting.revisitor.operation.FsmprintingStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingTransitionOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public String print() {
		return self.getEvent() + " => " + self.getTgt().getName();
	}
}