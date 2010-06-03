package jetbrains.mps.debug.evaluation.ui;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import jetbrains.mps.debug.runtime.JavaUiState;
import jetbrains.mps.debug.runtime.DebugSession;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
import java.util.List;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.debug.runtime.java.programState.proxies.JavaStackFrame;
import com.sun.jdi.StackFrame;
import com.sun.jdi.Location;
import jetbrains.mps.debug.api.info.StacktraceUtil;
import jetbrains.mps.debug.evaluation.proxies.IValueProxy;
import java.util.Set;
import jetbrains.mps.reloading.IClassPathItem;
import java.util.HashSet;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.reloading.ClassPathFactory;
import jetbrains.mps.generator.GeneratorManager;
import jetbrains.mps.generator.GenerationSettings;
import jetbrains.mps.generator.generationTypes.InMemoryJavaGenerationHandler;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.messages.DefaultMessageHandler;
import com.intellij.openapi.progress.util.ProgressWindow;
import com.intellij.openapi.util.Disposer;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.debug.evaluation.Evaluator;
import jetbrains.mps.reloading.CompositeClassPathItem;
import jetbrains.mps.project.IModule;
import jetbrains.mps.generator.GenerationStatus;
import jetbrains.mps.ide.progress.ITaskProgressHelper;
import jetbrains.mps.internal.collections.runtime.IVisitor;

public abstract class AbstractEvaluationLogic {
  private static final Logger LOG = Logger.getLogger(AbstractEvaluationLogic.class);
  private static final String EVALUATOR_NAME = "EvaluatorInstance";
  private static final boolean IS_IN_HIGHLEVEL_MODE = false;
  private static final boolean IS_DEVELOPER_MODE = true;

  protected JavaUiState myUiState;
  protected final DebugSession myDebugSession;
  protected final IOperationContext myContext;
  protected SModelDescriptor myAuxModel;
  private final EvaluationAuxModule myAuxModule;
  private final List<Language> myLanguages = ListSequence.fromListAndArray(new LinkedList<Language>(), MPSModuleRepository.getInstance().getLanguage("jetbrains.mps.debug.evaluation"));
  protected SNode myEvaluator;
  private final List<_FunctionTypes._void_P1_E0<? super SNode>> myGenerationListeners = ListSequence.fromList(new ArrayList<_FunctionTypes._void_P1_E0<? super SNode>>());

  public AbstractEvaluationLogic(@NotNull IOperationContext context, @NotNull JavaUiState state, @NotNull DebugSession debugSession) {
    myUiState = state;
    myDebugSession = debugSession;
    myContext = context;

    // creating module 
    final Wrappers._T<EvaluationAuxModule> module = new Wrappers._T<EvaluationAuxModule>();
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        module.value = new EvaluationAuxModule(AbstractEvaluationLogic.this.myContext.getProject());
        module.value.setInvocationContext(AbstractEvaluationLogic.this.myContext.getModule());
      }
    });
    myAuxModule = module.value;

    // creating evaluator node 
    final Wrappers._T<SNode> evaluatorConcept = new Wrappers._T<SNode>();
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        evaluatorConcept.value = SConceptOperations.createNewNode("jetbrains.mps.debug.evaluation.structure.EvaluatorConcept", null);
        SPropertyOperations.set(evaluatorConcept.value, "isRuntime", "" + IS_DEVELOPER_MODE);
      }
    });
    this.myEvaluator = evaluatorConcept.value;
  }

  protected SModel getLocationModel() {
    return SNodeOperations.getModel(getLocationNode());
  }

  @Nullable
  protected SNode getLocationNode() {
    JavaStackFrame javaStackFrame = myUiState.getStackFrame();
    SNode locationNode = null;
    if (javaStackFrame != null) {
      StackFrame stackFrame = javaStackFrame.getStackFrame();
      if (stackFrame != null) {
        try {
          Location location = stackFrame.location();
          locationNode = StacktraceUtil.getNode(location.declaringType().name(), location.sourceName(), location.lineNumber());
        } catch (Throwable t) {
          LOG.error(t);
        }
      }
    }
    return locationNode;
  }

  public JavaUiState getUiState() {
    return this.myUiState;
  }

  public DebugSession getDebugSession() {
    return this.myDebugSession;
  }

  public EvaluationAuxModule getModule() {
    return myAuxModule;
  }

  public void setModel(SModelDescriptor model) {
    myAuxModel = model;
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        myAuxModel.getSModel().addRoot(AbstractEvaluationLogic.this.myEvaluator);
      }
    });
  }

  public List<Language> getRequiredLanguages() {
    return myLanguages;
  }

  @NotNull
  public abstract SNode getRootToShow();

  @NotNull
  public abstract SNode getNodeToShow();

  public void addGenerationListener(_FunctionTypes._void_P1_E0<? super SNode> listener) {
    ListSequence.fromList(myGenerationListeners).addElement(listener);
  }

  public boolean isDeveloperMode() {
    return IS_DEVELOPER_MODE;
  }

  @Nullable
  public IValueProxy evaluate() throws BaseEvaluationException {
    try {
      final Set<IClassPathItem> classpaths = new HashSet<IClassPathItem>();
      for (Language language : this.myLanguages) {
        IClassPathItem item = language.getClassPathItem();
        classpaths.add(item);
      }
      String path = PathManager.getHomePath() + NameUtil.pathFromNamespace(".lib.tools.") + "tools.jar";
      classpaths.add(ClassPathFactory.getInstance().createFromPath(path));

      GeneratorManager manager = new GeneratorManager(myContext.getProject(), new GenerationSettings()) {
        protected boolean generateRequirements() {
          return false;
        }
      };

      InMemoryJavaGenerationHandler handler = new AbstractEvaluationLogic.MyInMemoryJavaGenerationHandler(false, true, classpaths);
      Project ideaProject = this.myAuxModule.getMPSProject().getProject();
      DefaultMessageHandler messageHandler = new DefaultMessageHandler(ideaProject);
      ProgressWindow progressWindow = new ProgressWindow(false, ideaProject);
      boolean successful = manager.generateModels(ListSequence.fromListAndArray(new ArrayList<SModelDescriptor>(), this.myAuxModel), myContext, handler, progressWindow, messageHandler, true);

      Disposer.dispose(progressWindow);

      String fullClassName = this.myAuxModel.getLongName() + "." + EVALUATOR_NAME;
      String source = handler.getSources().get(fullClassName);

      if (successful || StringUtils.isNotEmpty(source)) {
        if (isDeveloperMode()) {
          System.err.println(source);
        }
        try {
          ClassLoader loader = handler.getCompiler().getClassLoader(this.myUiState.getClass().getClassLoader());
          Class clazz = Class.forName(fullClassName, true, loader);
          Evaluator evaluator = (Evaluator) clazz.getConstructor(JavaUiState.class).newInstance(this.myUiState);
          IValueProxy value = evaluator.evaluate();
          this.myUiState = this.myDebugSession.refresh();
          return value;
        } catch (Throwable t) {
          throw new BaseEvaluationException(t);
        }
      } else {
        throw new BaseEvaluationException("Errors during generation.");
      }
    } catch (Throwable t) {
      throw new BaseEvaluationException(t);
    }
  }

  public static AbstractEvaluationLogic createInstance(IOperationContext context, JavaUiState state, DebugSession session) {
    if (IS_IN_HIGHLEVEL_MODE) {
      return new HighLevelEvaluationLogic(context, state, session);
    }
    return new LowLevelEvaluationLogic(context, state, session);
  }

  private class MyInMemoryJavaGenerationHandler extends InMemoryJavaGenerationHandler {
    private final Set<IClassPathItem> myClasspaths;

    public MyInMemoryJavaGenerationHandler(boolean reloadClasses, boolean keepSources, Set<IClassPathItem> classpaths) {
      super(reloadClasses, keepSources);
      this.myClasspaths = classpaths;
    }

    @Override
    public boolean canHandle(SModelDescriptor inputModel) {
      return inputModel != null;
    }

    @Override
    protected CompositeClassPathItem getClassPath(Set<IModule> contextModules) {
      CompositeClassPathItem result = super.getClassPath(contextModules);
      for (IClassPathItem item : this.myClasspaths) {
        result.add(item);
      }
      return result;
    }

    @Override
    public boolean handleOutput(IModule module, SModelDescriptor inputModel, GenerationStatus status, IOperationContext context, ITaskProgressHelper helper) {
      SModel model = status.getOutputModel();
      if (model != null) {
        final SNode evaluator = model.getRootByName(AbstractEvaluationLogic.EVALUATOR_NAME);

        if (evaluator != null) {
          ModelAccess.instance().runWriteActionInCommand(new Runnable() {
            public void run() {
              try {
                TransformationUtil.transform(evaluator);
                if (AbstractEvaluationLogic.IS_DEVELOPER_MODE) {
                  ListSequence.fromList(myGenerationListeners).visitAll(new IVisitor<_FunctionTypes._void_P1_E0<? super SNode>>() {
                    public void visit(_FunctionTypes._void_P1_E0<? super SNode> it) {
                      it.invoke(evaluator);
                    }
                  });
                }
              } catch (Throwable t) {
                AbstractEvaluationLogic.LOG.error(t);
              }
            }
          });

        }
      }
      return super.handleOutput(module, inputModel, status, context, helper);
    }
  }
}
