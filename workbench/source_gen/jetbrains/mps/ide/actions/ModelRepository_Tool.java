package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindowAnchor;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.ide.modelRepositoryViewer.ModelRepositoryComponent;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.plugins.pluginparts.tool.GeneratedTool;
import jetbrains.mps.workbench.tools.CloseAction;

import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class ModelRepository_Tool extends GeneratedTool {

  //  private ModelRepositoryComponent myComponent = new ModelRepositoryComponent();
  private JPanel myPanel = new JPanel(new BorderLayout());

  public ModelRepository_Tool(Project project) {
    super(project, "Model Repository Viewer", -1, IconManager.loadIcon(MacrosUtil.expandPath("${mps_home}\\workbench\\source\\jetbrains\\mps\\ide\\projectPane\\nodes\\model.png", "jetbrains.mps.ide"), true), ToolWindowAnchor.BOTTOM, false);
  }

  public JComponent getComponent() {
    return this.myPanel;
  }

  public void init(Project project) {
//    this.myPanel.add(this.myComponent.getComponent(), BorderLayout.CENTER);
    DefaultActionGroup group = new DefaultActionGroup();
    group.add(new CloseAction(this));
    JComponent toolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, group, false).getComponent();
    this.myPanel.add(toolbar, BorderLayout.WEST);
//    this.myComponent.install();
  }

  public void dispose() {
//    this.myComponent.uninstall();
  }

}
