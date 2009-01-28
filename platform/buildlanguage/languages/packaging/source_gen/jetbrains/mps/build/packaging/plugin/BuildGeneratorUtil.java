package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.Solution;
import jetbrains.mps.smodel.SModelFqName;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;
import java.io.File;
import jetbrains.mps.vfs.MPSExtentions;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.project.persistence.SolutionDescriptorPersistence;
import jetbrains.mps.smodel.Language;

public class BuildGeneratorUtil {

  public BuildGeneratorUtil() {
  }

  public static SModelDescriptor createModel(String modelName, Solution solution) {
    SModelFqName newModelFQName = SModelFqName.fromString(modelName);
    List<SModelDescriptor> ownModelDescriptors = solution.getOwnModelDescriptors();
    SModelDescriptor modelDescriptor = null;
    for(SModelDescriptor descriptor : ListSequence.fromList(ownModelDescriptors)) {
      if (descriptor.getSModelFqName().equals(newModelFQName)) {
        modelDescriptor = descriptor;
        break;
      }
    }
    if (modelDescriptor == null) {
      modelDescriptor = solution.createModel(newModelFQName, solution.getSModelRoots().get(0));
    }
    modelDescriptor.getSModel().addLanguage(getPackagingLanguageReference());
    return modelDescriptor;
  }

  public static Solution createSolution(MPSProject mpsProject, String solutionName, String solutionBaseDir) {
    IFile baseDirFile = FileSystem.getFile(solutionBaseDir);
    if (!(baseDirFile.exists())) {
      baseDirFile.mkdirs();
    }
    String solutionFilePath = solutionBaseDir + File.separator + solutionName + MPSExtentions.DOT_SOLUTION;
    IFile solutionFile = FileSystem.getFile(solutionFilePath);
    Solution solution;
    if (solutionFile.exists()) {
      IModule module = MPSModuleRepository.getInstance().getModuleByFile(solutionFile.toFile());
      if (!(module instanceof Solution)) {
        return null;
      }
      solution = (Solution)module;
    } else
    {
      solution = BuildGeneratorUtil.createSolutionFormFile(mpsProject, solutionFile);
    }
    ModuleReference packagingLanguageRef = BuildGeneratorUtil.getPackagingLanguageReference();
    solution.addDependency(packagingLanguageRef, false);
    solution.addUsedLangauge(packagingLanguageRef);
    return solution;
  }

  public static Solution createSolutionFormFile(MPSProject mpsProject, IFile solutionDescriptorFile) {
    SolutionDescriptor descriptor = new SolutionDescriptor();
    descriptor.setExternallyVisible(true);
    descriptor.setCompileInMPS(true);
    String fileName = solutionDescriptorFile.getName();
    descriptor.setNamespace(fileName.substring(0, fileName.length() - 4));
    ModelRoot mr = new ModelRoot();
    mr.setPrefix("");
    mr.setPath(solutionDescriptorFile.getParent().getAbsolutePath());
    descriptor.getModelRoots().add(mr);
    SolutionDescriptorPersistence.saveSolutionDescriptor(solutionDescriptorFile, descriptor);
    return mpsProject.addProjectSolution(solutionDescriptorFile.toFile());
  }

  private static ModuleReference getPackagingLanguageReference() {
    Language packagingLanguage = MPSModuleRepository.getInstance().getLanguage("jetbrains.mps.build.packaging");
    return packagingLanguage.getModuleReference();
  }

}
