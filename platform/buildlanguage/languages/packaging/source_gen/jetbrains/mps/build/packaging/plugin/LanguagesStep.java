package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import com.intellij.openapi.project.Project;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.MPSProjectHolder;
import javax.swing.JComponent;
import java.util.List;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Comparator;
import jetbrains.mps.project.Solution;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.ide.projectPane.NamespaceTreeBuilder;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.LinkedHashSet;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.GridBagConstraints;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.ui.MPSTreeNode;

public class LanguagesStep extends AbstractStep {
  private final Project myProject;
  private final AbstractBuildGenerator myGenerator;
  private CheckBoxTree myCheckTree;
  private final MPSProject myMpsProject;
  private final IErrorHandler myHandler;

  public LanguagesStep(Project project, AbstractBuildGenerator generator, IErrorHandler handler) {
    this.myGenerator = generator;
    this.myProject = project;
    this.myMpsProject = this.myProject.getComponent(MPSProjectHolder.class).getMPSProject();
    this.myHandler = handler;
  }

  public void _init() {
    super._init();
    String errorText = null;
    if (!(this.myGenerator.isValid())) {
      errorText = "Invalid input in previous steps.";
    }
    this.myHandler.setErrorText(errorText);
  }

  public JComponent createMainComponent() {
    this.myCheckTree = this.createCheckTree();
    return this.myCheckTree;
  }

  public CheckBoxTree createCheckTree() {
    List<IModule> allModules = this.myMpsProject.getModules();
    ModulesListData data = new ModulesListData(allModules);
    List<ModuleData> children = data.getModules();
    ListSequence.fromList(children).sort(new Comparator<ModuleData>() {
      public int compare(ModuleData data1, ModuleData data2) {
        IModule module1 = data1.getModule();
        IModule module2 = data2.getModule();
        if (module1.getClass().getName().equals(module2.getClass().getName())) {
          return data1.getText().compareToIgnoreCase(data2.getText());
        } else if (module1 instanceof Solution) {
          return -1;
        } else if (module2 instanceof Solution) {
          return 1;
        } else if (module1 instanceof Language) {
          return -1;
        }
        return 1;
      }
    }, true);
    NamespaceTreeBuilder builder = new LanguagesStep.MyTreeBuilder(this.myMpsProject);
    for (ModuleData moduleData : ListSequence.fromList(children)) {
      builder.addNode(new CheckBoxNode(moduleData, false));
    }
    CheckBoxNode allModulesNode = new CheckBoxNode(data, false);
    builder.fillNode(allModulesNode);
    this.fillChildren(allModulesNode);
    return new CheckBoxTree(allModulesNode);
  }

  public <N extends NodeData>void fillChildren(CheckBoxNode<N> node) {
    int childCount = node.getChildCount();
    for (int i = 0 ; i < childCount ; i++ ) {
      N data = node.getData();
      CheckBoxNode<N> child = (CheckBoxNode<N>)node.getChildAt(i);
      NodeData childData = child.getData();
      data.addChildren(childData);
      childData.setParent(data);
      this.fillChildren(child);
    }
  }

  public String getDescription() {
    return "Languages and solutions included in build.";
  }

  public void _commit(boolean finish) {
    Set<NodeData> selectedItems = this.myCheckTree.getSelectedItems();
    Set<NodeData> modules = SetSequence.fromSet(new LinkedHashSet<NodeData>());
    for (NodeData item : SetSequence.fromSet(selectedItems)) {
      this.fillWithParents(item, modules);
    }
    List<NodeData> toSort = ListSequence.fromListWithValues(new LinkedList<NodeData>(), modules);
    ListSequence.fromList(toSort).sort(new Comparator<NodeData>() {
      public int compare(NodeData a, NodeData b) {
        if ((a instanceof NamespaceData) && (b instanceof ModuleData)) {
          return -1;
        } else if ((a instanceof ModuleData) && (b instanceof NamespaceData)) {
          return 1;
        }
        return a.getText().compareToIgnoreCase(b.getText());
      }
    }, true);
    this.myGenerator.setModules(toSort);
  }

  public void fillWithParents(NodeData item, Set<NodeData> collection) {
    SetSequence.fromSet(collection).addElement(item);
    if (item.getParent() != null) {
      this.fillWithParents(item.getParent(), collection);
    }
  }

  protected void createComponent() {
    if (this.myMainPanel == null) {
      this.myMainPanel = new JPanel(new GridBagLayout());
      this.myMainPanel.add(new JLabel(this.getDescription()), this.createConstraint(0, 0));
      JComponent mainComponent = this.createMainComponent();
      mainComponent.setBorder(new EtchedBorder());
      GridBagConstraints constraints = this.createConstraint(1, 1);
      constraints.fill = GridBagConstraints.BOTH;
      this.myMainPanel.add(mainComponent, constraints);
    }
    this.myMainPanel.doLayout();
  }

  public static class MyTreeBuilder extends NamespaceTreeBuilder<CheckBoxNode, CheckBoxNamespaceNode> {
    private MPSProject myMpsProject;

    public MyTreeBuilder(MPSProject mpsProject) {
      super(new NamespaceTreeBuilder.NamespaceNodeBuilder<CheckBoxNamespaceNode>() {
        public CheckBoxNamespaceNode createNamespaceNode(String text, IOperationContext context) {
          return new CheckBoxNamespaceNode(new NamespaceData(text));
        }

        public String getName(CheckBoxNamespaceNode p0) {
          return p0.getName();
        }

        public boolean isNamespaceNode(MPSTreeNode p0) {
          return p0 instanceof CheckBoxNamespaceNode;
        }

        public void setName(CheckBoxNamespaceNode p0, String p1) {
          p0.setName(p1);
        }
      });
      this.myMpsProject = mpsProject;
    }

    protected String getNamespace(CheckBoxNode node) {
      NodeData data = node.getData();
      String namespace = "";
      if (data instanceof ModuleData) {
        ModuleData moduleData = (ModuleData)data;
        namespace = this.myMpsProject.getFolderFor(moduleData.getModule());
      }
      if (namespace == null) {
        return "";
      }
      return namespace;
    }
  }
}
