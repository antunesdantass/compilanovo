/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.EXPRESSAO;
import com.ufcg.compiladores.go.EXPRESSAOLINHA;
import com.ufcg.compiladores.go.GoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EXPRESSAOLINHA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.EXPRESSAOLINHAImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.EXPRESSAOLINHAImpl#getExplinha <em>Explinha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXPRESSAOLINHAImpl extends MinimalEObjectImpl.Container implements EXPRESSAOLINHA
{
  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected EXPRESSAO exp;

  /**
   * The cached value of the '{@link #getExplinha() <em>Explinha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExplinha()
   * @generated
   * @ordered
   */
  protected EXPRESSAOLINHA explinha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EXPRESSAOLINHAImpl()
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
    return GoPackage.Literals.EXPRESSAOLINHA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSAO getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(EXPRESSAO newExp, NotificationChain msgs)
  {
    EXPRESSAO oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAOLINHA__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(EXPRESSAO newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAOLINHA__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAOLINHA__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAOLINHA__EXP, newExp, newExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSAOLINHA getExplinha()
  {
    return explinha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExplinha(EXPRESSAOLINHA newExplinha, NotificationChain msgs)
  {
    EXPRESSAOLINHA oldExplinha = explinha;
    explinha = newExplinha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAOLINHA__EXPLINHA, oldExplinha, newExplinha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExplinha(EXPRESSAOLINHA newExplinha)
  {
    if (newExplinha != explinha)
    {
      NotificationChain msgs = null;
      if (explinha != null)
        msgs = ((InternalEObject)explinha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAOLINHA__EXPLINHA, null, msgs);
      if (newExplinha != null)
        msgs = ((InternalEObject)newExplinha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAOLINHA__EXPLINHA, null, msgs);
      msgs = basicSetExplinha(newExplinha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAOLINHA__EXPLINHA, newExplinha, newExplinha));
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
      case GoPackage.EXPRESSAOLINHA__EXP:
        return basicSetExp(null, msgs);
      case GoPackage.EXPRESSAOLINHA__EXPLINHA:
        return basicSetExplinha(null, msgs);
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
      case GoPackage.EXPRESSAOLINHA__EXP:
        return getExp();
      case GoPackage.EXPRESSAOLINHA__EXPLINHA:
        return getExplinha();
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
      case GoPackage.EXPRESSAOLINHA__EXP:
        setExp((EXPRESSAO)newValue);
        return;
      case GoPackage.EXPRESSAOLINHA__EXPLINHA:
        setExplinha((EXPRESSAOLINHA)newValue);
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
      case GoPackage.EXPRESSAOLINHA__EXP:
        setExp((EXPRESSAO)null);
        return;
      case GoPackage.EXPRESSAOLINHA__EXPLINHA:
        setExplinha((EXPRESSAOLINHA)null);
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
      case GoPackage.EXPRESSAOLINHA__EXP:
        return exp != null;
      case GoPackage.EXPRESSAOLINHA__EXPLINHA:
        return explinha != null;
    }
    return super.eIsSet(featureID);
  }

} //EXPRESSAOLINHAImpl
