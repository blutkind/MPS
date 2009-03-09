package jetbrains.mps.ide.newLanguageDialog;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import jetbrains.mps.ide.common.PathField;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.Language;
import java.util.List;
import org.jdesktop.beansbinding.AutoBinding;
import java.util.ArrayList;
import jetbrains.mps.uiLanguage.runtime.events.Events;
import java.awt.GridLayout;
import org.jdesktop.beansbinding.Property;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Bindings;
import java.io.File;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.DirectoryUtil;
import java.awt.Frame;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.vfs.MPSExtentions;
import jetbrains.mps.vfs.FileSystemFile;
import jetbrains.mps.project.structure.modules.LanguageDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.library.LanguageDesign_DevKit;
import jetbrains.mps.smodel.LanguageAspect;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.vcs.ApplicationLevelVcsManager;
import jetbrains.mps.vfs.VFileSystem;
import com.intellij.openapi.application.ModalityState;

public class NewLanguageDialogContentPane extends JPanel {

  public NewLanguageDialogContentPane myThis;
  private JLabel myComponent0;
  private JTextField myComponent1;
  private JLabel myComponent2;
  private PathField myComponent3;
  private String myLanguageNamespace;
  private String myLanguagePath;
  private MPSProject myProject;
  private boolean myCompileInMPS = true;
  private Language myResult;
  private NewLanguageDialog myDialog;
  public List<AutoBinding> myBindings = new ArrayList<AutoBinding>();
  private Events myEvents = new Events(null) {
    {
    }


    public void initialize() {
    }

  };

  public NewLanguageDialogContentPane() {
    this.myThis = this;
    NewLanguageDialogContentPane component = this;
    component.setLayout(new GridLayout(4, 1));
    component.add(this.createComponent0());
    component.add(this.createComponent1());
    component.add(this.createComponent2());
    component.add(this.createComponent3());
    this.myEvents.initialize();
    myThis.setLanguageNamespace("");
    myThis.setLanguagePath("");
  }

  public Events getEvents() {
    return this.myEvents;
  }

  public void addNotify() {
    super.addNotify();
    this.bind();
  }

  public void removeNotify() {
    this.unbind();
    super.removeNotify();
  }

  private void bind() {
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("languageNamespace");
      Object targetObject = this.myComponent1;
      Property targetProperty = BeanProperty.create("text");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      this.myBindings.add(binding);
    }
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("languagePath");
      Object targetObject = this.myComponent3;
      Property targetProperty = BeanProperty.create("path");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      this.myBindings.add(binding);
    }
  }

  private void unbind() {
    for(AutoBinding binding : this.myBindings) {
      if (binding.isBound()) {
        binding.unbind();
      }
    }
  }

  private JLabel createComponent0() {
    JLabel component = new JLabel();
    this.myComponent0 = component;
    component.setText("Language Namespace:");
    return component;
  }

  private JTextField createComponent1() {
    JTextField component = new JTextField();
    this.myComponent1 = component;
    return component;
  }

  private JLabel createComponent2() {
    JLabel component = new JLabel();
    this.myComponent2 = component;
    component.setText("Language Path:");
    return component;
  }

  private PathField createComponent3() {
    PathField component = new PathField();
    this.myComponent3 = component;
    return component;
  }

  public String getLanguageNamespace() {
    return this.myLanguageNamespace;
  }

  public String getLanguagePath() {
    return this.myLanguagePath;
  }

  public MPSProject getProject() {
    return this.myProject;
  }

  public boolean getCompileInMPS() {
    return this.myCompileInMPS;
  }

  public Language getResult() {
    return this.myResult;
  }

  public NewLanguageDialog getDialog() {
    return this.myDialog;
  }

  public void setLanguageNamespace(String newValue) {
    String oldValue = this.myLanguageNamespace;
    this.myLanguageNamespace = newValue;
    this.firePropertyChange("languageNamespace", oldValue, newValue);
    myThis.updateLanguagePath();
  }

  public void setLanguagePath(String newValue) {
    String oldValue = this.myLanguagePath;
    this.myLanguagePath = newValue;
    this.firePropertyChange("languagePath", oldValue, newValue);
  }

  public void setProject(MPSProject newValue) {
    MPSProject oldValue = this.myProject;
    this.myProject = newValue;
    this.firePropertyChange("project", oldValue, newValue);
    myThis.updateLanguagePath();
  }

  public void setCompileInMPS(boolean newValue) {
    boolean oldValue = this.myCompileInMPS;
    this.myCompileInMPS = newValue;
    this.firePropertyChange("compileInMPS", oldValue, newValue);
  }

  public void setResult(Language newValue) {
    Language oldValue = this.myResult;
    this.myResult = newValue;
    this.firePropertyChange("result", oldValue, newValue);
  }

  public void setDialog(NewLanguageDialog newValue) {
    NewLanguageDialog oldValue = this.myDialog;
    this.myDialog = newValue;
    this.firePropertyChange("dialog", oldValue, newValue);
  }

  /* package */void onOk() {
    File dir = new File(myThis.getLanguagePath());
    if (!(dir.isAbsolute())) {
      myThis.getDialog().setErrorText("Path should path");
      return;
    }
    if (myThis.getLanguageNamespace().length() == 0) {
      myThis.getDialog().setErrorText("Enter namespace");
      return;
    }
    if (MPSModuleRepository.getInstance().getModuleByUID(myThis.getLanguageNamespace()) != null) {
      myThis.getDialog().setErrorText("Language namespace already exists");
      return;
    }
    if (NameUtil.shortNameFromLongName(myThis.getLanguageNamespace()).length() == 0) {
      myThis.getDialog().setErrorText("Enter valid namespace");
      return;
    }
    if (!(dir.exists())) {
      if (!(DirectoryUtil.askToCreateNewDirectory((Frame)myThis.getDialog().getOwner(), dir))) {
        return;
      }
    }
    myThis.getDialog().dispose();
    ProgressManager.getInstance().run(new Task.Modal(myThis.getProject().getComponent(Project.class), "Creating", false) {

      public void run(@NotNull() ProgressIndicator indicator) {
        indicator.setIndeterminate(true);
        ModelAccess.instance().runWriteAction(new Runnable() {

          public void run() {
            myThis.createNewLanguage();
          }

        });
      }

    });
  }

  /* package */void onCancel() {
    myThis.getDialog().dispose();
  }

  /* package */void updateLanguagePath() {
    if (myThis.getProject() == null) {
      return;
    }
    String path = FileUtil.getCanonicalPath(myThis.getProject().getProjectFile().getParentFile());
    String prefix = path + File.separator + "languages" + File.separator;
    if (myThis.getLanguagePath().length() == 0 || myThis.getLanguagePath().startsWith(prefix)) {
      myThis.setLanguagePath(prefix + NameUtil.shortNameFromLongName(myThis.getLanguageNamespace()));
    }
  }

  /* package */void createNewLanguage() {
    String descriptorFileName = NameUtil.shortNameFromLongName(myThis.getLanguageNamespace());
    final File descriptorFile = new File(myThis.getLanguagePath(), descriptorFileName + MPSExtentions.DOT_LANGUAGE);
    File dir = descriptorFile.getParentFile();
    if (!(dir.exists())) {
      dir.mkdirs();
    }
    Language language = Language.createLanguage(myThis.getLanguageNamespace(), new FileSystemFile(descriptorFile), myThis.getProject());
    LanguageDescriptor languageDescriptor = (LanguageDescriptor)language.getLanguageDescriptor();
    ModuleReference devkitRef = LanguageDesign_DevKit.MODULE_REFERENCE;
    languageDescriptor.getUsedDevkits().add(devkitRef);
    languageDescriptor.setCompileInMPS(myThis.getCompileInMPS());
    LanguageAspect.STRUCTURE.createNew(language, false);
    LanguageAspect.EDITOR.createNew(language, false);
    LanguageAspect.CONSTRAINTS.createNew(language, false);
    LanguageAspect.TYPESYSTEM.createNew(language, false);
    language.setLanguageDescriptor(languageDescriptor);
    language.save();
    myThis.getProject().addProjectLanguage(language);
    myThis.setResult(language);
    // add to vcs
    ApplicationManager.getApplication().invokeLater(new Runnable() {

      public void run() {
        ApplicationLevelVcsManager.instance().addFileToVcs(VFileSystem.refreshAndGetFile(descriptorFile.getParentFile()), true);
      }

    }, ModalityState.NON_MODAL);
  }

}
