/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literais List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.LiteraisList#getLit <em>Lit</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.LiteraisList#getVir <em>Vir</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getLiteraisList()
 * @model
 * @generated
 */
public interface LiteraisList extends EObject
{
  /**
   * Returns the value of the '<em><b>Lit</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lit</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lit</em>' containment reference list.
   * @see com.ufcg.compiladores.go.GoPackage#getLiteraisList_Lit()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getLit();

  /**
   * Returns the value of the '<em><b>Vir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vir</em>' attribute.
   * @see #setVir(String)
   * @see com.ufcg.compiladores.go.GoPackage#getLiteraisList_Vir()
   * @model
   * @generated
   */
  String getVir();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.LiteraisList#getVir <em>Vir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vir</em>' attribute.
   * @see #getVir()
   * @generated
   */
  void setVir(String value);

} // LiteraisList