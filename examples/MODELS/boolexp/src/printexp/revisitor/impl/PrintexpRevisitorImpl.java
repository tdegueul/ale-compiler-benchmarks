package printexp.revisitor.impl;

public interface PrintexpRevisitorImpl extends printexp.revisitor.PrintexpRevisitor
	<printexp.revisitor.operation.PrintexpAndOperation,printexp.revisitor.operation.PrintexpBinaryExpOperation,printexp.revisitor.operation.PrintexpExpOperation,printexp.revisitor.operation.PrintexpFalsOperation,printexp.revisitor.operation.PrintexpLitOperation,printexp.revisitor.operation.PrintexpOrOperation,printexp.revisitor.operation.PrintexpTruOperation> {
	@Override
	default printexp.revisitor.operation.PrintexpAndOperation and(final boolexp.And and) {
		return new printexp.revisitor.operation.impl.PrintexpAndOperationImpl(and, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpAndOperation binaryExp_and(final boolexp.And and) {
		return new printexp.revisitor.operation.impl.PrintexpAndOperationImpl(and, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpAndOperation exp_and(final boolexp.And and) {
		return new printexp.revisitor.operation.impl.PrintexpAndOperationImpl(and, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpFalsOperation fals(final boolexp.Fals fals) {
		return new printexp.revisitor.operation.impl.PrintexpFalsOperationImpl(fals, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpFalsOperation lit_fals(final boolexp.Fals fals) {
		return new printexp.revisitor.operation.impl.PrintexpFalsOperationImpl(fals, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpFalsOperation exp_fals(final boolexp.Fals fals) {
		return new printexp.revisitor.operation.impl.PrintexpFalsOperationImpl(fals, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpOrOperation or(final boolexp.Or or) {
		return new printexp.revisitor.operation.impl.PrintexpOrOperationImpl(or, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpOrOperation binaryExp_or(final boolexp.Or or) {
		return new printexp.revisitor.operation.impl.PrintexpOrOperationImpl(or, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpOrOperation exp_or(final boolexp.Or or) {
		return new printexp.revisitor.operation.impl.PrintexpOrOperationImpl(or, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpTruOperation tru(final boolexp.Tru tru) {
		return new printexp.revisitor.operation.impl.PrintexpTruOperationImpl(tru, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpTruOperation lit_tru(final boolexp.Tru tru) {
		return new printexp.revisitor.operation.impl.PrintexpTruOperationImpl(tru, this);
	} 
	@Override
	default printexp.revisitor.operation.PrintexpTruOperation exp_tru(final boolexp.Tru tru) {
		return new printexp.revisitor.operation.impl.PrintexpTruOperationImpl(tru, this);
	} 
}
