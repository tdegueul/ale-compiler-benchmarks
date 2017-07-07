package printexp.revisitor.operations.impl;

public class AndOperationImpl implements printexp.revisitor.operations.AndOperation {
	private final boolexp.And self;
	private final boolexp.revisitor.BoolexpRevisitor<? extends printexp.revisitor.operations.AndOperation, ? extends printexp.revisitor.operations.BinaryExpOperation, ? extends printexp.revisitor.operations.ExpOperation, ? extends printexp.revisitor.operations.FalsOperation, ? extends printexp.revisitor.operations.LitOperation, ? extends printexp.revisitor.operations.OrOperation, ? extends printexp.revisitor.operations.TruOperation> alg;


	public AndOperationImpl(boolexp.And self, boolexp.revisitor.BoolexpRevisitor<? extends printexp.revisitor.operations.AndOperation, ? extends printexp.revisitor.operations.BinaryExpOperation, ? extends printexp.revisitor.operations.ExpOperation, ? extends printexp.revisitor.operations.FalsOperation, ? extends printexp.revisitor.operations.LitOperation, ? extends printexp.revisitor.operations.OrOperation, ? extends printexp.revisitor.operations.TruOperation> alg) {
		this.self = self;
		this.alg = alg;
	}

	@Override
	public String print() {
		return "(" + alg.$(self.getLhs()).print() + " ∧ " + alg.$(self.getRhs()).print() + ")";
	}
}
