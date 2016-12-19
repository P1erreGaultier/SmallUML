/**
 */
package smalluml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Association#getUsed <em>Used</em>}</li>
 *   <li>{@link smalluml.Association#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends smalluml.Class {
	/**
	 * Returns the value of the '<em><b>Used</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used</em>' reference.
	 * @see #setUsed(Role)
	 * @see smalluml.SmallumlPackage#getAssociation_Used()
	 * @model required="true"
	 * @generated
	 */
	Role getUsed();

	/**
	 * Sets the value of the '{@link smalluml.Association#getUsed <em>Used</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used</em>' reference.
	 * @see #getUsed()
	 * @generated
	 */
	void setUsed(Role value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(Role)
	 * @see smalluml.SmallumlPackage#getAssociation_User()
	 * @model required="true"
	 * @generated
	 */
	Role getUser();

	/**
	 * Sets the value of the '{@link smalluml.Association#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(Role value);

} // Association
