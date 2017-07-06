package printexp.revisitor.operation.impl;

public  class PrintexpAndOperationImpl implements printexp.revisitor.operation.PrintexpAndOperation
{
	
	private final boolexp.And self;
	private final printexp.revisitor.PrintexpRevisitor<? extends printexp.revisitor.operation.PrintexpAndOperation, ? extends printexp.revisitor.operation.PrintexpBinaryExpOperation, ? extends printexp.revisitor.operation.PrintexpExpOperation, ? extends printexp.revisitor.operation.PrintexpFalsOperation, ? extends printexp.revisitor.operation.PrintexpLitOperation, ? extends printexp.revisitor.operation.PrintexpOrOperation, ? extends printexp.revisitor.operation.PrintexpTruOperation> alg;
	
	
	public PrintexpAndOperationImpl(boolexp.And self, printexp.revisitor.PrintexpRevisitor<? extends printexp.revisitor.operation.PrintexpAndOperation, ? extends printexp.revisitor.operation.PrintexpBinaryExpOperation, ? extends printexp.revisitor.operation.PrintexpExpOperation, ? extends printexp.revisitor.operation.PrintexpFalsOperation, ? extends printexp.revisitor.operation.PrintexpLitOperation, ? extends printexp.revisitor.operation.PrintexpOrOperation, ? extends printexp.revisitor.operation.PrintexpTruOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public String print() {
		return "(" + alg.$(self.getLhs()).print() + " ∧ " + alg.$(self.getRhs()).print() + ")";
	}
}