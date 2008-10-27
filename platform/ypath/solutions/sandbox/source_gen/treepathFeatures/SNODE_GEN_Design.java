package treepathFeatures;

/*Generated by MPS */

import jetbrains.mps.ypath.design.IGenericParameterizedFeatureDesign;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.structure.structure.Cardinality;
import jetbrains.mps.ypath.design.IGenericFeatureDesign;

public class SNODE_GEN_Design {
  public static class Design_Feature_child extends IGenericParameterizedFeatureDesign.Stub<SNode> implements IGenericParameterizedFeatureDesign<SNode> {

    public Iterable<SNode> getParameters(SNode nodeType) {
      return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(nodeType, "concept", false), "linkDeclaration", true)).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return "aggregation".equals(SPropertyOperations.getString_def(it, "metaClass", "reference"));
        }

      });
    }

    public SNode getTargetType(SNode param, SNode nodeType) {
      SNode ld = param;
      SNode trg = SLinkOperations.getTarget(ld, "target", false);
      return new _Quotations.QuotationClass_2().createNode(trg);
    }

    public String parameterToString(SNode param) {
      return SPropertyOperations.getString(param, "role");
    }

    public SNode getterExpression(SNode expression, SNode param, ITemplateGenerator generator) {
      SNode opExpr = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.DotExpression", null);
      SNode op = null;
      SLinkOperations.setTarget(opExpr, "operand", expression, true);
      Cardinality card = Cardinality.parseValue(SPropertyOperations.getString_def(param, "sourceCardinality", "0..1"));
      if (card == Cardinality._0__1 || card == Cardinality._1) {
        op = SConceptOperations.createNewNode("jetbrains.mps.lang.smodel.structure.SLinkAccess", null);
        SLinkOperations.setTarget(op, "link", param, false);
      } else
      {
        op = SConceptOperations.createNewNode("jetbrains.mps.lang.smodel.structure.SLinkListAccess", null);
        SLinkOperations.setTarget(op, "link", param, false);
      }
      SLinkOperations.setTarget(opExpr, "operation", op, true);
      return opExpr;
    }

    public boolean isSingleTargetCardinality(SNode param) {
      Cardinality card = Cardinality.parseValue(SPropertyOperations.getString_def(param, "sourceCardinality", "0..1"));
      return card == Cardinality._0__1 || card == Cardinality._1;
    }

}
  public static class Design_Feature_link extends IGenericParameterizedFeatureDesign.Stub<SNode> implements IGenericParameterizedFeatureDesign<SNode> {

    public Iterable<SNode> getParameters(SNode nodeType) {
      return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(nodeType, "concept", false), "linkDeclaration", true)).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return SPropertyOperations.getString_def(it, "metaClass", "reference") == null || "reference".equals(SPropertyOperations.getString_def(it, "metaClass", "reference"));
        }

      });
    }

    public SNode getTargetType(SNode param, SNode nodeType) {
      SNode ld = param;
      SNode trg = SLinkOperations.getTarget(ld, "target", false);
      return new _Quotations.QuotationClass_3().createNode(trg);
    }

    public String parameterToString(SNode param) {
      return SPropertyOperations.getString(param, "role");
    }

    public SNode getterExpression(SNode expression, SNode param, ITemplateGenerator generator) {
      SNode opExpr = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.DotExpression", null);
      SNode op = null;
      SLinkOperations.setTarget(opExpr, "operand", expression, true);
      Cardinality card = Cardinality.parseValue(SPropertyOperations.getString_def(param, "sourceCardinality", "0..1"));
      if (card == Cardinality._0__1 || card == Cardinality._1) {
        op = SConceptOperations.createNewNode("jetbrains.mps.lang.smodel.structure.SLinkAccess", null);
        SLinkOperations.setTarget(op, "link", param, false);
      } else
      {
        op = SConceptOperations.createNewNode("jetbrains.mps.lang.smodel.structure.SLinkListAccess", null);
        SLinkOperations.setTarget(op, "link", param, false);
      }
      SLinkOperations.setTarget(opExpr, "operation", op, true);
      return opExpr;
    }

    public boolean isSingleTargetCardinality(SNode param) {
      Cardinality card = Cardinality.parseValue(SPropertyOperations.getString_def(param, "sourceCardinality", "0..1"));
      return card == Cardinality._0__1 || card == Cardinality._1;
    }

}
  public static class Design_Feature_allChildren extends IGenericFeatureDesign.Stub implements IGenericFeatureDesign {

    public SNode getterExpression(SNode expression, ITemplateGenerator generator) {
      return new _Quotations.QuotationClass_4().createNode(expression);
    }

}
  public static class Design_Feature_parent extends IGenericFeatureDesign.Stub implements IGenericFeatureDesign {

    public SNode getterExpression(SNode expression, ITemplateGenerator generator) {
      return new _Quotations.QuotationClass_5().createNode(expression);
    }

}

}
