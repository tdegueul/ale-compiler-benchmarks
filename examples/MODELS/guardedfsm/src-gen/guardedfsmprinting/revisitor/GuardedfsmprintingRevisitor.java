package guardedfsmprinting.revisitor;

import boolexp.And;
import boolexp.Fals;
import boolexp.Or;
import boolexp.Tru;
import fsmprinting.revisitor.FsmprintingRevisitor;
import fsmprinting.revisitor.operations.FinalStateOperation;
import fsmprinting.revisitor.operations.MachineOperation;
import fsmprinting.revisitor.operations.StateOperation;
import fsmprinting.revisitor.operations.TransitionOperation;
import guardedfsm.Guarded;
import guardedfsm.revisitor.GuardedfsmRevisitor;
import guardedfsmprinting.revisitor.operations.GuardedOperation;
import minifsm.FinalState;
import minifsm.Machine;
import minifsm.State;
import minifsm.Transition;
import printexp.revisitor.PrintexpRevisitor;
import printexp.revisitor.operations.AndOperation;
import printexp.revisitor.operations.ExpOperation;
import printexp.revisitor.operations.FalsOperation;
import printexp.revisitor.operations.OrOperation;
import printexp.revisitor.operations.TruOperation;

@SuppressWarnings("all")
public interface GuardedfsmprintingRevisitor extends GuardedfsmRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, FinalStateOperation, GuardedOperation, ExpOperation, MachineOperation, OrOperation, StateOperation, TransitionOperation, TruOperation>, FsmprintingRevisitor, PrintexpRevisitor {
  @Override
  public default AndOperation and(final And it) {
    return new printexp.revisitor.operations.impl.AndOperationImpl(it, this);
  }
  
  @Override
  public default FalsOperation fals(final Fals it) {
    return new printexp.revisitor.operations.impl.FalsOperationImpl(it, this);
  }
  
  @Override
  public default FinalStateOperation finalState(final FinalState it) {
    return new fsmprinting.revisitor.operations.impl.FinalStateOperationImpl(it, this);
  }
  
  @Override
  public default GuardedOperation guarded(final Guarded it) {
    return new guardedfsmprinting.revisitor.operations.impl.GuardedOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation machine(final Machine it) {
    return new fsmprinting.revisitor.operations.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default OrOperation or(final Or it) {
    return new printexp.revisitor.operations.impl.OrOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation state(final State it) {
    return new fsmprinting.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransitionOperation transition(final Transition it) {
    return new fsmprinting.revisitor.operations.impl.TransitionOperationImpl(it, this);
  }
  
  @Override
  public default TruOperation tru(final Tru it) {
    return new printexp.revisitor.operations.impl.TruOperationImpl(it, this);
  }
}
