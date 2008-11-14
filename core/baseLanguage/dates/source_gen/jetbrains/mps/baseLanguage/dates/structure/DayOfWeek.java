package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;

public enum DayOfWeek {
  Sunday("Sunday", "SUN"),
  Monday("Monday", "MON"),
  Tuesday("Tuesday", "TUE"),
  Thursday("Thursday", "THU"),
  Wednesday("Wednesday", "WED"),
  Friday("Friday", "FRI"),
  Saturday("Saturday", "SAT");

  private String myName;
  private String myValue;

  DayOfWeek(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<DayOfWeek> getConstants() {
    List<DayOfWeek> list = new LinkedList<DayOfWeek>();
    list.add(DayOfWeek.Sunday);
    list.add(DayOfWeek.Monday);
    list.add(DayOfWeek.Tuesday);
    list.add(DayOfWeek.Thursday);
    list.add(DayOfWeek.Wednesday);
    list.add(DayOfWeek.Friday);
    list.add(DayOfWeek.Saturday);
    return list;
  }

  public static DayOfWeek getDefault() {
    return DayOfWeek.Sunday;
  }

  public static DayOfWeek parseValue(String value) {
    if (value == null) {
      return DayOfWeek.getDefault();
    }
    if (value.equals(DayOfWeek.Sunday.getValueAsString())) {
      return DayOfWeek.Sunday;
    }
    if (value.equals(DayOfWeek.Monday.getValueAsString())) {
      return DayOfWeek.Monday;
    }
    if (value.equals(DayOfWeek.Tuesday.getValueAsString())) {
      return DayOfWeek.Tuesday;
    }
    if (value.equals(DayOfWeek.Thursday.getValueAsString())) {
      return DayOfWeek.Thursday;
    }
    if (value.equals(DayOfWeek.Wednesday.getValueAsString())) {
      return DayOfWeek.Wednesday;
    }
    if (value.equals(DayOfWeek.Friday.getValueAsString())) {
      return DayOfWeek.Friday;
    }
    if (value.equals(DayOfWeek.Saturday.getValueAsString())) {
      return DayOfWeek.Saturday;
    }
    return DayOfWeek.getDefault();
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
