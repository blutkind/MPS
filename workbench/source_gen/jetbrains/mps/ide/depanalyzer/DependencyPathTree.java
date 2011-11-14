package jetbrains.mps.ide.depanalyzer;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTree;
import java.util.List;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import java.util.Set;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.ide.ui.MPSTreeNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.project.structure.modules.Dependency;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.project.DevKit;
import jetbrains.mps.project.Solution;
import jetbrains.mps.ide.ui.TextMPSTreeNode;

public class DependencyPathTree extends MPSTree {
  private List<Tuples._3<Set<IModule>, Set<IModule>, Set<Language>>> myAllDependencies = ListSequence.fromList(new ArrayList<Tuples._3<Set<IModule>, Set<IModule>, Set<Language>>>());

  public DependencyPathTree() {
  }

  public void resetDependencies() {
    ListSequence.fromList(myAllDependencies).clear();
  }

  public void addDependency(Iterable<IModule> from, Iterable<IModule> to, Iterable<Language> usedLanguage) {
    ListSequence.fromList(myAllDependencies).addElement(MultiTuple.<Set<IModule>,Set<IModule>,Set<Language>>from(SetSequence.fromSetWithValues(new HashSet<IModule>(), from), SetSequence.fromSetWithValues(new HashSet<IModule>(), to), SetSequence.fromSetWithValues(new HashSet<Language>(), usedLanguage)));
  }

  private void addChildDep(MPSTreeNode parent, IModule m, DependencyPathTree.DepType type, Set<IModule> dep, Set<Language> ulang, Set<DependencyPathTree.Dep> visited) {
    MPSTreeNode child = buildDependency(m, type, dep, ulang, visited);
    if (child != null) {
      parent.add(child);
    }
  }

  @Nullable
  private MPSTreeNode buildDependency(IModule from, DependencyPathTree.DepType type, Set<IModule> dependency, Set<Language> usedlangauge, Set<DependencyPathTree.Dep> visited) {
    if (SetSequence.fromSet(dependency).contains(from)) {
      return new DependencyTreeLeafNode(from, null);
    }
    DependencyPathTree.Dep dep = new DependencyPathTree.Dep(from, type);
    if (SetSequence.fromSet(visited).contains(dep)) {
      return null;
    }
    SetSequence.fromSet(visited).addElement(dep);

    MPSTreeNode result = new DependencyTreeNode(from, null);

    switch (type) {
      case M:
        for (Dependency d : ListSequence.fromList(from.getDependencies())) {
          addChildDep(result, MPSModuleRepository.getInstance().getModule(d.getModuleRef()), DependencyPathTree.DepType.D, dependency, usedlangauge, visited);
        }
        if (from instanceof Language) {
          for (Language l : ListSequence.fromList(((Language) from).getExtendedLanguages())) {
            addChildDep(result, l, DependencyPathTree.DepType.D, dependency, usedlangauge, visited);
          }
        }
        for (ModuleReference devkit : ListSequence.fromList(from.getUsedDevkitReferences())) {
          addChildDep(result, MPSModuleRepository.getInstance().getModule(devkit), DependencyPathTree.DepType.DK, dependency, usedlangauge, visited);
        }
        for (ModuleReference l : ListSequence.fromList(from.getUsedLanguagesReferences())) {
          addChildDep(result, MPSModuleRepository.getInstance().getModule(l), DependencyPathTree.DepType.UL, dependency, usedlangauge, visited);
        }
        break;

      case DK:
        DevKit dk = (DevKit) from;
        for (DevKit devkit : ListSequence.fromList(dk.getExtendedDevKits())) {
          addChildDep(result, devkit, DependencyPathTree.DepType.DK, dependency, usedlangauge, visited);
        }
        for (Language l : ListSequence.fromList(dk.getExportedLanguages())) {
          addChildDep(result, l, DependencyPathTree.DepType.UL, dependency, usedlangauge, visited);
        }
        for (Solution s : ListSequence.fromList(dk.getExportedSolutions())) {
          addChildDep(result, s, DependencyPathTree.DepType.D, dependency, usedlangauge, visited);
        }
        break;
      case UL:
        Language ul = (Language) from;
        for (Language l : ListSequence.fromList(ul.getExtendedLanguages())) {
          addChildDep(result, l, DependencyPathTree.DepType.UL, dependency, usedlangauge, visited);
        }
        for (ModuleReference m : ListSequence.fromList(ul.getRuntimeModulesReferences())) {
          addChildDep(result, MPSModuleRepository.getInstance().getModule(m), DependencyPathTree.DepType.R, dependency, usedlangauge, visited);
        }
        for (Dependency d : ListSequence.fromList(ul.getDependencies())) {
          if (d.isReexport()) {
            addChildDep(result, MPSModuleRepository.getInstance().getModule(d.getModuleRef()), DependencyPathTree.DepType.D, dependency, usedlangauge, visited);
          }
        }
        break;

      case D:
        for (Dependency d : ListSequence.fromList(from.getDependencies())) {
          addChildDep(result, MPSModuleRepository.getInstance().getModule(d.getModuleRef()), (d.isReexport() ?
            DependencyPathTree.DepType.D :
            DependencyPathTree.DepType.R
          ), dependency, usedlangauge, visited);

        }
        if (from instanceof Language) {
          for (Language l : ListSequence.fromList(((Language) from).getExtendedLanguages())) {
            addChildDep(result, l, DependencyPathTree.DepType.D, dependency, usedlangauge, visited);
          }
        }
        break;

      case R:
        for (Dependency d : ListSequence.fromList(from.getDependencies())) {
          addChildDep(result, MPSModuleRepository.getInstance().getModule(d.getModuleRef()), DependencyPathTree.DepType.R, dependency, usedlangauge, visited);
        }
      default:
    }

    return (result.getChildCount() > 0 ?
      result :
      null
    );
  }

  protected MPSTreeNode rebuild() {
    MPSTreeNode result = new TextMPSTreeNode((ListSequence.fromList(myAllDependencies).isEmpty() ?
      "no dependencies selected" :
      "Dependencies found"
    ), null);
    for (Tuples._3<Set<IModule>, Set<IModule>, Set<Language>> dep : ListSequence.fromList(myAllDependencies)) {
      for (IModule m : SetSequence.fromSet(dep._0())) {
        addChildDep(result, m, DependencyPathTree.DepType.M, dep._1(), dep._2(), SetSequence.fromSet(new HashSet<DependencyPathTree.Dep>()));
      }
    }
    setRootVisible(ListSequence.fromList(myAllDependencies).isEmpty());
    setShowsRootHandles(ListSequence.fromList(myAllDependencies).isNotEmpty());
    expandAll();
    return result;
  }

  public static   enum DepType {
    M(),
    DK(),
    UL(),
    D(),
    R();

    DepType() {
    }
  }

  public static class Dep {
    private IModule myModule;
    private DependencyPathTree.DepType myType;

    public Dep(IModule module, DependencyPathTree.DepType type) {
      myModule = module;
      myType = type;
    }

    public boolean equals(Object o) {
      if (!(o instanceof DependencyPathTree.Dep)) {
        return false;
      }
      DependencyPathTree.Dep d = (DependencyPathTree.Dep) o;
      return d.myModule.equals(myModule) && d.myType == myType;
    }

    public int hashCode() {
      return myModule.hashCode() + myType.hashCode();
    }
  }
}
