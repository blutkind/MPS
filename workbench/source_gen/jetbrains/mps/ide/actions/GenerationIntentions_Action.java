package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionsManager.QueryDescriptor;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.ide.DataManager;
import com.intellij.openapi.ui.popup.ListPopup;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.util.Computable;
import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.ui.awt.RelativePoint;
import java.awt.Point;
import jetbrains.mps.workbench.action.BaseGroup;
import java.util.List;
import com.intellij.openapi.util.Pair;
import jetbrains.mps.intentions.Intention;
import java.util.ArrayList;
import jetbrains.mps.intentions.IntentionsManager;
import jetbrains.mps.intentions.GenerateIntention;
import java.util.Collections;
import java.util.Comparator;
import jetbrains.mps.workbench.action.BaseAction;
import jetbrains.mps.intentions.IntentionContext;

public class GenerationIntentions_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(GenerationIntentions_Action.class);

  private SNode selectedNode;
  private EditorContext editorContext;

  public GenerationIntentions_Action() {
    super("Show Generation Intentions Menu", "Shows the popup menu with available generation intentions", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "alt INSERT";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GenerationIntentions", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override
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
    this.editorContext = event.getData(MPSDataKeys.EDITOR_CONTEXT);
    if (this.editorContext == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final EditorCell selectedCell = GenerationIntentions_Action.this.editorContext.getSelectedCell();
      int x = selectedCell.getX();
      int y = selectedCell.getY();
      if (selectedCell instanceof EditorCell_Label) {
        y += ((EditorCell_Label) selectedCell).getHeight();
      }
      final DataContext dataContext = DataManager.getInstance().getDataContext(GenerationIntentions_Action.this.editorContext.getNodeEditorComponent(), x, y);
      ListPopup popup = ModelAccess.instance().runReadAction(new Computable<ListPopup>() {
        public ListPopup compute() {
          ActionGroup group = GenerationIntentions_Action.this.getIntentionGroup();
          ListPopup popup = null;
          if (group != null) {
            popup = JBPopupFactory.getInstance().createActionGroupPopup("Generate", group, dataContext, JBPopupFactory.ActionSelectionAid.NUMBERING, false);
          }
          return popup;
        }
      });
      RelativePoint relativePoint = new RelativePoint(GenerationIntentions_Action.this.editorContext.getNodeEditorComponent(), new Point(x, y));
      if (popup != null) {
        popup.show(relativePoint);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GenerationIntentions", t);
      }
    }
  }

  private BaseGroup getIntentionGroup() {
    BaseGroup group = new BaseGroup("");
    List<Pair<Intention, SNode>> groupItems = new ArrayList<Pair<Intention, SNode>>();
    groupItems.addAll(IntentionsManager.getInstance().getAvailableIntentions(new QueryDescriptor(GenerateIntention.class, true,false, null, false), GenerationIntentions_Action.this.selectedNode, GenerationIntentions_Action.this.editorContext));
    if (groupItems.isEmpty()) {
      return null;
    }
    Collections.sort(groupItems, new Comparator<Pair<Intention, SNode>>() {
      public int compare(Pair<Intention, SNode> p0, Pair<Intention, SNode> p1) {
        Intention intention1 = p0.getFirst();
        Intention intention2 = p1.getFirst();
        SNode node1 = p0.getSecond();
        SNode node2 = p1.getSecond();
        return intention1.getDescription(node1, GenerationIntentions_Action.this.editorContext).compareTo(intention2.getDescription(node2, GenerationIntentions_Action.this.editorContext));
      }
    });
    for (final Pair<Intention, SNode> pair : groupItems) {
      BaseAction action = new BaseAction(pair.getFirst().getDescription(pair.getSecond(), GenerationIntentions_Action.this.editorContext)) {
        protected void doExecute(AnActionEvent p0) {
          final IntentionContext intentionContext = new IntentionContext();
          final GenerateIntention generateIntention = (GenerateIntention) pair.getFirst();
          if (generateIntention.executeUI(pair.getSecond(), GenerationIntentions_Action.this.editorContext, intentionContext)) {
            ModelAccess.instance().runCommandInEDT(new Runnable() {
              public void run() {
                generateIntention.execute(pair.getSecond(), GenerationIntentions_Action.this.editorContext, intentionContext);
              }
            });
          }
        }
      };
      action.setExecuteOutsideCommand(true);
      group.add(action);
    }
    return group;
  }
}
