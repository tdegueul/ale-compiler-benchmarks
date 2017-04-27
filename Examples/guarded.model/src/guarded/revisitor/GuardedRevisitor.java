package guarded.revisitor;

public interface GuardedRevisitor<Exp__ExpressionT,Fsm__FinalStateT extends Fsm__StateT,Guarded__GuardedT extends Fsm__TransitionT,Fsm__MachineT,Fsm__StateT,Fsm__TransitionT>
	 extends exp.revisitor.ExpRevisitor<Exp__ExpressionT>, fsm.revisitor.FsmRevisitor<Fsm__FinalStateT, Fsm__MachineT, Fsm__StateT, Fsm__TransitionT>
	
	 {
Guarded__GuardedT guarded(final guarded.Guarded guarded);
Fsm__TransitionT transition_guarded(final guarded.Guarded guarded);

	
	default Guarded__GuardedT $(final guarded.Guarded self) {
		return guarded(self);
	}
	default Exp__ExpressionT $(final exp.Expression self) {
		return expression(self);
	}
	default Fsm__FinalStateT $(final fsm.FinalState self) {
		return finalState(self);
	}
	default Fsm__TransitionT $(final fsm.Transition self) {
		if(self.eClass().getClassifierID() == guarded.GuardedPackage.GUARDED && self.eClass().getEPackage() == guarded.GuardedPackage.eINSTANCE) return guarded((guarded.Guarded) self);
		return transition(self);
	}
	default Fsm__MachineT $(final fsm.Machine self) {
		return machine(self);
	}
	default Fsm__StateT $(final fsm.State self) {
		if(self.eClass().getClassifierID() == fsm.FsmPackage.FINAL_STATE && self.eClass().getEPackage() == fsm.FsmPackage.eINSTANCE) return finalState((fsm.FinalState) self);
		return state(self);
	}
}
