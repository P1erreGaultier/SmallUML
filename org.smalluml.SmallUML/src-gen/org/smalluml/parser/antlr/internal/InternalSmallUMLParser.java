package org.smalluml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.smalluml.services.SmallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Diagram'", "'{'", "'assoc'", "'('", "','", "')'", "'heritage'", "'class'", "'}'", "'Association'", "'method'", "'attribute'", "'used'", "'user'", "'Heritage'", "'mother'", "'child'", "'Class'", "'Type'", "'Role'", "'upper'", "'lower'", "'Float'", "'value'", "'Int'", "'Boolean'", "'String'", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallUMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallUMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallUMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallUML.g"; }



     	private SmallUMLGrammarAccess grammarAccess;

        public InternalSmallUMLParser(TokenStream input, SmallUMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Diagram";
       	}

       	@Override
       	protected SmallUMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDiagram"
    // InternalSmallUML.g:64:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalSmallUML.g:64:48: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalSmallUML.g:65:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalSmallUML.g:71:1: ruleDiagram returns [EObject current=null] : ( () otherlv_1= 'Diagram' otherlv_2= '{' (otherlv_3= 'assoc' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'heritage' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'class' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;


        	enterRule();

        try {
            // InternalSmallUML.g:77:2: ( ( () otherlv_1= 'Diagram' otherlv_2= '{' (otherlv_3= 'assoc' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'heritage' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'class' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' ) )
            // InternalSmallUML.g:78:2: ( () otherlv_1= 'Diagram' otherlv_2= '{' (otherlv_3= 'assoc' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'heritage' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'class' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' )
            {
            // InternalSmallUML.g:78:2: ( () otherlv_1= 'Diagram' otherlv_2= '{' (otherlv_3= 'assoc' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'heritage' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'class' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' )
            // InternalSmallUML.g:79:3: () otherlv_1= 'Diagram' otherlv_2= '{' (otherlv_3= 'assoc' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'heritage' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'class' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}'
            {
            // InternalSmallUML.g:79:3: ()
            // InternalSmallUML.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiagramAccess().getDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDiagramAccess().getDiagramKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmallUML.g:94:3: (otherlv_3= 'assoc' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmallUML.g:95:4: otherlv_3= 'assoc' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getDiagramAccess().getAssocKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getDiagramAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalSmallUML.g:103:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:104:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:104:5: ( ruleEString )
                    // InternalSmallUML.g:105:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDiagramRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDiagramAccess().getAssocAssociationCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:119:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSmallUML.g:120:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDiagramAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSmallUML.g:124:5: ( ( ruleEString ) )
                    	    // InternalSmallUML.g:125:6: ( ruleEString )
                    	    {
                    	    // InternalSmallUML.g:125:6: ( ruleEString )
                    	    // InternalSmallUML.g:126:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDiagramRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDiagramAccess().getAssocAssociationCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getDiagramAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:146:3: (otherlv_9= 'heritage' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUML.g:147:4: otherlv_9= 'heritage' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getDiagramAccess().getHeritageKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getDiagramAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalSmallUML.g:155:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:156:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:156:5: ( ruleEString )
                    // InternalSmallUML.g:157:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDiagramRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDiagramAccess().getHeritageHeritageCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:171:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSmallUML.g:172:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDiagramAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmallUML.g:176:5: ( ( ruleEString ) )
                    	    // InternalSmallUML.g:177:6: ( ruleEString )
                    	    {
                    	    // InternalSmallUML.g:177:6: ( ruleEString )
                    	    // InternalSmallUML.g:178:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDiagramRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDiagramAccess().getHeritageHeritageCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getDiagramAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:198:3: (otherlv_15= 'class' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallUML.g:199:4: otherlv_15= 'class' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getDiagramAccess().getClassKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getDiagramAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalSmallUML.g:207:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:208:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:208:5: ( ruleEString )
                    // InternalSmallUML.g:209:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDiagramRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDiagramAccess().getClassClassCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:223:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSmallUML.g:224:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDiagramAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:228:5: ( ( ruleEString ) )
                    	    // InternalSmallUML.g:229:6: ( ruleEString )
                    	    {
                    	    // InternalSmallUML.g:229:6: ( ruleEString )
                    	    // InternalSmallUML.g:230:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDiagramRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDiagramAccess().getClassClassCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_20, grammarAccess.getDiagramAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleAssociation"
    // InternalSmallUML.g:258:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalSmallUML.g:258:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalSmallUML.g:259:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalSmallUML.g:265:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'attribute' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'used' ( ( ruleEString ) ) otherlv_17= 'user' ( ( ruleEString ) ) otherlv_19= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:271:2: ( (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'attribute' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'used' ( ( ruleEString ) ) otherlv_17= 'user' ( ( ruleEString ) ) otherlv_19= '}' ) )
            // InternalSmallUML.g:272:2: (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'attribute' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'used' ( ( ruleEString ) ) otherlv_17= 'user' ( ( ruleEString ) ) otherlv_19= '}' )
            {
            // InternalSmallUML.g:272:2: (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'attribute' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'used' ( ( ruleEString ) ) otherlv_17= 'user' ( ( ruleEString ) ) otherlv_19= '}' )
            // InternalSmallUML.g:273:3: otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'attribute' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'used' ( ( ruleEString ) ) otherlv_17= 'user' ( ( ruleEString ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getAssociationKeyword_0());
            		
            // InternalSmallUML.g:277:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:278:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:278:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:279:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmallUML.g:300:3: (otherlv_3= 'method' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallUML.g:301:4: otherlv_3= 'method' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getMethodKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalSmallUML.g:309:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:310:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:310:5: ( ruleEString )
                    // InternalSmallUML.g:311:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssociationAccess().getMethodMethodCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:325:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSmallUML.g:326:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSmallUML.g:330:5: ( ( ruleEString ) )
                    	    // InternalSmallUML.g:331:6: ( ruleEString )
                    	    {
                    	    // InternalSmallUML.g:331:6: ( ruleEString )
                    	    // InternalSmallUML.g:332:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAssociationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAssociationAccess().getMethodMethodCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:352:3: (otherlv_9= 'attribute' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUML.g:353:4: otherlv_9= 'attribute' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getAttributeKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalSmallUML.g:361:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:362:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:362:5: ( ruleEString )
                    // InternalSmallUML.g:363:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssociationAccess().getAttributeTypeCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:377:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSmallUML.g:378:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAssociationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmallUML.g:382:5: ( ( ruleEString ) )
                    	    // InternalSmallUML.g:383:6: ( ruleEString )
                    	    {
                    	    // InternalSmallUML.g:383:6: ( ruleEString )
                    	    // InternalSmallUML.g:384:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAssociationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAssociationAccess().getAttributeTypeCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getUsedKeyword_5());
            		
            // InternalSmallUML.g:408:3: ( ( ruleEString ) )
            // InternalSmallUML.g:409:4: ( ruleEString )
            {
            // InternalSmallUML.g:409:4: ( ruleEString )
            // InternalSmallUML.g:410:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getUsedRoleCrossReference_6_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_17, grammarAccess.getAssociationAccess().getUserKeyword_7());
            		
            // InternalSmallUML.g:428:3: ( ( ruleEString ) )
            // InternalSmallUML.g:429:4: ( ruleEString )
            {
            // InternalSmallUML.g:429:4: ( ruleEString )
            // InternalSmallUML.g:430:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getUserRoleCrossReference_8_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleHeritage"
    // InternalSmallUML.g:452:1: entryRuleHeritage returns [EObject current=null] : iv_ruleHeritage= ruleHeritage EOF ;
    public final EObject entryRuleHeritage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeritage = null;


        try {
            // InternalSmallUML.g:452:49: (iv_ruleHeritage= ruleHeritage EOF )
            // InternalSmallUML.g:453:2: iv_ruleHeritage= ruleHeritage EOF
            {
             newCompositeNode(grammarAccess.getHeritageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeritage=ruleHeritage();

            state._fsp--;

             current =iv_ruleHeritage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeritage"


    // $ANTLR start "ruleHeritage"
    // InternalSmallUML.g:459:1: ruleHeritage returns [EObject current=null] : (otherlv_0= 'Heritage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'attribute' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'mother' ( ( ruleEString ) ) otherlv_17= 'child' ( ( ruleEString ) ) otherlv_19= '}' ) ;
    public final EObject ruleHeritage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:465:2: ( (otherlv_0= 'Heritage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'attribute' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'mother' ( ( ruleEString ) ) otherlv_17= 'child' ( ( ruleEString ) ) otherlv_19= '}' ) )
            // InternalSmallUML.g:466:2: (otherlv_0= 'Heritage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'attribute' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'mother' ( ( ruleEString ) ) otherlv_17= 'child' ( ( ruleEString ) ) otherlv_19= '}' )
            {
            // InternalSmallUML.g:466:2: (otherlv_0= 'Heritage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'attribute' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'mother' ( ( ruleEString ) ) otherlv_17= 'child' ( ( ruleEString ) ) otherlv_19= '}' )
            // InternalSmallUML.g:467:3: otherlv_0= 'Heritage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'attribute' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= 'mother' ( ( ruleEString ) ) otherlv_17= 'child' ( ( ruleEString ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getHeritageAccess().getHeritageKeyword_0());
            		
            // InternalSmallUML.g:471:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:472:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:472:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:473:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHeritageAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeritageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getHeritageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmallUML.g:494:3: (otherlv_3= 'method' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmallUML.g:495:4: otherlv_3= 'method' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getHeritageAccess().getMethodKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getHeritageAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalSmallUML.g:503:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:504:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:504:5: ( ruleEString )
                    // InternalSmallUML.g:505:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHeritageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHeritageAccess().getMethodMethodCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:519:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSmallUML.g:520:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHeritageAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSmallUML.g:524:5: ( ( ruleEString ) )
                    	    // InternalSmallUML.g:525:6: ( ruleEString )
                    	    {
                    	    // InternalSmallUML.g:525:6: ( ruleEString )
                    	    // InternalSmallUML.g:526:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHeritageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHeritageAccess().getMethodMethodCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getHeritageAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:546:3: (otherlv_9= 'attribute' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUML.g:547:4: otherlv_9= 'attribute' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getHeritageAccess().getAttributeKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getHeritageAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalSmallUML.g:555:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:556:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:556:5: ( ruleEString )
                    // InternalSmallUML.g:557:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHeritageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHeritageAccess().getAttributeTypeCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:571:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSmallUML.g:572:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getHeritageAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmallUML.g:576:5: ( ( ruleEString ) )
                    	    // InternalSmallUML.g:577:6: ( ruleEString )
                    	    {
                    	    // InternalSmallUML.g:577:6: ( ruleEString )
                    	    // InternalSmallUML.g:578:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHeritageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHeritageAccess().getAttributeTypeCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getHeritageAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getHeritageAccess().getMotherKeyword_5());
            		
            // InternalSmallUML.g:602:3: ( ( ruleEString ) )
            // InternalSmallUML.g:603:4: ( ruleEString )
            {
            // InternalSmallUML.g:603:4: ( ruleEString )
            // InternalSmallUML.g:604:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeritageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getHeritageAccess().getMotherRoleCrossReference_6_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_17, grammarAccess.getHeritageAccess().getChildKeyword_7());
            		
            // InternalSmallUML.g:622:3: ( ( ruleEString ) )
            // InternalSmallUML.g:623:4: ( ruleEString )
            {
            // InternalSmallUML.g:623:4: ( ruleEString )
            // InternalSmallUML.g:624:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeritageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getHeritageAccess().getChildRoleCrossReference_8_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getHeritageAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeritage"


    // $ANTLR start "entryRuleClass_Impl"
    // InternalSmallUML.g:646:1: entryRuleClass_Impl returns [EObject current=null] : iv_ruleClass_Impl= ruleClass_Impl EOF ;
    public final EObject entryRuleClass_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass_Impl = null;


        try {
            // InternalSmallUML.g:646:51: (iv_ruleClass_Impl= ruleClass_Impl EOF )
            // InternalSmallUML.g:647:2: iv_ruleClass_Impl= ruleClass_Impl EOF
            {
             newCompositeNode(grammarAccess.getClass_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass_Impl=ruleClass_Impl();

            state._fsp--;

             current =iv_ruleClass_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClass_Impl"


    // $ANTLR start "ruleClass_Impl"
    // InternalSmallUML.g:653:1: ruleClass_Impl returns [EObject current=null] : ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'method' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'attribute' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleClass_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:659:2: ( ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'method' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'attribute' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalSmallUML.g:660:2: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'method' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'attribute' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalSmallUML.g:660:2: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'method' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'attribute' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalSmallUML.g:661:3: () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'method' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'attribute' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalSmallUML.g:661:3: ()
            // InternalSmallUML.g:662:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClass_ImplAccess().getClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getClass_ImplAccess().getClassKeyword_1());
            		
            // InternalSmallUML.g:672:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:673:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:673:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:674:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClass_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClass_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getClass_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:695:3: (otherlv_4= 'method' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmallUML.g:696:4: otherlv_4= 'method' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getClass_ImplAccess().getMethodKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getClass_ImplAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalSmallUML.g:704:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:705:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:705:5: ( ruleEString )
                    // InternalSmallUML.g:706:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClass_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClass_ImplAccess().getMethodMethodCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:720:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalSmallUML.g:721:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getClass_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmallUML.g:725:5: ( ( ruleEString ) )
                    	    // InternalSmallUML.g:726:6: ( ruleEString )
                    	    {
                    	    // InternalSmallUML.g:726:6: ( ruleEString )
                    	    // InternalSmallUML.g:727:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClass_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getClass_ImplAccess().getMethodMethodCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getClass_ImplAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:747:3: (otherlv_10= 'attribute' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSmallUML.g:748:4: otherlv_10= 'attribute' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getClass_ImplAccess().getAttributeKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getClass_ImplAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalSmallUML.g:756:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:757:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:757:5: ( ruleEString )
                    // InternalSmallUML.g:758:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClass_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClass_ImplAccess().getAttributeTypeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:772:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalSmallUML.g:773:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getClass_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:777:5: ( ( ruleEString ) )
                    	    // InternalSmallUML.g:778:6: ( ruleEString )
                    	    {
                    	    // InternalSmallUML.g:778:6: ( ruleEString )
                    	    // InternalSmallUML.g:779:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClass_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getClass_ImplAccess().getAttributeTypeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getClass_ImplAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getClass_ImplAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:807:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUML.g:807:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUML.g:808:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmallUML.g:814:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:820:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUML.g:821:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUML.g:821:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSmallUML.g:822:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:830:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleType_Impl"
    // InternalSmallUML.g:841:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalSmallUML.g:841:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalSmallUML.g:842:2: iv_ruleType_Impl= ruleType_Impl EOF
            {
             newCompositeNode(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType_Impl=ruleType_Impl();

            state._fsp--;

             current =iv_ruleType_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalSmallUML.g:848:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:854:2: ( ( () otherlv_1= 'Type' ) )
            // InternalSmallUML.g:855:2: ( () otherlv_1= 'Type' )
            {
            // InternalSmallUML.g:855:2: ( () otherlv_1= 'Type' )
            // InternalSmallUML.g:856:3: () otherlv_1= 'Type'
            {
            // InternalSmallUML.g:856:3: ()
            // InternalSmallUML.g:857:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getType_ImplAccess().getTypeKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleRole"
    // InternalSmallUML.g:871:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSmallUML.g:871:45: (iv_ruleRole= ruleRole EOF )
            // InternalSmallUML.g:872:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalSmallUML.g:878:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upper' ( (lv_upper_4_0= ruleEInt ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleEInt ) ) (otherlv_7= 'method' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'attribute' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= 'class' ( ( ruleEString ) ) otherlv_21= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_upper_4_0 = null;

        AntlrDatatypeRuleToken lv_lower_6_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:884:2: ( (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upper' ( (lv_upper_4_0= ruleEInt ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleEInt ) ) (otherlv_7= 'method' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'attribute' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= 'class' ( ( ruleEString ) ) otherlv_21= '}' ) )
            // InternalSmallUML.g:885:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upper' ( (lv_upper_4_0= ruleEInt ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleEInt ) ) (otherlv_7= 'method' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'attribute' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= 'class' ( ( ruleEString ) ) otherlv_21= '}' )
            {
            // InternalSmallUML.g:885:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upper' ( (lv_upper_4_0= ruleEInt ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleEInt ) ) (otherlv_7= 'method' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'attribute' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= 'class' ( ( ruleEString ) ) otherlv_21= '}' )
            // InternalSmallUML.g:886:3: otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upper' ( (lv_upper_4_0= ruleEInt ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleEInt ) ) (otherlv_7= 'method' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'attribute' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= 'class' ( ( ruleEString ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalSmallUML.g:890:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:891:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:891:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:892:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getUpperKeyword_3());
            		
            // InternalSmallUML.g:917:3: ( (lv_upper_4_0= ruleEInt ) )
            // InternalSmallUML.g:918:4: (lv_upper_4_0= ruleEInt )
            {
            // InternalSmallUML.g:918:4: (lv_upper_4_0= ruleEInt )
            // InternalSmallUML.g:919:5: lv_upper_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getUpperEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_upper_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"upper",
            						lv_upper_4_0,
            						"org.smalluml.SmallUML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getLowerKeyword_5());
            		
            // InternalSmallUML.g:940:3: ( (lv_lower_6_0= ruleEInt ) )
            // InternalSmallUML.g:941:4: (lv_lower_6_0= ruleEInt )
            {
            // InternalSmallUML.g:941:4: (lv_lower_6_0= ruleEInt )
            // InternalSmallUML.g:942:5: lv_lower_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getLowerEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
            lv_lower_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"lower",
            						lv_lower_6_0,
            						"org.smalluml.SmallUML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUML.g:959:3: (otherlv_7= 'method' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSmallUML.g:960:4: otherlv_7= 'method' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getMethodKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalSmallUML.g:968:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:969:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:969:5: ( ruleEString )
                    // InternalSmallUML.g:970:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRoleAccess().getMethodMethodCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:984:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSmallUML.g:985:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRoleAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSmallUML.g:989:5: ( ( ruleEString ) )
                    	    // InternalSmallUML.g:990:6: ( ruleEString )
                    	    {
                    	    // InternalSmallUML.g:990:6: ( ruleEString )
                    	    // InternalSmallUML.g:991:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRoleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getMethodMethodCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_12, grammarAccess.getRoleAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:1011:3: (otherlv_13= 'attribute' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSmallUML.g:1012:4: otherlv_13= 'attribute' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getRoleAccess().getAttributeKeyword_8_0());
                    			
                    otherlv_14=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getRoleAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalSmallUML.g:1020:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:1021:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:1021:5: ( ruleEString )
                    // InternalSmallUML.g:1022:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRoleAccess().getAttributeTypeCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:1036:4: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSmallUML.g:1037:5: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getRoleAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalSmallUML.g:1041:5: ( ( ruleEString ) )
                    	    // InternalSmallUML.g:1042:6: ( ruleEString )
                    	    {
                    	    // InternalSmallUML.g:1042:6: ( ruleEString )
                    	    // InternalSmallUML.g:1043:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRoleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getAttributeTypeCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,16,FOLLOW_26); 

                    				newLeafNode(otherlv_18, grammarAccess.getRoleAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_19, grammarAccess.getRoleAccess().getClassKeyword_9());
            		
            // InternalSmallUML.g:1067:3: ( ( ruleEString ) )
            // InternalSmallUML.g:1068:4: ( ruleEString )
            {
            // InternalSmallUML.g:1068:4: ( ruleEString )
            // InternalSmallUML.g:1069:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoleAccess().getClassClassCrossReference_10_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleFloat"
    // InternalSmallUML.g:1091:1: entryRuleFloat returns [EObject current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final EObject entryRuleFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat = null;


        try {
            // InternalSmallUML.g:1091:46: (iv_ruleFloat= ruleFloat EOF )
            // InternalSmallUML.g:1092:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalSmallUML.g:1098:1: ruleFloat returns [EObject current=null] : (otherlv_0= 'Float' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' ) ;
    public final EObject ruleFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1104:2: ( (otherlv_0= 'Float' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' ) )
            // InternalSmallUML.g:1105:2: (otherlv_0= 'Float' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' )
            {
            // InternalSmallUML.g:1105:2: (otherlv_0= 'Float' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}' )
            // InternalSmallUML.g:1106:3: otherlv_0= 'Float' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEFloat ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFloatAccess().getFloatKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getFloatAccess().getValueKeyword_2());
            		
            // InternalSmallUML.g:1118:3: ( (lv_value_3_0= ruleEFloat ) )
            // InternalSmallUML.g:1119:4: (lv_value_3_0= ruleEFloat )
            {
            // InternalSmallUML.g:1119:4: (lv_value_3_0= ruleEFloat )
            // InternalSmallUML.g:1120:5: lv_value_3_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getFloatAccess().getValueEFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_3_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloatRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.smalluml.SmallUML.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFloatAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleInt0"
    // InternalSmallUML.g:1145:1: entryRuleInt0 returns [EObject current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final EObject entryRuleInt0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInt0 = null;


        try {
            // InternalSmallUML.g:1145:45: (iv_ruleInt0= ruleInt0 EOF )
            // InternalSmallUML.g:1146:2: iv_ruleInt0= ruleInt0 EOF
            {
             newCompositeNode(grammarAccess.getInt0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInt0=ruleInt0();

            state._fsp--;

             current =iv_ruleInt0; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // InternalSmallUML.g:1152:1: ruleInt0 returns [EObject current=null] : (otherlv_0= 'Int' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' ) ;
    public final EObject ruleInt0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1158:2: ( (otherlv_0= 'Int' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' ) )
            // InternalSmallUML.g:1159:2: (otherlv_0= 'Int' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' )
            {
            // InternalSmallUML.g:1159:2: (otherlv_0= 'Int' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' )
            // InternalSmallUML.g:1160:3: otherlv_0= 'Int' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInt0Access().getIntKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getInt0Access().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getInt0Access().getValueKeyword_2());
            		
            // InternalSmallUML.g:1172:3: ( (lv_value_3_0= ruleEInt ) )
            // InternalSmallUML.g:1173:4: (lv_value_3_0= ruleEInt )
            {
            // InternalSmallUML.g:1173:4: (lv_value_3_0= ruleEInt )
            // InternalSmallUML.g:1174:5: lv_value_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getInt0Access().getValueEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInt0Rule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.smalluml.SmallUML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInt0Access().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleBoolean"
    // InternalSmallUML.g:1199:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalSmallUML.g:1199:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalSmallUML.g:1200:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalSmallUML.g:1206:1: ruleBoolean returns [EObject current=null] : ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Boolean' ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1212:2: ( ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Boolean' ) )
            // InternalSmallUML.g:1213:2: ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Boolean' )
            {
            // InternalSmallUML.g:1213:2: ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Boolean' )
            // InternalSmallUML.g:1214:3: ( (lv_value_0_0= 'value' ) ) otherlv_1= 'Boolean'
            {
            // InternalSmallUML.g:1214:3: ( (lv_value_0_0= 'value' ) )
            // InternalSmallUML.g:1215:4: (lv_value_0_0= 'value' )
            {
            // InternalSmallUML.g:1215:4: (lv_value_0_0= 'value' )
            // InternalSmallUML.g:1216:5: lv_value_0_0= 'value'
            {
            lv_value_0_0=(Token)match(input,34,FOLLOW_29); 

            					newLeafNode(lv_value_0_0, grammarAccess.getBooleanAccess().getValueValueKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanRule());
            					}
            					setWithLastConsumed(current, "value", true, "value");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanAccess().getBooleanKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleString0"
    // InternalSmallUML.g:1236:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalSmallUML.g:1236:48: (iv_ruleString0= ruleString0 EOF )
            // InternalSmallUML.g:1237:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalSmallUML.g:1243:1: ruleString0 returns [EObject current=null] : (otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1249:2: ( (otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalSmallUML.g:1250:2: (otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalSmallUML.g:1250:2: (otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalSmallUML.g:1251:3: otherlv_0= 'String' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getString0Access().getStringKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getString0Access().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getString0Access().getValueKeyword_2());
            		
            // InternalSmallUML.g:1263:3: ( (lv_value_3_0= ruleEString ) )
            // InternalSmallUML.g:1264:4: (lv_value_3_0= ruleEString )
            {
            // InternalSmallUML.g:1264:4: (lv_value_3_0= ruleEString )
            // InternalSmallUML.g:1265:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getString0Access().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getString0Rule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getString0Access().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleEFloat"
    // InternalSmallUML.g:1290:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalSmallUML.g:1290:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalSmallUML.g:1291:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalSmallUML.g:1297:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1303:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalSmallUML.g:1304:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalSmallUML.g:1304:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalSmallUML.g:1305:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalSmallUML.g:1305:3: (kw= '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSmallUML.g:1306:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:1312:3: (this_INT_1= RULE_INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSmallUML.g:1313:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_31); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,39,FOLLOW_32); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_33); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalSmallUML.g:1333:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=40 && LA28_0<=41)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSmallUML.g:1334:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalSmallUML.g:1334:4: (kw= 'E' | kw= 'e' )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==40) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==41) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalSmallUML.g:1335:5: kw= 'E'
                            {
                            kw=(Token)match(input,40,FOLLOW_22); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSmallUML.g:1341:5: kw= 'e'
                            {
                            kw=(Token)match(input,41,FOLLOW_22); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSmallUML.g:1347:4: (kw= '-' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==38) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalSmallUML.g:1348:5: kw= '-'
                            {
                            kw=(Token)match(input,38,FOLLOW_32); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUML.g:1366:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmallUML.g:1366:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmallUML.g:1367:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSmallUML.g:1373:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1379:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmallUML.g:1380:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmallUML.g:1380:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmallUML.g:1381:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmallUML.g:1381:3: (kw= '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSmallUML.g:1382:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000E2000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000640000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000030000000002L});

}