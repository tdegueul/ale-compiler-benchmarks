package evalexp.revisitor.operation.impl;

public abstract class EvalexpLitOperationImpl implements evalexp.revisitor.operation.EvalexpLitOperation
{
	
	private final boolexp.Lit self;
	private final evalexp.revisitor.EvalexpRevisitor<? extends evalexp.revisitor.operation.EvalexpAndOperation, ? extends evalexp.revisitor.operation.EvalexpBinaryExpOperation, ? extends evalexp.revisitor.operation.EvalexpExpOperation, ? extends evalexp.revisitor.operation.EvalexpFalsOperation, ? extends evalexp.revisitor.operation.EvalexpLitOperation, ? extends evalexp.revisitor.operation.EvalexpOrOperation, ? extends evalexp.revisitor.operation.EvalexpTruOperation> alg;
	
	
	public EvalexpLitOperationImpl(boolexp.Lit self, evalexp.revisitor.EvalexpRevisitor<? extends evalexp.revisitor.operation.EvalexpAndOperation, ? extends evalexp.revisitor.operation.EvalexpBinaryExpOperation, ? extends evalexp.revisitor.operation.EvalexpExpOperation, ? extends evalexp.revisitor.operation.EvalexpFalsOperation, ? extends evalexp.revisitor.operation.EvalexpLitOperation, ? extends evalexp.revisitor.operation.EvalexpOrOperation, ? extends evalexp.revisitor.operation.EvalexpTruOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public abstract Boolean eval();
}