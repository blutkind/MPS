package jetbrains.mps.ide.refactoring;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import jetbrains.mps.refactoring.framework.IRefactoring;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.ide.findusages.model.SearchResults;
import java.awt.Frame;
import jetbrains.mps.ide.project.ProjectHelper;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.refactoring.framework.RefactoringOptionsDialog;
import jetbrains.mps.smodel.ModelAccess;
import javax.swing.SwingUtilities;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.project.Project;
import jetbrains.mps.project.ProjectOperationContext;
import javax.swing.JOptionPane;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import com.intellij.ide.DataManager;
import jetbrains.mps.refactoring.framework.ILoggableRefactoring;
import jetbrains.mps.util.Computable;
import java.util.ArrayList;
import jetbrains.mps.refactoring.framework.RefactoringNodeMembersAccessModifier;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.make.MakeSession;
import jetbrains.mps.make.IMakeService;
import java.util.concurrent.Future;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.smodel.resources.ModelsToResources;
import java.util.concurrent.ExecutionException;
import jetbrains.mps.findUsages.UsagesList;
import java.util.Map;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.loading.ModelLoadingState;
import jetbrains.mps.smodel.SModelOperations;
import jetbrains.mps.refactoring.StructureModificationProcessor;


/**
 * * Evgeny Gryaznov, Aug 25, 2010
 */
public class RefactoringFacade {
  protected static final Logger LOG = Logger.getLogger(RefactoringFacade.class);

  public RefactoringFacade() {
  }

  public void execute(final IRefactoring refactoring, final RefactoringContext refactoringContext) {
    refactoringContext.setRefactoring(refactoring);
    final boolean[] success = new boolean[1];
    ThreadUtils.runInUIThreadAndWait(new Runnable() {
      public void run() {
        success[0] = refactoring.init(refactoringContext);
      }
    });
    if (!(success[0])) {
      return;
    }
    SearchResults usages = findUsages(refactoringContext);
    if (usages == null) {
      return;
    }
    refactoringContext.setUsages(usages);
    if (!(usages.getSearchResults().isEmpty())) {
      showRefactoring(refactoringContext, usages);
    } else {
      doExecuteWithDialog(refactoringContext);
    }
  }

  private void doExecuteWithDialog(final RefactoringContext refactoringContext) {
    final boolean[] cancelled = new boolean[]{true};
    ThreadUtils.runInUIThreadAndWait(new Runnable() {
      public void run() {
        IRefactoring refactoring = refactoringContext.getRefactoring();
        Frame mainFrame = ProjectHelper.toMainFrame(refactoringContext.getCurrentOperationContext().getProject());
        List<SModel> modelsToGenerate = getModelsToGenerate(refactoring, refactoringContext);
        RefactoringOptionsDialog dialog = new RefactoringOptionsDialog(mainFrame, refactoringContext, refactoring, !(modelsToGenerate.isEmpty()));
        if (dialog.needToBeShown()) {
          dialog.showDialog();
          cancelled[0] = dialog.isCancelled();
        } else {
          cancelled[0] = false;
        }
      }
    });
    if (cancelled[0]) {
      return;
    }
    doExecute(refactoringContext);
  }

  private void showRefactoring(final RefactoringContext refactoringContext, final SearchResults searchResults) {
    ThreadUtils.runInUIThreadNoWait(new Runnable() {
      public void run() {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            RefactoringView refactorintView = refactoringContext.getCurrentOperationContext().getComponent(RefactoringView.class);
            RefactoringViewAction okAction = new RefactoringViewAction() {
              public void performAction(final RefactoringViewItem refactoringViewItem) {
                new Thread() {
                  public void run() {
                    doExecute(refactoringContext);
                    SwingUtilities.invokeLater(new Runnable() {
                      public void run() {
                        refactoringViewItem.close();
                      }
                    });
                  }
                }.start();
              }
            };
            List<SModel> modelsToGenerate = getModelsToGenerate(refactoringContext.getRefactoring(), refactoringContext);
            refactorintView.showRefactoringView(refactoringContext, okAction, searchResults, !(modelsToGenerate.isEmpty()));
          }
        });
      }
    });
  }

  private SearchResults findUsages(final RefactoringContext refactoringContext) {
    // returns null if should be interrupted after the call 
    final SearchResults[] result = new SearchResults[]{null};
    ThreadUtils.runInUIThreadAndWait(new Runnable() {
      public void run() {
        ProgressManager.getInstance().run(new Task.Modal(ProjectHelper.toIdeaProject(refactoringContext.getCurrentOperationContext().getProject()), "Finding usages...", false) {
          public void run(@NotNull ProgressIndicator indicator) {
            indicator.setIndeterminate(true);
            ModelAccess.instance().runReadAction(new Runnable() {
              public void run() {
                try {
                  Project project = refactoringContext.getSelectedProject();
                  refactoringContext.setCurrentOperationContext(new ProjectOperationContext(project));
                  IRefactoring refactoring = refactoringContext.getRefactoring();
                  result[0] = refactoring.getAffectedNodes(refactoringContext);
                  if (result[0] == null) {
                    result[0] = new SearchResults();
                  }
                } catch (Throwable t) {
                  RefactoringFacade.LOG.error(t);
                }
              }
            });
          }
        });
        if (result[0] != null) {
          return;
        }
        int promptResult = JOptionPane.showConfirmDialog(MPSCommonDataKeys.FRAME.getData(DataManager.getInstance().getDataContext()), "An exception occurred during searching affected nodes. Do you want to continue anyway?", "Exception", JOptionPane.YES_NO_OPTION);
        if (promptResult == JOptionPane.YES_OPTION) {
          result[0] = new SearchResults();
        }
      }
    });
    return result[0];
  }

  protected void doExecute(@NotNull final RefactoringContext refactoringContext) {
    final IRefactoring refactoring = refactoringContext.getRefactoring();
    Runnable runnable = new Runnable() {
      public void run() {
        List<SModel> modelsToGenerate = getModelsToGenerate(refactoring, refactoringContext);
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {
          public void run() {
            try {
              refactoring.refactor(refactoringContext);
              if (refactoring instanceof ILoggableRefactoring) {
                RefactoringFacade.updateModels(refactoringContext);
              }
            } catch (Throwable t) {
              RefactoringFacade.LOG.error("An exception occured while trying to execute refactoring " + refactoring.getUserFriendlyName() + ". Models could have been corrupted.", t);
            }
          }
        });
        if (refactoringContext.getDoesGenerateModels()) {
          generateModels(modelsToGenerate, refactoringContext);
        } else {
          //  mark "generation required" 
        }
        try {
          refactoring.doWhenDone(refactoringContext);
        } catch (Throwable t) {
          RefactoringFacade.LOG.error("An error occurred in doWhenDone(), refactoring: " + refactoring.getUserFriendlyName(), t);
        }
      }
    };
    ThreadUtils.runInUIThreadNoWait(runnable);
  }

  @NotNull
  private List<SModel> getModelsToGenerate(final IRefactoring refactoring, final RefactoringContext refactoringContext) {
    return ModelAccess.instance().runReadAction(new Computable<List<SModel>>() {
      public List<SModel> compute() {
        try {
          return refactoring.getModelsToGenerate(refactoringContext);
        } catch (Throwable t) {
          RefactoringFacade.LOG.error("An error occured while trying to collect models to generate from refactoring " + refactoring.getUserFriendlyName() + ". No models will be generated", t);
          return new ArrayList<SModel>();
        }
      }
    });
  }

  private void generateModels(@NotNull final List<SModel> sourceModels, @NotNull final RefactoringContext refactoringContext) {
    if (sourceModels.isEmpty()) {
      return;
    }
    final RefactoringNodeMembersAccessModifier modifier = new RefactoringNodeMembersAccessModifier();
    final List<SModelDescriptor> descriptors = new ArrayList<SModelDescriptor>();
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        SModelRepository.getInstance().saveAll();
        //  save all before launching make 
        refactoringContext.setUpMembersAccessModifier(modifier);
        modifier.addModelsToModify(sourceModels);
        SNode.setNodeMemberAccessModifier(modifier);
        for (SModel model : sourceModels) {
          descriptors.add(model.getModelDescriptor());
        }
      }
    });
    final IOperationContext operationContext = new ProjectOperationContext(refactoringContext.getSelectedProject());
    new Thread() {
      public void run() {
        try {
          MakeSession sess = new MakeSession(operationContext);
          if (IMakeService.INSTANCE.get().openNewSession(sess)) {
            Future<IResult> result = IMakeService.INSTANCE.get().make(sess, new ModelsToResources(operationContext, descriptors).resources(false));
            result.get();
            //  wait for end of make to remove member access modifier 
          }
        } catch (InterruptedException e) {
        } catch (ExecutionException e) {
          e.printStackTrace();
        } finally {
          onGenerationFinished();
        }
      }
    }.start();
    //     GeneratorUIFacade.getInstance().generateModels(operationContext, descriptors, GeneratorUIFacade.getInstance().getDefaultGenerationHandler(), true, false); 
  }

  protected void onGenerationFinished() {
    SNode.setNodeMemberAccessModifier(null);
  }

  protected static void updateModels(RefactoringContext refactoringContext) {
    assert refactoringContext.getRefactoring() instanceof ILoggableRefactoring;
    if (!(refactoringContext.isLocal())) {
      RefactoringFacade.writeIntoLog(refactoringContext);
      RefactoringFacade.updateLoadedModels(refactoringContext);
    } else {
      UsagesList usages = refactoringContext.getUsages();
      if (usages != null) {
        for (SModel anotherModel : usages.getAffectedModels()) {
          RefactoringFacade.updateModel(anotherModel, refactoringContext);
        }
      }
    }
  }

  public static void updateLoadedModels(RefactoringContext refactoringContext) {
    Map<SModelReference, Integer> dependencies = refactoringContext.getStructureModification().getDependencies();
    for (SModelDescriptor anotherDescriptor : SModelRepository.getInstance().getModelDescriptors()) {
      if (!(SModelStereotype.isUserModel(anotherDescriptor))) {
        continue;
      }
      if (anotherDescriptor.getLoadingState() == ModelLoadingState.NOT_LOADED) {
        continue;
      }
      SModel anotherModel = anotherDescriptor.getSModel();
      //       Set<SModelReference> dependenciesModels = SModelOperations.getDependenciesModelRefs(anotherModel); 
      //       if (!dependenciesModels.contains(initialModelReference)) continue; 
      //       updateModel(anotherModel, refactoringContext); 
      //  suppose that all models were saved before refactoring started => ImportElements are up to date 
      for (SModel.ImportElement elem : SModelOperations.getAllImportElements(anotherModel)) {
        Integer version = dependencies.get(elem.getModelReference());
        if (version != null && elem.getUsedVersion() <= version) {
          RefactoringFacade.updateModel(anotherModel, refactoringContext);
          break;
        }
      }
    }
  }

  protected static void updateModel(final SModel model, final RefactoringContext refactoringContext) {
    IRefactoring refactoring = refactoringContext.getRefactoring();
    try {
      ((ILoggableRefactoring) refactoring).updateModel(model, refactoringContext);
    } catch (Throwable t) {
      LOG.error("An exception was thrown by refactoring " + refactoring.getUserFriendlyName() + " while updating model " + model.getLongName() + ". Models could have been corrupted.", t);
    }
    if (!(refactoringContext.isLocal())) {
      Map<SModelReference, Integer> dependencies = refactoringContext.getStructureModification().getDependencies();
      for (SModelReference modelRef : dependencies.keySet()) {
        model.updateImportedModelUsedVersion(modelRef, dependencies.get(modelRef) + 1);
      }
    }
    SModelRepository.getInstance().markChanged(model);
  }

  public static void writeIntoLog(RefactoringContext refactoringContext) {
    assert !(refactoringContext.isLocal());
    assert refactoringContext.getRefactoring() instanceof ILoggableRefactoring;
    StructureModificationProcessor.addToLog(refactoringContext.getStructureModification());
  }
}
