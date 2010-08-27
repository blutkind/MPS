package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import java.awt.Frame;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.vfs.VFileSystem;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import com.intellij.openapi.vcs.AbstractVcs;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import com.intellij.openapi.vcs.history.VcsRevisionNumber;
import com.intellij.openapi.vcs.changes.ContentRevision;
import jetbrains.mps.vcs.diff.ui.RootDifferenceDialog;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.vcs.VcsException;
import jetbrains.mps.smodel.SModelDescriptor;
import org.jdom.Document;
import jetbrains.mps.util.JDOMUtil;
import java.io.StringReader;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import com.intellij.openapi.vcs.impl.VcsFileStatusProvider;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.internal.collections.runtime.Sequence;
import com.intellij.openapi.vcs.FileStatus;
import jetbrains.mps.project.IModule;
import jetbrains.mps.vfs.IFile;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;

public class VcsActionsHelper {
  public VcsActionsHelper() {
  }

  public static void showDiffrence(Frame frame, final IOperationContext context, SModel model, final SNode node, Project project) {
    try {
      VirtualFile file = VFileSystem.getFile(((EditableSModelDescriptor) model.getModelDescriptor()).getModelFile());
      AbstractVcs vcs = ProjectLevelVcsManager.getInstance(project).getVcsFor(file);
      final VcsRevisionNumber revisionNumber = vcs.getDiffProvider().getCurrentRevision(file);
      ContentRevision content = vcs.getDiffProvider().createFileContent(revisionNumber, file);
      SModel oldModel = VcsActionsHelper.loadModel(content.getContent(), model.getModelDescriptor());
      final RootDifferenceDialog dialog = new RootDifferenceDialog(frame, model, oldModel, true, true);
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          dialog.init(context, node, "Local", revisionNumber.asString());
        }
      });
      dialog.showDialog();
    } catch (VcsException e) {
      e.printStackTrace();
    }
  }

  public static SModel loadModel(String modelContent, final SModelDescriptor model) {
    try {
      final Document document = JDOMUtil.loadDocument(new StringReader(modelContent));
      final Wrappers._T<SModel> sModel = new Wrappers._T<SModel>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          sModel.value = ModelPersistence.readModel(document, model.getLongName(), model.getStereotype());
        }
      });
      return sModel.value;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  private static Iterable<VirtualFile> collectUnversionedFiles(final VcsFileStatusProvider fileStatusProvider, final VirtualFile dir) {
    return new _FunctionTypes._return_P0_E0<Iterable<VirtualFile>>() {
      public Iterable<VirtualFile> invoke() {
        return new Iterable<VirtualFile>() {
          public Iterator<VirtualFile> iterator() {
            return new YieldingIterator<VirtualFile>() {
              private int __CP__ = 0;
              private VirtualFile _5_child;
              private Iterator<VirtualFile> _5_child_it;
              private VirtualFile _8__yield_deu5rm_a0b0a0a0c;
              private Iterator<VirtualFile> _8__yield_deu5rm_a0b0a0a0c_it;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 4:
                      this._5_child_it = Sequence.fromIterable(Sequence.fromArray(dir.getChildren())).iterator();
                    case 6:
                      if (!(this._5_child_it.hasNext())) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._5_child = this._5_child_it.next();
                      this.__CP__ = 7;
                      break;
                    case 8:
                      this._8__yield_deu5rm_a0b0a0a0c_it = collectUnversionedFiles(fileStatusProvider, _5_child).iterator();
                    case 9:
                      if (!(this._8__yield_deu5rm_a0b0a0a0c_it.hasNext())) {
                        this.__CP__ = 6;
                        break;
                      }
                      this._8__yield_deu5rm_a0b0a0a0c = this._8__yield_deu5rm_a0b0a0a0c_it.next();
                      this.__CP__ = 10;
                      break;
                    case 2:
                      if (fileStatusProvider.getFileStatus(dir) == FileStatus.UNKNOWN) {
                        this.__CP__ = 3;
                        break;
                      }
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 4;
                      this.yield(dir);
                      return true;
                    case 11:
                      this.__CP__ = 9;
                      this.yield(_8__yield_deu5rm_a0b0a0a0c);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 3:
                      this.__CP__ = 5;
                      break;
                    case 7:
                      this.__CP__ = 8;
                      break;
                    case 10:
                      this.__CP__ = 11;
                      break;
                    default:
                      break __loop__;
                  }
                } while (true);
                return false;
              }
            };
          }
        };
      }
    }.invoke();
  }

  public static Iterable<VirtualFile> getUnversionedFilesForModule(Project project, IModule module) {
    IFile moduleDir = module.getDescriptorFile().getParent();
    VcsFileStatusProvider statusProvider = project.getComponent(VcsFileStatusProvider.class);
    return collectUnversionedFiles(statusProvider, moduleDir.toVirtualFile());
  }

  public static List<VirtualFile> getUnversionedFilesForModules(final Project project, List<IModule> module) {
    return ListSequence.fromList(module).translate(new ITranslator2<IModule, VirtualFile>() {
      public Iterable<VirtualFile> translate(IModule m) {
        return getUnversionedFilesForModule(project, m);
      }
    }).toListSequence();
  }
}
