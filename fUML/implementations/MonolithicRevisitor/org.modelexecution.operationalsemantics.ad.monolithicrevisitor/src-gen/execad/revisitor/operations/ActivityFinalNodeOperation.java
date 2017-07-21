package execad.revisitor.operations;

import activitydiagram.Token;
import execad.revisitor.operations.ActivityNodeOperation;
import java.util.List;

@SuppressWarnings("all")
public interface ActivityFinalNodeOperation extends ActivityNodeOperation {
  public abstract void fire(final List<Token> tokens);
}
