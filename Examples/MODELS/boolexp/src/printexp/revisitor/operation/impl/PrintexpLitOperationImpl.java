package printexp.revisitor.operation.impl;

public abstract class PrintexpLitOperationImpl implements printexp.revisitor.operation.PrintexpLitOperation
{
	
	private final boolexp.Lit self;
	private final printexp.revisitor.PrintexpRevisitor<? extends printexp.revisitor.operation.PrintexpAndOperation, ? extends printexp.revisitor.operation.PrintexpBinaryExpOperation, ? extends printexp.revisitor.operation.PrintexpExpOperation, ? extends printexp.revisitor.operation.PrintexpFalsOperation, ? extends printexp.revisitor.operation.PrintexpLitOperation, ? extends printexp.revisitor.operation.PrintexpOrOperation, ? extends printexp.revisitor.operation.PrintexpTruOperation> alg;
	
	
	public PrintexpLitOperationImpl(boolexp.Lit self, printexp.revisitor.PrintexpRevisitor<? extends printexp.revisitor.operation.PrintexpAndOperation, ? extends printexp.revisitor.operation.PrintexpBinaryExpOperation, ? extends printexp.revisitor.operation.PrintexpExpOperation, ? extends printexp.revisitor.operation.PrintexpFalsOperation, ? extends printexp.revisitor.operation.PrintexpLitOperation, ? extends printexp.revisitor.operation.PrintexpOrOperation, ? extends printexp.revisitor.operation.PrintexpTruOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
	}
	@Override
	public abstract String print();
}