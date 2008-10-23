package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SequenceType extends Type {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.SequenceType";
  public static final String ELEMENT_TYPE = "elementType";

  public SequenceType(SNode node) {
    super(node);
  }

  public Type getElementType() {
    return (Type)this.getChild(SequenceType.ELEMENT_TYPE);
  }

  public void setElementType(Type node) {
    super.setChild(SequenceType.ELEMENT_TYPE, node);
  }


  public static SequenceType newInstance(SModel sm, boolean init) {
    return (SequenceType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SequenceType newInstance(SModel sm) {
    return SequenceType.newInstance(sm, false);
  }

}
