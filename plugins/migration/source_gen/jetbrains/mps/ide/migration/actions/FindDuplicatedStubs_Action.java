package jetbrains.mps.ide.migration.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import java.util.List;
import jetbrains.mps.smodel.SModelReference;
import java.util.HashMap;
import jetbrains.mps.smodel.SModelDescriptor;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.ProjectScope;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.IMapping;

public class FindDuplicatedStubs_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(FindDuplicatedStubs_Action.class);

  public FindDuplicatedStubs_Action() {
    super("Find Duplicated Stubs", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "FindDuplicatedStubs", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      final Map<String, List<SModelReference>> n2m = MapSequence.fromMap(new HashMap<String, List<SModelReference>>());
      Iterable<SModelDescriptor> models = ((Project) MapSequence.fromMap(_params).get("project")).getComponent(ProjectScope.class).getModelDescriptors();
      Sequence.fromIterable(models).where(new IWhereFilter<SModelDescriptor>() {
        public boolean accept(SModelDescriptor it) {
          return SModelStereotype.isStubModelStereotype(it.getStereotype());
        }
      }).visitAll(new IVisitor<SModelDescriptor>() {
        public void visit(SModelDescriptor it) {
          List<SModelReference> refs = MapSequence.fromMap(n2m).get(it.getLongName());
          if (refs == null) {
            MapSequence.fromMap(n2m).put(it.getLongName(), ListSequence.fromList(new ArrayList<SModelReference>()));
          }
          ListSequence.fromList(MapSequence.fromMap(n2m).get(it.getLongName())).addElement(it.getSModelReference());
        }
      });

      MapSequence.fromMap(n2m).where(new IWhereFilter<IMapping<String, List<SModelReference>>>() {
        public boolean accept(IMapping<String, List<SModelReference>> it) {
          return ListSequence.fromList(it.value()).count() > 1;
        }
      }).visitAll(new IVisitor<IMapping<String, List<SModelReference>>>() {
        public void visit(IMapping<String, List<SModelReference>> it) {
          System.out.print(it.key() + ":\n");
          ListSequence.fromList(it.value()).visitAll(new IVisitor<SModelReference>() {
            public void visit(SModelReference el) {
              System.out.print("  " + el + ":\n");
            }
          });
        }
      });
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "FindDuplicatedStubs", t);
      }
    }
  }
}
