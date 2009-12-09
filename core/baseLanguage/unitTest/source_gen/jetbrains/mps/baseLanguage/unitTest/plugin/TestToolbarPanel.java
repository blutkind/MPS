package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import javax.swing.JPanel;
import java.awt.BorderLayout;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import javax.swing.SwingConstants;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.ide.DataManager;
import jetbrains.mps.MPSProjectHolder;
import com.intellij.openapi.actionSystem.ToggleAction;
import com.intellij.execution.testframework.TestsUIUtil;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.AnAction;
import jetbrains.mps.ide.findusages.view.icons.Icons;
import com.intellij.openapi.actionSystem.CustomShortcutSet;
import com.intellij.openapi.keymap.KeymapManager;
import com.intellij.openapi.actionSystem.IdeActions;
import jetbrains.mps.ide.ui.MPSTreeNode;

public class TestToolbarPanel extends JPanel {
  private TestTree tree;
  private FailedTestOccurenceNavigator navigator;
  private JUnitTestActionOptions_PreferencesComponent preferences = this.getPreferences();

  public TestToolbarPanel(TestTree tree, FailedTestOccurenceNavigator navigator) {
    super(new BorderLayout());
    this.tree = tree;
    this.navigator = navigator;
    this.setLayout(new BorderLayout());
    this.init();
  }

  private void init() {
    final DefaultActionGroup actionGroup = new DefaultActionGroup();
    actionGroup.addAction(this.createHidePassedAction());
    actionGroup.addAction(this.cteateTrackRunningAction());
    actionGroup.addAction(this.createCollapseAllAction());
    actionGroup.addAction(this.createExpandAllAction());
    actionGroup.addAction(this.createNextOccurrenceAction());
    actionGroup.addAction(this.createPreviousOccurrenceAction());
    actionGroup.addAction(this.createSelectFirstFailedAction());
    actionGroup.addAction(this.createRerunFailedTestAction());
    ActionToolbar toolbarActions = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, actionGroup, false);
    toolbarActions.setOrientation(SwingConstants.HORIZONTAL);
    this.add(toolbarActions.getComponent(), BorderLayout.WEST);
  }

  private JUnitTestActionOptions_PreferencesComponent getPreferences() {
    MPSProject p = MPSDataKeys.MPS_PROJECT.getData(DataManager.getInstance().getDataContext());
    return p.getComponent(MPSProjectHolder.class).getMPSProject().getPluginManager().getPrefsComponent(JUnitTestActionOptions_PreferencesComponent.class);
  }

  private ToggleAction createHidePassedAction() {
    return new ToggleAction("Hide Passed", "Hide passed tests", TestsUIUtil.loadIcon("hidePassed")) {
      {
        this.setSelected(null, TestToolbarPanel.this.preferences.getStateObject().isHidePassed);
      }

      public void setSelected(AnActionEvent p0, boolean p1) {
        TestToolbarPanel.this.preferences.getStateObject().isHidePassed = p1;
        TestToolbarPanel.this.tree.hidePassed(p1);
      }

      public boolean isSelected(AnActionEvent p0) {
        return TestToolbarPanel.this.preferences.getStateObject().isHidePassed;
      }
    };
  }

  private ToggleAction cteateTrackRunningAction() {
    return new ToggleAction("Track Running Test", "Select currently running test in tree", TestsUIUtil.loadIcon("trackTests")) {
      {
        this.setSelected(null, TestToolbarPanel.this.preferences.getStateObject().isTrackRunning);
      }

      public void setSelected(AnActionEvent p0, boolean p1) {
        TestToolbarPanel.this.preferences.getStateObject().isTrackRunning = p1;
      }

      public boolean isSelected(AnActionEvent p0) {
        return TestToolbarPanel.this.preferences.getStateObject().isTrackRunning;
      }
    };
  }

  private AnAction createCollapseAllAction() {
    return new AnAction("Collapse All", "Collapse all test suites", Icons.COLLAPSE_ICON) {
      {
        this.registerCustomShortcutSet(new CustomShortcutSet(KeymapManager.getInstance().getActiveKeymap().getShortcuts(IdeActions.ACTION_COLLAPSE_ALL)), TestToolbarPanel.this.tree);
      }

      public void actionPerformed(AnActionEvent p0) {
        MPSTreeNode root = TestToolbarPanel.this.tree.getRootNode();
        MPSTreeNode child = (MPSTreeNode)root.getFirstChild();
        while (child != null) {
          TestToolbarPanel.this.tree.collapseAll(child);
          child = (MPSTreeNode)child.getNextSibling();
        }
      }
    };
  }

  private AnAction createExpandAllAction() {
    return new AnAction("Expand All", "Expande all test suites", Icons.EXPAND_ICON) {
      {
        this.registerCustomShortcutSet(new CustomShortcutSet(KeymapManager.getInstance().getActiveKeymap().getShortcuts(IdeActions.ACTION_EXPAND_ALL)), TestToolbarPanel.this.tree);
      }

      public void actionPerformed(AnActionEvent p0) {
        TestToolbarPanel.this.tree.expandAll();
      }
    };
  }

  private AnAction createNextOccurrenceAction() {
    return new AnAction("Next Failed Test", "Navigate to the next occurrence", Icons.NEXT_ICON) {
      {
        this.registerCustomShortcutSet(new CustomShortcutSet(KeymapManager.getInstance().getActiveKeymap().getShortcuts(IdeActions.ACTION_NEXT_OCCURENCE)), TestToolbarPanel.this.tree);
      }

      public void actionPerformed(AnActionEvent p0) {
        if (TestToolbarPanel.this.navigator.hasNextOccurence()) {
          TestToolbarPanel.this.navigator.goNextOccurence();
        }
      }
    };
  }

  private AnAction createPreviousOccurrenceAction() {
    return new AnAction("Previous Failed Test", "Navigate to the previous occurrence", Icons.PREVIOUS_ICON) {
      {
        this.registerCustomShortcutSet(new CustomShortcutSet(KeymapManager.getInstance().getActiveKeymap().getShortcuts(IdeActions.ACTION_PREVIOUS_OCCURENCE)), TestToolbarPanel.this.tree);
      }

      public void actionPerformed(AnActionEvent p0) {
        if (TestToolbarPanel.this.navigator.hasPreviousOccurence()) {
          TestToolbarPanel.this.navigator.goPreviousOccurence();
        }
      }
    };
  }

  private ToggleAction createSelectFirstFailedAction() {
    return new ToggleAction("Select First Failed Test When Finished", "", TestsUIUtil.loadIcon("selectFirstDefect")) {
      {
        this.setSelected(null, TestToolbarPanel.this.preferences.getStateObject().isSelectFirstFailed);
      }

      public void setSelected(AnActionEvent p0, boolean p1) {
        TestToolbarPanel.this.preferences.getStateObject().isSelectFirstFailed = p1;
      }

      public boolean isSelected(AnActionEvent p0) {
        return TestToolbarPanel.this.preferences.getStateObject().isSelectFirstFailed;
      }
    };
  }

  private AnAction createRerunFailedTestAction() {
    return new AnAction("Rerun Failed Tests", "Rerun only tests that failed/crached after last run", TestsUIUtil.loadIcon("rerunFailedTests")) {
      public void actionPerformed(AnActionEvent p0) {
        if (TestToolbarPanel.this.tree.hasFailedTests()) {
          TestToolbarPanel.this.tree.buildFailedTestTree();
        }
      }
    };
  }
}
