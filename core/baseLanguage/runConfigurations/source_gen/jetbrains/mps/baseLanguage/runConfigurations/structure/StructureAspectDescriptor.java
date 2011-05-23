package jetbrains.mps.baseLanguage.runConfigurations.structure;

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
      case 638382655:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.JavaNodeRunConfiguration", new String[]{"jetbrains.mps.baseLanguage.runConfigurations.structure.JavaRunConfiguration"}, new String[]{"jetbrains.mps.baseLanguage.runConfigurations.structure.JavaRunConfiguration"}, new String[]{"jetbrains.mps.lang.plugin.structure.IEnhancedRunConfiguration", "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration"});
      case 1255693015:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.JavaCheckBlock", new String[]{"jetbrains.mps.lang.plugin.structure.AbstractCheckConfigBlock"}, new String[]{}, new String[]{"jetbrains.mps.lang.plugin.structure.AbstractCheckConfigBlock"});
      case 176098589:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.JavaRunConfiguration", new String[]{"jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration", "jetbrains.mps.lang.plugin.structure.IEnhancedRunConfiguration"}, new String[]{}, new String[]{"jetbrains.mps.lang.plugin.structure.IEnhancedRunConfiguration", "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration"});
      case -1616976445:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.JavaConfigurationRunParameters_FunctionParameter", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", "jetbrains.mps.baseLanguage.runConfigurations.structure.IJavaRunConfigurationParameter"}, new String[]{"jetbrains.mps.baseLanguage.runConfigurations.structure.IJavaRunConfigurationParameter"}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"});
      case -1580346184:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.UserComponentReferenceAnnotation", new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"});
      case -535338940:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.Node_FunctionParameter", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", "jetbrains.mps.baseLanguage.runConfigurations.structure.IJavaRunConfigurationParameter"}, new String[]{"jetbrains.mps.baseLanguage.runConfigurations.structure.IJavaRunConfigurationParameter"}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"});
      case -1776949629:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.IJavaRunConfigurationParameter", new String[]{}, new String[]{}, new String[]{});
      case 616231109:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.NodeRunConfigPropertyInstance", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.plugin.structure.IRunConfigPropertyInstance"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.plugin.structure.IRunConfigPropertyInstance"});
      case 1341486731:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.JavaNodeConfigurationEditorDeclaration", new String[]{"jetbrains.mps.lang.plugin.structure.ConfigurationEditorDeclaration"}, new String[]{}, new String[]{"jetbrains.mps.lang.plugin.structure.ConfigurationEditorDeclaration"});
      case 237705548:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.OnChangeNodeBlock", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction", "jetbrains.mps.baseLanguage.runConfigurations.structure.IOnChangeEditorBlock"}, new String[]{"jetbrains.mps.baseLanguage.runConfigurations.structure.IOnChangeEditorBlock"}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"});
      case -1711177389:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.ComponentInsideOfChangeListenerAnnotation", new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"});
      case -177572680:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.IOnChangeEditorBlock", new String[]{}, new String[]{}, new String[]{});
      case 2056789236:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.IsApplicableBlock", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"});
      case -583237754:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.baseLanguage.runConfigurations.structure.IMainClass", new String[]{}, new String[]{}, new String[]{});
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
