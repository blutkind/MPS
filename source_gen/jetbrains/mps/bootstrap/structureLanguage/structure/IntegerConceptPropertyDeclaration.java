package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IntegerConceptPropertyDeclaration extends ConceptPropertyDeclaration {

  public  IntegerConceptPropertyDeclaration(SNode node) {
    super(node);
  }

  public static IntegerConceptPropertyDeclaration newInstance(SModel sm, boolean init) {
    return (IntegerConceptPropertyDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.structure.IntegerConceptPropertyDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IntegerConceptPropertyDeclaration newInstance(SModel sm) {
    return IntegerConceptPropertyDeclaration.newInstance(sm, false);
  }

}
