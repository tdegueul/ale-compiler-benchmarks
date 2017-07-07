package fsmprinting.revisitor;

public interface FsmprintingRevisitor<Minifsm__FinalStateT extends Minifsm__StateT,Minifsm__MachineT,Minifsm__StateT,Minifsm__TransitionT>
	 extends minifsm.revisitor.MinifsmRevisitor<Minifsm__FinalStateT, Minifsm__MachineT, Minifsm__StateT, Minifsm__TransitionT>
	
	 {
	
	default Minifsm__TransitionT $(final minifsm.Transition self) {
		return transition(self);
	}
	default Minifsm__StateT $(final minifsm.State self) {
		if(self.eClass().getClassifierID() == minifsm.MinifsmPackage.FINAL_STATE && self.eClass().getEPackage() == minifsm.MinifsmPackage.eINSTANCE) return finalState((minifsm.FinalState) self);
		return state(self);
	}
	default Minifsm__MachineT $(final minifsm.Machine self) {
		return machine(self);
	}
	default Minifsm__FinalStateT $(final minifsm.FinalState self) {
		return finalState(self);
	}
}
