package jetbrains.mps.baseLanguage.stubs;

/*Generated by MPS */

import jetbrains.mps.stubs.BaseLibStubDescriptor;
import jetbrains.mps.project.structure.model.ModelRootManager;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;
import jetbrains.mps.project.structure.modules.Dependency;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleId;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.reloading.CommonPaths;
import jetbrains.mps.ClasspathReader;

public class MPS_Workbench_StubDescriptor extends BaseLibStubDescriptor {
  public MPS_Workbench_StubDescriptor() {
    super("MPS.Workbench", "86441d7a-e194-42da-81a5-2161ec62a379", new ModelRootManager("f3061a53-9226-4cc5-a443-f952ceaf5816", "jetbrains.mps.baseLanguage.stubs.JavaStubs"));
  }

  public void init(SolutionDescriptor solution) {
    solution.getDependencies().add(new Dependency(new ModuleReference("JDK", "6354ebe7-c22a-4a0f-ac54-50b52ab9b065"), true));
    solution.getDependencies().add(new Dependency(new ModuleReference("MPS.Core", "6ed54515-acc8-4d1e-a16c-9fd6cfe951ea"), true));
    solution.getDependencies().add(new Dependency(new ModuleReference("MPS.Editor", "1ed103c3-3aa6-49b7-9c21-6765ee11f224"), true));
    solution.getUsedLanguages().add(MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString("f3061a53-9226-4cc5-a443-f952ceaf5816")).getModuleReference());
  }

  public List<String> getPaths() {
    return ListSequence.fromListWithValues(new ArrayList<String>(), CommonPaths.getMPSPaths(ClasspathReader.ClassType.WORKBENCH));
  }
}
