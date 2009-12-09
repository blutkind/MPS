package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import jetbrains.mps.project.MPSProject;
import java.util.List;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.execution.impl.ConsoleViewImpl;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JComponent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import com.intellij.openapi.actionSystem.AnAction;
import jetbrains.mps.ide.findusages.view.icons.Icons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.ActionPlaces;
import javax.swing.JScrollPane;
import com.intellij.openapi.project.Project;
import javax.swing.JTable;
import javax.swing.Icon;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.util.Macros;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.LinkedHashMap;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestCase_Behavior;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestMethod_Behavior;
import javax.swing.SwingUtilities;
import com.intellij.execution.process.ProcessHandler;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import com.intellij.openapi.actionSystem.DataProvider;
import java.awt.LayoutManager;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NonNls;
import com.intellij.execution.Location;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.plugins.pluginparts.runconfigs.MPSLocation;

public class UnitTestViewComponent extends JPanel {
  private static final int DIVIDER_LOCATION = 200;

  public TestRunListener testController;
  private TestRunState testState;
  private TestOutputComponent outputComponent;
  private TestTree treeComponent;
  private JSplitPane splitPaneComponent;
  private ProgressLine progressLineComponent;
  private TestToolbarPanel actionToolComponent;
  private MPSProject project;
  private FailedTestOccurenceNavigator testNavigator;
  private List<_FunctionTypes._void_P0_E0> listeners = ListSequence.fromList(new ArrayList<_FunctionTypes._void_P0_E0>());

  public UnitTestViewComponent(MPSProject project, ConsoleViewImpl console) {
    this.project = project;
    this.initComponent(project, console);
  }

  private void initComponent(final MPSProject project, ConsoleViewImpl console) {
    // Create test results pane 
    JPanel rightPanel = new JPanel(new GridLayout(1, 1));
    JTabbedPane resultTabs = new JTabbedPane();
    rightPanel.add(resultTabs);

    TestStatisticsModel statisticsModel = new TestStatisticsModel();
    this.testState = new TestRunState(statisticsModel);

    this.treeComponent = new TestTree(this.testState, project);

    resultTabs.addTab("Output", this.getIcon("testOutput.png"), this.createOutputComponent(project, console));
    resultTabs.addTab("Statistics", this.getIcon("testStatistics.png"), this.createStatisticsComponent(statisticsModel));

    this.testController = new TestRunListener(this.testState);

    this.splitPaneComponent = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    JComponent leftPanel = this.createTreeComponent();
    this.splitPaneComponent.setDividerLocation(DIVIDER_LOCATION);
    this.splitPaneComponent.setLeftComponent(leftPanel);
    this.splitPaneComponent.setRightComponent(rightPanel);
    this.setLayout(new BorderLayout());
    this.add(this.splitPaneComponent, BorderLayout.CENTER);
    JComponent actions = this.createActionsToolbar();
    actions.setMaximumSize(new Dimension(rightPanel.getWidth(), actions.getMaximumSize().height));
    this.add(actions, BorderLayout.LINE_START);
    this.actionToolComponent = new TestToolbarPanel(this.treeComponent, this.testNavigator);
    this.progressLineComponent = new ProgressLine(this.testState);
    this.progressLineComponent.setMinimumSize(new Dimension(0, this.progressLineComponent.getMinimumSize().height));
    this.actionToolComponent.add(this.progressLineComponent, BorderLayout.CENTER);
    this.add(this.actionToolComponent, BorderLayout.NORTH);
    this.treeComponent.addTreeSelectionListener(new TestTreeSelectionListener(this.treeComponent, statisticsModel, this.outputComponent));

    this.testState.addView(this.treeComponent);
    this.testState.addView(this.progressLineComponent);
    this.testState.addView(this.outputComponent);
  }

  public JComponent createActionsToolbar() {
    final TestMethodOccurenceNavigator navigator = new TestMethodOccurenceNavigator(this.treeComponent);
    AnAction prevAction = new AnAction("Previous Test", "", Icons.PREVIOUS_ICON) {
      public void actionPerformed(AnActionEvent p0) {
        if (navigator.hasPreviousOccurence()) {
          navigator.goPreviousOccurence();
        }
      }
    };
    AnAction nextAction = new AnAction("Next Test", "", Icons.NEXT_ICON) {
      public void actionPerformed(AnActionEvent p0) {
        if (navigator.hasNextOccurence()) {
          navigator.goNextOccurence();
        }
      }
    };
    DefaultActionGroup group = new DefaultActionGroup();
    group.addSeparator();
    group.add(prevAction);
    group.add(nextAction);
    ActionManager manager = ActionManager.getInstance();
    ActionToolbar toolbar = manager.createActionToolbar(ActionPlaces.UNKNOWN, group, false);
    return toolbar.getComponent();
  }

  private JComponent createTreeComponent() {
    UnitTestViewComponent.MyTreePanel treePanel = new UnitTestViewComponent.MyTreePanel(new BorderLayout());
    treePanel.add(new JScrollPane(this.treeComponent), BorderLayout.CENTER);
    this.testNavigator = new FailedTestOccurenceNavigator(this.treeComponent);
    return treePanel;
  }

  private JComponent createOutputComponent(MPSProject project, ConsoleViewImpl console) {
    this.outputComponent = new TestOutputComponent(project.getComponent(Project.class), this, console, this.testState);
    return this.outputComponent.getComponent();
  }

  private JComponent createStatisticsComponent(TestStatisticsModel testStatisticsModel) {
    JTable statisticsTable = new JTable(testStatisticsModel);
    statisticsTable.setDefaultRenderer(TestStatisticsRow.class, new StatisticsRowRenderer());
    JPanel tablePanel = new JPanel(new GridLayout(1, 1));
    tablePanel.add(new JScrollPane(statisticsTable));
    return tablePanel;
  }

  public ConsoleViewImpl getConsole() {
    return this.outputComponent.getConsole();
  }

  public void appendWithParameters(String className, String methodName, String text, boolean isError, boolean isSystem) {
    if (className != null && methodName != null) {
      this.outputComponent.appendWithParameters(className, methodName, text, isError, isSystem);
    } else {
      this.outputComponent.append(text, isError, isSystem);
    }
  }

  public String getCurrentClassName() {
    return this.outputComponent.getCurrentClassName();
  }

  public String getCurrentMethodName() {
    return this.outputComponent.getCurrentMethodName();
  }

  public Icon getIcon(String iconName) {
    Language language = getLanguage();
    String pathToIcon = Macros.languageDescriptor().expandPath(Macros.LANGUAGE_DESCRIPTOR + "\\icons\\" + iconName, language.getDescriptorFile());
    return IconManager.loadIcon(pathToIcon, true);
  }

  public void setTestCaseAndMethod(IOperationContext operationContext, List<SNode> testCases, List<SNode> testMethods) {
    Map<SNode, List<SNode>> tests = MapSequence.fromMap(new LinkedHashMap<SNode, List<SNode>>(16, (float)0.75, false));
    this.fromTestCases(testCases, tests);
    this.fromTestMethods(testMethods, tests);
    this.setTestsMap(operationContext, tests);
  }

  private Map<SNode, List<SNode>> fromTestCases(List<SNode> testCases, Map<SNode, List<SNode>> tests) {
    for (SNode testCase : ListSequence.fromList(testCases)) {
      List<SNode> testMethods = new ArrayList<SNode>();
      MapSequence.fromMap(tests).put(testCase, testMethods);
      for (SNode testMethod : ListSequence.fromList(ITestCase_Behavior.call_getTestSet_1216130724401(testCase))) {
        ListSequence.fromList(testMethods).addElement(testMethod);
      }
    }
    return tests;
  }

  private Map<SNode, List<SNode>> fromTestMethods(List<SNode> testMethods, Map<SNode, List<SNode>> tests) {
    for (SNode testMethod : ListSequence.fromList(testMethods)) {
      SNode testCase = ITestMethod_Behavior.call_getTestCase_1216134500045(testMethod);
      List<SNode> curTestMethods = MapSequence.fromMap(tests).get(testCase);
      if (curTestMethods == null) {
        curTestMethods = new ArrayList<SNode>();
        MapSequence.fromMap(tests).put(testCase, curTestMethods);
      }
      if (!(ListSequence.fromList(curTestMethods).contains(testMethod))) {
        ListSequence.fromList(curTestMethods).addElement(testMethod);
      }
    }
    return tests;
  }

  private void setTestsMap(IOperationContext operationContext, Map<SNode, List<SNode>> tests) {
    this.testState.setTests(operationContext, tests);
    this.treeComponent.setTests(operationContext, tests);
    this.treeComponent.expandAll();
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        UnitTestViewComponent.this.outputComponent.clear();
      }
    });
  }

  public void start(ProcessHandler processHandler) {
    this.progressLineComponent.start(processHandler);
  }

  public void dispose() {
    this.outputComponent.dispose();
    this.invokeCloseListeners();
  }

  public void addCloseListener(_FunctionTypes._void_P0_E0 listener) {
    ListSequence.fromList(this.listeners).addElement(listener);
  }

  public void invokeCloseListeners() {
    for (_FunctionTypes._void_P0_E0 listener : ListSequence.fromList(this.listeners)) {
      listener.invoke();
    }
  }

  public static Language getLanguage() {
    final Wrappers._T<Language> lang = new Wrappers._T<Language>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        lang.value = Language.getLanguageFor(SNodeOperations.getModel(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.unitTest.structure.ITestCase")).getModelDescriptor());
      }
    });
    return lang.value;
  }

  public class MyTreePanel extends JPanel implements DataProvider {
    public MyTreePanel(LayoutManager manager) {
      super(manager);
    }

    @Nullable
    public Object getData(@NonNls String dataId) {
      if (dataId.equals(Location.LOCATION)) {
        Project project = UnitTestViewComponent.this.project.getComponent(Project.class);
        MPSTreeNode currentNode = UnitTestViewComponent.this.treeComponent.getCurrentNode();
        return new MPSLocation(project, currentNode.getUserObject());
      }
      return null;
    }
  }
}
