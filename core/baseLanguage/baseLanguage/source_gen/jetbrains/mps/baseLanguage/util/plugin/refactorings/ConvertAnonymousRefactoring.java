package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.LinkedHashMap;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.List;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.baseLanguage.behavior.ClassifierMember_Behavior;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.CopyUtil;

public class ConvertAnonymousRefactoring {
  private static final Set<String> ROLES_NOT_TO_COPY = SetSequence.fromSetAndArray(new HashSet<String>(), "visibility");

  private SNode myClassToRefactor;
  private SNode myInnerClass;
  private String myNameOfClass;
  private SNode mySuperInner;
  private Map<SNode, SNode> myInnerFields = MapSequence.fromMap(new LinkedHashMap<SNode, SNode>(16, (float) 0.75, false));
  private SNode myConstructorInvocation;

  public ConvertAnonymousRefactoring(SNode anonymousClass, String newName) {
    this.myClassToRefactor = anonymousClass;
    this.myNameOfClass = newName;
  }

  public void doRefactor() {
    this.createInnerClass();
    ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(this.myClassToRefactor, "jetbrains.mps.baseLanguage.structure.Classifier", false, false), "staticInnerClassifiers", true)).addElement(this.myInnerClass);
    this.createConstructorInvocation();
    this.addSuperToInner();
    this.addTypeVaryablesToInnerAndSuper();
    SNodeOperations.replaceWithAnother(this.myClassToRefactor, this.myConstructorInvocation);
  }

  private void createInnerClass() {
    this.myInnerClass = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassConcept", null);
    SPropertyOperations.set(this.myInnerClass, "name", this.myNameOfClass);
    SLinkOperations.setTarget(this.myInnerClass, "visibility", SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.PrivateVisibility", null), true);
    this.chooseStaticForInnerClass();
    this.copyChildren(this.myClassToRefactor, this.myInnerClass);
    this.makeInnerConstructor();
    this.createInnerFields();
  }

  private void createConstructorInvocation() {
    this.myConstructorInvocation = new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0a2().createNode(this.getInnerConstructor(), SLinkOperations.getTargets(this.myClassToRefactor, "actualArgument", true));
    ListSequence.fromList(SLinkOperations.getTargets(this.myConstructorInvocation, "actualArgument", true)).addSequence(SetSequence.fromSet(MapSequence.fromMap(this.myInnerFields).keySet()).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0a0a0a0b0c().createNode(it);
      }
    }).toListSequence());
  }

  private void makeInnerConstructor() {
    for (SNode param : ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(this.myClassToRefactor, "baseMethodDeclaration", false), "parameter", true))) {
      ListSequence.fromList(SLinkOperations.getTargets(this.getInnerConstructor(), "parameter", true)).addElement(SNodeOperations.copyNode(param));
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(this.myClassToRefactor, "baseMethodDeclaration", false), "parameter", true)).isNotEmpty()) {
      List<SNode> parameterReferences = ListSequence.fromList(SLinkOperations.getTargets(this.getInnerConstructor(), "parameter", true)).select(new ISelector<SNode, SNode>() {
        public SNode select(SNode it) {
          return new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0a0a0a0a1a3().createNode(it);
        }
      }).toListSequence();
      SNode invocation = new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a1a1a3().createNode(parameterReferences);
      SLinkOperations.setTarget(invocation, "baseMethodDeclaration", SLinkOperations.getTarget(this.myClassToRefactor, "baseMethodDeclaration", false), false);
      ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(this.getInnerConstructor(), "body", true), "statement", true)).insertElement(0, invocation);
    }
  }

  private void copyChildren(SNode from, SNode to) {
    Set<String> toConceptRoles = SetSequence.fromSetWithValues(new HashSet(), ListSequence.fromList(AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(SNodeOperations.getConceptDeclaration(to))).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return SPropertyOperations.getString(it, "role");
      }
    }));
    for (String role : SetSequence.fromSet(from.getChildRoles())) {
      if (SetSequence.fromSet(toConceptRoles).contains(role) && !(SetSequence.fromSet(ROLES_NOT_TO_COPY).contains(role))) {
        for (SNode child : ListSequence.fromList(from.getChildren(role))) {
          to.addChild(role, SNodeOperations.detachNode(((SNode) child)));
        }
      }
    }
  }

  private void chooseStaticForInnerClass() {
    if (SNodeOperations.getAncestor(this.myClassToRefactor, "jetbrains.mps.baseLanguage.structure.ClassifierMember", false, false) != null && ClassifierMember_Behavior.call_isStatic_8986964027630462944(SNodeOperations.getAncestor(this.myClassToRefactor, "jetbrains.mps.baseLanguage.structure.ClassifierMember", false, false))) {
      SPropertyOperations.set(this.myInnerClass, "nonStatic", "" + false);
    } else {
      SPropertyOperations.set(this.myInnerClass, "nonStatic", "" + true);
    }
  }

  private void addSuperToInner() {
    this.mySuperInner = new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0a6().createNode(SLinkOperations.getTarget(this.myClassToRefactor, "classifier", false));
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(this.myClassToRefactor, "classifier", false), "jetbrains.mps.baseLanguage.structure.Interface")) {
      ListSequence.fromList(SLinkOperations.getTargets(this.myInnerClass, "implementedInterface", true)).addElement(this.mySuperInner);
    } else {
      SLinkOperations.setTarget(this.myInnerClass, "superclass", this.mySuperInner, true);
    }
  }

  private void addTypeVaryablesToInnerAndSuper() {
    Map<SNode, SNode> newDeclarations = MapSequence.fromMap(new HashMap<SNode, SNode>());
    Iterable<SNode> typeVariableReferences = ListSequence.fromList(SLinkOperations.getTargets(this.myClassToRefactor, "typeParameter", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.TypeVariableReference");
      }
    });
    for (SNode typeReference : Sequence.fromIterable(typeVariableReferences)) {
      SNode typeDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(typeReference, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), "typeVariableDeclaration", false);
      if (!(MapSequence.fromMap(newDeclarations).containsKey(typeDeclaration))) {
        MapSequence.fromMap(newDeclarations).put(typeDeclaration, SNodeOperations.copyNode(typeDeclaration));
      }
      SNodeOperations.replaceWithAnother(typeReference, new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0c0c0h().createNode(MapSequence.fromMap(newDeclarations).get(typeDeclaration)));
    }
    ListSequence.fromList(SLinkOperations.getTargets(this.myInnerClass, "typeVariableDeclaration", true)).addSequence(Sequence.fromIterable(MapSequence.fromMap(newDeclarations).values()));
    ListSequence.fromList(SLinkOperations.getTargets(this.mySuperInner, "parameter", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(this.myClassToRefactor, "typeParameter", true)));
    for (SNode typeReference : ListSequence.fromList(SNodeOperations.getDescendants(this.myInnerClass, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", false, new String[]{}))) {
      if (MapSequence.fromMap(newDeclarations).containsKey(SLinkOperations.getTarget(typeReference, "typeVariableDeclaration", false))) {
        SNodeOperations.replaceWithAnother(typeReference, new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0a0a0f0h().createNode(MapSequence.fromMap(newDeclarations).get(SLinkOperations.getTarget(typeReference, "typeVariableDeclaration", false))));
      }
    }
  }

  public void createInnerFields() {
    for (SNode varReference : ListSequence.fromList(SNodeOperations.getDescendants(this.myInnerClass, "jetbrains.mps.baseLanguage.structure.LocalVariableReference", false, new String[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return !(ListSequence.fromList(SNodeOperations.getAncestors(SLinkOperations.getTarget(it, "variableDeclaration", false), null, false)).contains(ConvertAnonymousRefactoring.this.myInnerClass));
      }
    })) {
      SNode varDeclaration = SLinkOperations.getTarget(varReference, "variableDeclaration", false);
      if (!(MapSequence.fromMap(this.myInnerFields).containsKey(varDeclaration))) {
        MapSequence.fromMap(this.myInnerFields).put(varDeclaration, this.makeField(varDeclaration));
      }
      SNodeOperations.replaceWithAnother(varReference, new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0c0a0i().createNode(MapSequence.fromMap(this.myInnerFields).get(varDeclaration)));
    }
  }

  private SNode makeField(SNode varDeclaration) {
    SNode newField = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.FieldDeclaration", null);
    SLinkOperations.setTarget(newField, "type", SNodeOperations.copyNode(SLinkOperations.getTarget(varDeclaration, "type", true)), true);
    SPropertyOperations.set(newField, "name", "my" + NameUtil.capitalize(SPropertyOperations.getString(varDeclaration, "name")));
    SPropertyOperations.set(newField, "isFinal", "" + true);
    ListSequence.fromList(SLinkOperations.getTargets(this.myInnerClass, "field", true)).addElement(newField);
    SNode newParam = new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a5a9().createNode(SLinkOperations.getTarget(newField, "type", true), SPropertyOperations.getString(varDeclaration, "name"));
    ListSequence.fromList(SLinkOperations.getTargets(this.getInnerConstructor(), "parameter", true)).addElement(newParam);
    ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(this.getInnerConstructor(), "body", true), "statement", true)).addElement(new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0h0j().createNode(newParam, newField));
    return newField;
  }

  private SNode getInnerConstructor() {
    return ListSequence.fromList(SLinkOperations.getTargets(this.myInnerClass, "constructor", true)).getElement(0);
  }

  public static class QuotationClass_qy1soj_a0a0a2 {
    public QuotationClass_qy1soj_a0a0a2() {
    }

    public SNode createNode(Object parameter_4, Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassCreator", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setReferent("baseMethodDeclaration", (SNode) parameter_4);
        {
          List<SNode> nodes = (List<SNode>) parameter_5;
          for (SNode child : nodes) {
            quotedNode_1.addChild("actualArgument", HUtil.copyIfNecessary(child));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a0a0a0a0b0c {
    public QuotationClass_qy1soj_a0a0a0a0a0b0c() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("variableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a0a0a0a0a1a3 {
    public QuotationClass_qy1soj_a0a0a0a0a0a1a3() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("variableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a1a1a3 {
    public QuotationClass_qy1soj_a0a1a1a3() {
    }

    public SNode createNode(Object parameter_6) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5 = quotedNode_1;
        {
          List<SNode> nodes = (List<SNode>) parameter_6;
          for (SNode child : nodes) {
            quotedNode_1.addChild("actualArgument", HUtil.copyIfNecessary(child));
          }
        }
        result = quotedNode1_5;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a0a6 {
    public QuotationClass_qy1soj_a0a0a6() {
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

  public static class QuotationClass_qy1soj_a0a0c0c0h {
    public QuotationClass_qy1soj_a0a0c0c0h() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.TypeVariableReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("typeVariableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a0a0a0f0h {
    public QuotationClass_qy1soj_a0a0a0a0f0h() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.TypeVariableReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("typeVariableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a0c0a0i {
    public QuotationClass_qy1soj_a0a0c0a0i() {
    }

    public SNode createNode(Object parameter_7) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ThisExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_5 = quotedNode_2;
          quotedNode_1.addChild("operand", quotedNode1_5);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_6 = quotedNode_3;
          quotedNode1_6.setReferent("fieldDeclaration", (SNode) parameter_7);
          quotedNode_1.addChild("operation", quotedNode1_6);
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a5a9 {
    public QuotationClass_qy1soj_a0a5a9() {
    }

    public SNode createNode(Object parameter_5, Object parameter_6) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setProperty("name", (String) parameter_6);
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = CopyUtil.copy(quotedNode_2);
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

  public static class QuotationClass_qy1soj_a0a0h0j {
    public QuotationClass_qy1soj_a0a0h0j() {
    }

    public SNode createNode(Object parameter_13, Object parameter_14) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AssignmentExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_8 = quotedNode_2;
          {
            quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_9 = quotedNode_3;
            quotedNode1_9.setReferent("variableDeclaration", (SNode) parameter_13);
            quotedNode_2.addChild("rValue", quotedNode1_9);
          }
          {
            quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_10 = quotedNode_4;
            {
              quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ThisExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
              SNode quotedNode1_11 = quotedNode_5;
              quotedNode_4.addChild("operand", quotedNode1_11);
            }
            {
              quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
              SNode quotedNode1_12 = quotedNode_6;
              quotedNode1_12.setReferent("fieldDeclaration", (SNode) parameter_14);
              quotedNode_4.addChild("operation", quotedNode1_12);
            }
            quotedNode_2.addChild("lValue", quotedNode1_10);
          }
          quotedNode_1.addChild("expression", quotedNode1_8);
        }
        result = quotedNode1_7;
      }
      return result;
    }
  }
}
