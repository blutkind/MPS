package jetbrains.mps.nodeEditor;

import jetbrains.mps.components.DefaultExternalizableComponent;
import jetbrains.mps.components.Externalizable;
import jetbrains.mps.ide.preferences.IComponentWithPreferences;
import jetbrains.mps.ide.preferences.IPreferencesPage;
import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.ide.actions.tools.ReloadUtils;
import jetbrains.mps.project.ApplicationComponents;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * @author Kostik
 */
public class EditorSettings extends DefaultExternalizableComponent implements IComponentWithPreferences {
  public static EditorSettings getInstance() {
    return ApplicationComponents.getInstance().getComponent(EditorSettings.class);
  }

  private @Externalizable Font myFont = new Font("Monospaced", Font.PLAIN, 12);

  private @Externalizable int myTextWidth = 500;

  public Font getDefaultEditorFont() {
    return myFont;
  }

  public void setDefaultEditorFont(Font newFont) {
    myFont = newFont;
    ReloadUtils.rebuildAllEditors();
  }

  public int getTextWidth() {
    return myTextWidth;
  }

  public void setTextWidth(int textWidth) {
    myTextWidth = textWidth;
  }

  public IPreferencesPage createPreferencesPage() {
    return new MyPreferencesPage();
  }

  private class MyPreferencesPage implements IPreferencesPage {
    private JPanel myEditorSettingsPanel = new JPanel(new BorderLayout());
    private JComboBox myFontsComboBox = createFontsComboBox();
    private JComboBox myFontSizesComboBox = createSizeComboBox();
    private JComboBox myTextWidthComboBox = createTextWidthComboBox();

    public MyPreferencesPage() {
      JPanel panel = new JPanel(new GridLayout(0, 1));
      panel.setBorder(new EmptyBorder(5, 5, 5, 5));
      panel.add(new JLabel("Font Name : "));
      panel.add(myFontsComboBox);
      panel.add(new JLabel("Font Size : "));
      panel.add(myFontSizesComboBox);
      panel.add(new JLabel("Text Width : "));
      panel.add(myTextWidthComboBox);

      myEditorSettingsPanel.add(panel, BorderLayout.NORTH);
    }

    private JComboBox createTextWidthComboBox() {
      List<String> sizes = new ArrayList<String>();

      for (int i = 200; i < 1600; i += 100) {
        sizes.add("" + i);
      }

      JComboBox result = new JComboBox(sizes.toArray());
      result.setSelectedItem("" + getTextWidth());
      return result;
    }

    private JComboBox createSizeComboBox() {
      List<String> sizes = new ArrayList<String>();

      for (int i = 1; i <= 50; i++) {
        sizes.add("" + i);
      }

      JComboBox result = new JComboBox(sizes.toArray());
      result.setSelectedItem("" + myFont.getSize());
      return result;
    }

    private JComboBox createFontsComboBox() {
      JComboBox result = new JComboBox(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());

      result.setRenderer(new DefaultListCellRenderer() {
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
          Component result = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

          Font font = new Font(value.toString(), Font.PLAIN, 12);
          result.setFont(font);

          return result;
        }
      });

      result.setSelectedItem("" + myFont.getFamily());
      return result;
    }

    public String getName() {
      return "Editor Settings";
    }

    public Icon getIcon() {
      return Icons.EDITORS_ICON;
    }

    public JComponent getComponent() {
      return myEditorSettingsPanel;
    }

    public boolean validate() {
      return true;
    }

    public void commit() {
      String fontName = myFontsComboBox.getSelectedItem().toString();
      int fontSize = Integer.parseInt(myFontSizesComboBox.getSelectedItem().toString());

      Font newFont = new Font(fontName, Font.PLAIN, fontSize);
      setDefaultEditorFont(newFont);

      setTextWidth(Integer.parseInt(myTextWidthComboBox.getSelectedItem().toString()));

      ReloadUtils.rebuildAllEditors();
    }
  }
}
