package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.closures.constraints.ClassifierTypeUtil;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class supertypesOf_ClassifierType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public supertypesOf_ClassifierType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode ct, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    List<SNode> supertypes = ListSequence.fromList(new ArrayList<SNode>());
    SNode classifier = SLinkOperations.getTarget(ct, "classifier", false);
    if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.Interface") || SPropertyOperations.getBoolean(SNodeOperations.as(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "abstractClass")) {
      List<SNode> methods = SLinkOperations.getTargets(classifier, "method", true);
      Iterable<SNode> cands = ListSequence.fromList(methods).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode m) {
          return !("equals".equals(SPropertyOperations.getString(m, "name"))) && SPropertyOperations.getBoolean(m, "isAbstract");
        }
      });
      Iterator<SNode> it = Sequence.fromIterable(cands).iterator();
      SNode mtd = (it.hasNext() ?
        it.next() :
        null
      );
      if (!(it.hasNext()) && (mtd != null)) {
        List<SNode> paramTypes = ListSequence.fromList(new ArrayList<SNode>());
        for (SNode p : SLinkOperations.getTargets(mtd, "parameter", true)) {
          ListSequence.fromList(paramTypes).addElement(ClassifierTypeUtil.resolveType(SLinkOperations.getTarget(p, "type", true), ct));
        }
        SNode resType = ClassifierTypeUtil.resolveType(SLinkOperations.getTarget(mtd, "returnType", true), ct);
        supertypes = ListSequence.fromListAndArray(new ArrayList<SNode>(), new supertypesOf_ClassifierType_SubtypingRule.QuotationClass_qen718_a1a0d0e0c0a().createNode(paramTypes, resType, typeCheckingContext));
      }
    }
    return supertypes;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_qen718_a1a0d0e0c0a {
    public QuotationClass_qen718_a1a0d0e0c0a() {
    }

    public SNode createNode(Object parameter_6, Object parameter_7, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          List<SNode> nodes = (List<SNode>) parameter_6;
          for (SNode child : nodes) {
            quotedNode_1.addChild("parameterType", HUtil.copyIfNecessary(child, typeCheckingContext));
          }
        }
        {
          quotedNode_3 = (SNode) parameter_7;
          SNode quotedNode1_5;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_5 = HUtil.copyIfNecessary(quotedNode_3, typeCheckingContext);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_5 = quotedNode_3;
          }
          if (quotedNode1_5 != null) {
            quotedNode_1.addChild("resultType", HUtil.copyIfNecessary(quotedNode1_5, typeCheckingContext));
          }
        }
        result = quotedNode1_4;
      }
      return result;
    }

    public SNode createNode(Object parameter_6, Object parameter_7) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          List<SNode> nodes = (List<SNode>) parameter_6;
          for (SNode child : nodes) {
            quotedNode_1.addChild("parameterType", HUtil.copyIfNecessary(child));
          }
        }
        {
          quotedNode_3 = (SNode) parameter_7;
          SNode quotedNode1_5;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_5 = HUtil.copyIfNecessary(quotedNode_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_5 = quotedNode_3;
          }
          if (quotedNode1_5 != null) {
            quotedNode_1.addChild("resultType", HUtil.copyIfNecessary(quotedNode1_5));
          }
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }
}
