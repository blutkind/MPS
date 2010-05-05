package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.LanguageID;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import jetbrains.mps.plugin.IProjectHandler;
import jetbrains.mps.plugin.MPSPlugin;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.rmi.RemoteException;

public class GoByCurrentReference_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(GoByCurrentReference_Action.class);

  private Project project;
  private EditorComponent editorComponent;
  private EditorCell cell;
  private IOperationContext context;
  private SNode node;

  public GoByCurrentReference_Action() {
    super("Go by Current Reference", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl B";
  }

  public boolean isApplicable(AnActionEvent event) {
    SNode targetNode = GoByCurrentReference_Action.this.cell.getSNodeWRTReference();
    if (targetNode == null) {
      return false;
    }
    if (targetNode == GoByCurrentReference_Action.this.cell.getSNode()) {
      return false;
    }
    if (GoByCurrentReference_Action.this.getEditorOpener() == null) {
      return false;
    }
    return true;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GoByCurrentReference", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    this.editorComponent = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.editorComponent == null) {
      return false;
    }
    this.cell = event.getData(MPSDataKeys.EDITOR_CELL);
    if (this.cell == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.node = event.getData(MPSDataKeys.NODE);
    if (this.node == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.project = null;
    this.editorComponent = null;
    this.cell = null;
    this.context = null;
    this.node = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      SNode targetNode = GoByCurrentReference_Action.this.cell.getSNodeWRTReference();
      if (SModelStereotype.getStubStereotypeForId(LanguageID.JAVA).equals(SNodeOperations.getModel(targetNode).getStereotype()) && GoByCurrentReference_Action.this.getHandlerFor(GoByCurrentReference_Action.this.project) != null) {
        if (GoByCurrentReference_Action.this.navigateToJavaStub(targetNode)) {
          return;
        }
      }
      GoByCurrentReference_Action.this.getEditorOpener().openNode(targetNode, GoByCurrentReference_Action.this.context, true, !(targetNode.isRoot()));
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GoByCurrentReference", t);
      }
    }
  }

  private MPSEditorOpener getEditorOpener() {
    return GoByCurrentReference_Action.this.context.getComponent(MPSEditorOpener.class);
  }

  private IProjectHandler getHandlerFor(Project p) {
    return MPSPlugin.getInstance().getProjectHandler(p);
  }

  private boolean navigateToJavaStub(SNode targetNode) {
    SModelReference ref = SNodeOperations.getModel(targetNode).getSModelReference();
    boolean isClassifier = SNodeOperations.isInstanceOf(targetNode, "jetbrains.mps.baseLanguage.structure.Classifier");
    boolean isConstructor = SNodeOperations.isInstanceOf(targetNode, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration");
    boolean isMethod = SNodeOperations.isInstanceOf(targetNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration") && SNodeOperations.isInstanceOf(SNodeOperations.getParent(targetNode), "jetbrains.mps.baseLanguage.structure.Classifier");
    boolean isField = (SNodeOperations.isInstanceOf(targetNode, "jetbrains.mps.baseLanguage.structure.FieldDeclaration") || SNodeOperations.isInstanceOf(targetNode, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(targetNode), "jetbrains.mps.baseLanguage.structure.Classifier");
    if (!(isClassifier || isConstructor || isMethod || isField)) {
      return false;
    }
    // ---- 
    IProjectHandler handler = GoByCurrentReference_Action.this.getHandlerFor(GoByCurrentReference_Action.this.project);
    if (handler == null) {
      if (log.isErrorEnabled()) {
        log.error("Project handle is null. Trying to open in MPS...");
      }
      return false;
    }
    // ---- 
    try {
      if (isClassifier) {
        String fqName = ref.getLongName() + "." + SPropertyOperations.getString(SNodeOperations.cast(targetNode, "jetbrains.mps.baseLanguage.structure.Classifier"), "name");
        handler.openClass(fqName);
      } else if (isConstructor) {
        String classifierName = GoByCurrentReference_Action.this.getClassifierName(targetNode, ref);
        int paramCount = ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(targetNode, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration"), "parameter", true)).count();
        handler.openClass(classifierName);
        handler.openConstructor(classifierName, paramCount);
      } else if (isMethod) {
        String classifierName = GoByCurrentReference_Action.this.getClassifierName(targetNode, ref);
        SNode method = SNodeOperations.cast(targetNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
        handler.openMethod(classifierName, SPropertyOperations.getString(method, "name"), ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).count());
      } else {
        String classifierName = GoByCurrentReference_Action.this.getClassifierName(targetNode, ref);
        handler.openField(classifierName, targetNode.getName());
      }
    } catch (RemoteException e) {
      if (log.isErrorEnabled()) {
        log.error("", e);
      }
    }
    return true;
  }

  private String getClassifierName(SNode targetNode, SModelReference ref) {
    SNode classifier = SNodeOperations.cast(SNodeOperations.getParent(targetNode), "jetbrains.mps.baseLanguage.structure.Classifier");
    assert classifier != null;
    return ref.getLongName() + "." + SPropertyOperations.getString(classifier, "name");
  }
}
