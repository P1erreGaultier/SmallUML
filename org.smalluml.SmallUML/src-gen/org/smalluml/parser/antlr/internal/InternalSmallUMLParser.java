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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Diagram'", "'{'", "'assoc'", "','", "'}'", "'heritage'", "'class'", "'Association'", "'used'", "'user'", "'Heritage'", "'mother'", "'child'", "'Class'", "'method'", "'attribute'", "'Role'", "'upper'", "'lower'", "'-'", "'Method'", "'parameters'", "'return'", "'Type'", "'Float'", "'Int'", "'Boolean'", "'String'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
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
    // InternalSmallUML.g:71:1: ruleDiagram returns [EObject current=null] : ( () otherlv_1= 'Diagram' otherlv_2= '{' (otherlv_3= 'assoc' otherlv_4= '{' ( (lv_assoc_5_0= ruleAssociation ) ) (otherlv_6= ',' ( (lv_assoc_7_0= ruleAssociation ) ) )* otherlv_8= '}' )? (otherlv_9= 'heritage' otherlv_10= '{' ( (lv_heritage_11_0= ruleHeritage ) ) (otherlv_12= ',' ( (lv_heritage_13_0= ruleHeritage ) ) )* otherlv_14= '}' )? (otherlv_15= 'class' otherlv_16= '{' ( (lv_class_17_0= ruleClass ) ) (otherlv_18= ',' ( (lv_class_19_0= ruleClass ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
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
        EObject lv_assoc_5_0 = null;

        EObject lv_assoc_7_0 = null;

        EObject lv_heritage_11_0 = null;

        EObject lv_heritage_13_0 = null;

        EObject lv_class_17_0 = null;

        EObject lv_class_19_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:77:2: ( ( () otherlv_1= 'Diagram' otherlv_2= '{' (otherlv_3= 'assoc' otherlv_4= '{' ( (lv_assoc_5_0= ruleAssociation ) ) (otherlv_6= ',' ( (lv_assoc_7_0= ruleAssociation ) ) )* otherlv_8= '}' )? (otherlv_9= 'heritage' otherlv_10= '{' ( (lv_heritage_11_0= ruleHeritage ) ) (otherlv_12= ',' ( (lv_heritage_13_0= ruleHeritage ) ) )* otherlv_14= '}' )? (otherlv_15= 'class' otherlv_16= '{' ( (lv_class_17_0= ruleClass ) ) (otherlv_18= ',' ( (lv_class_19_0= ruleClass ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalSmallUML.g:78:2: ( () otherlv_1= 'Diagram' otherlv_2= '{' (otherlv_3= 'assoc' otherlv_4= '{' ( (lv_assoc_5_0= ruleAssociation ) ) (otherlv_6= ',' ( (lv_assoc_7_0= ruleAssociation ) ) )* otherlv_8= '}' )? (otherlv_9= 'heritage' otherlv_10= '{' ( (lv_heritage_11_0= ruleHeritage ) ) (otherlv_12= ',' ( (lv_heritage_13_0= ruleHeritage ) ) )* otherlv_14= '}' )? (otherlv_15= 'class' otherlv_16= '{' ( (lv_class_17_0= ruleClass ) ) (otherlv_18= ',' ( (lv_class_19_0= ruleClass ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalSmallUML.g:78:2: ( () otherlv_1= 'Diagram' otherlv_2= '{' (otherlv_3= 'assoc' otherlv_4= '{' ( (lv_assoc_5_0= ruleAssociation ) ) (otherlv_6= ',' ( (lv_assoc_7_0= ruleAssociation ) ) )* otherlv_8= '}' )? (otherlv_9= 'heritage' otherlv_10= '{' ( (lv_heritage_11_0= ruleHeritage ) ) (otherlv_12= ',' ( (lv_heritage_13_0= ruleHeritage ) ) )* otherlv_14= '}' )? (otherlv_15= 'class' otherlv_16= '{' ( (lv_class_17_0= ruleClass ) ) (otherlv_18= ',' ( (lv_class_19_0= ruleClass ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalSmallUML.g:79:3: () otherlv_1= 'Diagram' otherlv_2= '{' (otherlv_3= 'assoc' otherlv_4= '{' ( (lv_assoc_5_0= ruleAssociation ) ) (otherlv_6= ',' ( (lv_assoc_7_0= ruleAssociation ) ) )* otherlv_8= '}' )? (otherlv_9= 'heritage' otherlv_10= '{' ( (lv_heritage_11_0= ruleHeritage ) ) (otherlv_12= ',' ( (lv_heritage_13_0= ruleHeritage ) ) )* otherlv_14= '}' )? (otherlv_15= 'class' otherlv_16= '{' ( (lv_class_17_0= ruleClass ) ) (otherlv_18= ',' ( (lv_class_19_0= ruleClass ) ) )* otherlv_20= '}' )? otherlv_21= '}'
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
            		
            // InternalSmallUML.g:94:3: (otherlv_3= 'assoc' otherlv_4= '{' ( (lv_assoc_5_0= ruleAssociation ) ) (otherlv_6= ',' ( (lv_assoc_7_0= ruleAssociation ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmallUML.g:95:4: otherlv_3= 'assoc' otherlv_4= '{' ( (lv_assoc_5_0= ruleAssociation ) ) (otherlv_6= ',' ( (lv_assoc_7_0= ruleAssociation ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getDiagramAccess().getAssocKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSmallUML.g:103:4: ( (lv_assoc_5_0= ruleAssociation ) )
                    // InternalSmallUML.g:104:5: (lv_assoc_5_0= ruleAssociation )
                    {
                    // InternalSmallUML.g:104:5: (lv_assoc_5_0= ruleAssociation )
                    // InternalSmallUML.g:105:6: lv_assoc_5_0= ruleAssociation
                    {

                    						newCompositeNode(grammarAccess.getDiagramAccess().getAssocAssociationParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_assoc_5_0=ruleAssociation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDiagramRule());
                    						}
                    						add(
                    							current,
                    							"assoc",
                    							lv_assoc_5_0,
                    							"org.smalluml.SmallUML.Association");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:122:4: (otherlv_6= ',' ( (lv_assoc_7_0= ruleAssociation ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSmallUML.g:123:5: otherlv_6= ',' ( (lv_assoc_7_0= ruleAssociation ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDiagramAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSmallUML.g:127:5: ( (lv_assoc_7_0= ruleAssociation ) )
                    	    // InternalSmallUML.g:128:6: (lv_assoc_7_0= ruleAssociation )
                    	    {
                    	    // InternalSmallUML.g:128:6: (lv_assoc_7_0= ruleAssociation )
                    	    // InternalSmallUML.g:129:7: lv_assoc_7_0= ruleAssociation
                    	    {

                    	    							newCompositeNode(grammarAccess.getDiagramAccess().getAssocAssociationParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_assoc_7_0=ruleAssociation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDiagramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assoc",
                    	    								lv_assoc_7_0,
                    	    								"org.smalluml.SmallUML.Association");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:152:3: (otherlv_9= 'heritage' otherlv_10= '{' ( (lv_heritage_11_0= ruleHeritage ) ) (otherlv_12= ',' ( (lv_heritage_13_0= ruleHeritage ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUML.g:153:4: otherlv_9= 'heritage' otherlv_10= '{' ( (lv_heritage_11_0= ruleHeritage ) ) (otherlv_12= ',' ( (lv_heritage_13_0= ruleHeritage ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getDiagramAccess().getHeritageKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSmallUML.g:161:4: ( (lv_heritage_11_0= ruleHeritage ) )
                    // InternalSmallUML.g:162:5: (lv_heritage_11_0= ruleHeritage )
                    {
                    // InternalSmallUML.g:162:5: (lv_heritage_11_0= ruleHeritage )
                    // InternalSmallUML.g:163:6: lv_heritage_11_0= ruleHeritage
                    {

                    						newCompositeNode(grammarAccess.getDiagramAccess().getHeritageHeritageParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_heritage_11_0=ruleHeritage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDiagramRule());
                    						}
                    						add(
                    							current,
                    							"heritage",
                    							lv_heritage_11_0,
                    							"org.smalluml.SmallUML.Heritage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:180:4: (otherlv_12= ',' ( (lv_heritage_13_0= ruleHeritage ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSmallUML.g:181:5: otherlv_12= ',' ( (lv_heritage_13_0= ruleHeritage ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDiagramAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmallUML.g:185:5: ( (lv_heritage_13_0= ruleHeritage ) )
                    	    // InternalSmallUML.g:186:6: (lv_heritage_13_0= ruleHeritage )
                    	    {
                    	    // InternalSmallUML.g:186:6: (lv_heritage_13_0= ruleHeritage )
                    	    // InternalSmallUML.g:187:7: lv_heritage_13_0= ruleHeritage
                    	    {

                    	    							newCompositeNode(grammarAccess.getDiagramAccess().getHeritageHeritageParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_heritage_13_0=ruleHeritage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDiagramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"heritage",
                    	    								lv_heritage_13_0,
                    	    								"org.smalluml.SmallUML.Heritage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:210:3: (otherlv_15= 'class' otherlv_16= '{' ( (lv_class_17_0= ruleClass ) ) (otherlv_18= ',' ( (lv_class_19_0= ruleClass ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallUML.g:211:4: otherlv_15= 'class' otherlv_16= '{' ( (lv_class_17_0= ruleClass ) ) (otherlv_18= ',' ( (lv_class_19_0= ruleClass ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getDiagramAccess().getClassKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUML.g:219:4: ( (lv_class_17_0= ruleClass ) )
                    // InternalSmallUML.g:220:5: (lv_class_17_0= ruleClass )
                    {
                    // InternalSmallUML.g:220:5: (lv_class_17_0= ruleClass )
                    // InternalSmallUML.g:221:6: lv_class_17_0= ruleClass
                    {

                    						newCompositeNode(grammarAccess.getDiagramAccess().getClassClassParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_class_17_0=ruleClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDiagramRule());
                    						}
                    						add(
                    							current,
                    							"class",
                    							lv_class_17_0,
                    							"org.smalluml.SmallUML.Class");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:238:4: (otherlv_18= ',' ( (lv_class_19_0= ruleClass ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSmallUML.g:239:5: otherlv_18= ',' ( (lv_class_19_0= ruleClass ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDiagramAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:243:5: ( (lv_class_19_0= ruleClass ) )
                    	    // InternalSmallUML.g:244:6: (lv_class_19_0= ruleClass )
                    	    {
                    	    // InternalSmallUML.g:244:6: (lv_class_19_0= ruleClass )
                    	    // InternalSmallUML.g:245:7: lv_class_19_0= ruleClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getDiagramAccess().getClassClassParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_class_19_0=ruleClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDiagramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"class",
                    	    								lv_class_19_0,
                    	    								"org.smalluml.SmallUML.Class");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleType"
    // InternalSmallUML.g:276:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSmallUML.g:276:45: (iv_ruleType= ruleType EOF )
            // InternalSmallUML.g:277:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmallUML.g:283:1: ruleType returns [EObject current=null] : (this_Type_Impl_0= ruleType_Impl | this_Float_1= ruleFloat | this_Int0_2= ruleInt0 | this_Boolean_3= ruleBoolean | this_String0_4= ruleString0 ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_Impl_0 = null;

        EObject this_Float_1 = null;

        EObject this_Int0_2 = null;

        EObject this_Boolean_3 = null;

        EObject this_String0_4 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:289:2: ( (this_Type_Impl_0= ruleType_Impl | this_Float_1= ruleFloat | this_Int0_2= ruleInt0 | this_Boolean_3= ruleBoolean | this_String0_4= ruleString0 ) )
            // InternalSmallUML.g:290:2: (this_Type_Impl_0= ruleType_Impl | this_Float_1= ruleFloat | this_Int0_2= ruleInt0 | this_Boolean_3= ruleBoolean | this_String0_4= ruleString0 )
            {
            // InternalSmallUML.g:290:2: (this_Type_Impl_0= ruleType_Impl | this_Float_1= ruleFloat | this_Int0_2= ruleInt0 | this_Boolean_3= ruleBoolean | this_String0_4= ruleString0 )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt7=1;
                }
                break;
            case 35:
                {
                alt7=2;
                }
                break;
            case 36:
                {
                alt7=3;
                }
                break;
            case 37:
                {
                alt7=4;
                }
                break;
            case 38:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSmallUML.g:291:3: this_Type_Impl_0= ruleType_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_Impl_0=ruleType_Impl();

                    state._fsp--;


                    			current = this_Type_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:300:3: this_Float_1= ruleFloat
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getFloatParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Float_1=ruleFloat();

                    state._fsp--;


                    			current = this_Float_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmallUML.g:309:3: this_Int0_2= ruleInt0
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getInt0ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Int0_2=ruleInt0();

                    state._fsp--;


                    			current = this_Int0_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSmallUML.g:318:3: this_Boolean_3= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBooleanParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_3=ruleBoolean();

                    state._fsp--;


                    			current = this_Boolean_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSmallUML.g:327:3: this_String0_4= ruleString0
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getString0ParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_String0_4=ruleString0();

                    state._fsp--;


                    			current = this_String0_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleAssociation"
    // InternalSmallUML.g:339:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalSmallUML.g:339:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalSmallUML.g:340:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalSmallUML.g:346:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'used' ( (lv_used_4_0= ruleRole ) ) otherlv_5= 'user' ( (lv_user_6_0= ruleRole ) ) otherlv_7= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_used_4_0 = null;

        EObject lv_user_6_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:352:2: ( (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'used' ( (lv_used_4_0= ruleRole ) ) otherlv_5= 'user' ( (lv_user_6_0= ruleRole ) ) otherlv_7= '}' ) )
            // InternalSmallUML.g:353:2: (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'used' ( (lv_used_4_0= ruleRole ) ) otherlv_5= 'user' ( (lv_user_6_0= ruleRole ) ) otherlv_7= '}' )
            {
            // InternalSmallUML.g:353:2: (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'used' ( (lv_used_4_0= ruleRole ) ) otherlv_5= 'user' ( (lv_user_6_0= ruleRole ) ) otherlv_7= '}' )
            // InternalSmallUML.g:354:3: otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'used' ( (lv_used_4_0= ruleRole ) ) otherlv_5= 'user' ( (lv_user_6_0= ruleRole ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getAssociationKeyword_0());
            		
            // InternalSmallUML.g:358:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:359:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:359:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:360:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getUsedKeyword_3());
            		
            // InternalSmallUML.g:385:3: ( (lv_used_4_0= ruleRole ) )
            // InternalSmallUML.g:386:4: (lv_used_4_0= ruleRole )
            {
            // InternalSmallUML.g:386:4: (lv_used_4_0= ruleRole )
            // InternalSmallUML.g:387:5: lv_used_4_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getUsedRoleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_used_4_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"used",
            						lv_used_4_0,
            						"org.smalluml.SmallUML.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getUserKeyword_5());
            		
            // InternalSmallUML.g:408:3: ( (lv_user_6_0= ruleRole ) )
            // InternalSmallUML.g:409:4: (lv_user_6_0= ruleRole )
            {
            // InternalSmallUML.g:409:4: (lv_user_6_0= ruleRole )
            // InternalSmallUML.g:410:5: lv_user_6_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getUserRoleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_user_6_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"user",
            						lv_user_6_0,
            						"org.smalluml.SmallUML.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalSmallUML.g:435:1: entryRuleHeritage returns [EObject current=null] : iv_ruleHeritage= ruleHeritage EOF ;
    public final EObject entryRuleHeritage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeritage = null;


        try {
            // InternalSmallUML.g:435:49: (iv_ruleHeritage= ruleHeritage EOF )
            // InternalSmallUML.g:436:2: iv_ruleHeritage= ruleHeritage EOF
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
    // InternalSmallUML.g:442:1: ruleHeritage returns [EObject current=null] : (otherlv_0= 'Heritage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mother' ( (lv_mother_4_0= ruleRole ) ) otherlv_5= 'child' ( (lv_child_6_0= ruleRole ) ) otherlv_7= '}' ) ;
    public final EObject ruleHeritage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_mother_4_0 = null;

        EObject lv_child_6_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:448:2: ( (otherlv_0= 'Heritage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mother' ( (lv_mother_4_0= ruleRole ) ) otherlv_5= 'child' ( (lv_child_6_0= ruleRole ) ) otherlv_7= '}' ) )
            // InternalSmallUML.g:449:2: (otherlv_0= 'Heritage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mother' ( (lv_mother_4_0= ruleRole ) ) otherlv_5= 'child' ( (lv_child_6_0= ruleRole ) ) otherlv_7= '}' )
            {
            // InternalSmallUML.g:449:2: (otherlv_0= 'Heritage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mother' ( (lv_mother_4_0= ruleRole ) ) otherlv_5= 'child' ( (lv_child_6_0= ruleRole ) ) otherlv_7= '}' )
            // InternalSmallUML.g:450:3: otherlv_0= 'Heritage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'mother' ( (lv_mother_4_0= ruleRole ) ) otherlv_5= 'child' ( (lv_child_6_0= ruleRole ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getHeritageAccess().getHeritageKeyword_0());
            		
            // InternalSmallUML.g:454:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:455:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:455:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:456:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getHeritageAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getHeritageAccess().getMotherKeyword_3());
            		
            // InternalSmallUML.g:481:3: ( (lv_mother_4_0= ruleRole ) )
            // InternalSmallUML.g:482:4: (lv_mother_4_0= ruleRole )
            {
            // InternalSmallUML.g:482:4: (lv_mother_4_0= ruleRole )
            // InternalSmallUML.g:483:5: lv_mother_4_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getHeritageAccess().getMotherRoleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_mother_4_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeritageRule());
            					}
            					set(
            						current,
            						"mother",
            						lv_mother_4_0,
            						"org.smalluml.SmallUML.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getHeritageAccess().getChildKeyword_5());
            		
            // InternalSmallUML.g:504:3: ( (lv_child_6_0= ruleRole ) )
            // InternalSmallUML.g:505:4: (lv_child_6_0= ruleRole )
            {
            // InternalSmallUML.g:505:4: (lv_child_6_0= ruleRole )
            // InternalSmallUML.g:506:5: lv_child_6_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getHeritageAccess().getChildRoleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_child_6_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeritageRule());
            					}
            					set(
            						current,
            						"child",
            						lv_child_6_0,
            						"org.smalluml.SmallUML.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getHeritageAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleClass"
    // InternalSmallUML.g:531:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalSmallUML.g:531:46: (iv_ruleClass= ruleClass EOF )
            // InternalSmallUML.g:532:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalSmallUML.g:538:1: ruleClass returns [EObject current=null] : ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'method' otherlv_5= '{' ( (lv_method_6_0= ruleMethod ) ) (otherlv_7= ',' ( (lv_method_8_0= ruleMethod ) ) )* otherlv_9= '}' )? (otherlv_10= 'attribute' otherlv_11= '{' ( (lv_attribute_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_attribute_14_0= ruleType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
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

        EObject lv_method_6_0 = null;

        EObject lv_method_8_0 = null;

        EObject lv_attribute_12_0 = null;

        EObject lv_attribute_14_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:544:2: ( ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'method' otherlv_5= '{' ( (lv_method_6_0= ruleMethod ) ) (otherlv_7= ',' ( (lv_method_8_0= ruleMethod ) ) )* otherlv_9= '}' )? (otherlv_10= 'attribute' otherlv_11= '{' ( (lv_attribute_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_attribute_14_0= ruleType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalSmallUML.g:545:2: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'method' otherlv_5= '{' ( (lv_method_6_0= ruleMethod ) ) (otherlv_7= ',' ( (lv_method_8_0= ruleMethod ) ) )* otherlv_9= '}' )? (otherlv_10= 'attribute' otherlv_11= '{' ( (lv_attribute_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_attribute_14_0= ruleType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalSmallUML.g:545:2: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'method' otherlv_5= '{' ( (lv_method_6_0= ruleMethod ) ) (otherlv_7= ',' ( (lv_method_8_0= ruleMethod ) ) )* otherlv_9= '}' )? (otherlv_10= 'attribute' otherlv_11= '{' ( (lv_attribute_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_attribute_14_0= ruleType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalSmallUML.g:546:3: () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'method' otherlv_5= '{' ( (lv_method_6_0= ruleMethod ) ) (otherlv_7= ',' ( (lv_method_8_0= ruleMethod ) ) )* otherlv_9= '}' )? (otherlv_10= 'attribute' otherlv_11= '{' ( (lv_attribute_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_attribute_14_0= ruleType ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalSmallUML.g:546:3: ()
            // InternalSmallUML.g:547:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalSmallUML.g:557:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:558:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:558:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:559:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:580:3: (otherlv_4= 'method' otherlv_5= '{' ( (lv_method_6_0= ruleMethod ) ) (otherlv_7= ',' ( (lv_method_8_0= ruleMethod ) ) )* otherlv_9= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUML.g:581:4: otherlv_4= 'method' otherlv_5= '{' ( (lv_method_6_0= ruleMethod ) ) (otherlv_7= ',' ( (lv_method_8_0= ruleMethod ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getMethodKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSmallUML.g:589:4: ( (lv_method_6_0= ruleMethod ) )
                    // InternalSmallUML.g:590:5: (lv_method_6_0= ruleMethod )
                    {
                    // InternalSmallUML.g:590:5: (lv_method_6_0= ruleMethod )
                    // InternalSmallUML.g:591:6: lv_method_6_0= ruleMethod
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getMethodMethodParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_method_6_0=ruleMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"method",
                    							lv_method_6_0,
                    							"org.smalluml.SmallUML.Method");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:608:4: (otherlv_7= ',' ( (lv_method_8_0= ruleMethod ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSmallUML.g:609:5: otherlv_7= ',' ( (lv_method_8_0= ruleMethod ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmallUML.g:613:5: ( (lv_method_8_0= ruleMethod ) )
                    	    // InternalSmallUML.g:614:6: (lv_method_8_0= ruleMethod )
                    	    {
                    	    // InternalSmallUML.g:614:6: (lv_method_8_0= ruleMethod )
                    	    // InternalSmallUML.g:615:7: lv_method_8_0= ruleMethod
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getMethodMethodParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_method_8_0=ruleMethod();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"method",
                    	    								lv_method_8_0,
                    	    								"org.smalluml.SmallUML.Method");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:638:3: (otherlv_10= 'attribute' otherlv_11= '{' ( (lv_attribute_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_attribute_14_0= ruleType ) ) )* otherlv_15= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUML.g:639:4: otherlv_10= 'attribute' otherlv_11= '{' ( (lv_attribute_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_attribute_14_0= ruleType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getClassAccess().getAttributeKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUML.g:647:4: ( (lv_attribute_12_0= ruleType ) )
                    // InternalSmallUML.g:648:5: (lv_attribute_12_0= ruleType )
                    {
                    // InternalSmallUML.g:648:5: (lv_attribute_12_0= ruleType )
                    // InternalSmallUML.g:649:6: lv_attribute_12_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributeTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_attribute_12_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"attribute",
                    							lv_attribute_12_0,
                    							"org.smalluml.SmallUML.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:666:4: (otherlv_13= ',' ( (lv_attribute_14_0= ruleType ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSmallUML.g:667:5: otherlv_13= ',' ( (lv_attribute_14_0= ruleType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:671:5: ( (lv_attribute_14_0= ruleType ) )
                    	    // InternalSmallUML.g:672:6: (lv_attribute_14_0= ruleType )
                    	    {
                    	    // InternalSmallUML.g:672:6: (lv_attribute_14_0= ruleType )
                    	    // InternalSmallUML.g:673:7: lv_attribute_14_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAttributeTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_attribute_14_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_14_0,
                    	    								"org.smalluml.SmallUML.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:704:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUML.g:704:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUML.g:705:2: iv_ruleEString= ruleEString EOF
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
    // InternalSmallUML.g:711:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:717:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUML.g:718:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUML.g:718:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmallUML.g:719:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:727:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleRole"
    // InternalSmallUML.g:738:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSmallUML.g:738:45: (iv_ruleRole= ruleRole EOF )
            // InternalSmallUML.g:739:2: iv_ruleRole= ruleRole EOF
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
    // InternalSmallUML.g:745:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upper' ( (lv_upper_4_0= ruleEInt ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleEInt ) ) otherlv_7= 'class' ( (lv_class_8_0= ruleClass ) ) otherlv_9= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_upper_4_0 = null;

        AntlrDatatypeRuleToken lv_lower_6_0 = null;

        EObject lv_class_8_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:751:2: ( (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upper' ( (lv_upper_4_0= ruleEInt ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleEInt ) ) otherlv_7= 'class' ( (lv_class_8_0= ruleClass ) ) otherlv_9= '}' ) )
            // InternalSmallUML.g:752:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upper' ( (lv_upper_4_0= ruleEInt ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleEInt ) ) otherlv_7= 'class' ( (lv_class_8_0= ruleClass ) ) otherlv_9= '}' )
            {
            // InternalSmallUML.g:752:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upper' ( (lv_upper_4_0= ruleEInt ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleEInt ) ) otherlv_7= 'class' ( (lv_class_8_0= ruleClass ) ) otherlv_9= '}' )
            // InternalSmallUML.g:753:3: otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upper' ( (lv_upper_4_0= ruleEInt ) ) otherlv_5= 'lower' ( (lv_lower_6_0= ruleEInt ) ) otherlv_7= 'class' ( (lv_class_8_0= ruleClass ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalSmallUML.g:757:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:758:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:758:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:759:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getUpperKeyword_3());
            		
            // InternalSmallUML.g:784:3: ( (lv_upper_4_0= ruleEInt ) )
            // InternalSmallUML.g:785:4: (lv_upper_4_0= ruleEInt )
            {
            // InternalSmallUML.g:785:4: (lv_upper_4_0= ruleEInt )
            // InternalSmallUML.g:786:5: lv_upper_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getUpperEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_5=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getLowerKeyword_5());
            		
            // InternalSmallUML.g:807:3: ( (lv_lower_6_0= ruleEInt ) )
            // InternalSmallUML.g:808:4: (lv_lower_6_0= ruleEInt )
            {
            // InternalSmallUML.g:808:4: (lv_lower_6_0= ruleEInt )
            // InternalSmallUML.g:809:5: lv_lower_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getLowerEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_7=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getClassKeyword_7());
            		
            // InternalSmallUML.g:830:3: ( (lv_class_8_0= ruleClass ) )
            // InternalSmallUML.g:831:4: (lv_class_8_0= ruleClass )
            {
            // InternalSmallUML.g:831:4: (lv_class_8_0= ruleClass )
            // InternalSmallUML.g:832:5: lv_class_8_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getClassClassParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_class_8_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"class",
            						lv_class_8_0,
            						"org.smalluml.SmallUML.Class");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUML.g:857:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmallUML.g:857:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmallUML.g:858:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSmallUML.g:864:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:870:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmallUML.g:871:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmallUML.g:871:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmallUML.g:872:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmallUML.g:872:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmallUML.g:873:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_26); 

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


    // $ANTLR start "entryRuleMethod"
    // InternalSmallUML.g:890:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalSmallUML.g:890:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalSmallUML.g:891:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalSmallUML.g:897:1: ruleMethod returns [EObject current=null] : ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleType ) ) )* otherlv_9= '}' )? (otherlv_10= 'return' ( (lv_return_11_0= ruleType ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_return_11_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:903:2: ( ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleType ) ) )* otherlv_9= '}' )? (otherlv_10= 'return' ( (lv_return_11_0= ruleType ) ) )? otherlv_12= '}' ) )
            // InternalSmallUML.g:904:2: ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleType ) ) )* otherlv_9= '}' )? (otherlv_10= 'return' ( (lv_return_11_0= ruleType ) ) )? otherlv_12= '}' )
            {
            // InternalSmallUML.g:904:2: ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleType ) ) )* otherlv_9= '}' )? (otherlv_10= 'return' ( (lv_return_11_0= ruleType ) ) )? otherlv_12= '}' )
            // InternalSmallUML.g:905:3: () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleType ) ) )* otherlv_9= '}' )? (otherlv_10= 'return' ( (lv_return_11_0= ruleType ) ) )? otherlv_12= '}'
            {
            // InternalSmallUML.g:905:3: ()
            // InternalSmallUML.g:906:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getMethodKeyword_1());
            		
            // InternalSmallUML.g:916:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:917:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:917:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:918:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:939:3: (otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleType ) ) )* otherlv_9= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmallUML.g:940:4: otherlv_4= 'parameters' otherlv_5= '{' ( (lv_parameters_6_0= ruleType ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleType ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getParametersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSmallUML.g:948:4: ( (lv_parameters_6_0= ruleType ) )
                    // InternalSmallUML.g:949:5: (lv_parameters_6_0= ruleType )
                    {
                    // InternalSmallUML.g:949:5: (lv_parameters_6_0= ruleType )
                    // InternalSmallUML.g:950:6: lv_parameters_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getParametersTypeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_parameters_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_6_0,
                    							"org.smalluml.SmallUML.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:967:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleType ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSmallUML.g:968:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleType ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSmallUML.g:972:5: ( (lv_parameters_8_0= ruleType ) )
                    	    // InternalSmallUML.g:973:6: (lv_parameters_8_0= ruleType )
                    	    {
                    	    // InternalSmallUML.g:973:6: (lv_parameters_8_0= ruleType )
                    	    // InternalSmallUML.g:974:7: lv_parameters_8_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getParametersTypeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameters_8_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_8_0,
                    	    								"org.smalluml.SmallUML.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_28); 

                    				newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:997:3: (otherlv_10= 'return' ( (lv_return_11_0= ruleType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmallUML.g:998:4: otherlv_10= 'return' ( (lv_return_11_0= ruleType ) )
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getReturnKeyword_5_0());
                    			
                    // InternalSmallUML.g:1002:4: ( (lv_return_11_0= ruleType ) )
                    // InternalSmallUML.g:1003:5: (lv_return_11_0= ruleType )
                    {
                    // InternalSmallUML.g:1003:5: (lv_return_11_0= ruleType )
                    // InternalSmallUML.g:1004:6: lv_return_11_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_return_11_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						set(
                    							current,
                    							"return",
                    							lv_return_11_0,
                    							"org.smalluml.SmallUML.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleType_Impl"
    // InternalSmallUML.g:1030:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalSmallUML.g:1030:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalSmallUML.g:1031:2: iv_ruleType_Impl= ruleType_Impl EOF
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
    // InternalSmallUML.g:1037:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1043:2: ( ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUML.g:1044:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUML.g:1044:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUML.g:1045:3: () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUML.g:1045:3: ()
            // InternalSmallUML.g:1046:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getType_ImplAccess().getTypeKeyword_1());
            		
            // InternalSmallUML.g:1056:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:1057:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:1057:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:1058:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleFloat"
    // InternalSmallUML.g:1079:1: entryRuleFloat returns [EObject current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final EObject entryRuleFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat = null;


        try {
            // InternalSmallUML.g:1079:46: (iv_ruleFloat= ruleFloat EOF )
            // InternalSmallUML.g:1080:2: iv_ruleFloat= ruleFloat EOF
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
    // InternalSmallUML.g:1086:1: ruleFloat returns [EObject current=null] : ( () otherlv_1= 'Float' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1092:2: ( ( () otherlv_1= 'Float' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUML.g:1093:2: ( () otherlv_1= 'Float' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUML.g:1093:2: ( () otherlv_1= 'Float' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUML.g:1094:3: () otherlv_1= 'Float' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUML.g:1094:3: ()
            // InternalSmallUML.g:1095:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatAccess().getFloatAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatAccess().getFloatKeyword_1());
            		
            // InternalSmallUML.g:1105:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:1106:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:1106:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:1107:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFloatAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloatRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleInt0"
    // InternalSmallUML.g:1128:1: entryRuleInt0 returns [EObject current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final EObject entryRuleInt0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInt0 = null;


        try {
            // InternalSmallUML.g:1128:45: (iv_ruleInt0= ruleInt0 EOF )
            // InternalSmallUML.g:1129:2: iv_ruleInt0= ruleInt0 EOF
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
    // InternalSmallUML.g:1135:1: ruleInt0 returns [EObject current=null] : ( () otherlv_1= 'Int' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInt0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1141:2: ( ( () otherlv_1= 'Int' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUML.g:1142:2: ( () otherlv_1= 'Int' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUML.g:1142:2: ( () otherlv_1= 'Int' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUML.g:1143:3: () otherlv_1= 'Int' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUML.g:1143:3: ()
            // InternalSmallUML.g:1144:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt0Access().getIntAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getInt0Access().getIntKeyword_1());
            		
            // InternalSmallUML.g:1154:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:1155:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:1155:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:1156:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInt0Access().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInt0Rule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleBoolean"
    // InternalSmallUML.g:1177:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalSmallUML.g:1177:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalSmallUML.g:1178:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalSmallUML.g:1184:1: ruleBoolean returns [EObject current=null] : ( () otherlv_1= 'Boolean' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1190:2: ( ( () otherlv_1= 'Boolean' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUML.g:1191:2: ( () otherlv_1= 'Boolean' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUML.g:1191:2: ( () otherlv_1= 'Boolean' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUML.g:1192:3: () otherlv_1= 'Boolean' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUML.g:1192:3: ()
            // InternalSmallUML.g:1193:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanAccess().getBooleanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanAccess().getBooleanKeyword_1());
            		
            // InternalSmallUML.g:1203:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:1204:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:1204:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:1205:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleString0"
    // InternalSmallUML.g:1226:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalSmallUML.g:1226:48: (iv_ruleString0= ruleString0 EOF )
            // InternalSmallUML.g:1227:2: iv_ruleString0= ruleString0 EOF
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
    // InternalSmallUML.g:1233:1: ruleString0 returns [EObject current=null] : ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1239:2: ( ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUML.g:1240:2: ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUML.g:1240:2: ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUML.g:1241:3: () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUML.g:1241:3: ()
            // InternalSmallUML.g:1242:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
            		
            // InternalSmallUML.g:1252:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:1253:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:1253:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:1254:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getString0Access().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getString0Rule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleString0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000300008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200008000L});

}