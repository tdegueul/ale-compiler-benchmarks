package modularactivitydiagram.revisitor.operations;

public interface BooleanExpression_AspectOperation extends modularactivitydiagram.revisitor.operations.BooleanExpressionOperation, modularactivitydiagram.revisitor.operations.ExpressionOperation {
	void assignValue(Boolean value);
	Boolean getCurrentValue(adwithoutruntime.BooleanVariable variable);
}
