package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class PrimitiveDataTypeDeclaration extends DataTypeDeclaration {

  public  PrimitiveDataTypeDeclaration(SNode node) {
    super(node);
  }

  public static PrimitiveDataTypeDeclaration newInstance(SModel sm) {
    return (PrimitiveDataTypeDeclaration)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.PrimitiveDataTypeDeclaration", sm, GlobalScope.getInstance()).getAdapter();
  }
}
