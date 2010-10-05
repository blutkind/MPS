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
package jetbrains.mps.ide;

import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.MPSCore;
import jetbrains.mps.ide.smodel.WorkbenchModelAccess;
import jetbrains.mps.ide.undo.WorkbenchUndoHandler;
import jetbrains.mps.ide.vfs.IdeaFileSystemProvider;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.UndoHelper;
import jetbrains.mps.vfs.FileSystem;
import org.jetbrains.annotations.NotNull;

/**
 * Evgeny Gryaznov, Sep 3, 2010
 */
public class MPSWorkbench implements ApplicationComponent {
  @NotNull
  @Override
  public String getComponentName() {
    return "MPS Workbench";
  }

  @Override
  public void initComponent() {
    // setup filesystem provider
    boolean useIoFile = MPSCore.getInstance().isTestMode() && "true".equals(System.getProperty("mps.vfs.useIoFile"));
    if(!useIoFile) {
      FileSystem.getInstance().setFileSystemProvider(new IdeaFileSystemProvider());
    }

    // setup undo
    UndoHelper.getInstance().setUndoHandler(new WorkbenchUndoHandler());

    // setup model access
    ModelAccess.setInstance(new WorkbenchModelAccess());
  }

  @Override
  public void disposeComponent() {
  }
}
