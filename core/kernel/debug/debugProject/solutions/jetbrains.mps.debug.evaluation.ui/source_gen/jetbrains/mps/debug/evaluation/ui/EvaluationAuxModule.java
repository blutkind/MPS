package jetbrains.mps.debug.evaluation.ui;

/*Generated by MPS */

import jetbrains.mps.project.AbstractModule;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;
import jetbrains.mps.smodel.SModelRepository;

public class EvaluationAuxModule extends AbstractModule {
  private Project myProject;
  private IModule myInvocationContext;

  public EvaluationAuxModule(Project project) {
    this.myProject = project;
    ModuleReference reference = ModuleReference.fromString("Debug Evaluation Aux Module");
    this.setModulePointer(reference);
    this.init();
  }

  public void init() {
    MPSModuleRepository.getInstance().addModule(EvaluationAuxModule.this, this.getMPSProject());
  }

  public void dispose() {
    super.dispose();
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        EvaluationAuxModule.this.clearAll();
        MPSModuleRepository.getInstance().removeModule(EvaluationAuxModule.this);
      }
    });
  }

  public MPSProject getMPSProject() {
    return this.myProject.getComponent(MPSProject.class);
  }

  public void setInvocationContext(IModule invocationContext) {
    this.myInvocationContext = invocationContext;
  }

  public Class getClass(String fqName) {
    if (this.myInvocationContext == null) {
      throw new IllegalStateException();
    }
    return this.myInvocationContext.getClass(fqName);
  }

  @NotNull
  public IScope getScope() {
    return GlobalScope.getInstance();
  }

  public ModuleDescriptor getModuleDescriptor() {
    return null;
  }

  public void setModuleDescriptor(ModuleDescriptor moduleDescriptor, boolean reloadClasses) {
    throw new UnsupportedOperationException();
  }

  public String getGeneratorOutputPath() {
    return null;
  }

  public String getTestsGeneratorOutputPath() {
    return null;
  }

  public void save() {
  }

  public void clearAll() {
    SModelRepository.getInstance().unRegisterModelDescriptors(this);
    SModelRepository.getInstance().removeUnusedDescriptors();
    this.invalidateCaches();
    this.setInvocationContext(null);
  }

  @NotNull
  public String toString() {
    return "Debug Evaluation Aux Module";
  }
}
