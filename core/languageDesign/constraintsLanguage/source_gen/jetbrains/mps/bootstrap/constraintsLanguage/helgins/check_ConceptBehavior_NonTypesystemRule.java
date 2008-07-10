package jetbrains.mps.bootstrap.constraintsLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.bootstrap.structureLanguage.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ConceptBehavior_NonTypesystemRule implements NonTypesystemRule_Runtime {

  public check_ConceptBehavior_NonTypesystemRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    List<SNode> methodDeclarations = AbstractConceptDeclaration_Behavior.call_getNotImplementedConceptMethods_1213877394339(SLinkOperations.getTarget(nodeToCheck, "concept", false), GlobalScope.getInstance());
    if (SConceptPropertyOperations.getBoolean(SLinkOperations.getTarget(nodeToCheck, "concept", false), "abstract")) {
      return;
    }
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(nodeToCheck, "concept", false), "jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptDeclaration")) {
      return;
    }
    if (!(ListSequence.fromList(methodDeclarations).isEmpty())) {
      boolean notImplementedMethods = false;
      for(SNode cm : methodDeclarations) {
        if (!(ListSequence.fromList(SLinkOperations.getTargets(nodeToCheck, "method", true)).contains(cm))) {
          notImplementedMethods = true;
        }
      }
      if (notImplementedMethods) {
        {
          BaseIntentionProvider intentionProvider = null;
          TypeChecker.getInstance().reportTypeError(nodeToCheck, "Concept " + SPropertyOperations.getString(SLinkOperations.getTarget(nodeToCheck, "concept", false), "name") + " doesn't implement " + methodDeclarations, "jetbrains.mps.bootstrap.constraintsLanguage.helgins@27_0", "1215726714194", intentionProvider);
        }
      }
    }
    for(SNode cmd : SLinkOperations.getTargets(nodeToCheck, "method", true)) {
      if (SConceptPropertyOperations.getBoolean(cmd, "abstract")) {
        {
          BaseIntentionProvider intentionProvider = null;
          TypeChecker.getInstance().reportTypeError(cmd, "Abstract method in non abstract concept", "jetbrains.mps.bootstrap.constraintsLanguage.helgins@27_0", "1215726714214", intentionProvider);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
