package jetbrains.mps.debug.evaluation.model;

/*Generated by MPS */

import jetbrains.mps.debug.runtime.JavaUiState;
import jetbrains.mps.debug.runtime.DebugSession;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
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
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
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
import jetbrains.mps.generator.GeneratorManager;
import java.util.Collections;
import com.intellij.openapi.util.Disposer;
import org.apache.commons.lang.StringUtils;
import java.lang.reflect.InvocationTargetException;
import jetbrains.mps.debug.evaluation.InvocationTargetEvaluationException;
import jetbrains.mps.project.IModule;
import jetbrains.mps.reloading.CompositeClassPathItem;
import jetbrains.mps.generator.GenerationStatus;
import jetbrains.mps.ide.progress.ITaskProgressHelper;
import jetbrains.mps.smodel.SModelOperations;
import jetbrains.mps.debug.evaluation.transform.Transformator;

public abstract class AbstractEvaluationModel {
  private static final String EVALUATOR_NAME = "EvaluatorInstance";
  private static final boolean IS_DEVELOPER_MODE = false;

  protected JavaUiState myUiState;
  protected final DebugSession myDebugSession;
  protected final IOperationContext myContext;
  protected SModelDescriptor myAuxModel;
  protected final EvaluationAuxModule myAuxModule;
  private final List<Language> myLanguages = ListSequence.fromListAndArray(new LinkedList<Language>(), MPSModuleRepository.getInstance().getLanguage("jetbrains.mps.debug.evaluation"), MPSModuleRepository.getInstance().getLanguage("jetbrains.mps.debug.privateMembers"));
  protected SNode myEvaluator;
  private final List<_FunctionTypes._void_P1_E0<? super SNode>> myGenerationListeners = ListSequence.fromList(new ArrayList<_FunctionTypes._void_P1_E0<? super SNode>>());
  protected final EvaluationContext myEvaluationContext;

  public AbstractEvaluationModel(Project project, @NotNull DebugSession session, @NotNull EvaluationAuxModule auxModule, EvaluationContext context) {
    myUiState = session.getUiState();
    myDebugSession = session;
    if (context.getLocationNode() != null) {
      myContext = ModuleContext.create(context.getLocationNode(), project);
    } else {
      myContext = new ModuleContext(auxModule, project);
    }
    myAuxModule = auxModule;
    myEvaluationContext = context;

    // creating evaluator node 
    final Wrappers._T<SNode> evaluatorConcept = new Wrappers._T<SNode>();
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        evaluatorConcept.value = SConceptOperations.createNewNode("jetbrains.mps.debug.evaluation.structure.EvaluatorConcept", null);
        SPropertyOperations.set(evaluatorConcept.value, "isRuntime", "" + AbstractEvaluationModel.IS_DEVELOPER_MODE);
      }
    });
    this.myEvaluator = evaluatorConcept.value;
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

  public void setModel(EditableSModelDescriptor model) {
    myAuxModel = model;
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        myAuxModel.getSModel().addRoot(AbstractEvaluationModel.this.myEvaluator);
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
    return AbstractEvaluationModel.IS_DEVELOPER_MODE;
  }

  public void updateState() {
    myUiState = myDebugSession.getUiState();
    myEvaluationContext.setUiState(myUiState);
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
      classpaths.add(ClassPathFactory.getInstance().createFromPath(path));

      Project project = myContext.getProject();
      final String fullClassName = this.myAuxModel.getLongName() + "." + AbstractEvaluationModel.EVALUATOR_NAME;
      InMemoryJavaGenerationHandler handler = new AbstractEvaluationModel.MyInMemoryJavaGenerationHandler(false, true, classpaths);
      Project ideaProject = this.myAuxModule.getMPSProject().getProject();
      DefaultMessageHandler messageHandler = new DefaultMessageHandler(ideaProject);
      ProgressWindow progressWindow = new ProgressWindow(false, ideaProject);
      GeneratorManager generatorManager = project.getComponent(GeneratorManager.class);
      boolean successful = generatorManager.generateModels(Collections.singletonList(myAuxModel), myContext, handler, progressWindow, messageHandler, true, false);

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

  protected void copyInto(AbstractEvaluationModel model) {
    model.myEvaluator = SNodeOperations.copyNode(myEvaluator);
  }

  public abstract AbstractEvaluationModel copy();

  protected IModule getLocationModule() {
    return getLocationModel().getModelDescriptor().getModule();
  }

  public IOperationContext getContext() {
    return myContext;
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
        final SNode evaluator = SModelOperations.getRootByName(model, AbstractEvaluationModel.EVALUATOR_NAME);

        if (evaluator != null) {
          try {
            new Transformator(evaluator, true).transformEvaluator();
            if (AbstractEvaluationModel.IS_DEVELOPER_MODE) {
              for (_FunctionTypes._void_P1_E0<? super SNode> listener : ListSequence.fromList(myGenerationListeners)) {
                listener.invoke(evaluator);
              }
            }
          } catch (Throwable t) {
            LOG.error(t);
          }

        }
      }
      return super.handleOutput(module, inputModel, status, context, helper);
    }
  }
}
