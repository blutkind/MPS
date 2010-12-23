package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.SNode;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.findusages.findalgorithm.finders.IFinder;
import jetbrains.mps.baseLanguage.findUsages.ImplementingClasses_Finder;
import jetbrains.mps.baseLanguage.findUsages.DerivedClasses_Finder;
import jetbrains.mps.baseLanguage.findUsages.InterfaceMethodImplementations_Finder;
import jetbrains.mps.baseLanguage.findUsages.DerivedMethods_Finder;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.project.GlobalScope;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.workbench.components.ShowImplementationComponent;
import com.intellij.openapi.ui.popup.JBPopup;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.ui.awt.RelativePoint;
import java.awt.Point;

public class ShowImplementations_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(ShowImplementations_Action.class);

  private SNode node;
  private Project project;
  private IOperationContext context;
  private EditorCell cell;

  public ShowImplementations_Action() {
    super("Show Implementation", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl shift I";
  }

  public boolean isApplicable(AnActionEvent event) {
    return SNodeOperations.isInstanceOf(ShowImplementations_Action.this.node, "jetbrains.mps.baseLanguage.structure.Interface") || SNodeOperations.isInstanceOf(ShowImplementations_Action.this.node, "jetbrains.mps.baseLanguage.structure.ClassConcept") && SPropertyOperations.getBoolean(SNodeOperations.cast(ShowImplementations_Action.this.node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "abstractClass") || SNodeOperations.isInstanceOf(ShowImplementations_Action.this.node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") && SNodeOperations.isInstanceOf(SNodeOperations.getParent(ShowImplementations_Action.this.node), "jetbrains.mps.baseLanguage.structure.Classifier");
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "ShowImplementations", t);
      }
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
      this.node = node;
    }
    if (this.node == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.cell = event.getData(MPSDataKeys.EDITOR_CELL);
    if (this.cell == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      IFinder finder;
      if (SNodeOperations.isInstanceOf(ShowImplementations_Action.this.node, "jetbrains.mps.baseLanguage.structure.Interface")) {
        finder = new ImplementingClasses_Finder();
      } else if (SNodeOperations.isInstanceOf(ShowImplementations_Action.this.node, "jetbrains.mps.baseLanguage.structure.ClassConcept") && SPropertyOperations.getBoolean(SNodeOperations.cast(ShowImplementations_Action.this.node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "abstractClass")) {
        finder = new DerivedClasses_Finder();
      } else if (SNodeOperations.isInstanceOf(ShowImplementations_Action.this.node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") && SNodeOperations.isInstanceOf(SNodeOperations.getParent(ShowImplementations_Action.this.node), "jetbrains.mps.baseLanguage.structure.Interface") && SNodeOperations.hasRole(ShowImplementations_Action.this.node, "jetbrains.mps.baseLanguage.structure.Interface", "method")) {
        finder = new InterfaceMethodImplementations_Finder();
      } else if (SNodeOperations.isInstanceOf(ShowImplementations_Action.this.node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") && SNodeOperations.isInstanceOf(SNodeOperations.getParent(ShowImplementations_Action.this.node), "jetbrains.mps.baseLanguage.structure.Classifier")) {
        finder = new DerivedMethods_Finder();
      } else {
        return;
      }

      final List<SNode> nodes = new ArrayList<SNode>();
      ListSequence.fromList(nodes).addElement(ShowImplementations_Action.this.node);
      SearchResults<SNode> searchResults = finder.find(new SearchQuery(ShowImplementations_Action.this.node, GlobalScope.getInstance()), new EmptyProgressIndicator());
      for (SearchResult<SNode> searchResult : searchResults.getSearchResults()) {
        SNode foundNode = searchResult.getObject();
        if ((foundNode != null)) {
          ListSequence.fromList(nodes).addElement(foundNode);
        }
      }
      ModelAccess.instance().runWriteActionInCommandAsync(new Runnable() {
        public void run() {
          String title = "Definition of " + ShowImplementations_Action.this.node.getPresentation();
          ShowImplementationComponent component = new ShowImplementationComponent(nodes, ShowImplementations_Action.this.context);
          JBPopup popup = JBPopupFactory.getInstance().createComponentPopupBuilder(component, component.getPrefferedFocusableComponent()).setRequestFocus(true).setProject(ShowImplementations_Action.this.project).setMovable(true).setResizable(true).setTitle(title).createPopup();
          popup.show(new RelativePoint(ShowImplementations_Action.this.cell.getEditor(), new Point(ShowImplementations_Action.this.cell.getX(), ShowImplementations_Action.this.cell.getY())));
          component.getPrefferedFocusableComponent().setRequestFocusEnabled(true);
          component.setPopup(popup);
        }
      }, ShowImplementations_Action.this.project);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ShowImplementations", t);
      }
    }
  }
}
