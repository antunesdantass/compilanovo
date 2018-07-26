/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.PARAMETER;
import com.ufcg.compiladores.go.PARAMETERS_LIST;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PARAMETERS LIST</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.PARAMETERS_LISTImpl#getParams <em>Params</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.PARAMETERS_LISTImpl#getVir <em>Vir</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PARAMETERS_LISTImpl extends MinimalEObjectImpl.Container implements PARAMETERS_LIST
{
  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<PARAMETER> params;

  /**
   * The cached value of the '{@link #getVir() <em>Vir</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVir()
   * @generated
   * @ordered
   */
  protected EList<String> vir;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PARAMETERS_LISTImpl()
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
    return GoPackage.Literals.PARAMETERS_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PARAMETER> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<PARAMETER>(PARAMETER.class, this, GoPackage.PARAMETERS_LIST__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getVir()
  {
    if (vir == null)
    {
      vir = new EDataTypeEList<String>(String.class, this, GoPackage.PARAMETERS_LIST__VIR);
    }
    return vir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GoPackage.PARAMETERS_LIST__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GoPackage.PARAMETERS_LIST__PARAMS:
        return getParams();
      case GoPackage.PARAMETERS_LIST__VIR:
        return getVir();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoPackage.PARAMETERS_LIST__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends PARAMETER>)newValue);
        return;
      case GoPackage.PARAMETERS_LIST__VIR:
        getVir().clear();
        getVir().addAll((Collection<? extends String>)newValue);
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
      case GoPackage.PARAMETERS_LIST__PARAMS:
        getParams().clear();
        return;
      case GoPackage.PARAMETERS_LIST__VIR:
        getVir().clear();
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
      case GoPackage.PARAMETERS_LIST__PARAMS:
        return params != null && !params.isEmpty();
      case GoPackage.PARAMETERS_LIST__VIR:
        return vir != null && !vir.isEmpty();
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
    result.append(" (vir: ");
    result.append(vir);
    result.append(')');
    return result.toString();
  }

} //PARAMETERS_LISTImpl