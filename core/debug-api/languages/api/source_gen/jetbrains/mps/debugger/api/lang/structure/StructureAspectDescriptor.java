package jetbrains.mps.debugger.api.lang.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.debugger.api.lang.structure.BreakpointCreator", "jetbrains.mps.debugger.api.lang.structure.BreakpointableNodeItem", "jetbrains.mps.debugger.api.lang.structure.ConceptDeclarationReference", "jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_Debug_Project", "jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_DebuggableNode", "jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_DebuggableNode_Deprecated", "jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_ScopeNode", "jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_UnitNode", "jetbrains.mps.debugger.api.lang.structure.ConceptFunction_CreateBreakpoint", "jetbrains.mps.debugger.api.lang.structure.ConceptFunction_CreateBreakpoint_Deprecated", "jetbrains.mps.debugger.api.lang.structure.ConceptFunction_GetUnitName", "jetbrains.mps.debugger.api.lang.structure.ConceptFunction_GetVariables", "jetbrains.mps.debugger.api.lang.structure.ConceptFunction_PropertyStringGetter", "jetbrains.mps.debugger.api.lang.structure.CreateBreakpointOperation", "jetbrains.mps.debugger.api.lang.structure.DebugInfoInitializer", "jetbrains.mps.debugger.api.lang.structure.DebuggableNodeItem", "jetbrains.mps.debugger.api.lang.structure.DebuggerConfiguration", "jetbrains.mps.debugger.api.lang.structure.DebuggerReference", "jetbrains.mps.debugger.api.lang.structure.DebuggerType", "jetbrains.mps.debugger.api.lang.structure.GetDebuggerSettings_Function", "jetbrains.mps.debugger.api.lang.structure.ScopeNodeItem", "jetbrains.mps.debugger.api.lang.structure.UnitNodeItem", "jetbrains.mps.debugger.api.lang.structure.VariableNodeExpression", "jetbrains.mps.debugger.api.lang.structure.VariableNodeItem"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.BreakpointCreator", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 1:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.BreakpointableNodeItem", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"declaration"});
      case 2:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.ConceptDeclarationReference", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"conceptDeclaration"});
      case 3:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_Debug_Project", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      case 4:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_DebuggableNode", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      case 5:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_DebuggableNode_Deprecated", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      case 6:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_ScopeNode", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      case 7:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.ConceptFunctionParameter_UnitNode", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{});
      case 8:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.ConceptFunction_CreateBreakpoint", "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{});
      case 9:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.ConceptFunction_CreateBreakpoint_Deprecated", "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{});
      case 10:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.ConceptFunction_GetUnitName", "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{});
      case 11:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.ConceptFunction_GetVariables", "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{});
      case 12:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.ConceptFunction_PropertyStringGetter", "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{});
      case 13:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.CreateBreakpointOperation", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{"kindName", "kindPresentation"}, new String[]{});
      case 14:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.DebugInfoInitializer", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 15:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.DebuggableNodeItem", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"declaration"});
      case 16:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.DebuggerConfiguration", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 17:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.DebuggerReference", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{"debuggerName"}, new String[]{});
      case 18:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.DebuggerType", "jetbrains.mps.baseLanguage.structure.Type", false, new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{"name"}, new String[]{});
      case 19:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.GetDebuggerSettings_Function", "jetbrains.mps.baseLanguage.structure.ConceptFunction", false, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{});
      case 20:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.ScopeNodeItem", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"scopeConcept"});
      case 21:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.UnitNodeItem", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"unitConcept"});
      case 22:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.VariableNodeExpression", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{});
      case 23:
        return new CompiledConceptDescriptor("jetbrains.mps.debugger.api.lang.structure.VariableNodeItem", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"concept"});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}
