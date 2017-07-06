package guardedexecution.revisitor.impl;

public interface GuardedexecutionRevisitorImpl extends guardedexecution.revisitor.GuardedexecutionRevisitor
	<evalexp.revisitor.operation.EvalexpExpressionOperation,common.revisitor.operation.CommonFinalStateOperation,guardedexecution.revisitor.operation.GuardedexecutionGuardedOperation,common.revisitor.operation.CommonMachineOperation,common.revisitor.operation.CommonStateOperation,execution.revisitor.operation.ExecutionTransitionOperation> {
	@Override
	default evalexp.revisitor.operation.EvalexpExpressionOperation expression(final exp.Expression expression) {
		return new evalexp.revisitor.operation.impl.EvalexpExpressionOperationImpl(expression, this);
	} 
	@Override
	default common.revisitor.operation.CommonFinalStateOperation finalState(final fsm.FinalState finalState) {
		return new common.revisitor.operation.impl.CommonFinalStateOperationImpl(finalState, this);
	} 
	@Override
	default common.revisitor.operation.CommonFinalStateOperation state_finalState(final fsm.FinalState finalState) {
		return new common.revisitor.operation.impl.CommonFinalStateOperationImpl(finalState, this);
	} 
	@Override
	default guardedexecution.revisitor.operation.GuardedexecutionGuardedOperation guarded(final guarded.Guarded guarded) {
		return new guardedexecution.revisitor.operation.impl.GuardedexecutionGuardedOperationImpl(guarded, this);
	} 
	@Override
	default guardedexecution.revisitor.operation.GuardedexecutionGuardedOperation transition_guarded(final guarded.Guarded guarded) {
		return new guardedexecution.revisitor.operation.impl.GuardedexecutionGuardedOperationImpl(guarded, this);
	} 
	@Override
	default common.revisitor.operation.CommonMachineOperation machine(final fsm.Machine machine) {
		return new common.revisitor.operation.impl.CommonMachineOperationImpl(machine, this);
	} 
	@Override
	default common.revisitor.operation.CommonStateOperation state(final fsm.State state) {
		return new common.revisitor.operation.impl.CommonStateOperationImpl(state, this);
	} 
	@Override
	default execution.revisitor.operation.ExecutionTransitionOperation transition(final fsm.Transition transition) {
		return new execution.revisitor.operation.impl.ExecutionTransitionOperationImpl(transition, this);
	} 
}
