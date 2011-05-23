package jetbrains.mps.lang.pattern.structure;

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
      case 716368539:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.AsPattern", new String[]{"jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration"}, new String[]{"jetbrains.mps.lang.pattern.structure.Pattern", "jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration"}, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.NodeAttribute"});
      case -2131337619:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.Pattern", new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"});
      case -1337562907:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.PatternExpression", new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.lang.core.structure.IMetaLevelChanger"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.lang.core.structure.IMetaLevelChanger"});
      case -1529997903:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration", new String[]{"jetbrains.mps.lang.pattern.structure.Pattern", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"jetbrains.mps.lang.pattern.structure.Pattern"}, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.NodeAttribute"});
      case -1029075866:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.PropertyPatternVariableDeclaration", new String[]{"jetbrains.mps.lang.core.structure.PropertyAttribute", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.PropertyAttribute"});
      case -1207555533:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.WildcardPattern", new String[]{"jetbrains.mps.lang.pattern.structure.Pattern"}, new String[]{"jetbrains.mps.lang.pattern.structure.Pattern"}, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"});
      case -1884208785:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.ListPattern", new String[]{"jetbrains.mps.lang.pattern.structure.AsPattern"}, new String[]{"jetbrains.mps.lang.pattern.structure.AsPattern", "jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration", "jetbrains.mps.lang.pattern.structure.Pattern"}, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.NodeAttribute"});
      case 809452491:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.LinkPatternVariableDeclaration", new String[]{"jetbrains.mps.lang.core.structure.LinkAttribute", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.LinkAttribute"});
      case 1712602949:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.ActionAsPattern", new String[]{"jetbrains.mps.lang.pattern.structure.AsPattern"}, new String[]{"jetbrains.mps.lang.pattern.structure.AsPattern", "jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration", "jetbrains.mps.lang.pattern.structure.Pattern"}, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.NodeAttribute"});
      case -576410186:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.ActionStatement", new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"});
      case 156926274:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.PatternVariableReference", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -561000502:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.OrPattern", new String[]{"jetbrains.mps.lang.pattern.structure.Pattern"}, new String[]{"jetbrains.mps.lang.pattern.structure.Pattern"}, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"});
      case -682112551:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.OrPatternClause", new String[]{"jetbrains.mps.lang.pattern.structure.PatternExpression"}, new String[]{"jetbrains.mps.lang.pattern.structure.PatternExpression"}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.lang.core.structure.IMetaLevelChanger"});
      case 1051743621:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.OrPatternVariableReference", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case -993142711:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.InsertAfterPosition", new String[]{"jetbrains.mps.lang.pattern.structure.InsertPosition"}, new String[]{"jetbrains.mps.lang.pattern.structure.InsertPosition"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -4587228:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.InsertBeforePosition", new String[]{"jetbrains.mps.lang.pattern.structure.InsertPosition"}, new String[]{"jetbrains.mps.lang.pattern.structure.InsertPosition"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -737017467:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.lang.pattern.structure.InsertPosition", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
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
