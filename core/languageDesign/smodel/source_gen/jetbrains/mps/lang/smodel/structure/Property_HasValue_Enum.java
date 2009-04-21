package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Property_HasValue_Enum extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Property_HasValue_Enum";
  public static final String VALUE = "value";

  public Property_HasValue_Enum(SNode node) {
    super(node);
  }

  public EnumMemberReference getValue() {
    return (EnumMemberReference)this.getChild(EnumMemberReference.class, Property_HasValue_Enum.VALUE);
  }

  public void setValue(EnumMemberReference node) {
    super.setChild(Property_HasValue_Enum.VALUE, node);
  }


  public static Property_HasValue_Enum newInstance(SModel sm, boolean init) {
    return (Property_HasValue_Enum)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Property_HasValue_Enum", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Property_HasValue_Enum newInstance(SModel sm) {
    return Property_HasValue_Enum.newInstance(sm, false);
  }

}
