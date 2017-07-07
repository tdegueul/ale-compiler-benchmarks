package printexp.revisitor.operations.impl;

public class FalsOperationImpl implements printexp.revisitor.operations.FalsOperation {
	private final boolexp.Fals self;
	private final boolexp.revisitor.BoolexpRevisitor<? extends printexp.revisitor.operations.AndOperation, ? extends printexp.revisitor.operations.BinaryExpOperation, ? extends printexp.revisitor.operations.ExpOperation, ? extends printexp.revisitor.operations.FalsOperation, ? extends printexp.revisitor.operations.LitOperation, ? extends printexp.revisitor.operations.OrOperation, ? extends printexp.revisitor.operations.TruOperation> alg;


	public FalsOperationImpl(boolexp.Fals self, boolexp.revisitor.BoolexpRevisitor<? extends printexp.revisitor.operations.AndOperation, ? extends printexp.revisitor.operations.BinaryExpOperation, ? extends printexp.revisitor.operations.ExpOperation, ? extends printexp.revisitor.operations.FalsOperation, ? extends printexp.revisitor.operations.LitOperation, ? extends printexp.revisitor.operations.OrOperation, ? extends printexp.revisitor.operations.TruOperation> alg) {
		this.self = self;
		this.alg = alg;
	}

	@Override
	public String print() {
		return "F";
	}
}
