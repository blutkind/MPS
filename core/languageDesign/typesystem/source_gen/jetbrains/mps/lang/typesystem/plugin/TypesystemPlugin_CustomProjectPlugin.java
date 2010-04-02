package jetbrains.mps.lang.typesystem.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.custom.BaseCustomProjectPlugin;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.typesystem.checking.TypesEditorChecker;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.nodeEditor.Highlighter;

public class TypesystemPlugin_CustomProjectPlugin extends BaseCustomProjectPlugin {
  private static Logger LOG = Logger.getLogger(TypesystemPlugin_CustomProjectPlugin.class);

  private TypesEditorChecker myChecker;

  public TypesystemPlugin_CustomProjectPlugin() {
  }

  public void doInit(MPSProject project) {
    TypesystemPlugin_CustomProjectPlugin.this.myChecker = new TypesEditorChecker();
    Highlighter highlighter = project.getProject().getComponent(Highlighter.class);
    if (highlighter != null) {
      highlighter.addChecker(TypesystemPlugin_CustomProjectPlugin.this.myChecker);
    }
  }

  public void doDispose(MPSProject project) {
    Highlighter highlighter = project.getProject().getComponent(Highlighter.class);
    if (highlighter != null) {
      highlighter.removeChecker(TypesystemPlugin_CustomProjectPlugin.this.myChecker);
      TypesystemPlugin_CustomProjectPlugin.this.myChecker.dispose();
    }
  }
}
