package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class StringConceptPropertyDeclaration extends ConceptPropertyDeclaration {

  public  StringConceptPropertyDeclaration(SNode node) {
    super(node);
  }

  public static StringConceptPropertyDeclaration newInstance(SModel sm) {
    return (StringConceptPropertyDeclaration)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.StringConceptPropertyDeclaration", sm, GlobalScope.getInstance()).getAdapter();
  }
}
