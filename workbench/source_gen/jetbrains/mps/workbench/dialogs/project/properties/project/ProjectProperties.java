package jetbrains.mps.workbench.dialogs.project.properties.project;

/*Generated by MPS */

import jetbrains.mps.project.structure.project.ProjectDescriptor;
import java.util.List;
import jetbrains.mps.project.structure.project.Path;
import jetbrains.mps.workbench.dialogs.project.components.parts.lists.ListsFactory;
import jetbrains.mps.project.structure.project.testconfigurations.BaseTestConfiguration;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.IVisitor;

public class ProjectProperties {
  public static final String PROPERTY_NAME = "name";
  public static final String PROPERTY_MODULES = "modules";
  public static final String PROPERTY_GEN_CONFIGS = "testConfigurations";

  private ProjectDescriptor myProjectDescriptor;
  private List<Path> myModules = ListsFactory.create(ListsFactory.PATH_VALID_COMPARATOR);
  private List<BaseTestConfiguration> myTestConfigs = ListsFactory.create(ListsFactory.GEN_CONF_COMPARATOR);
  private boolean myTestConfigsChanged = false;

  public ProjectProperties() {
  }

  public void testConfigsChanged() {
    myTestConfigsChanged = true;
  }

  public List<Path> getModules() {
    return myModules;
  }

  public List<BaseTestConfiguration> getTestConfigurations() {
    return myTestConfigs;
  }

  public boolean isSame(ProjectDescriptor projectDescriptor) {
    List<Path> paths = ListsFactory.createSortedList(ListsFactory.PATH_COMPARATOR);
    paths.addAll(myProjectDescriptor.getModules());
    if (!(paths.equals(myModules))) {
      return false;
    }
    return !(myTestConfigsChanged);
  }

  public void loadFrom(MPSProject project) {
    myProjectDescriptor = project.getProjectDescriptor();
    myModules.clear();
    myModules.addAll(myProjectDescriptor.getModules());
    myTestConfigs.clear();
    myTestConfigs.addAll(myProjectDescriptor.getTestConfigurations());
  }

  public void saveTo(MPSProject project) {
    ListSequence.fromList(ListSequence.fromListWithValues(new ArrayList<Path>(), myProjectDescriptor.getModules())).visitAll(new IVisitor<Path>() {
      public void visit(Path it) {
        myProjectDescriptor.removeModule(it.getPath());
      }
    });
    for (Path path : myModules) {
      myProjectDescriptor.addModule(path);
    }

    myProjectDescriptor.getTestConfigurations().clear();
    myProjectDescriptor.getTestConfigurations().addAll(myTestConfigs);
    project.setProjectDescriptor(myProjectDescriptor);
  }
}
