package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.ide.projectPane.favorites.FavoritesUtil;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.projectPane.favorites.FavoritesProjectPane;
import com.intellij.openapi.ui.Messages;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.ide.projectPane.favorites.MPSFavoritesManager;
import java.util.List;

public class RenameFavoritesList_Action extends GeneratedAction {
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${mps_home}/workbench/source/jetbrains/mps/ide/projectPane/other/menu-replace.png", "jetbrains.mps.ide"), true);
  protected static Log log = LogFactory.getLog(RenameFavoritesList_Action.class);

  private Project project;

  public RenameFavoritesList_Action() {
    super("Rename Favorites List", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    return FavoritesUtil.isActiveFavorites(RenameFavoritesList_Action.this.project);
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "RenameFavoritesList", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.project = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      FavoritesProjectPane pane = FavoritesUtil.getCurrentPane(RenameFavoritesList_Action.this.project);
      String oldName = pane.getSubId();
      String newName = Messages.showInputDialog("Input favorites list new name", "New Name For Favorites List", Messages.getQuestionIcon(), oldName, null);
      if (newName == null || StringUtils.isEmpty(newName)) {
        return;
      }
      MPSFavoritesManager favoritesManager = RenameFavoritesList_Action.this.project.getComponent(MPSFavoritesManager.class);
      if (favoritesManager == null) {
        return;
      }
      List<Object> objects = favoritesManager.getRoots(oldName);
      favoritesManager.addNewFavoritesList(newName);
      favoritesManager.addRoots(newName, objects);
      favoritesManager.removeFavoritesList(oldName);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "RenameFavoritesList", t);
      }
    }
  }
}
