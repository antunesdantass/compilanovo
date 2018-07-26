/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.ArrayValue;
import com.ufcg.compiladores.go.Assignment;
import com.ufcg.compiladores.go.BINARY_EXP;
import com.ufcg.compiladores.go.Chamada;
import com.ufcg.compiladores.go.EXPRESSAO;
import com.ufcg.compiladores.go.ForDecl;
import com.ufcg.compiladores.go.FunctionType;
import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.IfStmt;
import com.ufcg.compiladores.go.LITERAIS_BASICOS;
import com.ufcg.compiladores.go.VarDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EXPRESSAO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.EXPRESSAOImpl#getDeclFunction <em>Decl Function</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.EXPRESSAOImpl#getBinary_exp <em>Binary exp</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.EXPRESSAOImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.EXPRESSAOImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.EXPRESSAOImpl#getFor <em>For</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.EXPRESSAOImpl#getArrayValue <em>Array Value</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.EXPRESSAOImpl#getVariaveis <em>Variaveis</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.EXPRESSAOImpl#getCham <em>Cham</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.EXPRESSAOImpl#getIf <em>If</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXPRESSAOImpl extends MinimalEObjectImpl.Container implements EXPRESSAO
{
  /**
   * The cached value of the '{@link #getDeclFunction() <em>Decl Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclFunction()
   * @generated
   * @ordered
   */
  protected FunctionType declFunction;

  /**
   * The cached value of the '{@link #getBinary_exp() <em>Binary exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinary_exp()
   * @generated
   * @ordered
   */
  protected BINARY_EXP binary_exp;

  /**
   * The cached value of the '{@link #getBasic() <em>Basic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasic()
   * @generated
   * @ordered
   */
  protected LITERAIS_BASICOS basic;

  /**
   * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment()
   * @generated
   * @ordered
   */
  protected Assignment assignment;

  /**
   * The cached value of the '{@link #getFor() <em>For</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor()
   * @generated
   * @ordered
   */
  protected ForDecl for_;

  /**
   * The cached value of the '{@link #getArrayValue() <em>Array Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayValue()
   * @generated
   * @ordered
   */
  protected ArrayValue arrayValue;

  /**
   * The cached value of the '{@link #getVariaveis() <em>Variaveis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariaveis()
   * @generated
   * @ordered
   */
  protected VarDecl variaveis;

  /**
   * The cached value of the '{@link #getCham() <em>Cham</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCham()
   * @generated
   * @ordered
   */
  protected Chamada cham;

  /**
   * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf()
   * @generated
   * @ordered
   */
  protected IfStmt if_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EXPRESSAOImpl()
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
    return GoPackage.Literals.EXPRESSAO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionType getDeclFunction()
  {
    return declFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclFunction(FunctionType newDeclFunction, NotificationChain msgs)
  {
    FunctionType oldDeclFunction = declFunction;
    declFunction = newDeclFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__DECL_FUNCTION, oldDeclFunction, newDeclFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclFunction(FunctionType newDeclFunction)
  {
    if (newDeclFunction != declFunction)
    {
      NotificationChain msgs = null;
      if (declFunction != null)
        msgs = ((InternalEObject)declFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__DECL_FUNCTION, null, msgs);
      if (newDeclFunction != null)
        msgs = ((InternalEObject)newDeclFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__DECL_FUNCTION, null, msgs);
      msgs = basicSetDeclFunction(newDeclFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__DECL_FUNCTION, newDeclFunction, newDeclFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BINARY_EXP getBinary_exp()
  {
    return binary_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinary_exp(BINARY_EXP newBinary_exp, NotificationChain msgs)
  {
    BINARY_EXP oldBinary_exp = binary_exp;
    binary_exp = newBinary_exp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__BINARY_EXP, oldBinary_exp, newBinary_exp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinary_exp(BINARY_EXP newBinary_exp)
  {
    if (newBinary_exp != binary_exp)
    {
      NotificationChain msgs = null;
      if (binary_exp != null)
        msgs = ((InternalEObject)binary_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__BINARY_EXP, null, msgs);
      if (newBinary_exp != null)
        msgs = ((InternalEObject)newBinary_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__BINARY_EXP, null, msgs);
      msgs = basicSetBinary_exp(newBinary_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__BINARY_EXP, newBinary_exp, newBinary_exp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LITERAIS_BASICOS getBasic()
  {
    return basic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasic(LITERAIS_BASICOS newBasic, NotificationChain msgs)
  {
    LITERAIS_BASICOS oldBasic = basic;
    basic = newBasic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__BASIC, oldBasic, newBasic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasic(LITERAIS_BASICOS newBasic)
  {
    if (newBasic != basic)
    {
      NotificationChain msgs = null;
      if (basic != null)
        msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__BASIC, null, msgs);
      if (newBasic != null)
        msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__BASIC, null, msgs);
      msgs = basicSetBasic(newBasic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__BASIC, newBasic, newBasic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment getAssignment()
  {
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignment(Assignment newAssignment, NotificationChain msgs)
  {
    Assignment oldAssignment = assignment;
    assignment = newAssignment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__ASSIGNMENT, oldAssignment, newAssignment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment(Assignment newAssignment)
  {
    if (newAssignment != assignment)
    {
      NotificationChain msgs = null;
      if (assignment != null)
        msgs = ((InternalEObject)assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__ASSIGNMENT, null, msgs);
      if (newAssignment != null)
        msgs = ((InternalEObject)newAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__ASSIGNMENT, null, msgs);
      msgs = basicSetAssignment(newAssignment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__ASSIGNMENT, newAssignment, newAssignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForDecl getFor()
  {
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFor(ForDecl newFor, NotificationChain msgs)
  {
    ForDecl oldFor = for_;
    for_ = newFor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__FOR, oldFor, newFor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFor(ForDecl newFor)
  {
    if (newFor != for_)
    {
      NotificationChain msgs = null;
      if (for_ != null)
        msgs = ((InternalEObject)for_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__FOR, null, msgs);
      if (newFor != null)
        msgs = ((InternalEObject)newFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__FOR, null, msgs);
      msgs = basicSetFor(newFor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__FOR, newFor, newFor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayValue getArrayValue()
  {
    return arrayValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayValue(ArrayValue newArrayValue, NotificationChain msgs)
  {
    ArrayValue oldArrayValue = arrayValue;
    arrayValue = newArrayValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__ARRAY_VALUE, oldArrayValue, newArrayValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayValue(ArrayValue newArrayValue)
  {
    if (newArrayValue != arrayValue)
    {
      NotificationChain msgs = null;
      if (arrayValue != null)
        msgs = ((InternalEObject)arrayValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__ARRAY_VALUE, null, msgs);
      if (newArrayValue != null)
        msgs = ((InternalEObject)newArrayValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__ARRAY_VALUE, null, msgs);
      msgs = basicSetArrayValue(newArrayValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__ARRAY_VALUE, newArrayValue, newArrayValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl getVariaveis()
  {
    return variaveis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariaveis(VarDecl newVariaveis, NotificationChain msgs)
  {
    VarDecl oldVariaveis = variaveis;
    variaveis = newVariaveis;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__VARIAVEIS, oldVariaveis, newVariaveis);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariaveis(VarDecl newVariaveis)
  {
    if (newVariaveis != variaveis)
    {
      NotificationChain msgs = null;
      if (variaveis != null)
        msgs = ((InternalEObject)variaveis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__VARIAVEIS, null, msgs);
      if (newVariaveis != null)
        msgs = ((InternalEObject)newVariaveis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__VARIAVEIS, null, msgs);
      msgs = basicSetVariaveis(newVariaveis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__VARIAVEIS, newVariaveis, newVariaveis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Chamada getCham()
  {
    return cham;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCham(Chamada newCham, NotificationChain msgs)
  {
    Chamada oldCham = cham;
    cham = newCham;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__CHAM, oldCham, newCham);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCham(Chamada newCham)
  {
    if (newCham != cham)
    {
      NotificationChain msgs = null;
      if (cham != null)
        msgs = ((InternalEObject)cham).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__CHAM, null, msgs);
      if (newCham != null)
        msgs = ((InternalEObject)newCham).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__CHAM, null, msgs);
      msgs = basicSetCham(newCham, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__CHAM, newCham, newCham));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStmt getIf()
  {
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf(IfStmt newIf, NotificationChain msgs)
  {
    IfStmt oldIf = if_;
    if_ = newIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__IF, oldIf, newIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIf(IfStmt newIf)
  {
    if (newIf != if_)
    {
      NotificationChain msgs = null;
      if (if_ != null)
        msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__IF, null, msgs);
      if (newIf != null)
        msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.EXPRESSAO__IF, null, msgs);
      msgs = basicSetIf(newIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.EXPRESSAO__IF, newIf, newIf));
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
      case GoPackage.EXPRESSAO__DECL_FUNCTION:
        return basicSetDeclFunction(null, msgs);
      case GoPackage.EXPRESSAO__BINARY_EXP:
        return basicSetBinary_exp(null, msgs);
      case GoPackage.EXPRESSAO__BASIC:
        return basicSetBasic(null, msgs);
      case GoPackage.EXPRESSAO__ASSIGNMENT:
        return basicSetAssignment(null, msgs);
      case GoPackage.EXPRESSAO__FOR:
        return basicSetFor(null, msgs);
      case GoPackage.EXPRESSAO__ARRAY_VALUE:
        return basicSetArrayValue(null, msgs);
      case GoPackage.EXPRESSAO__VARIAVEIS:
        return basicSetVariaveis(null, msgs);
      case GoPackage.EXPRESSAO__CHAM:
        return basicSetCham(null, msgs);
      case GoPackage.EXPRESSAO__IF:
        return basicSetIf(null, msgs);
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
      case GoPackage.EXPRESSAO__DECL_FUNCTION:
        return getDeclFunction();
      case GoPackage.EXPRESSAO__BINARY_EXP:
        return getBinary_exp();
      case GoPackage.EXPRESSAO__BASIC:
        return getBasic();
      case GoPackage.EXPRESSAO__ASSIGNMENT:
        return getAssignment();
      case GoPackage.EXPRESSAO__FOR:
        return getFor();
      case GoPackage.EXPRESSAO__ARRAY_VALUE:
        return getArrayValue();
      case GoPackage.EXPRESSAO__VARIAVEIS:
        return getVariaveis();
      case GoPackage.EXPRESSAO__CHAM:
        return getCham();
      case GoPackage.EXPRESSAO__IF:
        return getIf();
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
      case GoPackage.EXPRESSAO__DECL_FUNCTION:
        setDeclFunction((FunctionType)newValue);
        return;
      case GoPackage.EXPRESSAO__BINARY_EXP:
        setBinary_exp((BINARY_EXP)newValue);
        return;
      case GoPackage.EXPRESSAO__BASIC:
        setBasic((LITERAIS_BASICOS)newValue);
        return;
      case GoPackage.EXPRESSAO__ASSIGNMENT:
        setAssignment((Assignment)newValue);
        return;
      case GoPackage.EXPRESSAO__FOR:
        setFor((ForDecl)newValue);
        return;
      case GoPackage.EXPRESSAO__ARRAY_VALUE:
        setArrayValue((ArrayValue)newValue);
        return;
      case GoPackage.EXPRESSAO__VARIAVEIS:
        setVariaveis((VarDecl)newValue);
        return;
      case GoPackage.EXPRESSAO__CHAM:
        setCham((Chamada)newValue);
        return;
      case GoPackage.EXPRESSAO__IF:
        setIf((IfStmt)newValue);
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
      case GoPackage.EXPRESSAO__DECL_FUNCTION:
        setDeclFunction((FunctionType)null);
        return;
      case GoPackage.EXPRESSAO__BINARY_EXP:
        setBinary_exp((BINARY_EXP)null);
        return;
      case GoPackage.EXPRESSAO__BASIC:
        setBasic((LITERAIS_BASICOS)null);
        return;
      case GoPackage.EXPRESSAO__ASSIGNMENT:
        setAssignment((Assignment)null);
        return;
      case GoPackage.EXPRESSAO__FOR:
        setFor((ForDecl)null);
        return;
      case GoPackage.EXPRESSAO__ARRAY_VALUE:
        setArrayValue((ArrayValue)null);
        return;
      case GoPackage.EXPRESSAO__VARIAVEIS:
        setVariaveis((VarDecl)null);
        return;
      case GoPackage.EXPRESSAO__CHAM:
        setCham((Chamada)null);
        return;
      case GoPackage.EXPRESSAO__IF:
        setIf((IfStmt)null);
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
      case GoPackage.EXPRESSAO__DECL_FUNCTION:
        return declFunction != null;
      case GoPackage.EXPRESSAO__BINARY_EXP:
        return binary_exp != null;
      case GoPackage.EXPRESSAO__BASIC:
        return basic != null;
      case GoPackage.EXPRESSAO__ASSIGNMENT:
        return assignment != null;
      case GoPackage.EXPRESSAO__FOR:
        return for_ != null;
      case GoPackage.EXPRESSAO__ARRAY_VALUE:
        return arrayValue != null;
      case GoPackage.EXPRESSAO__VARIAVEIS:
        return variaveis != null;
      case GoPackage.EXPRESSAO__CHAM:
        return cham != null;
      case GoPackage.EXPRESSAO__IF:
        return if_ != null;
    }
    return super.eIsSet(featureID);
  }

} //EXPRESSAOImpl