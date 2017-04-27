package admodular.modularrevisitor.algebra.operation;

public interface AdmodularModularrevisitorBooleanExpressionOperation extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorExpressionOperation {
	void assignValue(Boolean value);
	Boolean getCurrentValue(admodular.BooleanVariable variable);
}