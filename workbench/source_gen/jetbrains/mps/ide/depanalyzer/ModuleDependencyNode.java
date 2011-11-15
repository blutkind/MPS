package jetbrains.mps.ide.depanalyzer;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTreeNode;
import java.util.List;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.ide.moduleDependencies.icons.Icons;
import javax.swing.tree.TreeNode;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.project.dependency.DependenciesManager;
import jetbrains.mps.ide.ui.TextMPSTreeNode;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class ModuleDependencyNode extends MPSTreeNode {
  private List<IModule> myModules;
  private boolean myInitialized;

  public ModuleDependencyNode(IModule module, boolean isRuntime, IOperationContext context) {
    this(ListSequence.fromListAndArray(new ArrayList<IModule>(), module), context);
    if (isRuntime) {
      setNodeIdentifier(getNodeIdentifier() + " (runtime)");
    }
  }

  public ModuleDependencyNode(List<IModule> modules, IOperationContext context) {
    super(context);
    myModules = modules;
    if ((int) ListSequence.fromList(modules).count() == 1) {
      setIcon(IconManager.getIconFor(ListSequence.fromList(modules).first()));
    }
    String text = ListSequence.fromList(modules).first().getModuleFqName();
    if (ListSequence.fromList(modules).count() > 1) {
      text += ", " + ListSequence.fromList(modules).getElement(1).getModuleFqName();
      if (ListSequence.fromList(modules).count() > 2) {
        text += ", ... (" + ListSequence.fromList(modules).count() + " modules)";
      }
      setIcon(Icons.MODULES_GROUP_ICON);
    }
    setNodeIdentifier(text);
  }

  public List<IModule> getModules() {
    return myModules;
  }

  public ModuleDependencyNode getFromNode() {
    TreeNode n = getParent();
    if (n != null) {
      n = n.getParent();
    }
    if (n != null && n instanceof ModuleDependencyNode) {
      return (ModuleDependencyNode) n;
    }
    return null;
  }

  protected void doInit() {
    Set<IModule> reqModules = SetSequence.fromSet(new HashSet<IModule>());
    Set<IModule> rtModules = SetSequence.fromSet(new HashSet<IModule>());
    Set<Language> usedLanguages = SetSequence.fromSet(new HashSet<Language>());

    for (IModule module : ListSequence.fromList(myModules)) {
      DependenciesManager depManager = module.getDependenciesManager();
      SetSequence.fromSet(reqModules).addSequence(SetSequence.fromSet(depManager.getAllVisibleModules()));
      SetSequence.fromSet(rtModules).addSequence(SetSequence.fromSet(depManager.getAllRequiredModules()));
      SetSequence.fromSet(usedLanguages).addSequence(SetSequence.fromSet(depManager.getAllUsedLanguages()));
    }

    DependencyTree tree = (DependencyTree) getTree();
    MPSTreeNode dependencies = new TextMPSTreeNode("Dependencies", getOperationContext());
    Set<IModule> allModules = (tree.isShowRuntime() ?
      rtModules :
      reqModules
    );
    for (IModule m : SetSequence.fromSet(allModules).sort(new ISelector<IModule, Comparable<?>>() {
      public Comparable<?> select(IModule it) {
        return it.getModuleFqName();
      }
    }, true)) {
      dependencies.add(new ModuleDependencyNode(m, !(SetSequence.fromSet(reqModules).contains(m)), getOperationContext()));
    }
    add(dependencies);

    if (tree.isShowUsedLanguage()) {
      MPSTreeNode usedlanguages = new TextMPSTreeNode("Used languages", getOperationContext());
      for (Language l : SetSequence.fromSet(usedLanguages).sort(new ISelector<Language, Comparable<?>>() {
        public Comparable<?> select(Language it) {
          return it.getModuleFqName();
        }
      }, true)) {
        usedlanguages.add(new ModuleDependencyNode(l, false, getOperationContext()));
      }
      add(usedlanguages);
    }
    myInitialized = true;
  }

  public boolean isInitialized() {
    return myInitialized;
  }
}
