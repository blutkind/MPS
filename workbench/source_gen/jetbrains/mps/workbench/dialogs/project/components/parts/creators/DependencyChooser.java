package jetbrains.mps.workbench.dialogs.project.components.parts.creators;

/*Generated by MPS */

import jetbrains.mps.util.Computable;
import java.util.List;
import jetbrains.mps.project.structure.modules.Dependency;
import jetbrains.mps.workbench.dialogs.project.IBindedDialog;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.workbench.dialogs.choosers.CommonChoosers;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.ArrayList;

public class DependencyChooser implements Computable<List<Dependency>> {
  private final IBindedDialog myOwner;

  public DependencyChooser(IBindedDialog owner) {
    myOwner = owner;
  }

  public List<Dependency> compute() {
    final Wrappers._T<Iterable<ModuleReference>> allModuleRefs = new Wrappers._T<Iterable<ModuleReference>>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        List<IModule> modules = MPSModuleRepository.getInstance().getAllModules();
        allModuleRefs.value = ListSequence.fromList(modules).select(new ISelector<IModule, ModuleReference>() {
          public ModuleReference select(IModule it) {
            return it.getModuleReference();
          }
        });
      }
    });
    List<ModuleReference> moduleRefs = CommonChoosers.showDialogModuleCollectionChooser(myOwner.getMainComponent(), "module", Sequence.fromIterable(allModuleRefs.value).toListSequence(), null);
    if (moduleRefs == null) {
      return null;
    }
    List<Dependency> result = new ArrayList<Dependency>();
    for (ModuleReference m : moduleRefs) {
      Dependency dependency = new Dependency();
      dependency.setModuleRef(m);
      result.add(dependency);
    }
    return result;
  }
}
