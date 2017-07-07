package monolithicactivitydiagram.revisitor.operations;

public interface IntegerExpressionOperation extends monolithicactivitydiagram.revisitor.operations.ExpressionOperation {
	Integer getCurrentValue(activitydiagram.Variable variable);
}
