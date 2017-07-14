package fsmprinting.revisitor.operations.impl;

import fsmprinting.revisitor.operations.FinalStateOperation;
import fsmprinting.revisitor.operations.MachineOperation;
import fsmprinting.revisitor.operations.StateOperation;
import fsmprinting.revisitor.operations.TransitionOperation;
import minifsm.FinalState;
import minifsm.revisitor.MinifsmRevisitor;

@SuppressWarnings("all")
public class FinalStateOperationImpl implements FinalStateOperation {
  private FinalState obj;
  
  private MinifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public FinalStateOperationImpl(final FinalState obj, final MinifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _print = this.alg.state(this.obj).print();
    return ("* " + _print);
  }
}
