package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.tool.GeneratedTool;
import com.intellij.execution.impl.ConsoleViewImpl;
import javax.swing.JPanel;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.icons.IconManager;
import com.intellij.openapi.wm.ToolWindowAnchor;
import javax.swing.JComponent;
import jetbrains.mps.MPSProjectHolder;
import java.awt.BorderLayout;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.tools.CloseAction;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import com.intellij.openapi.util.Disposer;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelRepository;
import org.apache.commons.lang.ObjectUtils;
import jetbrains.mps.vfs.IFile;
import java.util.List;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import org.apache.commons.lang.StringUtils;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.execution.filters.HyperlinkInfo;

public class AnalyzeStacktrace_Tool extends GeneratedTool {

  private String myStackTrace;
  private ConsoleViewImpl myConsoleView;
  private String STRING_START = "at ";
  private JPanel myComponent;
  private MPSProject myProject;

  public AnalyzeStacktrace_Tool(Project project) {
    super(project, "Analyze Stacktrace", -1, IconManager.EMPTY_ICON, ToolWindowAnchor.BOTTOM, false);
  }

  public JComponent getComponent() {
    return AnalyzeStacktrace_Tool.this.myComponent;
  }

  public void init(Project project) {
    AnalyzeStacktrace_Tool.this.myProject = AnalyzeStacktrace_Tool.this.getProject().getComponent(MPSProjectHolder.class).getMPSProject();
    AnalyzeStacktrace_Tool.this.myConsoleView = new ConsoleViewImpl(AnalyzeStacktrace_Tool.this.getProject(), false);
    AnalyzeStacktrace_Tool.this.myComponent = new JPanel(new BorderLayout());
    AnalyzeStacktrace_Tool.this.myComponent.add(AnalyzeStacktrace_Tool.this.myConsoleView.getComponent());
    DefaultActionGroup actions = new DefaultActionGroup();
    actions.add(new CloseAction(AnalyzeStacktrace_Tool.this));
    AnalyzeStacktrace_Tool.this.myComponent.add(ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, actions, false).getComponent(), BorderLayout.LINE_START);
  }

  public void dispose() {
    Disposer.dispose(AnalyzeStacktrace_Tool.this.myConsoleView);
  }

  private SNode getNodes(String method, String position) {
    int lastDot = method.lastIndexOf(".");
    lastDot = method.lastIndexOf(".", lastDot - 1);
    String pkg = method.substring(0, lastDot);
    for(SModelDescriptor descriptor : ListSequence.fromList(SModelRepository.getInstance().getModelDescriptors())) {
      if (ObjectUtils.equals(descriptor.getSModelFqName().getLongName(), pkg) && ObjectUtils.equals(descriptor.getStereotype(), "")) {
        IFile file = DebugInfo.getDebugFileOfModel(descriptor);
        if (file.exists()) {
          DebugInfo result = DebugInfo.load(file);
          final List<SNode> nodes = result.getNodesForLine(position, descriptor.getSModel());
          final Wrappers._T<SNode> nodeToShow = new Wrappers._T<SNode>();
          ModelAccess.instance().runReadAction(new Runnable() {

            public void run() {
              for(SNode n : ListSequence.fromList(nodes)) {
                if (SNodeOperations.isInstanceOf(n, "jetbrains.mps.baseLanguage.structure.Statement")) {
                  nodeToShow.value = n;
                }
              }
            }
          });
          return nodeToShow.value;
        }
      }
    }
    return null;
  }

  private void showNode(SNode node) {
    ProjectOperationContext operationContext = new ProjectOperationContext(AnalyzeStacktrace_Tool.this.myProject);
    MPSEditorOpener opener = operationContext.getComponent(MPSEditorOpener.class);
    opener.editNode(node, operationContext);
  }

  public void setStackTrace(String str) {
    AnalyzeStacktrace_Tool.this.myStackTrace = str;
    AnalyzeStacktrace_Tool.this.myConsoleView.clear();
    String[] lines = str.split("\n");
    for(String line : lines) {
      if (StringUtils.trim(line).startsWith(AnalyzeStacktrace_Tool.this.STRING_START)) {
        int start = line.indexOf(AnalyzeStacktrace_Tool.this.STRING_START) + AnalyzeStacktrace_Tool.this.STRING_START.length();
        String tmpStr = line.substring(start);
        int parenIndex = tmpStr.indexOf("(");
        String methodName = tmpStr.substring(0, parenIndex);
        int closingParenIndex = tmpStr.indexOf(")");
        String position = tmpStr.substring(parenIndex + 1, closingParenIndex);
        final SNode nodeToShow = AnalyzeStacktrace_Tool.this.getNodes(methodName, position);
        if (nodeToShow != null) {
          AnalyzeStacktrace_Tool.this.myConsoleView.print(line.substring(0, start + parenIndex + 1), ConsoleViewContentType.ERROR_OUTPUT);
          AnalyzeStacktrace_Tool.this.myConsoleView.printHyperlink(position, new HyperlinkInfo() {

            public void navigate(Project p0) {
              AnalyzeStacktrace_Tool.this.showNode(nodeToShow);
            }
          });
          AnalyzeStacktrace_Tool.this.myConsoleView.print(line.substring(start + closingParenIndex), ConsoleViewContentType.ERROR_OUTPUT);
          AnalyzeStacktrace_Tool.this.myConsoleView.print("\n", ConsoleViewContentType.ERROR_OUTPUT);
        } else
        {
          AnalyzeStacktrace_Tool.this.myConsoleView.print(line + "\n", ConsoleViewContentType.ERROR_OUTPUT);
        }
      } else
      {
        AnalyzeStacktrace_Tool.this.myConsoleView.print(line + "\n", ConsoleViewContentType.ERROR_OUTPUT);
      }
    }
  }

}
