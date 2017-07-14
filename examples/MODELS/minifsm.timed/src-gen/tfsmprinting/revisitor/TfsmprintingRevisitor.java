package tfsmprinting.revisitor;

import fsmprinting.revisitor.FsmprintingRevisitor;
import fsmprinting.revisitor.operations.FinalStateOperation;
import fsmprinting.revisitor.operations.MachineOperation;
import fsmprinting.revisitor.operations.StateOperation;
import fsmprinting.revisitor.operations.TransitionOperation;
import tfsmprinting.revisitor.operations.TimedTransitionOperation;
import timedminifsm.TimedTransition;
import timedminifsm.revisitor.TimedminifsmRevisitor;

@SuppressWarnings("all")
public interface TfsmprintingRevisitor extends TimedminifsmRevisitor<FinalStateOperation, MachineOperation, StateOperation, TimedTransitionOperation, TransitionOperation>, FsmprintingRevisitor {
  @Override
  public default TimedTransitionOperation timedTransition(final TimedTransition t) {
    return new tfsmprinting.revisitor.operations.impl.TimedTransitionOperationImpl(t, this);
  }
  
  @Override
  public default TimedTransitionOperation transition_timedTransition(final TimedTransition t) {
    return new tfsmprinting.revisitor.operations.impl.TimedTransitionOperationImpl(t, this); 
  }
}
