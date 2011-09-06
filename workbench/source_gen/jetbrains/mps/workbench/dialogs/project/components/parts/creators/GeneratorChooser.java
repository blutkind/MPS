package jetbrains.mps.workbench.dialogs.project.components.parts.creators;

/*Generated by MPS */

import com.intellij.openapi.util.Computable;
import java.util.List;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.workbench.dialogs.project.IBindedDialog;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.workbench.dialogs.choosers.CommonChoosers;

public class GeneratorChooser implements Computable<List<ModuleReference>> {
  private final IBindedDialog myOwner;

  public GeneratorChooser(IBindedDialog owner) {
    myOwner = owner;
  }

  public List<ModuleReference> compute() {
    final Wrappers._T<List<ModuleReference>> genRefs = new Wrappers._T<List<ModuleReference>>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        List<Generator> generators = MPSModuleRepository.getInstance().getAllGenerators();
        genRefs.value = ListSequence.fromList(generators).<ModuleReference>select(new ISelector<Generator, ModuleReference>() {
          public ModuleReference select(Generator it) {
            return it.getModuleReference();
          }
        }).toListSequence();
      }
    });
    return CommonChoosers.showDialogModuleCollectionChooser(myOwner.getMainComponent(), "generator", genRefs.value, null);
  }
}
