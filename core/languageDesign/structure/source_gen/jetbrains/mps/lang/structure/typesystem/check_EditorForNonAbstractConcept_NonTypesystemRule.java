package jetbrains.mps.lang.structure.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import java.util.Queue;
import jetbrains.mps.internal.collections.runtime.QueueSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import java.util.List;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.messageTargets.PropertyMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_EditorForNonAbstractConcept_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_EditorForNonAbstractConcept_NonTypesystemRule() {
  }

  public void applyRule(final SNode conceptDeclaration, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SConceptPropertyOperations.getBoolean(conceptDeclaration, "abstract")) {
      return;
    }
    Queue<SNode> toCheck = QueueSequence.fromQueue(new LinkedList<SNode>());
    QueueSequence.fromQueue(toCheck).addLastElement(conceptDeclaration);
    while (QueueSequence.fromQueue(toCheck).isNotEmpty()) {
      SNode acd = QueueSequence.fromQueue(toCheck).removeFirstElement();
      List<SNode> aspects = AbstractConceptDeclaration_Behavior.call_findConceptAspectCollection_1567570417158062208(acd, LanguageAspect.EDITOR);
      if (!(SConceptOperations.isExactly(acd, "jetbrains.mps.lang.core.structure.BaseConcept")) && ListSequence.fromList(aspects).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode a) {
          return SNodeOperations.isInstanceOf(a, "jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration");
        }
      })) {
        return;
      }
      QueueSequence.fromQueue(toCheck).addSequence(ListSequence.fromList(AbstractConceptDeclaration_Behavior.call_getImmediateSuperconcepts_1222430305282(acd)));
    }
    {
      MessageTarget errorTarget = new NodeMessageTarget();
      errorTarget = new PropertyMessageTarget("name");
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(conceptDeclaration, "Non-abstract concept should have editor declaration", "r:00000000-0000-4000-0000-011c8959028f(jetbrains.mps.lang.structure.typesystem)", "6519915829969195430", null, errorTarget);
      {
        BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.lang.structure.typesystem.CreateDefaultEditor_QuickFix", false);
        intentionProvider.putArgument("node", conceptDeclaration);
        _reporter_2309309498.addIntentionProvider(intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.structure.structure.ConceptDeclaration";
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
