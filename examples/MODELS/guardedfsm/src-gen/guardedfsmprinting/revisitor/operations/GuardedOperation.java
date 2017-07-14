package guardedfsmprinting.revisitor.operations;

import fsmprinting.revisitor.operations.TransitionOperation;

@SuppressWarnings("all")
public interface GuardedOperation extends TransitionOperation {
  public abstract String print();
}
