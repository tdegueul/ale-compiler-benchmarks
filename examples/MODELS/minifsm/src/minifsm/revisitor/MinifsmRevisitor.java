package minifsm.revisitor;

public interface MinifsmRevisitor<Minifsm__FinalStateT extends Minifsm__StateT, Minifsm__MachineT, Minifsm__StateT, Minifsm__TransitionT> {
	Minifsm__FinalStateT finalState(final minifsm.FinalState f);
	Minifsm__StateT state_finalState(final minifsm.FinalState f);
	Minifsm__MachineT machine(final minifsm.Machine m);
	Minifsm__StateT state(final minifsm.State s);
	Minifsm__TransitionT transition(final minifsm.Transition t);

	default Minifsm__FinalStateT $(final minifsm.FinalState self) {
		return finalState(self);
	}
	default Minifsm__MachineT $(final minifsm.Machine self) {
		return machine(self);
	}
	default Minifsm__StateT $(final minifsm.State self) {
		if(self.eClass().getClassifierID() == minifsm.MinifsmPackage.FINAL_STATE
			&& self.eClass().getEPackage() == minifsm.MinifsmPackage.eINSTANCE)
			return finalState((minifsm.FinalState) self);
		return state(self);
	}
	default Minifsm__TransitionT $(final minifsm.Transition self) {
		return transition(self);
	}
}
