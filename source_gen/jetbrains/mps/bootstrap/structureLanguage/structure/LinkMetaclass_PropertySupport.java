package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;

public class LinkMetaclass_PropertySupport extends PropertySupport {

  public boolean canSetValue(String value) {
    if(value == null) {
      return true;
    }
    Iterator<LinkMetaclass> constants = LinkMetaclass.getConstants().iterator();
    while(constants.hasNext()) {
      LinkMetaclass constant = constants.next();
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
    Iterator<LinkMetaclass> constants = LinkMetaclass.getConstants().iterator();
    while(constants.hasNext()) {
      LinkMetaclass constant = constants.next();
      if(value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }

  public String fromInternalValue(String value) {
    LinkMetaclass constant = LinkMetaclass.parseValue(value);
    if(constant != null) {
      return constant.getName();
    }
    return null;
  }

}
