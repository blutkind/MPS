package jetbrains.mps.analyzers.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.StructureDescriptor;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.structure.ConceptRegistry;

public class StructureAspectDescriptor extends DescriptorProvider<StructureDescriptor> {
  public StructureAspectDescriptor() {
  }

  public StructureDescriptor getDescriptor(String conceptFqName) {
    switch ((conceptFqName).hashCode()) {
      case 2015249080:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.Analyzer", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 562521404:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.Instruction", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case -518857640:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.AnalyzerMergeFunction", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"});
      case -2017044109:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.AnalyzerParameterProgram", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"});
      case 1845992993:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.AnalyzerMergeParameterInput", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"});
      case -974038684:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.AnalyzerInitialFunction", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"});
      case -1524729697:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.AnalyzerFunFunction", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"});
      case 246362447:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.AnalyzerFunParameterProgramState", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"});
      case -1245140696:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.AnalyzerFunParameterInput", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"});
      case -1649923535:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.AnalysisDirection", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1803639220:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.ForwardDirection", new String[]{"jetbrains.mps.analyzers.structure.AnalysisDirection"}, new String[]{"jetbrains.mps.analyzers.structure.AnalysisDirection"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -805582582:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.BackwardDirection", new String[]{"jetbrains.mps.analyzers.structure.AnalysisDirection"}, new String[]{"jetbrains.mps.analyzers.structure.AnalysisDirection"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -946169913:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.AnalyzerFunctionResultType", new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Type"});
      case 1055221262:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.Rule", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case -853438003:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.InstructionParameter", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case -665745686:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.ApplicableCondition", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 571631485:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.PatternCondition", new String[]{"jetbrains.mps.analyzers.structure.ApplicableCondition"}, new String[]{"jetbrains.mps.analyzers.structure.ApplicableCondition"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case -1580899223:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.EmitInstruction", new String[]{"jetbrains.mps.lang.pattern.structure.ActionStatement"}, new String[]{}, new String[]{"jetbrains.mps.lang.pattern.structure.ActionStatement"});
      case 561913199:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.InstructionReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1843468067:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.RuleReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 2019025762:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.AnalyzerRunnerType", new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Type"});
      case -1382799965:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.AnalyzerRunnerAnalyzeOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"});
      case -338765052:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.AnalyzerRunnerCreator", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -1192849397:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.IsOperation", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 95620005:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.ConceptCondition", new String[]{"jetbrains.mps.analyzers.structure.ApplicableCondition", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"jetbrains.mps.analyzers.structure.ApplicableCondition"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 4779448:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.ApplicableNodeReference", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 530223091:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.InsertBeforePosition", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -805464172:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.InsertPosition", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1807174758:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.analyzers.structure.InsertAfterPosition", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      default:
        return null;
    }
  }

  public static class DataBasedStructureDescriptor extends StructureDescriptor {
    private ImmutableList<String> parents;
    private ImmutableSet<String> ancestors;

    public DataBasedStructureDescriptor(String fqName, String[] parents, String[] ancestorsInLanguage, String[] ancestorsNotInLanguage) {
      this.parents = ImmutableList.copyOf(parents);
      this.ancestors = getAncestors(fqName, ancestorsInLanguage, ancestorsNotInLanguage);
    }

    public Set<String> getAncestorsNames() {
      return ancestors;
    }

    public boolean isAssignableTo(String toConceptFqName) {
      return ancestors.contains(toConceptFqName);
    }

    public List<String> getParentsNames() {
      return parents;
    }

    private static ImmutableSet<String> getAncestors(String conceptFqName, String[] ancestorsInLanguage, String[] ancestorsNotInLanguage) {
      ArrayList<String> result = new ArrayList(ancestorsInLanguage.length + 1);

      for (String ancestor : ancestorsInLanguage) {
        result.add(ancestor);
      }

      result.add(conceptFqName);
      ConceptRegistry registry = ConceptRegistry.getInstance();
      for (String parent : ancestorsNotInLanguage) {
        result.addAll(registry.getStructureDescriptor(parent).getAncestorsNames());
      }
      return ImmutableSet.copyOf(result);
    }
  }
}
