package evalexp.revisitor.operations.impl;

public class OrOperationImpl implements evalexp.revisitor.operations.OrOperation {
	private final boolexp.Or self;
	private final boolexp.revisitor.BoolexpRevisitor<? extends evalexp.revisitor.operations.AndOperation, ? extends evalexp.revisitor.operations.BinaryExpOperation, ? extends evalexp.revisitor.operations.ExpOperation, ? extends evalexp.revisitor.operations.FalsOperation, ? extends evalexp.revisitor.operations.LitOperation, ? extends evalexp.revisitor.operations.OrOperation, ? extends evalexp.revisitor.operations.TruOperation> alg;


	public OrOperationImpl(boolexp.Or self, boolexp.revisitor.BoolexpRevisitor<? extends evalexp.revisitor.operations.AndOperation, ? extends evalexp.revisitor.operations.BinaryExpOperation, ? extends evalexp.revisitor.operations.ExpOperation, ? extends evalexp.revisitor.operations.FalsOperation, ? extends evalexp.revisitor.operations.LitOperation, ? extends evalexp.revisitor.operations.OrOperation, ? extends evalexp.revisitor.operations.TruOperation> alg) {
		this.self = self;
		this.alg = alg;
	}

	@Override
	public Boolean eval() {
		return alg.$(self.getLhs()).eval() || alg.$(self.getRhs()).eval();
	}
}
