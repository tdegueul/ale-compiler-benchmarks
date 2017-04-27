/**
 */
package modularrevisitor;

import admodular.ActivityNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modularrevisitor.Token#getHolder <em>Holder</em>}</li>
 * </ul>
 *
 * @see modularrevisitor.ModularrevisitorPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends EObject {
	/**
	 * Returns the value of the '<em><b>Holder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modularrevisitor.ActivityNode_Aspect#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder</em>' container reference.
	 * @see #setHolder(ActivityNode_Aspect)
	 * @see modularrevisitor.ModularrevisitorPackage#getToken_Holder()
	 * @see modularrevisitor.ActivityNode_Aspect#getHeldTokens
	 * @model opposite="heldTokens" transient="false"
	 * @generated
	 */
	ActivityNode_Aspect getHolder();

	/**
	 * Sets the value of the '{@link modularrevisitor.Token#getHolder <em>Holder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder</em>' container reference.
	 * @see #getHolder()
	 * @generated
	 */
	void setHolder(ActivityNode_Aspect value);

} // Token
