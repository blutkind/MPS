package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.GenerateIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.IntentionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class GenerateGettersAndSetters_Intention extends GenerateIntention implements Intention {
  public GenerateGettersAndSetters_Intention() {
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
    return "Getters and Setters";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    List<SNode> fields = SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "field", true);
    if (ListSequence.fromList(fields).isEmpty()) {
      return false;
    }
    boolean allGettersImplemented = true;
    for (SNode fieldDeclaration : fields) {
      boolean hasCurrentFieldGetter = false;
      final String getterName = GenerateGettersAndSettersUtil.getFieldGetterName(fieldDeclaration);
      if (ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "method", true)).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return getterName.equals(SPropertyOperations.getString(it, "name")) && ListSequence.fromList(SLinkOperations.getTargets(it, "parameter", true)).isEmpty();
        }
      })) {
        hasCurrentFieldGetter = true;
      }
      if (!(hasCurrentFieldGetter)) {
        allGettersImplemented = false;
        break;
      }
    }
    if (!(allGettersImplemented)) {
      return true;
    } else {
      boolean hasAllSetters = true;
      for (SNode field : fields) {
        final String setterName = GenerateGettersAndSettersUtil.getFieldSetterName(field);
        boolean hasCurrentFieldSetter = false;
        if (ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "method", true)).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return setterName.equals(SPropertyOperations.getString(it, "name")) && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(it, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType");
          }
        })) {
          hasCurrentFieldSetter = true;
        }
        if (!(hasCurrentFieldSetter)) {
          hasAllSetters = false;
          break;
        }
      }
      return !(hasAllSetters);
    }
  }

  public void execute(final SNode node, final EditorContext editorContext, IntentionContext intentionContext) {
    SNode classConcept = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept");
    final SNode thisExpression = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
    SNode lastAdded = null;
    for (final SNode field : ((List<SNode>) intentionContext.getContextParametersMap().get("selectedFields"))) {
      final String getterName = GenerateGettersAndSettersUtil.getFieldGetterName(field);
      final Wrappers._boolean getterIsAbsent = new Wrappers._boolean(true);
      ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).visitAll(new IVisitor<SNode>() {
        public void visit(SNode it) {
          if (getterName.equals(SPropertyOperations.getString(it, "name")) && ListSequence.fromList(SLinkOperations.getTargets(it, "parameter", true)).isEmpty()) {
            getterIsAbsent.value = false;
          }
        }
      });
      if (!(getterIsAbsent.value)) {
        continue;
      }
      lastAdded = ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).addElement(new GenerateGettersAndSetters_Intention.QuotationClass_7565_0().createNode(SLinkOperations.getTarget(field, "type", true), thisExpression, field, getterName));

      final String setterName = GenerateGettersAndSettersUtil.getFieldSetterName(field);
      final Wrappers._boolean setterIsAbsent = new Wrappers._boolean(true);
      ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).visitAll(new IVisitor<SNode>() {
        public void visit(SNode method) {
          if (setterName.equals(SPropertyOperations.getString(method, "name")) && ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).count() == 1) {
            setterIsAbsent.value = false;
          }
        }
      });
      if (!(setterIsAbsent.value)) {
        continue;
      }
      lastAdded = ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).addElement(new GenerateGettersAndSetters_Intention.QuotationClass_7565_1().createNode(thisExpression, field, SLinkOperations.getTarget(field, "type", true), SPropertyOperations.getString(field, "name"), setterName));
    }
    if (lastAdded != null) {
      editorContext.select(lastAdded);
    }
  }

  public boolean executeUI(final SNode node, final EditorContext editorContext, IntentionContext intentionContext) {
    SelectFieldsDialog selectFieldsDialog = new SelectFieldsDialog(editorContext, editorContext.getOperationContext().getMainFrame(), node);
    selectFieldsDialog.showDialog();
    intentionContext.getContextParametersMap().put("selectedFields", selectFieldsDialog.getSelectedFields());
    return selectFieldsDialog.getAnswer();
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public static class QuotationClass_7565_0 {
    public QuotationClass_7565_0() {
    }

    public SNode createNode(Object parameter_7904_0, Object parameter_7904_1, Object parameter_7904_2, Object parameter_7904_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_371 = null;
      SNode quotedNode_372 = null;
      SNode quotedNode_373 = null;
      SNode quotedNode_374 = null;
      SNode quotedNode_375 = null;
      SNode quotedNode_376 = null;
      SNode quotedNode_377 = null;
      SNode quotedNode_378 = null;
      {
        quotedNode_371 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_371 = quotedNode_371;
        quotedNode1_371.setProperty("name", (String) parameter_7904_3);
        {
          quotedNode_372 = (SNode) parameter_7904_0;
          SNode quotedNode1_372;
          if (_parameterValues_129834374.contains(quotedNode_372)) {
            quotedNode1_372 = CopyUtil.copy(quotedNode_372);
          } else {
            _parameterValues_129834374.add(quotedNode_372);
            quotedNode1_372 = quotedNode_372;
          }
          if (quotedNode1_372 != null) {
            quotedNode_371.addChild("returnType", HUtil.copyIfNecessary(quotedNode1_372));
          }
        }
        {
          quotedNode_373 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_373 = quotedNode_373;
          quotedNode_371.addChild("visibility", quotedNode1_373);
        }
        {
          quotedNode_374 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_374 = quotedNode_374;
          {
            quotedNode_375 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_375 = quotedNode_375;
            {
              quotedNode_376 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
              SNode quotedNode1_376 = quotedNode_376;
              {
                quotedNode_377 = (SNode) parameter_7904_1;
                SNode quotedNode1_377;
                if (_parameterValues_129834374.contains(quotedNode_377)) {
                  quotedNode1_377 = CopyUtil.copy(quotedNode_377);
                } else {
                  _parameterValues_129834374.add(quotedNode_377);
                  quotedNode1_377 = quotedNode_377;
                }
                if (quotedNode1_377 != null) {
                  quotedNode_376.addChild("operand", HUtil.copyIfNecessary(quotedNode1_377));
                }
              }
              {
                quotedNode_378 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
                SNode quotedNode1_378 = quotedNode_378;
                quotedNode1_378.setReferent("fieldDeclaration", (SNode) parameter_7904_2);
                quotedNode_376.addChild("operation", quotedNode1_378);
              }
              quotedNode_375.addChild("expression", quotedNode1_376);
            }
            quotedNode_374.addChild("statement", quotedNode1_375);
          }
          quotedNode_371.addChild("body", quotedNode1_374);
        }
        result = quotedNode1_371;
      }
      return result;
    }
  }

  public static class QuotationClass_7565_1 {
    public QuotationClass_7565_1() {
    }

    public SNode createNode(Object parameter_7904_4, Object parameter_7904_5, Object parameter_7904_6, Object parameter_7904_7, Object parameter_7904_8) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_379 = null;
      SNode quotedNode_380 = null;
      SNode quotedNode_381 = null;
      SNode quotedNode_382 = null;
      SNode quotedNode_383 = null;
      SNode quotedNode_384 = null;
      SNode quotedNode_385 = null;
      SNode quotedNode_386 = null;
      SNode quotedNode_387 = null;
      SNode quotedNode_388 = null;
      SNode quotedNode_389 = null;
      SNode quotedNode_390 = null;
      {
        quotedNode_379 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_379 = quotedNode_379;
        quotedNode1_379.setProperty("name", (String) parameter_7904_8);
        {
          quotedNode_380 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_380 = quotedNode_380;
          quotedNode_379.addChild("returnType", quotedNode1_380);
        }
        {
          quotedNode_381 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_381 = quotedNode_381;
          quotedNode_379.addChild("visibility", quotedNode1_381);
        }
        {
          quotedNode_382 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_382 = quotedNode_382;
          {
            quotedNode_384 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_383 = quotedNode_384;
            {
              quotedNode_386 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AssignmentExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
              SNode quotedNode1_384 = quotedNode_386;
              {
                quotedNode_387 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
                SNode quotedNode1_385 = quotedNode_387;
                quotedNode_386.addChild("rValue", quotedNode1_385);
              }
              {
                quotedNode_388 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
                SNode quotedNode1_386 = quotedNode_388;
                {
                  quotedNode_389 = (SNode) parameter_7904_4;
                  SNode quotedNode1_387;
                  if (_parameterValues_129834374.contains(quotedNode_389)) {
                    quotedNode1_387 = CopyUtil.copy(quotedNode_389);
                  } else {
                    _parameterValues_129834374.add(quotedNode_389);
                    quotedNode1_387 = quotedNode_389;
                  }
                  if (quotedNode1_387 != null) {
                    quotedNode_388.addChild("operand", HUtil.copyIfNecessary(quotedNode1_387));
                  }
                }
                {
                  quotedNode_390 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
                  SNode quotedNode1_388 = quotedNode_390;
                  quotedNode1_388.setReferent("fieldDeclaration", (SNode) parameter_7904_5);
                  quotedNode_388.addChild("operation", quotedNode1_388);
                }
                quotedNode_386.addChild("lValue", quotedNode1_386);
              }
              quotedNode_384.addChild("expression", quotedNode1_384);
            }
            quotedNode_382.addChild("statement", quotedNode1_383);
          }
          quotedNode_379.addChild("body", quotedNode1_382);
        }
        {
          quotedNode_383 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_389 = quotedNode_383;
          quotedNode1_389.setProperty("name", (String) parameter_7904_7);
          {
            quotedNode_385 = (SNode) parameter_7904_6;
            SNode quotedNode1_390;
            if (_parameterValues_129834374.contains(quotedNode_385)) {
              quotedNode1_390 = CopyUtil.copy(quotedNode_385);
            } else {
              _parameterValues_129834374.add(quotedNode_385);
              quotedNode1_390 = quotedNode_385;
            }
            if (quotedNode1_390 != null) {
              quotedNode_383.addChild("type", HUtil.copyIfNecessary(quotedNode1_390));
            }
          }
          quotedNode_379.addChild("parameter", quotedNode1_389);
        }
        result = quotedNode1_379;
      }
      quotedNode_387.setReferent("variableDeclaration", quotedNode_383);
      return result;
    }
  }
}
