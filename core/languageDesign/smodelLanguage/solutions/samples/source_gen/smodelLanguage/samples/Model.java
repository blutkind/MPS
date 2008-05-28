package smodelLanguage.samples;

/*Generated by MPS */

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.IScope;

public class Model {

  public void model_long_name(SModel model) {
    String name = SModelOperations.getModelName(model);
  }

  public void new_node_1(SModel model) {
    SNode new_stmt = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.IfStatement", null);
    SNode new_class = SModelOperations.createNewRootNode(model, "jetbrains.mps.baseLanguage.structure.ClassConcept", null);
    SModelOperations.addRootNode(model, SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.Statement", null));
    SModelOperations.addRootNode(model, SConceptOperations.createNewNode(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Statement")), null));
  }

  public void roots_access_1(SModel model) {
    List<SNode> roots1 = SModelOperations.getRoots(model, null);
    List<SNode> roots2 = SModelOperations.getRoots(model, "jetbrains.mps.baseLanguage.structure.ClassConcept");
    Iterable<SNode> roots3 = ListSequence.fromList(SModelOperations.getRoots(model, "jetbrains.mps.baseLanguage.structure.ClassConcept")).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode c) {
        return SPropertyOperations.hasValue(c, "name", "Utils");
      }

    });
  }

  public void roots_access_2(SModel model, IScope scope) {
    SModelOperations.getRootsIncludingImported(model, scope, "jetbrains.mps.baseLanguage.structure.IfStatement");
  }

  public void nodes_access_1(SModel model) {
    List<SNode> nodes1 = SModelOperations.getNodes(model, null);
    List<SNode> nodes2 = SModelOperations.getNodes(model, "jetbrains.mps.baseLanguage.structure.ClassConcept");
    Iterable<SNode> nodes3 = ListSequence.fromList(SModelOperations.getNodes(model, "jetbrains.mps.baseLanguage.structure.ClassConcept")).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode c) {
        return SPropertyOperations.hasValue(c, "name", "Utils");
      }

    });
  }

}
