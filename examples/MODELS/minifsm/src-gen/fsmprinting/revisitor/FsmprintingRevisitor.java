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
  public default FinalStateOperation finalState(final FinalState it) {
    return new fsmprinting.revisitor.operations.impl.FinalStateOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation machine(final Machine it) {
    return new fsmprinting.revisitor.operations.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation state(final State it) {
    return new fsmprinting.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransitionOperation transition(final Transition it) {
    return new fsmprinting.revisitor.operations.impl.TransitionOperationImpl(it, this);
  }
}
