package jetbrains.mps.project;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Sergey Dmitriev
 * Date: Mar 24, 2005
 */
public class MPSProjects {
  private ArrayList<MPSProject> myProjects = new ArrayList<MPSProject>();
  private ArrayList<MPSProjectsListener> myMPSProjectsListeners = new ArrayList<MPSProjectsListener>();

  public void addProject(MPSProject mpsProject) {
    myProjects.add(mpsProject);
    for(MPSProjectsListener listener : myMPSProjectsListeners) {
      listener.projectAdded(mpsProject);
    }
  }

  public List<MPSProject> getProjects() {
    return new ArrayList<MPSProject>(myProjects);
  }

  public void removeProject(MPSProject mpsProject) {
    myProjects.remove(mpsProject);
    for(MPSProjectsListener listener : myMPSProjectsListeners) {
      listener.projectRemoved(mpsProject);
    }
  }

  public void addMPSProjectsListener(MPSProjectsListener listener) {
    myMPSProjectsListeners.add(listener);
  }

  public void removeMPSProjectsListener(MPSProjectsListener listener) {
    myMPSProjectsListeners.remove(listener);
  }

}
