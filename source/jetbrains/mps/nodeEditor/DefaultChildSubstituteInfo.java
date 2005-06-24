package jetbrains.mps.nodeEditor;

/*Generated by MPS*/

import jetbrains.mps.bootstrap.structureLanguage.Cardinality;
import jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.bootstrap.structureLanguage.LinkMetaclass;
import jetbrains.mps.semanticModel.SModelUtil;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.semanticModel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.semanticModel.action.INodeSubstituteAction;
import jetbrains.mps.semanticModel.action.ModelActions;
import jetbrains.mps.util.Condition;

import java.util.LinkedList;
import java.util.List;

public class DefaultChildSubstituteInfo extends AbstractNodeSubstituteInfo {
  private SemanticNode mySourceNode;
  private SemanticNode myCurrentTargetNode;
  private LinkDeclaration myLinkDeclaration;


  public DefaultChildSubstituteInfo(SemanticNode sourceNode, LinkDeclaration linkDeclaration) {
    if (SModelUtil.getGenuineLinkMetaclass(linkDeclaration) != LinkMetaclass.aggregation) {
      throw new RuntimeException("Only aggregation links are allowed here.");
    }
    Cardinality sourceCardinality = SModelUtil.getGenuineLinkSourceCardinality(linkDeclaration);
    if (!(sourceCardinality == Cardinality._1 || sourceCardinality == Cardinality._0_1)) {
      throw new RuntimeException("Only cardinalities 1 or 0..1 are allowed here.");
    }

    mySourceNode = sourceNode;
    myLinkDeclaration = linkDeclaration;
    myCurrentTargetNode = sourceNode.getChild(SModelUtil.getGenuineLinkRole(linkDeclaration));
  }

  public DefaultChildSubstituteInfo(SemanticNode parentNode, SemanticNode currChildNode, LinkDeclaration linkDeclaration) {
    if (SModelUtil.getGenuineLinkMetaclass(linkDeclaration) != LinkMetaclass.aggregation) {
      throw new RuntimeException("Only aggregation links are allowed here.");
    }
    mySourceNode = parentNode;
    myLinkDeclaration = linkDeclaration;
    myCurrentTargetNode = currChildNode;
  }

  public List<INodeSubstituteItem> createActions() {
    List<INodeSubstituteAction> defaultActions = createActions_default();
    List<INodeSubstituteAction> actions = ModelActions.createNodeSubstituteActions(mySourceNode, myCurrentTargetNode, myLinkDeclaration, defaultActions);
    return (List<INodeSubstituteItem>) ((List) actions);
  }

  public List<INodeSubstituteAction> createActions_default() {
    List<INodeSubstituteAction> list = new LinkedList<INodeSubstituteAction>();

    List<ConceptDeclaration> childTypes = createChildTypesList();
    for (final ConceptDeclaration childType : childTypes) {
      list.add(new DefaultChildNodeSubstituteAction(childType, mySourceNode, myCurrentTargetNode, myLinkDeclaration) {
        public String getDescriptionText(String pattern) {
          return childType.getModel().getFQName();
        }
      });
    }

    return list;
  }

  private List<ConceptDeclaration> createChildTypesList() {
    final ConceptDeclaration targetType = myLinkDeclaration.getTarget();
    List<ConceptDeclaration> list = SModelUtil.allConceptDeclarations(mySourceNode.getModel(), new Condition<ConceptDeclaration>() {
              public boolean met(ConceptDeclaration node) {
                if (!SModelUtil.hasConceptProperty(node, "abstract")) {
                  return SModelUtil.isAssignableType(targetType, node);
                }
                return false;
              }
            });
    return list;
  }
}
