package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;

public enum CompareType {
  EQUALS("==", "datetime equals"),
  NOT_EQUALS("!=", "datetime not equals"),
  GREATER(">", "datetime greater"),
  GREATER_OR_EQUALS(">=", "datetime greater or equals"),
  LESS("<", "datetime less"),
  LESS_OR_EQUALS("<=", "datetime less or equals");

  private String myName;
  private String myValue;

  CompareType(String name, String value) {
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


  public static List<CompareType> getConstants() {
    List<CompareType> list = new LinkedList<CompareType>();
    ListOperations.addElement(list, CompareType.EQUALS);
    ListOperations.addElement(list, CompareType.NOT_EQUALS);
    ListOperations.addElement(list, CompareType.GREATER);
    ListOperations.addElement(list, CompareType.GREATER_OR_EQUALS);
    ListOperations.addElement(list, CompareType.LESS);
    ListOperations.addElement(list, CompareType.LESS_OR_EQUALS);
    return list;
  }

  public static CompareType getDefault() {
    return CompareType.EQUALS;
  }

  public static CompareType parseValue(String value) {
    if (value == null) {
      return CompareType.getDefault();
    }
    if (value.equals(CompareType.EQUALS.getValueAsString())) {
      return CompareType.EQUALS;
    }
    if (value.equals(CompareType.NOT_EQUALS.getValueAsString())) {
      return CompareType.NOT_EQUALS;
    }
    if (value.equals(CompareType.GREATER.getValueAsString())) {
      return CompareType.GREATER;
    }
    if (value.equals(CompareType.GREATER_OR_EQUALS.getValueAsString())) {
      return CompareType.GREATER_OR_EQUALS;
    }
    if (value.equals(CompareType.LESS.getValueAsString())) {
      return CompareType.LESS;
    }
    if (value.equals(CompareType.LESS_OR_EQUALS.getValueAsString())) {
      return CompareType.LESS_OR_EQUALS;
    }
    return CompareType.getDefault();
  }

}
