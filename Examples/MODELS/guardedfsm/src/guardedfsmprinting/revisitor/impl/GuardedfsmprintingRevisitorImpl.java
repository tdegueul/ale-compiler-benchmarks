package guardedfsmprinting.revisitor.impl;

public interface GuardedfsmprintingRevisitorImpl extends guardedfsmprinting.revisitor.GuardedfsmprintingRevisitor
	<printexp.revisitor.operation.PrintexpAndOperation,printexp.revisitor.operation.PrintexpBinaryExpOperation,printexp.revisitor.operation.PrintexpExpOperation,printexp.revisitor.operation.PrintexpFalsOperation,fsmprinting.revisitor.operation.FsmprintingFinalStateOperation,guardedfsmprinting.revisitor.operation.GuardedfsmprintingGuardedOperation,printexp.revisitor.operation.PrintexpLitOperation,fsmprinting.revisitor.operation.FsmprintingMachineOperation,printexp.revisitor.operation.PrintexpOrOperation,fsmprinting.revisitor.operation.FsmprintingStateOperation,fsmprinting.revisitor.operation.FsmprintingTransitionOperation,printexp.revisitor.operation.PrintexpTruOperation> {
	@Override
	default printexp.revisitor.operation.PrintexpAndOperation and(final boolexp.And and) {
		return new printexp.revisitor.operation.impl.PrintexpAndOperationImpl(and, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpAndOperation binaryExp_and(final boolexp.And and) {
		return new printexp.revisitor.operation.impl.PrintexpAndOperationImpl(and, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpAndOperation exp_and(final boolexp.And and) {
		return new printexp.revisitor.operation.impl.PrintexpAndOperationImpl(and, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpFalsOperation fals(final boolexp.Fals fals) {
		return new printexp.revisitor.operation.impl.PrintexpFalsOperationImpl(fals, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpFalsOperation lit_fals(final boolexp.Fals fals) {
		return new printexp.revisitor.operation.impl.PrintexpFalsOperationImpl(fals, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpFalsOperation exp_fals(final boolexp.Fals fals) {
		return new printexp.revisitor.operation.impl.PrintexpFalsOperationImpl(fals, this);
	} 
	@Override
	default fsmprinting.revisitor.operation.FsmprintingFinalStateOperation finalState(final minifsm.FinalState finalState) {
		return new fsmprinting.revisitor.operation.impl.FsmprintingFinalStateOperationImpl(finalState, this);
	} 
	@Override
	default fsmprinting.revisitor.operation.FsmprintingFinalStateOperation state_finalState(final minifsm.FinalState finalState) {
		return new fsmprinting.revisitor.operation.impl.FsmprintingFinalStateOperationImpl(finalState, this);
	} 
	@Override
	default guardedfsmprinting.revisitor.operation.GuardedfsmprintingGuardedOperation guarded(final guardedfsm.Guarded guarded) {
		return new guardedfsmprinting.revisitor.operation.impl.GuardedfsmprintingGuardedOperationImpl(guarded, this);
	} 
	@Override
	default guardedfsmprinting.revisitor.operation.GuardedfsmprintingGuardedOperation transition_guarded(final guardedfsm.Guarded guarded) {
		return new guardedfsmprinting.revisitor.operation.impl.GuardedfsmprintingGuardedOperationImpl(guarded, this);
	} 
	@Override
	default fsmprinting.revisitor.operation.FsmprintingMachineOperation machine(final minifsm.Machine machine) {
		return new fsmprinting.revisitor.operation.impl.FsmprintingMachineOperationImpl(machine, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpOrOperation or(final boolexp.Or or) {
		return new printexp.revisitor.operation.impl.PrintexpOrOperationImpl(or, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpOrOperation binaryExp_or(final boolexp.Or or) {
		return new printexp.revisitor.operation.impl.PrintexpOrOperationImpl(or, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpOrOperation exp_or(final boolexp.Or or) {
		return new printexp.revisitor.operation.impl.PrintexpOrOperationImpl(or, this);
	} 
	@Override
	default fsmprinting.revisitor.operation.FsmprintingStateOperation state(final minifsm.State state) {
		return new fsmprinting.revisitor.operation.impl.FsmprintingStateOperationImpl(state, this);
	} 
	@Override
	default fsmprinting.revisitor.operation.FsmprintingTransitionOperation transition(final minifsm.Transition transition) {
		return new fsmprinting.revisitor.operation.impl.FsmprintingTransitionOperationImpl(transition, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpTruOperation tru(final boolexp.Tru tru) {
		return new printexp.revisitor.operation.impl.PrintexpTruOperationImpl(tru, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpTruOperation lit_tru(final boolexp.Tru tru) {
		return new printexp.revisitor.operation.impl.PrintexpTruOperationImpl(tru, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpTruOperation exp_tru(final boolexp.Tru tru) {
		return new printexp.revisitor.operation.impl.PrintexpTruOperationImpl(tru, this);
	} 
}
