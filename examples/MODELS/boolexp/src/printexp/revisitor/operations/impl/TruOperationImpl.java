package printexp.revisitor.operations.impl;

public class TruOperationImpl implements printexp.revisitor.operations.TruOperation {
	private final boolexp.Tru self;
	private final boolexp.revisitor.BoolexpRevisitor<? extends printexp.revisitor.operations.AndOperation, ? extends printexp.revisitor.operations.BinaryExpOperation, ? extends printexp.revisitor.operations.ExpOperation, ? extends printexp.revisitor.operations.FalsOperation, ? extends printexp.revisitor.operations.LitOperation, ? extends printexp.revisitor.operations.OrOperation, ? extends printexp.revisitor.operations.TruOperation> alg;


	public TruOperationImpl(boolexp.Tru self, boolexp.revisitor.BoolexpRevisitor<? extends printexp.revisitor.operations.AndOperation, ? extends printexp.revisitor.operations.BinaryExpOperation, ? extends printexp.revisitor.operations.ExpOperation, ? extends printexp.revisitor.operations.FalsOperation, ? extends printexp.revisitor.operations.LitOperation, ? extends printexp.revisitor.operations.OrOperation, ? extends printexp.revisitor.operations.TruOperation> alg) {
		this.self = self;
		this.alg = alg;
	}

	@Override
	public String print() {
		return "T";
	}
}
