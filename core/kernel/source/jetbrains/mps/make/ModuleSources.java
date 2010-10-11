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
package jetbrains.mps.make;

import com.intellij.openapi.fileTypes.FileTypeManager;
import jetbrains.mps.generator.cache.AllCaches;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSExtentions;
import jetbrains.mps.vfs.IFile;

import java.io.File;
import java.util.*;

public class ModuleSources {
  private Dependencies myDependencies;
  private IModule myModule;
  private Map<String, JavaFile> myJavaFiles = new HashMap<String, JavaFile>();
  private Map<String, ResourceFile> myResourceFiles = new HashMap<String, ResourceFile>();

  private Set<File> myFilesToDelete = new HashSet<File>();
  private Set<JavaFile> myFilesToCompile = new HashSet<JavaFile>();

  private Set<ResourceFile> myResourcesToCopy = new HashSet<ResourceFile>();

  ModuleSources(IModule module, Dependencies deps) {
    myModule = module;
    myDependencies = deps;

    collectInputFilesInfo();
    collectOutputFilesInfo();
  }

  public Set<File> getFilesToDelete() {
    return Collections.unmodifiableSet(myFilesToDelete);
  }

  public Set<JavaFile> getFilesToCompile() {
    return Collections.unmodifiableSet(myFilesToCompile);
  }

  public Set<ResourceFile> getResourcesToCopy() {
    return Collections.unmodifiableSet(myResourcesToCopy);
  }

  public boolean isUpToDate() {
    return getFilesToDelete().isEmpty() && getFilesToCompile().isEmpty() && getResourcesToCopy().isEmpty();
  }

  public JavaFile getJavaFile(String fqName) {
    return myJavaFiles.get(fqName);
  }

  private void collectInputFilesInfo() {
    for (String source : myModule.getSourcePaths()) {
      collectInput(new File(source), "");
    }
  }

  private void collectInput(File dir, String path) {
    File[] list = dir.listFiles();
    if (list == null) return;

    for (File child : list) {
      if (isIgnoredFileName(child.getName())) continue;

      if (isJavaFile(child)) {
        String className = child.getName().substring(0, child.getName().length() - MPSExtentions.DOT_JAVAFILE.length());
        String fqName = toPack(addSubPath(path, className));
        myJavaFiles.put(fqName, new JavaFile(child, fqName));
      }

      if (!child.isDirectory() && isResourceFileName(child.getName())) {
        String resourceName = child.getName();
        String childPath = addSubPath(path, resourceName);
        myResourceFiles.put(childPath, new ResourceFile(child, childPath));
      }

      collectInput(child, addSubPath(path, child.getName()));
    }
  }

  private void collectOutputFilesInfo() {
    myFilesToCompile.addAll(myJavaFiles.values());
    myResourcesToCopy.addAll(myResourceFiles.values());

    IFile classesGen = myModule.getClassesGen();
    if (classesGen == null) return;
    collectOutput(new File(classesGen.getAbsolutePath()), "", myFilesToCompile, myFilesToDelete, myResourcesToCopy);
  }

  private void collectOutput(File classesGen, String path, Set<JavaFile> toCompile, Set<File> toDelete, Set<ResourceFile> resourcesToCopy) {
    File[] files = classesGen.listFiles();
    if (files == null) return;

    for (File file : files) {
      if (isIgnoredFileName(file.getName())) continue;

      if (file.getName().endsWith(MPSExtentions.DOT_CLASSFILE)) {
        boolean isInnerClass = false;
        String containerName = file.getName().substring(0, file.getName().length() - MPSExtentions.DOT_CLASSFILE.length());
        if (containerName.contains("$")) {
          containerName = containerName.substring(0, containerName.indexOf("$"));
          isInnerClass = true;
        }
        String fqName = toPack(addSubPath(path, containerName));
        JavaFile javaFile = myJavaFiles.get(fqName);
        if (javaFile == null) {
          toDelete.add(file);
        } else if (!isInnerClass && isFileUpToDate(javaFile, file.lastModified())) {
          toCompile.remove(javaFile);
        }
      } else if (!file.isDirectory() && isResourceFileName(file.getName())) {
        String childPath = addSubPath(path, file.getName());
        ResourceFile resourceFile = myResourceFiles.get(childPath);
        if (resourceFile == null) {
          toDelete.add(file);
        } else if (resourceFile.getFile().lastModified() < file.lastModified()) {
          resourcesToCopy.remove(resourceFile);
        }
      } else {
        collectOutput(file, addSubPath(path, file.getName()), toCompile, toDelete, resourcesToCopy);
      }
    }
  }

  private boolean isFileUpToDate(JavaFile javaFile, long classFileLastModified) {
    if (javaFile.getFile().lastModified() < classFileLastModified) {
      for (String fqName : myDependencies.getAllDependencies(javaFile.getClassName())) {
        if (myDependencies.getModule(fqName) != null) {
          Long javaFileLastModified = myDependencies.getJavaFileLastModified(fqName);
          if (javaFileLastModified == 0 || javaFileLastModified > classFileLastModified) {
            return false;
          }
        }
      }
      return true;
    }
    return false;
  }

  private boolean isIgnoredFileName(String fileName) {
    return FileTypeManager.getInstance().isFileIgnored(fileName);
  }

  private String addSubPath(String path, String name) {
    if (path.length() > 0) {
      return path + "/" + name;
    } else {
      return name;
    }
  }

  private String toPack(String path) {
    return path.replace('/', '.');
  }

  private boolean isJavaFile(File file) {
    return !file.isDirectory() && file.getName().endsWith(MPSExtentions.DOT_JAVAFILE);
  }

  private boolean isResourceFileName(String fileName) {
    int extPos = fileName.lastIndexOf('.');
    return extPos != -1 && !fileName.endsWith(MPSExtentions.DOT_JAVAFILE) &&
      !fileName.endsWith(MPSExtentions.DOT_CLASSFILE) &&
      !AllCaches.getInstance().isCacheFile(fileName);
  }
}
