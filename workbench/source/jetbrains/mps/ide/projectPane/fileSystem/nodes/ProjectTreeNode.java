package jetbrains.mps.ide.projectPane.fileSystem.nodes;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vcs.impl.VcsFileStatusProvider;
import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.ide.ui.customization.CustomizableActionsSchemas;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.projectPane.DefaultNamespaceTreeBuilder;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.Solution;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.vfs.VFileSystem;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

import org.jetbrains.annotations.NotNull;

public class ProjectTreeNode extends AbstractFileTreeNode {
  private final Project myProject;

  public ProjectTreeNode(Project project) {
    super(project, project.getBaseDir());
    myProject = project;

    MPSProjectHolder mpsProjectHolder = project.getComponent(MPSProjectHolder.class);
    List<ModuleTreeNode> moduleNodes = new LinkedList<ModuleTreeNode>();
    if (mpsProjectHolder != null) {
      List<IModule> modules = mpsProjectHolder.getMPSProject().getModules();
      for (IModule m : modules) {
        if (m.getDescriptorFile().exists()) {
          moduleNodes.add(new ModuleTreeNode(project, m));
        }
      }
    }

    Collections.sort(moduleNodes, new Comparator<ModuleTreeNode>() {
      public int compare(ModuleTreeNode node1, ModuleTreeNode node2) {
        IModule module1 = node1.getModule();
        IModule module2 = node2.getModule();
        if (module1.getClass().getName().equals(module2.getClass().getName())) {
          return node1.getText().compareTo(node2.getText());
        } else if (module1 instanceof Solution) {
          return -1;
        } else if (module2 instanceof Solution) {
          return 1;
        } else if (module1 instanceof Language) {
          return -1;
        } else {
          return 1;
        }
      }
    });


    MyNamespaceTreeBuilder builder = new MyNamespaceTreeBuilder();
    for (ModuleTreeNode mtn : moduleNodes) {
      builder.addNode(mtn);
    }
    builder.fillNode(this);

    VirtualFile baseDir = project.getBaseDir();
    if (baseDir != null) {
      VirtualFile[] files = baseDir.getChildren();
      for (VirtualFile f : files) {
        if (!f.isDirectory()) {
          add(new FileTreeNode(project, f));
        }
      }
    }

    updatePresentation();
  }

  @Override
  protected void updatePresentation() {
    super.updatePresentation();
    setText(myProject.getName());
  }

  private class MyNamespaceTreeBuilder extends DefaultNamespaceTreeBuilder {
    protected String getNamespace(@NotNull MPSTreeNode node) {
      String folder = "";
      if (node instanceof ModuleTreeNode) {
        folder = myProject.getComponent(MPSProjectHolder.class).getMPSProject().getFolderFor(((ModuleTreeNode) node).getModule());
      }
      if (folder == null) {
        return "";
      }
      return folder;
    }

    @Override
    protected boolean isSorted() {
      return false;
    }
  }

}
