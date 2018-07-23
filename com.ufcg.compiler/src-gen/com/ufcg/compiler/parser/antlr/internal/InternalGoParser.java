package com.ufcg.compiler.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ufcg.compiler.services.GoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMERO", "RULE_STRING_DECL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'&'", "'||'", "'true'", "'false'", "'for'", "'{'", "'}'", "';'", "','", "'['", "']'", "'var'", "'const'", "'='", "':='", "'func'", "'('", "')'", "'string'", "'int'", "'float'", "'bool'", "'+'", "'-'", "'*'", "'/'", "'^'", "'=='", "'>='", "'<='", "'>'", "'<'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_NUMERO=5;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING_DECL=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGo.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private GoGrammarAccess grammarAccess;

        public InternalGoParser(TokenStream input, GoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Init";
       	}

       	@Override
       	protected GoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInit"
    // InternalGo.g:70:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // InternalGo.g:70:45: (iv_ruleInit= ruleInit EOF )
            // InternalGo.g:71:2: iv_ruleInit= ruleInit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInit=ruleInit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // InternalGo.g:77:1: ruleInit returns [EObject current=null] : ( (lv_elements_0_0= ruleGoDecl ) )* ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:83:2: ( ( (lv_elements_0_0= ruleGoDecl ) )* )
            // InternalGo.g:84:2: ( (lv_elements_0_0= ruleGoDecl ) )*
            {
            // InternalGo.g:84:2: ( (lv_elements_0_0= ruleGoDecl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING_DECL)||(LA1_0>=15 && LA1_0<=18)||(LA1_0>=24 && LA1_0<=25)||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:85:3: (lv_elements_0_0= ruleGoDecl )
            	    {
            	    // InternalGo.g:85:3: (lv_elements_0_0= ruleGoDecl )
            	    // InternalGo.g:86:4: lv_elements_0_0= ruleGoDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getInitAccess().getElementsGoDeclParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleGoDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getInitRule());
            	      				}
            	      				add(
            	      					current,
            	      					"elements",
            	      					lv_elements_0_0,
            	      					"com.ufcg.compiler.Go.GoDecl");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInit"


    // $ANTLR start "entryRuleBOOL_OP"
    // InternalGo.g:106:1: entryRuleBOOL_OP returns [EObject current=null] : iv_ruleBOOL_OP= ruleBOOL_OP EOF ;
    public final EObject entryRuleBOOL_OP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOL_OP = null;


        try {
            // InternalGo.g:106:48: (iv_ruleBOOL_OP= ruleBOOL_OP EOF )
            // InternalGo.g:107:2: iv_ruleBOOL_OP= ruleBOOL_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOL_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBOOL_OP=ruleBOOL_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOL_OP; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOL_OP"


    // $ANTLR start "ruleBOOL_OP"
    // InternalGo.g:113:1: ruleBOOL_OP returns [EObject current=null] : ( ( (lv_and_0_0= '&' ) ) | ( (lv_or_1_0= '||' ) ) ) ;
    public final EObject ruleBOOL_OP() throws RecognitionException {
        EObject current = null;

        Token lv_and_0_0=null;
        Token lv_or_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:119:2: ( ( ( (lv_and_0_0= '&' ) ) | ( (lv_or_1_0= '||' ) ) ) )
            // InternalGo.g:120:2: ( ( (lv_and_0_0= '&' ) ) | ( (lv_or_1_0= '||' ) ) )
            {
            // InternalGo.g:120:2: ( ( (lv_and_0_0= '&' ) ) | ( (lv_or_1_0= '||' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGo.g:121:3: ( (lv_and_0_0= '&' ) )
                    {
                    // InternalGo.g:121:3: ( (lv_and_0_0= '&' ) )
                    // InternalGo.g:122:4: (lv_and_0_0= '&' )
                    {
                    // InternalGo.g:122:4: (lv_and_0_0= '&' )
                    // InternalGo.g:123:5: lv_and_0_0= '&'
                    {
                    lv_and_0_0=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_and_0_0, grammarAccess.getBOOL_OPAccess().getAndAmpersandKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBOOL_OPRule());
                      					}
                      					setWithLastConsumed(current, "and", lv_and_0_0, "&");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:136:3: ( (lv_or_1_0= '||' ) )
                    {
                    // InternalGo.g:136:3: ( (lv_or_1_0= '||' ) )
                    // InternalGo.g:137:4: (lv_or_1_0= '||' )
                    {
                    // InternalGo.g:137:4: (lv_or_1_0= '||' )
                    // InternalGo.g:138:5: lv_or_1_0= '||'
                    {
                    lv_or_1_0=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_or_1_0, grammarAccess.getBOOL_OPAccess().getOrVerticalLineVerticalLineKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBOOL_OPRule());
                      					}
                      					setWithLastConsumed(current, "or", lv_or_1_0, "||");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOL_OP"


    // $ANTLR start "entryRuleBOOLEAN_VALUE"
    // InternalGo.g:154:1: entryRuleBOOLEAN_VALUE returns [EObject current=null] : iv_ruleBOOLEAN_VALUE= ruleBOOLEAN_VALUE EOF ;
    public final EObject entryRuleBOOLEAN_VALUE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEAN_VALUE = null;


        try {
            // InternalGo.g:154:54: (iv_ruleBOOLEAN_VALUE= ruleBOOLEAN_VALUE EOF )
            // InternalGo.g:155:2: iv_ruleBOOLEAN_VALUE= ruleBOOLEAN_VALUE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLEAN_VALUERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN_VALUE=ruleBOOLEAN_VALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOLEAN_VALUE; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN_VALUE"


    // $ANTLR start "ruleBOOLEAN_VALUE"
    // InternalGo.g:161:1: ruleBOOLEAN_VALUE returns [EObject current=null] : ( ( ( ( 'true' ) )=> (lv_verdadeiro_0_0= 'true' ) ) | ( ( ( 'false' ) )=> (lv_falso_1_0= 'false' ) ) ) ;
    public final EObject ruleBOOLEAN_VALUE() throws RecognitionException {
        EObject current = null;

        Token lv_verdadeiro_0_0=null;
        Token lv_falso_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:167:2: ( ( ( ( ( 'true' ) )=> (lv_verdadeiro_0_0= 'true' ) ) | ( ( ( 'false' ) )=> (lv_falso_1_0= 'false' ) ) ) )
            // InternalGo.g:168:2: ( ( ( ( 'true' ) )=> (lv_verdadeiro_0_0= 'true' ) ) | ( ( ( 'false' ) )=> (lv_falso_1_0= 'false' ) ) )
            {
            // InternalGo.g:168:2: ( ( ( ( 'true' ) )=> (lv_verdadeiro_0_0= 'true' ) ) | ( ( ( 'false' ) )=> (lv_falso_1_0= 'false' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) && (synpred5_InternalGo())) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGo.g:169:3: ( ( ( 'true' ) )=> (lv_verdadeiro_0_0= 'true' ) )
                    {
                    // InternalGo.g:169:3: ( ( ( 'true' ) )=> (lv_verdadeiro_0_0= 'true' ) )
                    // InternalGo.g:170:4: ( ( 'true' ) )=> (lv_verdadeiro_0_0= 'true' )
                    {
                    // InternalGo.g:174:4: (lv_verdadeiro_0_0= 'true' )
                    // InternalGo.g:175:5: lv_verdadeiro_0_0= 'true'
                    {
                    lv_verdadeiro_0_0=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_verdadeiro_0_0, grammarAccess.getBOOLEAN_VALUEAccess().getVerdadeiroTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBOOLEAN_VALUERule());
                      					}
                      					setWithLastConsumed(current, "verdadeiro", lv_verdadeiro_0_0, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:188:3: ( ( ( 'false' ) )=> (lv_falso_1_0= 'false' ) )
                    {
                    // InternalGo.g:188:3: ( ( ( 'false' ) )=> (lv_falso_1_0= 'false' ) )
                    // InternalGo.g:189:4: ( ( 'false' ) )=> (lv_falso_1_0= 'false' )
                    {
                    // InternalGo.g:193:4: (lv_falso_1_0= 'false' )
                    // InternalGo.g:194:5: lv_falso_1_0= 'false'
                    {
                    lv_falso_1_0=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_falso_1_0, grammarAccess.getBOOLEAN_VALUEAccess().getFalsoFalseKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBOOLEAN_VALUERule());
                      					}
                      					setWithLastConsumed(current, "falso", lv_falso_1_0, "false");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN_VALUE"


    // $ANTLR start "entryRuleGoDecl"
    // InternalGo.g:210:1: entryRuleGoDecl returns [EObject current=null] : iv_ruleGoDecl= ruleGoDecl EOF ;
    public final EObject entryRuleGoDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoDecl = null;


        try {
            // InternalGo.g:210:47: (iv_ruleGoDecl= ruleGoDecl EOF )
            // InternalGo.g:211:2: iv_ruleGoDecl= ruleGoDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGoDecl=ruleGoDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoDecl"


    // $ANTLR start "ruleGoDecl"
    // InternalGo.g:217:1: ruleGoDecl returns [EObject current=null] : ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFunctionType ) ) | ( (lv_expressao_2_0= ruleEXPRESSAOLINHA ) ) ) ;
    public final EObject ruleGoDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_func_1_0 = null;

        EObject lv_expressao_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:223:2: ( ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFunctionType ) ) | ( (lv_expressao_2_0= ruleEXPRESSAOLINHA ) ) ) )
            // InternalGo.g:224:2: ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFunctionType ) ) | ( (lv_expressao_2_0= ruleEXPRESSAOLINHA ) ) )
            {
            // InternalGo.g:224:2: ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFunctionType ) ) | ( (lv_expressao_2_0= ruleEXPRESSAOLINHA ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalGo.g:225:3: ( (lv_var_0_0= ruleVarDecl ) )
                    {
                    // InternalGo.g:225:3: ( (lv_var_0_0= ruleVarDecl ) )
                    // InternalGo.g:226:4: (lv_var_0_0= ruleVarDecl )
                    {
                    // InternalGo.g:226:4: (lv_var_0_0= ruleVarDecl )
                    // InternalGo.g:227:5: lv_var_0_0= ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGoDeclAccess().getVarVarDeclParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_var_0_0=ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGoDeclRule());
                      					}
                      					set(
                      						current,
                      						"var",
                      						lv_var_0_0,
                      						"com.ufcg.compiler.Go.VarDecl");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:245:3: ( (lv_func_1_0= ruleFunctionType ) )
                    {
                    // InternalGo.g:245:3: ( (lv_func_1_0= ruleFunctionType ) )
                    // InternalGo.g:246:4: (lv_func_1_0= ruleFunctionType )
                    {
                    // InternalGo.g:246:4: (lv_func_1_0= ruleFunctionType )
                    // InternalGo.g:247:5: lv_func_1_0= ruleFunctionType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGoDeclAccess().getFuncFunctionTypeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_func_1_0=ruleFunctionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGoDeclRule());
                      					}
                      					set(
                      						current,
                      						"func",
                      						lv_func_1_0,
                      						"com.ufcg.compiler.Go.FunctionType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:265:3: ( (lv_expressao_2_0= ruleEXPRESSAOLINHA ) )
                    {
                    // InternalGo.g:265:3: ( (lv_expressao_2_0= ruleEXPRESSAOLINHA ) )
                    // InternalGo.g:266:4: (lv_expressao_2_0= ruleEXPRESSAOLINHA )
                    {
                    // InternalGo.g:266:4: (lv_expressao_2_0= ruleEXPRESSAOLINHA )
                    // InternalGo.g:267:5: lv_expressao_2_0= ruleEXPRESSAOLINHA
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGoDeclAccess().getExpressaoEXPRESSAOLINHAParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expressao_2_0=ruleEXPRESSAOLINHA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGoDeclRule());
                      					}
                      					set(
                      						current,
                      						"expressao",
                      						lv_expressao_2_0,
                      						"com.ufcg.compiler.Go.EXPRESSAOLINHA");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoDecl"


    // $ANTLR start "entryRuleForDecl"
    // InternalGo.g:288:1: entryRuleForDecl returns [EObject current=null] : iv_ruleForDecl= ruleForDecl EOF ;
    public final EObject entryRuleForDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForDecl = null;


        try {
            // InternalGo.g:288:48: (iv_ruleForDecl= ruleForDecl EOF )
            // InternalGo.g:289:2: iv_ruleForDecl= ruleForDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForDecl=ruleForDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForDecl"


    // $ANTLR start "ruleForDecl"
    // InternalGo.g:295:1: ruleForDecl returns [EObject current=null] : (otherlv_0= 'for' ( ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause ) ) otherlv_2= '{' ( (lv_exp_3_0= ruleEXPRESSAOLINHA ) ) otherlv_4= '}' ) ;
    public final EObject ruleForDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_clause_1_0 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:301:2: ( (otherlv_0= 'for' ( ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause ) ) otherlv_2= '{' ( (lv_exp_3_0= ruleEXPRESSAOLINHA ) ) otherlv_4= '}' ) )
            // InternalGo.g:302:2: (otherlv_0= 'for' ( ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause ) ) otherlv_2= '{' ( (lv_exp_3_0= ruleEXPRESSAOLINHA ) ) otherlv_4= '}' )
            {
            // InternalGo.g:302:2: (otherlv_0= 'for' ( ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause ) ) otherlv_2= '{' ( (lv_exp_3_0= ruleEXPRESSAOLINHA ) ) otherlv_4= '}' )
            // InternalGo.g:303:3: otherlv_0= 'for' ( ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause ) ) otherlv_2= '{' ( (lv_exp_3_0= ruleEXPRESSAOLINHA ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForDeclAccess().getForKeyword_0());
              		
            }
            // InternalGo.g:307:3: ( ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause ) )
            // InternalGo.g:308:4: ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause )
            {
            // InternalGo.g:312:4: (lv_clause_1_0= ruleForClause )
            // InternalGo.g:313:5: lv_clause_1_0= ruleForClause
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForDeclAccess().getClauseForClauseParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_clause_1_0=ruleForClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForDeclRule());
              					}
              					set(
              						current,
              						"clause",
              						lv_clause_1_0,
              						"com.ufcg.compiler.Go.ForClause");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForDeclAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGo.g:334:3: ( (lv_exp_3_0= ruleEXPRESSAOLINHA ) )
            // InternalGo.g:335:4: (lv_exp_3_0= ruleEXPRESSAOLINHA )
            {
            // InternalGo.g:335:4: (lv_exp_3_0= ruleEXPRESSAOLINHA )
            // InternalGo.g:336:5: lv_exp_3_0= ruleEXPRESSAOLINHA
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForDeclAccess().getExpEXPRESSAOLINHAParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_exp_3_0=ruleEXPRESSAOLINHA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForDeclRule());
              					}
              					set(
              						current,
              						"exp",
              						lv_exp_3_0,
              						"com.ufcg.compiler.Go.EXPRESSAOLINHA");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForDeclAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForDecl"


    // $ANTLR start "entryRuleForClause"
    // InternalGo.g:361:1: entryRuleForClause returns [EObject current=null] : iv_ruleForClause= ruleForClause EOF ;
    public final EObject entryRuleForClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForClause = null;


        try {
            // InternalGo.g:361:50: (iv_ruleForClause= ruleForClause EOF )
            // InternalGo.g:362:2: iv_ruleForClause= ruleForClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForClause=ruleForClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForClause"


    // $ANTLR start "ruleForClause"
    // InternalGo.g:368:1: ruleForClause returns [EObject current=null] : ( () ( (lv_init_1_0= ruleInitStmt ) )? otherlv_2= ';' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ';' ( (lv_post_5_0= rulePostStmt ) )? ) ;
    public final EObject ruleForClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_init_1_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_post_5_0 = null;



        	enterRule();

        try {
            // InternalGo.g:374:2: ( ( () ( (lv_init_1_0= ruleInitStmt ) )? otherlv_2= ';' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ';' ( (lv_post_5_0= rulePostStmt ) )? ) )
            // InternalGo.g:375:2: ( () ( (lv_init_1_0= ruleInitStmt ) )? otherlv_2= ';' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ';' ( (lv_post_5_0= rulePostStmt ) )? )
            {
            // InternalGo.g:375:2: ( () ( (lv_init_1_0= ruleInitStmt ) )? otherlv_2= ';' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ';' ( (lv_post_5_0= rulePostStmt ) )? )
            // InternalGo.g:376:3: () ( (lv_init_1_0= ruleInitStmt ) )? otherlv_2= ';' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ';' ( (lv_post_5_0= rulePostStmt ) )?
            {
            // InternalGo.g:376:3: ()
            // InternalGo.g:377:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForClauseAccess().getForClauseAction_0(),
              					current);
              			
            }

            }

            // InternalGo.g:386:3: ( (lv_init_1_0= ruleInitStmt ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING_DECL)||(LA5_0>=15 && LA5_0<=18)||(LA5_0>=24 && LA5_0<=25)||LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGo.g:387:4: (lv_init_1_0= ruleInitStmt )
                    {
                    // InternalGo.g:387:4: (lv_init_1_0= ruleInitStmt )
                    // InternalGo.g:388:5: lv_init_1_0= ruleInitStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForClauseAccess().getInitInitStmtParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_init_1_0=ruleInitStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getForClauseRule());
                      					}
                      					set(
                      						current,
                      						"init",
                      						lv_init_1_0,
                      						"com.ufcg.compiler.Go.InitStmt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForClauseAccess().getSemicolonKeyword_2());
              		
            }
            // InternalGo.g:409:3: ( (lv_condition_3_0= ruleCondition ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING_DECL)||(LA6_0>=15 && LA6_0<=18)||(LA6_0>=24 && LA6_0<=25)||LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:410:4: (lv_condition_3_0= ruleCondition )
                    {
                    // InternalGo.g:410:4: (lv_condition_3_0= ruleCondition )
                    // InternalGo.g:411:5: lv_condition_3_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForClauseAccess().getConditionConditionParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_condition_3_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getForClauseRule());
                      					}
                      					set(
                      						current,
                      						"condition",
                      						lv_condition_3_0,
                      						"com.ufcg.compiler.Go.Condition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForClauseAccess().getSemicolonKeyword_4());
              		
            }
            // InternalGo.g:432:3: ( (lv_post_5_0= rulePostStmt ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING_DECL)||(LA7_0>=15 && LA7_0<=17)||(LA7_0>=24 && LA7_0<=25)||LA7_0==28) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                switch ( input.LA(2) ) {
                    case RULE_NUMERO:
                        {
                        int LA7_4 = input.LA(3);

                        if ( (LA7_4==21) ) {
                            alt7=1;
                        }
                        else if ( (LA7_4==19) ) {
                            int LA7_8 = input.LA(4);

                            if ( (synpred11_InternalGo()) ) {
                                alt7=1;
                            }
                        }
                        }
                        break;
                    case RULE_STRING_DECL:
                        {
                        int LA7_5 = input.LA(3);

                        if ( (LA7_5==21) ) {
                            alt7=1;
                        }
                        else if ( (LA7_5==19) ) {
                            int LA7_8 = input.LA(4);

                            if ( (synpred11_InternalGo()) ) {
                                alt7=1;
                            }
                        }
                        }
                        break;
                    case 15:
                        {
                        int LA7_6 = input.LA(3);

                        if ( (LA7_6==21) ) {
                            alt7=1;
                        }
                        else if ( (LA7_6==19) ) {
                            int LA7_8 = input.LA(4);

                            if ( (synpred11_InternalGo()) ) {
                                alt7=1;
                            }
                        }
                        }
                        break;
                    case 16:
                        {
                        int LA7_7 = input.LA(3);

                        if ( (LA7_7==19) ) {
                            int LA7_8 = input.LA(4);

                            if ( (synpred11_InternalGo()) ) {
                                alt7=1;
                            }
                        }
                        else if ( (LA7_7==21) ) {
                            alt7=1;
                        }
                        }
                        break;
                }

            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:433:4: (lv_post_5_0= rulePostStmt )
                    {
                    // InternalGo.g:433:4: (lv_post_5_0= rulePostStmt )
                    // InternalGo.g:434:5: lv_post_5_0= rulePostStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForClauseAccess().getPostPostStmtParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_post_5_0=rulePostStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getForClauseRule());
                      					}
                      					set(
                      						current,
                      						"post",
                      						lv_post_5_0,
                      						"com.ufcg.compiler.Go.PostStmt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForClause"


    // $ANTLR start "entryRuleInitStmt"
    // InternalGo.g:455:1: entryRuleInitStmt returns [EObject current=null] : iv_ruleInitStmt= ruleInitStmt EOF ;
    public final EObject entryRuleInitStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitStmt = null;


        try {
            // InternalGo.g:455:49: (iv_ruleInitStmt= ruleInitStmt EOF )
            // InternalGo.g:456:2: iv_ruleInitStmt= ruleInitStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInitStmt=ruleInitStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitStmt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitStmt"


    // $ANTLR start "ruleInitStmt"
    // InternalGo.g:462:1: ruleInitStmt returns [EObject current=null] : ( (lv_decl_0_0= ruleGoDecl ) ) ;
    public final EObject ruleInitStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_decl_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:468:2: ( ( (lv_decl_0_0= ruleGoDecl ) ) )
            // InternalGo.g:469:2: ( (lv_decl_0_0= ruleGoDecl ) )
            {
            // InternalGo.g:469:2: ( (lv_decl_0_0= ruleGoDecl ) )
            // InternalGo.g:470:3: (lv_decl_0_0= ruleGoDecl )
            {
            // InternalGo.g:470:3: (lv_decl_0_0= ruleGoDecl )
            // InternalGo.g:471:4: lv_decl_0_0= ruleGoDecl
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getInitStmtAccess().getDeclGoDeclParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_decl_0_0=ruleGoDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getInitStmtRule());
              				}
              				set(
              					current,
              					"decl",
              					lv_decl_0_0,
              					"com.ufcg.compiler.Go.GoDecl");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitStmt"


    // $ANTLR start "entryRulePostStmt"
    // InternalGo.g:491:1: entryRulePostStmt returns [EObject current=null] : iv_rulePostStmt= rulePostStmt EOF ;
    public final EObject entryRulePostStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostStmt = null;


        try {
            // InternalGo.g:491:49: (iv_rulePostStmt= rulePostStmt EOF )
            // InternalGo.g:492:2: iv_rulePostStmt= rulePostStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePostStmt=rulePostStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostStmt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostStmt"


    // $ANTLR start "rulePostStmt"
    // InternalGo.g:498:1: rulePostStmt returns [EObject current=null] : ( (lv_decl_0_0= ruleGoDecl ) ) ;
    public final EObject rulePostStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_decl_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:504:2: ( ( (lv_decl_0_0= ruleGoDecl ) ) )
            // InternalGo.g:505:2: ( (lv_decl_0_0= ruleGoDecl ) )
            {
            // InternalGo.g:505:2: ( (lv_decl_0_0= ruleGoDecl ) )
            // InternalGo.g:506:3: (lv_decl_0_0= ruleGoDecl )
            {
            // InternalGo.g:506:3: (lv_decl_0_0= ruleGoDecl )
            // InternalGo.g:507:4: lv_decl_0_0= ruleGoDecl
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPostStmtAccess().getDeclGoDeclParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_decl_0_0=ruleGoDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPostStmtRule());
              				}
              				set(
              					current,
              					"decl",
              					lv_decl_0_0,
              					"com.ufcg.compiler.Go.GoDecl");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostStmt"


    // $ANTLR start "entryRuleCondition"
    // InternalGo.g:527:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGo.g:527:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGo.g:528:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGo.g:534:1: ruleCondition returns [EObject current=null] : ( ( (lv_expr1_0_0= ruleEXPRESSAO ) ) ( (lv_comparador_1_0= ruleCOMPARISON ) ) ( (lv_expr2_2_0= ruleEXPRESSAO ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_expr1_0_0 = null;

        EObject lv_comparador_1_0 = null;

        EObject lv_expr2_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:540:2: ( ( ( (lv_expr1_0_0= ruleEXPRESSAO ) ) ( (lv_comparador_1_0= ruleCOMPARISON ) ) ( (lv_expr2_2_0= ruleEXPRESSAO ) ) ) )
            // InternalGo.g:541:2: ( ( (lv_expr1_0_0= ruleEXPRESSAO ) ) ( (lv_comparador_1_0= ruleCOMPARISON ) ) ( (lv_expr2_2_0= ruleEXPRESSAO ) ) )
            {
            // InternalGo.g:541:2: ( ( (lv_expr1_0_0= ruleEXPRESSAO ) ) ( (lv_comparador_1_0= ruleCOMPARISON ) ) ( (lv_expr2_2_0= ruleEXPRESSAO ) ) )
            // InternalGo.g:542:3: ( (lv_expr1_0_0= ruleEXPRESSAO ) ) ( (lv_comparador_1_0= ruleCOMPARISON ) ) ( (lv_expr2_2_0= ruleEXPRESSAO ) )
            {
            // InternalGo.g:542:3: ( (lv_expr1_0_0= ruleEXPRESSAO ) )
            // InternalGo.g:543:4: (lv_expr1_0_0= ruleEXPRESSAO )
            {
            // InternalGo.g:543:4: (lv_expr1_0_0= ruleEXPRESSAO )
            // InternalGo.g:544:5: lv_expr1_0_0= ruleEXPRESSAO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getExpr1EXPRESSAOParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_expr1_0_0=ruleEXPRESSAO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					set(
              						current,
              						"expr1",
              						lv_expr1_0_0,
              						"com.ufcg.compiler.Go.EXPRESSAO");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:561:3: ( (lv_comparador_1_0= ruleCOMPARISON ) )
            // InternalGo.g:562:4: (lv_comparador_1_0= ruleCOMPARISON )
            {
            // InternalGo.g:562:4: (lv_comparador_1_0= ruleCOMPARISON )
            // InternalGo.g:563:5: lv_comparador_1_0= ruleCOMPARISON
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getComparadorCOMPARISONParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_comparador_1_0=ruleCOMPARISON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					set(
              						current,
              						"comparador",
              						lv_comparador_1_0,
              						"com.ufcg.compiler.Go.COMPARISON");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:580:3: ( (lv_expr2_2_0= ruleEXPRESSAO ) )
            // InternalGo.g:581:4: (lv_expr2_2_0= ruleEXPRESSAO )
            {
            // InternalGo.g:581:4: (lv_expr2_2_0= ruleEXPRESSAO )
            // InternalGo.g:582:5: lv_expr2_2_0= ruleEXPRESSAO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getExpr2EXPRESSAOParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr2_2_0=ruleEXPRESSAO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					set(
              						current,
              						"expr2",
              						lv_expr2_2_0,
              						"com.ufcg.compiler.Go.EXPRESSAO");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleIDList"
    // InternalGo.g:603:1: entryRuleIDList returns [EObject current=null] : iv_ruleIDList= ruleIDList EOF ;
    public final EObject entryRuleIDList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDList = null;


        try {
            // InternalGo.g:603:47: (iv_ruleIDList= ruleIDList EOF )
            // InternalGo.g:604:2: iv_ruleIDList= ruleIDList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIDList=ruleIDList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIDList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDList"


    // $ANTLR start "ruleIDList"
    // InternalGo.g:610:1: ruleIDList returns [EObject current=null] : ( ( (lv_idList_0_0= RULE_ID ) ) | ( ( (lv_idList_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_list_3_0= ruleIDList ) ) ) ) ;
    public final EObject ruleIDList() throws RecognitionException {
        EObject current = null;

        Token lv_idList_0_0=null;
        Token lv_idList_1_0=null;
        Token otherlv_2=null;
        EObject lv_list_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:616:2: ( ( ( (lv_idList_0_0= RULE_ID ) ) | ( ( (lv_idList_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_list_3_0= ruleIDList ) ) ) ) )
            // InternalGo.g:617:2: ( ( (lv_idList_0_0= RULE_ID ) ) | ( ( (lv_idList_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_list_3_0= ruleIDList ) ) ) )
            {
            // InternalGo.g:617:2: ( ( (lv_idList_0_0= RULE_ID ) ) | ( ( (lv_idList_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_list_3_0= ruleIDList ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==21) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EOF) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:618:3: ( (lv_idList_0_0= RULE_ID ) )
                    {
                    // InternalGo.g:618:3: ( (lv_idList_0_0= RULE_ID ) )
                    // InternalGo.g:619:4: (lv_idList_0_0= RULE_ID )
                    {
                    // InternalGo.g:619:4: (lv_idList_0_0= RULE_ID )
                    // InternalGo.g:620:5: lv_idList_0_0= RULE_ID
                    {
                    lv_idList_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_idList_0_0, grammarAccess.getIDListAccess().getIdListIDTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getIDListRule());
                      					}
                      					addWithLastConsumed(
                      						current,
                      						"idList",
                      						lv_idList_0_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:637:3: ( ( (lv_idList_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_list_3_0= ruleIDList ) ) )
                    {
                    // InternalGo.g:637:3: ( ( (lv_idList_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_list_3_0= ruleIDList ) ) )
                    // InternalGo.g:638:4: ( (lv_idList_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_list_3_0= ruleIDList ) )
                    {
                    // InternalGo.g:638:4: ( (lv_idList_1_0= RULE_ID ) )
                    // InternalGo.g:639:5: (lv_idList_1_0= RULE_ID )
                    {
                    // InternalGo.g:639:5: (lv_idList_1_0= RULE_ID )
                    // InternalGo.g:640:6: lv_idList_1_0= RULE_ID
                    {
                    lv_idList_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_idList_1_0, grammarAccess.getIDListAccess().getIdListIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getIDListRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"idList",
                      							lv_idList_1_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getIDListAccess().getCommaKeyword_1_1());
                      			
                    }
                    // InternalGo.g:660:4: ( (lv_list_3_0= ruleIDList ) )
                    // InternalGo.g:661:5: (lv_list_3_0= ruleIDList )
                    {
                    // InternalGo.g:661:5: (lv_list_3_0= ruleIDList )
                    // InternalGo.g:662:6: lv_list_3_0= ruleIDList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIDListAccess().getListIDListParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_list_3_0=ruleIDList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIDListRule());
                      						}
                      						add(
                      							current,
                      							"list",
                      							lv_list_3_0,
                      							"com.ufcg.compiler.Go.IDList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDList"


    // $ANTLR start "entryRuleVarDecl"
    // InternalGo.g:684:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalGo.g:684:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalGo.g:685:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalGo.g:691:1: ruleVarDecl returns [EObject current=null] : ( ( (lv_signature_0_0= ruleSignatureDel ) ) ( ( ( (lv_atribuicao_1_0= ruleIGUAL ) ) | ( (lv_pront_2_0= rulePONTOSIGUAL ) ) ) ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAO ) ) )? ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_signature_0_0 = null;

        EObject lv_atribuicao_1_0 = null;

        EObject lv_pront_2_0 = null;

        EObject lv_array_3_0 = null;

        EObject lv_expressao_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:697:2: ( ( ( (lv_signature_0_0= ruleSignatureDel ) ) ( ( ( (lv_atribuicao_1_0= ruleIGUAL ) ) | ( (lv_pront_2_0= rulePONTOSIGUAL ) ) ) ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAO ) ) )? ) )
            // InternalGo.g:698:2: ( ( (lv_signature_0_0= ruleSignatureDel ) ) ( ( ( (lv_atribuicao_1_0= ruleIGUAL ) ) | ( (lv_pront_2_0= rulePONTOSIGUAL ) ) ) ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAO ) ) )? )
            {
            // InternalGo.g:698:2: ( ( (lv_signature_0_0= ruleSignatureDel ) ) ( ( ( (lv_atribuicao_1_0= ruleIGUAL ) ) | ( (lv_pront_2_0= rulePONTOSIGUAL ) ) ) ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAO ) ) )? )
            // InternalGo.g:699:3: ( (lv_signature_0_0= ruleSignatureDel ) ) ( ( ( (lv_atribuicao_1_0= ruleIGUAL ) ) | ( (lv_pront_2_0= rulePONTOSIGUAL ) ) ) ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAO ) ) )?
            {
            // InternalGo.g:699:3: ( (lv_signature_0_0= ruleSignatureDel ) )
            // InternalGo.g:700:4: (lv_signature_0_0= ruleSignatureDel )
            {
            // InternalGo.g:700:4: (lv_signature_0_0= ruleSignatureDel )
            // InternalGo.g:701:5: lv_signature_0_0= ruleSignatureDel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarDeclAccess().getSignatureSignatureDelParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_signature_0_0=ruleSignatureDel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarDeclRule());
              					}
              					set(
              						current,
              						"signature",
              						lv_signature_0_0,
              						"com.ufcg.compiler.Go.SignatureDel");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:718:3: ( ( ( (lv_atribuicao_1_0= ruleIGUAL ) ) | ( (lv_pront_2_0= rulePONTOSIGUAL ) ) ) ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAO ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=26 && LA11_0<=27)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGo.g:719:4: ( ( (lv_atribuicao_1_0= ruleIGUAL ) ) | ( (lv_pront_2_0= rulePONTOSIGUAL ) ) ) ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAO ) )
                    {
                    // InternalGo.g:719:4: ( ( (lv_atribuicao_1_0= ruleIGUAL ) ) | ( (lv_pront_2_0= rulePONTOSIGUAL ) ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==26) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==27) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGo.g:720:5: ( (lv_atribuicao_1_0= ruleIGUAL ) )
                            {
                            // InternalGo.g:720:5: ( (lv_atribuicao_1_0= ruleIGUAL ) )
                            // InternalGo.g:721:6: (lv_atribuicao_1_0= ruleIGUAL )
                            {
                            // InternalGo.g:721:6: (lv_atribuicao_1_0= ruleIGUAL )
                            // InternalGo.g:722:7: lv_atribuicao_1_0= ruleIGUAL
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getVarDeclAccess().getAtribuicaoIGUALParserRuleCall_1_0_0_0());
                              						
                            }
                            pushFollow(FOLLOW_14);
                            lv_atribuicao_1_0=ruleIGUAL();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getVarDeclRule());
                              							}
                              							set(
                              								current,
                              								"atribuicao",
                              								lv_atribuicao_1_0,
                              								"com.ufcg.compiler.Go.IGUAL");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGo.g:740:5: ( (lv_pront_2_0= rulePONTOSIGUAL ) )
                            {
                            // InternalGo.g:740:5: ( (lv_pront_2_0= rulePONTOSIGUAL ) )
                            // InternalGo.g:741:6: (lv_pront_2_0= rulePONTOSIGUAL )
                            {
                            // InternalGo.g:741:6: (lv_pront_2_0= rulePONTOSIGUAL )
                            // InternalGo.g:742:7: lv_pront_2_0= rulePONTOSIGUAL
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getVarDeclAccess().getProntPONTOSIGUALParserRuleCall_1_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_14);
                            lv_pront_2_0=rulePONTOSIGUAL();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getVarDeclRule());
                              							}
                              							set(
                              								current,
                              								"pront",
                              								lv_pront_2_0,
                              								"com.ufcg.compiler.Go.PONTOSIGUAL");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalGo.g:760:4: ( (lv_array_3_0= ruleArrayType ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==22) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGo.g:761:5: (lv_array_3_0= ruleArrayType )
                            {
                            // InternalGo.g:761:5: (lv_array_3_0= ruleArrayType )
                            // InternalGo.g:762:6: lv_array_3_0= ruleArrayType
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getVarDeclAccess().getArrayArrayTypeParserRuleCall_1_1_0());
                              					
                            }
                            pushFollow(FOLLOW_10);
                            lv_array_3_0=ruleArrayType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getVarDeclRule());
                              						}
                              						set(
                              							current,
                              							"array",
                              							lv_array_3_0,
                              							"com.ufcg.compiler.Go.ArrayType");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalGo.g:779:4: ( (lv_expressao_4_0= ruleEXPRESSAO ) )
                    // InternalGo.g:780:5: (lv_expressao_4_0= ruleEXPRESSAO )
                    {
                    // InternalGo.g:780:5: (lv_expressao_4_0= ruleEXPRESSAO )
                    // InternalGo.g:781:6: lv_expressao_4_0= ruleEXPRESSAO
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarDeclAccess().getExpressaoEXPRESSAOParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expressao_4_0=ruleEXPRESSAO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarDeclRule());
                      						}
                      						set(
                      							current,
                      							"expressao",
                      							lv_expressao_4_0,
                      							"com.ufcg.compiler.Go.EXPRESSAO");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleSignatureDel"
    // InternalGo.g:803:1: entryRuleSignatureDel returns [EObject current=null] : iv_ruleSignatureDel= ruleSignatureDel EOF ;
    public final EObject entryRuleSignatureDel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignatureDel = null;


        try {
            // InternalGo.g:803:53: (iv_ruleSignatureDel= ruleSignatureDel EOF )
            // InternalGo.g:804:2: iv_ruleSignatureDel= ruleSignatureDel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignatureDelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignatureDel=ruleSignatureDel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignatureDel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignatureDel"


    // $ANTLR start "ruleSignatureDel"
    // InternalGo.g:810:1: ruleSignatureDel returns [EObject current=null] : ( ( (lv_tipoDecl_0_0= ruleTIPO ) )? ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) )? ) ;
    public final EObject ruleSignatureDel() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_tipoDecl_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:816:2: ( ( ( (lv_tipoDecl_0_0= ruleTIPO ) )? ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) )? ) )
            // InternalGo.g:817:2: ( ( (lv_tipoDecl_0_0= ruleTIPO ) )? ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) )? )
            {
            // InternalGo.g:817:2: ( ( (lv_tipoDecl_0_0= ruleTIPO ) )? ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) )? )
            // InternalGo.g:818:3: ( (lv_tipoDecl_0_0= ruleTIPO ) )? ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) )?
            {
            // InternalGo.g:818:3: ( (lv_tipoDecl_0_0= ruleTIPO ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=24 && LA12_0<=25)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:819:4: (lv_tipoDecl_0_0= ruleTIPO )
                    {
                    // InternalGo.g:819:4: (lv_tipoDecl_0_0= ruleTIPO )
                    // InternalGo.g:820:5: lv_tipoDecl_0_0= ruleTIPO
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSignatureDelAccess().getTipoDeclTIPOParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_tipoDecl_0_0=ruleTIPO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSignatureDelRule());
                      					}
                      					set(
                      						current,
                      						"tipoDecl",
                      						lv_tipoDecl_0_0,
                      						"com.ufcg.compiler.Go.TIPO");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGo.g:837:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGo.g:838:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGo.g:838:4: (lv_id_1_0= RULE_ID )
            // InternalGo.g:839:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_1_0, grammarAccess.getSignatureDelAccess().getIdIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSignatureDelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:855:3: ( (lv_type_2_0= ruleTypes ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22||(LA13_0>=31 && LA13_0<=34)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGo.g:856:4: (lv_type_2_0= ruleTypes )
                    {
                    // InternalGo.g:856:4: (lv_type_2_0= ruleTypes )
                    // InternalGo.g:857:5: lv_type_2_0= ruleTypes
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSignatureDelAccess().getTypeTypesParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSignatureDelRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_2_0,
                      						"com.ufcg.compiler.Go.Types");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignatureDel"


    // $ANTLR start "entryRuleAssignment"
    // InternalGo.g:878:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalGo.g:878:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalGo.g:879:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalGo.g:885:1: ruleAssignment returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_qtd_2_0= RULE_NUMERO ) ) otherlv_3= ']' )? ( ( (lv_igual_4_0= ruleIGUAL ) ) | ( (lv_dois_5_0= rulePONTOSIGUAL ) ) ) ( (lv_expressao_6_0= ruleEXPRESSAOLINHA ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_qtd_2_0=null;
        Token otherlv_3=null;
        EObject lv_igual_4_0 = null;

        EObject lv_dois_5_0 = null;

        EObject lv_expressao_6_0 = null;



        	enterRule();

        try {
            // InternalGo.g:891:2: ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_qtd_2_0= RULE_NUMERO ) ) otherlv_3= ']' )? ( ( (lv_igual_4_0= ruleIGUAL ) ) | ( (lv_dois_5_0= rulePONTOSIGUAL ) ) ) ( (lv_expressao_6_0= ruleEXPRESSAOLINHA ) ) ) )
            // InternalGo.g:892:2: ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_qtd_2_0= RULE_NUMERO ) ) otherlv_3= ']' )? ( ( (lv_igual_4_0= ruleIGUAL ) ) | ( (lv_dois_5_0= rulePONTOSIGUAL ) ) ) ( (lv_expressao_6_0= ruleEXPRESSAOLINHA ) ) )
            {
            // InternalGo.g:892:2: ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_qtd_2_0= RULE_NUMERO ) ) otherlv_3= ']' )? ( ( (lv_igual_4_0= ruleIGUAL ) ) | ( (lv_dois_5_0= rulePONTOSIGUAL ) ) ) ( (lv_expressao_6_0= ruleEXPRESSAOLINHA ) ) )
            // InternalGo.g:893:3: ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_qtd_2_0= RULE_NUMERO ) ) otherlv_3= ']' )? ( ( (lv_igual_4_0= ruleIGUAL ) ) | ( (lv_dois_5_0= rulePONTOSIGUAL ) ) ) ( (lv_expressao_6_0= ruleEXPRESSAOLINHA ) )
            {
            // InternalGo.g:893:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalGo.g:894:4: (lv_id_0_0= RULE_ID )
            {
            // InternalGo.g:894:4: (lv_id_0_0= RULE_ID )
            // InternalGo.g:895:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_0_0, grammarAccess.getAssignmentAccess().getIdIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssignmentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:911:3: (otherlv_1= '[' ( (lv_qtd_2_0= RULE_NUMERO ) ) otherlv_3= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGo.g:912:4: otherlv_1= '[' ( (lv_qtd_2_0= RULE_NUMERO ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalGo.g:916:4: ( (lv_qtd_2_0= RULE_NUMERO ) )
                    // InternalGo.g:917:5: (lv_qtd_2_0= RULE_NUMERO )
                    {
                    // InternalGo.g:917:5: (lv_qtd_2_0= RULE_NUMERO )
                    // InternalGo.g:918:6: lv_qtd_2_0= RULE_NUMERO
                    {
                    lv_qtd_2_0=(Token)match(input,RULE_NUMERO,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_qtd_2_0, grammarAccess.getAssignmentAccess().getQtdNUMEROTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAssignmentRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"qtd",
                      							lv_qtd_2_0,
                      							"com.ufcg.compiler.Go.NUMERO");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:939:3: ( ( (lv_igual_4_0= ruleIGUAL ) ) | ( (lv_dois_5_0= rulePONTOSIGUAL ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            else if ( (LA15_0==27) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGo.g:940:4: ( (lv_igual_4_0= ruleIGUAL ) )
                    {
                    // InternalGo.g:940:4: ( (lv_igual_4_0= ruleIGUAL ) )
                    // InternalGo.g:941:5: (lv_igual_4_0= ruleIGUAL )
                    {
                    // InternalGo.g:941:5: (lv_igual_4_0= ruleIGUAL )
                    // InternalGo.g:942:6: lv_igual_4_0= ruleIGUAL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignmentAccess().getIgualIGUALParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_igual_4_0=ruleIGUAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"igual",
                      							lv_igual_4_0,
                      							"com.ufcg.compiler.Go.IGUAL");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:960:4: ( (lv_dois_5_0= rulePONTOSIGUAL ) )
                    {
                    // InternalGo.g:960:4: ( (lv_dois_5_0= rulePONTOSIGUAL ) )
                    // InternalGo.g:961:5: (lv_dois_5_0= rulePONTOSIGUAL )
                    {
                    // InternalGo.g:961:5: (lv_dois_5_0= rulePONTOSIGUAL )
                    // InternalGo.g:962:6: lv_dois_5_0= rulePONTOSIGUAL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignmentAccess().getDoisPONTOSIGUALParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_dois_5_0=rulePONTOSIGUAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"dois",
                      							lv_dois_5_0,
                      							"com.ufcg.compiler.Go.PONTOSIGUAL");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalGo.g:980:3: ( (lv_expressao_6_0= ruleEXPRESSAOLINHA ) )
            // InternalGo.g:981:4: (lv_expressao_6_0= ruleEXPRESSAOLINHA )
            {
            // InternalGo.g:981:4: (lv_expressao_6_0= ruleEXPRESSAOLINHA )
            // InternalGo.g:982:5: lv_expressao_6_0= ruleEXPRESSAOLINHA
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getExpressaoEXPRESSAOLINHAParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expressao_6_0=ruleEXPRESSAOLINHA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"expressao",
              						lv_expressao_6_0,
              						"com.ufcg.compiler.Go.EXPRESSAOLINHA");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleTIPO"
    // InternalGo.g:1003:1: entryRuleTIPO returns [EObject current=null] : iv_ruleTIPO= ruleTIPO EOF ;
    public final EObject entryRuleTIPO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTIPO = null;


        try {
            // InternalGo.g:1003:45: (iv_ruleTIPO= ruleTIPO EOF )
            // InternalGo.g:1004:2: iv_ruleTIPO= ruleTIPO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTIPORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTIPO=ruleTIPO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTIPO; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTIPO"


    // $ANTLR start "ruleTIPO"
    // InternalGo.g:1010:1: ruleTIPO returns [EObject current=null] : ( ( (lv_variavel_0_0= ruleVar ) ) | ( (lv_constante_1_0= ruleConst ) ) ) ;
    public final EObject ruleTIPO() throws RecognitionException {
        EObject current = null;

        EObject lv_variavel_0_0 = null;

        EObject lv_constante_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1016:2: ( ( ( (lv_variavel_0_0= ruleVar ) ) | ( (lv_constante_1_0= ruleConst ) ) ) )
            // InternalGo.g:1017:2: ( ( (lv_variavel_0_0= ruleVar ) ) | ( (lv_constante_1_0= ruleConst ) ) )
            {
            // InternalGo.g:1017:2: ( ( (lv_variavel_0_0= ruleVar ) ) | ( (lv_constante_1_0= ruleConst ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            else if ( (LA16_0==25) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:1018:3: ( (lv_variavel_0_0= ruleVar ) )
                    {
                    // InternalGo.g:1018:3: ( (lv_variavel_0_0= ruleVar ) )
                    // InternalGo.g:1019:4: (lv_variavel_0_0= ruleVar )
                    {
                    // InternalGo.g:1019:4: (lv_variavel_0_0= ruleVar )
                    // InternalGo.g:1020:5: lv_variavel_0_0= ruleVar
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTIPOAccess().getVariavelVarParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variavel_0_0=ruleVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTIPORule());
                      					}
                      					set(
                      						current,
                      						"variavel",
                      						lv_variavel_0_0,
                      						"com.ufcg.compiler.Go.Var");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1038:3: ( (lv_constante_1_0= ruleConst ) )
                    {
                    // InternalGo.g:1038:3: ( (lv_constante_1_0= ruleConst ) )
                    // InternalGo.g:1039:4: (lv_constante_1_0= ruleConst )
                    {
                    // InternalGo.g:1039:4: (lv_constante_1_0= ruleConst )
                    // InternalGo.g:1040:5: lv_constante_1_0= ruleConst
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTIPOAccess().getConstanteConstParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_constante_1_0=ruleConst();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTIPORule());
                      					}
                      					set(
                      						current,
                      						"constante",
                      						lv_constante_1_0,
                      						"com.ufcg.compiler.Go.Const");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTIPO"


    // $ANTLR start "entryRuleVar"
    // InternalGo.g:1061:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalGo.g:1061:44: (iv_ruleVar= ruleVar EOF )
            // InternalGo.g:1062:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalGo.g:1068:1: ruleVar returns [EObject current=null] : ( (lv_var_0_0= 'var' ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:1074:2: ( ( (lv_var_0_0= 'var' ) ) )
            // InternalGo.g:1075:2: ( (lv_var_0_0= 'var' ) )
            {
            // InternalGo.g:1075:2: ( (lv_var_0_0= 'var' ) )
            // InternalGo.g:1076:3: (lv_var_0_0= 'var' )
            {
            // InternalGo.g:1076:3: (lv_var_0_0= 'var' )
            // InternalGo.g:1077:4: lv_var_0_0= 'var'
            {
            lv_var_0_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_var_0_0, grammarAccess.getVarAccess().getVarVarKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVarRule());
              				}
              				setWithLastConsumed(current, "var", lv_var_0_0, "var");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleConst"
    // InternalGo.g:1092:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalGo.g:1092:46: (iv_ruleConst= ruleConst EOF )
            // InternalGo.g:1093:2: iv_ruleConst= ruleConst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConst=ruleConst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConst; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalGo.g:1099:1: ruleConst returns [EObject current=null] : ( (lv_const_0_0= 'const' ) ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token lv_const_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:1105:2: ( ( (lv_const_0_0= 'const' ) ) )
            // InternalGo.g:1106:2: ( (lv_const_0_0= 'const' ) )
            {
            // InternalGo.g:1106:2: ( (lv_const_0_0= 'const' ) )
            // InternalGo.g:1107:3: (lv_const_0_0= 'const' )
            {
            // InternalGo.g:1107:3: (lv_const_0_0= 'const' )
            // InternalGo.g:1108:4: lv_const_0_0= 'const'
            {
            lv_const_0_0=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_const_0_0, grammarAccess.getConstAccess().getConstConstKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getConstRule());
              				}
              				setWithLastConsumed(current, "const", lv_const_0_0, "const");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConst"


    // $ANTLR start "entryRuleIGUAL"
    // InternalGo.g:1123:1: entryRuleIGUAL returns [EObject current=null] : iv_ruleIGUAL= ruleIGUAL EOF ;
    public final EObject entryRuleIGUAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIGUAL = null;


        try {
            // InternalGo.g:1123:46: (iv_ruleIGUAL= ruleIGUAL EOF )
            // InternalGo.g:1124:2: iv_ruleIGUAL= ruleIGUAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIGUALRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIGUAL=ruleIGUAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIGUAL; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIGUAL"


    // $ANTLR start "ruleIGUAL"
    // InternalGo.g:1130:1: ruleIGUAL returns [EObject current=null] : ( (lv_igual_0_0= '=' ) ) ;
    public final EObject ruleIGUAL() throws RecognitionException {
        EObject current = null;

        Token lv_igual_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:1136:2: ( ( (lv_igual_0_0= '=' ) ) )
            // InternalGo.g:1137:2: ( (lv_igual_0_0= '=' ) )
            {
            // InternalGo.g:1137:2: ( (lv_igual_0_0= '=' ) )
            // InternalGo.g:1138:3: (lv_igual_0_0= '=' )
            {
            // InternalGo.g:1138:3: (lv_igual_0_0= '=' )
            // InternalGo.g:1139:4: lv_igual_0_0= '='
            {
            lv_igual_0_0=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_igual_0_0, grammarAccess.getIGUALAccess().getIgualEqualsSignKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIGUALRule());
              				}
              				setWithLastConsumed(current, "igual", lv_igual_0_0, "=");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIGUAL"


    // $ANTLR start "entryRulePONTOSIGUAL"
    // InternalGo.g:1154:1: entryRulePONTOSIGUAL returns [EObject current=null] : iv_rulePONTOSIGUAL= rulePONTOSIGUAL EOF ;
    public final EObject entryRulePONTOSIGUAL() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePONTOSIGUAL = null;


        try {
            // InternalGo.g:1154:52: (iv_rulePONTOSIGUAL= rulePONTOSIGUAL EOF )
            // InternalGo.g:1155:2: iv_rulePONTOSIGUAL= rulePONTOSIGUAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPONTOSIGUALRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePONTOSIGUAL=rulePONTOSIGUAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePONTOSIGUAL; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePONTOSIGUAL"


    // $ANTLR start "rulePONTOSIGUAL"
    // InternalGo.g:1161:1: rulePONTOSIGUAL returns [EObject current=null] : ( (lv_op_0_0= ':=' ) ) ;
    public final EObject rulePONTOSIGUAL() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:1167:2: ( ( (lv_op_0_0= ':=' ) ) )
            // InternalGo.g:1168:2: ( (lv_op_0_0= ':=' ) )
            {
            // InternalGo.g:1168:2: ( (lv_op_0_0= ':=' ) )
            // InternalGo.g:1169:3: (lv_op_0_0= ':=' )
            {
            // InternalGo.g:1169:3: (lv_op_0_0= ':=' )
            // InternalGo.g:1170:4: lv_op_0_0= ':='
            {
            lv_op_0_0=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_op_0_0, grammarAccess.getPONTOSIGUALAccess().getOpColonEqualsSignKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getPONTOSIGUALRule());
              				}
              				setWithLastConsumed(current, "op", lv_op_0_0, ":=");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePONTOSIGUAL"


    // $ANTLR start "entryRuleEXPRESSAOLINHA"
    // InternalGo.g:1185:1: entryRuleEXPRESSAOLINHA returns [EObject current=null] : iv_ruleEXPRESSAOLINHA= ruleEXPRESSAOLINHA EOF ;
    public final EObject entryRuleEXPRESSAOLINHA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEXPRESSAOLINHA = null;


        try {
            // InternalGo.g:1185:55: (iv_ruleEXPRESSAOLINHA= ruleEXPRESSAOLINHA EOF )
            // InternalGo.g:1186:2: iv_ruleEXPRESSAOLINHA= ruleEXPRESSAOLINHA EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPRESSAOLINHARule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEXPRESSAOLINHA=ruleEXPRESSAOLINHA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPRESSAOLINHA; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXPRESSAOLINHA"


    // $ANTLR start "ruleEXPRESSAOLINHA"
    // InternalGo.g:1192:1: ruleEXPRESSAOLINHA returns [EObject current=null] : ( ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) ) | ( (lv_exp_2_0= ruleEXPRESSAO ) ) ) ;
    public final EObject ruleEXPRESSAOLINHA() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_0_0 = null;

        EObject lv_explinha_1_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1198:2: ( ( ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) ) | ( (lv_exp_2_0= ruleEXPRESSAO ) ) ) )
            // InternalGo.g:1199:2: ( ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) ) | ( (lv_exp_2_0= ruleEXPRESSAO ) ) )
            {
            // InternalGo.g:1199:2: ( ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) ) | ( (lv_exp_2_0= ruleEXPRESSAO ) ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalGo.g:1200:3: ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) )
                    {
                    // InternalGo.g:1200:3: ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) )
                    // InternalGo.g:1201:4: ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) )
                    {
                    // InternalGo.g:1201:4: ( (lv_exp_0_0= ruleEXPRESSAO ) )
                    // InternalGo.g:1202:5: (lv_exp_0_0= ruleEXPRESSAO )
                    {
                    // InternalGo.g:1202:5: (lv_exp_0_0= ruleEXPRESSAO )
                    // InternalGo.g:1203:6: lv_exp_0_0= ruleEXPRESSAO
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEXPRESSAOLINHAAccess().getExpEXPRESSAOParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_exp_0_0=ruleEXPRESSAO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEXPRESSAOLINHARule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_0_0,
                      							"com.ufcg.compiler.Go.EXPRESSAO");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGo.g:1220:4: ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) )
                    // InternalGo.g:1221:5: (lv_explinha_1_0= ruleEXPRESSAOLINHA )
                    {
                    // InternalGo.g:1221:5: (lv_explinha_1_0= ruleEXPRESSAOLINHA )
                    // InternalGo.g:1222:6: lv_explinha_1_0= ruleEXPRESSAOLINHA
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEXPRESSAOLINHAAccess().getExplinhaEXPRESSAOLINHAParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_explinha_1_0=ruleEXPRESSAOLINHA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEXPRESSAOLINHARule());
                      						}
                      						set(
                      							current,
                      							"explinha",
                      							lv_explinha_1_0,
                      							"com.ufcg.compiler.Go.EXPRESSAOLINHA");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1241:3: ( (lv_exp_2_0= ruleEXPRESSAO ) )
                    {
                    // InternalGo.g:1241:3: ( (lv_exp_2_0= ruleEXPRESSAO ) )
                    // InternalGo.g:1242:4: (lv_exp_2_0= ruleEXPRESSAO )
                    {
                    // InternalGo.g:1242:4: (lv_exp_2_0= ruleEXPRESSAO )
                    // InternalGo.g:1243:5: lv_exp_2_0= ruleEXPRESSAO
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOLINHAAccess().getExpEXPRESSAOParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_2_0=ruleEXPRESSAO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAOLINHARule());
                      					}
                      					set(
                      						current,
                      						"exp",
                      						lv_exp_2_0,
                      						"com.ufcg.compiler.Go.EXPRESSAO");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXPRESSAOLINHA"


    // $ANTLR start "entryRuleEXPRESSAO"
    // InternalGo.g:1264:1: entryRuleEXPRESSAO returns [EObject current=null] : iv_ruleEXPRESSAO= ruleEXPRESSAO EOF ;
    public final EObject entryRuleEXPRESSAO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEXPRESSAO = null;


        try {
            // InternalGo.g:1264:50: (iv_ruleEXPRESSAO= ruleEXPRESSAO EOF )
            // InternalGo.g:1265:2: iv_ruleEXPRESSAO= ruleEXPRESSAO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPRESSAORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEXPRESSAO=ruleEXPRESSAO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPRESSAO; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXPRESSAO"


    // $ANTLR start "ruleEXPRESSAO"
    // InternalGo.g:1271:1: ruleEXPRESSAO returns [EObject current=null] : ( ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) ) | ( (lv_variaveis_2_0= ruleVarDecl ) ) | ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) ) | ( (lv_binary_exp_4_0= ruleBINARY_EXP ) ) | ( (lv_declFunction_5_0= ruleFunctionType ) ) | ( (lv_assignment_6_0= ruleAssignment ) ) | ( (lv_variaveis_7_0= ruleVarDecl ) ) | ( (lv_for_8_0= ruleForDecl ) ) | ( (lv_basic_9_0= ruleLITERAIS_BASICOS ) ) | ( (lv_arrayValue_10_0= ruleArrayValue ) ) ) ;
    public final EObject ruleEXPRESSAO() throws RecognitionException {
        EObject current = null;

        EObject lv_declFunction_1_0 = null;

        EObject lv_variaveis_2_0 = null;

        EObject lv_basic_3_0 = null;

        EObject lv_binary_exp_4_0 = null;

        EObject lv_declFunction_5_0 = null;

        EObject lv_assignment_6_0 = null;

        EObject lv_variaveis_7_0 = null;

        EObject lv_for_8_0 = null;

        EObject lv_basic_9_0 = null;

        EObject lv_arrayValue_10_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1277:2: ( ( ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) ) | ( (lv_variaveis_2_0= ruleVarDecl ) ) | ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) ) | ( (lv_binary_exp_4_0= ruleBINARY_EXP ) ) | ( (lv_declFunction_5_0= ruleFunctionType ) ) | ( (lv_assignment_6_0= ruleAssignment ) ) | ( (lv_variaveis_7_0= ruleVarDecl ) ) | ( (lv_for_8_0= ruleForDecl ) ) | ( (lv_basic_9_0= ruleLITERAIS_BASICOS ) ) | ( (lv_arrayValue_10_0= ruleArrayValue ) ) ) )
            // InternalGo.g:1278:2: ( ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) ) | ( (lv_variaveis_2_0= ruleVarDecl ) ) | ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) ) | ( (lv_binary_exp_4_0= ruleBINARY_EXP ) ) | ( (lv_declFunction_5_0= ruleFunctionType ) ) | ( (lv_assignment_6_0= ruleAssignment ) ) | ( (lv_variaveis_7_0= ruleVarDecl ) ) | ( (lv_for_8_0= ruleForDecl ) ) | ( (lv_basic_9_0= ruleLITERAIS_BASICOS ) ) | ( (lv_arrayValue_10_0= ruleArrayValue ) ) )
            {
            // InternalGo.g:1278:2: ( ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) ) | ( (lv_variaveis_2_0= ruleVarDecl ) ) | ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) ) | ( (lv_binary_exp_4_0= ruleBINARY_EXP ) ) | ( (lv_declFunction_5_0= ruleFunctionType ) ) | ( (lv_assignment_6_0= ruleAssignment ) ) | ( (lv_variaveis_7_0= ruleVarDecl ) ) | ( (lv_for_8_0= ruleForDecl ) ) | ( (lv_basic_9_0= ruleLITERAIS_BASICOS ) ) | ( (lv_arrayValue_10_0= ruleArrayValue ) ) )
            int alt18=10;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalGo.g:1279:3: ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) )
                    {
                    // InternalGo.g:1279:3: ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) )
                    // InternalGo.g:1280:4: () ( (lv_declFunction_1_0= ruleFunctionType ) )
                    {
                    // InternalGo.g:1280:4: ()
                    // InternalGo.g:1281:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEXPRESSAOAccess().getEXPRESSAOAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:1290:4: ( (lv_declFunction_1_0= ruleFunctionType ) )
                    // InternalGo.g:1291:5: (lv_declFunction_1_0= ruleFunctionType )
                    {
                    // InternalGo.g:1291:5: (lv_declFunction_1_0= ruleFunctionType )
                    // InternalGo.g:1292:6: lv_declFunction_1_0= ruleFunctionType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEXPRESSAOAccess().getDeclFunctionFunctionTypeParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_declFunction_1_0=ruleFunctionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      						}
                      						set(
                      							current,
                      							"declFunction",
                      							lv_declFunction_1_0,
                      							"com.ufcg.compiler.Go.FunctionType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1311:3: ( (lv_variaveis_2_0= ruleVarDecl ) )
                    {
                    // InternalGo.g:1311:3: ( (lv_variaveis_2_0= ruleVarDecl ) )
                    // InternalGo.g:1312:4: (lv_variaveis_2_0= ruleVarDecl )
                    {
                    // InternalGo.g:1312:4: (lv_variaveis_2_0= ruleVarDecl )
                    // InternalGo.g:1313:5: lv_variaveis_2_0= ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getVariaveisVarDeclParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variaveis_2_0=ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"variaveis",
                      						lv_variaveis_2_0,
                      						"com.ufcg.compiler.Go.VarDecl");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1331:3: ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) )
                    {
                    // InternalGo.g:1331:3: ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:1332:4: (lv_basic_3_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:1332:4: (lv_basic_3_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:1333:5: lv_basic_3_0= ruleLITERAIS_BASICOS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getBasicLITERAIS_BASICOSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_basic_3_0=ruleLITERAIS_BASICOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"basic",
                      						lv_basic_3_0,
                      						"com.ufcg.compiler.Go.LITERAIS_BASICOS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:1351:3: ( (lv_binary_exp_4_0= ruleBINARY_EXP ) )
                    {
                    // InternalGo.g:1351:3: ( (lv_binary_exp_4_0= ruleBINARY_EXP ) )
                    // InternalGo.g:1352:4: (lv_binary_exp_4_0= ruleBINARY_EXP )
                    {
                    // InternalGo.g:1352:4: (lv_binary_exp_4_0= ruleBINARY_EXP )
                    // InternalGo.g:1353:5: lv_binary_exp_4_0= ruleBINARY_EXP
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getBinary_expBINARY_EXPParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_binary_exp_4_0=ruleBINARY_EXP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"binary_exp",
                      						lv_binary_exp_4_0,
                      						"com.ufcg.compiler.Go.BINARY_EXP");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:1371:3: ( (lv_declFunction_5_0= ruleFunctionType ) )
                    {
                    // InternalGo.g:1371:3: ( (lv_declFunction_5_0= ruleFunctionType ) )
                    // InternalGo.g:1372:4: (lv_declFunction_5_0= ruleFunctionType )
                    {
                    // InternalGo.g:1372:4: (lv_declFunction_5_0= ruleFunctionType )
                    // InternalGo.g:1373:5: lv_declFunction_5_0= ruleFunctionType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getDeclFunctionFunctionTypeParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_declFunction_5_0=ruleFunctionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"declFunction",
                      						lv_declFunction_5_0,
                      						"com.ufcg.compiler.Go.FunctionType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:1391:3: ( (lv_assignment_6_0= ruleAssignment ) )
                    {
                    // InternalGo.g:1391:3: ( (lv_assignment_6_0= ruleAssignment ) )
                    // InternalGo.g:1392:4: (lv_assignment_6_0= ruleAssignment )
                    {
                    // InternalGo.g:1392:4: (lv_assignment_6_0= ruleAssignment )
                    // InternalGo.g:1393:5: lv_assignment_6_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getAssignmentAssignmentParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_assignment_6_0=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"assignment",
                      						lv_assignment_6_0,
                      						"com.ufcg.compiler.Go.Assignment");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:1411:3: ( (lv_variaveis_7_0= ruleVarDecl ) )
                    {
                    // InternalGo.g:1411:3: ( (lv_variaveis_7_0= ruleVarDecl ) )
                    // InternalGo.g:1412:4: (lv_variaveis_7_0= ruleVarDecl )
                    {
                    // InternalGo.g:1412:4: (lv_variaveis_7_0= ruleVarDecl )
                    // InternalGo.g:1413:5: lv_variaveis_7_0= ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getVariaveisVarDeclParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variaveis_7_0=ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"variaveis",
                      						lv_variaveis_7_0,
                      						"com.ufcg.compiler.Go.VarDecl");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:1431:3: ( (lv_for_8_0= ruleForDecl ) )
                    {
                    // InternalGo.g:1431:3: ( (lv_for_8_0= ruleForDecl ) )
                    // InternalGo.g:1432:4: (lv_for_8_0= ruleForDecl )
                    {
                    // InternalGo.g:1432:4: (lv_for_8_0= ruleForDecl )
                    // InternalGo.g:1433:5: lv_for_8_0= ruleForDecl
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getForForDeclParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_for_8_0=ruleForDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"for",
                      						lv_for_8_0,
                      						"com.ufcg.compiler.Go.ForDecl");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalGo.g:1451:3: ( (lv_basic_9_0= ruleLITERAIS_BASICOS ) )
                    {
                    // InternalGo.g:1451:3: ( (lv_basic_9_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:1452:4: (lv_basic_9_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:1452:4: (lv_basic_9_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:1453:5: lv_basic_9_0= ruleLITERAIS_BASICOS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getBasicLITERAIS_BASICOSParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_basic_9_0=ruleLITERAIS_BASICOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"basic",
                      						lv_basic_9_0,
                      						"com.ufcg.compiler.Go.LITERAIS_BASICOS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalGo.g:1471:3: ( (lv_arrayValue_10_0= ruleArrayValue ) )
                    {
                    // InternalGo.g:1471:3: ( (lv_arrayValue_10_0= ruleArrayValue ) )
                    // InternalGo.g:1472:4: (lv_arrayValue_10_0= ruleArrayValue )
                    {
                    // InternalGo.g:1472:4: (lv_arrayValue_10_0= ruleArrayValue )
                    // InternalGo.g:1473:5: lv_arrayValue_10_0= ruleArrayValue
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getArrayValueArrayValueParserRuleCall_9_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_arrayValue_10_0=ruleArrayValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"arrayValue",
                      						lv_arrayValue_10_0,
                      						"com.ufcg.compiler.Go.ArrayValue");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXPRESSAO"


    // $ANTLR start "entryRuleArrayValue"
    // InternalGo.g:1494:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalGo.g:1494:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalGo.g:1495:2: iv_ruleArrayValue= ruleArrayValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayValue=ruleArrayValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalGo.g:1501:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_lit_1_0= ruleLiteraisList ) ) otherlv_2= '}' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lit_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1507:2: ( (otherlv_0= '{' ( (lv_lit_1_0= ruleLiteraisList ) ) otherlv_2= '}' ) )
            // InternalGo.g:1508:2: (otherlv_0= '{' ( (lv_lit_1_0= ruleLiteraisList ) ) otherlv_2= '}' )
            {
            // InternalGo.g:1508:2: (otherlv_0= '{' ( (lv_lit_1_0= ruleLiteraisList ) ) otherlv_2= '}' )
            // InternalGo.g:1509:3: otherlv_0= '{' ( (lv_lit_1_0= ruleLiteraisList ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalGo.g:1513:3: ( (lv_lit_1_0= ruleLiteraisList ) )
            // InternalGo.g:1514:4: (lv_lit_1_0= ruleLiteraisList )
            {
            // InternalGo.g:1514:4: (lv_lit_1_0= ruleLiteraisList )
            // InternalGo.g:1515:5: lv_lit_1_0= ruleLiteraisList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayValueAccess().getLitLiteraisListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_lit_1_0=ruleLiteraisList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayValueRule());
              					}
              					set(
              						current,
              						"lit",
              						lv_lit_1_0,
              						"com.ufcg.compiler.Go.LiteraisList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleLiteraisList"
    // InternalGo.g:1540:1: entryRuleLiteraisList returns [EObject current=null] : iv_ruleLiteraisList= ruleLiteraisList EOF ;
    public final EObject entryRuleLiteraisList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteraisList = null;


        try {
            // InternalGo.g:1540:53: (iv_ruleLiteraisList= ruleLiteraisList EOF )
            // InternalGo.g:1541:2: iv_ruleLiteraisList= ruleLiteraisList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteraisListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteraisList=ruleLiteraisList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteraisList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteraisList"


    // $ANTLR start "ruleLiteraisList"
    // InternalGo.g:1547:1: ruleLiteraisList returns [EObject current=null] : ( ( (lv_lit_0_0= ruleLITERAIS_BASICOS ) ) | ( ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) ) otherlv_2= ',' ( (lv_lit_3_0= ruleLiteraisList ) ) ) ) ;
    public final EObject ruleLiteraisList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_lit_0_0 = null;

        EObject lv_lit_1_0 = null;

        EObject lv_lit_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1553:2: ( ( ( (lv_lit_0_0= ruleLITERAIS_BASICOS ) ) | ( ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) ) otherlv_2= ',' ( (lv_lit_3_0= ruleLiteraisList ) ) ) ) )
            // InternalGo.g:1554:2: ( ( (lv_lit_0_0= ruleLITERAIS_BASICOS ) ) | ( ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) ) otherlv_2= ',' ( (lv_lit_3_0= ruleLiteraisList ) ) ) )
            {
            // InternalGo.g:1554:2: ( ( (lv_lit_0_0= ruleLITERAIS_BASICOS ) ) | ( ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) ) otherlv_2= ',' ( (lv_lit_3_0= ruleLiteraisList ) ) ) )
            int alt19=2;
            switch ( input.LA(1) ) {
            case RULE_NUMERO:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==21) ) {
                    alt19=2;
                }
                else if ( (LA19_1==EOF||LA19_1==19) ) {
                    alt19=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING_DECL:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==21) ) {
                    alt19=2;
                }
                else if ( (LA19_2==EOF||LA19_2==19) ) {
                    alt19=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA19_3 = input.LA(2);

                if ( (LA19_3==21) ) {
                    alt19=2;
                }
                else if ( (LA19_3==EOF||LA19_3==19) ) {
                    alt19=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 3, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA19_4 = input.LA(2);

                if ( (LA19_4==EOF||LA19_4==19) ) {
                    alt19=1;
                }
                else if ( (LA19_4==21) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalGo.g:1555:3: ( (lv_lit_0_0= ruleLITERAIS_BASICOS ) )
                    {
                    // InternalGo.g:1555:3: ( (lv_lit_0_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:1556:4: (lv_lit_0_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:1556:4: (lv_lit_0_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:1557:5: lv_lit_0_0= ruleLITERAIS_BASICOS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteraisListAccess().getLitLITERAIS_BASICOSParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_lit_0_0=ruleLITERAIS_BASICOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLiteraisListRule());
                      					}
                      					add(
                      						current,
                      						"lit",
                      						lv_lit_0_0,
                      						"com.ufcg.compiler.Go.LITERAIS_BASICOS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1575:3: ( ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) ) otherlv_2= ',' ( (lv_lit_3_0= ruleLiteraisList ) ) )
                    {
                    // InternalGo.g:1575:3: ( ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) ) otherlv_2= ',' ( (lv_lit_3_0= ruleLiteraisList ) ) )
                    // InternalGo.g:1576:4: ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) ) otherlv_2= ',' ( (lv_lit_3_0= ruleLiteraisList ) )
                    {
                    // InternalGo.g:1576:4: ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:1577:5: (lv_lit_1_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:1577:5: (lv_lit_1_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:1578:6: lv_lit_1_0= ruleLITERAIS_BASICOS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteraisListAccess().getLitLITERAIS_BASICOSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_lit_1_0=ruleLITERAIS_BASICOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLiteraisListRule());
                      						}
                      						add(
                      							current,
                      							"lit",
                      							lv_lit_1_0,
                      							"com.ufcg.compiler.Go.LITERAIS_BASICOS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLiteraisListAccess().getCommaKeyword_1_1());
                      			
                    }
                    // InternalGo.g:1599:4: ( (lv_lit_3_0= ruleLiteraisList ) )
                    // InternalGo.g:1600:5: (lv_lit_3_0= ruleLiteraisList )
                    {
                    // InternalGo.g:1600:5: (lv_lit_3_0= ruleLiteraisList )
                    // InternalGo.g:1601:6: lv_lit_3_0= ruleLiteraisList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteraisListAccess().getLitLiteraisListParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_lit_3_0=ruleLiteraisList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLiteraisListRule());
                      						}
                      						add(
                      							current,
                      							"lit",
                      							lv_lit_3_0,
                      							"com.ufcg.compiler.Go.LiteraisList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteraisList"


    // $ANTLR start "entryRuleLITERAIS_BASICOS"
    // InternalGo.g:1623:1: entryRuleLITERAIS_BASICOS returns [EObject current=null] : iv_ruleLITERAIS_BASICOS= ruleLITERAIS_BASICOS EOF ;
    public final EObject entryRuleLITERAIS_BASICOS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLITERAIS_BASICOS = null;


        try {
            // InternalGo.g:1623:57: (iv_ruleLITERAIS_BASICOS= ruleLITERAIS_BASICOS EOF )
            // InternalGo.g:1624:2: iv_ruleLITERAIS_BASICOS= ruleLITERAIS_BASICOS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLITERAIS_BASICOSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLITERAIS_BASICOS=ruleLITERAIS_BASICOS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLITERAIS_BASICOS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLITERAIS_BASICOS"


    // $ANTLR start "ruleLITERAIS_BASICOS"
    // InternalGo.g:1630:1: ruleLITERAIS_BASICOS returns [EObject current=null] : ( ( (lv_numero_0_0= RULE_NUMERO ) ) | ( (lv_string_1_0= RULE_STRING_DECL ) ) | ( (lv_booleano_2_0= ruleBOOLEAN_VALUE ) ) ) ;
    public final EObject ruleLITERAIS_BASICOS() throws RecognitionException {
        EObject current = null;

        Token lv_numero_0_0=null;
        Token lv_string_1_0=null;
        EObject lv_booleano_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1636:2: ( ( ( (lv_numero_0_0= RULE_NUMERO ) ) | ( (lv_string_1_0= RULE_STRING_DECL ) ) | ( (lv_booleano_2_0= ruleBOOLEAN_VALUE ) ) ) )
            // InternalGo.g:1637:2: ( ( (lv_numero_0_0= RULE_NUMERO ) ) | ( (lv_string_1_0= RULE_STRING_DECL ) ) | ( (lv_booleano_2_0= ruleBOOLEAN_VALUE ) ) )
            {
            // InternalGo.g:1637:2: ( ( (lv_numero_0_0= RULE_NUMERO ) ) | ( (lv_string_1_0= RULE_STRING_DECL ) ) | ( (lv_booleano_2_0= ruleBOOLEAN_VALUE ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_NUMERO:
                {
                alt20=1;
                }
                break;
            case RULE_STRING_DECL:
                {
                alt20=2;
                }
                break;
            case 15:
            case 16:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalGo.g:1638:3: ( (lv_numero_0_0= RULE_NUMERO ) )
                    {
                    // InternalGo.g:1638:3: ( (lv_numero_0_0= RULE_NUMERO ) )
                    // InternalGo.g:1639:4: (lv_numero_0_0= RULE_NUMERO )
                    {
                    // InternalGo.g:1639:4: (lv_numero_0_0= RULE_NUMERO )
                    // InternalGo.g:1640:5: lv_numero_0_0= RULE_NUMERO
                    {
                    lv_numero_0_0=(Token)match(input,RULE_NUMERO,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_numero_0_0, grammarAccess.getLITERAIS_BASICOSAccess().getNumeroNUMEROTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLITERAIS_BASICOSRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"numero",
                      						lv_numero_0_0,
                      						"com.ufcg.compiler.Go.NUMERO");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1657:3: ( (lv_string_1_0= RULE_STRING_DECL ) )
                    {
                    // InternalGo.g:1657:3: ( (lv_string_1_0= RULE_STRING_DECL ) )
                    // InternalGo.g:1658:4: (lv_string_1_0= RULE_STRING_DECL )
                    {
                    // InternalGo.g:1658:4: (lv_string_1_0= RULE_STRING_DECL )
                    // InternalGo.g:1659:5: lv_string_1_0= RULE_STRING_DECL
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING_DECL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_string_1_0, grammarAccess.getLITERAIS_BASICOSAccess().getStringSTRING_DECLTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLITERAIS_BASICOSRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"string",
                      						lv_string_1_0,
                      						"com.ufcg.compiler.Go.STRING_DECL");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1676:3: ( (lv_booleano_2_0= ruleBOOLEAN_VALUE ) )
                    {
                    // InternalGo.g:1676:3: ( (lv_booleano_2_0= ruleBOOLEAN_VALUE ) )
                    // InternalGo.g:1677:4: (lv_booleano_2_0= ruleBOOLEAN_VALUE )
                    {
                    // InternalGo.g:1677:4: (lv_booleano_2_0= ruleBOOLEAN_VALUE )
                    // InternalGo.g:1678:5: lv_booleano_2_0= ruleBOOLEAN_VALUE
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLITERAIS_BASICOSAccess().getBooleanoBOOLEAN_VALUEParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_booleano_2_0=ruleBOOLEAN_VALUE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLITERAIS_BASICOSRule());
                      					}
                      					set(
                      						current,
                      						"booleano",
                      						lv_booleano_2_0,
                      						"com.ufcg.compiler.Go.BOOLEAN_VALUE");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLITERAIS_BASICOS"


    // $ANTLR start "entryRuleBINARY_EXP"
    // InternalGo.g:1699:1: entryRuleBINARY_EXP returns [EObject current=null] : iv_ruleBINARY_EXP= ruleBINARY_EXP EOF ;
    public final EObject entryRuleBINARY_EXP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBINARY_EXP = null;


        try {
            // InternalGo.g:1699:51: (iv_ruleBINARY_EXP= ruleBINARY_EXP EOF )
            // InternalGo.g:1700:2: iv_ruleBINARY_EXP= ruleBINARY_EXP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBINARY_EXPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBINARY_EXP=ruleBINARY_EXP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBINARY_EXP; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBINARY_EXP"


    // $ANTLR start "ruleBINARY_EXP"
    // InternalGo.g:1706:1: ruleBINARY_EXP returns [EObject current=null] : ( ( ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) ( ( (lv_bool_1_0= ruleBOOL_OP ) ) | ( (lv_arit_2_0= ruleARIT_OP ) ) ) ( (lv_binabasic_3_0= ruleBINARY_EXP ) ) ) | ( (lv_unique_basic_4_0= ruleLITERAIS_BASICOS ) ) ) ;
    public final EObject ruleBINARY_EXP() throws RecognitionException {
        EObject current = null;

        EObject lv_basic_0_0 = null;

        EObject lv_bool_1_0 = null;

        AntlrDatatypeRuleToken lv_arit_2_0 = null;

        EObject lv_binabasic_3_0 = null;

        EObject lv_unique_basic_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1712:2: ( ( ( ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) ( ( (lv_bool_1_0= ruleBOOL_OP ) ) | ( (lv_arit_2_0= ruleARIT_OP ) ) ) ( (lv_binabasic_3_0= ruleBINARY_EXP ) ) ) | ( (lv_unique_basic_4_0= ruleLITERAIS_BASICOS ) ) ) )
            // InternalGo.g:1713:2: ( ( ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) ( ( (lv_bool_1_0= ruleBOOL_OP ) ) | ( (lv_arit_2_0= ruleARIT_OP ) ) ) ( (lv_binabasic_3_0= ruleBINARY_EXP ) ) ) | ( (lv_unique_basic_4_0= ruleLITERAIS_BASICOS ) ) )
            {
            // InternalGo.g:1713:2: ( ( ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) ( ( (lv_bool_1_0= ruleBOOL_OP ) ) | ( (lv_arit_2_0= ruleARIT_OP ) ) ) ( (lv_binabasic_3_0= ruleBINARY_EXP ) ) ) | ( (lv_unique_basic_4_0= ruleLITERAIS_BASICOS ) ) )
            int alt22=2;
            switch ( input.LA(1) ) {
            case RULE_NUMERO:
                {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EOF||(LA22_1>=RULE_ID && LA22_1<=RULE_STRING_DECL)||(LA22_1>=15 && LA22_1<=20)||(LA22_1>=24 && LA22_1<=25)||LA22_1==28||(LA22_1>=40 && LA22_1<=44)) ) {
                    alt22=2;
                }
                else if ( ((LA22_1>=13 && LA22_1<=14)||(LA22_1>=35 && LA22_1<=39)) ) {
                    alt22=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING_DECL:
                {
                int LA22_2 = input.LA(2);

                if ( ((LA22_2>=13 && LA22_2<=14)||(LA22_2>=35 && LA22_2<=39)) ) {
                    alt22=1;
                }
                else if ( (LA22_2==EOF||(LA22_2>=RULE_ID && LA22_2<=RULE_STRING_DECL)||(LA22_2>=15 && LA22_2<=20)||(LA22_2>=24 && LA22_2<=25)||LA22_2==28||(LA22_2>=40 && LA22_2<=44)) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA22_3 = input.LA(2);

                if ( ((LA22_3>=13 && LA22_3<=14)||(LA22_3>=35 && LA22_3<=39)) ) {
                    alt22=1;
                }
                else if ( (LA22_3==EOF||(LA22_3>=RULE_ID && LA22_3<=RULE_STRING_DECL)||(LA22_3>=15 && LA22_3<=20)||(LA22_3>=24 && LA22_3<=25)||LA22_3==28||(LA22_3>=40 && LA22_3<=44)) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA22_4 = input.LA(2);

                if ( (LA22_4==EOF||(LA22_4>=RULE_ID && LA22_4<=RULE_STRING_DECL)||(LA22_4>=15 && LA22_4<=20)||(LA22_4>=24 && LA22_4<=25)||LA22_4==28||(LA22_4>=40 && LA22_4<=44)) ) {
                    alt22=2;
                }
                else if ( ((LA22_4>=13 && LA22_4<=14)||(LA22_4>=35 && LA22_4<=39)) ) {
                    alt22=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalGo.g:1714:3: ( ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) ( ( (lv_bool_1_0= ruleBOOL_OP ) ) | ( (lv_arit_2_0= ruleARIT_OP ) ) ) ( (lv_binabasic_3_0= ruleBINARY_EXP ) ) )
                    {
                    // InternalGo.g:1714:3: ( ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) ( ( (lv_bool_1_0= ruleBOOL_OP ) ) | ( (lv_arit_2_0= ruleARIT_OP ) ) ) ( (lv_binabasic_3_0= ruleBINARY_EXP ) ) )
                    // InternalGo.g:1715:4: ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) ( ( (lv_bool_1_0= ruleBOOL_OP ) ) | ( (lv_arit_2_0= ruleARIT_OP ) ) ) ( (lv_binabasic_3_0= ruleBINARY_EXP ) )
                    {
                    // InternalGo.g:1715:4: ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:1716:5: (lv_basic_0_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:1716:5: (lv_basic_0_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:1717:6: lv_basic_0_0= ruleLITERAIS_BASICOS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBINARY_EXPAccess().getBasicLITERAIS_BASICOSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_basic_0_0=ruleLITERAIS_BASICOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBINARY_EXPRule());
                      						}
                      						set(
                      							current,
                      							"basic",
                      							lv_basic_0_0,
                      							"com.ufcg.compiler.Go.LITERAIS_BASICOS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGo.g:1734:4: ( ( (lv_bool_1_0= ruleBOOL_OP ) ) | ( (lv_arit_2_0= ruleARIT_OP ) ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=13 && LA21_0<=14)) ) {
                        alt21=1;
                    }
                    else if ( ((LA21_0>=35 && LA21_0<=39)) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalGo.g:1735:5: ( (lv_bool_1_0= ruleBOOL_OP ) )
                            {
                            // InternalGo.g:1735:5: ( (lv_bool_1_0= ruleBOOL_OP ) )
                            // InternalGo.g:1736:6: (lv_bool_1_0= ruleBOOL_OP )
                            {
                            // InternalGo.g:1736:6: (lv_bool_1_0= ruleBOOL_OP )
                            // InternalGo.g:1737:7: lv_bool_1_0= ruleBOOL_OP
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBINARY_EXPAccess().getBoolBOOL_OPParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_20);
                            lv_bool_1_0=ruleBOOL_OP();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBINARY_EXPRule());
                              							}
                              							set(
                              								current,
                              								"bool",
                              								lv_bool_1_0,
                              								"com.ufcg.compiler.Go.BOOL_OP");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGo.g:1755:5: ( (lv_arit_2_0= ruleARIT_OP ) )
                            {
                            // InternalGo.g:1755:5: ( (lv_arit_2_0= ruleARIT_OP ) )
                            // InternalGo.g:1756:6: (lv_arit_2_0= ruleARIT_OP )
                            {
                            // InternalGo.g:1756:6: (lv_arit_2_0= ruleARIT_OP )
                            // InternalGo.g:1757:7: lv_arit_2_0= ruleARIT_OP
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getBINARY_EXPAccess().getAritARIT_OPParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_20);
                            lv_arit_2_0=ruleARIT_OP();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getBINARY_EXPRule());
                              							}
                              							set(
                              								current,
                              								"arit",
                              								lv_arit_2_0,
                              								"com.ufcg.compiler.Go.ARIT_OP");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalGo.g:1775:4: ( (lv_binabasic_3_0= ruleBINARY_EXP ) )
                    // InternalGo.g:1776:5: (lv_binabasic_3_0= ruleBINARY_EXP )
                    {
                    // InternalGo.g:1776:5: (lv_binabasic_3_0= ruleBINARY_EXP )
                    // InternalGo.g:1777:6: lv_binabasic_3_0= ruleBINARY_EXP
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBINARY_EXPAccess().getBinabasicBINARY_EXPParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_binabasic_3_0=ruleBINARY_EXP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBINARY_EXPRule());
                      						}
                      						set(
                      							current,
                      							"binabasic",
                      							lv_binabasic_3_0,
                      							"com.ufcg.compiler.Go.BINARY_EXP");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1796:3: ( (lv_unique_basic_4_0= ruleLITERAIS_BASICOS ) )
                    {
                    // InternalGo.g:1796:3: ( (lv_unique_basic_4_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:1797:4: (lv_unique_basic_4_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:1797:4: (lv_unique_basic_4_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:1798:5: lv_unique_basic_4_0= ruleLITERAIS_BASICOS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBINARY_EXPAccess().getUnique_basicLITERAIS_BASICOSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_unique_basic_4_0=ruleLITERAIS_BASICOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBINARY_EXPRule());
                      					}
                      					set(
                      						current,
                      						"unique_basic",
                      						lv_unique_basic_4_0,
                      						"com.ufcg.compiler.Go.LITERAIS_BASICOS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBINARY_EXP"


    // $ANTLR start "entryRuleFunctionType"
    // InternalGo.g:1819:1: entryRuleFunctionType returns [EObject current=null] : iv_ruleFunctionType= ruleFunctionType EOF ;
    public final EObject entryRuleFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionType = null;


        try {
            // InternalGo.g:1819:53: (iv_ruleFunctionType= ruleFunctionType EOF )
            // InternalGo.g:1820:2: iv_ruleFunctionType= ruleFunctionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionType=ruleFunctionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionType"


    // $ANTLR start "ruleFunctionType"
    // InternalGo.g:1826:1: ruleFunctionType returns [EObject current=null] : (otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )? ) ;
    public final EObject ruleFunctionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nome_1_0=null;
        EObject lv_assinatura_2_0 = null;

        EObject lv_bloco_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1832:2: ( (otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )? ) )
            // InternalGo.g:1833:2: (otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )? )
            {
            // InternalGo.g:1833:2: (otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )? )
            // InternalGo.g:1834:3: otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionTypeAccess().getFuncKeyword_0());
              		
            }
            // InternalGo.g:1838:3: ( (lv_nome_1_0= RULE_ID ) )
            // InternalGo.g:1839:4: (lv_nome_1_0= RULE_ID )
            {
            // InternalGo.g:1839:4: (lv_nome_1_0= RULE_ID )
            // InternalGo.g:1840:5: lv_nome_1_0= RULE_ID
            {
            lv_nome_1_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_nome_1_0, grammarAccess.getFunctionTypeAccess().getNomeIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"nome",
              						lv_nome_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:1856:3: ( (lv_assinatura_2_0= ruleSignature ) )
            // InternalGo.g:1857:4: (lv_assinatura_2_0= ruleSignature )
            {
            // InternalGo.g:1857:4: (lv_assinatura_2_0= ruleSignature )
            // InternalGo.g:1858:5: lv_assinatura_2_0= ruleSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionTypeAccess().getAssinaturaSignatureParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_assinatura_2_0=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
              					}
              					set(
              						current,
              						"assinatura",
              						lv_assinatura_2_0,
              						"com.ufcg.compiler.Go.Signature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:1875:3: ( (lv_bloco_3_0= ruleBLOCK ) )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalGo.g:1876:4: (lv_bloco_3_0= ruleBLOCK )
                    {
                    // InternalGo.g:1876:4: (lv_bloco_3_0= ruleBLOCK )
                    // InternalGo.g:1877:5: lv_bloco_3_0= ruleBLOCK
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunctionTypeAccess().getBlocoBLOCKParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_bloco_3_0=ruleBLOCK();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
                      					}
                      					set(
                      						current,
                      						"bloco",
                      						lv_bloco_3_0,
                      						"com.ufcg.compiler.Go.BLOCK");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionType"


    // $ANTLR start "entryRuleSignature"
    // InternalGo.g:1898:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalGo.g:1898:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalGo.g:1899:2: iv_ruleSignature= ruleSignature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalGo.g:1905:1: ruleSignature returns [EObject current=null] : (this_Parameters_0= ruleParameters ( (lv_retorno_1_0= ruleResult ) )? ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        EObject this_Parameters_0 = null;

        EObject lv_retorno_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1911:2: ( (this_Parameters_0= ruleParameters ( (lv_retorno_1_0= ruleResult ) )? ) )
            // InternalGo.g:1912:2: (this_Parameters_0= ruleParameters ( (lv_retorno_1_0= ruleResult ) )? )
            {
            // InternalGo.g:1912:2: (this_Parameters_0= ruleParameters ( (lv_retorno_1_0= ruleResult ) )? )
            // InternalGo.g:1913:3: this_Parameters_0= ruleParameters ( (lv_retorno_1_0= ruleResult ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSignatureAccess().getParametersParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_Parameters_0=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Parameters_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:1924:3: ( (lv_retorno_1_0= ruleResult ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22||LA24_0==29||(LA24_0>=31 && LA24_0<=34)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGo.g:1925:4: (lv_retorno_1_0= ruleResult )
                    {
                    // InternalGo.g:1925:4: (lv_retorno_1_0= ruleResult )
                    // InternalGo.g:1926:5: lv_retorno_1_0= ruleResult
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSignatureAccess().getRetornoResultParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_retorno_1_0=ruleResult();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSignatureRule());
                      					}
                      					set(
                      						current,
                      						"retorno",
                      						lv_retorno_1_0,
                      						"com.ufcg.compiler.Go.Result");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleResult"
    // InternalGo.g:1947:1: entryRuleResult returns [EObject current=null] : iv_ruleResult= ruleResult EOF ;
    public final EObject entryRuleResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResult = null;


        try {
            // InternalGo.g:1947:47: (iv_ruleResult= ruleResult EOF )
            // InternalGo.g:1948:2: iv_ruleResult= ruleResult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleResult=ruleResult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResult; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalGo.g:1954:1: ruleResult returns [EObject current=null] : ( ( () ( (lv_parametros_1_0= ruleParameters ) ) ) | ( (lv_tipo_2_0= ruleTypes ) ) ) ;
    public final EObject ruleResult() throws RecognitionException {
        EObject current = null;

        EObject lv_parametros_1_0 = null;

        EObject lv_tipo_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1960:2: ( ( ( () ( (lv_parametros_1_0= ruleParameters ) ) ) | ( (lv_tipo_2_0= ruleTypes ) ) ) )
            // InternalGo.g:1961:2: ( ( () ( (lv_parametros_1_0= ruleParameters ) ) ) | ( (lv_tipo_2_0= ruleTypes ) ) )
            {
            // InternalGo.g:1961:2: ( ( () ( (lv_parametros_1_0= ruleParameters ) ) ) | ( (lv_tipo_2_0= ruleTypes ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            else if ( (LA25_0==22||(LA25_0>=31 && LA25_0<=34)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:1962:3: ( () ( (lv_parametros_1_0= ruleParameters ) ) )
                    {
                    // InternalGo.g:1962:3: ( () ( (lv_parametros_1_0= ruleParameters ) ) )
                    // InternalGo.g:1963:4: () ( (lv_parametros_1_0= ruleParameters ) )
                    {
                    // InternalGo.g:1963:4: ()
                    // InternalGo.g:1964:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getResultAccess().getResultAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:1973:4: ( (lv_parametros_1_0= ruleParameters ) )
                    // InternalGo.g:1974:5: (lv_parametros_1_0= ruleParameters )
                    {
                    // InternalGo.g:1974:5: (lv_parametros_1_0= ruleParameters )
                    // InternalGo.g:1975:6: lv_parametros_1_0= ruleParameters
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getResultAccess().getParametrosParametersParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_parametros_1_0=ruleParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getResultRule());
                      						}
                      						set(
                      							current,
                      							"parametros",
                      							lv_parametros_1_0,
                      							"com.ufcg.compiler.Go.Parameters");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1994:3: ( (lv_tipo_2_0= ruleTypes ) )
                    {
                    // InternalGo.g:1994:3: ( (lv_tipo_2_0= ruleTypes ) )
                    // InternalGo.g:1995:4: (lv_tipo_2_0= ruleTypes )
                    {
                    // InternalGo.g:1995:4: (lv_tipo_2_0= ruleTypes )
                    // InternalGo.g:1996:5: lv_tipo_2_0= ruleTypes
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getResultAccess().getTipoTypesParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_tipo_2_0=ruleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getResultRule());
                      					}
                      					set(
                      						current,
                      						"tipo",
                      						lv_tipo_2_0,
                      						"com.ufcg.compiler.Go.Types");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleParameters"
    // InternalGo.g:2017:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalGo.g:2017:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalGo.g:2018:2: iv_ruleParameters= ruleParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameters; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalGo.g:2024:1: ruleParameters returns [EObject current=null] : ( () ruleABRE_PARENTESES (this_PARAMETERS_LIST_2= rulePARAMETERS_LIST )? ruleFECHA_PARENTESES ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        EObject this_PARAMETERS_LIST_2 = null;



        	enterRule();

        try {
            // InternalGo.g:2030:2: ( ( () ruleABRE_PARENTESES (this_PARAMETERS_LIST_2= rulePARAMETERS_LIST )? ruleFECHA_PARENTESES ) )
            // InternalGo.g:2031:2: ( () ruleABRE_PARENTESES (this_PARAMETERS_LIST_2= rulePARAMETERS_LIST )? ruleFECHA_PARENTESES )
            {
            // InternalGo.g:2031:2: ( () ruleABRE_PARENTESES (this_PARAMETERS_LIST_2= rulePARAMETERS_LIST )? ruleFECHA_PARENTESES )
            // InternalGo.g:2032:3: () ruleABRE_PARENTESES (this_PARAMETERS_LIST_2= rulePARAMETERS_LIST )? ruleFECHA_PARENTESES
            {
            // InternalGo.g:2032:3: ()
            // InternalGo.g:2033:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParametersAccess().getParametersAction_0(),
              					current);
              			
            }

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParametersAccess().getABRE_PARENTESESParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_25);
            ruleABRE_PARENTESES();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2052:3: (this_PARAMETERS_LIST_2= rulePARAMETERS_LIST )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGo.g:2053:4: this_PARAMETERS_LIST_2= rulePARAMETERS_LIST
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParametersAccess().getPARAMETERS_LISTParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_25);
                    this_PARAMETERS_LIST_2=rulePARAMETERS_LIST();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PARAMETERS_LIST_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParametersAccess().getFECHA_PARENTESESParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            ruleFECHA_PARENTESES();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleABRE_PARENTESES"
    // InternalGo.g:2079:1: entryRuleABRE_PARENTESES returns [String current=null] : iv_ruleABRE_PARENTESES= ruleABRE_PARENTESES EOF ;
    public final String entryRuleABRE_PARENTESES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleABRE_PARENTESES = null;


        try {
            // InternalGo.g:2079:55: (iv_ruleABRE_PARENTESES= ruleABRE_PARENTESES EOF )
            // InternalGo.g:2080:2: iv_ruleABRE_PARENTESES= ruleABRE_PARENTESES EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getABRE_PARENTESESRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleABRE_PARENTESES=ruleABRE_PARENTESES();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleABRE_PARENTESES.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleABRE_PARENTESES"


    // $ANTLR start "ruleABRE_PARENTESES"
    // InternalGo.g:2086:1: ruleABRE_PARENTESES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleABRE_PARENTESES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2092:2: (kw= '(' )
            // InternalGo.g:2093:2: kw= '('
            {
            kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getABRE_PARENTESESAccess().getLeftParenthesisKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleABRE_PARENTESES"


    // $ANTLR start "entryRuleFECHA_PARENTESES"
    // InternalGo.g:2101:1: entryRuleFECHA_PARENTESES returns [String current=null] : iv_ruleFECHA_PARENTESES= ruleFECHA_PARENTESES EOF ;
    public final String entryRuleFECHA_PARENTESES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFECHA_PARENTESES = null;


        try {
            // InternalGo.g:2101:56: (iv_ruleFECHA_PARENTESES= ruleFECHA_PARENTESES EOF )
            // InternalGo.g:2102:2: iv_ruleFECHA_PARENTESES= ruleFECHA_PARENTESES EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFECHA_PARENTESESRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFECHA_PARENTESES=ruleFECHA_PARENTESES();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFECHA_PARENTESES.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFECHA_PARENTESES"


    // $ANTLR start "ruleFECHA_PARENTESES"
    // InternalGo.g:2108:1: ruleFECHA_PARENTESES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleFECHA_PARENTESES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2114:2: (kw= ')' )
            // InternalGo.g:2115:2: kw= ')'
            {
            kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getFECHA_PARENTESESAccess().getRightParenthesisKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFECHA_PARENTESES"


    // $ANTLR start "entryRuleBLOCK"
    // InternalGo.g:2123:1: entryRuleBLOCK returns [EObject current=null] : iv_ruleBLOCK= ruleBLOCK EOF ;
    public final EObject entryRuleBLOCK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBLOCK = null;


        try {
            // InternalGo.g:2123:46: (iv_ruleBLOCK= ruleBLOCK EOF )
            // InternalGo.g:2124:2: iv_ruleBLOCK= ruleBLOCK EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBLOCKRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBLOCK=ruleBLOCK();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBLOCK; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBLOCK"


    // $ANTLR start "ruleBLOCK"
    // InternalGo.g:2130:1: ruleBLOCK returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}' ) ;
    public final EObject ruleBLOCK() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listaDeComandos_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2136:2: ( ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}' ) )
            // InternalGo.g:2137:2: ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}' )
            {
            // InternalGo.g:2137:2: ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}' )
            // InternalGo.g:2138:3: () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}'
            {
            // InternalGo.g:2138:3: ()
            // InternalGo.g:2139:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBLOCKAccess().getBLOCKAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBLOCKAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:2152:3: ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING_DECL)||(LA27_0>=15 && LA27_0<=18)||(LA27_0>=24 && LA27_0<=25)||LA27_0==28) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGo.g:2153:4: (lv_listaDeComandos_2_0= ruleEXPRESSAO )
            	    {
            	    // InternalGo.g:2153:4: (lv_listaDeComandos_2_0= ruleEXPRESSAO )
            	    // InternalGo.g:2154:5: lv_listaDeComandos_2_0= ruleEXPRESSAO
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBLOCKAccess().getListaDeComandosEXPRESSAOParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_listaDeComandos_2_0=ruleEXPRESSAO();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBLOCKRule());
            	      					}
            	      					add(
            	      						current,
            	      						"listaDeComandos",
            	      						lv_listaDeComandos_2_0,
            	      						"com.ufcg.compiler.Go.EXPRESSAO");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBLOCKAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBLOCK"


    // $ANTLR start "entryRulePARAMETERS_LIST"
    // InternalGo.g:2179:1: entryRulePARAMETERS_LIST returns [EObject current=null] : iv_rulePARAMETERS_LIST= rulePARAMETERS_LIST EOF ;
    public final EObject entryRulePARAMETERS_LIST() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePARAMETERS_LIST = null;


        try {
            // InternalGo.g:2179:56: (iv_rulePARAMETERS_LIST= rulePARAMETERS_LIST EOF )
            // InternalGo.g:2180:2: iv_rulePARAMETERS_LIST= rulePARAMETERS_LIST EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPARAMETERS_LISTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePARAMETERS_LIST=rulePARAMETERS_LIST();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePARAMETERS_LIST; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePARAMETERS_LIST"


    // $ANTLR start "rulePARAMETERS_LIST"
    // InternalGo.g:2186:1: rulePARAMETERS_LIST returns [EObject current=null] : (this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )* ) ;
    public final EObject rulePARAMETERS_LIST() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PARAMETER_0 = null;

        EObject lv_PARAMETER_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2192:2: ( (this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )* ) )
            // InternalGo.g:2193:2: (this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )* )
            {
            // InternalGo.g:2193:2: (this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )* )
            // InternalGo.g:2194:3: this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_PARAMETER_0=rulePARAMETER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PARAMETER_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2205:3: (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGo.g:2206:4: otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPARAMETERS_LISTAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalGo.g:2210:4: ( (lv_PARAMETER_2_0= rulePARAMETER ) )
            	    // InternalGo.g:2211:5: (lv_PARAMETER_2_0= rulePARAMETER )
            	    {
            	    // InternalGo.g:2211:5: (lv_PARAMETER_2_0= rulePARAMETER )
            	    // InternalGo.g:2212:6: lv_PARAMETER_2_0= rulePARAMETER
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERPARAMETERParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_PARAMETER_2_0=rulePARAMETER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPARAMETERS_LISTRule());
            	      						}
            	      						add(
            	      							current,
            	      							"PARAMETER",
            	      							lv_PARAMETER_2_0,
            	      							"com.ufcg.compiler.Go.PARAMETER");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePARAMETERS_LIST"


    // $ANTLR start "entryRulePARAMETER"
    // InternalGo.g:2234:1: entryRulePARAMETER returns [EObject current=null] : iv_rulePARAMETER= rulePARAMETER EOF ;
    public final EObject entryRulePARAMETER() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePARAMETER = null;


        try {
            // InternalGo.g:2234:50: (iv_rulePARAMETER= rulePARAMETER EOF )
            // InternalGo.g:2235:2: iv_rulePARAMETER= rulePARAMETER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPARAMETERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePARAMETER=rulePARAMETER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePARAMETER; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePARAMETER"


    // $ANTLR start "rulePARAMETER"
    // InternalGo.g:2241:1: rulePARAMETER returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) ) ) ;
    public final EObject rulePARAMETER() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_tipo_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2247:2: ( ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) ) ) )
            // InternalGo.g:2248:2: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) ) )
            {
            // InternalGo.g:2248:2: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) ) )
            // InternalGo.g:2249:3: ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) )
            {
            // InternalGo.g:2249:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalGo.g:2250:4: (lv_id_0_0= RULE_ID )
            {
            // InternalGo.g:2250:4: (lv_id_0_0= RULE_ID )
            // InternalGo.g:2251:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_0_0, grammarAccess.getPARAMETERAccess().getIdIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPARAMETERRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:2267:3: ( (lv_tipo_1_0= ruleTypes ) )
            // InternalGo.g:2268:4: (lv_tipo_1_0= ruleTypes )
            {
            // InternalGo.g:2268:4: (lv_tipo_1_0= ruleTypes )
            // InternalGo.g:2269:5: lv_tipo_1_0= ruleTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPARAMETERAccess().getTipoTypesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_tipo_1_0=ruleTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPARAMETERRule());
              					}
              					set(
              						current,
              						"tipo",
              						lv_tipo_1_0,
              						"com.ufcg.compiler.Go.Types");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePARAMETER"


    // $ANTLR start "entryRuleTypes"
    // InternalGo.g:2290:1: entryRuleTypes returns [EObject current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final EObject entryRuleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypes = null;


        try {
            // InternalGo.g:2290:46: (iv_ruleTypes= ruleTypes EOF )
            // InternalGo.g:2291:2: iv_ruleTypes= ruleTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypes=ruleTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalGo.g:2297:1: ruleTypes returns [EObject current=null] : ( ( (lv_basic_0_0= ruleBasicType ) ) | ( (lv_array_1_0= ruleArrayType ) ) ) ;
    public final EObject ruleTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_basic_0_0 = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2303:2: ( ( ( (lv_basic_0_0= ruleBasicType ) ) | ( (lv_array_1_0= ruleArrayType ) ) ) )
            // InternalGo.g:2304:2: ( ( (lv_basic_0_0= ruleBasicType ) ) | ( (lv_array_1_0= ruleArrayType ) ) )
            {
            // InternalGo.g:2304:2: ( ( (lv_basic_0_0= ruleBasicType ) ) | ( (lv_array_1_0= ruleArrayType ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=31 && LA29_0<=34)) ) {
                alt29=1;
            }
            else if ( (LA29_0==22) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalGo.g:2305:3: ( (lv_basic_0_0= ruleBasicType ) )
                    {
                    // InternalGo.g:2305:3: ( (lv_basic_0_0= ruleBasicType ) )
                    // InternalGo.g:2306:4: (lv_basic_0_0= ruleBasicType )
                    {
                    // InternalGo.g:2306:4: (lv_basic_0_0= ruleBasicType )
                    // InternalGo.g:2307:5: lv_basic_0_0= ruleBasicType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypesAccess().getBasicBasicTypeParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_basic_0_0=ruleBasicType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypesRule());
                      					}
                      					set(
                      						current,
                      						"basic",
                      						lv_basic_0_0,
                      						"com.ufcg.compiler.Go.BasicType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2325:3: ( (lv_array_1_0= ruleArrayType ) )
                    {
                    // InternalGo.g:2325:3: ( (lv_array_1_0= ruleArrayType ) )
                    // InternalGo.g:2326:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalGo.g:2326:4: (lv_array_1_0= ruleArrayType )
                    // InternalGo.g:2327:5: lv_array_1_0= ruleArrayType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypesAccess().getArrayArrayTypeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_array_1_0=ruleArrayType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypesRule());
                      					}
                      					set(
                      						current,
                      						"array",
                      						lv_array_1_0,
                      						"com.ufcg.compiler.Go.ArrayType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleArrayType"
    // InternalGo.g:2348:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalGo.g:2348:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalGo.g:2349:2: iv_ruleArrayType= ruleArrayType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalGo.g:2355:1: ruleArrayType returns [EObject current=null] : (otherlv_0= '[' ( (lv_qtd_1_0= RULE_NUMERO ) )? otherlv_2= ']' ( (lv_basic_3_0= ruleBasicType ) ) ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_qtd_1_0=null;
        Token otherlv_2=null;
        EObject lv_basic_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2361:2: ( (otherlv_0= '[' ( (lv_qtd_1_0= RULE_NUMERO ) )? otherlv_2= ']' ( (lv_basic_3_0= ruleBasicType ) ) ) )
            // InternalGo.g:2362:2: (otherlv_0= '[' ( (lv_qtd_1_0= RULE_NUMERO ) )? otherlv_2= ']' ( (lv_basic_3_0= ruleBasicType ) ) )
            {
            // InternalGo.g:2362:2: (otherlv_0= '[' ( (lv_qtd_1_0= RULE_NUMERO ) )? otherlv_2= ']' ( (lv_basic_3_0= ruleBasicType ) ) )
            // InternalGo.g:2363:3: otherlv_0= '[' ( (lv_qtd_1_0= RULE_NUMERO ) )? otherlv_2= ']' ( (lv_basic_3_0= ruleBasicType ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGo.g:2367:3: ( (lv_qtd_1_0= RULE_NUMERO ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_NUMERO) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGo.g:2368:4: (lv_qtd_1_0= RULE_NUMERO )
                    {
                    // InternalGo.g:2368:4: (lv_qtd_1_0= RULE_NUMERO )
                    // InternalGo.g:2369:5: lv_qtd_1_0= RULE_NUMERO
                    {
                    lv_qtd_1_0=(Token)match(input,RULE_NUMERO,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_qtd_1_0, grammarAccess.getArrayTypeAccess().getQtdNUMEROTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getArrayTypeRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"qtd",
                      						lv_qtd_1_0,
                      						"com.ufcg.compiler.Go.NUMERO");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_2());
              		
            }
            // InternalGo.g:2389:3: ( (lv_basic_3_0= ruleBasicType ) )
            // InternalGo.g:2390:4: (lv_basic_3_0= ruleBasicType )
            {
            // InternalGo.g:2390:4: (lv_basic_3_0= ruleBasicType )
            // InternalGo.g:2391:5: lv_basic_3_0= ruleBasicType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayTypeAccess().getBasicBasicTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_basic_3_0=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayTypeRule());
              					}
              					set(
              						current,
              						"basic",
              						lv_basic_3_0,
              						"com.ufcg.compiler.Go.BasicType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleBasicType"
    // InternalGo.g:2412:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalGo.g:2412:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalGo.g:2413:2: iv_ruleBasicType= ruleBasicType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalGo.g:2419:1: ruleBasicType returns [EObject current=null] : ( ( (lv_string_0_0= 'string' ) ) | ( (lv_int_1_0= 'int' ) ) | ( (lv_float_2_0= 'float' ) ) | ( (lv_boolean_3_0= 'bool' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        Token lv_int_1_0=null;
        Token lv_float_2_0=null;
        Token lv_boolean_3_0=null;


        	enterRule();

        try {
            // InternalGo.g:2425:2: ( ( ( (lv_string_0_0= 'string' ) ) | ( (lv_int_1_0= 'int' ) ) | ( (lv_float_2_0= 'float' ) ) | ( (lv_boolean_3_0= 'bool' ) ) ) )
            // InternalGo.g:2426:2: ( ( (lv_string_0_0= 'string' ) ) | ( (lv_int_1_0= 'int' ) ) | ( (lv_float_2_0= 'float' ) ) | ( (lv_boolean_3_0= 'bool' ) ) )
            {
            // InternalGo.g:2426:2: ( ( (lv_string_0_0= 'string' ) ) | ( (lv_int_1_0= 'int' ) ) | ( (lv_float_2_0= 'float' ) ) | ( (lv_boolean_3_0= 'bool' ) ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt31=1;
                }
                break;
            case 32:
                {
                alt31=2;
                }
                break;
            case 33:
                {
                alt31=3;
                }
                break;
            case 34:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalGo.g:2427:3: ( (lv_string_0_0= 'string' ) )
                    {
                    // InternalGo.g:2427:3: ( (lv_string_0_0= 'string' ) )
                    // InternalGo.g:2428:4: (lv_string_0_0= 'string' )
                    {
                    // InternalGo.g:2428:4: (lv_string_0_0= 'string' )
                    // InternalGo.g:2429:5: lv_string_0_0= 'string'
                    {
                    lv_string_0_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_string_0_0, grammarAccess.getBasicTypeAccess().getStringStringKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "string", lv_string_0_0, "string");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2442:3: ( (lv_int_1_0= 'int' ) )
                    {
                    // InternalGo.g:2442:3: ( (lv_int_1_0= 'int' ) )
                    // InternalGo.g:2443:4: (lv_int_1_0= 'int' )
                    {
                    // InternalGo.g:2443:4: (lv_int_1_0= 'int' )
                    // InternalGo.g:2444:5: lv_int_1_0= 'int'
                    {
                    lv_int_1_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_int_1_0, grammarAccess.getBasicTypeAccess().getIntIntKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "int", lv_int_1_0, "int");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:2457:3: ( (lv_float_2_0= 'float' ) )
                    {
                    // InternalGo.g:2457:3: ( (lv_float_2_0= 'float' ) )
                    // InternalGo.g:2458:4: (lv_float_2_0= 'float' )
                    {
                    // InternalGo.g:2458:4: (lv_float_2_0= 'float' )
                    // InternalGo.g:2459:5: lv_float_2_0= 'float'
                    {
                    lv_float_2_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_float_2_0, grammarAccess.getBasicTypeAccess().getFloatFloatKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "float", lv_float_2_0, "float");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:2472:3: ( (lv_boolean_3_0= 'bool' ) )
                    {
                    // InternalGo.g:2472:3: ( (lv_boolean_3_0= 'bool' ) )
                    // InternalGo.g:2473:4: (lv_boolean_3_0= 'bool' )
                    {
                    // InternalGo.g:2473:4: (lv_boolean_3_0= 'bool' )
                    // InternalGo.g:2474:5: lv_boolean_3_0= 'bool'
                    {
                    lv_boolean_3_0=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_boolean_3_0, grammarAccess.getBasicTypeAccess().getBooleanBoolKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "boolean", lv_boolean_3_0, "bool");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleARIT_OP"
    // InternalGo.g:2490:1: entryRuleARIT_OP returns [String current=null] : iv_ruleARIT_OP= ruleARIT_OP EOF ;
    public final String entryRuleARIT_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleARIT_OP = null;


        try {
            // InternalGo.g:2490:47: (iv_ruleARIT_OP= ruleARIT_OP EOF )
            // InternalGo.g:2491:2: iv_ruleARIT_OP= ruleARIT_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getARIT_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleARIT_OP=ruleARIT_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleARIT_OP.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleARIT_OP"


    // $ANTLR start "ruleARIT_OP"
    // InternalGo.g:2497:1: ruleARIT_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleARIT_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2503:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalGo.g:2504:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalGo.g:2504:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt32=1;
                }
                break;
            case 36:
                {
                alt32=2;
                }
                break;
            case 37:
                {
                alt32=3;
                }
                break;
            case 38:
                {
                alt32=4;
                }
                break;
            case 39:
                {
                alt32=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalGo.g:2505:3: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getARIT_OPAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:2511:3: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getARIT_OPAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:2517:3: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getARIT_OPAccess().getAsteriskKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:2523:3: kw= '/'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getARIT_OPAccess().getSolidusKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:2529:3: kw= '^'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getARIT_OPAccess().getCircumflexAccentKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleARIT_OP"


    // $ANTLR start "entryRuleCOMPARISON"
    // InternalGo.g:2538:1: entryRuleCOMPARISON returns [EObject current=null] : iv_ruleCOMPARISON= ruleCOMPARISON EOF ;
    public final EObject entryRuleCOMPARISON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOMPARISON = null;


        try {
            // InternalGo.g:2538:51: (iv_ruleCOMPARISON= ruleCOMPARISON EOF )
            // InternalGo.g:2539:2: iv_ruleCOMPARISON= ruleCOMPARISON EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCOMPARISONRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCOMPARISON=ruleCOMPARISON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCOMPARISON; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOMPARISON"


    // $ANTLR start "ruleCOMPARISON"
    // InternalGo.g:2545:1: ruleCOMPARISON returns [EObject current=null] : ( ( (lv_igual_0_0= '==' ) ) | ( (lv_maiorigualque_1_0= '>=' ) ) | ( (lv_menorigualque_2_0= '<=' ) ) | ( (lv_maiorque_3_0= '>' ) ) | ( (lv_menorque_4_0= '<' ) ) ) ;
    public final EObject ruleCOMPARISON() throws RecognitionException {
        EObject current = null;

        Token lv_igual_0_0=null;
        Token lv_maiorigualque_1_0=null;
        Token lv_menorigualque_2_0=null;
        Token lv_maiorque_3_0=null;
        Token lv_menorque_4_0=null;


        	enterRule();

        try {
            // InternalGo.g:2551:2: ( ( ( (lv_igual_0_0= '==' ) ) | ( (lv_maiorigualque_1_0= '>=' ) ) | ( (lv_menorigualque_2_0= '<=' ) ) | ( (lv_maiorque_3_0= '>' ) ) | ( (lv_menorque_4_0= '<' ) ) ) )
            // InternalGo.g:2552:2: ( ( (lv_igual_0_0= '==' ) ) | ( (lv_maiorigualque_1_0= '>=' ) ) | ( (lv_menorigualque_2_0= '<=' ) ) | ( (lv_maiorque_3_0= '>' ) ) | ( (lv_menorque_4_0= '<' ) ) )
            {
            // InternalGo.g:2552:2: ( ( (lv_igual_0_0= '==' ) ) | ( (lv_maiorigualque_1_0= '>=' ) ) | ( (lv_menorigualque_2_0= '<=' ) ) | ( (lv_maiorque_3_0= '>' ) ) | ( (lv_menorque_4_0= '<' ) ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt33=1;
                }
                break;
            case 41:
                {
                alt33=2;
                }
                break;
            case 42:
                {
                alt33=3;
                }
                break;
            case 43:
                {
                alt33=4;
                }
                break;
            case 44:
                {
                alt33=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalGo.g:2553:3: ( (lv_igual_0_0= '==' ) )
                    {
                    // InternalGo.g:2553:3: ( (lv_igual_0_0= '==' ) )
                    // InternalGo.g:2554:4: (lv_igual_0_0= '==' )
                    {
                    // InternalGo.g:2554:4: (lv_igual_0_0= '==' )
                    // InternalGo.g:2555:5: lv_igual_0_0= '=='
                    {
                    lv_igual_0_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_igual_0_0, grammarAccess.getCOMPARISONAccess().getIgualEqualsSignEqualsSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCOMPARISONRule());
                      					}
                      					setWithLastConsumed(current, "igual", lv_igual_0_0, "==");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2568:3: ( (lv_maiorigualque_1_0= '>=' ) )
                    {
                    // InternalGo.g:2568:3: ( (lv_maiorigualque_1_0= '>=' ) )
                    // InternalGo.g:2569:4: (lv_maiorigualque_1_0= '>=' )
                    {
                    // InternalGo.g:2569:4: (lv_maiorigualque_1_0= '>=' )
                    // InternalGo.g:2570:5: lv_maiorigualque_1_0= '>='
                    {
                    lv_maiorigualque_1_0=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_maiorigualque_1_0, grammarAccess.getCOMPARISONAccess().getMaiorigualqueGreaterThanSignEqualsSignKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCOMPARISONRule());
                      					}
                      					setWithLastConsumed(current, "maiorigualque", lv_maiorigualque_1_0, ">=");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:2583:3: ( (lv_menorigualque_2_0= '<=' ) )
                    {
                    // InternalGo.g:2583:3: ( (lv_menorigualque_2_0= '<=' ) )
                    // InternalGo.g:2584:4: (lv_menorigualque_2_0= '<=' )
                    {
                    // InternalGo.g:2584:4: (lv_menorigualque_2_0= '<=' )
                    // InternalGo.g:2585:5: lv_menorigualque_2_0= '<='
                    {
                    lv_menorigualque_2_0=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_menorigualque_2_0, grammarAccess.getCOMPARISONAccess().getMenorigualqueLessThanSignEqualsSignKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCOMPARISONRule());
                      					}
                      					setWithLastConsumed(current, "menorigualque", lv_menorigualque_2_0, "<=");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:2598:3: ( (lv_maiorque_3_0= '>' ) )
                    {
                    // InternalGo.g:2598:3: ( (lv_maiorque_3_0= '>' ) )
                    // InternalGo.g:2599:4: (lv_maiorque_3_0= '>' )
                    {
                    // InternalGo.g:2599:4: (lv_maiorque_3_0= '>' )
                    // InternalGo.g:2600:5: lv_maiorque_3_0= '>'
                    {
                    lv_maiorque_3_0=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_maiorque_3_0, grammarAccess.getCOMPARISONAccess().getMaiorqueGreaterThanSignKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCOMPARISONRule());
                      					}
                      					setWithLastConsumed(current, "maiorque", lv_maiorque_3_0, ">");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:2613:3: ( (lv_menorque_4_0= '<' ) )
                    {
                    // InternalGo.g:2613:3: ( (lv_menorque_4_0= '<' ) )
                    // InternalGo.g:2614:4: (lv_menorque_4_0= '<' )
                    {
                    // InternalGo.g:2614:4: (lv_menorque_4_0= '<' )
                    // InternalGo.g:2615:5: lv_menorque_4_0= '<'
                    {
                    lv_menorque_4_0=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_menorque_4_0, grammarAccess.getCOMPARISONAccess().getMenorqueLessThanSignKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCOMPARISONRule());
                      					}
                      					setWithLastConsumed(current, "menorque", lv_menorque_4_0, "<");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOMPARISON"

    // $ANTLR start synpred5_InternalGo
    public final void synpred5_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:189:4: ( ( 'false' ) )
        // InternalGo.g:189:5: ( 'false' )
        {
        // InternalGo.g:189:5: ( 'false' )
        // InternalGo.g:190:5: 'false'
        {
        match(input,16,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalGo

    // $ANTLR start synpred6_InternalGo
    public final void synpred6_InternalGo_fragment() throws RecognitionException {   
        EObject lv_var_0_0 = null;


        // InternalGo.g:225:3: ( ( (lv_var_0_0= ruleVarDecl ) ) )
        // InternalGo.g:225:3: ( (lv_var_0_0= ruleVarDecl ) )
        {
        // InternalGo.g:225:3: ( (lv_var_0_0= ruleVarDecl ) )
        // InternalGo.g:226:4: (lv_var_0_0= ruleVarDecl )
        {
        // InternalGo.g:226:4: (lv_var_0_0= ruleVarDecl )
        // InternalGo.g:227:5: lv_var_0_0= ruleVarDecl
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getGoDeclAccess().getVarVarDeclParserRuleCall_0_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_var_0_0=ruleVarDecl();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred6_InternalGo

    // $ANTLR start synpred7_InternalGo
    public final void synpred7_InternalGo_fragment() throws RecognitionException {   
        EObject lv_func_1_0 = null;


        // InternalGo.g:245:3: ( ( (lv_func_1_0= ruleFunctionType ) ) )
        // InternalGo.g:245:3: ( (lv_func_1_0= ruleFunctionType ) )
        {
        // InternalGo.g:245:3: ( (lv_func_1_0= ruleFunctionType ) )
        // InternalGo.g:246:4: (lv_func_1_0= ruleFunctionType )
        {
        // InternalGo.g:246:4: (lv_func_1_0= ruleFunctionType )
        // InternalGo.g:247:5: lv_func_1_0= ruleFunctionType
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getGoDeclAccess().getFuncFunctionTypeParserRuleCall_1_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_func_1_0=ruleFunctionType();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalGo

    // $ANTLR start synpred11_InternalGo
    public final void synpred11_InternalGo_fragment() throws RecognitionException {   
        EObject lv_post_5_0 = null;


        // InternalGo.g:433:4: ( (lv_post_5_0= rulePostStmt ) )
        // InternalGo.g:433:4: (lv_post_5_0= rulePostStmt )
        {
        // InternalGo.g:433:4: (lv_post_5_0= rulePostStmt )
        // InternalGo.g:434:5: lv_post_5_0= rulePostStmt
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getForClauseAccess().getPostPostStmtParserRuleCall_5_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_post_5_0=rulePostStmt();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalGo

    // $ANTLR start synpred21_InternalGo
    public final void synpred21_InternalGo_fragment() throws RecognitionException {   
        EObject lv_exp_0_0 = null;

        EObject lv_explinha_1_0 = null;


        // InternalGo.g:1200:3: ( ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) ) )
        // InternalGo.g:1200:3: ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) )
        {
        // InternalGo.g:1200:3: ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) )
        // InternalGo.g:1201:4: ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) )
        {
        // InternalGo.g:1201:4: ( (lv_exp_0_0= ruleEXPRESSAO ) )
        // InternalGo.g:1202:5: (lv_exp_0_0= ruleEXPRESSAO )
        {
        // InternalGo.g:1202:5: (lv_exp_0_0= ruleEXPRESSAO )
        // InternalGo.g:1203:6: lv_exp_0_0= ruleEXPRESSAO
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getEXPRESSAOLINHAAccess().getExpEXPRESSAOParserRuleCall_0_0_0());
          					
        }
        pushFollow(FOLLOW_10);
        lv_exp_0_0=ruleEXPRESSAO();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalGo.g:1220:4: ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) )
        // InternalGo.g:1221:5: (lv_explinha_1_0= ruleEXPRESSAOLINHA )
        {
        // InternalGo.g:1221:5: (lv_explinha_1_0= ruleEXPRESSAOLINHA )
        // InternalGo.g:1222:6: lv_explinha_1_0= ruleEXPRESSAOLINHA
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getEXPRESSAOLINHAAccess().getExplinhaEXPRESSAOLINHAParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_explinha_1_0=ruleEXPRESSAOLINHA();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalGo

    // $ANTLR start synpred22_InternalGo
    public final void synpred22_InternalGo_fragment() throws RecognitionException {   
        EObject lv_declFunction_1_0 = null;


        // InternalGo.g:1279:3: ( ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) ) )
        // InternalGo.g:1279:3: ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) )
        {
        // InternalGo.g:1279:3: ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) )
        // InternalGo.g:1280:4: () ( (lv_declFunction_1_0= ruleFunctionType ) )
        {
        // InternalGo.g:1280:4: ()
        // InternalGo.g:1281:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalGo.g:1290:4: ( (lv_declFunction_1_0= ruleFunctionType ) )
        // InternalGo.g:1291:5: (lv_declFunction_1_0= ruleFunctionType )
        {
        // InternalGo.g:1291:5: (lv_declFunction_1_0= ruleFunctionType )
        // InternalGo.g:1292:6: lv_declFunction_1_0= ruleFunctionType
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getEXPRESSAOAccess().getDeclFunctionFunctionTypeParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_declFunction_1_0=ruleFunctionType();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalGo

    // $ANTLR start synpred23_InternalGo
    public final void synpred23_InternalGo_fragment() throws RecognitionException {   
        EObject lv_variaveis_2_0 = null;


        // InternalGo.g:1311:3: ( ( (lv_variaveis_2_0= ruleVarDecl ) ) )
        // InternalGo.g:1311:3: ( (lv_variaveis_2_0= ruleVarDecl ) )
        {
        // InternalGo.g:1311:3: ( (lv_variaveis_2_0= ruleVarDecl ) )
        // InternalGo.g:1312:4: (lv_variaveis_2_0= ruleVarDecl )
        {
        // InternalGo.g:1312:4: (lv_variaveis_2_0= ruleVarDecl )
        // InternalGo.g:1313:5: lv_variaveis_2_0= ruleVarDecl
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getVariaveisVarDeclParserRuleCall_1_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_variaveis_2_0=ruleVarDecl();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23_InternalGo

    // $ANTLR start synpred24_InternalGo
    public final void synpred24_InternalGo_fragment() throws RecognitionException {   
        EObject lv_basic_3_0 = null;


        // InternalGo.g:1331:3: ( ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) ) )
        // InternalGo.g:1331:3: ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) )
        {
        // InternalGo.g:1331:3: ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) )
        // InternalGo.g:1332:4: (lv_basic_3_0= ruleLITERAIS_BASICOS )
        {
        // InternalGo.g:1332:4: (lv_basic_3_0= ruleLITERAIS_BASICOS )
        // InternalGo.g:1333:5: lv_basic_3_0= ruleLITERAIS_BASICOS
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getBasicLITERAIS_BASICOSParserRuleCall_2_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_basic_3_0=ruleLITERAIS_BASICOS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred24_InternalGo

    // $ANTLR start synpred25_InternalGo
    public final void synpred25_InternalGo_fragment() throws RecognitionException {   
        EObject lv_binary_exp_4_0 = null;


        // InternalGo.g:1351:3: ( ( (lv_binary_exp_4_0= ruleBINARY_EXP ) ) )
        // InternalGo.g:1351:3: ( (lv_binary_exp_4_0= ruleBINARY_EXP ) )
        {
        // InternalGo.g:1351:3: ( (lv_binary_exp_4_0= ruleBINARY_EXP ) )
        // InternalGo.g:1352:4: (lv_binary_exp_4_0= ruleBINARY_EXP )
        {
        // InternalGo.g:1352:4: (lv_binary_exp_4_0= ruleBINARY_EXP )
        // InternalGo.g:1353:5: lv_binary_exp_4_0= ruleBINARY_EXP
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getBinary_expBINARY_EXPParserRuleCall_3_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_binary_exp_4_0=ruleBINARY_EXP();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25_InternalGo

    // $ANTLR start synpred26_InternalGo
    public final void synpred26_InternalGo_fragment() throws RecognitionException {   
        EObject lv_declFunction_5_0 = null;


        // InternalGo.g:1371:3: ( ( (lv_declFunction_5_0= ruleFunctionType ) ) )
        // InternalGo.g:1371:3: ( (lv_declFunction_5_0= ruleFunctionType ) )
        {
        // InternalGo.g:1371:3: ( (lv_declFunction_5_0= ruleFunctionType ) )
        // InternalGo.g:1372:4: (lv_declFunction_5_0= ruleFunctionType )
        {
        // InternalGo.g:1372:4: (lv_declFunction_5_0= ruleFunctionType )
        // InternalGo.g:1373:5: lv_declFunction_5_0= ruleFunctionType
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getDeclFunctionFunctionTypeParserRuleCall_4_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_declFunction_5_0=ruleFunctionType();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26_InternalGo

    // $ANTLR start synpred28_InternalGo
    public final void synpred28_InternalGo_fragment() throws RecognitionException {   
        EObject lv_variaveis_7_0 = null;


        // InternalGo.g:1411:3: ( ( (lv_variaveis_7_0= ruleVarDecl ) ) )
        // InternalGo.g:1411:3: ( (lv_variaveis_7_0= ruleVarDecl ) )
        {
        // InternalGo.g:1411:3: ( (lv_variaveis_7_0= ruleVarDecl ) )
        // InternalGo.g:1412:4: (lv_variaveis_7_0= ruleVarDecl )
        {
        // InternalGo.g:1412:4: (lv_variaveis_7_0= ruleVarDecl )
        // InternalGo.g:1413:5: lv_variaveis_7_0= ruleVarDecl
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getVariaveisVarDeclParserRuleCall_6_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_variaveis_7_0=ruleVarDecl();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred28_InternalGo

    // $ANTLR start synpred30_InternalGo
    public final void synpred30_InternalGo_fragment() throws RecognitionException {   
        EObject lv_basic_9_0 = null;


        // InternalGo.g:1451:3: ( ( (lv_basic_9_0= ruleLITERAIS_BASICOS ) ) )
        // InternalGo.g:1451:3: ( (lv_basic_9_0= ruleLITERAIS_BASICOS ) )
        {
        // InternalGo.g:1451:3: ( (lv_basic_9_0= ruleLITERAIS_BASICOS ) )
        // InternalGo.g:1452:4: (lv_basic_9_0= ruleLITERAIS_BASICOS )
        {
        // InternalGo.g:1452:4: (lv_basic_9_0= ruleLITERAIS_BASICOS )
        // InternalGo.g:1453:5: lv_basic_9_0= ruleLITERAIS_BASICOS
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getBasicLITERAIS_BASICOSParserRuleCall_8_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_basic_9_0=ruleLITERAIS_BASICOS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred30_InternalGo

    // $ANTLR start synpred36_InternalGo
    public final void synpred36_InternalGo_fragment() throws RecognitionException {   
        EObject lv_bloco_3_0 = null;


        // InternalGo.g:1876:4: ( (lv_bloco_3_0= ruleBLOCK ) )
        // InternalGo.g:1876:4: (lv_bloco_3_0= ruleBLOCK )
        {
        // InternalGo.g:1876:4: (lv_bloco_3_0= ruleBLOCK )
        // InternalGo.g:1877:5: lv_bloco_3_0= ruleBLOCK
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getFunctionTypeAccess().getBlocoBLOCKParserRuleCall_3_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_bloco_3_0=ruleBLOCK();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred36_InternalGo

    // Delegated rules

    public final boolean synpred7_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\45\uffff";
    static final String dfa_2s = "\3\4\1\0\1\4\1\uffff\1\0\1\uffff\1\35\1\4\1\26\1\0\4\25\1\5\1\uffff\1\4\1\27\1\37\1\26\10\25\1\5\1\27\1\37\4\25";
    static final String dfa_3s = "\1\34\2\4\1\0\1\4\1\uffff\1\0\1\uffff\1\35\1\36\1\42\1\0\4\36\1\27\1\uffff\1\4\1\27\2\42\10\36\2\27\1\42\4\36";
    static final String dfa_4s = "\5\uffff\1\3\1\uffff\1\1\11\uffff\1\2\23\uffff";
    static final String dfa_5s = "\3\uffff\1\0\2\uffff\1\1\4\uffff\1\2\31\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\2\5\10\uffff\4\5\5\uffff\1\1\1\2\2\uffff\1\4",
            "\1\6",
            "\1\6",
            "\1\uffff",
            "\1\10",
            "",
            "\1\uffff",
            "",
            "\1\11",
            "\1\12\31\uffff\1\13",
            "\1\20\10\uffff\1\14\1\15\1\16\1\17",
            "\1\uffff",
            "\1\22\10\uffff\1\13",
            "\1\22\10\uffff\1\13",
            "\1\22\10\uffff\1\13",
            "\1\22\10\uffff\1\13",
            "\1\23\21\uffff\1\24",
            "",
            "\1\25",
            "\1\24",
            "\1\26\1\27\1\30\1\31",
            "\1\36\10\uffff\1\32\1\33\1\34\1\35",
            "\1\22\10\uffff\1\13",
            "\1\22\10\uffff\1\13",
            "\1\22\10\uffff\1\13",
            "\1\22\10\uffff\1\13",
            "\1\22\10\uffff\1\13",
            "\1\22\10\uffff\1\13",
            "\1\22\10\uffff\1\13",
            "\1\22\10\uffff\1\13",
            "\1\37\21\uffff\1\40",
            "\1\40",
            "\1\41\1\42\1\43\1\44",
            "\1\22\10\uffff\1\13",
            "\1\22\10\uffff\1\13",
            "\1\22\10\uffff\1\13",
            "\1\22\10\uffff\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "224:2: ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFunctionType ) ) | ( (lv_expressao_2_0= ruleEXPRESSAOLINHA ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalGo()) ) {s = 7;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalGo()) ) {s = 7;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_11 = input.LA(1);

                         
                        int index4_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index4_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\4\12\0\2\uffff";
    static final String dfa_9s = "\1\34\12\0\2\uffff";
    static final String dfa_10s = "\13\uffff\1\1\1\2";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff}>";
    static final String[] dfa_12s = {
            "\1\4\1\5\1\6\10\uffff\1\7\1\10\1\11\1\12\5\uffff\1\2\1\3\2\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1199:2: ( ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) ) | ( (lv_exp_2_0= ruleEXPRESSAO ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_9 = input.LA(1);

                         
                        int index17_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_10 = input.LA(1);

                         
                        int index17_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\60\uffff";
    static final String dfa_14s = "\4\4\1\26\4\0\2\uffff\1\35\1\0\6\uffff\1\4\1\26\1\0\4\25\1\5\2\uffff\1\4\1\27\1\37\1\26\10\25\1\5\1\27\1\37\4\25";
    static final String dfa_15s = "\1\34\3\4\1\33\4\0\2\uffff\1\35\1\0\6\uffff\1\36\1\42\1\0\4\36\1\27\2\uffff\1\4\1\27\2\42\10\36\2\27\1\42\4\36";
    static final String dfa_16s = "\11\uffff\1\10\1\12\2\uffff\1\6\1\2\1\7\1\3\1\4\1\11\10\uffff\1\1\1\5\23\uffff";
    static final String dfa_17s = "\4\uffff\1\1\1\5\1\3\1\0\1\6\3\uffff\1\4\10\uffff\1\2\32\uffff}>";
    static final String[] dfa_18s = {
            "\1\4\1\5\1\6\10\uffff\1\7\1\10\1\11\1\12\5\uffff\1\2\1\3\2\uffff\1\1",
            "\1\13",
            "\1\14",
            "\1\14",
            "\1\15\3\uffff\2\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\23",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\31\uffff\1\25",
            "\1\32\10\uffff\1\26\1\27\1\30\1\31",
            "\1\uffff",
            "\1\35\10\uffff\1\25",
            "\1\35\10\uffff\1\25",
            "\1\35\10\uffff\1\25",
            "\1\35\10\uffff\1\25",
            "\1\36\21\uffff\1\37",
            "",
            "",
            "\1\40",
            "\1\37",
            "\1\41\1\42\1\43\1\44",
            "\1\51\10\uffff\1\45\1\46\1\47\1\50",
            "\1\35\10\uffff\1\25",
            "\1\35\10\uffff\1\25",
            "\1\35\10\uffff\1\25",
            "\1\35\10\uffff\1\25",
            "\1\35\10\uffff\1\25",
            "\1\35\10\uffff\1\25",
            "\1\35\10\uffff\1\25",
            "\1\35\10\uffff\1\25",
            "\1\52\21\uffff\1\53",
            "\1\53",
            "\1\54\1\55\1\56\1\57",
            "\1\35\10\uffff\1\25",
            "\1\35\10\uffff\1\25",
            "\1\35\10\uffff\1\25",
            "\1\35\10\uffff\1\25"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1278:2: ( ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) ) | ( (lv_variaveis_2_0= ruleVarDecl ) ) | ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) ) | ( (lv_binary_exp_4_0= ruleBINARY_EXP ) ) | ( (lv_declFunction_5_0= ruleFunctionType ) ) | ( (lv_assignment_6_0= ruleAssignment ) ) | ( (lv_variaveis_7_0= ruleVarDecl ) ) | ( (lv_for_8_0= ruleForDecl ) ) | ( (lv_basic_9_0= ruleLITERAIS_BASICOS ) ) | ( (lv_arrayValue_10_0= ruleArrayValue ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalGo()) ) {s = 16;}

                        else if ( (synpred25_InternalGo()) ) {s = 17;}

                        else if ( (synpred30_InternalGo()) ) {s = 18;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_4==22||(LA18_4>=26 && LA18_4<=27)) ) {s = 13;}

                        else if ( (synpred23_InternalGo()) ) {s = 14;}

                        else if ( (synpred28_InternalGo()) ) {s = 15;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_21 = input.LA(1);

                         
                        int index18_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalGo()) ) {s = 27;}

                        else if ( (synpred26_InternalGo()) ) {s = 28;}

                         
                        input.seek(index18_21);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalGo()) ) {s = 16;}

                        else if ( (synpred25_InternalGo()) ) {s = 17;}

                        else if ( (synpred30_InternalGo()) ) {s = 18;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_12 = input.LA(1);

                         
                        int index18_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalGo()) ) {s = 14;}

                        else if ( (synpred28_InternalGo()) ) {s = 15;}

                         
                        input.seek(index18_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalGo()) ) {s = 16;}

                        else if ( (synpred25_InternalGo()) ) {s = 17;}

                        else if ( (synpred30_InternalGo()) ) {s = 18;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalGo()) ) {s = 16;}

                        else if ( (synpred25_InternalGo()) ) {s = 17;}

                        else if ( (synpred30_InternalGo()) ) {s = 18;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\24\uffff";
    static final String dfa_20s = "\1\2\23\uffff";
    static final String dfa_21s = "\1\4\1\0\22\uffff";
    static final String dfa_22s = "\1\54\1\0\22\uffff";
    static final String dfa_23s = "\2\uffff\1\2\20\uffff\1\1";
    static final String dfa_24s = "\1\uffff\1\0\22\uffff}>";
    static final String[] dfa_25s = {
            "\3\2\10\uffff\3\2\1\1\2\2\3\uffff\2\2\2\uffff\1\2\13\uffff\5\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1875:3: ( (lv_bloco_3_0= ruleBLOCK ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalGo()) ) {s = 19;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000013078072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000013178070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000130F8070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00001F0000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000013078070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000013478070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000780400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000018060L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000F800006000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000007A0400002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000780400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000780000000L});

}