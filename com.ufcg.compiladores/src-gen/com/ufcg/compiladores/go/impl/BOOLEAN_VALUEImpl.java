/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.BOOLEAN_VALUE;
import com.ufcg.compiladores.go.GoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BOOLEAN VALUE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.BOOLEAN_VALUEImpl#getVerdadeiro <em>Verdadeiro</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.BOOLEAN_VALUEImpl#getFalso <em>Falso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BOOLEAN_VALUEImpl extends MinimalEObjectImpl.Container implements BOOLEAN_VALUE
{
  /**
   * The default value of the '{@link #getVerdadeiro() <em>Verdadeiro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerdadeiro()
   * @generated
   * @ordered
   */
  protected static final String VERDADEIRO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVerdadeiro() <em>Verdadeiro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerdadeiro()
   * @generated
   * @ordered
   */
  protected String verdadeiro = VERDADEIRO_EDEFAULT;

  /**
   * The default value of the '{@link #getFalso() <em>Falso</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalso()
   * @generated
   * @ordered
   */
  protected static final String FALSO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFalso() <em>Falso</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalso()
   * @generated
   * @ordered
   */
  protected String falso = FALSO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BOOLEAN_VALUEImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GoPackage.Literals.BOOLEAN_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVerdadeiro()
  {
    return verdadeiro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerdadeiro(String newVerdadeiro)
  {
    String oldVerdadeiro = verdadeiro;
    verdadeiro = newVerdadeiro;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.BOOLEAN_VALUE__VERDADEIRO, oldVerdadeiro, verdadeiro));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFalso()
  {
    return falso;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFalso(String newFalso)
  {
    String oldFalso = falso;
    falso = newFalso;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.BOOLEAN_VALUE__FALSO, oldFalso, falso));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GoPackage.BOOLEAN_VALUE__VERDADEIRO:
        return getVerdadeiro();
      case GoPackage.BOOLEAN_VALUE__FALSO:
        return getFalso();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoPackage.BOOLEAN_VALUE__VERDADEIRO:
        setVerdadeiro((String)newValue);
        return;
      case GoPackage.BOOLEAN_VALUE__FALSO:
        setFalso((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GoPackage.BOOLEAN_VALUE__VERDADEIRO:
        setVerdadeiro(VERDADEIRO_EDEFAULT);
        return;
      case GoPackage.BOOLEAN_VALUE__FALSO:
        setFalso(FALSO_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GoPackage.BOOLEAN_VALUE__VERDADEIRO:
        return VERDADEIRO_EDEFAULT == null ? verdadeiro != null : !VERDADEIRO_EDEFAULT.equals(verdadeiro);
      case GoPackage.BOOLEAN_VALUE__FALSO:
        return FALSO_EDEFAULT == null ? falso != null : !FALSO_EDEFAULT.equals(falso);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (verdadeiro: ");
    result.append(verdadeiro);
    result.append(", falso: ");
    result.append(falso);
    result.append(')');
    return result.toString();
  }

} //BOOLEAN_VALUEImpl