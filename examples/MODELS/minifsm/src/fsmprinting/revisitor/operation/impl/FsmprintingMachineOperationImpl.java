package fsmprinting.revisitor.operation.impl;

public class FsmprintingMachineOperationImpl implements fsmprinting.revisitor.operation.FsmprintingMachineOperation
{
	
	private final minifsm.Machine self;
	private final fsmprinting.revisitor.FsmprintingRevisitor<? extends fsmprinting.revisitor.operation.FsmprintingFinalStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingMachineOperation, ? extends fsmprinting.revisitor.operation.FsmprintingStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingTransitionOperation> alg;
	
	
	public FsmprintingMachineOperationImpl(minifsm.Machine self, fsmprinting.revisitor.FsmprintingRevisitor<? extends fsmprinting.revisitor.operation.FsmprintingFinalStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingMachineOperation, ? extends fsmprinting.revisitor.operation.FsmprintingStateOperation, ? extends fsmprinting.revisitor.operation.FsmprintingTransitionOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public String print() {
		String ret = "";
		for(minifsm.State s: self.getStates()) {
			ret = ret + alg.$(s).print();
		}
		return ret;
	}
}