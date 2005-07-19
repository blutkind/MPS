package jetbrains.mps.smodel;

import jetbrains.mps.projectLanguage.ModelRoot;

import java.util.Set;

/**
 * @author Kostik
 */
public interface ModelRootManager {
  Set<SModelDescriptor> read(ModelRoot root, ModelOwner owner);
}
