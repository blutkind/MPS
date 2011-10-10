package jetbrains.mps.ide.modelchecker.actions;

/*Generated by MPS */

import javax.swing.JPanel;
import jetbrains.mps.ide.findusages.INavigator;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.findusages.view.UsagesView;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.ViewOptions;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.intellij.openapi.ui.Messages;
import java.util.ArrayList;
import java.util.Set;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.project.IModule;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.holders.ModulesHolder;
import jetbrains.mps.project.ProjectScope;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.ide.findusages.model.holders.ModelsHolder;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.INodeRepresentator;
import jetbrains.mps.ide.findusages.view.treeholder.tree.TextOptions;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.ide.projectPane.Icons;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.StringEscapeUtils;
import jetbrains.mps.ide.findusages.model.CategoryKind;
import java.util.Arrays;
import org.jdom.Element;
import jetbrains.mps.ide.findusages.CantSaveSomethingException;
import jetbrains.mps.ide.findusages.CantLoadSomethingException;

public abstract class ModelCheckerViewer extends JPanel implements INavigator {
  private Project myProject;
  private IOperationContext myOperationContext;
  private UsagesView myUsagesView;
  private String myTabTitle;
  private Icon myTabIcon;
  private Runnable myGenerateRunnable;
  private JButton myGenerateButton;
  private JButton myFixButton;
  private String myCheckProgressTitle = "Checking...";

  public ModelCheckerViewer(Project project, IOperationContext operationContext) {
    myProject = project;
    myOperationContext = operationContext;

    setLayout(new BorderLayout());
    ViewOptions viewOptions = new ViewOptions(true, false, false, false, false);
    viewOptions.myCategories = new boolean[]{true, false};

    myUsagesView = new UsagesView(project, viewOptions) {
      public void close() {
        ModelCheckerViewer.this.close();
      }

      protected String getRerunSearchTooltip() {
        return "Recheck";
      }

      protected String getSearchProgressTitle() {
        return myCheckProgressTitle;
      }
    };
    myUsagesView.setCustomNodeRepresentator(new ModelCheckerViewer.MyNodeRepresentator());
    add(myUsagesView.getComponent(), BorderLayout.CENTER);

    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

    myGenerateButton = new JButton("Generate");
    myGenerateButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        assert myGenerateRunnable != null;
        myGenerateRunnable.run();
      }
    });
    myGenerateButton.setVisible(false);

    myFixButton = new JButton("Perform Quick Fixes");
    myFixButton.setToolTipText("Remove undeclared children and undeclared references, resolve links in included nodes");
    myFixButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        performQuickFixes();
      }
    });
    buttonPanel.add(myGenerateButton);
    buttonPanel.add(myFixButton);
    add(buttonPanel, BorderLayout.SOUTH);
  }

  protected abstract void close();

  public void performQuickFixes() {
    // Ask if need to fix 

    // Perform quick fixes 
    final Wrappers._int fixedTotal = new Wrappers._int(0);
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        // Select all fixable issues 
        List<ModelCheckerIssue> issuesToFix = ModelCheckerViewer.this.getIssuesToFix();
        if (ListSequence.fromList(issuesToFix).isEmpty()) {
          Messages.showInfoMessage("There are no quick fixes for current problems", "No Quick Fixes");
          return;
        }
        int dialogAnswer = Messages.showYesNoDialog(myOperationContext.getIdeaProject(), "You are going to remove undeclared properties, children from nodes and resolve references. " + "You may not be able to undo it. Are you sure?", "Warning", null);
        if (dialogAnswer != 0) {
          return;
        }
        while (true) {
          int fixedBefore = fixedTotal.value;
          for (ModelCheckerIssue issue : ListSequence.fromListWithValues(new ArrayList<ModelCheckerIssue>(), issuesToFix)) {
            if (issue.fix()) {
              fixedTotal.value++;
              ListSequence.fromList(issuesToFix).removeElement(issue);
            }
          }
          if (fixedBefore == fixedTotal.value) {
            break;
          }
        }
      }
    });

    // Perform recheck if needed 
    if (fixedTotal.value != 0) {
      int dialogAnswer1 = Messages.showYesNoDialog(myOperationContext.getIdeaProject(), "Model checker fixed " + fixedTotal.value + " issues. Do you wish to recheck?", "Recheck", null);
      if (dialogAnswer1 != 0) {
        return;
      }

      runCheck();
    }
  }

  private List<ModelCheckerIssue> getIssuesToFix() {
    final Set<SNodePointer> includedResultNodes = SetSequence.fromSetWithValues(new HashSet<SNodePointer>(), myUsagesView.getIncludedResultNodes());
    return ListSequence.fromList(((List<SearchResult<ModelCheckerIssue>>) getSearchResults().getSearchResults())).select(new ISelector<SearchResult<ModelCheckerIssue>, ModelCheckerIssue>() {
      public ModelCheckerIssue select(SearchResult<ModelCheckerIssue> sr) {
        return sr.getObject();
      }
    }).where(new IWhereFilter<ModelCheckerIssue>() {
      public boolean accept(ModelCheckerIssue sr) {
        return sr instanceof ModelCheckerIssue.NodeIssue && SetSequence.fromSet(includedResultNodes).contains(new SNodePointer(((ModelCheckerIssue.NodeIssue) sr).getNode())) && sr.isFixable();
      }
    }).toListSequence();
  }

  private void runCheck() {
    ProgressManager.getInstance().run(new Task.Modal(myProject, myCheckProgressTitle, true) {
      public void run(@NotNull ProgressIndicator indicator) {
        myUsagesView.run(indicator);
      }
    });
  }

  public void prepareAndCheckModules(List<IModule> modules, String taskTargetTitle, Icon taskIcon) {
    IResultProvider resultProvider = FindUtils.makeProvider(new ModelCheckerIssueFinder());
    SearchQuery searchQuery = new SearchQuery(new ModulesHolder(modules, myOperationContext), myProject.getComponent(ProjectScope.class));
    myUsagesView.setRunOptions(resultProvider, searchQuery, new UsagesView.ButtonConfiguration(true, true, true));

    myCheckProgressTitle = "Checking " + taskTargetTitle;
    setTabProperties(taskTargetTitle, taskIcon);

    runCheck();
  }

  public void prepareAndCheckModels(List<SModelDescriptor> modelDescriptors, String taskTargetTitle, Icon taskIcon, ModelCheckerIssueFinder issueFinder) {
    IResultProvider resultProvider = FindUtils.makeProvider(issueFinder);
    SearchQuery searchQuery = new SearchQuery(new ModelsHolder(modelDescriptors, myOperationContext), myProject.getComponent(ProjectScope.class));
    myUsagesView.setRunOptions(resultProvider, searchQuery, new UsagesView.ButtonConfiguration(true, true, true));

    myCheckProgressTitle = "Checking " + taskTargetTitle;
    setTabProperties(taskTargetTitle, taskIcon);

    runCheck();
  }

  public void prepareAndCheckModels(List<SModelDescriptor> modelDescriptors, String taskTargetTitle, Icon taskIcon) {
    prepareAndCheckModels(modelDescriptors, taskTargetTitle, taskIcon, new ModelCheckerIssueFinder());
  }

  public void setTabProperties(String title, Icon icon) {
    myTabTitle = title;
    myTabIcon = icon;
  }

  public void saveGenerationRunnable(Runnable runnable) {
    myGenerateRunnable = runnable;
    myGenerateButton.setVisible(runnable != null);
  }

  public void dispose() {
    myUsagesView.dispose();
  }

  public String getTabTitle() {
    return myTabTitle;
  }

  public Icon getTabIcon() {
    return myTabIcon;
  }

  public SearchResults<ModelCheckerIssue> getSearchResults() {
    return myUsagesView.getSearchResults();
  }

  public void goToPrevious() {
    myUsagesView.goToPrevious();
  }

  public void goToNext() {
    myUsagesView.goToNext();
  }

  public static class MyNodeRepresentator implements INodeRepresentator<ModelCheckerIssue> {
    public MyNodeRepresentator() {
    }

    public String getResultsText(TextOptions options) {
      int size = options.mySubresultsCount;
      return "<strong>" + NameUtil.formatNumericalString(size, "issue") + " found</strong>";
    }

    public Icon getResultsIcon() {
      return Icons.CLOSED_FOLDER;
    }

    public String getCategoryText(TextOptions options, String category, boolean isResultsSection) {
      String counter = "";
      if (options.myCounters && isResultsSection) {
        counter = " (" + NameUtil.formatNumericalString(options.mySubresultsCount, "issue") + ")";
      }
      return "<strong>" + category + counter + "</strong>";
    }

    public Icon getCategoryIcon(String category) {
      if (StringUtils.isNotEmpty(category)) {
        if (category.startsWith(ModelChecker.SEVERITY_ERROR)) {
          return jetbrains.mps.ide.messages.Icons.ERROR_ICON;
        } else if (category.startsWith(ModelChecker.SEVERITY_WARNING)) {
          return jetbrains.mps.ide.messages.Icons.WARNING_ICON;
        } else if (category.startsWith(ModelChecker.SEVERITY_INFO)) {
          return jetbrains.mps.ide.messages.Icons.INFORMATION_ICON;
        }
      }
      return Icons.CLOSED_FOLDER;
    }

    @NotNull
    public String getPresentation(ModelCheckerIssue issue) {
      return StringEscapeUtils.escapeHtml(issue.getMessage());
    }

    public List<CategoryKind> getCategoryKinds() {
      return Arrays.asList(ModelCheckerIssue.CATEGORY_KIND_SEVERITY, ModelCheckerIssue.CATEGORY_KIND_ISSUE_TYPE);
    }

    public void write(Element element, jetbrains.mps.project.Project project) throws CantSaveSomethingException {
    }

    public void read(Element element, jetbrains.mps.project.Project project) throws CantLoadSomethingException {
    }
  }
}
