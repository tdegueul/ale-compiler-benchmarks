package fsmprinting.revisitor.operation.impl;

public class FsmprintingStateOperationImpl implements fsmprinting.revisitor.operation.FsmprintingStateOperation
{
	
	private final minifsm.State self;
	private final fsmprinting.revisitor.FsmprintingRevisitor<? extends fsmprinting.revisitor.operation.FsmprintingFinalStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingMachineOperation, ? extends fsmprinting.revisitor.operation.FsmprintingStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingTransitionOperation> alg;
	
	
	public FsmprintingStateOperationImpl(minifsm.State self, fsmprinting.revisitor.FsmprintingRevisitor<? extends fsmprinting.revisitor.operation.FsmprintingFinalStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingMachineOperation, ? extends fsmprinting.revisitor.operation.FsmprintingStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingTransitionOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public String print() {
		String ret = "State " + self.getName() + "\n";
		for(minifsm.Transition t: self.getOut()) {
			ret = ret + "\t" + alg.$(t).print() + "\n";
		}
		return ret;
	}
}