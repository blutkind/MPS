package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.ide.embeddableEditor.EmbeddableEditor;
import jetbrains.mps.ide.findusages.view.optionseditor.components.ScopeEditor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.ModelOwner;
import jetbrains.mps.ide.findusages.view.optionseditor.options.ScopeOptions;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.util.List;
import jetbrains.mps.baseLanguage.collections.structure.Collections_Language;
import java.awt.Dimension;
import javax.swing.JComponent;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ide.embeddableEditor.GenerationResult;
import jetbrains.mps.quickQueryLanguage.plugin.QueryExecutor;
import jetbrains.mps.quickQueryLanguage.runtime.Query;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.holders.NodeHolder;
import jetbrains.mps.quickQueryLanguage.plugin.RunReplacement_Tool;

public class ReplaceDialog extends BaseDialog {

  private EmbeddableEditor myEditor;
  private ScopeEditor myScope;
  private IOperationContext myContext;
  private SNode myNode;
  private JPanel myPanel = new JPanel(new BorderLayout());

  public ReplaceDialog(final IOperationContext context, final Language language) {
    super(context.getMainFrame(), "Modify Instances by condition");
    this.myContext = context;
    ModelAccess.instance().runWriteAction(new Runnable() {

      public void run() {
        ReplaceDialog.this.myNode = SConceptOperations.createNewNode("jetbrains.mps.quickQueryLanguage.structure.ReplaceModelQuery", null);
        ReplaceDialog.this.myEditor = new EmbeddableEditor(context, new ModelOwner() {        }, ReplaceDialog.this.myNode);
        ReplaceDialog.this.myScope = new ScopeEditor(new ScopeOptions());
        ReplaceDialog.this.myPanel.add(ReplaceDialog.this.myScope.getComponent(), BorderLayout.SOUTH);
      }
    });
    this.myEditor.addLanguageStructureModel(language);
    final Wrappers._T<List<Language>> languageList = new Wrappers._T<List<Language>>();
    ModelAccess.instance().runReadAction(new Runnable() {

      public void run() {
        languageList.value = language.getAllExtendedLanguages();
      }
    });
    for(Language extendedLanguage : languageList.value) {
      this.myEditor.addLanguageStructureModel(extendedLanguage);
    }
    this.myEditor.addLanguageStructureModel(Collections_Language.get());
    this.myPanel.add(this.myEditor.getComponenet(), BorderLayout.CENTER);
    this.setSize(new Dimension(500, 500));
    this.setModal(false);
  }

  protected JComponent getMainComponent() {
    return this.myPanel;
  }

  public void setConceptDeclaration(final SNode declaration) {
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {

      public void run() {
        SLinkOperations.setTarget(ReplaceDialog.this.myNode, "conceptDeclaration", declaration, false);
      }
    });
  }

  @BaseDialog.Button(position = 0, name = "Modify", defaultButton = true)
  public void buttonReplace() {
    try {
      final GenerationResult result = this.myEditor.generate();
      String fqName = result.getModelDescriptor().getLongName() + "." + QueryExecutor.GENERATED_QUERY_NAME;
      ClassLoader loader = result.getLoader(QueryExecutor.class.getClassLoader());
      Query query = (Query)Class.forName(fqName, true, loader).newInstance();
      final IScope scope = this.myScope.getOptions().getScope(this.myContext, result.getModelDescriptor());
      this.execute(this.myContext.getMPSProject(), query, result.getSNode(), scope);
      this.myEditor.disposeEditor();
      this.dispose();
    } catch (Throwable t) {
      t.printStackTrace();
    }
  }

  public void execute(MPSProject project, Query query, final SNode queryNode, final IScope scope) {
    final Wrappers._T<SearchQuery> searchQuery = new Wrappers._T<SearchQuery>();
    ModelAccess.instance().runReadAction(new Runnable() {

      public void run() {
        if (SLinkOperations.getTarget(queryNode, "conceptDeclaration", false) != null) {
          searchQuery.value = new SearchQuery(new NodeHolder(SLinkOperations.getTarget(queryNode, "conceptDeclaration", false)), scope);
        } else
        {
          searchQuery.value = new SearchQuery(scope);
        }
      }
    });
    project.getPluginManager().getTool(RunReplacement_Tool.class).addTab(searchQuery.value, query);
  }

  @BaseDialog.Button(position = 1, name = "Cancel", defaultButton = false)
  public void buttonCancel() {
    this.myEditor.disposeEditor();
    this.dispose();
  }

}
