package tfsmprinting.revisitor.operations;

import fsmprinting.revisitor.operations.TransitionOperation;

@SuppressWarnings("all")
public interface TimedTransitionOperation extends TransitionOperation {
  public abstract String print();
}
