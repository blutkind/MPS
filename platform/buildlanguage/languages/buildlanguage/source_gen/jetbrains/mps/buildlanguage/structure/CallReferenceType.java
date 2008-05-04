package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CallReferenceType extends PropertyType {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.CallReferenceType";

  public CallReferenceType(SNode node) {
    super(node);
  }

  public static CallReferenceType newInstance(SModel sm, boolean init) {
    return (CallReferenceType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.CallReferenceType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CallReferenceType newInstance(SModel sm) {
    return CallReferenceType.newInstance(sm, false);
  }

}
