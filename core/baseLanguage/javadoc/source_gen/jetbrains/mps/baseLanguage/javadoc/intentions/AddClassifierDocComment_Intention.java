package jetbrains.mps.baseLanguage.javadoc.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AddClassifierDocComment_Intention extends BaseIntention implements Intention {
  public AddClassifierDocComment_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Classifier";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return ((AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.ClassifierDocComment"))) == null) ?
      "Add Documentation Comment" :
      "Remove Documentation Comment"
    );
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (editorContext.getSelectedNode() != node && !(this.isVisibleInChild(node, editorContext.getSelectedNode(), editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isVisibleInChild(final SNode node, final SNode childNode, final EditorContext editorContext) {
    return (SNodeOperations.getAncestor(childNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", true, false) == null) && (SNodeOperations.getAncestor(childNode, "jetbrains.mps.baseLanguage.structure.FieldDeclaration", true, false) == null) && (SNodeOperations.getAncestor(childNode, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration", true, false) == null) && SNodeOperations.getAncestor(childNode, "jetbrains.mps.baseLanguage.structure.Classifier", true, false) == node;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    if ((AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.ClassifierDocComment"))) != null)) {
      AttributeOperations.setAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.ClassifierDocComment")), null);
      return;
    }

    SNodeFactoryOperations.setNewAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.ClassifierDocComment")), "jetbrains.mps.baseLanguage.javadoc.structure.ClassifierDocComment");

    //  Type variables 
    for (SNode typeVariableDeclaration : ListSequence.fromList(SLinkOperations.getTargets(node, "typeVariableDeclaration", true))) {
      SNode paramTag = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.javadoc.structure.ParameterBlockDocTag", null);
      SLinkOperations.setTarget(paramTag, "parameter", new AddClassifierDocComment_Intention.QuotationClass_nmk0m3_a2a1a5a7().createNode(typeVariableDeclaration), true);
      ListSequence.fromList(SLinkOperations.getTargets(AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.ClassifierDocComment"))), "param", true)).addElement(paramTag);
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.javadoc.intentions";
  }

  public static class QuotationClass_nmk0m3_a2a1a5a7 {
    public QuotationClass_nmk0m3_a2a1a5a7() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.DocTypeParameterReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("param", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
