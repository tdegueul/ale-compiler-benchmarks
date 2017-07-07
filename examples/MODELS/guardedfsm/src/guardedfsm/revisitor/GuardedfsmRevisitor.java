package guardedfsm.revisitor;

public interface GuardedfsmRevisitor<Boolexp__AndT extends Boolexp__BinaryExpT,Boolexp__BinaryExpT extends Boolexp__ExpT,Boolexp__ExpT,Boolexp__FalsT extends Boolexp__LitT,Minifsm__FinalStateT extends Minifsm__StateT,Guardedfsm__GuardedT extends Minifsm__TransitionT,Boolexp__LitT extends Boolexp__ExpT,Minifsm__MachineT,Boolexp__OrT extends Boolexp__BinaryExpT,Minifsm__StateT,Minifsm__TransitionT,Boolexp__TruT extends Boolexp__LitT>
	 extends boolexp.revisitor.BoolexpRevisitor<Boolexp__AndT, Boolexp__BinaryExpT, Boolexp__ExpT, Boolexp__FalsT, Boolexp__LitT, Boolexp__OrT, Boolexp__TruT>, minifsm.revisitor.MinifsmRevisitor<Minifsm__FinalStateT, Minifsm__MachineT, Minifsm__StateT, Minifsm__TransitionT>
	
	 {
Guardedfsm__GuardedT guarded(final guardedfsm.Guarded guarded);
Minifsm__TransitionT transition_guarded(final guardedfsm.Guarded guarded);

	
	default Minifsm__MachineT $(final minifsm.Machine self) {
		return machine(self);
	}
	default Guardedfsm__GuardedT $(final guardedfsm.Guarded self) {
		return guarded(self);
	}
	default Boolexp__BinaryExpT $(final boolexp.BinaryExp self) {
		if(self.eClass().getClassifierID() == boolexp.BoolexpPackage.AND && self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE) return and((boolexp.And) self);
		if(self.eClass().getClassifierID() == boolexp.BoolexpPackage.OR && self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE) return or((boolexp.Or) self);
		return null;
	}
	default Boolexp__FalsT $(final boolexp.Fals self) {
		return fals(self);
	}
	default Boolexp__LitT $(final boolexp.Lit self) {
		if(self.eClass().getClassifierID() == boolexp.BoolexpPackage.FALS && self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE) return fals((boolexp.Fals) self);
		if(self.eClass().getClassifierID() == boolexp.BoolexpPackage.TRU && self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE) return tru((boolexp.Tru) self);
		return null;
	}
	default Minifsm__StateT $(final minifsm.State self) {
		if(self.eClass().getClassifierID() == minifsm.MinifsmPackage.FINAL_STATE && self.eClass().getEPackage() == minifsm.MinifsmPackage.eINSTANCE) return finalState((minifsm.FinalState) self);
		return state(self);
	}
	default Boolexp__AndT $(final boolexp.And self) {
		return and(self);
	}
	default Boolexp__ExpT $(final boolexp.Exp self) {
		if(self.eClass().getClassifierID() == boolexp.BoolexpPackage.FALS && self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE) return fals((boolexp.Fals) self);
		if(self.eClass().getClassifierID() == boolexp.BoolexpPackage.TRU && self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE) return tru((boolexp.Tru) self);
		if(self.eClass().getClassifierID() == boolexp.BoolexpPackage.AND && self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE) return and((boolexp.And) self);
		if(self.eClass().getClassifierID() == boolexp.BoolexpPackage.OR && self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE) return or((boolexp.Or) self);
		return null;
	}
	default Minifsm__TransitionT $(final minifsm.Transition self) {
		if(self.eClass().getClassifierID() == guardedfsm.GuardedfsmPackage.GUARDED && self.eClass().getEPackage() == guardedfsm.GuardedfsmPackage.eINSTANCE) return guarded((guardedfsm.Guarded) self);
		return transition(self);
	}
	default Boolexp__TruT $(final boolexp.Tru self) {
		return tru(self);
	}
	default Minifsm__FinalStateT $(final minifsm.FinalState self) {
		return finalState(self);
	}
	default Boolexp__OrT $(final boolexp.Or self) {
		return or(self);
	}
}
