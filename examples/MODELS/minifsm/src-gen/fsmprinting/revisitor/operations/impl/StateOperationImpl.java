package fsmprinting.revisitor.operations.impl;

import fsmprinting.revisitor.operations.FinalStateOperation;
import fsmprinting.revisitor.operations.MachineOperation;
import fsmprinting.revisitor.operations.StateOperation;
import fsmprinting.revisitor.operations.TransitionOperation;
import minifsm.State;
import minifsm.Transition;
import minifsm.revisitor.MinifsmRevisitor;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class StateOperationImpl implements StateOperation {
  private State obj;
  
  private MinifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public StateOperationImpl(final State obj, final MinifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _name = this.obj.getName();
    String _plus = ("State " + _name);
    String _plus_1 = (_plus + "\n");
    final Function1<Transition, String> _function = (Transition t) -> {
      String _print = this.alg.$(t).print();
      return ("\t" + _print);
    };
    String _join = IterableExtensions.join(ListExtensions.<Transition, String>map(this.obj.getOut(), _function), "\n");
    return (_plus_1 + _join);
  }
}
