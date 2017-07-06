package evalexp.revisitor.operation.impl;

public  class EvalexpOrOperationImpl implements evalexp.revisitor.operation.EvalexpOrOperation
{
	
	private final boolexp.Or self;
	private final evalexp.revisitor.EvalexpRevisitor<? extends evalexp.revisitor.operation.EvalexpAndOperation, ? extends evalexp.revisitor.operation.EvalexpBinaryExpOperation, ? extends evalexp.revisitor.operation.EvalexpExpOperation, ? extends evalexp.revisitor.operation.EvalexpFalsOperation, ? extends evalexp.revisitor.operation.EvalexpLitOperation, ? extends evalexp.revisitor.operation.EvalexpOrOperation, ? extends evalexp.revisitor.operation.EvalexpTruOperation> alg;
	
	
	public EvalexpOrOperationImpl(boolexp.Or self, evalexp.revisitor.EvalexpRevisitor<? extends evalexp.revisitor.operation.EvalexpAndOperation, ? extends evalexp.revisitor.operation.EvalexpBinaryExpOperation, ? extends evalexp.revisitor.operation.EvalexpExpOperation, ? extends evalexp.revisitor.operation.EvalexpFalsOperation, ? extends evalexp.revisitor.operation.EvalexpLitOperation, ? extends evalexp.revisitor.operation.EvalexpOrOperation, ? extends evalexp.revisitor.operation.EvalexpTruOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public Boolean eval() {
		return alg.$(self.getLhs()).eval() || alg.$(self.getRhs()).eval();
	}
}