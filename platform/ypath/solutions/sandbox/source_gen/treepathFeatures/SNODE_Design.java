package treepathFeatures;

/*Generated by MPS */

import jetbrains.mps.ypath.design.IParameterizedFeatureDesign;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class SNODE_Design {
  public static class Design_Feature_child extends IParameterizedFeatureDesign.Stub<String> implements IParameterizedFeatureDesign<String> {

    public Iterable<String> getParameters(SNode nodeType) {
      return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(nodeType, "concept", false), "linkDeclaration", true)).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return "aggregation".equals(SPropertyOperations.getString_def(it, "metaClass", null));
        }

      }).select(new ISelector <SNode, String>() {

        public String select(SNode it) {
          return SPropertyOperations.getString(it, "role");
        }

      });
    }

    public SNode getTargetType(String param, SNode nodeType) {
      final String _param = param;
      SNode ld = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(nodeType, "concept", false), "linkDeclaration", true)).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return SPropertyOperations.getString(it, "role").equals(_param);
        }

      }).first();
      SNode trg = SLinkOperations.getTarget(ld, "target", false);
      return new QuotationClass_().createNode(trg);
    }

    public String parameterToString(String param) {
      return param;
    }

}
  public static class Design_Feature_link extends IParameterizedFeatureDesign.Stub<String> implements IParameterizedFeatureDesign<String> {

    public Iterable<String> getParameters(SNode nodeType) {
      return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(nodeType, "concept", false), "linkDeclaration", true)).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return SPropertyOperations.getString_def(it, "metaClass", null) == null || "reference".equals(SPropertyOperations.getString_def(it, "metaClass", null));
        }

      }).select(new ISelector <SNode, String>() {

        public String select(SNode it) {
          return SPropertyOperations.getString(it, "role");
        }

      });
    }

    public SNode getTargetType(String param, SNode nodeType) {
      final String _param = param;
      SNode ld = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(nodeType, "concept", false), "linkDeclaration", true)).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return SPropertyOperations.getString(it, "role").equals(_param);
        }

      }).first();
      SNode trg = SLinkOperations.getTarget(ld, "target", false);
      return new QuotationClass_1().createNode(trg);
    }

    public String parameterToString(String param) {
      return param;
    }

}

}
