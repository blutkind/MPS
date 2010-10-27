package jetbrains.mps.lang.editor.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_CellModel_RefNodeList_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public check_CellModel_RefNodeList_InferenceRule() {
  }

  public void applyRule(final SNode refNodeList, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode lnk = SLinkOperations.getTarget(refNodeList, "relationDeclaration", false);
    if (!(SPropertyOperations.hasValue(lnk, "metaClass", "aggregation", "reference"))) {
      BaseQuickFixProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(refNodeList, "aggregation link expected", "r:00000000-0000-4000-0000-011c8959029a(jetbrains.mps.lang.editor.typesystem)", "1180295464579", intentionProvider, errorTarget);
    }
    if (!(SPropertyOperations.hasValue(lnk, "sourceCardinality", "0..n", "0..1") || SPropertyOperations.hasValue(lnk, "sourceCardinality", "1..n", "0..1"))) {
      BaseQuickFixProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(refNodeList, "multiple cardinality expected", "r:00000000-0000-4000-0000-011c8959029a(jetbrains.mps.lang.editor.typesystem)", "1180295464588", intentionProvider, errorTarget);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList";
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
