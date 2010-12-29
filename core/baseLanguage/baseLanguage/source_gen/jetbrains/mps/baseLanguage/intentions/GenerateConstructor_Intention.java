package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.GenerateIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.intentions.IntentionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import com.intellij.openapi.project.Project;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.awt.Frame;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class GenerateConstructor_Intention extends GenerateIntention implements Intention {
  public GenerateConstructor_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Constructor";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext, IntentionContext intentionContext) {
    SNode classConcept = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept");
    SNode constructorDeclaration = null;
    Project project = editorContext.getOperationContext().getProject();
    for (SNode selectedSuperConstructor : ((List<SNode>) intentionContext.getContextParametersMap().get("selectedConstructors"))) {
      SNode constructor = SLinkOperations.addNewChild(classConcept, "constructor", "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration");
      constructorDeclaration = constructor;
      SLinkOperations.setNewChild(constructor, "body", "jetbrains.mps.baseLanguage.structure.StatementList");
      if (ListSequence.fromList(SLinkOperations.getTargets(selectedSuperConstructor, "parameter", true)).isNotEmpty()) {
        SNode invocation = SLinkOperations.addNewChild(SLinkOperations.getTarget(constructor, "body", true), "statement", "jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation");
        SLinkOperations.setTarget(invocation, "baseMethodDeclaration", selectedSuperConstructor, false);
        for (SNode superParam : SLinkOperations.getTargets(selectedSuperConstructor, "parameter", true)) {
          SNode parameter = SLinkOperations.addNewChild(constructor, "parameter", "jetbrains.mps.baseLanguage.structure.ParameterDeclaration");
          SPropertyOperations.set(parameter, "name", SPropertyOperations.getString(superParam, "name"));
          SLinkOperations.setTarget(parameter, "type", SNodeOperations.copyNode(SLinkOperations.getTarget(superParam, "type", true)), true);
          SNode paramReference = SLinkOperations.addNewChild(invocation, "actualArgument", "jetbrains.mps.baseLanguage.structure.ParameterReference");
          SLinkOperations.setTarget(paramReference, "variableDeclaration", parameter, false);
        }
      }
      for (SNode field : ((List<SNode>) intentionContext.getContextParametersMap().get("selectedFields"))) {
        SNode parameterDeclaration = new GenerateConstructor_Intention.QuotationClass_mrvrtl_a0a0a4a3a7().createNode(SNodeOperations.copyNode(SLinkOperations.getTarget(field, "type", true)), GenerateGettersAndSettersUtil.getParameterNameForField(field, project));
        ListSequence.fromList(SLinkOperations.getTargets(constructor, "parameter", true)).addElement(parameterDeclaration);
        SNode expressionStatement = SLinkOperations.addNewChild(SLinkOperations.getTarget(constructor, "body", true), "statement", "jetbrains.mps.baseLanguage.structure.ExpressionStatement");
        SNode assignmentExpression = SLinkOperations.setNewChild(expressionStatement, "expression", "jetbrains.mps.baseLanguage.structure.AssignmentExpression");
        SLinkOperations.setTarget(assignmentExpression, "lValue", new GenerateConstructor_Intention.QuotationClass_mrvrtl_a2a4a4a3a7().createNode(field), true);
        SLinkOperations.setTarget(assignmentExpression, "rValue", new GenerateConstructor_Intention.QuotationClass_mrvrtl_a2a5a4a3a7().createNode(parameterDeclaration), true);
      }
    }
    if (constructorDeclaration != null) {
      editorContext.select(constructorDeclaration);
    }
  }

  public boolean executeUI(final SNode node, final EditorContext editorContext, final IntentionContext intentionContext) {
    Frame frame = editorContext.getMainFrame();
    final Wrappers._T<SNode> superclass = new Wrappers._T<SNode>(null);
    final Wrappers._boolean needsShowConstructorsDialog = new Wrappers._boolean(false);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        superclass.value = SNodeOperations.as(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "superclass", true), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept");
        if (superclass.value == null) {
          superclass.value = SNodeOperations.getNode("f:java_stub#java.lang(java.lang@java_stub)", "~Object");
        }
        if (ListSequence.fromList(SLinkOperations.getTargets(superclass.value, "constructor", true)).count() > 1) {
          needsShowConstructorsDialog.value = true;
        } else {
          intentionContext.getContextParametersMap().put("selectedConstructors", new ArrayList<SNode>());
          ListSequence.fromList(((List<SNode>) intentionContext.getContextParametersMap().get("selectedConstructors"))).addElement(ListSequence.fromList(SLinkOperations.getTargets(superclass.value, "constructor", true)).first());
        }
      }
    });
    if (needsShowConstructorsDialog.value) {
      SelectConstructorsDialog selectConstructorsDialog = new SelectConstructorsDialog(editorContext, frame, superclass.value);
      selectConstructorsDialog.showDialog();
      if (!(selectConstructorsDialog.getAnswer())) {
        return false;
      }
      intentionContext.getContextParametersMap().put("selectedConstructors", selectConstructorsDialog.getSelectedMembers());
    }
    final Wrappers._boolean needsShowFieldsDialog = new Wrappers._boolean(false);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        if (ListSequence.fromList(SLinkOperations.getTargets(node, "field", true)).isNotEmpty()) {
          needsShowFieldsDialog.value = true;
        } else {
          intentionContext.getContextParametersMap().put("selectedFields", new ArrayList<SNode>());
        }
      }
    });
    if (needsShowFieldsDialog.value) {
      SelectFieldsDialog selectFieldsDialog = new SelectFieldsDialog(editorContext, frame, node);
      selectFieldsDialog.showDialog();
      intentionContext.getContextParametersMap().put("selectedFields", selectFieldsDialog.getSelectedFields());
      return selectFieldsDialog.getAnswer();
    } else {
      return true;
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public static class QuotationClass_mrvrtl_a0a0a4a3a7 {
    public QuotationClass_mrvrtl_a0a0a4a3a7() {
    }

    public SNode createNode(Object parameter_5, Object parameter_6) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setProperty("name", (String) parameter_6);
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = HUtil.copyIfNecessary(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("type", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }

  public static class QuotationClass_mrvrtl_a2a4a4a3a7 {
    public QuotationClass_mrvrtl_a2a4a4a3a7() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("variableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_mrvrtl_a2a5a4a3a7 {
    public QuotationClass_mrvrtl_a2a5a4a3a7() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("variableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
