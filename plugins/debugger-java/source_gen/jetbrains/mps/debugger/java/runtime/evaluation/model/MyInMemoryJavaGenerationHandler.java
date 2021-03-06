package jetbrains.mps.debugger.java.runtime.evaluation.model;

/*Generated by MPS */

import jetbrains.mps.generator.generationTypes.InMemoryJavaGenerationHandler;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.List;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.reloading.CompositeClassPathItem;
import java.util.Set;
import jetbrains.mps.project.IModule;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.reloading.ClassPathFactory;
import java.io.IOException;
import jetbrains.mps.generator.GenerationStatus;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.progress.ProgressMonitor;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelOperations;
import jetbrains.mps.debug.evaluation.transform.TransformatorBuilder;

/*package*/ class MyInMemoryJavaGenerationHandler extends InMemoryJavaGenerationHandler {
  protected static Log log = LogFactory.getLog(MyInMemoryJavaGenerationHandler.class);

  private final List<_FunctionTypes._void_P1_E0<? super SNode>> myGenerationListeners = ListSequence.fromList(new ArrayList<_FunctionTypes._void_P1_E0<? super SNode>>());

  public MyInMemoryJavaGenerationHandler(boolean reloadClasses, boolean keepSources, Iterable<_FunctionTypes._void_P1_E0<? super SNode>> listeners) {
    super(reloadClasses, keepSources);
    ListSequence.fromList(myGenerationListeners).addSequence(Sequence.fromIterable(listeners));
  }

  @Override
  public boolean canHandle(SModelDescriptor inputModel) {
    return inputModel != null;
  }

  @Override
  protected CompositeClassPathItem getClassPath(Set<IModule> contextModules) {
    CompositeClassPathItem result = super.getClassPath(contextModules);

    String path = PathManager.getHomePath() + NameUtil.pathFromNamespace(".lib.") + "tools.jar";
    try {
      result.add(ClassPathFactory.getInstance().createFromPath(path, this.getClass().getName()));
    } catch (IOException e) {
      if (log.isErrorEnabled()) {
        log.error("Cant create cpitem from path " + path, e);
      }
    }

    return result;
  }

  @Override
  public boolean handleOutput(IModule module, SModelDescriptor inputModel, GenerationStatus status, IOperationContext context, ProgressMonitor monitor) {
    SModel model = status.getOutputModel();
    if (model != null) {
      final SNode evaluator = SModelOperations.getRootByName(model, AbstractEvaluationModel.EVALUATOR_NAME);

      if (evaluator != null) {
        try {
          TransformatorBuilder.getInstance().build(evaluator, true).transformEvaluator();
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
    return super.handleOutput(module, inputModel, status, context, monitor);
  }
}
