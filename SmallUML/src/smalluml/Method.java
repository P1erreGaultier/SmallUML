/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link smalluml.Method#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getParameters();

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(Type)
	 * @see smalluml.SmallumlPackage#getMethod_Return()
	 * @model containment="true"
	 * @generated
	 */
	Type getReturn();

	/**
	 * Sets the value of the '{@link smalluml.Method#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(Type value);

} // Method
