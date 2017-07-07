package evalexp.revisitor.operations.impl;

public abstract class ExpOperationImpl implements evalexp.revisitor.operations.ExpOperation {
	private final boolexp.Exp self;
	private final boolexp.revisitor.BoolexpRevisitor<? extends evalexp.revisitor.operations.AndOperation, ? extends evalexp.revisitor.operations.BinaryExpOperation, ? extends evalexp.revisitor.operations.ExpOperation, ? extends evalexp.revisitor.operations.FalsOperation, ? extends evalexp.revisitor.operations.LitOperation, ? extends evalexp.revisitor.operations.OrOperation, ? extends evalexp.revisitor.operations.TruOperation> alg;


	public ExpOperationImpl(boolexp.Exp self, boolexp.revisitor.BoolexpRevisitor<? extends evalexp.revisitor.operations.AndOperation, ? extends evalexp.revisitor.operations.BinaryExpOperation, ? extends evalexp.revisitor.operations.ExpOperation, ? extends evalexp.revisitor.operations.FalsOperation, ? extends evalexp.revisitor.operations.LitOperation, ? extends evalexp.revisitor.operations.OrOperation, ? extends evalexp.revisitor.operations.TruOperation> alg) {
		this.self = self;
		this.alg = alg;
	}

	@Override
	public abstract Boolean eval();
}
