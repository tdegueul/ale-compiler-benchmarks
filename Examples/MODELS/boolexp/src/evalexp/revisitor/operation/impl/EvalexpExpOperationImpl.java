package evalexp.revisitor.operation.impl;

public abstract class EvalexpExpOperationImpl implements evalexp.revisitor.operation.EvalexpExpOperation
{
	
	private final boolexp.Exp self;
	private final evalexp.revisitor.EvalexpRevisitor<? extends evalexp.revisitor.operation.EvalexpAndOperation, ? extends evalexp.revisitor.operation.EvalexpBinaryExpOperation, ? extends evalexp.revisitor.operation.EvalexpExpOperation, ? extends evalexp.revisitor.operation.EvalexpFalsOperation, ? extends evalexp.revisitor.operation.EvalexpLitOperation, ? extends evalexp.revisitor.operation.EvalexpOrOperation, ? extends evalexp.revisitor.operation.EvalexpTruOperation> alg;
	
	
	public EvalexpExpOperationImpl(boolexp.Exp self, evalexp.revisitor.EvalexpRevisitor<? extends evalexp.revisitor.operation.EvalexpAndOperation, ? extends evalexp.revisitor.operation.EvalexpBinaryExpOperation, ? extends evalexp.revisitor.operation.EvalexpExpOperation, ? extends evalexp.revisitor.operation.EvalexpFalsOperation, ? extends evalexp.revisitor.operation.EvalexpLitOperation, ? extends evalexp.revisitor.operation.EvalexpOrOperation, ? extends evalexp.revisitor.operation.EvalexpTruOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public abstract Boolean eval();
}