package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.awt.Frame;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.IModule;
import javax.swing.tree.TreeNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.workbench.MPSDataKeys;
import javax.swing.JOptionPane;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.workbench.dialogs.project.creation.NewModelDialog;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.ide.projectPane.ProjectPane;
import jetbrains.mps.ide.StereotypeProvider;
import jetbrains.mps.ide.projectPane.NamespaceTextNode;

public class NewModel_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(NewModel_Action.class);

  private Frame frame;
  private Project project;
  private IOperationContext context;
  private IModule module;
  private TreeNode treeNode;

  public NewModel_Action() {
    super("Model", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    String stereotype = NewModel_Action.this.getStereotype();
    if (stereotype == null) {
      return true;
    }
    for (String availableStereotype : SModelStereotype.values) {
      if (stereotype.equals(availableStereotype)) {
        return true;
      }
    }
    return false;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "NewModel", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.module = event.getData(MPSDataKeys.CONTEXT_MODULE);
    if (this.module == null) {
      return false;
    }
    this.treeNode = event.getData(MPSDataKeys.LOGICAL_VIEW_NODE);
    if (this.treeNode == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.frame = null;
    this.project = null;
    this.context = null;
    this.module = null;
    this.treeNode = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      if (NewModel_Action.this.module.getSModelRoots().size() == 0) {
        JOptionPane.showMessageDialog(NewModel_Action.this.frame, "Can't create a model in solution with no model roots", "Can't create model", JOptionPane.ERROR_MESSAGE);
      }
      final Wrappers._T<NewModelDialog> dialog = new Wrappers._T<NewModelDialog>();
      final IOperationContext localContext = NewModel_Action.this.context;
      final IModule localModule = (localContext.getModule() != null ?
        localContext.getModule() :
        NewModel_Action.this.module
      );
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          String stereotype = NewModel_Action.this.getStereotype();
          dialog.value = new NewModelDialog(localModule, NewModel_Action.this.getNamespace(), localContext, stereotype, NewModel_Action.this.isStrict());
        }
      });
      dialog.value.showDialog();
      SModelDescriptor result = dialog.value.getResult();
      if (result != null) {
        SModelDescriptor modelDescriptor = result;
        ProjectPane.getInstance(NewModel_Action.this.project).selectModel(modelDescriptor);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "NewModel", t);
      }
    }
  }

  private StereotypeProvider getStereotypeProvider() {
    TreeNode parent = NewModel_Action.this.treeNode.getParent();
    while (parent != null) {
      if (parent instanceof StereotypeProvider) {
        return ((StereotypeProvider) parent);
      }
      parent = parent.getParent();
    }
    return null;
  }

  protected String getStereotype() {
    if (NewModel_Action.this.treeNode instanceof StereotypeProvider) {
      return ((StereotypeProvider) NewModel_Action.this.treeNode).getStereotype();
    } else if (NewModel_Action.this.treeNode instanceof NamespaceTextNode) {
      StereotypeProvider parent = NewModel_Action.this.getStereotypeProvider();
      if (parent != null) {
        return parent.getStereotype();
      }
    }
    return null;
  }

  protected boolean isStrict() {
    if (NewModel_Action.this.treeNode instanceof StereotypeProvider) {
      return ((StereotypeProvider) NewModel_Action.this.treeNode).isStrict();
    } else if (NewModel_Action.this.treeNode instanceof NamespaceTextNode) {
      StereotypeProvider parent = NewModel_Action.this.getStereotypeProvider();
      if (parent != null) {
        return parent.isStrict();
      }
    }
    return false;
  }

  protected String getNamespace() {
    return null;
  }
}
