package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JComponent;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.baseLanguage.behavior.Expression_Behavior;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.baseLanguage.behavior.Type_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.baseLanguage.behavior.IInternalType_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public abstract class IntroduceVariableRefactoring {
  private String myName;
  private SNode myExpression;
  private SNode myExpressionType;
  private List<String> myExpectedNames;
  protected List<SNode> myDuplicates = new ArrayList<SNode>();

  public String init(SNode node, JComponent editorComponent) {
    SNode expressionType = this.getExpressionType(node);
    if (!(SNodeOperations.isInstanceOf(expressionType, "jetbrains.mps.baseLanguage.structure.Type"))) {
      return "Couldn't compute type of expression: " + expressionType;
    } else
    if (this.isVoidType(expressionType)) {
      return "Expression has no type";
    } else {
      this.myExpression = node;
      this.myExpressionType = SNodeOperations.cast(expressionType, "jetbrains.mps.baseLanguage.structure.Type");
      Set<String> expectedNames = SetSequence.fromSet(new HashSet<String>());
      String expectedVariableName = Expression_Behavior.call_getVariableExpectedName_1213877519781(node);
      if (expectedVariableName != null) {
        SetSequence.fromSet(expectedNames).addElement(NameUtil.decapitalize(expectedVariableName));
      }
      List<String> variableSuffixes = Type_Behavior.call_getVariableSuffixes_1213877337304(SNodeOperations.cast(expressionType, "jetbrains.mps.baseLanguage.structure.Type"));
      if (variableSuffixes != null) {
        SetSequence.fromSet(expectedNames).addSequence(ListSequence.fromList(variableSuffixes));
      }
      this.myExpectedNames = SetSequence.fromSet(expectedNames).where(new IWhereFilter<String>() {
        public boolean accept(String it) {
          return it.matches("[a-zA-Z0-9_]*");
        }
      }).toListSequence();
      if (ListSequence.fromList(this.myExpectedNames).isEmpty()) {
        ListSequence.fromList(this.myExpectedNames).addElement("");
      }
      return null;
    }
  }

  private SNode getExpressionType(SNode node) {
    SNode expressionType = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(node), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.Type"), true);
    if (SNodeOperations.isInstanceOf(expressionType, "jetbrains.mps.baseLanguage.structure.IInternalType")) {
      expressionType = IInternalType_Behavior.call_getPublicType_1213877443338(SNodeOperations.cast(expressionType, "jetbrains.mps.baseLanguage.structure.IInternalType"));
    }
    if (SNodeOperations.isInstanceOf(expressionType, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      SNode exprClassifier = SLinkOperations.getTarget(SNodeOperations.cast(expressionType, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false);
      if (SNodeOperations.isInstanceOf(exprClassifier, "jetbrains.mps.baseLanguage.structure.AnonymousClass")) {
        List<SNode> params = SLinkOperations.getTargets(SNodeOperations.cast(expressionType, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true);
        expressionType = new IntroduceVariableRefactoring.QuotationClass_x65dk2_a0a1a1a2a1().createNode(SLinkOperations.getTarget(SNodeOperations.cast(exprClassifier, "jetbrains.mps.baseLanguage.structure.AnonymousClass"), "classifier", false));
        ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(expressionType, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true)).addSequence(ListSequence.fromList(params));
      }
    }
    return expressionType;
  }

  public void setName(String name) {
    this.myName = name;
  }

  public String getName() {
    return this.myName;
  }

  public SNode getExpression() {
    return this.myExpression;
  }

  public SNode getExpressionType() {
    return this.myExpressionType;
  }

  public List<String> getExpectedNames() {
    return this.myExpectedNames;
  }

  public abstract void replaceNode(SNode node, SNode declaration);

  public List<SNode> getDuplicates() {
    return this.myDuplicates;
  }

  protected void findDuplicates() {
    this.myDuplicates = new SimpleDuplicatesFinder(this.getExpression()).findDuplicates(this.getRootToFindDuplicates(this.getExpression()));
    this.myDuplicates = ListSequence.fromList(this.myDuplicates).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return !(SNodeOperations.isInstanceOf(SNodeOperations.getParent(it), "jetbrains.mps.baseLanguage.structure.ExpressionStatement"));
      }
    }).toListSequence();
  }

  protected SNode getRootToFindDuplicates(SNode node) {
    return SNodeOperations.getContainingRoot(node);
  }

  public abstract SNode doRefactoring();

  protected boolean isVoidType(SNode expressionType) {
    return SNodeOperations.isInstanceOf(expressionType, "jetbrains.mps.baseLanguage.structure.VoidType");
  }

  public static class QuotationClass_x65dk2_a0a1a1a2a1 {
    public QuotationClass_x65dk2_a0a1a1a2a1() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
