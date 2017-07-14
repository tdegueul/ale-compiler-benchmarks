package guardedfsmprinting.revisitor;

import fsmprinting.revisitor.FsmprintingRevisitor;
import fsmprinting.revisitor.operations.FinalStateOperation;
import fsmprinting.revisitor.operations.MachineOperation;
import fsmprinting.revisitor.operations.StateOperation;
import fsmprinting.revisitor.operations.TransitionOperation;
import guardedfsm.Guarded;
import guardedfsm.revisitor.GuardedfsmRevisitor;
import guardedfsmprinting.revisitor.operations.GuardedOperation;
import printexp.revisitor.PrintexpRevisitor;
import printexp.revisitor.operations.AndOperation;
import printexp.revisitor.operations.ExpOperation;
import printexp.revisitor.operations.FalsOperation;
import printexp.revisitor.operations.OrOperation;
import printexp.revisitor.operations.TruOperation;

@SuppressWarnings("all")
public interface GuardedfsmprintingRevisitor extends GuardedfsmRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, FinalStateOperation, GuardedOperation, ExpOperation, MachineOperation, OrOperation, StateOperation, TransitionOperation, TruOperation>, FsmprintingRevisitor, PrintexpRevisitor {
  @Override
  public default GuardedOperation guarded(final Guarded g) {
    return new guardedfsmprinting.revisitor.operations.impl.GuardedOperationImpl(g, this);
  }
  
  @Override
  public default GuardedOperation transition_guarded(final Guarded g) {
    return new guardedfsmprinting.revisitor.operations.impl.GuardedOperationImpl(g, this); 
  }
}
