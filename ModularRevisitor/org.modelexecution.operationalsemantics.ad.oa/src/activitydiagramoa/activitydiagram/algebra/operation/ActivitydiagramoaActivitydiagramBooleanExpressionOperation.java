package activitydiagramoa.activitydiagram.algebra.operation;

import admodular.BooleanVariable;

public interface ActivitydiagramoaActivitydiagramBooleanExpressionOperation extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramExpressionOperation {
	void assignValue(Boolean value);
	Boolean getCurrentValue(BooleanVariable variable);
}