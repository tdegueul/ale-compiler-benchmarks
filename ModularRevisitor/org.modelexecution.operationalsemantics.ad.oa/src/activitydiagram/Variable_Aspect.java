/**
 */
package activitydiagram;

import activitydiagramoa.Value;
import activitydiagramoa.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagram.Variable_Aspect#getCurrentValue <em>Current Value</em>}</li>
 * </ul>
 *
 * @see activitydiagram.ActivitydiagramPackage#getVariable_Aspect()
 * @model
 * @generated
 */
public interface Variable_Aspect extends Variable {
	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' reference.
	 * @see #setCurrentValue(Value)
	 * @see activitydiagram.ActivitydiagramPackage#getVariable_Aspect_CurrentValue()
	 * @model
	 * @generated
	 */
	Value getCurrentValue();

	/**
	 * Sets the value of the '{@link activitydiagram.Variable_Aspect#getCurrentValue <em>Current Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(Value value);

} // Variable_Aspect
