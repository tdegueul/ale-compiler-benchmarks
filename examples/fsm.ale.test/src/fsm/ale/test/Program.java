package fsm.ale.test;

import fsm.FinalState;
import fsm.FsmFactory;
import fsm.Machine;
import fsm.State;
import fsm.Transition;
import printingfsm.revisitor.impl.PrintingfsmRevisitorImpl;
import printingtfsm.revisitor.impl.PrintingtfsmRevisitorImpl;
import tfsm.TfsmFactory;
import tfsm.TimedTransition;

public class Program {
	public static void main(final String[] args) {
		final PrintingfsmRevisitorImpl algFsm = new PrintingfsmRevisitorImpl() {
		};

		final Machine machine = FsmFactory.eINSTANCE.createMachine();
		final State s0 = FsmFactory.eINSTANCE.createState();
		s0.setName("s0");
		machine.getStates().add(s0);
		final FinalState s1 = FsmFactory.eINSTANCE.createFinalState();
		s1.setName("s1");
		machine.getStates().add(s1);

		System.out.println(algFsm.$(machine).print());

		PrintingtfsmRevisitorImpl algTFsm = new PrintingtfsmRevisitorImpl() {
		};

		Transition t01 = FsmFactory.eINSTANCE.createTransition();
		t01.setEvent("t01");
		t01.setTgt(s1);
		machine.getTransitions().add(t01);

		TimedTransition t02 = TfsmFactory.eINSTANCE.createTimedTransition();
		t02.setEvent("t02");
		t02.setTgt(s0);
		t02.setTime(5);
		machine.getTransitions().add(t02);

		System.out.println(algTFsm.$(t01).print());
		System.out.println(algTFsm.$(t02).print());

	}
}
