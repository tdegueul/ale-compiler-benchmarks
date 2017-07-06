package guardedexecution.revisitor.operation;

public interface GuardedexecutionGuardedOperation
extends execution.revisitor.operation.ExecutionTransitionOperation 
{
	void step(String ch);
}