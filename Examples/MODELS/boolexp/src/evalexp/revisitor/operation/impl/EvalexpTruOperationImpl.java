package evalexp.revisitor.operation.impl;

public class EvalexpTruOperationImpl implements evalexp.revisitor.operation.EvalexpTruOperation
{
	
	private final boolexp.Tru self;
	private final evalexp.revisitor.EvalexpRevisitor<? extends evalexp.revisitor.operation.EvalexpAndOperation, ? extends evalexp.revisitor.operation.EvalexpBinaryExpOperation, ? extends evalexp.revisitor.operation.EvalexpExpOperation, ? extends evalexp.revisitor.operation.EvalexpFalsOperation, ? extends evalexp.revisitor.operation.EvalexpLitOperation, ? extends evalexp.revisitor.operation.EvalexpOrOperation, ? extends evalexp.revisitor.operation.EvalexpTruOperation> alg;
	
	
	public EvalexpTruOperationImpl(boolexp.Tru self, evalexp.revisitor.EvalexpRevisitor<? extends evalexp.revisitor.operation.EvalexpAndOperation, ? extends evalexp.revisitor.operation.EvalexpBinaryExpOperation, ? extends evalexp.revisitor.operation.EvalexpExpOperation, ? extends evalexp.revisitor.operation.EvalexpFalsOperation, ? extends evalexp.revisitor.operation.EvalexpLitOperation, ? extends evalexp.revisitor.operation.EvalexpOrOperation, ? extends evalexp.revisitor.operation.EvalexpTruOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public Boolean eval() {
		return true;
	}
}