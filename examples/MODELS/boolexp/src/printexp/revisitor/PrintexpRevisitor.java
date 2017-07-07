package printexp.revisitor;

public interface PrintexpRevisitor extends boolexp.revisitor.BoolexpRevisitor<printexp.revisitor.operations.AndOperation, printexp.revisitor.operations.BinaryExpOperation, printexp.revisitor.operations.ExpOperation, printexp.revisitor.operations.FalsOperation, printexp.revisitor.operations.LitOperation, printexp.revisitor.operations.OrOperation, printexp.revisitor.operations.TruOperation> {
	@Override
	default printexp.revisitor.operations.AndOperation and(final boolexp.And a) {
		return new printexp.revisitor.operations.impl.AndOperationImpl(a, this);
	}
	@Override
	default printexp.revisitor.operations.AndOperation exp_and(final boolexp.And a) {
		return new printexp.revisitor.operations.impl.AndOperationImpl(a, this);
	}
	@Override
	default printexp.revisitor.operations.AndOperation binaryExp_and(final boolexp.And a) {
		return new printexp.revisitor.operations.impl.AndOperationImpl(a, this);
	}
	@Override
	default printexp.revisitor.operations.FalsOperation fals(final boolexp.Fals f) {
		return new printexp.revisitor.operations.impl.FalsOperationImpl(f, this);
	}
	@Override
	default printexp.revisitor.operations.FalsOperation exp_fals(final boolexp.Fals f) {
		return new printexp.revisitor.operations.impl.FalsOperationImpl(f, this);
	}
	@Override
	default printexp.revisitor.operations.FalsOperation lit_fals(final boolexp.Fals f) {
		return new printexp.revisitor.operations.impl.FalsOperationImpl(f, this);
	}
	@Override
	default printexp.revisitor.operations.OrOperation or(final boolexp.Or o) {
		return new printexp.revisitor.operations.impl.OrOperationImpl(o, this);
	}
	@Override
	default printexp.revisitor.operations.OrOperation exp_or(final boolexp.Or o) {
		return new printexp.revisitor.operations.impl.OrOperationImpl(o, this);
	}
	@Override
	default printexp.revisitor.operations.OrOperation binaryExp_or(final boolexp.Or o) {
		return new printexp.revisitor.operations.impl.OrOperationImpl(o, this);
	}
	@Override
	default printexp.revisitor.operations.TruOperation tru(final boolexp.Tru t) {
		return new printexp.revisitor.operations.impl.TruOperationImpl(t, this);
	}
	@Override
	default printexp.revisitor.operations.TruOperation exp_tru(final boolexp.Tru t) {
		return new printexp.revisitor.operations.impl.TruOperationImpl(t, this);
	}
	@Override
	default printexp.revisitor.operations.TruOperation lit_tru(final boolexp.Tru t) {
		return new printexp.revisitor.operations.impl.TruOperationImpl(t, this);
	}
}
