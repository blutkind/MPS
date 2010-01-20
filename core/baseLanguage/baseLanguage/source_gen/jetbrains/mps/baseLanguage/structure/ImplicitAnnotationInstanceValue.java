package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ImplicitAnnotationInstanceValue extends AnnotationInstanceValue {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ImplicitAnnotationInstanceValue";

  public ImplicitAnnotationInstanceValue(SNode node) {
    super(node);
  }

  public static ImplicitAnnotationInstanceValue newInstance(SModel sm, boolean init) {
    return (ImplicitAnnotationInstanceValue) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ImplicitAnnotationInstanceValue", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ImplicitAnnotationInstanceValue newInstance(SModel sm) {
    return ImplicitAnnotationInstanceValue.newInstance(sm, false);
  }
}
