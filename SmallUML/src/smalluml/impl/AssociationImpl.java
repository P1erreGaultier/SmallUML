/**
 */
package smalluml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import smalluml.Association;
import smalluml.Role;
import smalluml.SmallumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.AssociationImpl#getUsed <em>Used</em>}</li>
 *   <li>{@link smalluml.impl.AssociationImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends NamedElementImpl implements Association {
	/**
	 * The cached value of the '{@link #getUsed() <em>Used</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsed()
	 * @generated
	 * @ordered
	 */
	protected Role used;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected Role user;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getUsed() {
		return used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsed(Role newUsed, NotificationChain msgs) {
		Role oldUsed = used;
		used = newUsed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallumlPackage.ASSOCIATION__USED, oldUsed, newUsed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsed(Role newUsed) {
		if (newUsed != used) {
			NotificationChain msgs = null;
			if (used != null)
				msgs = ((InternalEObject)used).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.ASSOCIATION__USED, null, msgs);
			if (newUsed != null)
				msgs = ((InternalEObject)newUsed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.ASSOCIATION__USED, null, msgs);
			msgs = basicSetUsed(newUsed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.ASSOCIATION__USED, newUsed, newUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(Role newUser, NotificationChain msgs) {
		Role oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallumlPackage.ASSOCIATION__USER, oldUser, newUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(Role newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject)user).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.ASSOCIATION__USER, null, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.ASSOCIATION__USER, null, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.ASSOCIATION__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.ASSOCIATION__USED:
				return basicSetUsed(null, msgs);
			case SmallumlPackage.ASSOCIATION__USER:
				return basicSetUser(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmallumlPackage.ASSOCIATION__USED:
				return getUsed();
			case SmallumlPackage.ASSOCIATION__USER:
				return getUser();
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
			case SmallumlPackage.ASSOCIATION__USED:
				setUsed((Role)newValue);
				return;
			case SmallumlPackage.ASSOCIATION__USER:
				setUser((Role)newValue);
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
			case SmallumlPackage.ASSOCIATION__USED:
				setUsed((Role)null);
				return;
			case SmallumlPackage.ASSOCIATION__USER:
				setUser((Role)null);
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
			case SmallumlPackage.ASSOCIATION__USED:
				return used != null;
			case SmallumlPackage.ASSOCIATION__USER:
				return user != null;
		}
		return super.eIsSet(featureID);
	}

} //AssociationImpl
