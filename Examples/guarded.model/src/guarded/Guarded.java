/**
 */
package guarded;

import exp.Expression;
import fsm.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guarded</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link guarded.Guarded#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see guarded.GuardedPackage#getGuarded()
 * @model
 * @generated
 */
public interface Guarded extends Transition {

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Expression)
	 * @see guarded.GuardedPackage#getGuarded_Guard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getGuard();

	/**
	 * Sets the value of the '{@link guarded.Guarded#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Expression value);
} // Guarded
