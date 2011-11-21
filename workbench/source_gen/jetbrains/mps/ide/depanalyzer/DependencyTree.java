package jetbrains.mps.ide.depanalyzer;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTree;
import com.intellij.openapi.actionSystem.DataProvider;
import com.intellij.openapi.project.Project;
import java.util.List;
import jetbrains.mps.project.IModule;
import java.util.Set;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.ui.TextMPSTreeNode;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import javax.swing.JPopupMenu;
import javax.swing.tree.TreePath;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseAction;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NonNls;
import jetbrains.mps.workbench.MPSDataKeys;

public class DependencyTree extends MPSTree implements DataProvider {
  private Project myProject;
  private List<IModule> myModules;
  private boolean myShowRuntime;
  private boolean myShowUsedLanguage = true;
  private Set<Tuples._2<DependencyUtil.Role, IModule>> myCycles;

  public DependencyTree(Project project) {
    myProject = project;
  }

  public Project getProject() {
    return myProject;
  }

  public void setModules(List<IModule> modules) {
    myModules = modules;
  }

  public boolean isShowRuntime() {
    return myShowRuntime;
  }

  public void setShowRuntime(boolean showRuntime) {
    myShowRuntime = showRuntime;
  }

  public boolean isShowUsedLanguage() {
    return myShowUsedLanguage;
  }

  public void setShowUsedLanguage(boolean showUsedLanguage) {
    myShowUsedLanguage = showUsedLanguage;
  }

  public Set<Tuples._2<DependencyUtil.Role, IModule>> getCycles() {
    return myCycles;
  }

  public void setCycles(Set<Tuples._2<DependencyUtil.Role, IModule>> cycles) {
    myCycles = cycles;
  }

  protected MPSTreeNode rebuild() {
    if (myModules == null || ListSequence.fromList(myModules).isEmpty()) {
      return new TextMPSTreeNode("No Content", null);
    }
    ModuleDependencyNode root = new ModuleDependencyNode(myModules, null);
    if (myCycles != null && SetSequence.fromSet(myCycles).select(new ISelector<Tuples._2<DependencyUtil.Role, IModule>, IModule>() {
      public IModule select(Tuples._2<DependencyUtil.Role, IModule> it) {
        return it._1();
      }
    }).intersect(ListSequence.fromList(myModules)).isNotEmpty()) {
      root.setCyclic();
    }
    expandRoot();
    return root;
  }

  @Override
  protected JPopupMenu createPopupMenu(MPSTreeNode treeNode) {
    TreePath[] selection = getSelectionPaths();
    if (selection != null && selection.length > 1) {
      return null;
    }
    ModuleDependencyNode current = as_he3vmc_a0a2a9(getCurrentNode(), ModuleDependencyNode.class);
    if (current == null || ListSequence.fromList(current.getModules()).count() != 1) {
      return null;
    }

    DefaultActionGroup group = ActionUtils.groupFromActions(((BaseAction) ActionManager.getInstance().getAction("jetbrains.mps.ide.actions.ModuleProperties_Action")));
    return ActionManager.getInstance().createActionPopupMenu(ActionPlaces.UNKNOWN, group).getComponent();
  }

  @Nullable
  public Object getData(@NonNls String id) {
    TreePath[] selection = getSelectionPaths();
    if (selection != null && selection.length > 1) {
      return null;
    }
    ModuleDependencyNode current = as_he3vmc_a0a2a01(getCurrentNode(), ModuleDependencyNode.class);
    if (current == null) {
      return null;
    }

    if (id.equals(MPSDataKeys.OPERATION_CONTEXT.getName())) {
      return current.getOperationContext();
    }
    if (id.equals(MPSDataKeys.MODULE.getName())) {
      return ListSequence.fromList(current.getModules()).first();
    }
    return null;
  }

  private static <T> T as_he3vmc_a0a2a9(Object o, Class<T> type) {
    return (type.isInstance(o) ?
      (T) o :
      null
    );
  }

  private static <T> T as_he3vmc_a0a2a01(Object o, Class<T> type) {
    return (type.isInstance(o) ?
      (T) o :
      null
    );
  }
}
