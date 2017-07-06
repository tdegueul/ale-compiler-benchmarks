package evalexp.revisitor.operation.impl;

public class EvalexpExpressionOperationImpl implements evalexp.revisitor.operation.EvalexpExpressionOperation
{
	
	private final exp.Expression self;
	private final evalexp.revisitor.EvalexpRevisitor<? extends evalexp.revisitor.operation.EvalexpExpressionOperation> alg;
	
	
	public EvalexpExpressionOperationImpl(exp.Expression self, evalexp.revisitor.EvalexpRevisitor<? extends evalexp.revisitor.operation.EvalexpExpressionOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public Boolean eval() {
		return true;
	}
}