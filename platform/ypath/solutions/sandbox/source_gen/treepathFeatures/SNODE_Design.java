package treepathFeatures;

/*Generated by MPS */

import jetbrains.mps.ypath.design.IFeatureDesign;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class SNODE_Design {
  public static class Design_Feature_child implements IFeatureDesign<String> {

    public Iterable<String> getParameters(SNode nodeType) {
      return SequenceOperations.select(SequenceOperations.where(SLinkOperations.getTargets(SLinkOperations.getTarget(nodeType, "concept", false), "linkDeclaration", true), new zPredicate(null, null)), new zSelector(null, null));
    }

    public SNode getTargetType(String param, SNode nodeType) {
      final zClosureContext2 _zClosureContext1 = new zClosureContext2();
      _zClosureContext1._param = param;
      SNode ld = SequenceOperations.getFirst(SequenceOperations.where(SLinkOperations.getTargets(SLinkOperations.getTarget(nodeType, "concept", false), "linkDeclaration", true), new zPredicate1(null, _zClosureContext1)));
      SNode trg = SLinkOperations.getTarget(ld, "target", false);
      return new QuotationClass_().createNode(trg);
    }

    public String parameterToString(String param) {
      return param;
    }

}
  public static class Design_Feature_link implements IFeatureDesign<String> {

    public Iterable<String> getParameters(SNode nodeType) {
      return SequenceOperations.select(SequenceOperations.where(SLinkOperations.getTargets(SLinkOperations.getTarget(nodeType, "concept", false), "linkDeclaration", true), new zPredicate2(null, null)), new zSelector1(null, null));
    }

    public SNode getTargetType(String param, SNode nodeType) {
      final zClosureContext3 _zClosureContext2 = new zClosureContext3();
      _zClosureContext2._param = param;
      SNode ld = SequenceOperations.getFirst(SequenceOperations.where(SLinkOperations.getTargets(SLinkOperations.getTarget(nodeType, "concept", false), "linkDeclaration", true), new zPredicate3(null, _zClosureContext2)));
      SNode trg = SLinkOperations.getTarget(ld, "target", false);
      return new QuotationClass_1().createNode(trg);
    }

    public String parameterToString(String param) {
      return param;
    }

}
  public static class Design_Feature_foo implements IFeatureDesign<SNode> {

    public Iterable<SNode> getParameters(SNode nodeType) {
      return SequenceOperations.where(SLinkOperations.getTargets(SLinkOperations.getTarget(nodeType, "concept", false), "linkDeclaration", true), new zPredicate4(null, null));
    }

    public SNode getTargetType(SNode param, SNode nodeType) {
      SNode ld = param;
      SNode trg = SLinkOperations.getTarget(ld, "target", false);
      return new QuotationClass_2().createNode(trg);
    }

    public String parameterToString(SNode param) {
      return SPropertyOperations.getString(param, "role");
    }

}

}
