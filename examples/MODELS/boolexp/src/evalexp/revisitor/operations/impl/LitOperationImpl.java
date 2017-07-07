package evalexp.revisitor.operations.impl;

public abstract class LitOperationImpl implements evalexp.revisitor.operations.LitOperation {
	private final boolexp.Lit self;
	private final boolexp.revisitor.BoolexpRevisitor<? extends evalexp.revisitor.operations.AndOperation, ? extends evalexp.revisitor.operations.BinaryExpOperation, ? extends evalexp.revisitor.operations.ExpOperation, ? extends evalexp.revisitor.operations.FalsOperation, ? extends evalexp.revisitor.operations.LitOperation, ? extends evalexp.revisitor.operations.OrOperation, ? extends evalexp.revisitor.operations.TruOperation> alg;


	public LitOperationImpl(boolexp.Lit self, boolexp.revisitor.BoolexpRevisitor<? extends evalexp.revisitor.operations.AndOperation, ? extends evalexp.revisitor.operations.BinaryExpOperation, ? extends evalexp.revisitor.operations.ExpOperation, ? extends evalexp.revisitor.operations.FalsOperation, ? extends evalexp.revisitor.operations.LitOperation, ? extends evalexp.revisitor.operations.OrOperation, ? extends evalexp.revisitor.operations.TruOperation> alg) {
		this.self = self;
		this.alg = alg;
	}

	@Override
	public abstract Boolean eval();
}
