/**
 */
package smalluml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import smalluml.Heritage;
import smalluml.Role;
import smalluml.SmallumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heritage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.HeritageImpl#getMother <em>Mother</em>}</li>
 *   <li>{@link smalluml.impl.HeritageImpl#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeritageImpl extends NamedElementImpl implements Heritage {
	/**
	 * The cached value of the '{@link #getMother() <em>Mother</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMother()
	 * @generated
	 * @ordered
	 */
	protected Role mother;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected Role child;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeritageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.HERITAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getMother() {
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMother(Role newMother, NotificationChain msgs) {
		Role oldMother = mother;
		mother = newMother;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallumlPackage.HERITAGE__MOTHER, oldMother, newMother);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMother(Role newMother) {
		if (newMother != mother) {
			NotificationChain msgs = null;
			if (mother != null)
				msgs = ((InternalEObject)mother).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.HERITAGE__MOTHER, null, msgs);
			if (newMother != null)
				msgs = ((InternalEObject)newMother).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.HERITAGE__MOTHER, null, msgs);
			msgs = basicSetMother(newMother, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.HERITAGE__MOTHER, newMother, newMother));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(Role newChild, NotificationChain msgs) {
		Role oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallumlPackage.HERITAGE__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(Role newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.HERITAGE__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.HERITAGE__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.HERITAGE__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.HERITAGE__MOTHER:
				return basicSetMother(null, msgs);
			case SmallumlPackage.HERITAGE__CHILD:
				return basicSetChild(null, msgs);
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
			case SmallumlPackage.HERITAGE__MOTHER:
				return getMother();
			case SmallumlPackage.HERITAGE__CHILD:
				return getChild();
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
			case SmallumlPackage.HERITAGE__MOTHER:
				setMother((Role)newValue);
				return;
			case SmallumlPackage.HERITAGE__CHILD:
				setChild((Role)newValue);
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
			case SmallumlPackage.HERITAGE__MOTHER:
				setMother((Role)null);
				return;
			case SmallumlPackage.HERITAGE__CHILD:
				setChild((Role)null);
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
			case SmallumlPackage.HERITAGE__MOTHER:
				return mother != null;
			case SmallumlPackage.HERITAGE__CHILD:
				return child != null;
		}
		return super.eIsSet(featureID);
	}

} //HeritageImpl
