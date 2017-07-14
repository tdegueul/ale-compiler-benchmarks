package fsmprinting.revisitor;

import fsmprinting.revisitor.operations.FinalStateOperation;
import fsmprinting.revisitor.operations.MachineOperation;
import fsmprinting.revisitor.operations.StateOperation;
import fsmprinting.revisitor.operations.TransitionOperation;
import minifsm.FinalState;
import minifsm.Machine;
import minifsm.State;
import minifsm.Transition;
import minifsm.revisitor.MinifsmRevisitor;

@SuppressWarnings("all")
public interface FsmprintingRevisitor extends MinifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TransitionOperation> {
  @Override
  public default FinalStateOperation finalState(final FinalState f) {
    return new fsmprinting.revisitor.operations.impl.FinalStateOperationImpl(f, this);
  }
  
  @Override
  public default FinalStateOperation state_finalState(final FinalState f) {
    return new fsmprinting.revisitor.operations.impl.FinalStateOperationImpl(f, this); 
  }
  
  @Override
  public default MachineOperation machine(final Machine m) {
    return new fsmprinting.revisitor.operations.impl.MachineOperationImpl(m, this);
  }
  
  @Override
  public default StateOperation state(final State s) {
    return new fsmprinting.revisitor.operations.impl.StateOperationImpl(s, this);
  }
  
  @Override
  public default TransitionOperation transition(final Transition t) {
    return new fsmprinting.revisitor.operations.impl.TransitionOperationImpl(t, this);
  }
}
