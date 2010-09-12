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
package jetbrains.mps.vcs;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.fileTypes.FileTypeManager;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ExcludedFileIndexApplicationComponent implements ApplicationComponent {
  private final GlobalClassPathIndex myGlobalClassPathIndex;

  public static ExcludedFileIndexApplicationComponent getInstance() {
    return ApplicationManager.getApplication().getComponent(ExcludedFileIndexApplicationComponent.class);
  }

  public ExcludedFileIndexApplicationComponent(GlobalClassPathIndex globalClassPathIndex) {
    myGlobalClassPathIndex = globalClassPathIndex;
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "Excluded File Index Application Component";
  }

  public void initComponent() {
  }

  public void disposeComponent() {
  }

  private boolean isExcluded(String path) {
    return myGlobalClassPathIndex.isExcluded(path) || FileTypeManager.getInstance().isFileIgnored(path);
  }

  public boolean isExcluded(VirtualFile file) {
    if (isExcluded(file.getPath())) return true;

    VirtualFile parent = file.getParent();
    if (parent == null) return false;
    return isExcluded(parent);
  }
}
