package jetbrains.mps.baseLanguage.unitTest.execution.plugin;

/*Generated by MPS */

import javax.swing.JPanel;
import com.intellij.openapi.Disposable;
import jetbrains.mps.baseLanguage.unitTest.execution.client.TestRunState;
import com.intellij.openapi.project.Project;
import java.util.List;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.IOperationContext;
import com.intellij.execution.ui.ConsoleView;
import javax.swing.JComponent;
import java.awt.Dimension;
import com.intellij.openapi.ui.Splitter;
import java.awt.BorderLayout;
import com.intellij.execution.impl.ConsoleViewImpl;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.ActionPlaces;
import javax.swing.JScrollPane;
import com.intellij.ui.ScrollPaneFactory;
import javax.swing.JTable;
import com.intellij.ui.table.JBTable;
import java.awt.GridLayout;
import com.intellij.ui.components.JBScrollPane;
import javax.swing.Icon;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.ide.icons.IconManager;
import com.intellij.execution.process.ProcessListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.intellij.ide.util.PropertiesComponent;
import org.apache.commons.lang.StringUtils;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
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
import jetbrains.mps.baseLanguage.unitTest.execution.client.ITestNodeWrapper;

public class UnitTestViewComponent extends JPanel implements Disposable {
  private static final String SPLITTER_SIZE_PROPERTY = UnitTestViewComponent.class.getName() + ".splitter";

  private final TestRunState myTestState;
  private final TestOutputComponent myOutputComponent;
  private final TestTree myTreeComponent;
  private final ProgressLine myProgressLineComponent;
  private final TestToolbarPanel myActionToolComponent;
  private final Project myProject;
  private final FailedTestOccurenceNavigator myTestNavigator;
  private final List<_FunctionTypes._void_P0_E0> myListeners = ListSequence.fromList(new ArrayList<_FunctionTypes._void_P0_E0>());

  public UnitTestViewComponent(Project project, @NotNull IOperationContext context, ConsoleView console, TestRunState testRunState, _FunctionTypes._void_P0_E0 closeListener) {
    this.myProject = project;
    this.myTestState = testRunState;
    StatisticsTableModel statisticsModel = new StatisticsTableModel(this.myTestState);

    this.myTreeComponent = new TestTree(this.myProject, this.myTestState, context, this);
    this.myTestNavigator = new FailedTestOccurenceNavigator(this.myTreeComponent);
    this.myActionToolComponent = new TestToolbarPanel(this.myProject, this.myTreeComponent, this.myTestNavigator);

    JComponent leftPanel = this.createTreeComponent(myActionToolComponent, myTreeComponent);

    this.myProgressLineComponent = new ProgressLine(this.myTestState);
    this.myProgressLineComponent.setMinimumSize(new Dimension(0, this.myProgressLineComponent.getMinimumSize().height));
    this.myOutputComponent = new TestOutputComponent(this.myProject, this, console, this.myTestState);
    this.myTreeComponent.addTreeSelectionListener(new TestTreeSelectionListener(this.myTreeComponent, statisticsModel, this.myOutputComponent));
    this.myTreeComponent.addMouseListener(new TestTreeRootMouseListener(this.myTreeComponent, statisticsModel, this.myOutputComponent));

    JPanel rightPanel = this.createOutputComponent(console, myProgressLineComponent, myOutputComponent.getComponent(), statisticsModel);

    Splitter splitter = new Splitter(false);
    initSplitterProportion(splitter, 0.2f, "tree");
    splitter.setFirstComponent(leftPanel);
    splitter.setSecondComponent(rightPanel);
    this.setLayout(new BorderLayout());

    this.add(splitter, BorderLayout.CENTER);

    this.myTestState.addView(this.myTreeComponent);
    this.myTestState.addView(this.myProgressLineComponent);
    this.myTestState.addView(this.myOutputComponent);
    this.addCloseListener(closeListener);
  }

  public UnitTestViewComponent(Project project, IOperationContext context, ConsoleViewImpl console, UnitTestExecutionController model) {
    this(project, context, console, model.getState(), model.getCloseListener());
  }

  public JComponent createActionsToolbar(ConsoleView console) {
    DefaultActionGroup group = new DefaultActionGroup(console.createConsoleActions());
    ActionManager manager = ActionManager.getInstance();
    ActionToolbar toolbar = manager.createActionToolbar(ActionPlaces.UNKNOWN, group, false);
    toolbar.setLayoutPolicy(ActionToolbar.WRAP_LAYOUT_POLICY);
    return toolbar.getComponent();
  }

  private JComponent createTreeComponent(JComponent toolbar, JComponent tree) {
    UnitTestViewComponent.MyTreePanel treePanel = new UnitTestViewComponent.MyTreePanel(new BorderLayout());
    JScrollPane scrollPane = ScrollPaneFactory.createScrollPane(tree);
    treePanel.add(scrollPane, BorderLayout.CENTER);
    treePanel.add(toolbar, BorderLayout.NORTH);
    return treePanel;
  }

  private JComponent createStatisticsComponent(StatisticsTableModel testStatisticsModel) {
    JTable statisticsTable = new JBTable(testStatisticsModel);
    statisticsTable.setDefaultRenderer(TestStatisticsRow.class, new StatisticsRowRenderer());
    JPanel tablePanel = new JPanel(new GridLayout(1, 1));
    tablePanel.add(new JBScrollPane(statisticsTable));
    return tablePanel;
  }

  public Icon getIcon(String iconName) {
    Language language = getLanguage();
    String pathToIcon = language.getDescriptorFile().getParent().getPath() + "\\icons\\" + iconName;
    return IconManager.loadIcon(pathToIcon, true);
  }

  public ProcessListener getProcessListener() {
    return this.myProgressLineComponent.getProcessListener();
  }

  public void dispose() {
    this.myOutputComponent.dispose();
    this.myTreeComponent.dispose();
    this.invokeCloseListeners();
  }

  public void addCloseListener(_FunctionTypes._void_P0_E0 listener) {
    ListSequence.fromList(this.myListeners).addElement(listener);
  }

  public void invokeCloseListeners() {
    for (_FunctionTypes._void_P0_E0 listener : ListSequence.fromList(this.myListeners)) {
      listener.invoke();
    }
  }

  private JPanel createOutputComponent(ConsoleView console, JComponent progressLine, JComponent testOutput, StatisticsTableModel statisticsModel) {
    JPanel rightPanel = new JPanel(new GridBagLayout());

    JComponent stackTraceActions = this.createActionsToolbar(console);
    stackTraceActions.setMaximumSize(new Dimension(rightPanel.getWidth(), stackTraceActions.getMaximumSize().height));

    Splitter outputStatisticSplitter = new Splitter(false);
    initSplitterProportion(outputStatisticSplitter, 0.5f, "statistic");
    outputStatisticSplitter.setFirstComponent(testOutput);
    JComponent statistics = this.createStatisticsComponent(statisticsModel);
    outputStatisticSplitter.setSecondComponent(statistics);


    GridBagConstraints c = new GridBagConstraints();
    rightPanel.setBorder(null);
    c.fill = GridBagConstraints.VERTICAL;
    c.anchor = GridBagConstraints.LINE_START;
    c.gridx = 0;
    c.gridy = 1;
    c.weighty = 1;
    c.weightx = 0;
    rightPanel.add(stackTraceActions, c);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = 0;
    c.weighty = 0;
    c.weightx = 1;
    rightPanel.add(progressLine, c);
    c.fill = GridBagConstraints.BOTH;
    c.gridx = 1;
    c.gridy = 1;
    c.weighty = 1;
    c.weightx = 1;
    rightPanel.add(outputStatisticSplitter, c);
    return rightPanel;
  }

  public void initSplitterProportion(final Splitter splitter, float defaultProportion, final String id) {
    final PropertiesComponent propertiesComponent = PropertiesComponent.getInstance();
    String value = propertiesComponent.getValue(UnitTestViewComponent.SPLITTER_SIZE_PROPERTY + "." + id);
    float proportion = defaultProportion;
    if (StringUtils.isNotEmpty(value)) {
      try {
        proportion = Float.parseFloat(value);
      } catch (NumberFormatException ignore) {
      }
    }

    splitter.addPropertyChangeListener(new PropertyChangeListener() {
      public void propertyChange(PropertyChangeEvent event) {
        if (event.getPropertyName().equals(Splitter.PROP_PROPORTION)) {
          propertiesComponent.setValue(UnitTestViewComponent.SPLITTER_SIZE_PROPERTY + "." + id, String.valueOf(splitter.getProportion()));
        }
      }
    });

    splitter.setProportion(proportion);
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
        MPSTreeNode currentNode = UnitTestViewComponent.this.myTreeComponent.getCurrentNode();
        if (currentNode == null) {
          return null;
        }
        return new MPSLocation(UnitTestViewComponent.this.myProject, ((ITestNodeWrapper) currentNode.getUserObject()).getNode());
      }
      return null;
    }
  }
}
