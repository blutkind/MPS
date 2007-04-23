package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MenuPart extends BaseConcept {

  public  MenuPart(SNode node) {
    super(node);
  }

  public static MenuPart newInstance(SModel sm, boolean init) {
    return (MenuPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.MenuPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static MenuPart newInstance(SModel sm) {
    return MenuPart.newInstance(sm, false);
  }
}
