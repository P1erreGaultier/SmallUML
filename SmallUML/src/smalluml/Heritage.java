/**
 */
package smalluml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heritage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Heritage#getMother <em>Mother</em>}</li>
 *   <li>{@link smalluml.Heritage#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getHeritage()
 * @model
 * @generated
 */
public interface Heritage extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Mother</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mother</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mother</em>' containment reference.
	 * @see #setMother(Role)
	 * @see smalluml.SmallumlPackage#getHeritage_Mother()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Role getMother();

	/**
	 * Sets the value of the '{@link smalluml.Heritage#getMother <em>Mother</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mother</em>' containment reference.
	 * @see #getMother()
	 * @generated
	 */
	void setMother(Role value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(Role)
	 * @see smalluml.SmallumlPackage#getHeritage_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Role getChild();

	/**
	 * Sets the value of the '{@link smalluml.Heritage#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Role value);

} // Heritage
