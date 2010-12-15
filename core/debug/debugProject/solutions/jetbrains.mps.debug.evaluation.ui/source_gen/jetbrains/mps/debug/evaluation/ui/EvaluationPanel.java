package jetbrains.mps.debug.evaluation.ui;

/*Generated by MPS */

import javax.swing.JPanel;
import jetbrains.mps.logging.Logger;
import javax.swing.JTabbedPane;
import jetbrains.mps.ide.embeddableEditor.EmbeddableEditor;
import jetbrains.mps.debug.evaluation.model.AbstractEvaluationModel;
import jetbrains.mps.debug.runtime.DebugSession;
import jetbrains.mps.nodeEditor.Highlighter;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import java.awt.BorderLayout;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import javax.swing.JSplitPane;
import com.intellij.ui.components.JBScrollPane;
import jetbrains.mps.debug.evaluation.Evaluator;
import jetbrains.mps.debug.runtime.DebugVMEventsProcessor;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.debug.runtime.SuspendContext;
import jetbrains.mps.debug.evaluation.proxies.IValueProxy;
import jetbrains.mps.debug.evaluation.InvalidEvaluatedExpressionException;
import jetbrains.mps.debug.evaluation.InvocationTargetEvaluationException;
import org.jetbrains.annotations.Nullable;
import com.intellij.openapi.application.ModalityState;
import jetbrains.mps.debug.api.SessionChangeAdapter;
import jetbrains.mps.debug.api.AbstractDebugSession;
import jetbrains.mps.ide.ui.MPSTreeNode;
import com.sun.jdi.ThreadReference;
import jetbrains.mps.debug.api.integration.ui.WatchableNode;
import jetbrains.mps.debug.runtime.java.programState.watchables.CalculatedWatchable;
import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.ide.ui.TextTreeNode;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.awt.Color;
import jetbrains.mps.ide.messages.Icons;
import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.datatransfer.CopyPasteUtil;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import java.io.StringWriter;
import java.io.PrintWriter;

public class EvaluationPanel extends JPanel {
  private static final Logger LOG = Logger.getLogger(EvaluationPanel.class);

  private final JTabbedPane myTabbedPane = new JTabbedPane();
  private final EvaluationPanel.MyTree myTree;
  private EmbeddableEditor myEditor;
  private EmbeddableEditor myResultEditor;
  private final AbstractEvaluationModel myEvaluationModel;
  private final EvaluationPanel.MySessionChangeListener mySessionChangeListener;
  protected final DebugSession myDebugSession;
  private final Highlighter myHighlighter;
  private EvaluationPanel.IErrorTextListener myErrorListener;
  private volatile boolean myIsDisposed = false;

  public EvaluationPanel(Project project, @NotNull DebugSession session, AbstractEvaluationModel evaluationModel) {
    super(new BorderLayout());
    myHighlighter = project.getComponent(Highlighter.class);
    myDebugSession = session;

    mySessionChangeListener = new EvaluationPanel.MySessionChangeListener();
    myDebugSession.addChangeListener(mySessionChangeListener);

    myEvaluationModel = evaluationModel;
    if (myEvaluationModel.isDeveloperMode()) {
      myEvaluationModel.addGenerationListener(new _FunctionTypes._void_P1_E0<SNode>() {
        public void invoke(SNode result) {
          EvaluationPanel.this.updateGenerationResultTab(result);
        }
      });
    }

    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        myEditor = new EmbeddableEditor(new ModuleContext(myEvaluationModel.getModule(), myEvaluationModel.getModule().getMPSProject().getProject()), myEvaluationModel.getModule(), myEvaluationModel.getRootToShow(), myEvaluationModel.getNodeToShow(), true);

        for (Language language : myEvaluationModel.getRequiredLanguages()) {
          myEditor.addLanguage(language);
        }
      }
    });

    final Wrappers._T<EditableSModelDescriptor> d = new Wrappers._T<EditableSModelDescriptor>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        d.value = myEditor.getModel();
      }
    });
    myEvaluationModel.setModel(d.value);

    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    splitPane.setResizeWeight(0.5);
    splitPane.setTopComponent(myEditor.getComponenet());
    myTree = new EvaluationPanel.MyTree(session.getUiState().getStackFrame().getLocation().getUnitName(), session.getUiState().getThread().getThread());
    splitPane.setBottomComponent(new JBScrollPane(myTree));

    if (myEvaluationModel.isDeveloperMode()) {
      myTabbedPane.addTab("Main", splitPane);
      add(myTabbedPane);
    } else {
      add(splitPane);
    }

    myHighlighter.addAdditionalEditor(myEditor.getEditor());
  }

  public void setErrorTextListener(EvaluationPanel.IErrorTextListener listener) {
    myErrorListener = listener;
  }

  public AbstractEvaluationModel getEvaluationModel() {
    return myEvaluationModel;
  }

  public void dispose() {
    if (myIsDisposed) {
      return;
    }
    myIsDisposed = true;
    myDebugSession.removeChangeListener(mySessionChangeListener);
    myHighlighter.removeAdditionalEditor(myEditor.getEditor());
    myEditor.disposeEditor(false);
  }

  public void evaluate() {
    if (!(myEvaluationModel.getDebugSession().isStepEnabled())) {
      setErrorText("Program should be paused on breakpoint to evaluate");
      return;
    }
    try {
      final Evaluator evaluator = myEvaluationModel.evaluate();
      setEvaluating();
      final DebugVMEventsProcessor eventsProcessor = myDebugSession.getEventsProcessor();
      ApplicationManager.getApplication().executeOnPooledThread(new Runnable() {
        public void run() {
          SuspendContext suspendContext = eventsProcessor.getSuspendManager().getPausedContext();
          assert suspendContext != null;
          try {
            suspendContext.setIsEvaluating(true);
            IValueProxy evaluatedValue = evaluator.evaluate();
            if (evaluatedValue != null) {
              setSuccess(evaluatedValue);
            } else {
              setFailure(null, "Evaluation returned null.");
            }
          } catch (Throwable t) {
            setFailure(t, null);
            EvaluationPanel.LOG.error(t);
          } finally {
            suspendContext.setIsEvaluating(false);
          }
        }
      });
    } catch (InvalidEvaluatedExpressionException e) {
      setFailure(e.getCause(), null);
    } catch (InvocationTargetEvaluationException e) {
      setFailure(e.getCause(), null);
      EvaluationPanel.LOG.error(e.getCause());
    } catch (Throwable t) {
      setFailure(t, null);
      EvaluationPanel.LOG.error(t);
    }
  }

  private void setErrorText(String text) {
    if (myErrorListener != null) {
      myErrorListener.updateErrorText(text);
    }
  }

  private void setSuccess(@NotNull final IValueProxy evaluatedValue) {
    invokeLaterIfNeeded(new Runnable() {
      public void run() {
        myTree.setResultProxy(evaluatedValue);
        myTree.rebuildLater();
      }
    });
  }

  private void setEvaluating() {
    invokeLaterIfNeeded(new Runnable() {
      public void run() {
        myTree.setEvaluating();
        myTree.rebuildLater();
      }
    });
  }

  private void setFailure(@Nullable final Throwable error, @Nullable final String message) {
    invokeLaterIfNeeded(new Runnable() {
      public void run() {
        if (error != null) {
          myTree.setError(error);
        } else {
          myTree.setError(message);
        }
        myTree.rebuildLater();
      }
    });
  }

  private void invokeLaterIfNeeded(Runnable runnable) {
    if (ApplicationManager.getApplication().isDispatchThread()) {
      runnable.run();
    } else {
      ApplicationManager.getApplication().invokeLater(runnable, ModalityState.NON_MODAL);
    }
  }

  public void updateGenerationResultTab(final SNode generatedResult) {
    ApplicationManager.getApplication().invokeLater(new Runnable() {
      public void run() {
        if (EvaluationPanel.this.myResultEditor == null) {
          ModelAccess.instance().runWriteActionInCommand(new Runnable() {
            public void run() {
              EvaluationPanel.this.myResultEditor = new EmbeddableEditor(new ModuleContext(myEvaluationModel.getModule(), myEvaluationModel.getModule().getMPSProject()), myEvaluationModel.getModule(), generatedResult, generatedResult, false);
            }
          });
          EvaluationPanel.this.myTabbedPane.add("Generated Result", EvaluationPanel.this.myResultEditor.getComponenet());
          EvaluationPanel.this.myTabbedPane.validate();
        } else {
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              EvaluationPanel.this.myResultEditor.setNode(generatedResult);
            }
          });
        }
      }
    }, ModalityState.NON_MODAL);
  }

  private class MySessionChangeListener extends SessionChangeAdapter {
    public MySessionChangeListener() {
    }

    public void paused(final AbstractDebugSession session) {
      ApplicationManager.getApplication().invokeLater(new Runnable() {
        public void run() {
          if (myEvaluationModel.getDebugSession() == session) {
            setErrorText("");
            myEvaluationModel.updateState();
          }
        }
      });
    }

    public void stateChanged(final AbstractDebugSession session) {
      ApplicationManager.getApplication().invokeLater(new Runnable() {
        public void run() {
          if (myEvaluationModel.getDebugSession() == session) {
            myEvaluationModel.updateState();
          }
        }
      });
    }
  }

  private static abstract class EvaluationState {
    public EvaluationState() {
    }

    public abstract void rebuild(MPSTreeNode rootTreeNode);
  }

  private static class InitializedState extends EvaluationPanel.EvaluationState {
    public InitializedState() {
    }

    public void rebuild(MPSTreeNode rootTreeNode) {
      // doing nothing 
    }
  }

  private static class EvaluationInProgressState extends EvaluationPanel.EvaluationState {
    public EvaluationInProgressState() {
    }

    public void rebuild(MPSTreeNode rootTreeNode) {
      rootTreeNode.add(new EvaluationPanel.EvaluatingTreeNode());
    }
  }

  private static class ResultState extends EvaluationPanel.EvaluationState {
    @NotNull
    private final IValueProxy myValueProxy;
    @NotNull
    private final String myClassFqName;
    private final ThreadReference myThreadReference;

    public ResultState(IValueProxy proxy, String classFqName, ThreadReference threadReference) {
      myValueProxy = proxy;
      myClassFqName = classFqName;
      myThreadReference = threadReference;
    }

    public void rebuild(MPSTreeNode rootTreeNode) {
      rootTreeNode.add(new WatchableNode(new CalculatedWatchable(this.myValueProxy.getJDIValue(), myClassFqName, myThreadReference)));
    }
  }

  private static class FailureState extends EvaluationPanel.EvaluationState {
    @Nullable
    private String myErrorText;
    private Throwable myError;

    public FailureState(String errorText) {
      myErrorText = errorText;
    }

    private FailureState(Throwable error) {
      myError = error;
    }

    public void rebuild(MPSTreeNode rootTreeNode) {
      if (myError != null) {
        rootTreeNode.add(new EvaluationPanel.ErrorTreeNode(myError));
      } else {
        rootTreeNode.add(new EvaluationPanel.ErrorTreeNode(myErrorText));
      }
    }
  }

  private static class MyTree extends MPSTree {
    private String myClassFqName;
    private ThreadReference myThreadReference;
    private EvaluationPanel.EvaluationState myState = new EvaluationPanel.InitializedState();

    public MyTree(String classFqName, ThreadReference threadReference) {
      super();
      myClassFqName = classFqName;
      myThreadReference = threadReference;
      this.rebuildNow();
    }

    public void setResultProxy(IValueProxy valueProxy) {
      myState = new EvaluationPanel.ResultState(valueProxy, myClassFqName, myThreadReference);
    }

    private void setError(@NotNull String text) {
      myState = new EvaluationPanel.FailureState(text);
    }

    private void setError(@NotNull Throwable error) {
      myState = new EvaluationPanel.FailureState(error);
    }

    private void setEvaluating() {
      myState = new EvaluationPanel.EvaluationInProgressState();
    }

    @Override
    protected MPSTreeNode rebuild() {
      MPSTreeNode rootTreeNode = new TextTreeNode("Evaluation Result");
      myState.rebuild(rootTreeNode);
      this.setRootVisible(false);
      this.setShowsRootHandles(true);
      return rootTreeNode;
    }
  }

  private static class ErrorTreeNode extends TextTreeNode {
    private final List<String> myExtendedMessage = ListSequence.fromList(new ArrayList<String>());

    public ErrorTreeNode(@NotNull String text, String... extendedMessage) {
      super(text);

      if (extendedMessage != null && extendedMessage.length > 0) {
        for (int i = 0; i < extendedMessage.length; i++) {
          ListSequence.fromList(myExtendedMessage).addElement(extendedMessage[i]);
        }
      }

      doInit();
    }

    public ErrorTreeNode(Throwable t) {
      this((t.getMessage() == null ?
        t.toString() :
        t.getMessage()
      ), getStackTrace(t));
    }

    @Override
    public boolean isLeaf() {
      return ListSequence.fromList(myExtendedMessage).count() == 0;
    }

    @Override
    protected void updatePresentation() {
      super.updatePresentation();

      setColor(Color.RED);
      setIcon(Icons.ERROR_ICON);
    }

    @Override
    protected void doInit() {
      for (String messagePart : ListSequence.fromList(myExtendedMessage)) {
        TextTreeNode node = new TextTreeNode(messagePart) {
          @Override
          public boolean isLeaf() {
            return true;
          }
        };
        add(node);
        node.setIcon(Icons.ERROR_ICON);
      }
    }

    @Override
    public ActionGroup getActionGroup() {
      DefaultActionGroup defaultActionGroup = new DefaultActionGroup();
      defaultActionGroup.add(new AnAction("Copy Stacktrace To Clipboard") {
        public void actionPerformed(AnActionEvent event) {
          CopyPasteUtil.copyTextToClipboard(getText() + ListSequence.fromList(myExtendedMessage).foldLeft("", new ILeftCombinator<String, String>() {
            public String combine(String s, String it) {
              return s + "\n" + it;
            }
          }));
        }
      });
      return defaultActionGroup;
    }

    private static String[] getStackTrace(Throwable t) {
      StringWriter writer = new StringWriter();
      t.printStackTrace(new PrintWriter(writer));
      return writer.toString().split("\n");
    }
  }

  private static class EvaluatingTreeNode extends TextTreeNode {
    public EvaluatingTreeNode() {
      super("evaluating...");
    }

    @Override
    public boolean isLeaf() {
      return true;
    }

    @Override
    protected void updatePresentation() {
      super.updatePresentation();
      setColor(Color.GRAY);
      setIcon(Icons.INFORMATION_ICON);
    }
  }

  public static interface IErrorTextListener {
    public void updateErrorText(String text);
  }
}
