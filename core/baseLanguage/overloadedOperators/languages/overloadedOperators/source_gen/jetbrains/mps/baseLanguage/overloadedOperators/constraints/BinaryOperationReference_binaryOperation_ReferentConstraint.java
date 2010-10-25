package jetbrains.mps.baseLanguage.overloadedOperators.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.smodel.SNodePointer;

public class BinaryOperationReference_binaryOperation_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public BinaryOperationReference_binaryOperation_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.overloadedOperators.structure.BinaryOperationReference", "binaryOperation", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.overloadedOperators.structure.BinaryOperationReference", "binaryOperation");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> result = new ArrayList<SNode>();

    for (Language language : operationContext.getScope().getVisibleLanguages()) {
      SModelDescriptor strucModelDescriptor = LanguageAspect.STRUCTURE.get(language);
      SModel strucModel = strucModelDescriptor.getSModel();
      ListSequence.fromList(result).addSequence(ListSequence.fromList(SModelOperations.getRoots(strucModel, "jetbrains.mps.lang.structure.structure.ConceptDeclaration")).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SConceptOperations.isSubConceptOf(it, "jetbrains.mps.baseLanguage.structure.BinaryOperation") && !(SConceptPropertyOperations.getBoolean(it, "abstract"));
        }
      }));
    }
    return result;
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:9b7a7baa-7b52-4b41-8293-5aa14d41220f(jetbrains.mps.baseLanguage.overloadedOperators.constraints)", "2838654975957288976");
  }
}
