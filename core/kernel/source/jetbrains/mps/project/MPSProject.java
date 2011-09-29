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
package jetbrains.mps.project;

import com.intellij.ide.impl.ProjectUtil;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.project.ProjectManager;
import jetbrains.mps.MPSCore;
import jetbrains.mps.cleanup.CleanupManager;
import jetbrains.mps.project.persistence.ProjectDescriptorPersistence;
import jetbrains.mps.project.structure.project.ProjectDescriptor;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;
import org.jdom.Element;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 *  TODO move to workbench
 */
@State(
  name = "MPSProject",
  storages = {
    @Storage(
      id = "other",
      file = "$PROJECT_FILE$"
    )
  }
)
public class MPSProject extends Project implements ProjectComponent, PersistentStateComponent<Element> {
  private com.intellij.openapi.project.Project myProject;

  public MPSProject(com.intellij.openapi.project.Project project) {
    myProject = project;
  }

  public Element getState() {
    if (myProject.getPresentableUrl() == null) {
      return new Element("state");
    }

    return ModelAccess.instance().runReadAction(new Computable<Element>() {
      public Element compute() {
        ProjectDescriptor descriptor = getProjectDescriptor();
        File file = new File(myProject.getPresentableUrl());
        return ProjectDescriptorPersistence.saveProjectDescriptorToElement(descriptor, file);
      }
    });
  }

  public void loadState(Element state) {
    myProjectElement = state;
  }

  public void projectOpened() {

  }

  public void projectClosed() {

  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "MPS Project Holder";
  }

  public void initComponent() {
    String url = myProject.getPresentableUrl();
    if (url != null) {
      final File projectFile = new File(url);
      ProjectDescriptor descriptor = new ProjectDescriptor();
      ProjectDescriptorPersistence.loadProjectDescriptorFromElement(descriptor, projectFile, myProjectElement);
      init(projectFile, descriptor);
    } else {
      ProjectDescriptor descriptor = new ProjectDescriptor();
      init(null, descriptor);
    }
  }

  public void disposeComponent() {
    dispose(false);
  }

  //-----------project holder end

  public static final String COMPONENT = "component";
  public static final String CLASS = "class";

  public void init(final File projectFile, final ProjectDescriptor projectDescriptor) {
    if (myProject.isDefault()) return;

    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        myProjectFile = projectFile;
        myProjectDescriptor = projectDescriptor;

        readModules();

        for (IModule m : getModules()) {
          m.onModuleLoad();
        }
      }
    });
  }

  @Deprecated //now this is done in ProjectCloseClassReloader
  public void dispose(boolean reloadAll) {
    dispose();
  }

  public void dispose() {
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        ClassLoaderManager.getInstance().unloadAll(new EmptyProgressIndicator());

        MPSModuleRepository.getInstance().unRegisterModules(MPSProject.this);

        CleanupManager.getInstance().cleanup();

        if (ProjectManager.getInstance().getOpenProjects().length > 0) {
          ClassLoaderManager.getInstance().reloadAll(new EmptyProgressIndicator());
        }
        ClassLoaderManager.getInstance().updateClassPath();
      }
    });

    //todo hack
    if (myProject != null) {
      if (MPSCore.getInstance().isTestMode() && !(myProject.isDisposed())) {
        //second check if for MPS-12881, we invoked this method reqursively and tried to dispose a disposed project
        ProjectUtil.closeAndDispose(myProject);
      }
    }
  }

  @NotNull
  public String toString() {
    return "MPSProject file: " + (myProjectFile == null ? "<none>" : myProjectFile.toString());
  }

  public com.intellij.openapi.project.Project getProject() {
    return myProject;
  }

  //--project stuff

  //-----------DEPRECATED

  @Deprecated
  // should be left for compatibility with generated plugins (editor openers)
  public <T> T getComponent(Class<T> clazz) {
    return getProject().getComponent(clazz);
  }
}
