package jetbrains.mps.lang.smodel.generator.smodelAdapter;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.smodel.search.SModelSearchUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class SConceptPropertyOperations {
  public SConceptPropertyOperations() {
  }

  public static String getString(SNode node, String propertyName) {
    if (node == null) {
      return null;
    }
    SNode conceptProperty = (SNode) node.findConceptProperty(propertyName);
    if (SNodeOperations.isInstanceOf(conceptProperty, "jetbrains.mps.lang.structure.structure.StringConceptProperty")) {
      return SPropertyOperations.getString(SNodeOperations.cast(conceptProperty, "jetbrains.mps.lang.structure.structure.StringConceptProperty"), "value");
    }
    return null;
  }

  public static int getInteger(SNode node, String propertyName) {
    if (node == null) {
      return 0;
    }
    SNode conceptProperty = (SNode) node.findConceptProperty(propertyName);
    if (SNodeOperations.isInstanceOf(conceptProperty, "jetbrains.mps.lang.structure.structure.IntegerConceptProperty")) {
      return SPropertyOperations.getInteger(SNodeOperations.cast(conceptProperty, "jetbrains.mps.lang.structure.structure.IntegerConceptProperty"), "value");
    }
    return 0;
  }

  public static boolean getBoolean(SNode node, String propertyName) {
    if (node == null) {
      return false;
    }
    SNode conceptProperty = (SNode) node.findConceptProperty(propertyName);
    return SNodeOperations.isInstanceOf(conceptProperty, "jetbrains.mps.lang.structure.structure.BooleanConceptProperty");
  }

  public static void setString(SNode node, String propertyName, String value) {
    if (node != null) {
      SNode conceptProperty = (SNode) node.findConceptProperty(propertyName);
      if (SNodeOperations.isInstanceOf(conceptProperty, "jetbrains.mps.lang.structure.structure.StringConceptProperty")) {
        SPropertyOperations.set(SNodeOperations.cast(conceptProperty, "jetbrains.mps.lang.structure.structure.StringConceptProperty"), "value", value);
      }
    }
  }

  public static void setInteger(SNode node, String propertyName, int value) {
    if (node != null) {
      SNode conceptProperty = (SNode) node.findConceptProperty(propertyName);
      if (SNodeOperations.isInstanceOf(conceptProperty, "jetbrains.mps.lang.structure.structure.IntegerConceptProperty")) {
        SPropertyOperations.set(SNodeOperations.cast(conceptProperty, "jetbrains.mps.lang.structure.structure.IntegerConceptProperty"), "value", "" + value);
      }
    }
  }

  public static void setBoolean(SNode node, String propertyName, boolean value) {
    if (node != null) {
      SNode conceptProperty = (SNode) node.findConceptProperty(propertyName);
      if (SNodeOperations.isInstanceOf(conceptProperty, "jetbrains.mps.lang.structure.structure.BooleanConceptProperty") && !(value)) {
        node.removeChild(conceptProperty);
      } else
      if (conceptProperty == null && value) {
        for (SNode cpd : (List<SNode>) SModelSearchUtil.getConceptPropertyDeclarations(node)) {
          if (SPropertyOperations.getString(cpd, "name").equals(propertyName)) {
            if (SNodeOperations.isInstanceOf(cpd, "jetbrains.mps.lang.structure.structure.BooleanConceptPropertyDeclaration")) {
              SNode bcp = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.lang.structure.structure.BooleanConceptProperty", null);
              SLinkOperations.setTarget(bcp, "conceptPropertyDeclaration", SNodeOperations.cast(cpd, "jetbrains.mps.lang.structure.structure.BooleanConceptPropertyDeclaration"), false);
              ListSequence.fromList(SLinkOperations.getTargets(node, "conceptProperty", true)).addElement(bcp);
              break;
            }
          }
        }
      }
    }
  }
}
