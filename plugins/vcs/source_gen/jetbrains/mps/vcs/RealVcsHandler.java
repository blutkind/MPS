package jetbrains.mps.vcs;

/*Generated by MPS */

import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.smodel.DefaultSModelDescriptor;
import com.intellij.openapi.vcs.history.VcsRevisionNumber;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.smodel.SModel;
import org.jetbrains.annotations.NotNull;

public class RealVcsHandler implements VCSHandler, ApplicationComponent {
  public RealVcsHandler() {
  }

  public void addSuspiciousModule(AbstractModule abstractModule, boolean isInConflict) {
    SuspiciousModelIndex.instance().addModule(abstractModule, isInConflict);
  }

  public void addSuspiciousModel(DefaultSModelDescriptor modelDescriptor, boolean isInConflict) {
    SuspiciousModelIndex.instance().addModel(modelDescriptor, isInConflict);
  }

  public VcsRevisionNumber getRevisionNumber(IFile file) {
    return VcsUtil.getRevisionNumber(file);
  }

  public boolean isInConflict(IFile iFile, boolean synchronously) {
    return VcsUtil.isInConflict(iFile, synchronously);
  }

  public boolean resolveDiskMemoryConflict(IFile modelFile, SModel model) {
    return VcsHelper.resolveDiskMemoryConflict(modelFile, model);
  }

  @NotNull
  public String getComponentName() {
    return "VCS Handler";
  }

  public void initComponent() {
  }

  public void disposeComponent() {
  }
}
