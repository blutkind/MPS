package jetbrains.mps.run.settings.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PersistentConfigurationTemplate extends PersistentConfiguration {
  public static final String concept = "jetbrains.mps.run.settings.structure.PersistentConfigurationTemplate";
  public static final String TEMPLATE_PARAMETER = "templateParameter";

  public PersistentConfigurationTemplate(SNode node) {
    super(node);
  }

  public int getTemplateParametersCount() {
    return this.getChildCount(PersistentConfigurationTemplate.TEMPLATE_PARAMETER);
  }

  public Iterator<TemplateParameter> templateParameters() {
    return this.children(TemplateParameter.class, PersistentConfigurationTemplate.TEMPLATE_PARAMETER);
  }

  public List<TemplateParameter> getTemplateParameters() {
    return this.getChildren(TemplateParameter.class, PersistentConfigurationTemplate.TEMPLATE_PARAMETER);
  }

  public void addTemplateParameter(TemplateParameter node) {
    this.addChild(PersistentConfigurationTemplate.TEMPLATE_PARAMETER, node);
  }

  public void insertTemplateParameter(TemplateParameter prev, TemplateParameter node) {
    this.insertChild(prev, PersistentConfigurationTemplate.TEMPLATE_PARAMETER, node);
  }

  public static PersistentConfigurationTemplate newInstance(SModel sm, boolean init) {
    return (PersistentConfigurationTemplate) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.run.settings.structure.PersistentConfigurationTemplate", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PersistentConfigurationTemplate newInstance(SModel sm) {
    return PersistentConfigurationTemplate.newInstance(sm, false);
  }
}
