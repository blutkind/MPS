package jetbrains.mps.execution.commands.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.execution.commands.structure.AbstractProcessBuilderPart", "jetbrains.mps.execution.commands.structure.BuilderBlockStatement", "jetbrains.mps.execution.commands.structure.BuilderParameter", "jetbrains.mps.execution.commands.structure.CommandBuilderExpression", "jetbrains.mps.execution.commands.structure.CommandDebuggerOperation", "jetbrains.mps.execution.commands.structure.CommandDeclaration", "jetbrains.mps.execution.commands.structure.CommandMethod", "jetbrains.mps.execution.commands.structure.CommandParameterAssignment", "jetbrains.mps.execution.commands.structure.CommandParameterDeclaration", "jetbrains.mps.execution.commands.structure.CommandParameterReference", "jetbrains.mps.execution.commands.structure.CommandProcessType", "jetbrains.mps.execution.commands.structure.CommandReferenceExpression", "jetbrains.mps.execution.commands.structure.CommandType", "jetbrains.mps.execution.commands.structure.DebuggerSettingsCommandParameterDeclaration", "jetbrains.mps.execution.commands.structure.ExecuteCommandPart", "jetbrains.mps.execution.commands.structure.ExplicitCommandParameterDeclaration", "jetbrains.mps.execution.commands.structure.ProcessBuilderExpression", "jetbrains.mps.execution.commands.structure.ProcessBuilderKeyPart", "jetbrains.mps.execution.commands.structure.ProcessBuilderPart", "jetbrains.mps.execution.commands.structure.ProcessType", "jetbrains.mps.execution.commands.structure.RedirectOutputExpression", "jetbrains.mps.execution.commands.structure.ReportErrorStatement", "jetbrains.mps.execution.commands.structure.ReportExecutionError", "jetbrains.mps.execution.commands.structure.StartAndWaitOperation"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.AbstractProcessBuilderPart", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 1:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.BuilderBlockStatement", "jetbrains.mps.lang.core.structure.NodeAttribute", false, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"}, new String[]{}, new String[]{});
      case 2:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.BuilderParameter", "jetbrains.mps.lang.core.structure.NodeAttribute", false, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"}, new String[]{}, new String[]{});
      case 3:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.CommandBuilderExpression", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"commandPart"});
      case 4:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.CommandDebuggerOperation", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{});
      case 5:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.CommandDeclaration", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.execution.common.structure.IGeneratedToClass"}, new String[]{}, new String[]{});
      case 6:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.CommandMethod", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration", false, new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration"}, new String[]{}, new String[]{});
      case 7:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.CommandParameterAssignment", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"parameterDeclaration"});
      case 8:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.CommandParameterDeclaration", "jetbrains.mps.baseLanguage.structure.VariableDeclaration", false, new String[]{"jetbrains.mps.baseLanguage.structure.VariableDeclaration"}, new String[]{}, new String[]{});
      case 9:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.CommandParameterReference", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{"resolveInfo"}, new String[]{"parameter"});
      case 10:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.CommandProcessType", "jetbrains.mps.execution.commands.structure.ProcessType", false, new String[]{"jetbrains.mps.execution.commands.structure.ProcessType"}, new String[]{}, new String[]{"commandDeclaration"});
      case 11:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.CommandReferenceExpression", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"command"});
      case 12:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.CommandType", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierType", false, new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierType"}, new String[]{}, new String[]{"command"});
      case 13:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.DebuggerSettingsCommandParameterDeclaration", "jetbrains.mps.execution.commands.structure.CommandParameterDeclaration", false, new String[]{"jetbrains.mps.execution.commands.structure.CommandParameterDeclaration"}, new String[]{}, new String[]{});
      case 14:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.ExecuteCommandPart", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.baseLanguage.structure.IMethodLike"}, new String[]{}, new String[]{});
      case 15:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.ExplicitCommandParameterDeclaration", "jetbrains.mps.execution.commands.structure.CommandParameterDeclaration", false, new String[]{"jetbrains.mps.execution.commands.structure.CommandParameterDeclaration"}, new String[]{"isRequired"}, new String[]{});
      case 16:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.ProcessBuilderExpression", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{});
      case 17:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.ProcessBuilderKeyPart", "jetbrains.mps.execution.commands.structure.AbstractProcessBuilderPart", false, new String[]{"jetbrains.mps.execution.commands.structure.AbstractProcessBuilderPart"}, new String[]{}, new String[]{});
      case 18:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.ProcessBuilderPart", "jetbrains.mps.execution.commands.structure.AbstractProcessBuilderPart", false, new String[]{"jetbrains.mps.execution.commands.structure.AbstractProcessBuilderPart"}, new String[]{}, new String[]{});
      case 19:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.ProcessType", "jetbrains.mps.baseLanguage.structure.Type", false, new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{});
      case 20:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.RedirectOutputExpression", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{});
      case 21:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.ReportErrorStatement", "jetbrains.mps.baseLanguage.structure.Statement", false, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{});
      case 22:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.ReportExecutionError", "jetbrains.mps.execution.commands.structure.ReportErrorStatement", false, new String[]{"jetbrains.mps.execution.commands.structure.ReportErrorStatement"}, new String[]{}, new String[]{});
      case 23:
        return new CompiledConceptDescriptor("jetbrains.mps.execution.commands.structure.StartAndWaitOperation", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}
