package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.IMemberContainer_Behavior;
import javax.swing.SwingUtilities;
import java.awt.Frame;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.actions.StratergyAddMethodDialog;
import jetbrains.mps.ide.actions.AddClassMethodStrategy;
import jetbrains.mps.ide.actions.MethodsToImplementStrategy;
import jetbrains.mps.ide.actions.ImplementMethodStrategy;

public class ImplementMethods_Intention extends BaseIntention implements Intention {
  public ImplementMethods_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return true;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Implement Methods";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return ListSequence.fromList(IMemberContainer_Behavior.call_getMethodsToImplement_5418393554803775106(node)).isNotEmpty();
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        Frame frame = editorContext.getMainFrame();
        Project project = editorContext.getOperationContext().getIdeaProject();
        new StratergyAddMethodDialog(editorContext, frame, new AddClassMethodStrategy(node), new MethodsToImplementStrategy(), new ImplementMethodStrategy(project)).showDialog();
      }
    });
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
