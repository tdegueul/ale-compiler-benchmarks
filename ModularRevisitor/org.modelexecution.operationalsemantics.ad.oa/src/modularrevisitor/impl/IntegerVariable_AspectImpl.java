/**
 */
package modularrevisitor.impl;

import admodular.Value;

import admodular.impl.IntegerVariableImpl;

import modularrevisitor.IntegerVariable_Aspect;
import modularrevisitor.ModularrevisitorPackage;
import modularrevisitor.Variable_Aspect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Variable Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modularrevisitor.impl.IntegerVariable_AspectImpl#getCurrentValue <em>Current Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerVariable_AspectImpl extends IntegerVariableImpl implements IntegerVariable_Aspect {
	/**
	 * The cached value of the '{@link #getCurrentValue() <em>Current Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected Value currentValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerVariable_AspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularrevisitorPackage.Literals.INTEGER_VARIABLE_ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getCurrentValue() {
		if (currentValue != null && currentValue.eIsProxy()) {
			InternalEObject oldCurrentValue = (InternalEObject)currentValue;
			currentValue = (Value)eResolveProxy(oldCurrentValue);
			if (currentValue != oldCurrentValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModularrevisitorPackage.INTEGER_VARIABLE_ASPECT__CURRENT_VALUE, oldCurrentValue, currentValue));
			}
		}
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetCurrentValue() {
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentValue(Value newCurrentValue) {
		Value oldCurrentValue = currentValue;
		currentValue = newCurrentValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularrevisitorPackage.INTEGER_VARIABLE_ASPECT__CURRENT_VALUE, oldCurrentValue, currentValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModularrevisitorPackage.INTEGER_VARIABLE_ASPECT__CURRENT_VALUE:
				if (resolve) return getCurrentValue();
				return basicGetCurrentValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModularrevisitorPackage.INTEGER_VARIABLE_ASPECT__CURRENT_VALUE:
				setCurrentValue((Value)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModularrevisitorPackage.INTEGER_VARIABLE_ASPECT__CURRENT_VALUE:
				setCurrentValue((Value)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModularrevisitorPackage.INTEGER_VARIABLE_ASPECT__CURRENT_VALUE:
				return currentValue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Variable_Aspect.class) {
			switch (derivedFeatureID) {
				case ModularrevisitorPackage.INTEGER_VARIABLE_ASPECT__CURRENT_VALUE: return ModularrevisitorPackage.VARIABLE_ASPECT__CURRENT_VALUE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Variable_Aspect.class) {
			switch (baseFeatureID) {
				case ModularrevisitorPackage.VARIABLE_ASPECT__CURRENT_VALUE: return ModularrevisitorPackage.INTEGER_VARIABLE_ASPECT__CURRENT_VALUE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IntegerVariable_AspectImpl
