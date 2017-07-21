package execad.revisitor.operations;

import activitydiagram.Value;
import execad.revisitor.operations.VariableOperation;

@SuppressWarnings("all")
public interface BooleanVariableOperation extends VariableOperation {
  public abstract Value getCurrentValue();
  
  public abstract void setCurrentValue(final Value value);
}
