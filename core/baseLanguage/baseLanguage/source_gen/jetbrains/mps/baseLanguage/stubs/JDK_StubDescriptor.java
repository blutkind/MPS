package jetbrains.mps.baseLanguage.stubs;

/*Generated by MPS */

import jetbrains.mps.stubs.BaseLibStubDescriptor;
import jetbrains.mps.project.structure.model.ModelRootManager;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleId;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.reloading.CommonPaths;

public class JDK_StubDescriptor extends BaseLibStubDescriptor {
  public JDK_StubDescriptor() {
    super("JDK", "6354ebe7-c22a-4a0f-ac54-50b52ab9b065", new ModelRootManager("f3061a53-9226-4cc5-a443-f952ceaf5816", "jetbrains.mps.baseLanguage.stubs.CompiledJava"));
  }

  public void init(SolutionDescriptor solution) {
    solution.getUsedLanguages().add(MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString("f3061a53-9226-4cc5-a443-f952ceaf5816")).getModuleReference());
  }

  public List<String> getPaths() {
    return ListSequence.fromListWithValues(new ArrayList<String>(), CommonPaths.getJDKPath());
  }
}
