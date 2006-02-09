package jetbrains.mps.smodel;

import jetbrains.mps.util.annotation.ForDebug;
import jetbrains.mps.projectLanguage.ModelRoot;

import java.io.File;
import java.util.*;

/**
 * @author Kostik
 */
public class ProjectModelDescriptor extends AbstractSModelDescriptor {
  private static long ourProjectModelDescriptorCount = 0;
  private static final IModelRootManager ourModelRootManager = new IModelRootManager() {
    public Set<SModelDescriptor> read(ModelRoot root, ModelOwner owner) {
      throw new RuntimeException();
    }

    public SModel loadModel(SModelDescriptor modelDescriptor) {
      SModel result = new SModel(modelDescriptor.getModelUID());
      result.addLanguage("jetbrains.mps.projectLanguage");
      return result;
    }

    public void saveModel(SModelDescriptor modelDescriptor) {

    }
  };

  private @ForDebug Throwable myStackTrace;



  public static SModelDescriptor createDescriptorFor(ModelOwner owner) {
    ProjectModelDescriptor result = new ProjectModelDescriptor();
    SModelRepository.getInstance().registerModelDescriptor(result, owner);
    return result;
  }

  public static boolean isProjectModel(SModelUID uid) {
    return "$internal$".equals(uid.getStereotype());
  }

  private ProjectModelDescriptor() {
    super(ourModelRootManager, new SModelUID("projectModel" + ourProjectModelDescriptorCount++, "$internal$"));
//    myStackTrace = new Throwable();
  }

  public void reloadFromDisk() {
  }

  public void updateNodeStatuses() {
  }


  public File getModelFile() {
    return null;
  }

  public long timestamp() {
    return System.currentTimeMillis();
  }
}
