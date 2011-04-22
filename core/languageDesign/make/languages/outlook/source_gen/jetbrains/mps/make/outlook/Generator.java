package jetbrains.mps.make.outlook;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateModule;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateMappingPriorityRule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.runtime.TemplateModel;
import jetbrains.mps.project.structure.modules.ModuleReference;

public class Generator implements TemplateModule {
  private final Collection<TemplateMappingPriorityRule> priorities;

  public Generator() {
    priorities = TemplateUtil.asCollection(TemplateUtil.createStrictlyTogetherRule(TemplateUtil.createRefExternal("f2324f12-b66e-4ff0-82da-267897cc06d8(jetbrains.mps.make.outlook#5608160002100106841)", TemplateUtil.createRefLocal()), TemplateUtil.createRefExternal("3349c57b-62f9-4ce2-a22d-d9bd99edc6a6(jetbrains.mps.make.facet#5086995156117116954)", TemplateUtil.createRefLocal())));
  }

  public String getAlias() {
    return "jetbrains.mps.make.outlook/java";
  }

  public Collection<TemplateModel> getModels() {
    return null;
  }

  public Collection<TemplateMappingPriorityRule> getPriorities() {
    return priorities;
  }

  public ModuleReference getReference() {
    return null;
  }
}
