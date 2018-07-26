/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.Parameters#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getParameters()
 * @model
 * @generated
 */
public interface Parameters extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(PARAMETERS_LIST)
   * @see com.ufcg.compiladores.go.GoPackage#getParameters_Params()
   * @model containment="true"
   * @generated
   */
  PARAMETERS_LIST getParams();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.Parameters#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(PARAMETERS_LIST value);

} // Parameters