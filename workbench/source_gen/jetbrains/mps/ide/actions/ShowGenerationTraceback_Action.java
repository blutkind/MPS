package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.transformation.TLBase.plugin.debug.GenerationTracer;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;
import javax.swing.JOptionPane;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

public class ShowGenerationTraceback_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(ShowGenerationTraceback_Action.class);
  public static final Icon ICON = null;

  private SNode node;
  private List<SNode> nodes;
  public IOperationContext context;
  public Frame frame;

  public ShowGenerationTraceback_Action() {
    super("Show Generation Traceback", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      {
        if (ListSequence.fromList(ShowGenerationTraceback_Action.this.nodes).count() != 1) {
          ShowGenerationTraceback_Action.this.disable(event.getPresentation());
        }
        GenerationTracer tracer = ShowGenerationTraceback_Action.this.context.getComponent(GenerationTracer.class);
        event.getPresentation().setVisible(tracer.hasTracingData());
        event.getPresentation().setEnabled(tracer.hasTracebackData(SNodeOperations.getModel(ShowGenerationTraceback_Action.this.node).getUID()));
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowGenerationTraceback", t);
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
    {
      List<SNode> nodes = event.getData(MPSDataKeys.SNODES);
      boolean error = false;
      if (nodes != null) {
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
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      GenerationTracer tracer = ShowGenerationTraceback_Action.this.context.getComponent(GenerationTracer.class);
      if (!(tracer.showTracebackData(ShowGenerationTraceback_Action.this.node))) {
        JOptionPane.showMessageDialog(ShowGenerationTraceback_Action.this.frame, "No tracing data available");
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowGenerationTraceback", t);
    }
  }

}
