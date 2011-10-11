package jetbrains.mps.refactoring.framework;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.smodel.ModelAccess;
import java.util.Set;
import jetbrains.mps.findUsages.FindUsagesManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.progress.EmptyProgressMonitor;
import jetbrains.mps.smodel.Language;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Map;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.Project;
import jetbrains.mps.smodel.MPSModuleRepository;
import java.util.LinkedHashMap;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.structure.project.testconfigurations.ModuleTestConfiguration;
import jetbrains.mps.project.structure.project.testconfigurations.IllegalGeneratorConfigurationException;
import java.util.Collections;

public class RefactoringUtil {
  private static final Logger LOG = Logger.getLogger(RefactoringUtil.class);

  public RefactoringUtil() {
  }

  public static IRefactoring getRefactoringByClassName(String className) {
    for (IRefactoring r : RefactoringUtil.getAllRefactorings()) {
      Class refClass = (r instanceof OldRefactoringAdapter ?
        ((OldRefactoringAdapter) r).getRefactoringClass() :
        r.getClass()
      );
      if (refClass.getName().equals(className)) {
        return r;
      }
    }
    return null;
  }

  public static List<SNode> getAllRefactoringNodes() {
    final List<SNode> availableRefactorings = new ArrayList<SNode>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        Set<SNode> newRefactorings = FindUsagesManager.getInstance().findInstances(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.refactoring.structure.Refactoring"), GlobalScope.getInstance(), new EmptyProgressMonitor(), false);
        Set<SNode> oldRefactorings = FindUsagesManager.getInstance().findInstances(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.refactoring.structure.OldRefactoring"), GlobalScope.getInstance(), new EmptyProgressMonitor(), false);
        availableRefactorings.addAll(newRefactorings);
        availableRefactorings.addAll(oldRefactorings);
      }
    });
    return availableRefactorings;
  }

  public static List<IRefactoring> getAllRefactorings() {
    List<IRefactoring> allRefactorings = new ArrayList<IRefactoring>();
    List<Language> languages = GlobalScope.getInstance().getVisibleLanguages();
    for (Language language : languages) {
      allRefactorings.addAll(RefactoringUtil.getRefactorings(language));
    }
    return allRefactorings;
  }

  public static Set<IRefactoring> getRefactorings(Language language) {
    Set<IRefactoring> result = new HashSet<IRefactoring>();
    {
      SModelDescriptor scriptsModelDescriptor = LanguageAspect.SCRIPTS.get(language);
      if (scriptsModelDescriptor != null) {
        SModel scriptsModel = scriptsModelDescriptor.getSModel();
        String packageName = scriptsModel.getLongName();
        for (SNode refactoring : SModelOperations.getRoots(scriptsModel, "jetbrains.mps.lang.refactoring.structure.OldRefactoring")) {
          try {
            String fqName = packageName + "." + SPropertyOperations.getString(refactoring, "name");
            Class<AbstractLoggableRefactoring> cls = language.getClass(fqName);
            if (cls == null) {
              LOG.error("Can't find " + fqName);
              continue;
            }
            Constructor<AbstractLoggableRefactoring> constructor = cls.getConstructor();
            constructor.setAccessible(false);
            AbstractLoggableRefactoring oldRefactoring = constructor.newInstance();
            result.add(OldRefactoringAdapter.createAdapterFor(oldRefactoring));
          } catch (Throwable t) {
            LOG.error(t);
          }
        }
      }
    }
    SModelDescriptor refModelDescriptor = LanguageAspect.REFACTORINGS.get(language);
    if (refModelDescriptor != null) {
      SModel refactoringsModel = refModelDescriptor.getSModel();
      String packageName = refactoringsModel.getLongName();
      for (SNode refactoring : SModelOperations.getRoots(refactoringsModel, "jetbrains.mps.lang.refactoring.structure.Refactoring")) {
        try {
          String fqName = packageName + "." + SPropertyOperations.getString(refactoring, "name");
          Class<IRefactoring> cls = language.getClass(fqName);
          if (cls == null) {
            LOG.error("Can't find " + fqName);
            continue;
          }
          Constructor<IRefactoring> constructor = cls.getConstructor();
          constructor.setAccessible(false);
          result.add(constructor.newInstance());
        } catch (Throwable t) {
          LOG.error(t);
        }
      }
    }
    return result;
  }

  public static RefactoringUtil.Applicability getApplicability(IRefactoring refactoring, Collection entities) {
    assert !(entities.isEmpty());
    assert (entities.size() == 1 || refactoring.getRefactoringTarget().allowMultipleTargets());
    IRefactoringTarget target = refactoring.getRefactoringTarget();
    if (!(RefactoringUtil.isApplicableToEntities(refactoring.getUserFriendlyName(), target, entities))) {
      return RefactoringUtil.Applicability.NOT_APPLICABLE;
    }
    for (IRefactoring r : RefactoringUtil.getAllRefactorings()) {
      if (r.getOverridenRefactoringClass() == null) {
        continue;
      }
      if (r.getRefactoringTarget().getTarget() != target.getTarget()) {
        continue;
      }
      if (!(RefactoringUtil.isApplicableToEntities(r.getUserFriendlyName(), r.getRefactoringTarget(), entities))) {
        continue;
      }
      Class refClass = (refactoring instanceof OldRefactoringAdapter ?
        ((OldRefactoringAdapter) refactoring).getRefactoringClass() :
        refactoring.getClass()
      );
      if (r.getOverridenRefactoringClass() == null) {
        continue;
      }
      if (r.getOverridenRefactoringClass() == refClass) {
        return RefactoringUtil.Applicability.OVERRIDDEN;
      }
      String overriddenName = r.getOverridenRefactoringClass().getName();
      String refClassName = refClass.getName();
      String overriddenClassLoader = r.getOverridenRefactoringClass().getClassLoader().toString();
      String refClassLoader = refClass.getClassLoader().toString();
      assert !(overriddenName.equals(refClassName)) : "Refactoring classes are loaded using different classloaders. overridden: " + overriddenClassLoader + "; " + "ref: " + refClassLoader + "; class: " + refClassName;
    }
    return RefactoringUtil.Applicability.APPLICABLE;
  }

  private static boolean isApplicableToEntities(String refactoringName, IRefactoringTarget target, Collection entities) {
    for (Object entity : entities) {
      boolean applicable;
      try {
        applicable = target.isApplicable(entity);
      } catch (Throwable t) {
        LOG.error("An error occured while executing " + refactoringName + ".isApplicable(). This refactoring will not be available.", t);
        applicable = false;
      }
      if (!(applicable)) {
        return false;
      }
    }
    return true;
  }

  public static Map<IModule, List<SModel>> getLanguageAndItsExtendingLanguageModels(Project project, Language language) {
    Set<Language> extendingLangs = MPSModuleRepository.getInstance().getAllExtendingLanguages(language);
    Map<IModule, List<SModel>> result = new LinkedHashMap<IModule, List<SModel>>(extendingLangs.size() + 1);
    result.put(language, RefactoringUtil.getLanguageModelsList(project, language));
    for (Language l : extendingLangs) {
      if (!(l.equals(language))) {
        result.put(l, RefactoringUtil.getLanguageModelsList(project, l));
      }
    }
    return result;
  }

  @Deprecated
  public static Map<IModule, List<SModel>> getLanguageAndItsExtendingLanguageModels(com.intellij.openapi.project.Project project, Language language) {
    return RefactoringUtil.getLanguageAndItsExtendingLanguageModels(project.getComponent(MPSProject.class), language);
  }

  private static List<SModel> getLanguageModelsList(Project project, Language l) {
    ModuleTestConfiguration languageConfig = new ModuleTestConfiguration();
    languageConfig.setModuleRef(l.getModuleReference());
    try {
      return languageConfig.getGenParams(project, true).getSModels();
    } catch (IllegalGeneratorConfigurationException e) {
      throw new RuntimeException(e);
    }
  }

  public static Map<IModule, List<SModel>> getLanguageModels(Project project, Language language) {
    return Collections.<IModule,List<SModel>>singletonMap(language, RefactoringUtil.getLanguageModelsList(project, language));

  }

  @Deprecated
  public static Map<IModule, List<SModel>> getLanguageModels(com.intellij.openapi.project.Project project, Language language) {
    return RefactoringUtil.getLanguageModels(project.getComponent(MPSProject.class), language);
  }

  public static   enum Applicability {
    APPLICABLE() {

      public boolean lessThan(RefactoringUtil.Applicability level) {
        return false;
      }

    },
    NOT_APPLICABLE() {

      public boolean lessThan(RefactoringUtil.Applicability level) {
        return true;
      }

    },
    OVERRIDDEN() {

      public boolean lessThan(RefactoringUtil.Applicability level) {
        return level == RefactoringUtil.Applicability.APPLICABLE;
      }

    };

    Applicability() {
    }

    public abstract boolean lessThan(RefactoringUtil.Applicability level);
  }
}
