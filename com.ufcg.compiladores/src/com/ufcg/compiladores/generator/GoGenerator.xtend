/*
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.generator

import com.google.inject.Inject
import com.ufcg.compiladores.go.BINARY_EXP
import com.ufcg.compiladores.go.EXPRESSAO
import com.ufcg.compiladores.go.EXPRESSAOLINHA
import com.ufcg.compiladores.go.ForDecl
import com.ufcg.compiladores.go.GoDecl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GoGenerator extends AbstractGenerator {

		 
	Integer variables = 1;
	Integer address = 0;
	Integer labelIndex = 0;
	String Labels = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	@Inject extension IQualifiedNameProvider


	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		variables = 1;
		address = 0;
		for (e : resource.allContents.toIterable.filter(GoDecl)) {
			//fsa.generateFile(e.varDecl.toString() +	".txt",  
			//e.compileGoDecl)
			fsa.generateFile("test.txt",  
			e.compileGoDecl)
		}
	}
	
	def void increment() {
		variables++;
	}
	
	def void nextAddress() {
		address = address + 8;
	}
	
	def void nextLabel() {
		labelIndex++;	
	}
	
	def char getLabel(int index) {
		return Labels.charAt(index);
	}
	
	def compileGoDecl(GoDecl go)  '''
		«address»: LD SP, 1000
		«nextAddress»
		«IF go.expressao != null»
			«compileExpressaoLinha(go.expressao)»
		«ENDIF»		
		«nextAddress»
	'''
	
	def compileExpressaoLinha(EXPRESSAOLINHA expression) '''
	«IF expression.exp != null»	
		«compileExpressao(expression.exp)»
	«ENDIF»
	'''
	
	def compileExpressao(EXPRESSAO expression) '''
		«IF expression.binary_exp != null»
			«genLogicalExpression(expression.binary_exp)»
		«ELSEIF expression.forDecl != null»
			«compileForStatement(expression.forDecl)»
		«ENDIF»	
	'''
	
	def genLogicalExpression(BINARY_EXP expression) '''
		«IF expression.basic != null && expression.bool != null»
			«IF expression.bool.equals("&&")»
				«address.toString()»: AND R«(variables-1).toString()», TRUE
			«ELSE»
				«address.toString()»: OR R«(variables-1).toString()», TRUE
			«ENDIF»			
			«nextAddress»
		«ENDIF»
	'''
	
	def compileForStatement(ForDecl forStatement) '''
		«IF forStatement.range != null»
			«FOR id : forStatement.range.idList»
				«address.toString()»: ST «id.toString», #«declarator.initializer.expression.literalExpression.exp1»	
				«nextAddress»
			«ENDFOR»
		«ENDIF»
	'''
}
