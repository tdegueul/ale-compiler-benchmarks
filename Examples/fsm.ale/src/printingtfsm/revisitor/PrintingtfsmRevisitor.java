package printingtfsm.revisitor;

public interface PrintingtfsmRevisitor<Fsm__FinalStateT extends Fsm__StateT,Fsm__MachineT,Fsm__StateT,Tfsm__TimedTransitionT extends Fsm__TransitionT,Fsm__TransitionT>
	 extends fsm.revisitor.FsmRevisitor<Fsm__FinalStateT, Fsm__MachineT, Fsm__StateT, Fsm__TransitionT>, tfsm.revisitor.TfsmRevisitor<Fsm__FinalStateT, Fsm__MachineT, Fsm__StateT, Tfsm__TimedTransitionT, Fsm__TransitionT>
	, printingfsm.revisitor.PrintingfsmRevisitor<Fsm__FinalStateT, Fsm__MachineT, Fsm__StateT, Fsm__TransitionT>
	
	 {
	
	default Fsm__FinalStateT $(final fsm.FinalState self) {
		return finalState(self);
	}
	default Tfsm__TimedTransitionT $(final tfsm.TimedTransition self) {
		return timedTransition(self);
	}
	default Fsm__MachineT $(final fsm.Machine self) {
		return machine(self);
	}
	default Fsm__TransitionT $(final fsm.Transition self) {
		if(self.eClass().getClassifierID() == tfsm.TfsmPackage.TIMED_TRANSITION && self.eClass().getEPackage() == tfsm.TfsmPackage.eINSTANCE) return timedTransition((tfsm.TimedTransition) self);
		return transition(self);
	}
	default Fsm__StateT $(final fsm.State self) {
		if(self.eClass().getClassifierID() == fsm.FsmPackage.FINAL_STATE && self.eClass().getEPackage() == fsm.FsmPackage.eINSTANCE) return finalState((fsm.FinalState) self);
		return state(self);
	}
}
