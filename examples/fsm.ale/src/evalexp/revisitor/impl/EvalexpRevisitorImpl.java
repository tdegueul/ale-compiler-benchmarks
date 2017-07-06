package evalexp.revisitor.impl;

public interface EvalexpRevisitorImpl extends evalexp.revisitor.EvalexpRevisitor
	<evalexp.revisitor.operation.EvalexpExpressionOperation> {
	@Override
	default evalexp.revisitor.operation.EvalexpExpressionOperation expression(final exp.Expression expression) {
		return new evalexp.revisitor.operation.impl.EvalexpExpressionOperationImpl(expression, this);
	} 
}
