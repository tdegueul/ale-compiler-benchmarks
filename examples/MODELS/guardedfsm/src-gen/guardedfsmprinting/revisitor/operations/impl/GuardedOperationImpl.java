package guardedfsmprinting.revisitor.operations.impl;

import fsmprinting.revisitor.operations.FinalStateOperation;
import fsmprinting.revisitor.operations.MachineOperation;
import fsmprinting.revisitor.operations.StateOperation;
import fsmprinting.revisitor.operations.TransitionOperation;
import guardedfsm.Guarded;
import guardedfsm.revisitor.GuardedfsmRevisitor;
import guardedfsmprinting.revisitor.operations.GuardedOperation;
import printexp.revisitor.operations.AndOperation;
import printexp.revisitor.operations.ExpOperation;
import printexp.revisitor.operations.FalsOperation;
import printexp.revisitor.operations.OrOperation;
import printexp.revisitor.operations.TruOperation;

@SuppressWarnings("all")
public class GuardedOperationImpl implements GuardedOperation {
  private Guarded obj;
  
  private GuardedfsmRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, FinalStateOperation, GuardedOperation, ExpOperation, MachineOperation, OrOperation, StateOperation, TransitionOperation, TruOperation> alg;
  
  public GuardedOperationImpl(final Guarded obj, final GuardedfsmRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, FinalStateOperation, GuardedOperation, ExpOperation, MachineOperation, OrOperation, StateOperation, TransitionOperation, TruOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _print = this.alg.transition(this.obj).print();
    String _plus = (_print + " [");
    String _print_1 = this.alg.$(this.obj.getGuard()).print();
    String _plus_1 = (_plus + _print_1);
    return (_plus_1 + "]");
  }
}
