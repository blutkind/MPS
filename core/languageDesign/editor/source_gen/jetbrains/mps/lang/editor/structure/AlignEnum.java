package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;

public enum AlignEnum {
  left("left", "LEFT"),
  rigth("rigth", "RIGHT"),
  center("center", "CENTER");

  private String myName;
  private String myValue;

  AlignEnum(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<AlignEnum> getConstants() {
    List<AlignEnum> list = new LinkedList<AlignEnum>();
    list.add(AlignEnum.left);
    list.add(AlignEnum.rigth);
    list.add(AlignEnum.center);
    return list;
  }

  public static AlignEnum getDefault() {
    return AlignEnum.left;
  }

  public static AlignEnum parseValue(String value) {
    if (value == null) {
      return AlignEnum.getDefault();
    }
    if (value.equals(AlignEnum.left.getValueAsString())) {
      return AlignEnum.left;
    }
    if (value.equals(AlignEnum.rigth.getValueAsString())) {
      return AlignEnum.rigth;
    }
    if (value.equals(AlignEnum.center.getValueAsString())) {
      return AlignEnum.center;
    }
    return AlignEnum.getDefault();
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

}
