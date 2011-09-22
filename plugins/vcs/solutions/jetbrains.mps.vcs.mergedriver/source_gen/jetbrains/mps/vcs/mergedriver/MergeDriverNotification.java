package jetbrains.mps.vcs.mergedriver;

/*Generated by MPS */

import com.intellij.openapi.project.Project;
import com.intellij.notification.Notification;
import com.intellij.ide.util.PropertiesComponent;
import jetbrains.mps.InternalFlag;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.List;
import com.intellij.openapi.vcs.VcsDirectoryMapping;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.ide.ThreadUtils;
import com.intellij.openapi.vcs.impl.projectlevelman.AllVcses;
import com.intellij.notification.NotificationType;
import com.intellij.notification.NotificationListener;
import org.jetbrains.annotations.NotNull;
import javax.swing.event.HyperlinkEvent;
import com.intellij.ide.BrowserUtil;
import com.intellij.notification.Notifications;
import com.intellij.notification.NotificationDisplayType;

public class MergeDriverNotification {
  private static final String SUPPRESSED_PROPERTY_NAME = "merge.driver.suppressed.notification";

  private Project myProject;
  private AbstractInstaller.State myCompositeState;
  private Notification myLastNotification;

  private MergeDriverNotification(Project project) {
    myProject = project;
  }

  private boolean isNotificationSuppressed() {
    return "true".equals(PropertiesComponent.getInstance(myProject).getValue(SUPPRESSED_PROPERTY_NAME));
  }

  public void setNotificationsSuppressed(boolean value) {
    PropertiesComponent.getInstance(myProject).setValue(SUPPRESSED_PROPERTY_NAME, Boolean.toString(value));
  }

  private void calculateCompositeState() {
    myCompositeState = MergeDriverInstaller.getCompositeState(myProject, false);
  }

  public void showNotificationIfNeeded() {
    if (isNotificationSuppressed()) {
      return;
    }
    if (myLastNotification != null && !(myLastNotification.isExpired())) {
      return;
    }
    calculateCompositeState();
    if (myCompositeState == AbstractInstaller.State.INSTALLED) {
      return;
    }
    if (InternalFlag.isInternalMode() && myCompositeState == AbstractInstaller.State.OUTDATED) {
      return;
    }
    showNotifications();
  }

  private void showNotifications() {
    final Set<String> vcsNames = SetSequence.fromSetWithValues(new HashSet<String>(), ListSequence.fromList(((List<VcsDirectoryMapping>) ProjectLevelVcsManager.getInstance(myProject).getDirectoryMappings())).select(new ISelector<VcsDirectoryMapping, String>() {
      public String select(VcsDirectoryMapping dm) {
        return dm.getVcs();
      }
    }).where(new IWhereFilter<String>() {
      public boolean accept(String vn) {
        return StringUtils.isNotEmpty(vn);
      }
    }));
    ThreadUtils.runInUIThreadNoWait(new Runnable() {
      public void run() {
        String whichVcses = StringUtils.join(SetSequence.fromSet(vcsNames).select(new ISelector<String, String>() {
          public String select(String vn) {
            return AllVcses.getInstance(myProject).getByName(vn).getDisplayName();
          }
        }).toListSequence(), "and");
        String mainMessage = (myCompositeState == AbstractInstaller.State.OUTDATED ?
          "You have some of the global settings outdated, you need to <a href=\"install\">update them</a>" :
          "To make it work better with MPS, it is recommended to <a href=\"install\">update some of their global settings</a>"
        );
        String message = String.format("<p>You are using %s. %s.</p><p><a href=\"http://confluence.jetbrains.com/display/MPSD2/Version+Control\">More info</a>.</p><p><a href=\"dismiss\">Don't offer again</a>.</p>", whichVcses, mainMessage);
        myLastNotification = new Notification("MergeDriver", "VCS Addons", message, NotificationType.WARNING, new NotificationListener() {
          public void hyperlinkUpdate(@NotNull Notification notification, @NotNull HyperlinkEvent e) {
            if (e.getEventType() != HyperlinkEvent.EventType.ACTIVATED) {
              return;
            }
            if (e.getURL() != null) {
              BrowserUtil.launchBrowser(e.getURL().toExternalForm());
              return;
            } else
            if ("install".equals(e.getDescription())) {
              MergeDriverInstaller.installWhereNeeded(myProject);
            } else if ("dismiss".equals(e.getDescription())) {
              setNotificationsSuppressed(true);
            } else {
              assert false;
            }
            notification.expire();
          }
        });
        Notifications.Bus.notify(myLastNotification, NotificationDisplayType.STICKY_BALLOON, myProject);
      }
    });
  }

  public static MergeDriverNotification getInstance(Project project) {
    return new MergeDriverNotification(project);
  }
}
