/*
 * generated by Xtext 2.10.0
 */
package org.smalluml.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.smalluml.services.SmallUMLGrammarAccess;
import smalluml.Association;
import smalluml.Diagram;
import smalluml.Heritage;
import smalluml.Int;
import smalluml.Method;
import smalluml.Role;
import smalluml.SmallumlPackage;
import smalluml.Type;

@SuppressWarnings("all")
public class SmallUMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmallUMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SmallumlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SmallumlPackage.ASSOCIATION:
				sequence_Association(context, (Association) semanticObject); 
				return; 
			case SmallumlPackage.BOOLEAN:
				sequence_Boolean(context, (smalluml.Boolean) semanticObject); 
				return; 
			case SmallumlPackage.CLASS:
				sequence_Class(context, (smalluml.Class) semanticObject); 
				return; 
			case SmallumlPackage.DIAGRAM:
				sequence_Diagram(context, (Diagram) semanticObject); 
				return; 
			case SmallumlPackage.FLOAT:
				sequence_Float(context, (smalluml.Float) semanticObject); 
				return; 
			case SmallumlPackage.HERITAGE:
				sequence_Heritage(context, (Heritage) semanticObject); 
				return; 
			case SmallumlPackage.INT:
				sequence_Int0(context, (Int) semanticObject); 
				return; 
			case SmallumlPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case SmallumlPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case SmallumlPackage.STRING:
				sequence_String0(context, (smalluml.String) semanticObject); 
				return; 
			case SmallumlPackage.TYPE:
				sequence_Type_Impl(context, (Type) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Association returns Association
	 *
	 * Constraint:
	 *     (name=EString used=Role user=Role)
	 */
	protected void sequence_Association(ISerializationContext context, Association semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.ASSOCIATION__USED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.ASSOCIATION__USED));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.ASSOCIATION__USER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.ASSOCIATION__USER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssociationAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssociationAccess().getUsedRoleParserRuleCall_4_0(), semanticObject.getUsed());
		feeder.accept(grammarAccess.getAssociationAccess().getUserRoleParserRuleCall_6_0(), semanticObject.getUser());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Boolean
	 *     Boolean returns Boolean
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Boolean(ISerializationContext context, smalluml.Boolean semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Class returns Class
	 *
	 * Constraint:
	 *     (name=EString (method+=Method method+=Method*)? (attribute+=Type attribute+=Type*)?)
	 */
	protected void sequence_Class(ISerializationContext context, smalluml.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Diagram returns Diagram
	 *
	 * Constraint:
	 *     ((assoc+=Association assoc+=Association*)? (heritage+=Heritage heritage+=Heritage*)? (class+=Class class+=Class*)?)
	 */
	protected void sequence_Diagram(ISerializationContext context, Diagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Float
	 *     Float returns Float
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Float(ISerializationContext context, smalluml.Float semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFloatAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Heritage returns Heritage
	 *
	 * Constraint:
	 *     (name=EString mother=Role child=Role)
	 */
	protected void sequence_Heritage(ISerializationContext context, Heritage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.HERITAGE__MOTHER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.HERITAGE__MOTHER));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.HERITAGE__CHILD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.HERITAGE__CHILD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHeritageAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHeritageAccess().getMotherRoleParserRuleCall_4_0(), semanticObject.getMother());
		feeder.accept(grammarAccess.getHeritageAccess().getChildRoleParserRuleCall_6_0(), semanticObject.getChild());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Int
	 *     Int0 returns Int
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Int0(ISerializationContext context, Int semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInt0Access().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Method returns Method
	 *
	 * Constraint:
	 *     (name=EString (parameters+=Type parameters+=Type*)? return=Type?)
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (name=EString upper=EInt lower=EInt class=Class)
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.ROLE__UPPER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.ROLE__UPPER));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.ROLE__LOWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.ROLE__LOWER));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.ROLE__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.ROLE__CLASS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRoleAccess().getUpperEIntParserRuleCall_4_0(), semanticObject.getUpper());
		feeder.accept(grammarAccess.getRoleAccess().getLowerEIntParserRuleCall_6_0(), semanticObject.getLower());
		feeder.accept(grammarAccess.getRoleAccess().getClassClassParserRuleCall_8_0(), semanticObject.getClass_());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns String
	 *     String0 returns String
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_String0(ISerializationContext context, smalluml.String semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getString0Access().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *     Type_Impl returns Type
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Type_Impl(ISerializationContext context, Type semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
