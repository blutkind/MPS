package jetbrains.mps.analyzers.mpsAnalyzers.nullable;

/*Generated by MPS */

import jetbrains.mps.analyzers.runtime.framework.DataFlowConstructor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class RuleMethodCall extends DataFlowConstructor {
  public RuleMethodCall() {
  }

  public boolean isApplicable(SNode node) {
    return SModelUtil_new.isAssignableConcept(INamedConcept_Behavior.call_getFqName_1213877404258(SNodeOperations.getConceptDeclaration(node)), getApplicableConceptFqName());
  }

  public String getApplicableConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.IMethodCall";
  }

  public void performActions(Program o, SNode node) {
    SNode m = node;
    if (SLinkOperations.getTargets(SLinkOperations.getTarget(m, "baseMethodDeclaration", false), "annotation", true) != null) {
      for (SNode annotation : SLinkOperations.getTargets(SLinkOperations.getTarget(m, "baseMethodDeclaration", false), "annotation", true)) {
        String name = SPropertyOperations.getString(SLinkOperations.getTarget(annotation, "annotation", false), "name");
        if (SLinkOperations.getTarget(annotation, "annotation", false) == SNodeOperations.getNode("f:java_stub#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)", "~Nullable")) {
          {
            int position = 0;
            position = ((Program) (o)).getEnd(node);
            ((Program) (o)).insert(new nullableInstruction(node), position, true);
          }
        }
        if (SLinkOperations.getTarget(annotation, "annotation", false) == SNodeOperations.getNode("f:java_stub#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)", "~NotNull")) {
          {
            int position = 0;
            position = ((Program) (o)).getEnd(node);
            ((Program) (o)).insert(new notNullInstruction(node), position, true);
          }
        }
      }
    }
  }
}
