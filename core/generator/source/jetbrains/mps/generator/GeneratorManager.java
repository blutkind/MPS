/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.generator;

import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.cleanup.CleanupManager;
import jetbrains.mps.generator.generationTypes.IGenerationHandler;
import jetbrains.mps.generator.impl.GenerationController;
import jetbrains.mps.generator.impl.GeneratorLoggerAdapter;
import jetbrains.mps.ide.generator.GenerationSettings;
import jetbrains.mps.lang.generator.plugin.debug.GenerationTracer;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.UndoHelper;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;

import java.util.ArrayList;
import java.util.List;

public class GeneratorManager {

  private static final Logger LOG = Logger.getLogger(GeneratorManager.class);

  public static final String DO_NOT_GENERATE = "doNotGenerate";

  private final List<GenerationListener> myGenerationListeners = new ArrayList<GenerationListener>();
  private final List<CompilationListener> myCompilationListeners = new ArrayList<CompilationListener>();

  private Project myProject;

  public GeneratorManager(Project project) {
    myProject = project;
  }

  /**
   * @return false if canceled
   */
  public boolean generateModels(final List<SModelDescriptor> inputModels,
                                final IOperationContext invocationContext,
                                final IGenerationHandler generationHandler,
                                final ProgressIndicator progress,
                                final IMessageHandler messages) {
    return generateModels(inputModels, invocationContext, generationHandler, progress, messages, false, true);
  }

  /**
   * @return false if canceled
   */
  public boolean generateModels(final List<SModelDescriptor> inputModels,
                                final IOperationContext invocationContext,
                                final IGenerationHandler generationHandler,
                                final ProgressIndicator progress,
                                final IMessageHandler messages,
                                final boolean saveTransientModels,
                                final boolean rebuildAll) {

    final boolean[] result = new boolean[1];
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        myProject.getComponent(TransientModelsModule.class).clearAll();
        if (!saveTransientModels) {
          myProject.getComponent(GenerationTracer.class).discardTracing();
        }

        IGenerationTracer tracer = saveTransientModels
          ? myProject.getComponent(GenerationTracer.class)
          : new NullGenerationTracer();
        tracer.startTracing();

        GenerationSettings settings = GenerationSettings.getInstance();

        GenerationOptions options = new GenerationOptions(
          settings.isStrictMode(), saveTransientModels, rebuildAll, settings.isGenerateDependencies(), !settings.isShowWarnings() && !settings.isShowInfo(), settings.isParallelGenerator(),
          settings.getNumberOfParallelThreads(), settings.getPerformanceTracingLevel(), tracer);

        fireBeforeGeneration(inputModels, options, invocationContext);

        GeneratorLoggerAdapter logger = new GeneratorLoggerAdapter(messages, settings.isShowInfo(), settings.isShowWarnings(), settings.isKeepModelsWithWarnings());

        final GenerationController gc = new GenerationController(inputModels, options, generationHandler, new GeneratorNotifierHelper(), logger, invocationContext, progress);
        result[0] = UndoHelper.getInstance().runNonUndoableAction(new Computable<Boolean>() {
          @Override
          public Boolean compute() {
            return gc.generate();
          }
        });
        tracer.finishTracing();
        fireAfterGeneration(inputModels, options, invocationContext);

        myProject.getComponent(TransientModelsModule.class).publishAll();
        CleanupManager.getInstance().cleanup();
      }
    });
    generationHandler.generationCompleted();
    return result[0];
  }

  private void fireBeforeGeneration(List<SModelDescriptor> inputModels, GenerationOptions options, IOperationContext operationContext) {
    for (GenerationListener l : myGenerationListeners) {
      try {
        l.beforeGeneration(inputModels, options, operationContext);
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  private void fireAfterGeneration(List<SModelDescriptor> inputModels, GenerationOptions options, IOperationContext operationContext) {
    for (GenerationListener l : myGenerationListeners) {
      try {
        l.afterGeneration(inputModels, options, operationContext);
      } catch (Throwable t) {
        LOG.error(t);
      }
    }
  }

  public class GeneratorNotifierHelper {

    public void fireModelsGenerated(List<SModelDescriptor> models, boolean success) {
      for (GenerationListener l : myGenerationListeners) {
        try {
          l.modelsGenerated(models, success);
        } catch (Throwable t) {
          LOG.error(t);
        }
      }
    }

    public void fireBeforeModelsCompiled(List<SModelDescriptor> models, boolean success) {
      for (CompilationListener l : myCompilationListeners) {
        try {
          l.beforeModelsCompiled(models, success);
        } catch (Throwable t) {
          LOG.error(t);
        }
      }
    }

    public void fireAfterModelsCompiled(List<SModelDescriptor> models, boolean success) {
      for (CompilationListener l : myCompilationListeners) {
        try {
          l.afterModelsCompiled(models, success);
        } catch (Throwable t) {
          LOG.error(t);
        }
      }
    }
  }

  public void addGenerationListener(GenerationListener l) {
    myGenerationListeners.add(l);
  }

  public void removeGenerationListener(GenerationListener l) {
    myGenerationListeners.remove(l);
  }

  public void addCompilationListener(CompilationListener l) {
    myCompilationListeners.add(l);
  }

  public void removeCompilationListener(CompilationListener l) {
    myCompilationListeners.remove(l);
  }

  public static boolean isDoNotGenerate(SModelDescriptor sm) {
    if (!(sm instanceof EditableSModelDescriptor)) return false;
    return Boolean.parseBoolean(((EditableSModelDescriptor) sm).getAttribute(DO_NOT_GENERATE));
  }

  public static void setDoNotGenerate(SModelDescriptor sm, boolean value) {
    if (!(sm instanceof EditableSModelDescriptor)) return;
    ((EditableSModelDescriptor) sm).setAttribute(DO_NOT_GENERATE, "" + value);
  }
}
