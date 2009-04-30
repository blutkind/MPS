package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class RightTransformAnchorTag_PropertySupport extends PropertySupport {

  public boolean canSetValue(String value) {
    if (value == null) {
      return true;
    }
    Iterator<RightTransformAnchorTag> constants = ListSequence.fromList(RightTransformAnchorTag.getConstants()).iterator();
    while (constants.hasNext()) {
      RightTransformAnchorTag constant = constants.next();
      if (value.equals(constant.getName())) {
        return true;
      }
    }
    return false;
  }

  public String toInternalValue(String value) {
    if (value == null) {
      return null;
    }
    Iterator<RightTransformAnchorTag> constants = ListSequence.fromList(RightTransformAnchorTag.getConstants()).iterator();
    while (constants.hasNext()) {
      RightTransformAnchorTag constant = constants.next();
      if (value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }

  public String fromInternalValue(String value) {
    RightTransformAnchorTag constant = RightTransformAnchorTag.parseValue(value);
    if (constant != null) {
      return constant.getName();
    }
    return "";
  }

}
