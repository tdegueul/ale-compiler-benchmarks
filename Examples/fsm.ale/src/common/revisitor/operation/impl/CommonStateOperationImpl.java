package common.revisitor.operation.impl;

public class CommonStateOperationImpl implements common.revisitor.operation.CommonStateOperation
{
	
	private final fsm.State self;
	
	
	public CommonStateOperationImpl(fsm.State self, Object  alg) {
		this.self = self;
		
	}
}