/*
 * generated by Xtext 2.10.0
 */
package org.smalluml.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.smalluml.parser.antlr.internal.InternalSmallUMLParser;
import org.smalluml.services.SmallUMLGrammarAccess;

public class SmallUMLParser extends AbstractAntlrParser {

	@Inject
	private SmallUMLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSmallUMLParser createParser(XtextTokenStream stream) {
		return new InternalSmallUMLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Diagram";
	}

	public SmallUMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SmallUMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
