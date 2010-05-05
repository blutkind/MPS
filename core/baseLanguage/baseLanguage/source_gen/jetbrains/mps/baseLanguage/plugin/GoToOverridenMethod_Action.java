package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.IOperationContext;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.util.Set;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.ModelAccess;
import javax.swing.SwingUtilities;
import com.intellij.ui.awt.RelativePoint;
import java.awt.event.MouseEvent;
import java.awt.Rectangle;
import java.awt.Point;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.HashSet;

public class GoToOverridenMethod_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(GoToOverridenMethod_Action.class);

  private SNode selectedNode;
  private EditorComponent editorComponent;
  private EditorContext editorContext;
  private IOperationContext operationContext;
  private Project project;

  public GoToOverridenMethod_Action() {
    super("Go to Overriden Method", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl U";
  }

  public boolean isApplicable(AnActionEvent event) {
    return (GoToOverridenMethod_Action.this.getInstanceMethodDeclaration() != null) && (GoToOverridenMethod_Action.this.getClassifier() != null);
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "GoToOverridenMethod", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
      }
      this.selectedNode = node;
    }
    if (this.selectedNode == null) {
      return false;
    }
    this.editorComponent = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.editorComponent == null) {
      return false;
    }
    this.editorContext = event.getData(MPSDataKeys.EDITOR_CONTEXT);
    if (this.editorContext == null) {
      return false;
    }
    this.operationContext = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.operationContext == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.selectedNode = null;
    this.editorComponent = null;
    this.editorContext = null;
    this.operationContext = null;
    this.project = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final Wrappers._T<Set<Tuples._2<SNode, SNode>>> overridenMethods = new Wrappers._T<Set<Tuples._2<SNode, SNode>>>();
      ProgressManager.getInstance().run(new Task.Modal(GoToOverridenMethod_Action.this.project, "Searchig...", true) {
        public void run(@NotNull ProgressIndicator p0) {
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              overridenMethods.value = GoToOverridenMethod_Action.this.getOverridenMethod();
            }
          });
        }
      });
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          RelativePoint relativePoint;
          if (event.getInputEvent() instanceof MouseEvent) {
            relativePoint = new RelativePoint((MouseEvent) event.getInputEvent());
          } else {
            Rectangle cellBounds = GoToOverridenMethod_Action.this.editorContext.getSelectedCell().getBounds();
            Point point = new Point(((int) cellBounds.getMinX()), ((int) cellBounds.getMaxY()));
            relativePoint = new RelativePoint(GoToOverridenMethod_Action.this.editorComponent, point);
          }
          GoToHelper.showOverridenMethodsMenu(SetSequence.fromSet(overridenMethods.value).select(new ISelector<Tuples._2<SNode, SNode>, SNode>() {
            public SNode select(Tuples._2<SNode, SNode> it) {
              return it._0();
            }
          }).toListSequence(), relativePoint, GoToOverridenMethod_Action.this.project);
        }
      });
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "GoToOverridenMethod", t);
    }
  }

  private SNode getInstanceMethodDeclaration() {
    return SNodeOperations.getAncestor(GoToOverridenMethod_Action.this.selectedNode, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", true, false);
  }

  private SNode getClassifier() {
    return SNodeOperations.getAncestor(GoToOverridenMethod_Action.this.getInstanceMethodDeclaration(), "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
  }

  private Set<Tuples._2<SNode, SNode>> getOverridenMethod() {
    SNode method = GoToOverridenMethod_Action.this.getInstanceMethodDeclaration();
    SNode classifier = GoToOverridenMethod_Action.this.getClassifier();
    Set<Tuples._2<SNode, SNode>> overridenMethods = new OverridingMethodsFinder(classifier, Sequence.<SNode>singleton(method)).getOverridenMethods(method);
    return (overridenMethods == null ?
      SetSequence.fromSet(new HashSet<Tuples._2<SNode, SNode>>()) :
      overridenMethods
    );
  }
}
