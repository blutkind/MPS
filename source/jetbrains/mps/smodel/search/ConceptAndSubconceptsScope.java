package jetbrains.mps.smodel.search;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.util.Condition;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration;

import java.util.List;
import java.util.ArrayList;

/**
 * Igor Alshannikov
 * Aug 30, 2007
 */
public class ConceptAndSubconceptsScope extends AbstractSearchScope {
  private ConceptAndSubconceptsCacheHandler myCache = new ConceptAndSubconceptsCacheHandler();
  @Nullable
  private AbstractConceptDeclaration myTopConcept;

  public ConceptAndSubconceptsScope(@Nullable AbstractConceptDeclaration topConcept) {
    myTopConcept = topConcept;
  }

  public List<AbstractConceptDeclaration> getConcepts() {
    if (myTopConcept == null) return new ArrayList<AbstractConceptDeclaration>(1);
    return myCache.getConcepts(myTopConcept);
  }

  public LinkDeclaration getLinkDeclarationByRole(String role) {
    if (myTopConcept == null) return null;
    return myCache.getLinkDeclarationByRole(myTopConcept, role);
  }


  @NotNull
  public List<SNode> getNodes(Condition<SNode> condition) {
    if (myTopConcept == null) return new ArrayList<SNode>(1);
    List<SNode> result = new ArrayList<SNode>();
    // filter by condition
    for (INodeAdapter node : getConcepts()) {
      if (node == null) continue;
      if (condition.met(node.getNode())) {
        result.add(node.getNode());
      }
      result.addAll(node.getNode().getSubnodes(condition));
    }
    return result;
  }
}
