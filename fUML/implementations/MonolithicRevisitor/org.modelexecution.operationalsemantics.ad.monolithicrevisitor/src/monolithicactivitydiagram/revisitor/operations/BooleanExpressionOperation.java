package monolithicactivitydiagram.revisitor.operations;

public interface BooleanExpressionOperation extends monolithicactivitydiagram.revisitor.operations.ExpressionOperation {
	void assignValue(Boolean value);
	Boolean getCurrentValue(activitydiagram.BooleanVariable variable);
}
