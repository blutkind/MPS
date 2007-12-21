package jetbrains.mps.bootstrap.constraintsLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.bootstrap.structureLanguage.constraints.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ConceptBehavior_NonTypesystemRule implements NonTypesystemRule_Runtime {

  public  check_ConceptBehavior_NonTypesystemRule() {
  }

  public void applyRule(final SNode argument) {
    List<SNode> methodDeclarations = AbstractConceptDeclaration_Behavior.call_getNotImplementedConceptMethods_1198232898469(SLinkOperations.getTarget(argument, "concept", false), GlobalScope.getInstance());
    if(!(SequenceOperations.isEmpty(methodDeclarations)) && !(SConceptPropertyOperations.getBoolean(SLinkOperations.getTarget(argument, "concept", false), "abstract"))) {
      TypeChecker.getInstance().reportTypeError(argument, "Concept " + SPropertyOperations.getString(SLinkOperations.getTarget(argument, "concept", false), "name") + " doesn't implement " + methodDeclarations, "jetbrains.mps.bootstrap.constraintsLanguage.helgins", "1198233457005");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
