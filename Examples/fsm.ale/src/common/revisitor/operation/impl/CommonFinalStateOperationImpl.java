package common.revisitor.operation.impl;

public class CommonFinalStateOperationImpl implements common.revisitor.operation.CommonFinalStateOperation
{
	
	private final fsm.FinalState self;
	
	
	public CommonFinalStateOperationImpl(fsm.FinalState self, Object  alg) {
		this.self = self;
		
	}
}