package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.lang.generator.editor.QueriesUtil;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;

public class AddPropertyMacroParam_property_Intention extends BaseIntention implements Intention {
  private SNode myParameter;

  public AddPropertyMacroParam_property_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  public boolean isParameterized() {
    return true;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Add Property Macro: node." + BaseConcept_Behavior.call_getPresentation_1213877396640(this.myParameter) + " (property)";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    SModelDescriptor sm = SNodeOperations.getModel(node).getModelDescriptor();
    if (sm == null || !(sm.getModule() instanceof Generator)) {
      return false;
    }
    return QueriesUtil.isPropertyMacroApplicable(node, editorContext.getSelectedCell());
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode propertyMacro = QueriesUtil.addPropertyMacro(node, editorContext.getSelectedCell());
    SNode propertyValue = SNodeFactoryOperations.createNewNode("jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue", null);
    SNode dotExpression = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.DotExpression", null);
    SNode propertyAccess = SNodeFactoryOperations.createNewNode("jetbrains.mps.lang.smodel.structure.SPropertyAccess", null);
    SLinkOperations.setTarget(propertyAccess, "property", this.myParameter, false);
    SLinkOperations.setTarget(dotExpression, "operation", propertyAccess, true);
    SLinkOperations.setTarget(dotExpression, "operand", SNodeFactoryOperations.createNewNode("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode", null), true);
    SNode expressionStatement = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null);
    SLinkOperations.setTarget(expressionStatement, "expression", dotExpression, true);
    ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(propertyValue, "body", true), "statement", true)).addElement(expressionStatement);
    SLinkOperations.setTarget(propertyMacro, "propertyValueFunction", propertyValue, true);
    // set caret 
    editorContext.selectAndSetCaret(propertyMacro, 0);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.generator.intentions";
  }

  private static List<SNode> parameter(final SNode node, final EditorContext editorContext) {
    SNode sourceNode = MacroIntentionsUtil.getContextNodeConcept(node);
    if (sourceNode == null) {
      return null;
    }
    String propertyName = QueriesUtil.getEditedPropertyName(editorContext.getSelectedCell());
    if (propertyName == null) {
      return null;
    }
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
    for (SNode propertySource : AbstractConceptDeclaration_Behavior.call_getPropertyDeclarations_1213877394546(sourceNode)) {
      SNode propertyDeclaration = SNodeOperations.cast(node.getPropertyDeclaration(propertyName), "jetbrains.mps.lang.structure.structure.PropertyDeclaration");
      if (propertyDeclaration == null) {
        continue;
      }
      SNode property = SLinkOperations.getTarget(propertyDeclaration, "dataType", false);
      if (property == SLinkOperations.getTarget(propertySource, "dataType", false)) {
        ListSequence.fromList(result).addElement(propertySource);
      }
    }
    return result;
  }

  public static List<Intention> instances(final SNode node, final EditorContext editorContext) {
    List<Intention> list = ListSequence.fromList(new ArrayList<Intention>());
    List<SNode> paramList = parameter(node, editorContext);
    if (paramList != null) {
      for (SNode param : paramList) {
        AddPropertyMacroParam_property_Intention intention = new AddPropertyMacroParam_property_Intention();
        intention.myParameter = param;
        ListSequence.fromList(list).addElement(intention);
      }
    }
    return list;
  }
}
