package jetbrains.mps.debug.apiLang.structure;

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
      case 1300900393:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.BreakpointCreator", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1540193358:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.BreakpointableNodeItem", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 246842686:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.ConceptFunction_CreateBreakpoint", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunction"});
      case -938382871:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.ConceptFunctionParameter_Debug_Project", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"});
      case 1851804052:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.ConceptFunctionParameter_DebuggableNode", new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter"});
      case 585642791:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.ConceptDeclarationReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 486523661:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.DebuggerType", new String[]{"jetbrains.mps.baseLanguage.structure.Type"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Type"});
      case -1326942376:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.DebuggerReference", new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"});
      case 1041442568:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.debug.apiLang.structure.CreateBreakpointOperation", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation"});
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
