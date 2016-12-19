package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Association'", "'{'", "'used'", "'user'", "'}'", "'-'", "'Type'", "'Float'", "'value'", "'Int'", "'Boolean'", "'String'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAssociation"
    // InternalMyDsl.g:53:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleAssociation EOF )
            // InternalMyDsl.g:55:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalMyDsl.g:62:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Association__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Association__Group__0 )
            // InternalMyDsl.g:69:4: rule__Association__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:78:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEInt EOF )
            // InternalMyDsl.g:80:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:87:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:94:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleEString EOF )
            // InternalMyDsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleType_Impl"
    // InternalMyDsl.g:128:1: entryRuleType_Impl : ruleType_Impl EOF ;
    public final void entryRuleType_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleType_Impl EOF )
            // InternalMyDsl.g:130:1: ruleType_Impl EOF
            {
             before(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleType_Impl();

            state._fsp--;

             after(grammarAccess.getType_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalMyDsl.g:137:1: ruleType_Impl : ( ( rule__Type_Impl__Group__0 ) ) ;
    public final void ruleType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Type_Impl__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Type_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Type_Impl__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Type_Impl__Group__0 )
            {
             before(grammarAccess.getType_ImplAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Type_Impl__Group__0 )
            // InternalMyDsl.g:144:4: rule__Type_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleFloat"
    // InternalMyDsl.g:153:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleFloat EOF )
            // InternalMyDsl.g:155:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalMyDsl.g:162:1: ruleFloat : ( ( rule__Float__Group__0 ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Float__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Float__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Float__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Float__Group__0 )
            {
             before(grammarAccess.getFloatAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Float__Group__0 )
            // InternalMyDsl.g:169:4: rule__Float__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleInt0"
    // InternalMyDsl.g:178:1: entryRuleInt0 : ruleInt0 EOF ;
    public final void entryRuleInt0() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleInt0 EOF )
            // InternalMyDsl.g:180:1: ruleInt0 EOF
            {
             before(grammarAccess.getInt0Rule()); 
            pushFollow(FOLLOW_1);
            ruleInt0();

            state._fsp--;

             after(grammarAccess.getInt0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // InternalMyDsl.g:187:1: ruleInt0 : ( ( rule__Int0__Group__0 ) ) ;
    public final void ruleInt0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Int0__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Int0__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Int0__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Int0__Group__0 )
            {
             before(grammarAccess.getInt0Access().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Int0__Group__0 )
            // InternalMyDsl.g:194:4: rule__Int0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt0Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleBoolean"
    // InternalMyDsl.g:203:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleBoolean EOF )
            // InternalMyDsl.g:205:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalMyDsl.g:212:1: ruleBoolean : ( ( rule__Boolean__Group__0 ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Boolean__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Boolean__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Boolean__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Boolean__Group__0 )
            {
             before(grammarAccess.getBooleanAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Boolean__Group__0 )
            // InternalMyDsl.g:219:4: rule__Boolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleString0"
    // InternalMyDsl.g:228:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleString0 EOF )
            // InternalMyDsl.g:230:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalMyDsl.g:237:1: ruleString0 : ( ( rule__String0__Group__0 ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__String0__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__String0__Group__0 )
            // InternalMyDsl.g:244:4: rule__String0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleEFloat"
    // InternalMyDsl.g:253:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleEFloat EOF )
            // InternalMyDsl.g:255:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalMyDsl.g:262:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__EFloat__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__EFloat__Group__0 )
            // InternalMyDsl.g:269:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:277:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:282:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:282:2: ( RULE_STRING )
                    // InternalMyDsl.g:283:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:288:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:288:2: ( RULE_ID )
                    // InternalMyDsl.g:289:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalMyDsl.g:298:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:302:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:303:2: ( 'E' )
                    {
                    // InternalMyDsl.g:303:2: ( 'E' )
                    // InternalMyDsl.g:304:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:309:2: ( 'e' )
                    {
                    // InternalMyDsl.g:309:2: ( 'e' )
                    // InternalMyDsl.g:310:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__Association__Group__0"
    // InternalMyDsl.g:319:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:323:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalMyDsl.g:324:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // InternalMyDsl.g:331:1: rule__Association__Group__0__Impl : ( 'Association' ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:335:1: ( ( 'Association' ) )
            // InternalMyDsl.g:336:1: ( 'Association' )
            {
            // InternalMyDsl.g:336:1: ( 'Association' )
            // InternalMyDsl.g:337:2: 'Association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getAssociationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // InternalMyDsl.g:346:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:350:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalMyDsl.g:351:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // InternalMyDsl.g:358:1: rule__Association__Group__1__Impl : ( '{' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:362:1: ( ( '{' ) )
            // InternalMyDsl.g:363:1: ( '{' )
            {
            // InternalMyDsl.g:363:1: ( '{' )
            // InternalMyDsl.g:364:2: '{'
            {
             before(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // InternalMyDsl.g:373:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:377:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalMyDsl.g:378:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // InternalMyDsl.g:385:1: rule__Association__Group__2__Impl : ( 'used' ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( ( 'used' ) )
            // InternalMyDsl.g:390:1: ( 'used' )
            {
            // InternalMyDsl.g:390:1: ( 'used' )
            // InternalMyDsl.g:391:2: 'used'
            {
             before(grammarAccess.getAssociationAccess().getUsedKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getUsedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // InternalMyDsl.g:400:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:404:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalMyDsl.g:405:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // InternalMyDsl.g:412:1: rule__Association__Group__3__Impl : ( ( rule__Association__UsedAssignment_3 ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:1: ( ( ( rule__Association__UsedAssignment_3 ) ) )
            // InternalMyDsl.g:417:1: ( ( rule__Association__UsedAssignment_3 ) )
            {
            // InternalMyDsl.g:417:1: ( ( rule__Association__UsedAssignment_3 ) )
            // InternalMyDsl.g:418:2: ( rule__Association__UsedAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getUsedAssignment_3()); 
            // InternalMyDsl.g:419:2: ( rule__Association__UsedAssignment_3 )
            // InternalMyDsl.g:419:3: rule__Association__UsedAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Association__UsedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getUsedAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // InternalMyDsl.g:427:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // InternalMyDsl.g:432:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Association__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // InternalMyDsl.g:439:1: rule__Association__Group__4__Impl : ( 'user' ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( ( 'user' ) )
            // InternalMyDsl.g:444:1: ( 'user' )
            {
            // InternalMyDsl.g:444:1: ( 'user' )
            // InternalMyDsl.g:445:2: 'user'
            {
             before(grammarAccess.getAssociationAccess().getUserKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getUserKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Association__Group__5"
    // InternalMyDsl.g:454:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // InternalMyDsl.g:459:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Association__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5"


    // $ANTLR start "rule__Association__Group__5__Impl"
    // InternalMyDsl.g:466:1: rule__Association__Group__5__Impl : ( ( rule__Association__UserAssignment_5 ) ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:470:1: ( ( ( rule__Association__UserAssignment_5 ) ) )
            // InternalMyDsl.g:471:1: ( ( rule__Association__UserAssignment_5 ) )
            {
            // InternalMyDsl.g:471:1: ( ( rule__Association__UserAssignment_5 ) )
            // InternalMyDsl.g:472:2: ( rule__Association__UserAssignment_5 )
            {
             before(grammarAccess.getAssociationAccess().getUserAssignment_5()); 
            // InternalMyDsl.g:473:2: ( rule__Association__UserAssignment_5 )
            // InternalMyDsl.g:473:3: rule__Association__UserAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Association__UserAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getUserAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5__Impl"


    // $ANTLR start "rule__Association__Group__6"
    // InternalMyDsl.g:481:1: rule__Association__Group__6 : rule__Association__Group__6__Impl ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:485:1: ( rule__Association__Group__6__Impl )
            // InternalMyDsl.g:486:2: rule__Association__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6"


    // $ANTLR start "rule__Association__Group__6__Impl"
    // InternalMyDsl.g:492:1: rule__Association__Group__6__Impl : ( '}' ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:496:1: ( ( '}' ) )
            // InternalMyDsl.g:497:1: ( '}' )
            {
            // InternalMyDsl.g:497:1: ( '}' )
            // InternalMyDsl.g:498:2: '}'
            {
             before(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:508:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:512:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:513:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:520:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:524:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:525:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:525:1: ( ( '-' )? )
            // InternalMyDsl.g:526:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:527:2: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:527:3: '-'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:535:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:539:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:540:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:546:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:550:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:551:1: ( RULE_INT )
            {
            // InternalMyDsl.g:551:1: ( RULE_INT )
            // InternalMyDsl.g:552:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Type_Impl__Group__0"
    // InternalMyDsl.g:562:1: rule__Type_Impl__Group__0 : rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 ;
    public final void rule__Type_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:1: ( rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 )
            // InternalMyDsl.g:567:2: rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Type_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0"


    // $ANTLR start "rule__Type_Impl__Group__0__Impl"
    // InternalMyDsl.g:574:1: rule__Type_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Type_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:578:1: ( ( () ) )
            // InternalMyDsl.g:579:1: ( () )
            {
            // InternalMyDsl.g:579:1: ( () )
            // InternalMyDsl.g:580:2: ()
            {
             before(grammarAccess.getType_ImplAccess().getTypeAction_0()); 
            // InternalMyDsl.g:581:2: ()
            // InternalMyDsl.g:581:3: 
            {
            }

             after(grammarAccess.getType_ImplAccess().getTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0__Impl"


    // $ANTLR start "rule__Type_Impl__Group__1"
    // InternalMyDsl.g:589:1: rule__Type_Impl__Group__1 : rule__Type_Impl__Group__1__Impl ;
    public final void rule__Type_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:593:1: ( rule__Type_Impl__Group__1__Impl )
            // InternalMyDsl.g:594:2: rule__Type_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1"


    // $ANTLR start "rule__Type_Impl__Group__1__Impl"
    // InternalMyDsl.g:600:1: rule__Type_Impl__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:604:1: ( ( 'Type' ) )
            // InternalMyDsl.g:605:1: ( 'Type' )
            {
            // InternalMyDsl.g:605:1: ( 'Type' )
            // InternalMyDsl.g:606:2: 'Type'
            {
             before(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1__Impl"


    // $ANTLR start "rule__Float__Group__0"
    // InternalMyDsl.g:616:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:620:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalMyDsl.g:621:2: rule__Float__Group__0__Impl rule__Float__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Float__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__0"


    // $ANTLR start "rule__Float__Group__0__Impl"
    // InternalMyDsl.g:628:1: rule__Float__Group__0__Impl : ( 'Float' ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( ( 'Float' ) )
            // InternalMyDsl.g:633:1: ( 'Float' )
            {
            // InternalMyDsl.g:633:1: ( 'Float' )
            // InternalMyDsl.g:634:2: 'Float'
            {
             before(grammarAccess.getFloatAccess().getFloatKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getFloatKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__0__Impl"


    // $ANTLR start "rule__Float__Group__1"
    // InternalMyDsl.g:643:1: rule__Float__Group__1 : rule__Float__Group__1__Impl rule__Float__Group__2 ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:647:1: ( rule__Float__Group__1__Impl rule__Float__Group__2 )
            // InternalMyDsl.g:648:2: rule__Float__Group__1__Impl rule__Float__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Float__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__1"


    // $ANTLR start "rule__Float__Group__1__Impl"
    // InternalMyDsl.g:655:1: rule__Float__Group__1__Impl : ( '{' ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( ( '{' ) )
            // InternalMyDsl.g:660:1: ( '{' )
            {
            // InternalMyDsl.g:660:1: ( '{' )
            // InternalMyDsl.g:661:2: '{'
            {
             before(grammarAccess.getFloatAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__1__Impl"


    // $ANTLR start "rule__Float__Group__2"
    // InternalMyDsl.g:670:1: rule__Float__Group__2 : rule__Float__Group__2__Impl rule__Float__Group__3 ;
    public final void rule__Float__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( rule__Float__Group__2__Impl rule__Float__Group__3 )
            // InternalMyDsl.g:675:2: rule__Float__Group__2__Impl rule__Float__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Float__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__2"


    // $ANTLR start "rule__Float__Group__2__Impl"
    // InternalMyDsl.g:682:1: rule__Float__Group__2__Impl : ( 'value' ) ;
    public final void rule__Float__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( ( 'value' ) )
            // InternalMyDsl.g:687:1: ( 'value' )
            {
            // InternalMyDsl.g:687:1: ( 'value' )
            // InternalMyDsl.g:688:2: 'value'
            {
             before(grammarAccess.getFloatAccess().getValueKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__2__Impl"


    // $ANTLR start "rule__Float__Group__3"
    // InternalMyDsl.g:697:1: rule__Float__Group__3 : rule__Float__Group__3__Impl rule__Float__Group__4 ;
    public final void rule__Float__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:701:1: ( rule__Float__Group__3__Impl rule__Float__Group__4 )
            // InternalMyDsl.g:702:2: rule__Float__Group__3__Impl rule__Float__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Float__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__3"


    // $ANTLR start "rule__Float__Group__3__Impl"
    // InternalMyDsl.g:709:1: rule__Float__Group__3__Impl : ( ( rule__Float__ValueAssignment_3 ) ) ;
    public final void rule__Float__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( ( ( rule__Float__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:714:1: ( ( rule__Float__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:714:1: ( ( rule__Float__ValueAssignment_3 ) )
            // InternalMyDsl.g:715:2: ( rule__Float__ValueAssignment_3 )
            {
             before(grammarAccess.getFloatAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:716:2: ( rule__Float__ValueAssignment_3 )
            // InternalMyDsl.g:716:3: rule__Float__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Float__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__3__Impl"


    // $ANTLR start "rule__Float__Group__4"
    // InternalMyDsl.g:724:1: rule__Float__Group__4 : rule__Float__Group__4__Impl ;
    public final void rule__Float__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( rule__Float__Group__4__Impl )
            // InternalMyDsl.g:729:2: rule__Float__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__4"


    // $ANTLR start "rule__Float__Group__4__Impl"
    // InternalMyDsl.g:735:1: rule__Float__Group__4__Impl : ( '}' ) ;
    public final void rule__Float__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:1: ( ( '}' ) )
            // InternalMyDsl.g:740:1: ( '}' )
            {
            // InternalMyDsl.g:740:1: ( '}' )
            // InternalMyDsl.g:741:2: '}'
            {
             before(grammarAccess.getFloatAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__4__Impl"


    // $ANTLR start "rule__Int0__Group__0"
    // InternalMyDsl.g:751:1: rule__Int0__Group__0 : rule__Int0__Group__0__Impl rule__Int0__Group__1 ;
    public final void rule__Int0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( rule__Int0__Group__0__Impl rule__Int0__Group__1 )
            // InternalMyDsl.g:756:2: rule__Int0__Group__0__Impl rule__Int0__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Int0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int0__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__Group__0"


    // $ANTLR start "rule__Int0__Group__0__Impl"
    // InternalMyDsl.g:763:1: rule__Int0__Group__0__Impl : ( 'Int' ) ;
    public final void rule__Int0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( ( 'Int' ) )
            // InternalMyDsl.g:768:1: ( 'Int' )
            {
            // InternalMyDsl.g:768:1: ( 'Int' )
            // InternalMyDsl.g:769:2: 'Int'
            {
             before(grammarAccess.getInt0Access().getIntKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInt0Access().getIntKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__Group__0__Impl"


    // $ANTLR start "rule__Int0__Group__1"
    // InternalMyDsl.g:778:1: rule__Int0__Group__1 : rule__Int0__Group__1__Impl rule__Int0__Group__2 ;
    public final void rule__Int0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( rule__Int0__Group__1__Impl rule__Int0__Group__2 )
            // InternalMyDsl.g:783:2: rule__Int0__Group__1__Impl rule__Int0__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Int0__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int0__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__Group__1"


    // $ANTLR start "rule__Int0__Group__1__Impl"
    // InternalMyDsl.g:790:1: rule__Int0__Group__1__Impl : ( '{' ) ;
    public final void rule__Int0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:794:1: ( ( '{' ) )
            // InternalMyDsl.g:795:1: ( '{' )
            {
            // InternalMyDsl.g:795:1: ( '{' )
            // InternalMyDsl.g:796:2: '{'
            {
             before(grammarAccess.getInt0Access().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInt0Access().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__Group__1__Impl"


    // $ANTLR start "rule__Int0__Group__2"
    // InternalMyDsl.g:805:1: rule__Int0__Group__2 : rule__Int0__Group__2__Impl rule__Int0__Group__3 ;
    public final void rule__Int0__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( rule__Int0__Group__2__Impl rule__Int0__Group__3 )
            // InternalMyDsl.g:810:2: rule__Int0__Group__2__Impl rule__Int0__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Int0__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int0__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__Group__2"


    // $ANTLR start "rule__Int0__Group__2__Impl"
    // InternalMyDsl.g:817:1: rule__Int0__Group__2__Impl : ( 'value' ) ;
    public final void rule__Int0__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( ( 'value' ) )
            // InternalMyDsl.g:822:1: ( 'value' )
            {
            // InternalMyDsl.g:822:1: ( 'value' )
            // InternalMyDsl.g:823:2: 'value'
            {
             before(grammarAccess.getInt0Access().getValueKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInt0Access().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__Group__2__Impl"


    // $ANTLR start "rule__Int0__Group__3"
    // InternalMyDsl.g:832:1: rule__Int0__Group__3 : rule__Int0__Group__3__Impl rule__Int0__Group__4 ;
    public final void rule__Int0__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:836:1: ( rule__Int0__Group__3__Impl rule__Int0__Group__4 )
            // InternalMyDsl.g:837:2: rule__Int0__Group__3__Impl rule__Int0__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Int0__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int0__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__Group__3"


    // $ANTLR start "rule__Int0__Group__3__Impl"
    // InternalMyDsl.g:844:1: rule__Int0__Group__3__Impl : ( ( rule__Int0__ValueAssignment_3 ) ) ;
    public final void rule__Int0__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( ( ( rule__Int0__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:849:1: ( ( rule__Int0__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:849:1: ( ( rule__Int0__ValueAssignment_3 ) )
            // InternalMyDsl.g:850:2: ( rule__Int0__ValueAssignment_3 )
            {
             before(grammarAccess.getInt0Access().getValueAssignment_3()); 
            // InternalMyDsl.g:851:2: ( rule__Int0__ValueAssignment_3 )
            // InternalMyDsl.g:851:3: rule__Int0__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Int0__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInt0Access().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__Group__3__Impl"


    // $ANTLR start "rule__Int0__Group__4"
    // InternalMyDsl.g:859:1: rule__Int0__Group__4 : rule__Int0__Group__4__Impl ;
    public final void rule__Int0__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( rule__Int0__Group__4__Impl )
            // InternalMyDsl.g:864:2: rule__Int0__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int0__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__Group__4"


    // $ANTLR start "rule__Int0__Group__4__Impl"
    // InternalMyDsl.g:870:1: rule__Int0__Group__4__Impl : ( '}' ) ;
    public final void rule__Int0__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:874:1: ( ( '}' ) )
            // InternalMyDsl.g:875:1: ( '}' )
            {
            // InternalMyDsl.g:875:1: ( '}' )
            // InternalMyDsl.g:876:2: '}'
            {
             before(grammarAccess.getInt0Access().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInt0Access().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__Group__4__Impl"


    // $ANTLR start "rule__Boolean__Group__0"
    // InternalMyDsl.g:886:1: rule__Boolean__Group__0 : rule__Boolean__Group__0__Impl rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:890:1: ( rule__Boolean__Group__0__Impl rule__Boolean__Group__1 )
            // InternalMyDsl.g:891:2: rule__Boolean__Group__0__Impl rule__Boolean__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Boolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__0"


    // $ANTLR start "rule__Boolean__Group__0__Impl"
    // InternalMyDsl.g:898:1: rule__Boolean__Group__0__Impl : ( ( rule__Boolean__ValueAssignment_0 ) ) ;
    public final void rule__Boolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( ( ( rule__Boolean__ValueAssignment_0 ) ) )
            // InternalMyDsl.g:903:1: ( ( rule__Boolean__ValueAssignment_0 ) )
            {
            // InternalMyDsl.g:903:1: ( ( rule__Boolean__ValueAssignment_0 ) )
            // InternalMyDsl.g:904:2: ( rule__Boolean__ValueAssignment_0 )
            {
             before(grammarAccess.getBooleanAccess().getValueAssignment_0()); 
            // InternalMyDsl.g:905:2: ( rule__Boolean__ValueAssignment_0 )
            // InternalMyDsl.g:905:3: rule__Boolean__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__0__Impl"


    // $ANTLR start "rule__Boolean__Group__1"
    // InternalMyDsl.g:913:1: rule__Boolean__Group__1 : rule__Boolean__Group__1__Impl ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:917:1: ( rule__Boolean__Group__1__Impl )
            // InternalMyDsl.g:918:2: rule__Boolean__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__1"


    // $ANTLR start "rule__Boolean__Group__1__Impl"
    // InternalMyDsl.g:924:1: rule__Boolean__Group__1__Impl : ( 'Boolean' ) ;
    public final void rule__Boolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( ( 'Boolean' ) )
            // InternalMyDsl.g:929:1: ( 'Boolean' )
            {
            // InternalMyDsl.g:929:1: ( 'Boolean' )
            // InternalMyDsl.g:930:2: 'Boolean'
            {
             before(grammarAccess.getBooleanAccess().getBooleanKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBooleanAccess().getBooleanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__1__Impl"


    // $ANTLR start "rule__String0__Group__0"
    // InternalMyDsl.g:940:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalMyDsl.g:945:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__String0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0"


    // $ANTLR start "rule__String0__Group__0__Impl"
    // InternalMyDsl.g:952:1: rule__String0__Group__0__Impl : ( 'String' ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( ( 'String' ) )
            // InternalMyDsl.g:957:1: ( 'String' )
            {
            // InternalMyDsl.g:957:1: ( 'String' )
            // InternalMyDsl.g:958:2: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getString0Access().getStringKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0__Impl"


    // $ANTLR start "rule__String0__Group__1"
    // InternalMyDsl.g:967:1: rule__String0__Group__1 : rule__String0__Group__1__Impl rule__String0__Group__2 ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:971:1: ( rule__String0__Group__1__Impl rule__String0__Group__2 )
            // InternalMyDsl.g:972:2: rule__String0__Group__1__Impl rule__String0__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__String0__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1"


    // $ANTLR start "rule__String0__Group__1__Impl"
    // InternalMyDsl.g:979:1: rule__String0__Group__1__Impl : ( '{' ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:983:1: ( ( '{' ) )
            // InternalMyDsl.g:984:1: ( '{' )
            {
            // InternalMyDsl.g:984:1: ( '{' )
            // InternalMyDsl.g:985:2: '{'
            {
             before(grammarAccess.getString0Access().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getString0Access().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1__Impl"


    // $ANTLR start "rule__String0__Group__2"
    // InternalMyDsl.g:994:1: rule__String0__Group__2 : rule__String0__Group__2__Impl rule__String0__Group__3 ;
    public final void rule__String0__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( rule__String0__Group__2__Impl rule__String0__Group__3 )
            // InternalMyDsl.g:999:2: rule__String0__Group__2__Impl rule__String0__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__String0__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__2"


    // $ANTLR start "rule__String0__Group__2__Impl"
    // InternalMyDsl.g:1006:1: rule__String0__Group__2__Impl : ( 'value' ) ;
    public final void rule__String0__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( ( 'value' ) )
            // InternalMyDsl.g:1011:1: ( 'value' )
            {
            // InternalMyDsl.g:1011:1: ( 'value' )
            // InternalMyDsl.g:1012:2: 'value'
            {
             before(grammarAccess.getString0Access().getValueKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getString0Access().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__2__Impl"


    // $ANTLR start "rule__String0__Group__3"
    // InternalMyDsl.g:1021:1: rule__String0__Group__3 : rule__String0__Group__3__Impl rule__String0__Group__4 ;
    public final void rule__String0__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( rule__String0__Group__3__Impl rule__String0__Group__4 )
            // InternalMyDsl.g:1026:2: rule__String0__Group__3__Impl rule__String0__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__String0__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__3"


    // $ANTLR start "rule__String0__Group__3__Impl"
    // InternalMyDsl.g:1033:1: rule__String0__Group__3__Impl : ( ( rule__String0__ValueAssignment_3 ) ) ;
    public final void rule__String0__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( ( ( rule__String0__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:1038:1: ( ( rule__String0__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:1038:1: ( ( rule__String0__ValueAssignment_3 ) )
            // InternalMyDsl.g:1039:2: ( rule__String0__ValueAssignment_3 )
            {
             before(grammarAccess.getString0Access().getValueAssignment_3()); 
            // InternalMyDsl.g:1040:2: ( rule__String0__ValueAssignment_3 )
            // InternalMyDsl.g:1040:3: rule__String0__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__String0__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__3__Impl"


    // $ANTLR start "rule__String0__Group__4"
    // InternalMyDsl.g:1048:1: rule__String0__Group__4 : rule__String0__Group__4__Impl ;
    public final void rule__String0__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1052:1: ( rule__String0__Group__4__Impl )
            // InternalMyDsl.g:1053:2: rule__String0__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__4"


    // $ANTLR start "rule__String0__Group__4__Impl"
    // InternalMyDsl.g:1059:1: rule__String0__Group__4__Impl : ( '}' ) ;
    public final void rule__String0__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1063:1: ( ( '}' ) )
            // InternalMyDsl.g:1064:1: ( '}' )
            {
            // InternalMyDsl.g:1064:1: ( '}' )
            // InternalMyDsl.g:1065:2: '}'
            {
             before(grammarAccess.getString0Access().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getString0Access().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalMyDsl.g:1075:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1079:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalMyDsl.g:1080:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalMyDsl.g:1087:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1092:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1092:1: ( ( '-' )? )
            // InternalMyDsl.g:1093:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:1094:2: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1094:3: '-'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalMyDsl.g:1102:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1106:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalMyDsl.g:1107:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalMyDsl.g:1114:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1118:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:1119:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:1119:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:1120:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalMyDsl.g:1121:2: ( RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1121:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalMyDsl.g:1129:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1133:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalMyDsl.g:1134:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalMyDsl.g:1141:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( ( '.' ) )
            // InternalMyDsl.g:1146:1: ( '.' )
            {
            // InternalMyDsl.g:1146:1: ( '.' )
            // InternalMyDsl.g:1147:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalMyDsl.g:1156:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1160:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalMyDsl.g:1161:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalMyDsl.g:1168:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1172:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1173:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1173:1: ( RULE_INT )
            // InternalMyDsl.g:1174:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalMyDsl.g:1183:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1187:1: ( rule__EFloat__Group__4__Impl )
            // InternalMyDsl.g:1188:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalMyDsl.g:1194:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalMyDsl.g:1199:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalMyDsl.g:1199:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalMyDsl.g:1200:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalMyDsl.g:1201:2: ( rule__EFloat__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1201:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalMyDsl.g:1210:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1214:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalMyDsl.g:1215:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalMyDsl.g:1222:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1226:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalMyDsl.g:1227:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalMyDsl.g:1227:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalMyDsl.g:1228:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalMyDsl.g:1229:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalMyDsl.g:1229:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalMyDsl.g:1237:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1241:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalMyDsl.g:1242:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalMyDsl.g:1249:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1254:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1254:1: ( ( '-' )? )
            // InternalMyDsl.g:1255:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalMyDsl.g:1256:2: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1256:3: '-'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalMyDsl.g:1264:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1268:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalMyDsl.g:1269:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalMyDsl.g:1275:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1279:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1280:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1280:1: ( RULE_INT )
            // InternalMyDsl.g:1281:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__Association__UsedAssignment_3"
    // InternalMyDsl.g:1291:1: rule__Association__UsedAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Association__UsedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1295:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:1296:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1296:2: ( ( ruleEString ) )
            // InternalMyDsl.g:1297:3: ( ruleEString )
            {
             before(grammarAccess.getAssociationAccess().getUsedRoleCrossReference_3_0()); 
            // InternalMyDsl.g:1298:3: ( ruleEString )
            // InternalMyDsl.g:1299:4: ruleEString
            {
             before(grammarAccess.getAssociationAccess().getUsedRoleEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getUsedRoleEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getUsedRoleCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__UsedAssignment_3"


    // $ANTLR start "rule__Association__UserAssignment_5"
    // InternalMyDsl.g:1310:1: rule__Association__UserAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Association__UserAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1314:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:1315:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1315:2: ( ( ruleEString ) )
            // InternalMyDsl.g:1316:3: ( ruleEString )
            {
             before(grammarAccess.getAssociationAccess().getUserRoleCrossReference_5_0()); 
            // InternalMyDsl.g:1317:3: ( ruleEString )
            // InternalMyDsl.g:1318:4: ruleEString
            {
             before(grammarAccess.getAssociationAccess().getUserRoleEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getUserRoleEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getUserRoleCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__UserAssignment_5"


    // $ANTLR start "rule__Float__ValueAssignment_3"
    // InternalMyDsl.g:1329:1: rule__Float__ValueAssignment_3 : ( ruleEFloat ) ;
    public final void rule__Float__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1333:1: ( ( ruleEFloat ) )
            // InternalMyDsl.g:1334:2: ( ruleEFloat )
            {
            // InternalMyDsl.g:1334:2: ( ruleEFloat )
            // InternalMyDsl.g:1335:3: ruleEFloat
            {
             before(grammarAccess.getFloatAccess().getValueEFloatParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getFloatAccess().getValueEFloatParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__ValueAssignment_3"


    // $ANTLR start "rule__Int0__ValueAssignment_3"
    // InternalMyDsl.g:1344:1: rule__Int0__ValueAssignment_3 : ( ruleEInt ) ;
    public final void rule__Int0__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:1349:2: ( ruleEInt )
            {
            // InternalMyDsl.g:1349:2: ( ruleEInt )
            // InternalMyDsl.g:1350:3: ruleEInt
            {
             before(grammarAccess.getInt0Access().getValueEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInt0Access().getValueEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__ValueAssignment_3"


    // $ANTLR start "rule__Boolean__ValueAssignment_0"
    // InternalMyDsl.g:1359:1: rule__Boolean__ValueAssignment_0 : ( ( 'value' ) ) ;
    public final void rule__Boolean__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( ( ( 'value' ) ) )
            // InternalMyDsl.g:1364:2: ( ( 'value' ) )
            {
            // InternalMyDsl.g:1364:2: ( ( 'value' ) )
            // InternalMyDsl.g:1365:3: ( 'value' )
            {
             before(grammarAccess.getBooleanAccess().getValueValueKeyword_0_0()); 
            // InternalMyDsl.g:1366:3: ( 'value' )
            // InternalMyDsl.g:1367:4: 'value'
            {
             before(grammarAccess.getBooleanAccess().getValueValueKeyword_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBooleanAccess().getValueValueKeyword_0_0()); 

            }

             after(grammarAccess.getBooleanAccess().getValueValueKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__ValueAssignment_0"


    // $ANTLR start "rule__String0__ValueAssignment_3"
    // InternalMyDsl.g:1378:1: rule__String0__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__String0__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1382:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1383:2: ( ruleEString )
            {
            // InternalMyDsl.g:1383:2: ( ruleEString )
            // InternalMyDsl.g:1384:3: ruleEString
            {
             before(grammarAccess.getString0Access().getValueEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getString0Access().getValueEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002040040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});

}