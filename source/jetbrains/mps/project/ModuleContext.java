package jetbrains.mps.project;

import jetbrains.mps.ide.AbstractProjectFrame;
import jetbrains.mps.ide.BaseDialog;
import jetbrains.mps.ide.DialogDimensionsSettings;
import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.ui.TextTreeNode;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.tree.TreePath;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: Igoor
 * Date: Sep 9, 2005
 * Time: 7:55:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class ModuleContext extends StandaloneMPSContext {
  private static final Logger LOG = Logger.getLogger(ModuleContext.class);

  private MPSProject myProject;
  private IModule myModule;

  public ModuleContext(IModule module, MPSProject project) {
    myModule = module;
    myProject = project;
  }

  public <T> T getComponent(@NotNull Class<T> clazz) {
    T component = myProject.getComponent(clazz);
    if (component != null) return component;
    return super.getComponent(clazz);
  }

  @NotNull
  public IModule getModule() {
    return myModule;
  }

  @NotNull
  public MPSProject getProject() {
    return myProject;
  }

  @NotNull
  public IScope getScope() {
    return myModule.getScope();
  }

  public String toString() {
    return "module context: " + myModule;
  }

  public static ModuleContext create(SNode node, AbstractProjectFrame frame) {
    return create(node.getModel(), frame, true);
  }

  public static ModuleContext create(SModel model, AbstractProjectFrame frame, boolean askIfMany) {
    MPSProject project = frame.getProject();

    SModelDescriptor modelDescriptor = SModelRepository.getInstance().getModelDescriptor(model);
    assert modelDescriptor != null;
    Set<IModule> owningModules = SModelRepository.getInstance().getOwners(modelDescriptor, IModule.class);
    if (owningModules.isEmpty()) {
      LOG.error("Couldn't create module context for node:" +
              "\nCouldn't find owner module for model \"" + modelDescriptor.getModelUID() + "\"");
      return null;
    }

    if (owningModules.size() > 1) {
      Iterator<IModule> it = owningModules.iterator();
      while (it.hasNext()) {
        IModule m = it.next();
        if (m instanceof Solution && "outputModels".equals(((Solution) m).getSolutionDescriptor().getName())) {
          it.remove();
        }
      }
    }

    IModule module;
    if (owningModules.size() == 1 || !askIfMany) {
      module = owningModules.iterator().next();
    } else {
      ChooseModuleDialog md = new ChooseModuleDialog(frame.getMainFrame(), owningModules);
      md.showDialog();
      module = md.getResult();
    }

    return new ModuleContext(module, project);
  }

  private static class ChooseModuleDialog extends BaseDialog {
    private MPSTree myTree = new MPSTree() {
      protected MPSTreeNode rebuild() {
        return ChooseModuleDialog.this.rebuild();
      }
    };
    private Set<IModule> myModules = new HashSet<IModule>();
    private IModule myResult;
    private JComponent myComponent = new JScrollPane(myTree);

    public ChooseModuleDialog(Frame mainFrame, Collection<IModule> modules) throws HeadlessException {
      super(mainFrame, "Choose Context Module");
      myModules.addAll(modules);
      myTree.setRootVisible(false);
      myTree.rebuildNow();
    }

    public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
      return new DialogDimensionsSettings.DialogDimensions(200, 200, 400, 300);
    }

    private MPSTreeNode rebuild() {
      TextTreeNode root = new TextTreeNode("Root");
      for (IModule m : myModules) {
        root.add(new ModuleTreeNode(m));
      }

      return root;
    }

    protected JComponent getMainComponent() {
      return myComponent;
    }

    public IModule getResult() {
      return myResult;
    }

    @BaseDialog.Button(position = 0, name = "OK")
    public void okButton() {
      TreePath selection = myTree.getSelectionPath();
      if (selection == null || !(selection.getLastPathComponent() instanceof ModuleTreeNode)) {
        JOptionPane.showMessageDialog(this, "Choose Module", "Error", JOptionPane.ERROR_MESSAGE);
        return;
      }
      myResult = (IModule) ((ModuleTreeNode) selection.getLastPathComponent()).getModule();
      dispose();
    }

    public class ModuleTreeNode extends MPSTreeNode {
      private IModule myModule;

      public ModuleTreeNode(IModule module) {
        super(module, null);
        myModule = module;
      }

      public void doubleClick() {
        okButton();
      }

      public IModule getModule() {
        return myModule;
      }

      public boolean isLeaf() {
        return true;
      }

      public String getNodeIdentifier() {
        return myModule.toString();
      }
    }
  }
}
