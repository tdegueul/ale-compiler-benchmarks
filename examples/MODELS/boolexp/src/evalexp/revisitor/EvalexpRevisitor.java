package evalexp.revisitor;

public interface EvalexpRevisitor extends boolexp.revisitor.BoolexpRevisitor<evalexp.revisitor.operations.AndOperation, evalexp.revisitor.operations.BinaryExpOperation, evalexp.revisitor.operations.ExpOperation, evalexp.revisitor.operations.FalsOperation, evalexp.revisitor.operations.LitOperation, evalexp.revisitor.operations.OrOperation, evalexp.revisitor.operations.TruOperation> {
	@Override
	default evalexp.revisitor.operations.AndOperation and(final boolexp.And a) {
		return new evalexp.revisitor.operations.impl.AndOperationImpl(a, this);
	}
	@Override
	default evalexp.revisitor.operations.AndOperation exp_and(final boolexp.And a) {
		return new evalexp.revisitor.operations.impl.AndOperationImpl(a, this);
	}
	@Override
	default evalexp.revisitor.operations.AndOperation binaryExp_and(final boolexp.And a) {
		return new evalexp.revisitor.operations.impl.AndOperationImpl(a, this);
	}
	@Override
	default evalexp.revisitor.operations.FalsOperation fals(final boolexp.Fals f) {
		return new evalexp.revisitor.operations.impl.FalsOperationImpl(f, this);
	}
	@Override
	default evalexp.revisitor.operations.FalsOperation exp_fals(final boolexp.Fals f) {
		return new evalexp.revisitor.operations.impl.FalsOperationImpl(f, this);
	}
	@Override
	default evalexp.revisitor.operations.FalsOperation lit_fals(final boolexp.Fals f) {
		return new evalexp.revisitor.operations.impl.FalsOperationImpl(f, this);
	}
	@Override
	default evalexp.revisitor.operations.OrOperation or(final boolexp.Or o) {
		return new evalexp.revisitor.operations.impl.OrOperationImpl(o, this);
	}
	@Override
	default evalexp.revisitor.operations.OrOperation exp_or(final boolexp.Or o) {
		return new evalexp.revisitor.operations.impl.OrOperationImpl(o, this);
	}
	@Override
	default evalexp.revisitor.operations.OrOperation binaryExp_or(final boolexp.Or o) {
		return new evalexp.revisitor.operations.impl.OrOperationImpl(o, this);
	}
	@Override
	default evalexp.revisitor.operations.TruOperation tru(final boolexp.Tru t) {
		return new evalexp.revisitor.operations.impl.TruOperationImpl(t, this);
	}
	@Override
	default evalexp.revisitor.operations.TruOperation exp_tru(final boolexp.Tru t) {
		return new evalexp.revisitor.operations.impl.TruOperationImpl(t, this);
	}
	@Override
	default evalexp.revisitor.operations.TruOperation lit_tru(final boolexp.Tru t) {
		return new evalexp.revisitor.operations.impl.TruOperationImpl(t, this);
	}
}
