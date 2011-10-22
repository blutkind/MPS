package jetbrains.mps.debugger.java.evaluation.model;

/*Generated by MPS */

import jetbrains.mps.debug.runtime.JavaUiState;
import jetbrains.mps.debug.runtime.DebugSession;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.debug.evaluation.ui.EvaluationAuxModule;
import java.util.List;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.ArrayList;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.smodel.ProjectModels;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.library.GeneralPurpose_DevKit;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.project.IModule;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.debug.evaluation.Evaluator;
import jetbrains.mps.debug.evaluation.EvaluationException;
import java.util.Set;
import jetbrains.mps.reloading.IClassPathItem;
import java.util.HashSet;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.reloading.ClassPathFactory;
import jetbrains.mps.generator.generationTypes.InMemoryJavaGenerationHandler;
import jetbrains.mps.ide.messages.DefaultMessageHandler;
import com.intellij.openapi.progress.util.ProgressWindow;
import jetbrains.mps.generator.GenerationFacade;
import java.util.Collections;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.progress.ProgressMonitorAdapter;
import jetbrains.mps.generator.GenerationOptions;
import jetbrains.mps.ide.generator.TransientModelsComponent;
import com.intellij.openapi.util.Disposer;
import org.apache.commons.lang.StringUtils;
import java.lang.reflect.InvocationTargetException;
import jetbrains.mps.debug.evaluation.InvocationTargetEvaluationException;
import jetbrains.mps.util.Computable;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.generator.IncrementalGenerationStrategy;
import java.util.Map;
import jetbrains.mps.generator.GenerationCacheContainer;
import jetbrains.mps.generator.impl.dependencies.GenerationDependencies;

public abstract class AbstractEvaluationModel {
  /*package*/ static final String EVALUATOR_NAME = "EvaluatorInstance";
  public static final boolean IS_DEVELOPER_MODE = Boolean.getBoolean("evaluation.developer");

  protected JavaUiState myUiState;
  protected final DebugSession myDebugSession;
  protected final IOperationContext myContext;
  protected final EditableSModelDescriptor myAuxModel;
  protected final EvaluationAuxModule myAuxModule;
  private final List<Language> myLanguages = ListSequence.fromListAndArray(new LinkedList<Language>(), MPSModuleRepository.getInstance().getLanguage("jetbrains.mps.debug.evaluation"), MPSModuleRepository.getInstance().getLanguage("jetbrains.mps.debug.privateMembers"));
  protected SNode myEvaluator;
  private final List<_FunctionTypes._void_P1_E0<? super SNode>> myGenerationListeners = ListSequence.fromList(new ArrayList<_FunctionTypes._void_P1_E0<? super SNode>>());
  protected final EvaluationContext myEvaluationContext;
  protected final boolean myShowContext;

  public AbstractEvaluationModel(Project project, @NotNull DebugSession session, @NotNull EvaluationAuxModule auxModule, EvaluationContext context, boolean isShowContext) {
    assert !(ApplicationManager.getApplication().isDispatchThread());
    myUiState = session.getUiState();
    myDebugSession = session;
    if (context.getLocationNode() != null) {
      myContext = ModuleContext.create(context.getLocationNode(), ProjectHelper.toMPSProject(project));
    } else {
      myContext = new ModuleContext(auxModule, ProjectHelper.toMPSProject(project));
    }
    myAuxModule = auxModule;

    final EditableSModelDescriptor modelDescriptor = ((EditableSModelDescriptor) ProjectModels.createDescriptorFor(true));
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        modelDescriptor.getSModel().addDevKit(GeneralPurpose_DevKit.MODULE_REFERENCE);
      }
    });
    SModelRepository.getInstance().registerModelDescriptor(modelDescriptor, myAuxModule);

    myAuxModel = modelDescriptor;
    myEvaluationContext = context;
    myShowContext = isShowContext;
  }

  protected SModel getLocationModel() {
    return SNodeOperations.getModel(myEvaluationContext.getLocationNode());
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

  public EditableSModelDescriptor getModel() {
    return myAuxModel;
  }

  public List<Language> getRequiredLanguages() {
    return myLanguages;
  }

  @NotNull
  public abstract SNode getNodeToShow();

  public void addGenerationListener(_FunctionTypes._void_P1_E0<? super SNode> listener) {
    ListSequence.fromList(myGenerationListeners).addElement(listener);
  }

  public boolean isDeveloperMode() {
    return AbstractEvaluationModel.IS_DEVELOPER_MODE;
  }

  public void updateState() {
    myUiState = myDebugSession.getUiState();
    myEvaluationContext.setUiState(myUiState);
  }

  public EvaluationContext getEvaluationContext() {
    return myEvaluationContext;
  }

  public abstract AbstractEvaluationModel copy(boolean isShowContext);

  protected IModule getLocationModule() {
    return getLocationModel().getModelDescriptor().getModule();
  }

  public IOperationContext getContext() {
    return myContext;
  }

  @Nullable
  public Evaluator evaluate() throws EvaluationException {
    try {
      final Set<IClassPathItem> classpaths = new HashSet<IClassPathItem>();
      for (Language language : this.myLanguages) {
        IClassPathItem item = language.getClassPathItem();
        classpaths.add(item);
      }
      String path = PathManager.getHomePath() + NameUtil.pathFromNamespace(".lib.") + "tools.jar";
      classpaths.add(ClassPathFactory.getInstance().createFromPath(path, "AbstractEvaluationModel"));

      final String fullClassName = this.myAuxModel.getLongName() + "." + AbstractEvaluationModel.EVALUATOR_NAME;
      InMemoryJavaGenerationHandler handler = new MyInMemoryJavaGenerationHandler(false, true, classpaths, myGenerationListeners);
      Project ideaProject = this.myAuxModule.getMPSProject().getProject();
      DefaultMessageHandler messageHandler = new DefaultMessageHandler(ideaProject);
      ProgressWindow progressWindow = new ProgressWindow(false, ideaProject);
      boolean successful = GenerationFacade.generateModels(myContext.getProject(), Collections.singletonList((SModelDescriptor) myAuxModel), myContext, handler, new ProgressMonitorAdapter(progressWindow), messageHandler, GenerationOptions.getDefaults().incremental(new AbstractEvaluationModel.MyIncrementalGenerationStrategy()).saveTransientModels(IS_DEVELOPER_MODE).rebuildAll(false).reporting(false, false, false, 0).create(), myContext.getProject().getComponent(TransientModelsComponent.class));

      Disposer.dispose(progressWindow);

      String source = handler.getSources().get(fullClassName);

      if (successful && StringUtils.isNotEmpty(source)) {
        if (isDeveloperMode()) {
          System.err.println(source);
        }
        ClassLoader parentClassLoader = this.myUiState.getClass().getClassLoader();
        Class clazz = Class.forName(fullClassName, true, handler.getCompiler().getClassLoader(parentClassLoader));
        Evaluator evaluator;
        try {
          evaluator = (Evaluator) clazz.getConstructor(JavaUiState.class).newInstance(this.myUiState);
        } catch (InvocationTargetException e) {
          // try again 
          myUiState = myDebugSession.refresh();
          evaluator = (Evaluator) clazz.getConstructor(JavaUiState.class).newInstance(this.myUiState);
        }
        return evaluator;
      } else if (StringUtils.isNotEmpty(source) && !(successful)) {
        throw new EvaluationException("Errors during compilation.");
      } else {
        throw new EvaluationException("Errors during generation.");
      }
    } catch (InvocationTargetException e) {
      // invocation target exceptions from newInstance method call via reflection 
      // second time, which means refresh did not help 
      // this is bad 
      // I personally think something should be done with all those exceptions 
      // other then hiding them from user 
      // but I do not know what 
      // TODO think 
      throw new InvocationTargetEvaluationException(e.getCause());
    } catch (EvaluationException e) {
      throw e;
    } catch (Throwable t) {
      throw new EvaluationException(t);
    }
  }

  public String getPresentation() {
    return ModelAccess.instance().runReadAction(new Computable<String>() {
      public String compute() {
        return ((String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(myEvaluator, "jetbrains.mps.debug.evaluation.structure.IEvaluatorConcept"), "virtual_getEvaluatorPresentation_9172312269976647295", new Class[]{SNode.class}));
      }
    });
  }

  private class MyIncrementalGenerationStrategy implements IncrementalGenerationStrategy {
    public MyIncrementalGenerationStrategy() {
    }

    public Map<String, String> getModelHashes(SModelDescriptor p0, IOperationContext p1) {
      return Collections.emptyMap();
    }

    public GenerationCacheContainer getContainer() {
      return null;
    }

    public GenerationDependencies getDependencies(SModelDescriptor p0) {
      return null;
    }

    public boolean isIncrementalEnabled() {
      return false;
    }
  }
}
