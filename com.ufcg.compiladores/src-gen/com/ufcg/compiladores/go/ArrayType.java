/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.ArrayType#getQtd <em>Qtd</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.ArrayType#getBasic <em>Basic</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends EObject
{
  /**
   * Returns the value of the '<em><b>Qtd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qtd</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qtd</em>' attribute.
   * @see #setQtd(String)
   * @see com.ufcg.compiladores.go.GoPackage#getArrayType_Qtd()
   * @model
   * @generated
   */
  String getQtd();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.ArrayType#getQtd <em>Qtd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qtd</em>' attribute.
   * @see #getQtd()
   * @generated
   */
  void setQtd(String value);

  /**
   * Returns the value of the '<em><b>Basic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic</em>' containment reference.
   * @see #setBasic(BasicType)
   * @see com.ufcg.compiladores.go.GoPackage#getArrayType_Basic()
   * @model containment="true"
   * @generated
   */
  BasicType getBasic();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.ArrayType#getBasic <em>Basic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic</em>' containment reference.
   * @see #getBasic()
   * @generated
   */
  void setBasic(BasicType value);

} // ArrayType