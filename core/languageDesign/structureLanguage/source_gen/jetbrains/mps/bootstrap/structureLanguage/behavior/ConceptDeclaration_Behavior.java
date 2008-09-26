package jetbrains.mps.bootstrap.structureLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class ConceptDeclaration_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode call_findEditor_1213877216527(SNode thisNode, IScope scope) {
    Language language = SModelUtil_new.getDeclaringLanguage((AbstractConceptDeclaration)thisNode.getAdapter(), scope);
    SModelDescriptor constraints = language.getEditorModelDescriptor();
    if (constraints == null) {
      return null;
    }
    SModel model = constraints.getSModel();
    for(SNode editor : SModelOperations.getRoots(model, "jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration")) {
      if (SLinkOperations.getTarget(editor, "conceptDeclaration", false) == thisNode) {
        return editor;
      }
    }
    return null;
  }

  public static List<SNode> virtual_getImmediateSuperconcepts_1222430305282(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addElement(SLinkOperations.getTarget(thisNode, "extends", false));
    for(SNode interfaceConceptReference : SLinkOperations.getTargets(thisNode, "implements", true)) {
      ListSequence.fromList(result).addElement(SLinkOperations.getTarget(interfaceConceptReference, "intfc", false));
    }
    return result;
  }

}
