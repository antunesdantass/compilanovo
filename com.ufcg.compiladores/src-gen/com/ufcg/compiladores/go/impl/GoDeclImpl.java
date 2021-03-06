/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.EXPRESSAOLINHA;
import com.ufcg.compiladores.go.FunctionType;
import com.ufcg.compiladores.go.GoDecl;
import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.VarDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.GoDeclImpl#getVar <em>Var</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.GoDeclImpl#getFunc <em>Func</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.GoDeclImpl#getExpressao <em>Expressao</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoDeclImpl extends MinimalEObjectImpl.Container implements GoDecl
{
  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected VarDecl var;

  /**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected FunctionType func;

  /**
   * The cached value of the '{@link #getExpressao() <em>Expressao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressao()
   * @generated
   * @ordered
   */
  protected EXPRESSAOLINHA expressao;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoDeclImpl()
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
    return GoPackage.Literals.GO_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(VarDecl newVar, NotificationChain msgs)
  {
    VarDecl oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.GO_DECL__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(VarDecl newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.GO_DECL__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.GO_DECL__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.GO_DECL__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionType getFunc()
  {
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunc(FunctionType newFunc, NotificationChain msgs)
  {
    FunctionType oldFunc = func;
    func = newFunc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.GO_DECL__FUNC, oldFunc, newFunc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunc(FunctionType newFunc)
  {
    if (newFunc != func)
    {
      NotificationChain msgs = null;
      if (func != null)
        msgs = ((InternalEObject)func).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.GO_DECL__FUNC, null, msgs);
      if (newFunc != null)
        msgs = ((InternalEObject)newFunc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.GO_DECL__FUNC, null, msgs);
      msgs = basicSetFunc(newFunc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.GO_DECL__FUNC, newFunc, newFunc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSAOLINHA getExpressao()
  {
    return expressao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressao(EXPRESSAOLINHA newExpressao, NotificationChain msgs)
  {
    EXPRESSAOLINHA oldExpressao = expressao;
    expressao = newExpressao;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.GO_DECL__EXPRESSAO, oldExpressao, newExpressao);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressao(EXPRESSAOLINHA newExpressao)
  {
    if (newExpressao != expressao)
    {
      NotificationChain msgs = null;
      if (expressao != null)
        msgs = ((InternalEObject)expressao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.GO_DECL__EXPRESSAO, null, msgs);
      if (newExpressao != null)
        msgs = ((InternalEObject)newExpressao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.GO_DECL__EXPRESSAO, null, msgs);
      msgs = basicSetExpressao(newExpressao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.GO_DECL__EXPRESSAO, newExpressao, newExpressao));
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
      case GoPackage.GO_DECL__VAR:
        return basicSetVar(null, msgs);
      case GoPackage.GO_DECL__FUNC:
        return basicSetFunc(null, msgs);
      case GoPackage.GO_DECL__EXPRESSAO:
        return basicSetExpressao(null, msgs);
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
      case GoPackage.GO_DECL__VAR:
        return getVar();
      case GoPackage.GO_DECL__FUNC:
        return getFunc();
      case GoPackage.GO_DECL__EXPRESSAO:
        return getExpressao();
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
      case GoPackage.GO_DECL__VAR:
        setVar((VarDecl)newValue);
        return;
      case GoPackage.GO_DECL__FUNC:
        setFunc((FunctionType)newValue);
        return;
      case GoPackage.GO_DECL__EXPRESSAO:
        setExpressao((EXPRESSAOLINHA)newValue);
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
      case GoPackage.GO_DECL__VAR:
        setVar((VarDecl)null);
        return;
      case GoPackage.GO_DECL__FUNC:
        setFunc((FunctionType)null);
        return;
      case GoPackage.GO_DECL__EXPRESSAO:
        setExpressao((EXPRESSAOLINHA)null);
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
      case GoPackage.GO_DECL__VAR:
        return var != null;
      case GoPackage.GO_DECL__FUNC:
        return func != null;
      case GoPackage.GO_DECL__EXPRESSAO:
        return expressao != null;
    }
    return super.eIsSet(featureID);
  }

} //GoDeclImpl
