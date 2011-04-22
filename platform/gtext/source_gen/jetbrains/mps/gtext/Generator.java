package jetbrains.mps.gtext;

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
    priorities = TemplateUtil.asCollection(TemplateUtil.createStrictlyBeforeRule(TemplateUtil.createRefExternal("bfcadeff-430f-4472-9641-06156a02be37(jetbrains.mps.gtext#1164413905312)", TemplateUtil.createRefNormal("r:00000000-0000-4000-0000-011c89590576(jetbrains.mps.gtext.generator.baseLanguage.template.main@generator)", "4246810654489660286")), TemplateUtil.createRefExternal("bfcadeff-430f-4472-9641-06156a02be37(jetbrains.mps.gtext#1164413905312)", TemplateUtil.createRefNormal("r:00000000-0000-4000-0000-011c89590576(jetbrains.mps.gtext.generator.baseLanguage.template.main@generator)", "1164413908130"))));
  }

  public String getAlias() {
    return "jetbrains.mps.gtext/<no name>";
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
