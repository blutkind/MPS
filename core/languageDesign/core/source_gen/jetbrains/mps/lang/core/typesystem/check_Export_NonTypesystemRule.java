package jetbrains.mps.lang.core.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.core.behavior.ExportScope_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.ReferenceErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_Export_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_Export_NonTypesystemRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    String namespace = ExportScope_Behavior.getNamespace_2565736246230026649(node);
    // getModuleNamespace() doesn't work for transient models 
    if (namespace == null) {
      return;
    }
    // check concept of the node 
    if (!(ExportScope_Behavior.checkExport_2565736246230031479(true, SNodeOperations.getConceptDeclaration(node), namespace))) {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(node, "usage of nonpublic API", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "8935196238174954469", intentionProvider, errorTarget);
      }
    }
    // check references 
    for (SReference ref : Sequence.fromIterable(SNodeOperations.getReferences(node))) {
      if (!(ExportScope_Behavior.checkExport_2565736246230031479(false, SLinkOperations.getTargetNode(ref), namespace))) {
        {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          errorTarget = new ReferenceErrorTarget(SLinkOperations.getRole(ref));
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(node, "usage of nonpublic API", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "8935196238174954475", intentionProvider, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
