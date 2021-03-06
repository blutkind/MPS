package jetbrains.mps.ide.dependencyViewer;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.view.UsagesView;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.ViewOptions;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.UsagesTree;
import jetbrains.mps.project.IModule;
import jetbrains.mps.ide.ui.MPSTreeNode;
import java.util.Enumeration;
import jetbrains.mps.ide.findusages.view.treeholder.tree.DataNode;
import jetbrains.mps.ide.findusages.view.treeholder.tree.nodedatatypes.BaseNodeData;
import jetbrains.mps.ide.findusages.view.treeholder.tree.nodedatatypes.ModuleNodeData;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.TreePath;
import jetbrains.mps.ide.findusages.view.treeholder.tree.nodedatatypes.ModelNodeData;
import jetbrains.mps.ide.findusages.view.treeholder.tree.nodedatatypes.NodeNodeData;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.INodeRepresentator;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.ide.findusages.model.CategoryKind;
import java.util.Collections;
import javax.swing.Icon;
import jetbrains.mps.ide.findusages.view.treeholder.tree.TextOptions;
import jetbrains.mps.ide.projectPane.Icons;
import org.apache.commons.lang.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jdom.Element;
import jetbrains.mps.ide.findusages.CantLoadSomethingException;
import jetbrains.mps.ide.findusages.CantSaveSomethingException;

public class TargetsView extends UsagesView {
  private DependenciesPanel myParent;

  public TargetsView(Project project, DependenciesPanel parent) {
    super(project, new ViewOptions(true, true, false, false, false, false));
    UsagesTree usagesTree = getTreeComponent().getTree();
    usagesTree.addTreeSelectionListener(new TargetsView.MyTreeSelectionListener(usagesTree, parent));
    myParent = parent;
    setCustomNodeRepresentator(new TargetsView.MyNodeRepresentator());
    usagesTree.setSelectionRow(0);
    usagesTree.setShowPopupMenu(false);
  }

  public void close() {
  }

  public void selectModule(IModule module) {
    MPSTreeNode node = findModule(module);
    if (node != null) {
      getTreeComponent().getTree().selectNode(node);
    }
  }

  private MPSTreeNode findModule(IModule module) {
    UsagesTree usagesTree = getTreeComponent().getTree();
    Enumeration nodes = usagesTree.getRootNode().breadthFirstEnumeration();
    while (nodes.hasMoreElements()) {
      MPSTreeNode treeNode = as_w7qo2b_a0a0a2a2(nodes.nextElement(), MPSTreeNode.class);
      if (treeNode == null) {
        continue;
      }
      Object userObject = treeNode.getUserObject();
      if (userObject instanceof DataNode) {
        BaseNodeData data = ((DataNode) userObject).getData();
        if (data instanceof ModuleNodeData) {
          if (((ModuleNodeData) data).getModule() == module) {
            return treeNode;
          }
        }
      }
    }
    return null;
  }

  private static <T> T as_w7qo2b_a0a0a0a1a2a3a0a(Object o, Class<T> type) {
    return (type.isInstance(o) ?
      (T) o :
      null
    );
  }

  private static <T> T as_w7qo2b_a0a0a0a2a2a3a0a(Object o, Class<T> type) {
    return (type.isInstance(o) ?
      (T) o :
      null
    );
  }

  private static <T> T as_w7qo2b_a0a0a0a3a2a3a0a(Object o, Class<T> type) {
    return (type.isInstance(o) ?
      (T) o :
      null
    );
  }

  private static <T> T as_w7qo2b_a0a0a2a2(Object o, Class<T> type) {
    return (type.isInstance(o) ?
      (T) o :
      null
    );
  }

  public class MyTreeSelectionListener implements TreeSelectionListener {
    private UsagesTree myTree;
    private DependenciesPanel myDependenciesComponent;

    public MyTreeSelectionListener(UsagesTree tree, DependenciesPanel parent) {
      myTree = tree;
      myDependenciesComponent = parent;
    }

    public void valueChanged(TreeSelectionEvent event) {
      TreePath[] paths = myTree.getSelectionPaths();
      if (paths == null || paths.length == 0) {
        return;
      }
      Scope scope = new Scope();
      for (TreePath path : paths) {
        MPSTreeNode node = (MPSTreeNode) path.getLastPathComponent();
        Object userObject = node.getUserObject();
        if (userObject instanceof DataNode) {
          BaseNodeData data = ((DataNode) userObject).getData();
          if (data instanceof ModelNodeData) {
            scope.add(as_w7qo2b_a0a0a0a1a2a3a0a(data, ModelNodeData.class).getModelDescriptor());
          }
          if (data instanceof ModuleNodeData) {
            scope.add(as_w7qo2b_a0a0a0a2a2a3a0a(data, ModuleNodeData.class).getModule());
          }
          if (data instanceof NodeNodeData) {
            scope.add(as_w7qo2b_a0a0a0a3a2a3a0a(data, NodeNodeData.class).getNode());
          }
        }
      }
      myDependenciesComponent.updateReferencesView(scope);
    }
  }

  public class MyNodeRepresentator implements INodeRepresentator<SNode> {
    public MyNodeRepresentator() {
    }

    public List<CategoryKind> getCategoryKinds() {
      return Collections.emptyList();
    }

    public Icon getCategoryIcon(String string) {
      return null;
    }

    public String getCategoryText(TextOptions options, String string, boolean b) {
      return "Targets";
    }

    public Icon getResultsIcon() {
      return Icons.REFERENCE_ICON;
    }

    public String getResultsText(TextOptions options) {
      String presentation = myParent.getCurrentScope().getPresentation();
      if (StringUtils.isEmpty(presentation)) {
        presentation = "the left tree scope selection";
      }
      return "Dependencies of " + presentation;
    }

    @NotNull
    public String getPresentation(SNode node) {
      return node.getPresentation();
    }

    public void read(Element element, jetbrains.mps.project.Project project) throws CantLoadSomethingException {
    }

    public void write(Element element, jetbrains.mps.project.Project project) throws CantSaveSomethingException {
    }
  }
}
