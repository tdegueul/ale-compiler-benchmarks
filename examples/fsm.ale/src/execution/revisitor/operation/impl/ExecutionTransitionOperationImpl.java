package execution.revisitor.operation.impl;

public class ExecutionTransitionOperationImpl implements execution.revisitor.operation.ExecutionTransitionOperation
{
	
	private final fsm.Transition self;
	private final execution.revisitor.ExecutionRevisitor<? extends common.revisitor.operation.CommonFinalStateOperation, ? extends common.revisitor.operation.CommonMachineOperation, ? extends common.revisitor.operation.CommonStateOperation, ? extends execution.revisitor.operation.ExecutionTransitionOperation> alg;
	
	
	public ExecutionTransitionOperationImpl(fsm.Transition self, execution.revisitor.ExecutionRevisitor<? extends common.revisitor.operation.CommonFinalStateOperation, ? extends common.revisitor.operation.CommonMachineOperation, ? extends common.revisitor.operation.CommonStateOperation, ? extends execution.revisitor.operation.ExecutionTransitionOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public void step(String ch) {
		System.out.println(ch);
	}
}