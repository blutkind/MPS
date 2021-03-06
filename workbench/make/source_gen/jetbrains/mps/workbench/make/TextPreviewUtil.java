package jetbrains.mps.workbench.make;

/*Generated by MPS */

import jetbrains.mps.make.MakeSession;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.script.ScriptBuilder;
import jetbrains.mps.make.facet.IFacet;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.make.script.IScriptController;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.make.script.IOption;
import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.make.script.IJobMonitor;
import java.util.concurrent.Future;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.IMakeService;
import jetbrains.mps.smodel.resources.ModelsToResources;
import jetbrains.mps.internal.collections.runtime.Sequence;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.smodel.resources.FResource;
import javax.swing.SwingUtilities;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.project.ProjectHelper;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.OpenFileDescriptor;
import java.util.concurrent.ExecutionException;

public class TextPreviewUtil {
  public TextPreviewUtil() {
  }

  public static void previewModelText(final MakeSession session, final IOperationContext context, final SModelDescriptor md) {
    IScript scr = new ScriptBuilder().withFacetNames(new IFacet.Name("jetbrains.mps.lang.core.Generate"), new IFacet.Name("jetbrains.mps.lang.core.TextGen"), new IFacet.Name("jetbrains.mps.lang.core.Make")).withFinalTarget(new ITarget.Name("jetbrains.mps.lang.core.TextGen.textGenToMemory")).toScript();

    IScriptController ctl = new IScriptController.Stub(new IConfigMonitor.Stub() {
      public <T extends IOption> T relayQuery(IQuery<T> query) {
        return query.defaultOption();
      }
    }, new IJobMonitor.Stub());

    final Future<IResult> future = IMakeService.INSTANCE.get().make(session, new ModelsToResources(context, Sequence.<SModelDescriptor>singleton(md)).resources(false), scr, ctl);

    ApplicationManager.getApplication().executeOnPooledThread(new Runnable() {
      public void run() {
        try {
          IResult result = future.get();
          if (result.isSucessful()) {
            FResource fres = (FResource) Sequence.fromIterable(result.output()).first();

            final TextPreviewFile tfile = new TextPreviewFile(md.getSModelReference().getSModelFqName().getCompactPresentation() + "/text", "Generated text for " + md.getSModelReference().getSModelFqName().getLongName(), fres.contents());

            SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                Project p = ProjectHelper.toIdeaProject(context.getProject());
                FileEditorManager.getInstance(p).openTextEditor(new OpenFileDescriptor(p, tfile), true);
              }
            });
          }
        } catch (InterruptedException ignore) {
        } catch (ExecutionException ignore) {
        }
      }
    });
  }
}
