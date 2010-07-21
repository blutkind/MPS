package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum Keymap {
  Mac_OS_X("Mac OS X", "Mac OS X"),
  XWin("XWin", "Default for XWin"),
  GNOME("GNOME", "Default for GNOME"),
  KDE("KDE", "Default for KDE"),
  Default("Default", "$default");

  private String myName;
  private String myValue;

  Keymap(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public String getName() {
    return this.myName;
  }

  public String getValueAsString() {
    return this.myValue;
  }

  public String getValue() {
    return this.myValue;
  }

  public static List<Keymap> getConstants() {
    List<Keymap> list = ListSequence.fromList(new LinkedList<Keymap>());
    ListSequence.fromList(list).addElement(Keymap.Mac_OS_X);
    ListSequence.fromList(list).addElement(Keymap.XWin);
    ListSequence.fromList(list).addElement(Keymap.GNOME);
    ListSequence.fromList(list).addElement(Keymap.KDE);
    ListSequence.fromList(list).addElement(Keymap.Default);
    return list;
  }

  public static Keymap getDefault() {
    return Keymap.Mac_OS_X;
  }

  public static Keymap parseValue(String value) {
    if (value == null) {
      return Keymap.getDefault();
    }
    if (value.equals(Keymap.Mac_OS_X.getValueAsString())) {
      return Keymap.Mac_OS_X;
    }
    if (value.equals(Keymap.XWin.getValueAsString())) {
      return Keymap.XWin;
    }
    if (value.equals(Keymap.GNOME.getValueAsString())) {
      return Keymap.GNOME;
    }
    if (value.equals(Keymap.KDE.getValueAsString())) {
      return Keymap.KDE;
    }
    if (value.equals(Keymap.Default.getValueAsString())) {
      return Keymap.Default;
    }
    return Keymap.getDefault();
  }
}
