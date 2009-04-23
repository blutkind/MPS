package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SideTransformMenuPart extends MenuPart {
  public static final String concept = "jetbrains.mps.lang.actions.structure.SideTransformMenuPart";

  public SideTransformMenuPart(SNode node) {
    super(node);
  }

  public static SideTransformMenuPart newInstance(SModel sm, boolean init) {
    return (SideTransformMenuPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.SideTransformMenuPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SideTransformMenuPart newInstance(SModel sm) {
    return SideTransformMenuPart.newInstance(sm, false);
  }

}
