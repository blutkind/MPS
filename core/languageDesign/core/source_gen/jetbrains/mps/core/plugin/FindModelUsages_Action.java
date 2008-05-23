package jetbrains.mps.core.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.CurrentProjectMPSAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.findalgorithm.resultproviders.TreeBuilder;
import jetbrains.mps.ide.findusages.findalgorithm.finders.specific.ModelUsagesFinder;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;

public class FindModelUsages_Action extends CurrentProjectMPSAction {
  public static final Logger LOG = Logger.getLogger(FindModelUsages_Action.class);

  private SModel model;
  private boolean isAlwaysVisible = false;

  public FindModelUsages_Action(MPSProject project) {
    super(project, "Find Usages");
  }

  @NotNull()
  public String getKeyStroke() {
    return "alt F7";
  }

  public void doUpdate(@NotNull() ActionContext context) {
    try {
      super.doUpdate(context);
      if (!(this.fillFieldsIfNecessary(context))) {
        this.setEnabled(false);
        this.setVisible(this.isAlwaysVisible);
        return;
      }
      this.setEnabled(true);
      this.setVisible(true);
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "FindModelUsages", t);
      this.setEnabled(false);
      this.setVisible(this.isAlwaysVisible);
    }
  }

  private boolean fillFieldsIfNecessary(ActionContext context) {
    try {
      {
        SModel model = null;
        if (context.getModel() != null) {
          model = context.getModel().getSModel();
        }
        this.model = model;
      }
      if (this.model == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() ActionContext context) {
    try {
      if (!(this.fillFieldsIfNecessary(context))) {
        return;
      }
      {
        SearchQuery query = new SearchQuery(this.model, context.getScope());
        IResultProvider provider = TreeBuilder.forFinder(new ModelUsagesFinder());
        context.getOperationContext().getComponent(UsagesViewTool.class).findUsages(provider, query, true, true, false);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "FindModelUsages", t);
    }
  }

}
