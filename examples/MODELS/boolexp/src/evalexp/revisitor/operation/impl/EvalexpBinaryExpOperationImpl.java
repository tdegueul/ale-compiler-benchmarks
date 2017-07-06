package evalexp.revisitor.operation.impl;

public abstract class EvalexpBinaryExpOperationImpl implements evalexp.revisitor.operation.EvalexpBinaryExpOperation
{
	
	private final boolexp.BinaryExp self;
	private final evalexp.revisitor.EvalexpRevisitor<? extends evalexp.revisitor.operation.EvalexpAndOperation, ? extends evalexp.revisitor.operation.EvalexpBinaryExpOperation, ? extends evalexp.revisitor.operation.EvalexpExpOperation, ? extends evalexp.revisitor.operation.EvalexpFalsOperation, ? extends evalexp.revisitor.operation.EvalexpLitOperation, ? extends evalexp.revisitor.operation.EvalexpOrOperation, ? extends evalexp.revisitor.operation.EvalexpTruOperation> alg;
	
	
	public EvalexpBinaryExpOperationImpl(boolexp.BinaryExp self, evalexp.revisitor.EvalexpRevisitor<? extends evalexp.revisitor.operation.EvalexpAndOperation, ? extends evalexp.revisitor.operation.EvalexpBinaryExpOperation, ? extends evalexp.revisitor.operation.EvalexpExpOperation, ? extends evalexp.revisitor.operation.EvalexpFalsOperation, ? extends evalexp.revisitor.operation.EvalexpLitOperation, ? extends evalexp.revisitor.operation.EvalexpOrOperation, ? extends evalexp.revisitor.operation.EvalexpTruOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public abstract Boolean eval();
}