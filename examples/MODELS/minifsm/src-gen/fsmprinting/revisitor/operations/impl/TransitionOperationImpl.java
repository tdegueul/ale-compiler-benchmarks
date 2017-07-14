package fsmprinting.revisitor.operations.impl;

import fsmprinting.revisitor.operations.FinalStateOperation;
import fsmprinting.revisitor.operations.MachineOperation;
import fsmprinting.revisitor.operations.StateOperation;
import fsmprinting.revisitor.operations.TransitionOperation;
import minifsm.Transition;
import minifsm.revisitor.MinifsmRevisitor;

@SuppressWarnings("all")
public class TransitionOperationImpl implements TransitionOperation {
  private Transition obj;
  
  private MinifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TransitionOperation> alg;
  
  public TransitionOperationImpl(final Transition obj, final MinifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TransitionOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    char _event = this.obj.getEvent();
    String _plus = (Character.valueOf(_event) + " => ");
    String _name = this.obj.getTgt().getName();
    return (_plus + _name);
  }
}
