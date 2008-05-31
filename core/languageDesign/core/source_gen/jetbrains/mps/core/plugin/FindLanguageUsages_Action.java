package jetbrains.mps.core.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.findusages.findalgorithm.finders.specific.LanguageUsagesFinder;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.CurrentProjectMPSAction;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.Language;
import org.jetbrains.annotations.NotNull;

public class FindLanguageUsages_Action extends CurrentProjectMPSAction {
  public static final Logger LOG = Logger.getLogger(FindLanguageUsages_Action.class);

  private IModule module;
  private boolean isAlwaysVisible = false;

  public FindLanguageUsages_Action(MPSProject project) {
    super(project, "Find Usages");
  }

  @NotNull()
  public String getKeyStroke() {
    return "alt F7";
  }

  public boolean isApplicable(ActionContext context) {
    return this.module instanceof Language;
  }

  public void doUpdate(@NotNull()ActionContext context) {
    try {
      super.doUpdate(context);
      if (!(this.fillFieldsIfNecessary(context))) {
        this.setEnabled(false);
        this.setVisible(this.isAlwaysVisible);
        return;
      }
      {
        boolean enabled = this.isApplicable(context);
        this.setEnabled(enabled);
        this.setVisible(enabled || this.isAlwaysVisible);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "FindLanguageUsages", t);
      this.setEnabled(false);
      this.setVisible(this.isAlwaysVisible);
    }
  }

  private boolean fillFieldsIfNecessary(ActionContext context) {
    try {
      this.module = context.getOperationContext().getModule();
      if (this.module == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull()ActionContext context) {
    try {
      if (!(this.fillFieldsIfNecessary(context))) {
        return;
      }
      {
        SearchQuery query = new SearchQuery(this.module, context.getScope());
        IResultProvider provider = FindUtils.makeProvider(new LanguageUsagesFinder());
        context.getOperationContext().getComponent(UsagesViewTool.class).findUsages(provider, query, true, true, false);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "FindLanguageUsages", t);
    }
  }

}
