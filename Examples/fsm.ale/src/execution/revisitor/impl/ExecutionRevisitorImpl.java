package execution.revisitor.impl;

public interface ExecutionRevisitorImpl extends execution.revisitor.ExecutionRevisitor
	<common.revisitor.operation.CommonFinalStateOperation,common.revisitor.operation.CommonMachineOperation,common.revisitor.operation.CommonStateOperation,execution.revisitor.operation.ExecutionTransitionOperation> {
	@Override
	default common.revisitor.operation.CommonFinalStateOperation finalState(final fsm.FinalState finalState) {
		return new common.revisitor.operation.impl.CommonFinalStateOperationImpl(finalState, this);
	} 
	@Override
	default common.revisitor.operation.CommonFinalStateOperation state_finalState(final fsm.FinalState finalState) {
		return new common.revisitor.operation.impl.CommonFinalStateOperationImpl(finalState, this);
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
