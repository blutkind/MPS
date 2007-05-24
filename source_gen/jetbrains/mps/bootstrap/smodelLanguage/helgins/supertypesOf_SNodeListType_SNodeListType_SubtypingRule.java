package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.QuotationClass_27;
import jetbrains.mps.bootstrap.smodelLanguage.helgins.QuotationClass_28;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypesOf_SNodeListType_SNodeListType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public  supertypesOf_SNodeListType_SNodeListType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode type) {
    List<SNode> supertypes = ListOperations.createList(new SNode[]{});
    SNode elementConcept = SLinkOperations.getTarget(type, "elementConcept", false);
    if(elementConcept != null) {
      List<SNode> superConcepts = SConceptOperations.getDirectSuperConcepts(elementConcept);
      {
        ICursor<SNode> _zCursor = CursorFactory.createCursor(superConcepts);
        try {
          while(_zCursor.moveToNext()) {
            SNode superConcept = _zCursor.getCurrent();
            ListOperations.addElement(supertypes, new QuotationClass_27().createNode(superConcept));
          }
        } finally {
          _zCursor.release();
        }
      }
      // ==========
      ListOperations.addElement(supertypes, new QuotationClass_28().createNode());
    }
    return supertypes;
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean isSupertyping() {
    return false;
  }
  public boolean isWeak() {
    return false;
  }
}
