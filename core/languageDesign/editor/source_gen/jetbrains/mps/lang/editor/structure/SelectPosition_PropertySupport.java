package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class SelectPosition_PropertySupport extends PropertySupport {

  public boolean canSetValue(String value) {
    if (value == null) {
      return true;
    }
    Iterator<SelectPosition> constants = ListSequence.fromList(SelectPosition.getConstants()).iterator();
    while (constants.hasNext()) {
      SelectPosition constant = constants.next();
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
    Iterator<SelectPosition> constants = ListSequence.fromList(SelectPosition.getConstants()).iterator();
    while (constants.hasNext()) {
      SelectPosition constant = constants.next();
      if (value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }

  public String fromInternalValue(String value) {
    SelectPosition constant = SelectPosition.parseValue(value);
    if (constant != null) {
      return constant.getName();
    }
    return "";
  }

}
