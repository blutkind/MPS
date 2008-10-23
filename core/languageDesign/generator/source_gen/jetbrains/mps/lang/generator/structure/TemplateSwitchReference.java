package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TemplateSwitchReference extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.generator.structure.TemplateSwitchReference";
  public static final String TEMPLATE_SWITCH = "templateSwitch";

  public TemplateSwitchReference(SNode node) {
    super(node);
  }

  public TemplateSwitch getTemplateSwitch() {
    return (TemplateSwitch)this.getReferent(TemplateSwitchReference.TEMPLATE_SWITCH);
  }

  public void setTemplateSwitch(TemplateSwitch node) {
    super.setReferent(TemplateSwitchReference.TEMPLATE_SWITCH, node);
  }


  public static TemplateSwitchReference newInstance(SModel sm, boolean init) {
    return (TemplateSwitchReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.TemplateSwitchReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TemplateSwitchReference newInstance(SModel sm) {
    return TemplateSwitchReference.newInstance(sm, false);
  }

}
