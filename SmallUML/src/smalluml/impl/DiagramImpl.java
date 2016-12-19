/**
 */
package smalluml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import smalluml.Association;
import smalluml.Diagram;
import smalluml.Heritage;
import smalluml.SmallumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.DiagramImpl#getAssoc <em>Assoc</em>}</li>
 *   <li>{@link smalluml.impl.DiagramImpl#getHeritage <em>Heritage</em>}</li>
 *   <li>{@link smalluml.impl.DiagramImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramImpl extends MinimalEObjectImpl.Container implements Diagram {
	/**
	 * The cached value of the '{@link #getAssoc() <em>Assoc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssoc()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> assoc;

	/**
	 * The cached value of the '{@link #getHeritage() <em>Heritage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeritage()
	 * @generated
	 * @ordered
	 */
	protected EList<Heritage> heritage;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<smalluml.Class> class_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssoc() {
		if (assoc == null) {
			assoc = new EObjectContainmentEList<Association>(Association.class, this, SmallumlPackage.DIAGRAM__ASSOC);
		}
		return assoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Heritage> getHeritage() {
		if (heritage == null) {
			heritage = new EObjectContainmentEList<Heritage>(Heritage.class, this, SmallumlPackage.DIAGRAM__HERITAGE);
		}
		return heritage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<smalluml.Class> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<smalluml.Class>(smalluml.Class.class, this, SmallumlPackage.DIAGRAM__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.DIAGRAM__ASSOC:
				return ((InternalEList<?>)getAssoc()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.DIAGRAM__HERITAGE:
				return ((InternalEList<?>)getHeritage()).basicRemove(otherEnd, msgs);
			case SmallumlPackage.DIAGRAM__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
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
			case SmallumlPackage.DIAGRAM__ASSOC:
				return getAssoc();
			case SmallumlPackage.DIAGRAM__HERITAGE:
				return getHeritage();
			case SmallumlPackage.DIAGRAM__CLASS:
				return getClass_();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmallumlPackage.DIAGRAM__ASSOC:
				getAssoc().clear();
				getAssoc().addAll((Collection<? extends Association>)newValue);
				return;
			case SmallumlPackage.DIAGRAM__HERITAGE:
				getHeritage().clear();
				getHeritage().addAll((Collection<? extends Heritage>)newValue);
				return;
			case SmallumlPackage.DIAGRAM__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends smalluml.Class>)newValue);
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
			case SmallumlPackage.DIAGRAM__ASSOC:
				getAssoc().clear();
				return;
			case SmallumlPackage.DIAGRAM__HERITAGE:
				getHeritage().clear();
				return;
			case SmallumlPackage.DIAGRAM__CLASS:
				getClass_().clear();
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
			case SmallumlPackage.DIAGRAM__ASSOC:
				return assoc != null && !assoc.isEmpty();
			case SmallumlPackage.DIAGRAM__HERITAGE:
				return heritage != null && !heritage.isEmpty();
			case SmallumlPackage.DIAGRAM__CLASS:
				return class_ != null && !class_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramImpl
