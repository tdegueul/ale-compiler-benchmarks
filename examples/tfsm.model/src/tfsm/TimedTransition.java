/**
 */
package tfsm;

import fsm.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tfsm.TimedTransition#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see tfsm.TfsmPackage#getTimedTransition()
 * @model
 * @generated
 */
public interface TimedTransition extends Transition {

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see tfsm.TfsmPackage#getTimedTransition_Time()
	 * @model
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link tfsm.TimedTransition#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);
} // TimedTransition
