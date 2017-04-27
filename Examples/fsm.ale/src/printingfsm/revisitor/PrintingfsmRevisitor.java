package printingfsm.revisitor;

public interface PrintingfsmRevisitor<Fsm__FinalStateT extends Fsm__StateT,Fsm__MachineT,Fsm__StateT,Fsm__TransitionT>
	 extends fsm.revisitor.FsmRevisitor<Fsm__FinalStateT, Fsm__MachineT, Fsm__StateT, Fsm__TransitionT>
	
	 {
	
	default Fsm__TransitionT $(final fsm.Transition self) {
		return transition(self);
	}
	default Fsm__FinalStateT $(final fsm.FinalState self) {
		return finalState(self);
	}
	default Fsm__StateT $(final fsm.State self) {
		if(self.eClass().getClassifierID() == fsm.FsmPackage.FINAL_STATE && self.eClass().getEPackage() == fsm.FsmPackage.eINSTANCE) return finalState((fsm.FinalState) self);
		return state(self);
	}
	default Fsm__MachineT $(final fsm.Machine self) {
		return machine(self);
	}
}
