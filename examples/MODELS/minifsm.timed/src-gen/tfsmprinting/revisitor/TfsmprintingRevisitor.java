package tfsmprinting.revisitor;

import fsmprinting.revisitor.FsmprintingRevisitor;
import fsmprinting.revisitor.operations.FinalStateOperation;
import fsmprinting.revisitor.operations.MachineOperation;
import fsmprinting.revisitor.operations.StateOperation;
import fsmprinting.revisitor.operations.TransitionOperation;
import minifsm.FinalState;
import minifsm.Machine;
import minifsm.State;
import minifsm.Transition;
import tfsmprinting.revisitor.operations.TimedTransitionOperation;
import timedminifsm.TimedTransition;
import timedminifsm.revisitor.TimedminifsmRevisitor;

@SuppressWarnings("all")
public interface TfsmprintingRevisitor extends TimedminifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TimedTransitionOperation, TransitionOperation>, FsmprintingRevisitor {
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
  public default TimedTransitionOperation timedTransition(final TimedTransition it) {
    return new tfsmprinting.revisitor.operations.impl.TimedTransitionOperationImpl(it, this);
  }
  
  @Override
  public default TransitionOperation transition(final Transition it) {
    return new fsmprinting.revisitor.operations.impl.TransitionOperationImpl(it, this);
  }
}
