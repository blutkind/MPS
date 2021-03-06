package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.search.ParameterScope;
import jetbrains.mps.baseLanguage.search.LocalVariablesScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;

public class FieldReferenceOperation_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getVariableExpectedName_1213877410087(SNode thisNode) {
    String expectedName = null;
    if ((SLinkOperations.getTarget(thisNode, "fieldDeclaration", false) != null)) {
      expectedName = SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "fieldDeclaration", false), "name");
    }
    return expectedName;
  }

  public static boolean virtual_isDotExpressionLegalAsStatement_1239212437413(SNode thisNode) {
    return false;
  }

  public static boolean call_canBeConvertedToLocal_5311267937735160942(SNode thisNode) {
    if (!(SNodeOperations.isInstanceOf(IOperation_Behavior.call_getOperand_1213877410070(thisNode), "jetbrains.mps.baseLanguage.structure.ThisExpression"))) {
      return false;
    }
    List<SNode> param = new ParameterScope(thisNode).getNodes();
    List<SNode> vars = new LocalVariablesScope(thisNode).getNodes();
    vars.addAll(param);
    SNode field = SLinkOperations.getTarget(thisNode, "fieldDeclaration", false);
    if (field == null) {
      return false;
    }
    for (SNode var : vars) {
      if (var != null && SNodeOperations.isInstanceOf(var, "jetbrains.mps.lang.core.structure.INamedConcept") && SPropertyOperations.getString(SNodeOperations.cast(var, "jetbrains.mps.lang.core.structure.INamedConcept"), "name").equals(SPropertyOperations.getString(field, "name")) && ListSequence.fromList(SNodeOperations.getAncestors(SNodeOperations.getAncestor(field, "jetbrains.mps.baseLanguage.structure.Classifier", false, false), "jetbrains.mps.baseLanguage.structure.Classifier", true)).contains(SNodeOperations.getAncestor(var, "jetbrains.mps.baseLanguage.structure.Classifier", false, false))) {
        return false;
      }
    }
    if (SLinkOperations.getTarget(SNodeOperations.cast(IOperation_Behavior.call_getOperand_1213877410070(thisNode), "jetbrains.mps.baseLanguage.structure.ThisExpression"), "classConcept", false) == null) {
      return true;
    }
    SNode classifier = ClassConcept_Behavior.getContextClass_8008512149545173402(thisNode);
    SNode declarationClassifier = SNodeOperations.getAncestor(field, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    if (!(classifier == declarationClassifier || ListSequence.fromList(SNodeOperations.getAncestors(classifier, null, false)).contains(declarationClassifier))) {
      return false;
    }
    int constraint = IClassifiersSearchScope.INSTANCE_FIELD;
    while (classifier != declarationClassifier) {
      for (SNode fieldDeclaration : (List<SNode>) Classifier_Behavior.call_getVisibleMembers_1213877306257(classifier, thisNode, constraint)) {
        if (SPropertyOperations.getString(fieldDeclaration, "name") != null && SPropertyOperations.getString(fieldDeclaration, "name").equals(SPropertyOperations.getString(field, "name"))) {
          return false;
        }
      }
      classifier = SNodeOperations.getAncestor(classifier, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    }
    return true;
  }

  public static void call_convertToLocal_5311267937735269195(SNode thisNode) {
    SNode fieldReference = SNodeOperations.replaceWithNewChild(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference");
    SLinkOperations.setTarget(fieldReference, "variableDeclaration", SLinkOperations.getTarget(thisNode, "fieldDeclaration", false), false);
  }
}
