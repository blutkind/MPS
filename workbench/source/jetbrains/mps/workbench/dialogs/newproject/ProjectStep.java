package jetbrains.mps.workbench.dialogs.newproject;

import com.intellij.ide.wizard.CommitStepException;
import jetbrains.mps.ide.common.PathField;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.workbench.dialogs.newproject.icons.Icons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.GridLayout;
import java.io.File;
import java.net.URL;

public class ProjectStep extends BaseStep {
  private ProjectOptions myOptions;

  private JTextField myProjectName;
  private PathField myProjectPath;

  public ProjectStep(ProjectOptions options) {
    super();
    myOptions = options;

    myOptions.setProjectName(getDefaultProjectName());
  }

  public JComponent createControlComponent() {
    JPanel panel = new JPanel(new GridLayout(4, 1));

    JLabel nameLabel = new JLabel();
    nameLabel.setText("Name:");
    panel.add(nameLabel);

    myProjectName = new JTextField();
    panel.add(myProjectName);

    JLabel pathLabel = new JLabel();
    pathLabel.setText("Project path:");
    panel.add(pathLabel);

    myProjectPath = new PathField();
    panel.add(myProjectPath);

    myProjectName.addCaretListener(new CaretListener() {
      public void caretUpdate(CaretEvent e) {
        updateProjectPath();
      }
    });

    return panel;
  }

  public URL getImageURL() {
    return Icons.NEW_PROJECT_IMAGE_URL;
  }

  @NotNull
  public String getImageText() {
    return "New project";
  }

  public String getCommentString() {
    return
      "A project is a set of languages and solutions with which you work.";
  }

  @Nullable
  public String getURL() {
    return "http://www.jetbrains.net/confluence/display/MPS/MPS+project+structure#MPSprojectstructure-projects";
  }

  public void _init() {
    super._init();

    myProjectName.setText(myOptions.getProjectName());
    myProjectPath.setPath(myOptions.getProjectPath());

    updateProjectPath();
  }

  public void _check() throws CommitStepException {
    if (myProjectPath.getPath() == null) {
      throw new CommitStepException("Project path should be specified");
    }
    File projectDirFile = new File(myProjectPath.getPath());
    if (!(projectDirFile.isAbsolute())) {
      throw new CommitStepException("Path should be absolute");
    }
    if (myProjectName.getText().length() == 0) {
      throw new CommitStepException("Project name shouldn't be empty");
    }
  }

  public void _commit(boolean finishChosen) throws CommitStepException {
    super._commit(finishChosen);

    myOptions.setProjectName(myProjectName.getText());
    myOptions.setProjectPath(myProjectPath.getPath());
  }

  private String getDefaultProjectName() {
    int n = 1;
    while (true) {
      String projectName = "Project" + n;
      if (!(new File(getProjectsDir(), projectName).exists())) {
        return projectName;
      }
      n = n + 1;
    }
  }

  private void updateProjectPath() {
    String projectsPath = getProjectsDir();
    if (myProjectPath.getPath() == null || myProjectPath.getPath().length() == 0 || myProjectPath.getPath().startsWith(projectsPath)) {
      myProjectPath.setPath(projectsPath + File.separator + myProjectName.getText());
    }
  }

  private String getProjectsDir() {
    return PathManager.getUserHome() + File.separator + "MPSProjects";
  }
}
