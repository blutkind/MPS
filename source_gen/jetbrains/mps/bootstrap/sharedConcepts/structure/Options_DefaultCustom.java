package jetbrains.mps.bootstrap.sharedConcepts.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;

public enum Options_DefaultCustom {
  default_("<default>", null),
  custom_("custom", "custom");

  public String myName;
  public String myValue;

 Options_DefaultCustom(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<Options_DefaultCustom> getConstants() {
    List<Options_DefaultCustom> list = new LinkedList<Options_DefaultCustom>();
    list.add(Options_DefaultCustom.default_);
    list.add(Options_DefaultCustom.custom_);
    return list;
  }
  public static Options_DefaultCustom getDefault() {
    return Options_DefaultCustom.default_;
  }
  public static Options_DefaultCustom parseValue(String value) {
    if(value == null) {
      return Options_DefaultCustom.getDefault();
    }
    if(value.equals(Options_DefaultCustom.default_.getValueAsString())) {
      return Options_DefaultCustom.default_;
    }
    if(value.equals(Options_DefaultCustom.custom_.getValueAsString())) {
      return Options_DefaultCustom.custom_;
    }
    return Options_DefaultCustom.getDefault();
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
