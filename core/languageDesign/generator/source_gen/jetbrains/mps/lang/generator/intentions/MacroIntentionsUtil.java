package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.generator.typesystem.QueriesUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class MacroIntentionsUtil {
  public static SNode getContextNodeConcept(SNode contextNode) {
    SNode enclosingMacro = findOuterMacro(contextNode);
    if ((enclosingMacro == null)) {
      return QueriesUtil.getApplicableConcept_fromEnvironment(contextNode);
    }
    if (SNodeOperations.isInstanceOf(enclosingMacro, "jetbrains.mps.lang.generator.structure.SourceSubstituteMacro")) {
      return getConceptFrom(SNodeOperations.cast(enclosingMacro, "jetbrains.mps.lang.generator.structure.SourceSubstituteMacro"));
    }
    return null;
  }

  private static SNode getConceptFrom(SNode macro) {
    SNode query = QueriesUtil.getQueryFunction_fromSourceSubstituteMacro(macro);
    SNode returnType = TypeChecker.getInstance().getTypeOf(query);
    // ====== 
    if (SNodeOperations.isInstanceOf(query, "jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodeQuery")) {
      {
        GeneratedMatchingPattern pattern_0 = new MacroIntentionsUtil.Pattern_0();
        SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(returnType, pattern_0);
        if (coercedNode_0 != null) {
          return ((SNode) pattern_0.getFieldValue("PatternVar_concept"));
        } else {
          return null;
        }
      }
    } else if (SNodeOperations.isInstanceOf(query, "jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodesQuery")) {
      {
        GeneratedMatchingPattern pattern_1 = new MacroIntentionsUtil.Pattern_1();
        SNode coercedNode_1 = TypeChecker.getInstance().getRuntimeSupport().coerce_(returnType, pattern_1);
        if (coercedNode_1 != null) {
          return ((SNode) pattern_1.getFieldValue("PatternVar_concept"));
        } else {
          return null;
        }
      }
    } else {
      SNode macroOuterNode = SNodeOperations.getParent(SNodeOperations.getParent(macro));
      return getContextNodeConcept(macroOuterNode);
    }
  }

  private static SNode findOuterMacro(SNode contextNode) {
    if (contextNode == null) {
      return null;
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(contextNode, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), true)).isNotEmpty()) {
      return ListSequence.fromList(SLinkOperations.getTargets(contextNode, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), true)).last();
    }
    return findOuterMacro(SNodeOperations.getParent(contextNode));
  }

  public static List<SNode> getLinks(SNode sourceNode, boolean inCollection) {
    if (sourceNode == null) {
      return null;
    }
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
    for (SNode child : AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(sourceNode)) {
      if (inCollection) {
        if (SPropertyOperations.hasValue(child, "sourceCardinality", "0..n", "0..1") || SPropertyOperations.hasValue(child, "sourceCardinality", "1..n", "0..1")) {
          ListSequence.fromList(result).addElement(child);
        }
      } else {
        if (SPropertyOperations.hasValue(child, "sourceCardinality", "0..1", "0..1") || SPropertyOperations.hasValue(child, "sourceCardinality", "1", "0..1")) {
          ListSequence.fromList(result).addElement(child);
        }
      }
    }
    return result;
  }

  public static class Pattern_0 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode PatternVar_concept;

    public Pattern_0() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_3019_0;
        nodeToMatch_3019_0 = nodeToMatch;
        if (!("jetbrains.mps.lang.smodel.structure.SNodeType".equals(nodeToMatch_3019_0.getConceptFqName()))) {
          return false;
        }
        this.PatternVar_concept = nodeToMatch_3019_0.getReferent("concept");
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return false;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        this.PatternVar_concept = (SNode) pattern.getFieldValue("PatternVar_concept");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_concept".equals(fieldName)) {
        return this.PatternVar_concept;
      }
      return null;
    }
  }

  public static class Pattern_1 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode PatternVar_concept;

    public Pattern_1() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_3019_1;
        nodeToMatch_3019_1 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.collections.structure.SequenceType".equals(nodeToMatch_3019_1.getConceptFqName()))) {
          return false;
        }
        {
          String childRole3019_0 = "elementType";
          if (nodeToMatch_3019_1.getChildCount(childRole3019_0) != 1) {
            return false;
          }
          {
            SNode childVar_3019_0 = nodeToMatch_3019_1.getChildren(childRole3019_0).get(0);
            {
              SNode nodeToMatch_3019_2;
              nodeToMatch_3019_2 = childVar_3019_0;
              if (!("jetbrains.mps.lang.smodel.structure.SNodeType".equals(nodeToMatch_3019_2.getConceptFqName()))) {
                return false;
              }
              this.PatternVar_concept = nodeToMatch_3019_2.getReferent("concept");
            }
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return false;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        this.PatternVar_concept = (SNode) pattern.getFieldValue("PatternVar_concept");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_concept".equals(fieldName)) {
        return this.PatternVar_concept;
      }
      return null;
    }
  }
}
