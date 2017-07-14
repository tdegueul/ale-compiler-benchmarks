package tfsmprinting.revisitor.operations.impl;

import fsmprinting.revisitor.operations.FinalStateOperation;
import fsmprinting.revisitor.operations.MachineOperation;
import fsmprinting.revisitor.operations.StateOperation;
import fsmprinting.revisitor.operations.TransitionOperation;
import tfsmprinting.revisitor.operations.TimedTransitionOperation;
import timedminifsm.TimedTransition;
import timedminifsm.revisitor.TimedminifsmRevisitor;

@SuppressWarnings("all")
public class TimedTransitionOperationImpl implements TimedTransitionOperation {
  private TimedTransition obj;
  
  private TimedminifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TimedTransitionOperation, TransitionOperation> alg;
  
  public TimedTransitionOperationImpl(final TimedTransition obj, final TimedminifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TimedTransitionOperation, TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _print = this.alg.transition(this.obj).print();
    String _plus = (_print + " @ ");
    int _time = this.obj.getTime();
    return (_plus + Integer.valueOf(_time));
  }
}
