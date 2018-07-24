/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiler.go.impl;

import com.ufcg.compiler.go.Assignment;
import com.ufcg.compiler.go.EXPRESSAOLINHA;
import com.ufcg.compiler.go.GoPackage;
import com.ufcg.compiler.go.IGUAL;
import com.ufcg.compiler.go.PONTOSIGUAL;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiler.go.impl.AssignmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.ufcg.compiler.go.impl.AssignmentImpl#getQtd <em>Qtd</em>}</li>
 *   <li>{@link com.ufcg.compiler.go.impl.AssignmentImpl#getIgual <em>Igual</em>}</li>
 *   <li>{@link com.ufcg.compiler.go.impl.AssignmentImpl#getDois <em>Dois</em>}</li>
 *   <li>{@link com.ufcg.compiler.go.impl.AssignmentImpl#getExpressao <em>Expressao</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends MinimalEObjectImpl.Container implements Assignment
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getQtd() <em>Qtd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQtd()
   * @generated
   * @ordered
   */
  protected static final String QTD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQtd() <em>Qtd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQtd()
   * @generated
   * @ordered
   */
  protected String qtd = QTD_EDEFAULT;

  /**
   * The cached value of the '{@link #getIgual() <em>Igual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIgual()
   * @generated
   * @ordered
   */
  protected IGUAL igual;

  /**
   * The cached value of the '{@link #getDois() <em>Dois</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDois()
   * @generated
   * @ordered
   */
  protected PONTOSIGUAL dois;

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
  protected AssignmentImpl()
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
    return GoPackage.Literals.ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.ASSIGNMENT__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQtd()
  {
    return qtd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQtd(String newQtd)
  {
    String oldQtd = qtd;
    qtd = newQtd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.ASSIGNMENT__QTD, oldQtd, qtd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IGUAL getIgual()
  {
    return igual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIgual(IGUAL newIgual, NotificationChain msgs)
  {
    IGUAL oldIgual = igual;
    igual = newIgual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.ASSIGNMENT__IGUAL, oldIgual, newIgual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIgual(IGUAL newIgual)
  {
    if (newIgual != igual)
    {
      NotificationChain msgs = null;
      if (igual != null)
        msgs = ((InternalEObject)igual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.ASSIGNMENT__IGUAL, null, msgs);
      if (newIgual != null)
        msgs = ((InternalEObject)newIgual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.ASSIGNMENT__IGUAL, null, msgs);
      msgs = basicSetIgual(newIgual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.ASSIGNMENT__IGUAL, newIgual, newIgual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PONTOSIGUAL getDois()
  {
    return dois;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDois(PONTOSIGUAL newDois, NotificationChain msgs)
  {
    PONTOSIGUAL oldDois = dois;
    dois = newDois;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.ASSIGNMENT__DOIS, oldDois, newDois);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDois(PONTOSIGUAL newDois)
  {
    if (newDois != dois)
    {
      NotificationChain msgs = null;
      if (dois != null)
        msgs = ((InternalEObject)dois).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.ASSIGNMENT__DOIS, null, msgs);
      if (newDois != null)
        msgs = ((InternalEObject)newDois).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.ASSIGNMENT__DOIS, null, msgs);
      msgs = basicSetDois(newDois, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.ASSIGNMENT__DOIS, newDois, newDois));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.ASSIGNMENT__EXPRESSAO, oldExpressao, newExpressao);
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
        msgs = ((InternalEObject)expressao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.ASSIGNMENT__EXPRESSAO, null, msgs);
      if (newExpressao != null)
        msgs = ((InternalEObject)newExpressao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.ASSIGNMENT__EXPRESSAO, null, msgs);
      msgs = basicSetExpressao(newExpressao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.ASSIGNMENT__EXPRESSAO, newExpressao, newExpressao));
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
      case GoPackage.ASSIGNMENT__IGUAL:
        return basicSetIgual(null, msgs);
      case GoPackage.ASSIGNMENT__DOIS:
        return basicSetDois(null, msgs);
      case GoPackage.ASSIGNMENT__EXPRESSAO:
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
      case GoPackage.ASSIGNMENT__ID:
        return getId();
      case GoPackage.ASSIGNMENT__QTD:
        return getQtd();
      case GoPackage.ASSIGNMENT__IGUAL:
        return getIgual();
      case GoPackage.ASSIGNMENT__DOIS:
        return getDois();
      case GoPackage.ASSIGNMENT__EXPRESSAO:
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
      case GoPackage.ASSIGNMENT__ID:
        setId((String)newValue);
        return;
      case GoPackage.ASSIGNMENT__QTD:
        setQtd((String)newValue);
        return;
      case GoPackage.ASSIGNMENT__IGUAL:
        setIgual((IGUAL)newValue);
        return;
      case GoPackage.ASSIGNMENT__DOIS:
        setDois((PONTOSIGUAL)newValue);
        return;
      case GoPackage.ASSIGNMENT__EXPRESSAO:
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
      case GoPackage.ASSIGNMENT__ID:
        setId(ID_EDEFAULT);
        return;
      case GoPackage.ASSIGNMENT__QTD:
        setQtd(QTD_EDEFAULT);
        return;
      case GoPackage.ASSIGNMENT__IGUAL:
        setIgual((IGUAL)null);
        return;
      case GoPackage.ASSIGNMENT__DOIS:
        setDois((PONTOSIGUAL)null);
        return;
      case GoPackage.ASSIGNMENT__EXPRESSAO:
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
      case GoPackage.ASSIGNMENT__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case GoPackage.ASSIGNMENT__QTD:
        return QTD_EDEFAULT == null ? qtd != null : !QTD_EDEFAULT.equals(qtd);
      case GoPackage.ASSIGNMENT__IGUAL:
        return igual != null;
      case GoPackage.ASSIGNMENT__DOIS:
        return dois != null;
      case GoPackage.ASSIGNMENT__EXPRESSAO:
        return expressao != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(", qtd: ");
    result.append(qtd);
    result.append(')');
    return result.toString();
  }

} //AssignmentImpl