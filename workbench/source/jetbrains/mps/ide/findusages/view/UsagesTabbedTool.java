package jetbrains.mps.ide.findusages.view;

import jetbrains.mps.workbench.tools.BaseProjectTool;
import jetbrains.mps.ide.findusages.INavigateableTool;
import jetbrains.mps.ide.findusages.INavigator;
import jetbrains.mps.ide.findusages.UsagesViewTracker;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindowAnchor;
import com.intellij.ui.content.ContentManagerAdapter;
import com.intellij.ui.content.ContentManagerEvent;
import com.intellij.ui.content.ContentManager;
import com.intellij.ui.content.Content;

import javax.swing.Icon;

import org.jetbrains.annotations.Nullable;

public abstract class UsagesTabbedTool extends BaseProjectTool implements INavigateableTool {
  private static Logger LOG = Logger.getLogger(UsagesViewTool.class);
  private ContentManagerAdapter myContentListener;

  public UsagesTabbedTool(Project project, String id, int number, Icon icon, ToolWindowAnchor anchor, boolean canCloseContent) {
    super(project, id, number, icon, anchor, canCloseContent);
  }

  @Nullable
  public INavigator getCurrentNavigateableView() {
    LOG.checkEDT();

    int index = getCurrentTabIndex();
    if (index == -1) return null;

    return getNavigator(index);
  }

  public void doRegister() {
    UsagesViewTracker.register(this);

    myContentListener = new ContentManagerAdapter() {
      public void contentRemoved(ContentManagerEvent event) {
        UsagesView usagesView = onRemove(event.getIndex());
        if (usagesView!=null){
          usagesView.dispose();
        }
      }
    };

    getContentManager().addContentManagerListener(myContentListener);
  }

  public void doUnregister() {
    //this is done automatically on content manager dispose, otherwise a dependency UVT->CM must be added
    //getContentManager().removeContentManagerListener(myContentListener);

    UsagesViewTracker.unregister(this);
  }

  protected void closeTab(int index) {
    ContentManager contentManager = getContentManager();
    Content content = contentManager.getContent(index);
    assert content != null;
    contentManager.removeContent(content, true);
  }

  protected void closeLastUnpinnedTab(int index) {
    if (index != -1) {
      ContentManager contentManager = getContentManager();
      Content content = contentManager.getContent(index);
      assert content != null;
      if (!content.isPinned()) {
        contentManager.removeContent(content, true);
      }
    }
  }

  protected abstract INavigator getNavigator(int index);
  protected abstract UsagesView onRemove(int index);
}
