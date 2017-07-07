package printexp.revisitor.operations.impl;

public abstract class ExpOperationImpl implements printexp.revisitor.operations.ExpOperation {
	private final boolexp.Exp self;
	private final boolexp.revisitor.BoolexpRevisitor<? extends printexp.revisitor.operations.AndOperation, ? extends printexp.revisitor.operations.BinaryExpOperation, ? extends printexp.revisitor.operations.ExpOperation, ? extends printexp.revisitor.operations.FalsOperation, ? extends printexp.revisitor.operations.LitOperation, ? extends printexp.revisitor.operations.OrOperation, ? extends printexp.revisitor.operations.TruOperation> alg;


	public ExpOperationImpl(boolexp.Exp self, boolexp.revisitor.BoolexpRevisitor<? extends printexp.revisitor.operations.AndOperation, ? extends printexp.revisitor.operations.BinaryExpOperation, ? extends printexp.revisitor.operations.ExpOperation, ? extends printexp.revisitor.operations.FalsOperation, ? extends printexp.revisitor.operations.LitOperation, ? extends printexp.revisitor.operations.OrOperation, ? extends printexp.revisitor.operations.TruOperation> alg) {
		this.self = self;
		this.alg = alg;
	}

	@Override
	public abstract String print();
}
