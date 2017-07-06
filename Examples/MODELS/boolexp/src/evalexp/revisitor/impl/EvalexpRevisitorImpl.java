package evalexp.revisitor.impl;

public interface EvalexpRevisitorImpl extends evalexp.revisitor.EvalexpRevisitor
	<evalexp.revisitor.operation.EvalexpAndOperation,evalexp.revisitor.operation.EvalexpBinaryExpOperation,evalexp.revisitor.operation.EvalexpExpOperation,evalexp.revisitor.operation.EvalexpFalsOperation,evalexp.revisitor.operation.EvalexpLitOperation,evalexp.revisitor.operation.EvalexpOrOperation,evalexp.revisitor.operation.EvalexpTruOperation> {
	@Override
	default evalexp.revisitor.operation.EvalexpAndOperation and(final boolexp.And and) {
		return new evalexp.revisitor.operation.impl.EvalexpAndOperationImpl(and, this);
	} 
	@Override
	default evalexp.revisitor.operation.EvalexpAndOperation binaryExp_and(final boolexp.And and) {
		return new evalexp.revisitor.operation.impl.EvalexpAndOperationImpl(and, this);
	} 
	@Override
	default evalexp.revisitor.operation.EvalexpAndOperation exp_and(final boolexp.And and) {
		return new evalexp.revisitor.operation.impl.EvalexpAndOperationImpl(and, this);
	} 
	@Override
	default evalexp.revisitor.operation.EvalexpFalsOperation fals(final boolexp.Fals fals) {
		return new evalexp.revisitor.operation.impl.EvalexpFalsOperationImpl(fals, this);
	} 
	@Override
	default evalexp.revisitor.operation.EvalexpFalsOperation lit_fals(final boolexp.Fals fals) {
		return new evalexp.revisitor.operation.impl.EvalexpFalsOperationImpl(fals, this);
	} 
	@Override
	default evalexp.revisitor.operation.EvalexpFalsOperation exp_fals(final boolexp.Fals fals) {
		return new evalexp.revisitor.operation.impl.EvalexpFalsOperationImpl(fals, this);
	} 
	@Override
	default evalexp.revisitor.operation.EvalexpOrOperation or(final boolexp.Or or) {
		return new evalexp.revisitor.operation.impl.EvalexpOrOperationImpl(or, this);
	} 
	@Override
	default evalexp.revisitor.operation.EvalexpOrOperation binaryExp_or(final boolexp.Or or) {
		return new evalexp.revisitor.operation.impl.EvalexpOrOperationImpl(or, this);
	} 
	@Override
	default evalexp.revisitor.operation.EvalexpOrOperation exp_or(final boolexp.Or or) {
		return new evalexp.revisitor.operation.impl.EvalexpOrOperationImpl(or, this);
	} 
	@Override
	default evalexp.revisitor.operation.EvalexpTruOperation tru(final boolexp.Tru tru) {
		return new evalexp.revisitor.operation.impl.EvalexpTruOperationImpl(tru, this);
	} 
	@Override
	default evalexp.revisitor.operation.EvalexpTruOperation lit_tru(final boolexp.Tru tru) {
		return new evalexp.revisitor.operation.impl.EvalexpTruOperationImpl(tru, this);
	} 
	@Override
	default evalexp.revisitor.operation.EvalexpTruOperation exp_tru(final boolexp.Tru tru) {
		return new evalexp.revisitor.operation.impl.EvalexpTruOperationImpl(tru, this);
	} 
}
