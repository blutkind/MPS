package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Model_RootsIncludingImportedOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Model_RootsIncludingImportedOperation";
  public static final String CONCEPT = "concept";
  public static final String SCOPE = "scope";

  public Model_RootsIncludingImportedOperation(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration)this.getReferent(AbstractConceptDeclaration.class, Model_RootsIncludingImportedOperation.CONCEPT);
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(Model_RootsIncludingImportedOperation.CONCEPT, node);
  }

  public Expression getScope() {
    return (Expression)this.getChild(Expression.class, Model_RootsIncludingImportedOperation.SCOPE);
  }

  public void setScope(Expression node) {
    super.setChild(Model_RootsIncludingImportedOperation.SCOPE, node);
  }


  public static Model_RootsIncludingImportedOperation newInstance(SModel sm, boolean init) {
    return (Model_RootsIncludingImportedOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Model_RootsIncludingImportedOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Model_RootsIncludingImportedOperation newInstance(SModel sm) {
    return Model_RootsIncludingImportedOperation.newInstance(sm, false);
  }

}
