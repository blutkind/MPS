package jetbrains.mps.workbench.dialogs.project.components.parts.lists;

/*Generated by MPS */

import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.workbench.dialogs.project.components.parts.StateUtil;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.project.structure.modules.Dependency;
import jetbrains.mps.project.structure.modules.ClassPathEntry;
import jetbrains.mps.project.structure.modules.StubSolution;
import jetbrains.mps.project.structure.modules.StubModelsEntry;
import jetbrains.mps.project.structure.project.Path;
import jetbrains.mps.project.structure.project.testconfigurations.BaseTestConfiguration;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;
import jetbrains.mps.smodel.IScope;
import java.util.Comparator;

public final class ListsFactory {
  public static final ListsFactory.ListComparator<SModelReference> MODEL_REF_COMPARATOR = new ListsFactory.ListComparator<SModelReference>() {
    public int compare(SModelReference o1, SModelReference o2) {
      int compareStereotypes = o1.getStereotype().compareTo(o2.getStereotype());
      if (compareStereotypes != 0) {
        return compareStereotypes;
      }
      return o1.getLongName().compareTo(o2.getLongName());
    }

    public boolean isEqual(SModelReference o1, SModelReference o2) {
      if (super.isEqual(o1, o2)) {
        return true;
      }
      SModelDescriptor m1 = SModelRepository.getInstance().getModelDescriptor(o1);
      SModelDescriptor m2 = SModelRepository.getInstance().getModelDescriptor(o2);
      return EqualUtil.equals(m1, m2);
    }
  };
  public static final ListsFactory.ListComparator<ModuleReference> MODULE_REF_COMPARATOR = new ListsFactory.ListComparator<ModuleReference>() {
    public int compare(ModuleReference o1, ModuleReference o2) {
      return o1.getModuleFqName().compareTo(o2.getModuleFqName());
    }

    public boolean isEqual(ModuleReference o1, ModuleReference o2) {
      if (super.isEqual(o1, o2)) {
        return true;
      }
      IModule m1 = MPSModuleRepository.getInstance().getModule(o1);
      IModule m2 = MPSModuleRepository.getInstance().getModule(o2);
      return EqualUtil.equals(m1, m2);
    }
  };
  public static final ListsFactory.ListComparator<ModuleReference> MODULE_VALID_REF_COMPARATOR = new ListsFactory.ListComparator<ModuleReference>() {
    public int compare(ModuleReference o1, ModuleReference o2) {
      int result = StateUtil.compare(o1, o2);
      if (result != 0) {
        return result;
      }
      return ListsFactory.MODULE_REF_COMPARATOR.compare(o1, o2);
    }

    public boolean isEqual(ModuleReference o1, ModuleReference o2) {
      return ListsFactory.MODULE_REF_COMPARATOR.isEqual(o1, o2);
    }
  };
  public static final ListsFactory.ListComparator<ModelRoot> MODEL_ROOT_COMPARATOR = new ListsFactory.ListComparator<ModelRoot>() {
    public int compare(ModelRoot o1, ModelRoot o2) {
      return o1.getPath().compareTo(o2.getPath());
    }

    public boolean isEqual(ModelRoot o1, ModelRoot o2) {
      if (super.isEqual(o1, o2)) {
        return true;
      }
      return EqualUtil.equals(o1.getPath(), o2.getPath());
    }
  };
  public static final ListsFactory.ListComparator<Dependency> DEPENDENCY_COMPARATOR = new ListsFactory.ListComparator<Dependency>() {
    public int compare(Dependency o1, Dependency o2) {
      return o1.getModuleRef().getModuleFqName().compareTo(o2.getModuleRef().getModuleFqName());
    }

    public boolean isEqual(Dependency o1, Dependency o2) {
      if (super.isEqual(o1, o2)) {
        return true;
      }
      IModule m1 = MPSModuleRepository.getInstance().getModule(o1.getModuleRef());
      IModule m2 = MPSModuleRepository.getInstance().getModule(o2.getModuleRef());
      return EqualUtil.equals(m1, m2);
    }
  };
  public static final ListsFactory.ListComparator<ClassPathEntry> CLASSPATH_ENTRY_COMPARATOR = new ListsFactory.ListComparator<ClassPathEntry>() {
    public int compare(ClassPathEntry o1, ClassPathEntry o2) {
      return o1.getPath().compareTo(o2.getPath());
    }

    public boolean isEqual(ClassPathEntry o1, ClassPathEntry o2) {
      if (super.isEqual(o1, o2)) {
        return true;
      }
      return EqualUtil.equals(o1.getPath(), o2.getPath());
    }
  };
  public static final ListsFactory.ListComparator<StubSolution> STUB_SOLUTIONS_ENTRY_COMPARATOR = new ListsFactory.ListComparator<StubSolution>() {
    public int compare(StubSolution o1, StubSolution o2) {
      return o1.getName().compareTo(o2.getName());
    }

    public boolean isEqual(StubSolution o1, StubSolution o2) {
      return EqualUtil.equals(o1.getName(), o2.getName()) && EqualUtil.equals(o1.getId(), o2.getId());
    }
  };
  public static final ListsFactory.ListComparator<StubModelsEntry> STUB_MODEL_ENTRY_COMPARATOR = new ListsFactory.ListComparator<StubModelsEntry>() {
    public int compare(StubModelsEntry o1, StubModelsEntry o2) {
      return o1.getPath().compareTo(o2.getPath());
    }

    public boolean isEqual(StubModelsEntry o1, StubModelsEntry o2) {
      if (super.isEqual(o1, o2)) {
        return true;
      }
      return EqualUtil.equals(o1.getPath(), o2.getPath()) && EqualUtil.equals(o1.getManager(), o2.getManager());
    }
  };
  public static final ListsFactory.ListComparator<Path> PATH_COMPARATOR = new ListsFactory.ListComparator<Path>() {
    private String getPathString(Path path) {
      return ((path == null) ?
        "null" :
        path.getPath() + "#" + path.getMPSFolder()
      );
    }

    public int compare(Path o1, Path o2) {
      if (o1 == o2) {
        return 0;
      }
      String string1 = getPathString(o1);
      String string2 = getPathString(o2);
      return string1.compareTo(string2);
    }
  };
  public static final ListsFactory.ListComparator<Path> PATH_VALID_COMPARATOR = new ListsFactory.ListComparator<Path>() {
    public int compare(Path o1, Path o2) {
      int result = StateUtil.compare(o1.getPath(), o2.getPath());
      if (result != 0) {
        return result;
      }
      return ListsFactory.PATH_COMPARATOR.compare(o1, o2);
    }
  };
  public static final ListsFactory.ListComparator<BaseTestConfiguration> GEN_CONF_COMPARATOR = new ListsFactory.ListComparator<BaseTestConfiguration>() {
    public int compare(BaseTestConfiguration o1, BaseTestConfiguration o2) {
      return o1.getName().compareTo(o2.getName());
    }
  };
  public static final ListsFactory.ListComparator<Comparable> COMPARABLE_COMPARATOR = new ListsFactory.ListComparator<Comparable>() {
    public int compare(Comparable o1, Comparable o2) {
      return o1.compareTo(o2);
    }
  };
  public static final ListsFactory.ListComparator<Object> IGNORING_COMPARATOR = new ListsFactory.ListComparator<Object>() {
    @SuppressWarnings(value = {"ComparatorMethodParameterNotUsed"})
    public int compare(Object o1, Object o2) {
      return 0;
    }
  };

  public ListsFactory() {
  }

  public static <T> List<T> createSortedList(ListsFactory.ListComparator<T> comparator) {
    return new SortedList<T>(comparator);
  }

  public static <T> List<T> create(ListsFactory.ListComparator<T> comparator) {
    return ObservableCollections.observableList(ListsFactory.createSortedList(comparator));
  }

  public static ListsFactory.ListComparator<SModelReference> createValidRefComparator(final IScope scope) {
    return new ListsFactory.ListComparator<SModelReference>() {
      public int compare(SModelReference o1, SModelReference o2) {
        int result = 0;
        if (scope != null) {
          result = StateUtil.compare(o1, o2, scope);
        }
        if (result != 0) {
          return result;
        }
        return ListsFactory.MODEL_REF_COMPARATOR.compare(o1, o2);
      }

      public boolean isEqual(SModelReference o1, SModelReference o2) {
        return ListsFactory.MODEL_REF_COMPARATOR.isEqual(o1, o2);
      }
    };
  }

  public static abstract class ListComparator<T> implements Comparator<T> {
    public ListComparator() {
    }

    public boolean isEqual(T o1, T o2) {
      return EqualUtil.equals(o1, o2);
    }
  }
}
