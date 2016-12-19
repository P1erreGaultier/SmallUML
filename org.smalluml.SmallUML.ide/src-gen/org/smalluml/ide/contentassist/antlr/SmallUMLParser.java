/*
 * generated by Xtext 2.10.0
 */
package org.smalluml.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.smalluml.ide.contentassist.antlr.internal.InternalSmallUMLParser;
import org.smalluml.services.SmallUMLGrammarAccess;

public class SmallUMLParser extends AbstractContentAssistParser {

	@Inject
	private SmallUMLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSmallUMLParser createParser() {
		InternalSmallUMLParser result = new InternalSmallUMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getDiagramAccess().getGroup(), "rule__Diagram__Group__0");
					put(grammarAccess.getDiagramAccess().getGroup_3(), "rule__Diagram__Group_3__0");
					put(grammarAccess.getDiagramAccess().getGroup_3_3(), "rule__Diagram__Group_3_3__0");
					put(grammarAccess.getDiagramAccess().getGroup_4(), "rule__Diagram__Group_4__0");
					put(grammarAccess.getDiagramAccess().getGroup_4_3(), "rule__Diagram__Group_4_3__0");
					put(grammarAccess.getDiagramAccess().getGroup_5(), "rule__Diagram__Group_5__0");
					put(grammarAccess.getDiagramAccess().getGroup_5_3(), "rule__Diagram__Group_5_3__0");
					put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
					put(grammarAccess.getHeritageAccess().getGroup(), "rule__Heritage__Group__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getClassAccess().getGroup_4(), "rule__Class__Group_4__0");
					put(grammarAccess.getClassAccess().getGroup_4_3(), "rule__Class__Group_4_3__0");
					put(grammarAccess.getClassAccess().getGroup_5(), "rule__Class__Group_5__0");
					put(grammarAccess.getClassAccess().getGroup_5_3(), "rule__Class__Group_5_3__0");
					put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_4(), "rule__Method__Group_4__0");
					put(grammarAccess.getMethodAccess().getGroup_4_3(), "rule__Method__Group_4_3__0");
					put(grammarAccess.getMethodAccess().getGroup_5(), "rule__Method__Group_5__0");
					put(grammarAccess.getType_ImplAccess().getGroup(), "rule__Type_Impl__Group__0");
					put(grammarAccess.getFloatAccess().getGroup(), "rule__Float__Group__0");
					put(grammarAccess.getInt0Access().getGroup(), "rule__Int0__Group__0");
					put(grammarAccess.getBooleanAccess().getGroup(), "rule__Boolean__Group__0");
					put(grammarAccess.getString0Access().getGroup(), "rule__String0__Group__0");
					put(grammarAccess.getDiagramAccess().getAssocAssignment_3_2(), "rule__Diagram__AssocAssignment_3_2");
					put(grammarAccess.getDiagramAccess().getAssocAssignment_3_3_1(), "rule__Diagram__AssocAssignment_3_3_1");
					put(grammarAccess.getDiagramAccess().getHeritageAssignment_4_2(), "rule__Diagram__HeritageAssignment_4_2");
					put(grammarAccess.getDiagramAccess().getHeritageAssignment_4_3_1(), "rule__Diagram__HeritageAssignment_4_3_1");
					put(grammarAccess.getDiagramAccess().getClassAssignment_5_2(), "rule__Diagram__ClassAssignment_5_2");
					put(grammarAccess.getDiagramAccess().getClassAssignment_5_3_1(), "rule__Diagram__ClassAssignment_5_3_1");
					put(grammarAccess.getAssociationAccess().getNameAssignment_1(), "rule__Association__NameAssignment_1");
					put(grammarAccess.getAssociationAccess().getUsedAssignment_4(), "rule__Association__UsedAssignment_4");
					put(grammarAccess.getAssociationAccess().getUserAssignment_6(), "rule__Association__UserAssignment_6");
					put(grammarAccess.getHeritageAccess().getNameAssignment_1(), "rule__Heritage__NameAssignment_1");
					put(grammarAccess.getHeritageAccess().getMotherAssignment_4(), "rule__Heritage__MotherAssignment_4");
					put(grammarAccess.getHeritageAccess().getChildAssignment_6(), "rule__Heritage__ChildAssignment_6");
					put(grammarAccess.getClassAccess().getNameAssignment_2(), "rule__Class__NameAssignment_2");
					put(grammarAccess.getClassAccess().getMethodAssignment_4_2(), "rule__Class__MethodAssignment_4_2");
					put(grammarAccess.getClassAccess().getMethodAssignment_4_3_1(), "rule__Class__MethodAssignment_4_3_1");
					put(grammarAccess.getClassAccess().getAttributeAssignment_5_2(), "rule__Class__AttributeAssignment_5_2");
					put(grammarAccess.getClassAccess().getAttributeAssignment_5_3_1(), "rule__Class__AttributeAssignment_5_3_1");
					put(grammarAccess.getRoleAccess().getNameAssignment_1(), "rule__Role__NameAssignment_1");
					put(grammarAccess.getRoleAccess().getUpperAssignment_4(), "rule__Role__UpperAssignment_4");
					put(grammarAccess.getRoleAccess().getLowerAssignment_6(), "rule__Role__LowerAssignment_6");
					put(grammarAccess.getRoleAccess().getClassAssignment_8(), "rule__Role__ClassAssignment_8");
					put(grammarAccess.getMethodAccess().getNameAssignment_2(), "rule__Method__NameAssignment_2");
					put(grammarAccess.getMethodAccess().getParametersAssignment_4_2(), "rule__Method__ParametersAssignment_4_2");
					put(grammarAccess.getMethodAccess().getParametersAssignment_4_3_1(), "rule__Method__ParametersAssignment_4_3_1");
					put(grammarAccess.getMethodAccess().getReturnAssignment_5_1(), "rule__Method__ReturnAssignment_5_1");
					put(grammarAccess.getType_ImplAccess().getNameAssignment_2(), "rule__Type_Impl__NameAssignment_2");
					put(grammarAccess.getFloatAccess().getNameAssignment_2(), "rule__Float__NameAssignment_2");
					put(grammarAccess.getInt0Access().getNameAssignment_2(), "rule__Int0__NameAssignment_2");
					put(grammarAccess.getBooleanAccess().getNameAssignment_2(), "rule__Boolean__NameAssignment_2");
					put(grammarAccess.getString0Access().getNameAssignment_2(), "rule__String0__NameAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSmallUMLParser typedParser = (InternalSmallUMLParser) parser;
			typedParser.entryRuleDiagram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SmallUMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SmallUMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
