package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.CurrentProjectMPSAction;
import jetbrains.mps.logging.Logger;

import java.util.List;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;

import java.util.ArrayList;

import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class CommentStatements_Action extends CurrentProjectMPSAction {
  public static final Logger LOG = Logger.getLogger(CommentStatements_Action.class);

  private List<SNode> nodes;
  private boolean isAlwaysVisible = false;

  public CommentStatements_Action(MPSProject project) {
    super(project, "Comment Statements");
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl shift SLASH";
  }

  public boolean isApplicable(ActionContext context) {
    if (SequenceOperations.getSize(this.nodes) == 1 && SNodeOperations.isInstanceOf(SequenceOperations.getFirst(this.nodes), "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock")) {
      return false;
    }
    return true;
  }

  public void doUpdate(@NotNull()ActionContext context) {
    try {
      super.doUpdate(context);
      if (!(this.fillFieldsIfNecessary(context))) {
        this.setEnabled(false);
        this.setVisible(this.isAlwaysVisible);
        return;
      }
      {
        boolean enabled = this.isApplicable(context);
        this.setEnabled(enabled);
        this.setVisible(enabled || this.isAlwaysVisible);
      }
    } catch (Throwable t) {
      CommentStatements_Action.LOG.error("User's action doUpdate method failed. Action:" + "CommentStatements", t);
      this.setEnabled(false);
      this.setVisible(this.isAlwaysVisible);
    }
  }

  private boolean fillFieldsIfNecessary(ActionContext context) {
    try {
      {
        List<SNode> nodes = context.getNodes();
        boolean error = false;
        if (nodes != null) {
          {
            ICursor<SNode> _zCursor15 = CursorFactory.createCursor(nodes);
            try {
              while (_zCursor15.moveToNext()) {
                SNode node = _zCursor15.getCurrent();
                if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.Statement"))) {
                  error = true;
                  break;
                }
              }
            } finally {
              _zCursor15.release();
            }
          }
        }
        if (error) {
          this.nodes = null;
        } else {
          this.nodes = new ArrayList<SNode>(nodes);
        }
      }
      if (this.nodes == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull()ActionContext context) {
    try {
      if (!(this.fillFieldsIfNecessary(context))) {
        return;
      }
      {
        List<SNode> statements = (List<SNode>) this.nodes;
        SNode commentedStatementsBlock = SNodeOperations.insertNewPrevSiblingChild(SequenceOperations.getFirst(statements), "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock");
        SLinkOperations.addAll(commentedStatementsBlock, "statement", statements);
      }
    } catch (Throwable t) {
      CommentStatements_Action.LOG.error("User's action execute method failed. Action:" + "CommentStatements", t);
    }
  }

}
