package jetbrains.mps.ypath.plugin;

/*Generated by MPS */

import com.intellij.openapi.project.Project;
import jetbrains.mps.plugins.pluginparts.custom.BaseCustomProjectPlugin;
import jetbrains.mps.plugins.pluginparts.tool.GeneratedTool;
import jetbrains.mps.plugins.projectplugins.BaseProjectPlugin;
import jetbrains.mps.project.MPSProject;

import java.util.ArrayList;
import java.util.List;

public class Ypath_ProjectPlugin extends BaseProjectPlugin {

  public void initEditors(MPSProject project) {
  }

  public List<GeneratedTool> initTools(Project project) {
    List<GeneratedTool> tools = new ArrayList<GeneratedTool>();
    return tools;
  }

  public List<BaseCustomProjectPlugin> initCustomParts(MPSProject project) {
    List<BaseCustomProjectPlugin> res = new ArrayList<BaseCustomProjectPlugin>();
    return res;
  }

  public void init(MPSProject project) {
    super.init(project);
  }

  public void dispose() {
    super.dispose();
  }

}
