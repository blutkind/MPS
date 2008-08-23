package jetbrains.mps.generator;

import jetbrains.mps.project.*;
import jetbrains.mps.projectLanguage.structure.ModuleDescriptor;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.persistence.IModelRootManager;
import jetbrains.mps.MPSProjectHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NonNls;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.components.ProjectComponent;

public class TransientModelsModule extends AbstractModule implements ProjectComponent {
  private Project myProject;
  private IModule myInvocationContext;
  private Set<String> myModelsToKeep = new HashSet<String>();

  public TransientModelsModule(Project project, MPSProjectHolder holder) {
    myProject = project;
  }

  public void projectOpened() {
  }

  public void projectClosed() {

  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "Transient Models Module";
  }

  public void initComponent() {
    MPSModuleRepository.getInstance().addModule(this, getMPSProject());
  }

  public void disposeComponent() {

  }

  private MPSProject getMPSProject() {
    return myProject.getComponent(MPSProjectHolder.class).getMPSProject();
  }

  public void setInvocationContext(IModule invocationContext) {
    myInvocationContext = invocationContext;
  }

  public Class getClass(String fqName) {
    if (myInvocationContext == null) {
      throw new IllegalStateException();
    }    
    return myInvocationContext.getClass(fqName);
  }

  public IScope getScope() {
    return GlobalScope.getInstance();
  }

  public ModuleDescriptor getModuleDescriptor() {
    return null;
  }

  public void setModuleDescriptor(ModuleDescriptor moduleDescriptor) {
    throw new UnsupportedOperationException();
  }

  public String getGeneratorOutputPath() {
    throw new UnsupportedOperationException();
  }

  public void save() {
    // nothing
  }

  public void dispose() {
    SModelRepository.getInstance().unRegisterModelDescriptors(this);
  }

  public void clearAll() {
    SModelRepository.getInstance().unRegisterModelDescriptors(this);
    SModelRepository.getInstance().removeUnusedDescriptors();
    setInvocationContext(null);
    myModelsToKeep.clear();
  }

  public void clearUnused() {
    List<SModelDescriptor> models = this.getOwnModelDescriptors();
    for (SModelDescriptor model : models) {
      if (!myModelsToKeep.contains(model.getModelUID().toString())) {
        SModelRepository.getInstance().removeModelDescriptor(model);
      }
    }
  }

  public void addModelToKeep(SModelDescriptor model) {
    assert model.isTransient();
    myModelsToKeep.add(model.getModelUID().toString());
  }

  public boolean isModelToKeep(SModelDescriptor model) {
    assert model.isTransient();
    return myModelsToKeep.contains(model.getModelUID().toString());
  }

  public SModelDescriptor createTransientModel(String name, String stereotype) {
    DefaultSModelDescriptor result = new DefaultSModelDescriptor(IModelRootManager.NULL_MANAGER, null, new SModelUID(name, stereotype)) {
      protected SModel loadModel() {
        return new SModel(getModelUID());
      }

      public boolean isNotEditable() {
        return false;
      }
    };

    result.setTransient(true);
    SModelRepository.getInstance().registerModelDescriptor(result, this);
    return result;
  }

  @NotNull
  public String toString() {
    return "Transient models [" + myProject.getPresentableUrl() + "]";
  }
}
