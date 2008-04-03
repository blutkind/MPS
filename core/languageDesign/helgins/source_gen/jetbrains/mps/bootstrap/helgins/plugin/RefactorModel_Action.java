package jetbrains.mps.bootstrap.helgins.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.CurrentProjectMPSAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.helgins.uiActions.RefactorModelUtil;

public class RefactorModel_Action extends CurrentProjectMPSAction {
  public static final Logger LOG = Logger.getLogger(RefactorModel_Action.class);

  private SModelDescriptor model;
  private boolean isAlwaysVisible = false;

  public  RefactorModel_Action(MPSProject project) {
    super(project, "Refactor Helgins Model");
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(ActionContext context) {
    LanguageAspect languageAspect = Language.getModelAspect(this.model);
    return languageAspect == LanguageAspect.HELGINS_TYPESYSTEM;
  }

  public void doUpdate(@NotNull() ActionContext context) {
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
      RefactorModel_Action.LOG.error("User's action doUpdate method failed. Action:" + "RefactorModel", t);
      this.setEnabled(false);
      this.setVisible(this.isAlwaysVisible);
    }
  }

  private boolean fillFieldsIfNecessary(ActionContext context) {
    try {
      this.model = context.getModel();
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
      RefactorModelUtil.refactorModel(this.model);
    } catch (Throwable t) {
      RefactorModel_Action.LOG.error("User's action execute method failed. Action:" + "RefactorModel", t);
    }
  }

}
