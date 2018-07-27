/*
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.validation

import java.util.HashMap
import com.ufcg.compiladores.go.VarDecl
import org.eclipse.xtext.xbase.lib.internal.FunctionDelegate
import com.ufcg.compiladores.go.FunctionType
import com.ufcg.compiladores.go.Init
import com.ufcg.compiladores.go.GoPackage
import com.ufcg.compiladores.go.Assignment
import org.eclipse.xtext.validation.Check
import com.ufcg.compiladores.go.VarCall
import com.ufcg.compiladores.go.FunctionCall
import com.ufcg.compiladores.go.Const
import com.ufcg.compiladores.go.PARAMETERS_LIST
import java.util.List
import java.util.ArrayList
import com.ufcg.compiladores.go.PARAMETER
import com.ufcg.compiladores.go.Types
import com.ufcg.compiladores.go.LITERAIS_BASICOS
import com.ufcg.compiladores.go.BasicType
import com.ufcg.compiladores.go.EXPRESSAO
import com.ufcg.compiladores.go.RangeDecl
import com.ufcg.compiladores.go.ForDecl
import com.ufcg.compiladores.go.ForClause
import com.ufcg.compiladores.go.BINARY_EXP

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class GoValidator extends AbstractGoValidator {
	

	private var variaveis = new HashMap<String, VarDecl>();
  
 	private var functions = <String, FunctionType>newHashMap();
 	
 	def getTipo(BasicType lit) {
		if (lit.boolean !== null) {
			return "bool"
		} else if (lit.int !== null) {
			return "int"
		} else if (lit.float !== null) {
			return "float"
		} else {
			return "string"
		}
	}
	
	@Check
	def restart(Init init) {
		variaveis.clear();
		functions.clear();
	}
	
	@Check
	def checaFuncDecl(FunctionType func) {
		if (!functions.containsKey(func.nome)) {
			functions.put(func.nome, func)
		} else {
			error("Função com esse nome já declarada", null)
		}
		
		for (EXPRESSAO comando : func.bloco.listaDeComandos ) {
			if (comando.variaveis !== null) {
				
//				checaVariavelDeclaradaSemInicializar(comando.variaveis)
			} else if (comando.declFunction !== null) {
//				functions.put(comando.declFunction.nome, comando.declFunction)
			}
		}
		
		if (func.assinatura.retorno !== null) {
				if (func.bloco.retorno === null) {
					error("Função exige retorno", null)
				} else {
					var String tipoEsperado = getTipo(func.assinatura.retorno.basic)
					var String tipoInserido
					if (func.bloco.retorno.basic !== null) {
						if (func.bloco.retorno.basic.booleano !== null) {
							tipoInserido = "bool"
						} else if (func.bloco.retorno.basic.numero !== null) {
							tipoInserido = "int"
						}  else if (func.bloco.retorno.basic.string !== null) {
							tipoInserido = "string"
						}
					} else if (func.bloco.retorno.func !== null) {
						var FunctionType funcRetorno = functions.get(func.bloco.retorno.func.id)
						if (funcRetorno === null) {
							error("Função não declara no contexto.", null)
						} else {
							tipoInserido = getTipo(funcRetorno.assinatura.retorno.basic)
						}
					} else {
						var VarDecl variavel = variaveis.get(func.bloco.retorno.idVar.id)
						if (variavel === null) {
							error("Variável não declarada.", null)
						} else {
							tipoInserido = getTipoVariavel(variavel);
						}
					}
					
					if (!tipoEsperado.equals(tipoInserido)) {
						error("Tipo de retorno inválido. Esperado " + tipoEsperado +
							" mas teve " + tipoInserido, null)
					}
				}
			}
	}
	
	def getTipoVariavel(VarDecl variavel){
		if(variavel.varIgual != null){
			return getTipo(variavel.varIgual.signature.type.basic);
		} else {
			return getTipoChamada(variavel.varPontos.expressao);
		}
	}
	
	def getIdVariavel(VarDecl variavel){
		if(variavel.varIgual != null){
			return variavel.varIgual.signature.id;
		} else {
			return variavel.varPontos.id;
		}
	}
	
	def getTipoChamada(Chamada ch){
		if(ch.lit != null){
			return getTipoLiteral(ch.lit)
		} 
		if(ch.chamFunc != null){
			var FunctionType funcao = functions.get(ch.chamFunc.id)
			return getTipo(funcao.assinatura.retorno.basic)
		}
		//Os outros tipos	
	}
	
	def getTipoLiteral(LITERAIS_BASICOS lit){
		if (lit.booleano !== null) {
			return "bool"
		} else if (lit.numero !== null) {
			return "int"
		} else if (lit.string !== null) {
			return "string"
		}
	}
	
	@Check
	def checaVariavelDeclaradaSemInicializar(VarDecl varDecl) {
		if (!variaveis.containsKey(getIdVariavel(varDecl))) {
			variaveis.put(getIdVariavel(varDecl), varDecl)
		} else {
			error("Variável já declarada", null)
		}
		
		if (varDecl.varPontos!= null && varDecl.varPontos.expressao === null) {
			error("Variável declarada sem inicialização", GoPackage.Literals.VAR_DECL_PONTOS_IGUAL__EXPRESSAO)
		}		
		if (varDecl.varIgual.expressao !== null || varDecl.varPontos.expressao !== null) {
			var Chamada chamada;
			if(varDecl.varPontos!== null){ chamada = varDecl.varPontos.expressao;}
			else{chamada = varDecl.varIgual.expressao}
			var String tipoDeclarado = getTipoVariavel(varDecl)
			if (chamada.chamFunc !== null) {
				var FunctionType funcao = functions.get(chamada.chamFunc.id)
				var String tipoDaFuncao = getTipo(funcao.assinatura.retorno.basic)
				if (!tipoDeclarado.equals(tipoDaFuncao)) {
					error("Não é possível usar o tipo " + tipoDaFuncao + " numa variável do tipo " + tipoDeclarado, null)
				}
			} else if (chamada.chamVar !== null) {
				error("agora vai" + (chamada.chamVar !== null), null)
				var String tipoDaVar = getTipoVariavel(variaveis.get(chamada.chamVar))
				if (!tipoDeclarado.equals(tipoDaVar)) {
					error("Não é possível usar o tipo " + tipoDaVar + " numa variável do tipo " + tipoDeclarado, null)
				}
			} else if (tipoDeclarado.equals("bool") && chamada.lit.booleano === null) {
				error("Não é possível usar o tipo passado numa variável do tipo " + tipoDeclarado, null)
			} else if (chamada.lit.numero === null && tipoDeclarado.equals("int")) {
				error("Não é possível usar o tipo passado numa variável do tipo " + tipoDeclarado, null)
			} else if (chamada.lit.string === null && tipoDeclarado.equals("string")) {
				error("Não é possível usar o tipo passado numa variável do tipo " + tipoDeclarado, null)
			}
		}
	}
	
	@Check
	def checaChamadaAVarDeclarada(VarCall cal) {
		if (!variaveis.containsKey(cal.id)) {
			error("Variável não declarada", null)
		}
	}
	
	def getParametersType(PARAMETERS_LIST params){
		var List<String> tipos = new ArrayList<String>();
		if(params !== null && params.params !== null){
			for(PARAMETER parametro : params.params){
				tipos.add(getTipo(parametro.tipo.basic));
			}
		}
		return tipos; 
	}
	
	def getParametersCall(PARAMETERS_LIST params) {
		var List<String> tipos = new ArrayList<String>();
		if(params !== null && params.params !== null){
			for(PARAMETER parametro : params.params){
				if (parametro.basico !== null) {
					if (parametro.basico.booleano !== null) {
						tipos.add("bool")
					} else if (parametro.basico.numero !== null) {
						tipos.add("int")
					} else {
						tipos.add("string")
					}
				} else {
					tipos.add(getTipoVariavel(variaveis.get(parametro.id)))
				}
			}
		}
		return tipos
	}
	
	@Check
	def checaChamadaAFuncao(FunctionCall func) {
		if (!functions.containsKey(func.id)) {
			error("Função não declarada", null)
		} else {
			var PARAMETERS_LIST callParams = func.params
			var PARAMETERS_LIST funcParams = functions.get(func.id).assinatura.params.params
			
			var List<String> tiposFuncao = getParametersType(funcParams)
			var List<String> tiposChamada = getParametersCall(callParams)
			
			if (tiposChamada.size !== tiposFuncao.size) {
				error("Número de parâmetros errado. Esperado " + tiposFuncao.size + " mas obteve " + tiposChamada.size, null)
			} else {
				for (var int i = 0; i < tiposFuncao.size() ; i++) {
					if (!tiposFuncao.get(i).equals(tiposChamada.get(i))) {
						error("Tipo inesperado. Tipo esperado: " + tiposFuncao.get(i) +
							" , Tipo obtido: " + tiposChamada.get(i), null
						)
					}
				}
			}
		}
	}
	
	@Check
	def checaAtribuicaoSemValor(Assignment a) {
		if (a.expressao === null) {
			error("É necessário inicializar um valor", null)
		}
	}
	
	@Check
	def checaAtribuicaoAConstante(Assignment a) {
		if (isVarDeclarada(a.id) && (variaveis.get(a.id).varIgual.signature.tipoDecl instanceof Const)) {
			error("Não é possível reatribuir o valor de uma constante", null)
		}
	}
	
	@Check
	def checaFor(ForDecl forDecl) {
		if (forDecl.range !== null) {
			checaVarDoRange(forDecl.range)
		} else if (forDecl.clause !== null) {
			checaForNormal(forDecl.clause)
		}
	}
	
	@Check
	def checaBinaryExpr(BINARY_EXP bin) {
		
		if (bin.arit !== null) {
			if (bin.basic !== null) {
				for (LITERAIS_BASICOS lit : bin.basic) {
					if (lit.numero === null) {
						error("Tipo do literal deve ser int", null)
					}
				}
			} else if (bin.varCal !== null) {
				for (VarCall call : bin.varCal) {
					var VarDecl variavel = variaveis.get(call.id)
					if (getTipoVariavel(variavel) !== "int") {
						error("Tipo da variável deve ser int", null)
					}
				}
			} else if (bin.func !== null) {
				for (FunctionCall func : bin.func) {
					var FunctionType function = functions.get(func.id)
					
					if (function.assinatura.retorno.basic.int === null) {
						error("Tipo de retorno da função deve ser int", null)
					}
				}
			}
		}
		
		if (bin.bool !== null) {
			if (bin.basic !== null) {
				for (LITERAIS_BASICOS lit : bin.basic) {
					if (lit.booleano === null) {
						error("Tipo do literal deve ser bool", null)
					}
				}
			} else if (bin.varCal !== null) {
				for (VarCall call : bin.varCal) {
					var VarDecl variavel = variaveis.get(call.id)
					if (getTipoVariavel(variavel) !== "bool") {
						error("Tipo da variável deve ser bool", null)
					}
				}
			} else if (bin.func !== null) {
				for (FunctionCall func : bin.func) {
					var FunctionType function = functions.get(func.id)
					
					if (function.assinatura.retorno.basic.boolean === null) {
						error("Tipo de retorno da função deve ser bool", null)
					}
				}
			}	
		}
	}
	
	def checaForNormal(ForClause clause) {
		if(clause.init !== null) {
			var String tipo = getTipoVariavel(clause.init.varDecl).toString();
			if (tipo !== "int") {
				error("Tipo da variável de controle do laço deve ser numérica " + tipo, null)
			}
		}
	}
	
	def checaVarDoRange(RangeDecl range) {
		if (range.variavel !== null) {
			var VarDecl variavel = variaveis.get(range.variavel.id)
			if (variavel.varIgual.array === null || variavel.varPontos.array === null 
				|| getTipoVariavel(variavel).toString() != "string" ) {
				error("Tipo passado não é iterável", null)
			}
		} else if (range.func !== null) {
			var FunctionType function = functions.get(range.func.id)
			if (function.assinatura.retorno.array === null) {
				error("Retorno da função deve ser do tipo Array", null)
			}
		}
	}
	
	def boolean isVarDeclarada(String id) {
		return variaveis.containsKey(id)
	}

//	@Check
//	def testaSeVarComTipoRecebeTipoCerto(VarDecl varDecl) {
//		if (varDecl.signature.type !== null) {
//			if (varDecl.type == "string") {
//				if (varDecl.expressao instanceof LITERAIS_BASICOS) {
//					error("Erro sintático", GoPackage.Literals.VAR_DECL__EXPRESSAO)
//				}
//			}
//		}
//	}
}