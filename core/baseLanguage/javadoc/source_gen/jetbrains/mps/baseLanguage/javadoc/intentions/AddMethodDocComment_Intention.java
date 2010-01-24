package jetbrains.mps.baseLanguage.javadoc.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class AddMethodDocComment_Intention extends BaseIntention implements Intention {
  public AddMethodDocComment_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
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
    return ((SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("methodDocComment"), true) == null) ?
      "Add Documentation Comment" :
      "Remove Documentation Comment"
    );
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    if ((SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("methodDocComment"), true) != null)) {
      SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("methodDocComment"), null, true);
      return;
    }

    SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("methodDocComment"), SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.javadoc.structure.MethodDocComment", null), true);
    //  Method parameters 
    for (SNode parameterDeclaration : ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true))) {
      SNode paramTag = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.javadoc.structure.ParameterBlockDocTag", null);
      SLinkOperations.setTarget(paramTag, "parameter", new AddMethodDocComment_Intention.QuotationClass_6454_0().createNode(parameterDeclaration), true);
      ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("methodDocComment"), true), "param", true)).addElement(paramTag);
    }

    //  Type variables 
    for (SNode typeVariableDeclaration : ListSequence.fromList(SLinkOperations.getTargets(node, "typeVariableDeclaration", true))) {
      SNode paramTag = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.javadoc.structure.ParameterBlockDocTag", null);
      SLinkOperations.setTarget(paramTag, "parameter", new AddMethodDocComment_Intention.QuotationClass_6454_1().createNode(typeVariableDeclaration), true);
      ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("methodDocComment"), true), "param", true)).addElement(paramTag);
    }

    //  Thrown exceptions 
    for (SNode throwsItem : ListSequence.fromList(SLinkOperations.getTargets(node, "throwsItem", true))) {
      SNode throwsTag = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.javadoc.structure.ThrowsBlockDocTag", null);
      SLinkOperations.setTarget(throwsTag, "exceptionType", SNodeOperations.copyNode(throwsItem), true);
      ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("methodDocComment"), true), "throwsTag", true)).addElement(throwsTag);
    }

    //  Return value 
    if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
      SLinkOperations.setTarget(SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("methodDocComment"), true), "return", SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.javadoc.structure.ReturnBlockDocTag", null), true);
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.javadoc.intentions";
  }

  public static class QuotationClass_6454_0 {
    public QuotationClass_6454_0() {
    }

    public SNode createNode(Object parameter_6567_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_6567_0 = null;
      {
        quotedNode_6567_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.DocMethodParameterReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_6567_0 = quotedNode_6567_0;
        quotedNode1_6567_0.setReferent("param", (SNode) parameter_6567_0);
        result = quotedNode1_6567_0;
      }
      return result;
    }
  }

  public static class QuotationClass_6454_1 {
    public QuotationClass_6454_1() {
    }

    public SNode createNode(Object parameter_6567_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_6567_1 = null;
      {
        quotedNode_6567_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.DocTypeParameterReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_6567_1 = quotedNode_6567_1;
        quotedNode1_6567_1.setReferent("param", (SNode) parameter_6567_1);
        result = quotedNode1_6567_1;
      }
      return result;
    }
  }
}
