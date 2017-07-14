package fsmprinting.revisitor.operations;

import fsmprinting.revisitor.operations.StateOperation;

@SuppressWarnings("all")
public interface FinalStateOperation extends StateOperation {
  public abstract String print();
}
