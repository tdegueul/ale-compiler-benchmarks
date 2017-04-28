/**
 */
package adruntime.impl;

import activitydiagram.ActivityNode;

import adruntime.AdruntimePackage;
import adruntime.Token;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adruntime.impl.TokenImpl#getHolder <em>Holder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenImpl extends MinimalEObjectImpl.Container implements Token {
	/**
	 * The cached value of the '{@link #getHolder() <em>Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolder()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode holder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdruntimePackage.Literals.TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getHolder() {
		if (holder != null && holder.eIsProxy()) {
			InternalEObject oldHolder = (InternalEObject)holder;
			holder = (ActivityNode)eResolveProxy(oldHolder);
			if (holder != oldHolder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdruntimePackage.TOKEN__HOLDER, oldHolder, holder));
			}
		}
		return holder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetHolder() {
		return holder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHolder(ActivityNode newHolder) {
		ActivityNode oldHolder = holder;
		holder = newHolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdruntimePackage.TOKEN__HOLDER, oldHolder, holder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdruntimePackage.TOKEN__HOLDER:
				if (resolve) return getHolder();
				return basicGetHolder();
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
			case AdruntimePackage.TOKEN__HOLDER:
				setHolder((ActivityNode)newValue);
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
			case AdruntimePackage.TOKEN__HOLDER:
				setHolder((ActivityNode)null);
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
			case AdruntimePackage.TOKEN__HOLDER:
				return holder != null;
		}
		return super.eIsSet(featureID);
	}

} //TokenImpl
