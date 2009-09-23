package jetbrains.mps.editor.runtime;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import java.awt.Component;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import javax.swing.JLabel;
import jetbrains.mps.nodeEditor.EditorSettings;
import java.awt.Color;
import jetbrains.mps.ide.tooltips.ToolTip;
import java.awt.GridBagConstraints;

public class ParametersInformation {
  public ParametersInformation() {
  }

  public List<SNode> getMethods(SNode node, EditorContext editorContext) {
    return null;
  }

  public String getMethodPresentation(SNode node, EditorContext editorContext, SNode method) {
    return null;
  }

  public boolean isMethodCurrent(SNode node, EditorContext editorContext, SNode method) {
    return false;
  }

  public Component getComponent(SNode node, EditorContext editorContext) {
    List<SNode> methods = this.getMethods(node, editorContext);
    int lineNumber = 0;
    JPanel panel = new JPanel(new GridBagLayout());
    for (SNode method : ListSequence.fromList(methods)) {
      JLabel jLabel = new JLabel(this.getMethodPresentation(node, editorContext, method));
      jLabel.setFont(EditorSettings.getInstance().getDefaultEditorFont());
      jLabel.setOpaque(true);
      if (ListSequence.fromList(methods).count() > 1 && this.isMethodCurrent(node, editorContext, method)) {
        jLabel.setBackground(new Color(0xe7, 0xfe, 0xea));
      } else {
        jLabel.setBackground(ToolTip.BACKGROUND_COLOR);
      }
      GridBagConstraints constraints = new GridBagConstraints();
      constraints.fill = GridBagConstraints.BOTH;
      constraints.gridy = lineNumber++ ;
      panel.add(jLabel, constraints);
    }
    return panel;
  }
}
