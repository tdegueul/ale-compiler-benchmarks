package printexp.revisitor.operation.impl;

public class PrintexpOrOperationImpl implements printexp.revisitor.operation.PrintexpOrOperation
{
	
	private final boolexp.Or self;
	private final printexp.revisitor.PrintexpRevisitor<? extends printexp.revisitor.operation.PrintexpAndOperation, ? extends printexp.revisitor.operation.PrintexpBinaryExpOperation, ? extends printexp.revisitor.operation.PrintexpExpOperation, ? extends printexp.revisitor.operation.PrintexpFalsOperation, ? extends printexp.revisitor.operation.PrintexpLitOperation, ? extends printexp.revisitor.operation.PrintexpOrOperation, ? extends printexp.revisitor.operation.PrintexpTruOperation> alg;
	
	
	public PrintexpOrOperationImpl(boolexp.Or self, printexp.revisitor.PrintexpRevisitor<? extends printexp.revisitor.operation.PrintexpAndOperation, ? extends printexp.revisitor.operation.PrintexpBinaryExpOperation, ? extends printexp.revisitor.operation.PrintexpExpOperation, ? extends printexp.revisitor.operation.PrintexpFalsOperation, ? extends printexp.revisitor.operation.PrintexpLitOperation, ? extends printexp.revisitor.operation.PrintexpOrOperation, ? extends printexp.revisitor.operation.PrintexpTruOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public String print() {
		return "(" + alg.$(self.getLhs()).print() + " ∨ " + alg.$(self.getRhs()).print() + ")";
	}
}