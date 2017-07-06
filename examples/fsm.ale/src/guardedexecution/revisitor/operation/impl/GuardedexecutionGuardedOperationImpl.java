package guardedexecution.revisitor.operation.impl;

public class GuardedexecutionGuardedOperationImpl implements guardedexecution.revisitor.operation.GuardedexecutionGuardedOperation
{
	
	private final guarded.Guarded self;
	private final guardedexecution.revisitor.GuardedexecutionRevisitor<? extends evalexp.revisitor.operation.EvalexpExpressionOperation, ? extends common.revisitor.operation.CommonFinalStateOperation, ? extends guardedexecution.revisitor.operation.GuardedexecutionGuardedOperation, ? extends common.revisitor.operation.CommonMachineOperation, ? extends common.revisitor.operation.CommonStateOperation, ? extends execution.revisitor.operation.ExecutionTransitionOperation> alg;
	
	private final execution.revisitor.operation.impl.ExecutionTransitionOperationImpl executiondelegate;
	
	public GuardedexecutionGuardedOperationImpl(guarded.Guarded self, guardedexecution.revisitor.GuardedexecutionRevisitor<? extends evalexp.revisitor.operation.EvalexpExpressionOperation, ? extends common.revisitor.operation.CommonFinalStateOperation, ? extends guardedexecution.revisitor.operation.GuardedexecutionGuardedOperation, ? extends common.revisitor.operation.CommonMachineOperation, ? extends common.revisitor.operation.CommonStateOperation, ? extends execution.revisitor.operation.ExecutionTransitionOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
		this.executiondelegate = new execution.revisitor.operation.impl.ExecutionTransitionOperationImpl(self, alg);
	}
	@Override
	public void step(String ch) {
		if(alg.$(self.getGuard()).eval().equals(true)) {
					this.executiondelegate.step(ch);
				} 
	}
}