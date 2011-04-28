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
package jetbrains.mps.smodel.language;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.project.IModule;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.ModuleRepositoryAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * evgeny, 3/11/11
 */
public class LanguageRegistry implements ApplicationComponent {

  /*
  *  Language namespace can be changed.
  */
  private Map<Language, String> myLanguageToNamespace;
  private Map<String, LanguageRuntime> myLanguages;

  public static LanguageRegistry getInstance() {
    return ApplicationManager.getApplication().getComponent(LanguageRegistry.class);
  }

  public LanguageRegistry(MPSModuleRepository repository, ClassLoaderManager loaderManager) {

  }

  @Override
  public void initComponent() {
  }

  public void init() {
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        myLanguageToNamespace = new HashMap<Language, String>();
        myLanguages = new HashMap<String, LanguageRuntime>();

        MPSModuleRepository.getInstance().addModuleRepositoryListener(new ModuleRepositoryAdapter() {
          @Override
          public void moduleAdded(IModule module) {
            if (module instanceof Language) {
              Language l = (Language) module;
              String namespace = l.getModuleFqName();
              // avoid duplicates in registry
              if (!myLanguages.containsKey(namespace)) {
                LanguageRuntime runtime = createRuntime(l, true);
                if(runtime != null) {
                  myLanguages.put(namespace, runtime);
                  myLanguageToNamespace.put(l, namespace);
                }
              }
            }
          }

          @Override
          public void moduleInitialized(IModule module) {
          }

          @Override
          public void moduleChanged(IModule module) {
          }

          @Override
          public void moduleRemoved(IModule module) {
            if (module instanceof Language) {
              Language l = (Language) module;
              String namespace = myLanguageToNamespace.get(l);
              if (namespace != null && myLanguages.remove(namespace) != null) {
                myLanguageToNamespace.remove(l);
              }
            }
          }

          @Override
          public void repositoryChanged() {
            // TODO FIXME cleanup
          }
        });

        reloadLanguages();
      }
    });
  }

  public void reloadLanguages() {
    ModelAccess.assertLegalWrite();

    myLanguages.clear();
    Set<Language> existing = new HashSet<Language>(myLanguageToNamespace.keySet());
    for (Language l : MPSModuleRepository.getInstance().getAllLanguages()) {
      String namespace = l.getModuleFqName();
      if (!myLanguages.containsKey(namespace)) {
        existing.remove(l);
        myLanguageToNamespace.put(l, namespace);
        myLanguages.put(namespace, createRuntime(l, false));
      } else {
        // duplicate language, ignore
      }
    }
    for (Language l : existing) {
      myLanguageToNamespace.remove(l);
    }
  }

  private static LanguageRuntime createRuntime(Language l, boolean tryToLoad) {
    LanguageRuntime languageRuntime = null;
    try {
      String className = l.getModuleFqName() + ".Language";

      // TODO FIXME hack to avoid errors in LOG
      if(tryToLoad) {
        ClassLoader cl = ClassLoaderManager.getInstance().getClassLoaderFor(l, false);
        if(cl == null) {
          return null;
        }
      }

      Class c = l.getClass(className);
      if (c != null) {
        languageRuntime = (LanguageRuntime) c.newInstance();
      }
    } catch (Exception e) {
      /* ignore */
    }
    if (languageRuntime == null) {
      languageRuntime = new LanguageRuntimeInterpreted(l);
    }
    return languageRuntime;
  }

  @Override
  public void disposeComponent() {
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        myLanguageToNamespace.clear();
        myLanguages.clear();
      }
    });
  }

  @NotNull
  @Override
  public String getComponentName() {
    return "MPS Language Registry";
  }

  public String toString() {
    return "component: " + getComponentName();
  }

  /*
   *   Collection is valid until the end of the current read action.
   */
  public Collection<LanguageRuntime> getAvailableLanguages() {
    ModelAccess.assertLegalRead();

    return myLanguages.values();
  }

  public LanguageRuntime getLanguage(String namespace) {
    ModelAccess.assertLegalRead();

    return myLanguages.get(namespace);
  }
}
