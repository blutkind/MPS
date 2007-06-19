package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;

public class Cardinality_PropertySupport extends PropertySupport {

  public boolean canSetValue(String value) {
    if(value == null) {
      return true;
    }
    Iterator<Cardinality> constants = Cardinality.getConstants().iterator();
    while(constants.hasNext()) {
      Cardinality constant = constants.next();
      if(value.equals(constant.getName())) {
        return true;
      }
    }
    return false;
  }
  public String toInternalValue(String value) {
    if(value == null) {
      return null;
    }
    Iterator<Cardinality> constants = Cardinality.getConstants().iterator();
    while(constants.hasNext()) {
      Cardinality constant = constants.next();
      if(value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }
  public String fromInternalValue(String value) {
    Cardinality constant = Cardinality.parseValue(value);
    if(constant != null) {
      return constant.getName();
    }
    return null;
  }
}
