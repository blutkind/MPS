package jetbrains.mps.plugin;

/*Generated by MPS */

import java.rmi.server.UnicastRemoteObject;
import com.intellij.openapi.components.ProjectComponent;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.project.Project;
import java.rmi.RemoteException;
import jetbrains.mps.MPSCore;
import java.rmi.NoSuchObjectException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import java.awt.Frame;
import com.intellij.openapi.wm.WindowManager;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.LanguageID;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import jetbrains.mps.util.FrameUtil;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.findalgorithm.finders.specific.AspectMethodsFinder;
import jetbrains.mps.ide.findusages.findalgorithm.finders.IFinder;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.util.Computable;

public class MPSProjectIDEHandler extends UnicastRemoteObject implements IMPSIDEHandler, ProjectComponent {
  private static final Logger LOG = Logger.getLogger(MPSProjectIDEHandler.class);

  private Project myProject;

  public MPSProjectIDEHandler(Project project) throws RemoteException {
    myProject = project;
  }

  public void projectOpened() {
    if (MPSCore.getInstance().isTestMode()) {
      return;
    }
    new Thread() {
      public void run() {
        try {
          IProjectHandler handler = MPSPlugin.getInstance().getProjectHandler(myProject);
          if (handler == null) {
            return;
          }
          handler.addIdeHandler(MPSProjectIDEHandler.this);
        } catch (RemoteException e) {
          e.printStackTrace();
        }
      }
    }.start();
  }

  public void projectClosed() {
    if (MPSCore.getInstance().isTestMode()) {
      return;
    }
    new Thread() {
      @Override
      public void run() {
        IProjectHandler handler = MPSPlugin.getInstance().getProjectHandler(myProject);
        if (handler != null) {
          try {
            handler.removeIdeHandler(MPSProjectIDEHandler.this);
          } catch (RemoteException e) {
            MPSProjectIDEHandler.LOG.error(e);
          }
        }
        try {
          UnicastRemoteObject.unexportObject(MPSProjectIDEHandler.this, true);
        } catch (NoSuchObjectException e) {
          throw new RuntimeException(e);
        }
      }
    }.start();
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "MPS Project IDE Handler";
  }

  public void initComponent() {
  }

  public void disposeComponent() {
  }

  private Frame getMainFrame() {
    return WindowManager.getInstance().getFrame(myProject);
  }

  public void showNode(final String namespace, final String id) throws RemoteException {
    ThreadUtils.runInUIThreadNoWait(new Runnable() {
      public void run() {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            for (SModelDescriptor descriptor : GlobalScope.getInstance().getModelDescriptors()) {
              if (!(namespace.equals(descriptor.getSModelReference().getLongName()))) {
                continue;
              }
              if (descriptor.getStereotype().equals(SModelStereotype.getStubStereotypeForId(LanguageID.JAVA))) {
                continue;
              }
              SNode node = descriptor.getSModel().getNodeById(id);
              if (node != null) {
                myProject.getComponent(MPSEditorOpener.class).openNode(node);
              }
            }
            FrameUtil.activateFrame(getMainFrame());
          }
        });
      }
    });
  }

  public void showAspectMethodUsages(final String namespace, final String name) throws RemoteException {
    SearchQuery searchQuery = new SearchQuery(new AspectMethodsFinder.AspectMethodsHolder(namespace, name), GlobalScope.getInstance());
    IFinder[] finders = new IFinder[]{new AspectMethodsFinder()};
    myProject.getComponent(UsagesViewTool.class).findUsages(FindUtils.makeProvider(finders), searchQuery, false, true, false, "No usages for that method");
  }

  public void showConceptNode(final String fqName) throws RemoteException {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        SNode concept = SModelUtil.findConceptDeclaration(fqName, GlobalScope.getInstance());
        myProject.getComponent(MPSEditorOpener.class).openNode(concept);
        FrameUtil.activateFrame(getMainFrame());
      }
    });
  }

  public void showClassUsages(final String fqName) throws RemoteException {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        SNode cls = SModelUtil.findNodeByFQName(fqName, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Classifier"), GlobalScope.getInstance());
        if (cls == null) {
          MPSProjectIDEHandler.LOG.error("Can't find a class " + fqName);
          return;
        }
        FrameUtil.activateFrame(getMainFrame());
        findUsages(cls, GlobalScope.getInstance(), FindUtils.makeProvider(FindUtils.getFinderByClassName("jetbrains.mps.baseLanguage.findUsages.ClassUsages_Finder")));
      }
    });
  }

  public void showMethodUsages(final String classFqName, final String methodName, final int parameterCount) throws RemoteException {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        if (classFqName == null || methodName == null) {
          MPSProjectIDEHandler.LOG.error("Can't find a method " + classFqName + "." + methodName);
          return;

        }
        SNode cls = SNodeOperations.as(SModelUtil.findNodeByFQName(classFqName, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Classifier"), GlobalScope.getInstance()), "jetbrains.mps.baseLanguage.structure.Classifier");
        if (cls == null) {
          MPSProjectIDEHandler.LOG.error("Can't find a class " + classFqName);
          return;
        }
        Iterable<SNode> allMethods = (Iterable<SNode>) ListSequence.fromList(SNodeOperations.getChildren(cls)).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
          }
        });
        SNode method = Sequence.fromIterable(allMethods).findFirst(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return methodName.equals(SPropertyOperations.getString(it, "name")) && ListSequence.fromList(SLinkOperations.getTargets(it, "parameter", true)).count() == parameterCount;
          }
        });
        if (method == null) {
          MPSProjectIDEHandler.LOG.error("Can't find a method " + classFqName + "." + methodName);
          return;
        }
        FrameUtil.activateFrame(getMainFrame());
        IResultProvider provider = FindUtils.makeProvider(FindUtils.getFinderByClassName("jetbrains.mps.baseLanguage.findUsages.ConstructorUsages_Finder"), FindUtils.getFinderByClassName("jetbrains.mps.baseLanguage.findUsages.BaseMethodUsages_Finder"));
        findUsages(method, GlobalScope.getInstance(), provider);
      }
    });
  }

  private void findUsages(@NotNull final SNode node, final IScope scope, final IResultProvider provider) {
    new Thread() {
      public void run() {
        SearchQuery query = ModelAccess.instance().runReadAction(new Computable<SearchQuery>() {
          public SearchQuery compute() {
            return new SearchQuery(node, scope);
          }
        });
        myProject.getComponent(UsagesViewTool.class).findUsages(provider, query, true, true, false, "No usages for that node");
      }
    }.start();
  }
}
