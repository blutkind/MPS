package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class subtype_ShortType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public  subtype_ShortType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode typeNode) {
    return ListOperations.<SNode>createList(SConceptOperations.createNewNode("jetbrains.mps.nanoj.structure.IntType", null));
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.ShortType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
