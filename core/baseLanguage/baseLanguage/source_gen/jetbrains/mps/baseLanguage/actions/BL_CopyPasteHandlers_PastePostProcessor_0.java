package jetbrains.mps.baseLanguage.actions;

/*Generated by MPS */

import jetbrains.mps.datatransfer.PastePostProcessor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.Classifier_Behavior;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.DynamicReference;

public class BL_CopyPasteHandlers_PastePostProcessor_0 implements PastePostProcessor {
  public SNode getApplicableConcept() {
    return SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference");
  }

  public void postProcesNode(SNode pastedNode) {
    SNode containingClassifier = SNodeOperations.getAncestor(pastedNode, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    final SReference staticFieldRef = SNodeOperations.getReference(pastedNode, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", "staticFieldDeclaration"));
    Iterable<SNode> visibleStaticFields = ListSequence.fromList(Classifier_Behavior.call_getVisibleMembers_1213877306257(containingClassifier, pastedNode, IClassifiersSearchScope.STATIC_FIELD)).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SNodeOperations.as(it, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration");
      }
    });
    if (Sequence.fromIterable(visibleStaticFields).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.getString(it, "name").equals(SLinkOperations.getResolveInfo(staticFieldRef));
      }
    }).isNotEmpty()) {
      SNode localStatisFieldReference = SNodeOperations.replaceWithNewChild(pastedNode, "jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference");
      localStatisFieldReference.addReference(new DynamicReference(SLinkOperations.getRole(staticFieldRef), localStatisFieldReference, localStatisFieldReference.getModel().getSModelReference(), SLinkOperations.getResolveInfo(staticFieldRef)));
    }
  }
}
