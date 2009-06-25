package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.project.MPSProject;
import java.awt.Frame;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.kernel.model.SModelUtil;
import javax.swing.JOptionPane;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.workbench.actions.nodes.GoToEditorDeclarationHelper;
import javax.swing.SwingUtilities;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.ide.projectPane.ProjectPane;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

public class GoToEditorDeclaration_Action extends GeneratedAction {
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}/icons/editor.png", "jetbrains.mps.ide"), true);
  protected static Log log = LogFactory.getLog(GoToEditorDeclaration_Action.class);

  public MPSProject project;
  public Frame frame;
  public IEditor editor;
  public IOperationContext context;
  public IScope scope;
  public IModule module;
  private SNode node;

  public GoToEditorDeclaration_Action() {
    super("Go To Editor Declaration", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl shift E";
  }

  public boolean isApplicable(AnActionEvent event) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getConceptDeclaration(GoToEditorDeclaration_Action.this.node), "jetbrains.mps.lang.structure.structure.ConceptDeclaration");
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GoToEditorDeclaration", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.SNODE);
      if (node != null) {
      }
      this.node = node;
    }
    if (this.node == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    this.editor = event.getData(MPSDataKeys.MPS_EDITOR);
    if (this.editor == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.scope = event.getData(MPSDataKeys.SCOPE);
    if (this.scope == null) {
      return false;
    }
    this.module = event.getData(MPSDataKeys.MODULE);
    if (this.module == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final Wrappers._T<Language> l = new Wrappers._T<Language>();
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          l.value = SModelUtil.getDeclaringLanguage(SNodeOperations.getConceptDeclaration(GoToEditorDeclaration_Action.this.node), GoToEditorDeclaration_Action.this.scope);
        }
      });
      if (l.value == null) {
        JOptionPane.showMessageDialog(GoToEditorDeclaration_Action.this.frame, "Couldn't find declaring language for concept " + NameUtil.nodeFQName(GoToEditorDeclaration_Action.this.node), "Error", JOptionPane.ERROR_MESSAGE);
        return;
      }
      final Wrappers._T<ConceptDeclaration> conceptDeclaration = new Wrappers._T<ConceptDeclaration>();
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          conceptDeclaration.value = ((ConceptDeclaration)GoToEditorDeclaration_Action.this.node.getConceptDeclarationAdapter());
        }
      });
      SModelDescriptor editorModel = GoToEditorDeclarationHelper.getOrCreateEditorAspect(l.value, conceptDeclaration.value, GoToEditorDeclaration_Action.this.scope);
      if (editorModel == null) {
        return;
      }
      final SNode editorNode = GoToEditorDeclarationHelper.getOrCreateEditorForConcept(editorModel, conceptDeclaration.value, GoToEditorDeclaration_Action.this.node, GoToEditorDeclaration_Action.this.scope);
      if (editorNode == null) {
        return;
      }
      SwingUtilities.invokeLater(new Runnable() {

        public void run() {
          GoToEditorDeclaration_Action.this.navigateToEditorDeclaration(editorNode, new ModuleContext(l.value, GoToEditorDeclaration_Action.this.project), GoToEditorDeclaration_Action.this.editor);
        }
      });
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GoToEditorDeclaration", t);
      }
    }
  }

  /* package */void navigateToEditorDeclaration(SNode editorNode, IOperationContext oContext, IEditor editor) {
    oContext.getComponent(ProjectPane.class).selectNode(editorNode, oContext);
    oContext.getComponent(MPSEditorOpener.class).editNode(editorNode, oContext);
  }

}
