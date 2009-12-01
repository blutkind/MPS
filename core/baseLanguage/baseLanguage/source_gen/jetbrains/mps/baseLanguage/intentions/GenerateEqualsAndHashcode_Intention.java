package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.GenerateIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class GenerateEqualsAndHashcode_Intention extends GenerateIntention {
  public GenerateEqualsAndHashcode_Intention() {
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "equals() and hashCode()";
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    SNode classConcept = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept");
    return !(ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode method) {
        return "equals".equals(SPropertyOperations.getString(method, "name")) && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, "returnType", true), "jetbrains.mps.baseLanguage.structure.BooleanType");
      }
    })) && ListSequence.fromList(SLinkOperations.getTargets(classConcept, "field", true)).isNotEmpty();
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    final SNode classConcept = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept");
    final List<SNode> fields = SLinkOperations.getTargets(classConcept, "field", true);
    final SNode thisExp = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
    final SNode equalsDeclaration = new _Quotations.QuotationClass_16().createNode(thisExp, thisExp, classConcept, classConcept);
    SNode thatDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(equalsDeclaration, "body", true), "statement", true)).last(), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"), "localVariableDeclaration", true);

    SNode thatRef = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableReference", null);
    SLinkOperations.setTarget(thatRef, "variableDeclaration", thatDeclaration, false);
    SNode fieldRefOperation = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", null);
    for (SNode field : fields) {
      SLinkOperations.setTarget(fieldRefOperation, "fieldDeclaration", field, false);
      SNode checkStmt;
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(field, "type", true), "jetbrains.mps.baseLanguage.structure.PrimitiveType")) {
        if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(field, "type", true), "jetbrains.mps.baseLanguage.structure.FloatType")) {
          checkStmt = new _Quotations.QuotationClass_22().createNode(thatRef, SNodeOperations.copyNode(fieldRefOperation), thisExp, SNodeOperations.copyNode(fieldRefOperation));
        } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(field, "type", true), "jetbrains.mps.baseLanguage.structure.DoubleType")) {
          checkStmt = new _Quotations.QuotationClass_23().createNode(thatRef, SNodeOperations.copyNode(fieldRefOperation), thisExp, SNodeOperations.copyNode(fieldRefOperation));
        } else {
          checkStmt = new _Quotations.QuotationClass_15().createNode(thatRef, SNodeOperations.copyNode(fieldRefOperation), thisExp, SNodeOperations.copyNode(fieldRefOperation));
        }
      } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(field, "type", true), "jetbrains.mps.baseLanguage.structure.ArrayType")) {
        checkStmt = new _Quotations.QuotationClass_12().createNode(thisExp, SNodeOperations.copyNode(fieldRefOperation), thatRef, SNodeOperations.copyNode(fieldRefOperation));
      } else {
        checkStmt = new _Quotations.QuotationClass_13().createNode(thatRef, SNodeOperations.copyNode(fieldRefOperation), thisExp, SNodeOperations.copyNode(fieldRefOperation), thisExp, SNodeOperations.copyNode(fieldRefOperation), thatRef, SNodeOperations.copyNode(fieldRefOperation));
      }
      SLinkOperations.addChild(SLinkOperations.getTarget(equalsDeclaration, "body", true), "statement", checkStmt);
    }
    SLinkOperations.addNewChild(SLinkOperations.getTarget(equalsDeclaration, "body", true), "statement", "jetbrains.mps.baseLanguage.structure.Statement");
    SLinkOperations.addChild(SLinkOperations.getTarget(equalsDeclaration, "body", true), "statement", new _Quotations.QuotationClass_39().createNode());
    SLinkOperations.addChild(classConcept, "method", equalsDeclaration);
    // Method equals() is generated, now hashCode method body generation begins  
    SNode hashCodeDeclaration = SLinkOperations.addChild(classConcept, "method", new _Quotations.QuotationClass_35().createNode());
    SNode resultDeclaration = new _Quotations.QuotationClass_10().createNode();
    SNode resultReference = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableReference", null);
    SLinkOperations.setTarget(resultReference, "variableDeclaration", SLinkOperations.getTarget(resultDeclaration, "localVariableDeclaration", true), false);
    SNode tempDeclaration = new _Quotations.QuotationClass_24().createNode();
    SNode tempReference = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableReference", null);
    SLinkOperations.setTarget(tempReference, "variableDeclaration", SLinkOperations.getTarget(tempDeclaration, "localVariableDeclaration", true), false);
    if (ListSequence.fromList(SLinkOperations.getTargets(classConcept, "field", true)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(it, "type", true), "jetbrains.mps.baseLanguage.structure.DoubleType");
      }
    })) {
      SLinkOperations.addChild(SLinkOperations.getTarget(hashCodeDeclaration, "body", true), "statement", tempDeclaration);
    }
    SLinkOperations.addChild(SLinkOperations.getTarget(hashCodeDeclaration, "body", true), "statement", resultDeclaration);
    int i = 239;
    for (final SNode field : fields) {
      SLinkOperations.setTarget(fieldRefOperation, "fieldDeclaration", field, false);
      SNode calcStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.Statement", null);
      SNode plusExpression = new _Quotations.QuotationClass_28().createNode(resultReference);
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(field, "type", true), "jetbrains.mps.baseLanguage.structure.IntegerType")) {
        calcStatement = new _Quotations.QuotationClass_34().createNode(resultReference, thisExp, field, plusExpression);
      } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(field, "type", true), "jetbrains.mps.baseLanguage.structure.ByteType") || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(field, "type", true), "jetbrains.mps.baseLanguage.structure.CharType")) {
        calcStatement = new _Quotations.QuotationClass_27().createNode(thisExp, fieldRefOperation, plusExpression, resultReference);
      } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(field, "type", true), "jetbrains.mps.baseLanguage.structure.DoubleType")) {
        SLinkOperations.addChild(SLinkOperations.getTarget(hashCodeDeclaration, "body", true), "statement", new _Quotations.QuotationClass_26().createNode(tempReference, thisExp, fieldRefOperation, thisExp, fieldRefOperation));
        calcStatement = new _Quotations.QuotationClass_25().createNode(resultReference, plusExpression, tempReference, tempReference);
      } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(field, "type", true), "jetbrains.mps.baseLanguage.structure.FloatType")) {
        calcStatement = new _Quotations.QuotationClass_40().createNode(resultReference, plusExpression, thisExp, field, thisExp, field);
      } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(field, "type", true), "jetbrains.mps.baseLanguage.structure.StringType")) {
        calcStatement = new _Quotations.QuotationClass_41().createNode(resultReference, plusExpression, fieldRefOperation, fieldRefOperation);
      } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(field, "type", true), "jetbrains.mps.baseLanguage.structure.ArrayType")) {
        calcStatement = new _Quotations.QuotationClass_42().createNode(plusExpression, thisExp, fieldRefOperation, thisExp, fieldRefOperation, resultReference);
      } else {
        calcStatement = new _Quotations.QuotationClass_43().createNode(thisExp, fieldRefOperation, thisExp, fieldRefOperation, plusExpression, resultReference);
      }
      SLinkOperations.addChild(SLinkOperations.getTarget(hashCodeDeclaration, "body", true), "statement", calcStatement);
    }
    SLinkOperations.addChild(SLinkOperations.getTarget(hashCodeDeclaration, "body", true), "statement", new _Quotations.QuotationClass_11().createNode(resultReference));
  }

  public boolean executeUI(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }
}
