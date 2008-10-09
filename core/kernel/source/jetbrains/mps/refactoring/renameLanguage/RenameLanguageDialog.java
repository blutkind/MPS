package jetbrains.mps.refactoring.renameLanguage;

import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings.DialogDimensions;
import jetbrains.mps.ide.genconf.GeneratorConfigUtil;
import jetbrains.mps.ide.genconf.GenParameters;
import jetbrains.mps.smodel.*;
import jetbrains.mps.project.*;
import jetbrains.mps.refactoring.renameModel.ModelRenamer;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.projectLanguage.structure.LanguageGeneratorConfiguration;
import jetbrains.mps.projectLanguage.structure.ModelRoot;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.transformation.TemplateLanguageGenerationUtil;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vcs.MPSVCSManager;
import jetbrains.mps.generator.GeneratorManager;
import jetbrains.mps.generator.IGenerationType;
import jetbrains.mps.generator.JavaNameUtil;
import jetbrains.mps.generator.fileGenerator.FileGenerationUtil;

import javax.swing.*;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.util.*;
import java.io.File;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Computable;

public class RenameLanguageDialog extends BaseDialog {
  private JPanel myMainPanel;
  private JTextField myLanguageNameField;
  private JCheckBox myRegenerateLanguage;

  private Language myLanguage;
  private Project myProject;

  public RenameLanguageDialog(Frame frame, Project project, Language language) throws HeadlessException {
    super(frame);

    setTitle("Rename Language");

    myLanguage = language;
    myProject = project;

    myMainPanel = new JPanel(new GridBagLayout());

    GridBagConstraints c;

    c = new GridBagConstraints();
    c.gridx = 0;
    c.gridy = 0;
    c.anchor = GridBagConstraints.FIRST_LINE_START;
    myMainPanel.add(new JLabel("Language name:"), c);


    c = new GridBagConstraints();
    c.gridx = 0;
    c.gridy = 1;
    c.anchor = GridBagConstraints.FIRST_LINE_START;
    myLanguageNameField = new JTextField(myLanguage.getModuleFqName(), 30);
    myMainPanel.add(myLanguageNameField, c);


    c = new GridBagConstraints();
    c.gridx = 0;
    c.gridy = 2;
    c.anchor = GridBagConstraints.FIRST_LINE_START;
    myRegenerateLanguage = new JCheckBox("Regenerate Language");
    myRegenerateLanguage.getModel().setSelected(!myLanguage.isBootstrap());
    myMainPanel.add(myRegenerateLanguage, c);


    c = new GridBagConstraints();
    c.gridx = 0;
    c.gridy = 3;
    c.weighty = 1.0;
    c.weightx = 1.0;
    myMainPanel.add(new JPanel(), c);
  }

  protected JComponent getMainComponent() {
    return myMainPanel;
  }

  public DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensions(300, 300, 250, 200);
  }

  @BaseDialog.Button(position = 0, name = "OK", defaultButton = true)
  public void buttonOk() {

    final List<File>[] oldModelRoots = new List[]{null};
    boolean renamed = ModelAccess.instance().runWriteActionInCommand(new Computable<Boolean>() {
      public Boolean compute() {
        final String fqName = myLanguageNameField.getText();

        if (MPSModuleRepository.getInstance().getModuleByUID(fqName) != null) {
          setErrorText("Duplicate language name");
          return false;
        }

        oldModelRoots[0] = getFilesToDelete();
        new LanguageRenamer(myLanguage, fqName).rename();
        return true;
      }
    });

    if (!renamed) {
      return;
    }

    if (myRegenerateLanguage.getModel().isSelected()) {
      final MPSProject mpsProject = myProject.getComponent(MPSProjectHolder.class).getMPSProject();
      GenParameters params = ModelAccess.instance().runReadAction(new Computable<GenParameters>() {
        public GenParameters compute() {
          MPSVCSManager.getInstance(myProject).deleteFilesAndRemoveFromVcs(oldModelRoots[0]);

          SModel model = AuxilaryRuntimeModel.getDescriptor().getSModel();

          LanguageGeneratorConfiguration languageConfig = LanguageGeneratorConfiguration.newInstance(model);
          languageConfig.setLanguageNamespace(myLanguage.getNamespace());
          languageConfig.setName("tmp");

          return GeneratorConfigUtil.calculate(mpsProject, languageConfig, true);
        }
      });


      myProject.getComponent(GeneratorManager.class)
        .generateModelsFromDifferentModules(
          new ModuleContext(myLanguage, mpsProject),
          params.getModels(),
          IGenerationType.FILES);
    }

    dispose();
  }

  private List<File> getFilesToDelete() {
    List<File> result = new ArrayList<File>();
    File sourceDir = myLanguage.getSourceDir();

    List<SModelDescriptor> inputModels = GeneratorConfigUtil.getLanguageModels(myLanguage);

    for (SModelDescriptor d : inputModels) {
      result.add(FileGenerationUtil.getDefaultOutputDir(d, sourceDir));
    }

    return result;
  }


  @BaseDialog.Button(position = 1, name = "Cancel")
  public void buttonCancel() {
    dispose();
  }
}
