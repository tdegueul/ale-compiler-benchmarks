package common.revisitor.operation.impl;

public class CommonMachineOperationImpl implements common.revisitor.operation.CommonMachineOperation
{
	
	private final fsm.Machine self;
	
	
	public CommonMachineOperationImpl(fsm.Machine self, Object  alg) {
		this.self = self;
		
	}
}