/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiler.go;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.ufcg.compiler.go.GoPackage
 * @generated
 */
public interface GoFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GoFactory eINSTANCE = com.ufcg.compiler.go.impl.GoFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init</em>'.
   * @generated
   */
  Init createInit();

  /**
   * Returns a new object of class '<em>BOOL OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BOOL OP</em>'.
   * @generated
   */
  BOOL_OP createBOOL_OP();

  /**
   * Returns a new object of class '<em>BOOLEAN VALUE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BOOLEAN VALUE</em>'.
   * @generated
   */
  BOOLEAN_VALUE createBOOLEAN_VALUE();

  /**
   * Returns a new object of class '<em>Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decl</em>'.
   * @generated
   */
  GoDecl createGoDecl();

  /**
   * Returns a new object of class '<em>For Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Decl</em>'.
   * @generated
   */
  ForDecl createForDecl();

  /**
   * Returns a new object of class '<em>For Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Clause</em>'.
   * @generated
   */
  ForClause createForClause();

  /**
   * Returns a new object of class '<em>Init Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Stmt</em>'.
   * @generated
   */
  InitStmt createInitStmt();

  /**
   * Returns a new object of class '<em>Post Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Post Stmt</em>'.
   * @generated
   */
  PostStmt createPostStmt();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>ID List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ID List</em>'.
   * @generated
   */
  IDList createIDList();

  /**
   * Returns a new object of class '<em>Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Decl</em>'.
   * @generated
   */
  VarDecl createVarDecl();

  /**
   * Returns a new object of class '<em>Signature Del</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signature Del</em>'.
   * @generated
   */
  SignatureDel createSignatureDel();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>TIPO</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TIPO</em>'.
   * @generated
   */
  TIPO createTIPO();

  /**
   * Returns a new object of class '<em>Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var</em>'.
   * @generated
   */
  Var createVar();

  /**
   * Returns a new object of class '<em>Const</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Const</em>'.
   * @generated
   */
  Const createConst();

  /**
   * Returns a new object of class '<em>IGUAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IGUAL</em>'.
   * @generated
   */
  IGUAL createIGUAL();

  /**
   * Returns a new object of class '<em>PONTOSIGUAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PONTOSIGUAL</em>'.
   * @generated
   */
  PONTOSIGUAL createPONTOSIGUAL();

  /**
   * Returns a new object of class '<em>EXPRESSAOLINHA</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EXPRESSAOLINHA</em>'.
   * @generated
   */
  EXPRESSAOLINHA createEXPRESSAOLINHA();

  /**
   * Returns a new object of class '<em>EXPRESSAO</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EXPRESSAO</em>'.
   * @generated
   */
  EXPRESSAO createEXPRESSAO();

  /**
   * Returns a new object of class '<em>Array Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Value</em>'.
   * @generated
   */
  ArrayValue createArrayValue();

  /**
   * Returns a new object of class '<em>Literais List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literais List</em>'.
   * @generated
   */
  LiteraisList createLiteraisList();

  /**
   * Returns a new object of class '<em>LITERAIS BASICOS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LITERAIS BASICOS</em>'.
   * @generated
   */
  LITERAIS_BASICOS createLITERAIS_BASICOS();

  /**
   * Returns a new object of class '<em>BINARY EXP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BINARY EXP</em>'.
   * @generated
   */
  BINARY_EXP createBINARY_EXP();

  /**
   * Returns a new object of class '<em>Function Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Type</em>'.
   * @generated
   */
  FunctionType createFunctionType();

  /**
   * Returns a new object of class '<em>Signature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signature</em>'.
   * @generated
   */
  Signature createSignature();

  /**
   * Returns a new object of class '<em>Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result</em>'.
   * @generated
   */
  Result createResult();

  /**
   * Returns a new object of class '<em>Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameters</em>'.
   * @generated
   */
  Parameters createParameters();

  /**
   * Returns a new object of class '<em>BLOCK</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BLOCK</em>'.
   * @generated
   */
  BLOCK createBLOCK();

  /**
   * Returns a new object of class '<em>PARAMETERS LIST</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PARAMETERS LIST</em>'.
   * @generated
   */
  PARAMETERS_LIST createPARAMETERS_LIST();

  /**
   * Returns a new object of class '<em>PARAMETER</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PARAMETER</em>'.
   * @generated
   */
  PARAMETER createPARAMETER();

  /**
   * Returns a new object of class '<em>Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Types</em>'.
   * @generated
   */
  Types createTypes();

  /**
   * Returns a new object of class '<em>Array Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Type</em>'.
   * @generated
   */
  ArrayType createArrayType();

  /**
   * Returns a new object of class '<em>Basic Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Type</em>'.
   * @generated
   */
  BasicType createBasicType();

  /**
   * Returns a new object of class '<em>COMPARISON</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>COMPARISON</em>'.
   * @generated
   */
  COMPARISON createCOMPARISON();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GoPackage getGoPackage();

} //GoFactory
