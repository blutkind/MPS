package jetbrains.mps.ide.findusages;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.bootstrap.findUsagesLanguage.behavior.FinderDeclaration_Behavior;
import jetbrains.mps.bootstrap.findUsagesLanguage.structure.FinderDeclaration;
import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.reloading.ReloadAdapter;
import jetbrains.mps.smodel.*;
import jetbrains.mps.util.NameUtil;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class FindersManager implements ApplicationComponent {
  private static final Logger LOG = Logger.getLogger(FindersManager.class);

  private Map<String, Set<GeneratedFinder>> myFinders = new HashMap<String, Set<GeneratedFinder>>();
  private Map<GeneratedFinder, SNode> myNodesByFinder = new HashMap<GeneratedFinder, SNode>();

  private ClassLoaderManager myClassLoaderManager;

  public static FindersManager getInstance() {
    return ApplicationManager.getApplication().getComponent(FindersManager.class);
  }

  public FindersManager(ClassLoaderManager manager) {
    myClassLoaderManager = manager;

  }

  public void initComponent() {
    myClassLoaderManager.addReloadHandler(new ReloadAdapter() {
      public void onReload() {
        refresh();
      }
    });
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "Finders Manager";
  }

  public void disposeComponent() {
  }

  public Set<GeneratedFinder> getAvailableFinders(final SNode node) {
    return
      (Set<GeneratedFinder>) ModelAccess.instance().runReadAction(new Computable<Object>() {
        public Object compute() {
          Set<GeneratedFinder> result = new HashSet<GeneratedFinder>();

          for (String conceptFQName : myFinders.keySet()) {
            if (node.isInstanceOfConcept(conceptFQName)) {
              for (GeneratedFinder finder : Collections.unmodifiableSet(myFinders.get(conceptFQName))) {
                try {
                  if (finder.isVisible(node)) {
                    if (finder.isApplicable(node)) {
                      result.add(finder);
                    }
                  }
                } catch (Throwable t) {
                  LOG.error("Finder's isApplicable method failed " + t.getMessage(), t);
                }
              }
            }
          }
          return Collections.unmodifiableSet(result);
        }
      });
  }

  public GeneratedFinder getFinderByClassName(String className) {
    for (Set<GeneratedFinder> finders : myFinders.values()) {
      for (GeneratedFinder finder : finders) {
        if (finder.getClass().getName().equals(className)) {
          return finder;
        }
      }
    }
    return null;
  }

  public SNode getNodeByFinder(GeneratedFinder finder) {
    return myNodesByFinder.get(finder);
  }

  public void refresh() {
    myFinders.clear();
    myNodesByFinder.clear();
    for (Language l : MPSModuleRepository.getInstance().getAllLanguages()) {
      SModelDescriptor findUsagesModelDescriptor = l.getFindUsagesModelDescriptor();
      if (findUsagesModelDescriptor != null) {
        SModel smodel = findUsagesModelDescriptor.getSModel();
        for (FinderDeclaration finderDeclaration : smodel.getRootsAdapters(FinderDeclaration.class)) {
          String className = smodel.getSModelReference().getLongName() + "." + FinderDeclaration_Behavior.call_getGeneratedClassName_1213877240101(finderDeclaration.getNode());
          String conceptName = FinderDeclaration_Behavior.call_getConceptName_1213877240111(finderDeclaration.getNode());
          try {
            Class<?> cls = l.getClass(className);

            if (cls != null) {
              Object finder = cls.newInstance();
              Set<GeneratedFinder> finders = myFinders.get(conceptName);
              if (finders == null) {
                finders = new HashSet<GeneratedFinder>();
              }
              finders.add((GeneratedFinder) finder);
              myFinders.put(conceptName, finders);
              myNodesByFinder.put((GeneratedFinder) finder, finderDeclaration.getNode());
            } else {
              LOG.warning("Finder is registered but isn't compiled " + NameUtil.nodeFQName(finderDeclaration), finderDeclaration);
            }
          } catch (Exception e) {
            LOG.error(e, finderDeclaration);
          }
        }
      }
    }
  }
}