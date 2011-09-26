package jetbrains.mps.ide.script.plugin;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.script.plugin.migrationtool.MigrationScriptsTool;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.BaseScope;
import java.util.Set;
import java.util.LinkedHashSet;
import jetbrains.mps.smodel.DefaultSModelDescriptor;
import jetbrains.mps.smodel.SModelStereotype;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.project.DevKit;
import jetbrains.mps.project.structure.modules.ModuleReference;

public abstract class AbstractMigrationScriptHelper {
  public AbstractMigrationScriptHelper() {
  }

  public static void doRunScripts(List<SNode> scripts, IScope scope, IOperationContext context) {
    context.getComponent(MigrationScriptsTool.class).startMigration(scripts, scope, context);
  }

  public static IScope createMigrationScope(List<SModelDescriptor> models, List<IModule> modules, boolean applyToSelection) {
    AbstractMigrationScriptHelper.MigrationScope migrationScope = new AbstractMigrationScriptHelper.MigrationScope();
    if (applyToSelection) {
      for (SModelDescriptor model : models) {
        migrationScope.addModel(model);
      }
      for (IModule module : modules) {
        migrationScope.addModule(module);
        if (module instanceof Language) {
          Language language = (Language) module;
          for (Generator generator : language.getGenerators()) {
            migrationScope.addModule(generator);
          }
        }
      }
    }
    if (migrationScope.isEmpty()) {
      for (IModule module : GlobalScope.getInstance().getVisibleModules()) {
        migrationScope.addModule(module);
      }
    }
    return migrationScope;
  }

  private static class MigrationScope extends BaseScope {
    private Set<SModelDescriptor> myModels = new LinkedHashSet<SModelDescriptor>();

    private MigrationScope() {
    }

    public void addModel(SModelDescriptor model) {
      if (!((model instanceof DefaultSModelDescriptor))) {
        return;
      }
      if (((DefaultSModelDescriptor) model).isReadOnly()) {
        return;
      }
      if (model.getStereotype() != null) {
        if (model.getStereotype().equals(SModelStereotype.INTERNAL) || model.getStereotype().equals(SModelStereotype.INTERNAL_COPY) || SModelStereotype.isStubModelStereotype(model.getStereotype())) {
          return;
        }
      }
      myModels.add(model);
    }

    public void addModule(IModule module) {
      if (!(module.isPackaged())) {
        for (SModelDescriptor model : module.getOwnModelDescriptors()) {
          addModel(model);
        }
      }
    }

    public List<SModelDescriptor> getModelDescriptors() {
      return new ArrayList<SModelDescriptor>(myModels);
    }

    public SModelDescriptor getModelDescriptor(SModelReference modelReference) {
      return GlobalScope.getInstance().getModelDescriptor(modelReference);
    }

    public List<Language> getVisibleLanguages() {
      throw new UnsupportedOperationException();
    }

    public List<DevKit> getVisibleDevkits() {
      throw new UnsupportedOperationException();
    }

    public Language getLanguage(ModuleReference moduleReference) {
      return GlobalScope.getInstance().getLanguage(moduleReference);
    }

    public DevKit getDevKit(ModuleReference ref) {
      return GlobalScope.getInstance().getDevKit(ref);
    }

    public Set<IModule> getVisibleModules() {
      throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
      return myModels.isEmpty();
    }
  }
}
