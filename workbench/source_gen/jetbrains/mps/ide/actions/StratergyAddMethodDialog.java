package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.project.Project;
import jetbrains.mps.nodeEditor.EditorContext;
import java.awt.Frame;
import java.awt.HeadlessException;
import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.Type_Behavior;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.baseLanguage.behavior.VariableDeclaration_Behavior;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import com.intellij.openapi.actionSystem.AnAction;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelStereotype;
import java.util.HashMap;
import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.smodel.BaseAdapter;
import javax.swing.JComponent;
import com.intellij.openapi.actionSystem.ToggleAction;
import jetbrains.mps.baseLanguage.icons.Icons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.plugins.projectplugins.ProjectPluginManager;

public class StratergyAddMethodDialog extends BaseAddMethodDialog {
  private StratergyAddMethodDialog.ContainerStrategy myContainerStrategy;
  private StratergyAddMethodDialog.AdditionStrategy myAdditionStrategy;
  private StratergyAddMethodDialog.CollectMethodsStrategy myCollectStrategy;
  private StratergyAddMethodDialog.SortByNameAction mySortByNameAction;
  private Project myProject;

  public StratergyAddMethodDialog(EditorContext context, Frame mainFrame, StratergyAddMethodDialog.ContainerStrategy containerStrategy, StratergyAddMethodDialog.CollectMethodsStrategy collectStrategy, StratergyAddMethodDialog.AdditionStrategy additionStrategy) throws HeadlessException {
    super(context, mainFrame, additionStrategy.getTitle());
    myContainerStrategy = containerStrategy;
    myCollectStrategy = collectStrategy;
    myAdditionStrategy = additionStrategy;
    myProject = context.getOperationContext().getProject();
    mySortByNameAction = new StratergyAddMethodDialog.SortByNameAction(myProject);
  }

  private void setVariableNames(SNode node, Map<String, Integer> usedNames) {
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.VariableDeclaration")) {
      SNode variable = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.VariableDeclaration");
      SNode nodeType = SLinkOperations.getTarget(variable, "type", true);
      if (nodeType != null) {
        String name = ListSequence.fromList(Type_Behavior.call_getVariableSuffixes_1213877337304(nodeType)).first();
        if (MapSequence.fromMap(usedNames).containsKey(name)) {
          int i = MapSequence.fromMap(usedNames).get(name);
          i = i + 1;
          MapSequence.fromMap(usedNames).put(name, i);
          name = name + i;
        } else {
          MapSequence.fromMap(usedNames).put(name, 0);
        }
        String prefix = VariableDeclaration_Behavior.call_getPrefix_3012473318495495520(variable, myProject);
        String suffix = VariableDeclaration_Behavior.call_getSuffix_3012473318495499856(variable, myProject);
        String mainName = (StringUtils.isEmpty(prefix) ?
          name :
          NameUtil.capitalize(name)
        );
        SPropertyOperations.set(variable, "name", prefix + mainName + suffix);
      }
    }
    for (SNode child : SNodeOperations.getChildren(node)) {
      setVariableNames(child, usedNames);
    }
  }

  public List<BaseMethodDeclaration> collectImplementableMethods() {
    return myCollectStrategy.collectImplementableMethods(myContainerStrategy.getMainContainer());
  }

  protected List<AnAction> getToolbarActions() {
    List<AnAction> result = new ArrayList<AnAction>();
    result.addAll(super.getToolbarActions());
    result.add(mySortByNameAction);
    return result;
  }

  protected int compareMethods(BaseMethodDeclaration m1, BaseMethodDeclaration m2) {
    if (!(mySortByNameAction.isSelected())) {
      SNode n1 = m1.getNode();
      int i1 = myContainerStrategy.getContainer(n1).getIndexOfChild(n1);
      SNode n2 = m2.getNode();
      int i2 = myContainerStrategy.getContainer(n2).getIndexOfChild(n2);
      return i1 - i2;
    } else {
      String n1 = "" + m1.getName();
      String n2 = "" + m2.getName();
      return n1.compareTo(n2);
    }
  }

  public List<BaseMethodDeclaration> doAddMethods(List<BaseAddMethodDialog.MethodTreeNode> methodNodes) {
    List<BaseMethodDeclaration> result = new ArrayList<BaseMethodDeclaration>();
    List<SNode> methods = new ArrayList<SNode>();
    for (BaseAddMethodDialog.MethodTreeNode methodNode : methodNodes) {
      SNode method = methodNode.getMethod().getNode();
      methods.add(method);
    }
    List<StratergyAddMethodDialog.ContainerStrategy.MethodAddition> addedMethods = myContainerStrategy.doAddMethods(methods);
    for (StratergyAddMethodDialog.ContainerStrategy.MethodAddition added : addedMethods) {
      BaseMethodDeclaration addedMethodAdapter = added.getResult();
      SNode addedMethod = addedMethodAdapter.getNode();
      SModel sourceModel = added.getSource().getNode().getModel();
      if (SModelStereotype.isStubModelStereotype(sourceModel.getStereotype())) {
        setVariableNames(addedMethod, MapSequence.fromMap(new HashMap<String, Integer>()));
      }
      result.add(added.getResult());
      myAdditionStrategy.updateMethod(added.getSource().getNode(), added.getResult().getNode());
    }
    return result;
  }

  public INodeAdapter getContainer(BaseMethodDeclaration bm) {
    return myContainerStrategy.getContainer(BaseAdapter.fromAdapter(bm)).getAdapter();
  }

  protected int compareContainers(INodeAdapter c1, INodeAdapter c2) {
    return myContainerStrategy.compareContainers(c1, c2);
  }

  protected JComponent createAdditionalOptionsComponent() {
    return myAdditionStrategy.createAdditionalOptionsComponent();
  }

  public static interface ContainerStrategy {
    public SNode getMainContainer();
    public SNode getContainer(SNode methodDecl);
    public List<StratergyAddMethodDialog.ContainerStrategy.MethodAddition> doAddMethods(List<SNode> nodes);
    public int compareContainers(INodeAdapter c1, INodeAdapter c2);
    public static class MethodAddition {
      private BaseMethodDeclaration mySource;
      private BaseMethodDeclaration myResult;

      public MethodAddition(BaseMethodDeclaration source, BaseMethodDeclaration result) {
        mySource = source;
        myResult = result;
      }

      public BaseMethodDeclaration getSource() {
        return mySource;
      }

      public BaseMethodDeclaration getResult() {
        return myResult;
      }
    }

  }

  public static interface AdditionStrategy {
    public String getTitle();
    public JComponent createAdditionalOptionsComponent();
    public void updateMethod(SNode sourceMethod, SNode method);
  }

  public static interface CollectMethodsStrategy {
    public List<BaseMethodDeclaration> collectImplementableMethods(SNode container);
  }

  private class SortByNameAction extends ToggleAction {
    private Project myProject;

    private SortByNameAction(Project p) {
      super("Sort Alphabetically");
      getTemplatePresentation().setIcon(Icons.SORT_ALPHABETICALLY_ICON);
      myProject = p;
    }

    public boolean isSelected(AnActionEvent e) {
      return isSelected();
    }

    public void setSelected(AnActionEvent e, boolean state) {
      setSelected(state);
      StratergyAddMethodDialog.this.refreshTree();
    }

    public boolean isSelected() {
      return myProject.getComponent(ProjectPluginManager.class).getPrefsComponent(PersistentOptions_PreferencesComponent.class).getStateObject().sortAlphabetically;
    }

    public void setSelected(boolean state) {
      myProject.getComponent(ProjectPluginManager.class).getPrefsComponent(PersistentOptions_PreferencesComponent.class).getStateObject().sortAlphabetically = state;
    }
  }
}
