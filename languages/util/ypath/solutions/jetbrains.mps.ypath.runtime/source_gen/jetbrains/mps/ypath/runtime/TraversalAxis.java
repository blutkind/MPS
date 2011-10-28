package jetbrains.mps.ypath.runtime;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;

public enum TraversalAxis {
  DESCENDANTS("descendants", "DESCENDANTS"),
  SELF_DESCENDANTS("self and descendants", "SELF_DESCENDANTS"),
  CHILDREN("children", "CHILDREN"),
  ANCESTORS("ancestors", "ANCESTORS"),
  SELF_ANCESTORS("self and ancestors", "SELF_ANCESTORS"),
  FOLLOWING_SIBLINGS("following siblings", "FOLLOWING_SIBLINGS"),
  SELF_FOLLOWING_SIBLINGS("self and following siblings", "SELF_FOLLOWING_SIBLINGS"),
  PRECEDING_SIBLINGS("preceding siblings", "PRECEDING_SIBLINGS"),
  PRECEDING_SIBLINGS_SELF("preceding siblings and self", "PRECEDING_SIBLINGS_SELF");

  /*package*/ String myName;
  /*package*/ String myValue;

  TraversalAxis(String name, String value) {
    myName = name;
    myValue = value;
  }

  public String getName() {
    return myName;
  }

  public String getValueAsString() {
    return myValue;
  }

  public String getValue() {
    return myValue;
  }

  public static List<TraversalAxis> getConstants() {
    List<TraversalAxis> list = new LinkedList<TraversalAxis>();
    list.add(TraversalAxis.DESCENDANTS);
    list.add(TraversalAxis.SELF_DESCENDANTS);
    list.add(TraversalAxis.CHILDREN);
    list.add(TraversalAxis.ANCESTORS);
    list.add(TraversalAxis.SELF_ANCESTORS);
    list.add(TraversalAxis.FOLLOWING_SIBLINGS);
    list.add(TraversalAxis.SELF_FOLLOWING_SIBLINGS);
    list.add(TraversalAxis.PRECEDING_SIBLINGS);
    list.add(TraversalAxis.PRECEDING_SIBLINGS_SELF);
    return list;
  }

  public static TraversalAxis getDefault() {
    return TraversalAxis.DESCENDANTS;
  }

  public static TraversalAxis parseValue(String value) {
    if (value == null) {
      return TraversalAxis.getDefault();
    }
    if (value.equals(TraversalAxis.DESCENDANTS.getValueAsString())) {
      return TraversalAxis.DESCENDANTS;
    }
    if (value.equals(TraversalAxis.SELF_DESCENDANTS.getValueAsString())) {
      return TraversalAxis.SELF_DESCENDANTS;
    }
    if (value.equals(TraversalAxis.CHILDREN.getValueAsString())) {
      return TraversalAxis.CHILDREN;
    }
    if (value.equals(TraversalAxis.ANCESTORS.getValueAsString())) {
      return TraversalAxis.ANCESTORS;
    }
    if (value.equals(TraversalAxis.SELF_ANCESTORS.getValueAsString())) {
      return TraversalAxis.SELF_ANCESTORS;
    }
    if (value.equals(TraversalAxis.FOLLOWING_SIBLINGS.getValueAsString())) {
      return TraversalAxis.FOLLOWING_SIBLINGS;
    }
    if (value.equals(TraversalAxis.SELF_FOLLOWING_SIBLINGS.getValueAsString())) {
      return TraversalAxis.SELF_FOLLOWING_SIBLINGS;
    }
    if (value.equals(TraversalAxis.PRECEDING_SIBLINGS.getValueAsString())) {
      return TraversalAxis.PRECEDING_SIBLINGS;
    }
    if (value.equals(TraversalAxis.PRECEDING_SIBLINGS_SELF.getValueAsString())) {
      return TraversalAxis.PRECEDING_SIBLINGS_SELF;
    }
    return TraversalAxis.getDefault();
  }
}
