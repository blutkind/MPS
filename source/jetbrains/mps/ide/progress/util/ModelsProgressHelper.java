package jetbrains.mps.ide.progress.util;

import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.ide.progress.TaskProgressSettings;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 31.12.2005
 * Time: 18:39:58
 * To change this template use File | Settings | File Templates.
 */
public class ModelsProgressHelper {
  private String myTaskKind;

  public ModelsProgressHelper(String taskKind) {
    myTaskKind = taskKind;
  }

  public String modelTaskName(SModelDescriptor modelDescriptor) {
    return modelTaskName(modelDescriptor.getModelUID());
  }

  public String modelTaskName(SModelUID modelUID) {
    return modelUID.toString() + "_" + myTaskKind;
  }

  public String modelTaskKind() {
    return myTaskKind;
  }

  public long estimateModelsTaskTimeMillis(Collection<SModelDescriptor> models) {
    long timeMillis = 0;
    TaskProgressSettings settings = TaskProgressSettings.getInstance();
    for (SModelDescriptor model : models) {
      timeMillis += settings.getEstimatedTimeMillis(modelTaskName(model));
    }
    return timeMillis;
  }

}
