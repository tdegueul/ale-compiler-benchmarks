package timedminifsm.revisitor;

public interface TimedminifsmRevisitor<Minifsm__FinalStateT extends Minifsm__StateT, Minifsm__MachineT, Minifsm__StateT, Timedminifsm__TimedTransitionT extends Minifsm__TransitionT, Minifsm__TransitionT>
	extends minifsm.revisitor.MinifsmRevisitor<Minifsm__FinalStateT, Minifsm__MachineT, Minifsm__StateT, Minifsm__TransitionT> {
	Timedminifsm__TimedTransitionT timedTransition(final timedminifsm.TimedTransition t);
	Minifsm__TransitionT transition_timedTransition(final timedminifsm.TimedTransition t);

	default Minifsm__FinalStateT $(final minifsm.FinalState self) {
		return finalState(self);
	}
	default Minifsm__MachineT $(final minifsm.Machine self) {
		return machine(self);
	}
	default Minifsm__StateT $(final minifsm.State self) {
		if (self.eClass().getClassifierID() == minifsm.MinifsmPackage.FINAL_STATE
			&& self.eClass().getEPackage() == minifsm.MinifsmPackage.eINSTANCE)
			return finalState((minifsm.FinalState) self);
		return state(self);
	}
	default Timedminifsm__TimedTransitionT $(final timedminifsm.TimedTransition self) {
		return timedTransition(self);
	}
	default Minifsm__TransitionT $(final minifsm.Transition self) {
		if (self.eClass().getClassifierID() == timedminifsm.TimedminifsmPackage.TIMED_TRANSITION
			&& self.eClass().getEPackage() == timedminifsm.TimedminifsmPackage.eINSTANCE)
			return timedTransition((timedminifsm.TimedTransition) self);
		return transition(self);
	}
}
