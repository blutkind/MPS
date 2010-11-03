package jetbrains.mps.make.facet.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.baseLanguage.behavior.IWillBeClassifier_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import java.util.List;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class QueriesGenerated {
  public static boolean createRootRule_Condition_671853460608709085(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.make.facet.structure.FacetDeclaration")).isNotEmpty();
  }

  public static Object propertyMacro_GetPropertyValue_5086995156117240631(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IWillBeClassifier_Behavior.call_classifierName_4609636120081351397(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_5189627237350277729(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_5189627237350200028(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_5086995156117328675(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName(_context.getTemplateValue(), SNodeOperations.getParent(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_5189627237350267984(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.cast(_context.getNode(), "jetbrains.mps.make.facet.structure.TargetDeclaration"), "name");
  }

  public static Object propertyMacro_GetPropertyValue_5189627237350270310(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "facet", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_7320828025189345716(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_6872280991287185431(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "target", false), "name");
  }

  public static Object referenceMacro_GetReferent_671853460608694391(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "TargetDeclaration_class"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_3344436107830010386(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "variables", true), "VariablesDeclaration_class");
  }

  public static Object referenceMacro_GetReferent_2146492603954959649(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "variables", true), "VariablesDeclaration_class");
  }

  public static Object referenceMacro_GetReferent_671853460608824185(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "FacetDeclaration_class"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_2146492603954835938(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.make.facet.structure.TargetDeclaration", false, false), "TargetDeclaration_class");
  }

  public static Object referenceMacro_GetReferent_3344436107830202786(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.make.facet.structure.TargetDeclaration", false, false), "variables", true), "VariablesDeclaration_class");
  }

  public static Object referenceMacro_GetReferent_2146492603954953915(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.make.facet.structure.TargetDeclaration", false, false), "variables", true), "VariablesDeclaration_class");
  }

  public static Object referenceMacro_GetReferent_6872280991287182654(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "target", false), "variables", true), "VariablesDeclaration_class");
  }

  public static Object referenceMacro_GetReferent_6872280991287182670(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "target", false), "variables", true), "VariablesDeclaration_class");
  }

  public static boolean ifMacro_Condition_7320828025189279641(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "variables", true) != null);
  }

  public static boolean ifMacro_Condition_3344436107830010396(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "variables", true) != null);
  }

  public static boolean ifMacro_Condition_2146492603954959667(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "variables", true) != null);
  }

  public static boolean ifMacro_Condition_3344436107830160992(final IOperationContext operationContext, final IfMacroContext _context) {
    return false;
  }

  public static boolean ifMacro_Condition_5189627237350267862(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "dependency", true)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode d) {
        return SPropertyOperations.getString_def(d, "qualifier", "BEFORE") == SEnumOperations.getEnumMemberValue(((SNode) _context.getVariable("qualifier")));
      }
    });
  }

  public static boolean ifMacro_Condition_5189627237350270268(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(((List<SNode>) _context.getVariable("related"))).isNotEmpty();
  }

  public static SNode sourceNodeQuery_2146492603954835971(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_2146492603954835982(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operation", true);
  }

  public static SNode sourceNodeQuery_6872280991287182715(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_6872280991287182723(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operation", true);
  }

  public static SNode sourceNodeQuery_5189627237350272581(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_7320828025189279645(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "variables", true);
  }

  public static SNode sourceNodeQuery_3916013743093752820(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "job", true);
  }

  public static Object templateArgumentQuery_5189627237350270329(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "optional", true);
  }

  public static Object templateArgumentQuery_5189627237350270355(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "required", true);
  }

  public static Object templateArgumentQuery_5189627237350270366(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "extended", true);
  }

  public static Object templateArgumentQuery_5189627237350268044(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)", "TargetDependencyQualifier"), "not after");
  }

  public static Object templateArgumentQuery_5189627237350268053(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)", "TargetDependencyQualifier"), "after");
  }

  public static Object templateArgumentQuery_5189627237350268062(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)", "TargetDependencyQualifier"), "not before");
  }

  public static Object templateArgumentQuery_5189627237350268071(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)", "TargetDependencyQualifier"), "before");
  }

  public static Iterable sourceNodesQuery_5189627237350272573(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "targetDeclaration", true);
  }

  public static Iterable sourceNodesQuery_671853460608694403(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "targetDeclaration", true);
  }

  public static Iterable sourceNodesQuery_5189627237350267857(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "dependency", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode d) {
        return SPropertyOperations.getString_def(d, "qualifier", "BEFORE") == SEnumOperations.getEnumMemberValue(((SNode) _context.getVariable("qualifier")));
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode d) {
        return SLinkOperations.getTarget(d, "dependsOn", false);
      }
    });
  }

  public static Iterable sourceNodesQuery_5189627237350270300(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ((List<SNode>) _context.getVariable("related"));
  }

  public static Iterable sourceNodesQuery_671853460608824199(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.make.facet.structure.FacetDeclaration");
  }

  public static Iterable sourceNodesQuery_7320828025189345730(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "component", true);
  }
}
