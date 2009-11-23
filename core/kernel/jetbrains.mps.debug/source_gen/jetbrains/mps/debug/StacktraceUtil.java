package jetbrains.mps.debug;

/*Generated by MPS */

import com.intellij.execution.impl.ConsoleViewImpl;
import com.intellij.execution.ui.ConsoleViewContentType;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.smodel.SNode;
import javax.swing.SwingUtilities;
import com.intellij.execution.filters.HyperlinkInfo;
import com.intellij.openapi.project.Project;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.apache.commons.lang.ObjectUtils;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.ide.DataManager;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

public class StacktraceUtil {
  private static String STRING_START = "at ";

  public static void appendStacktraceToConsole(ConsoleViewImpl consoleView, String line, ConsoleViewContentType defaultType) {
    if (!(tryToParseLine(consoleView, line))) {
      consoleView.print(line, defaultType);
    }
  }

  private static boolean tryToParseLine(final ConsoleViewImpl consoleView, final String line) {
    if (!(StringUtils.trim(line).startsWith(STRING_START))) {
      return false;
    }

    final int start = line.indexOf(STRING_START) + STRING_START.length();
    String tmpStr = line.substring(start);
    final int parenIndex = tmpStr.indexOf("(");
    if (parenIndex == -1) {
      return false;
    }

    String methodName = tmpStr.substring(0, parenIndex);
    final int closingParenIndex = tmpStr.indexOf(")");
    if (closingParenIndex == -1) {
      return false;
    }

    final String position = tmpStr.substring(parenIndex + 1, closingParenIndex);
    final SNode nodeToShow = getNodes(methodName, position);
    if (nodeToShow == null) {
      return false;
    }

    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        consoleView.print(line.substring(0, start + parenIndex + 1), ConsoleViewContentType.ERROR_OUTPUT);
        consoleView.printHyperlink(position, new HyperlinkInfo() {
          public void navigate(Project p0) {
            StacktraceUtil.showNode(nodeToShow);
          }
        });
        consoleView.print(line.substring(start + closingParenIndex), ConsoleViewContentType.ERROR_OUTPUT);
      }
    });
    return true;
  }

  private static SNode getNodes(String method, final String position) {
    int lastDot = method.lastIndexOf(".");
    lastDot = method.lastIndexOf(".", lastDot - 1);
    String pkg = (lastDot == -1 ?
      "" :
      method.substring(0, lastDot)
    );
    List<SModelDescriptor> list = SModelRepository.getInstance().getModelDescriptorsByModelName(pkg);
    for (final SModelDescriptor descriptor : ListSequence.fromList(list)) {
      if (ObjectUtils.equals(descriptor.getStereotype(), SModelStereotype.JAVA_STUB)) {
        continue;
      }

      final DebugInfo result = BLDebugInfoCache.getInstance().get(descriptor);
      if (result == null) {
        continue;
      }

      final Wrappers._T<SNode> nodeToShow = new Wrappers._T<SNode>(null);
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          String[] str = position.split(":");
          if (str.length >= 2) {
            nodeToShow.value = result.getNodeForLine(str[0], Integer.parseInt(str[1]), descriptor.getSModel());
          }
        }
      });

      if (nodeToShow.value != null) {
        return nodeToShow.value;
      }
    }

    return null;
  }

  private static void showNode(SNode node) {
    DataContext dataContext = DataManager.getInstance().getDataContext();
    MPSProject project = MPSDataKeys.MPS_PROJECT.getData(dataContext);
    ProjectOperationContext operationContext = new ProjectOperationContext(project);
    MPSEditorOpener opener = operationContext.getComponent(MPSEditorOpener.class);
    opener.editNode(node, operationContext);
  }
}
