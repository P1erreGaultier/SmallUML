/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Diagram#getAssoc <em>Assoc</em>}</li>
 *   <li>{@link smalluml.Diagram#getHeritage <em>Heritage</em>}</li>
 *   <li>{@link smalluml.Diagram#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Assoc</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assoc</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assoc</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getDiagram_Assoc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssoc();

	/**
	 * Returns the value of the '<em><b>Heritage</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Heritage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heritage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heritage</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getDiagram_Heritage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Heritage> getHeritage();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getDiagram_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<smalluml.Class> getClass_();

} // Diagram
