package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.AbstractCreator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ComponentCreator extends AbstractCreator {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.ComponentCreator";
  public static final String COMPONENT_DECLARATION = "componentDeclaration";

  public ComponentCreator(SNode node) {
    super(node);
  }

  public ComponentDeclaration getComponentDeclaration() {
    return (ComponentDeclaration)this.getReferent(ComponentDeclaration.class, ComponentCreator.COMPONENT_DECLARATION);
  }

  public void setComponentDeclaration(ComponentDeclaration node) {
    super.setReferent(ComponentCreator.COMPONENT_DECLARATION, node);
  }


  public static ComponentCreator newInstance(SModel sm, boolean init) {
    return (ComponentCreator)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.ComponentCreator", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ComponentCreator newInstance(SModel sm) {
    return ComponentCreator.newInstance(sm, false);
  }

}
