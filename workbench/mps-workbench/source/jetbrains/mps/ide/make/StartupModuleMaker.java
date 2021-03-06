/*
 * Copyright 2003-2011 JetBrains s.r.o.
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
package jetbrains.mps.ide.make;

import com.intellij.openapi.components.AbstractProjectComponent;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupManager;
import jetbrains.mps.ide.messages.MessagesViewTool;
import jetbrains.mps.library.ProjectLibraryManager;
import jetbrains.mps.make.ModuleMaker;
import jetbrains.mps.messages.IMessage;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.progress.EmptyProgressMonitor;
import jetbrains.mps.progress.ProgressMonitor;
import jetbrains.mps.progress.ProgressMonitorAdapter;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;

import java.util.LinkedHashSet;

public class StartupModuleMaker extends AbstractProjectComponent {
  @SuppressWarnings({"UnusedDeclaration"})
  public StartupModuleMaker(Project project, MPSProject mpsProject, ProjectLibraryManager plm) {
    super(project);

    final ProgressIndicator indicator = ProgressManager.getInstance().getProgressIndicator();
    final ProgressMonitor monitor = indicator != null ? new ProgressMonitorAdapter(indicator) : new EmptyProgressMonitor();

    monitor.start("Making modules", 10);
    try {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          ClassLoaderManager.getInstance().updateClassPath();
          monitor.advance(1);

          ModuleMaker maker = new ModuleMaker(new MessageHandler(), MessageKind.ERROR);
          maker.make(new LinkedHashSet<IModule>(MPSModuleRepository.getInstance().getAllModules()), monitor.subTask(9));
        }
      });

      //the pre-startup activity is needed because all project components must be already instantiated when first class reload happens
      StartupManager.getInstance(project).registerPreStartupActivity(new Runnable() {
        public void run() {
          ModelAccess.instance().runWriteAction(new Runnable() {
            public void run() {
              ClassLoaderManager.getInstance().reloadAll(indicator != null ? new ProgressMonitorAdapter(indicator) : new EmptyProgressMonitor());
            }
          });
        }
      });

    } finally {
      monitor.done();
    }
  }


  private class MessageHandler implements IMessageHandler {
    private MessagesViewTool mvt;

    public MessageHandler() {
      this.mvt = myProject.getComponent(MessagesViewTool.class);
    }

    public void clear() {
      this.mvt.clear();
    }

    public void handle(IMessage message) {
      this.mvt.add(message);
    }
}

}
