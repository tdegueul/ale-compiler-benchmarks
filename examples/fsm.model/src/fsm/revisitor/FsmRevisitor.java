package fsm.revisitor;

public interface FsmRevisitor<Fsm__FinalStateT extends Fsm__StateT,Fsm__MachineT,Fsm__StateT,Fsm__TransitionT>
	
	 {
Fsm__FinalStateT finalState(final fsm.FinalState finalState);
Fsm__StateT state_finalState(final fsm.FinalState finalState);

Fsm__MachineT machine(final fsm.Machine machine);

Fsm__StateT state(final fsm.State state);

Fsm__TransitionT transition(final fsm.Transition transition);

	
	default Fsm__MachineT $(final fsm.Machine self) {
		return machine(self);
	}
	default Fsm__StateT $(final fsm.State self) {
		if(self.eClass().getClassifierID() == fsm.FsmPackage.FINAL_STATE && self.eClass().getEPackage() == fsm.FsmPackage.eINSTANCE) return finalState((fsm.FinalState) self);
		return state(self);
	}
	default Fsm__TransitionT $(final fsm.Transition self) {
		return transition(self);
	}
	default Fsm__FinalStateT $(final fsm.FinalState self) {
		return finalState(self);
	}
}
