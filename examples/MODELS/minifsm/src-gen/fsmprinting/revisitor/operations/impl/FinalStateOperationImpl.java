package fsmprinting.revisitor.operations.impl;

import fsmprinting.revisitor.operations.FinalStateOperation;
import fsmprinting.revisitor.operations.MachineOperation;
import fsmprinting.revisitor.operations.StateOperation;
import fsmprinting.revisitor.operations.TransitionOperation;
import fsmprinting.revisitor.operations.impl.StateOperationImpl;
import minifsm.FinalState;
import minifsm.revisitor.MinifsmRevisitor;

@SuppressWarnings("all")
public class FinalStateOperationImpl extends StateOperationImpl implements FinalStateOperation {
  private FinalState obj;
  
  private MinifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public FinalStateOperationImpl(final FinalState obj, final MinifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _print = this.alg.state(this.obj).print();
    return ("* " + _print);
  }
}
