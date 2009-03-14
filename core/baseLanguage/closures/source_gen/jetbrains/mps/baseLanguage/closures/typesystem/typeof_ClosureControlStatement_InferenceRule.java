package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.baseLanguage.closures.behavior.ControlMethodUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Iterator;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ClosureControlStatement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ClosureControlStatement_InferenceRule() {
  }

  public void applyRule(final SNode ccs, final TypeCheckingContext typeCheckingContext) {
    ControlMethodUtil.Info info = ControlMethodUtil.analyze(SLinkOperations.getTarget(ccs, "controlMethod", false));
    if (!(info != null)) {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      typeCheckingContext.reportTypeError(ccs, "Not referring to a control method", "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1232453890820", intentionProvider, errorTarget);
    }
    if (info != null) {
      List<SNode> ccts = info.getControlClosureTypes();
      if (!(ListSequence.fromList(ccts).count() > 0)) {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(ccs, "Control method should accept at least one unrestricted closure", "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1232454232193", intentionProvider, errorTarget);
      }
      if (!((SLinkOperations.getTarget(ccs, "controlClosure", true) != null))) {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(ccs, "Must define a control closure", "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1232454314258", intentionProvider, errorTarget);
      }
      if (ListSequence.fromList(ccts).count() > 0) {
        {
          SNode _nodeToCheck_1029348928467 = ccs;
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.createLessThanInequationStrong(typeCheckingContext.typeOf(SLinkOperations.getTarget(ccs, "controlClosure", true), "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1236533965287", true), ListSequence.fromList(ccts).getElement(ListSequence.fromList(ccts).count() - 1), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1236533962056", false, 0, intentionProvider);
        }
      }
      List<SNode> params = SLinkOperations.getTargets(ccs, "actualParameter", true);
      List<SNode> fpts = info.getFunctionParamTypes();
      if (!(ListSequence.fromList(params).count() == ListSequence.fromList(fpts).count())) {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(ccs, "Incorrect parameters number", "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1232455288552", intentionProvider, errorTarget);
      }
      {
        SNode pt;
        SNode param;
        Iterator<SNode> pt_iterator = fpts.iterator();
        Iterator<SNode> param_iterator = params.iterator();
        while (true) {
          if (!(pt_iterator.hasNext())) {
            break;
          }
          if (!(param_iterator.hasNext())) {
            break;
          }
          pt = pt_iterator.next();
          param = param_iterator.next();
          {
            SNode _nodeToCheck_1029348928467 = ccs;
            BaseIntentionProvider intentionProvider = null;
            typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(param, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1236534227246", true), pt, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1236534225483", false, 0, intentionProvider);
          }
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
