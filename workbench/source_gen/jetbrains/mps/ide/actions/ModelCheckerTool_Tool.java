package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.tool.GeneratedTool;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.icons.IconManager;
import com.intellij.openapi.wm.ToolWindowAnchor;
import javax.swing.JComponent;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.IModule;
import jetbrains.mps.ide.projectPane.Icons;
import com.intellij.ui.content.ContentManager;
import com.intellij.ui.content.Content;

public class ModelCheckerTool_Tool extends GeneratedTool {
  private MPSProject myProject;

  public ModelCheckerTool_Tool(Project project) {
    super(project, "Model Checker", -1, IconManager.EMPTY_ICON, ToolWindowAnchor.BOTTOM, false);
  }

  public JComponent getComponent() {
    return null;
  }

  public void init(Project project) {
    ModelCheckerTool_Tool.this.myProject = project.getComponent(MPSProjectHolder.class).getMPSProject();
  }

  public void checkModel(SModelDescriptor modelDescriptior) {
    ModelCheckerViewer newViewer = new ModelCheckerViewer(ModelCheckerTool_Tool.this.myProject, ModelCheckerTool_Tool.this);
    if (newViewer.checkModel(modelDescriptior.getSModel())) {
      ModelCheckerTool_Tool.this.addContent(newViewer, modelDescriptior.getName(), IconManager.getIconFor(modelDescriptior), true);
      ModelCheckerTool_Tool.this.setSelectedComponent(newViewer);
    }
  }

  public void checkModule(IModule module) {
    ModelCheckerViewer newViewer = new ModelCheckerViewer(ModelCheckerTool_Tool.this.myProject, ModelCheckerTool_Tool.this);
    if (newViewer.checkModule(module)) {
      ModelCheckerTool_Tool.this.addContent(newViewer, module.getModuleFqName(), IconManager.getIconFor(module), true);
      ModelCheckerTool_Tool.this.setSelectedComponent(newViewer);
    }
  }

  public void checkProject(MPSProject mpsProject) {
    ModelCheckerViewer newViewer = new ModelCheckerViewer(ModelCheckerTool_Tool.this.myProject, ModelCheckerTool_Tool.this);
    if (newViewer.checkProject(mpsProject)) {
      ModelCheckerTool_Tool.this.addContent(newViewer, mpsProject.getProjectDescriptor().getName(), Icons.PROJECT_ICON, true);
      ModelCheckerTool_Tool.this.setSelectedComponent(newViewer);
    }
  }

  public void removeTab(JComponent component) {
    ContentManager contentManager = ModelCheckerTool_Tool.this.getContentManager();
    Content content = contentManager.getContent(component);
    contentManager.removeContent(content, true);
  }
}
