package jetbrains.mps.xmlQuery.misc;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class SchemaUtil {
  public static List<SNode> getAvailableAttributes(SNode complexType) {
    if ((complexType == null)) {
      return new ArrayList<SNode>();
    }

    return getAvailableAttributes(SLinkOperations.getTargets(SLinkOperations.getTarget(complexType, "typeExpressionList", true), "typeExpression", true));
  }

  public static List<SNode> getAvailableAttributes(SNode typeExpression, boolean ignored) {
    if (SNodeOperations.isInstanceOf(typeExpression, "jetbrains.mps.xmlSchema.structure.ComplexContent")) {
      SNode contentItem = SLinkOperations.getTarget(SNodeOperations.cast(typeExpression, "jetbrains.mps.xmlSchema.structure.ComplexContent"), "contentItem", true);
      assert SNodeOperations.isInstanceOf(contentItem, "jetbrains.mps.xmlSchema.structure.Extension");
      SNode extension = SNodeOperations.cast(contentItem, "jetbrains.mps.xmlSchema.structure.Extension");
      SLinkOperations.getTarget(extension, "complexTypeReference", true);

      return getAvailableAttributes(SLinkOperations.getTargets(SLinkOperations.getTarget(extension, "typeExpressionList", true), "typeExpression", true));
    } else if (SNodeOperations.isInstanceOf(typeExpression, "jetbrains.mps.xmlSchema.structure.AttributeDeclaration")) {
      List<SNode> attributes = new ArrayList<SNode>();
      ListSequence.fromList(attributes).addElement(SNodeOperations.cast(typeExpression, "jetbrains.mps.xmlSchema.structure.AttributeDeclaration"));
      return attributes;
    } else if (SNodeOperations.isInstanceOf(typeExpression, "jetbrains.mps.xmlSchema.structure.AttributeGroupReference")) {
      return getAvailableAttributes(SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.cast(typeExpression, "jetbrains.mps.xmlSchema.structure.AttributeGroupReference"), "attributeGroup", false), "attributeExpression", true));
    } else if (SNodeOperations.isInstanceOf(typeExpression, "jetbrains.mps.xmlSchema.structure.GroupExpression")) {
      return new ArrayList<SNode>();
    } else {
      System.out.println("WARNING!!! New type expression: " + SNodeOperations.getConceptDeclaration(typeExpression));
      return new ArrayList<SNode>();
    }
  }

  public static List<SNode> getAvailableAttributes(List<SNode> typeExpressions) {
    List<SNode> attributes = new ArrayList<SNode>();
    for (SNode typeExpression : ListSequence.fromList(typeExpressions)) {
      ListSequence.fromList(attributes).addSequence(ListSequence.fromList(getAvailableAttributes(typeExpression, true)));
    }
    return attributes;
  }

  public static List<SNode> getAvailableChildren(SNode complexType) {
    List<SNode> children = new ArrayList<SNode>();
    ListSequence.fromList(children).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(complexType, "jetbrains.mps.xmlSchema.structure.ElementReference", false, new String[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, "elementDeclaration", false) != null);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "elementDeclaration", false);
      }
    }));
    return children;
  }
}
