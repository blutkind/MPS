package jetbrains.mps.smodel.structure;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.NameUtil;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;

public class ConceptRegistry implements ApplicationComponent {
  private static final DescriptorProvider<BehaviorDescriptor> INTERPRETED_BEHAVIOR = new InterpretedBehaviorProvider();
  private static final DescriptorProvider<StructureDescriptor> INTERPRETED_STRUCTURE = new InterpretedStructureProvider();

  private static final DescriptorProvider<ConceptDescriptor> INTERPRETED_CONCEPT_DESCRIPTOR = new SimpleConceptDescriptorProvider(
    INTERPRETED_STRUCTURE,
    INTERPRETED_BEHAVIOR
  );

  private final DescriptorProvider<ConceptDescriptor> conceptDescriptorProvider = INTERPRETED_CONCEPT_DESCRIPTOR;

  private final Map<String, ConceptDescriptor> descriptors = newHashMap();

  public ConceptRegistry(MPSModuleRepository moduleRepository) {
    // ?
  }

  public static ConceptRegistry getInstance() {
    return ApplicationManager.getApplication().getComponent(ConceptRegistry.class);
  }

  @NotNull
  @Override
  public String getComponentName() {
    return "Concept Registry";
  }

  @Override
  public void initComponent() {
    // ?
  }

  @Override
  public void disposeComponent() {
    // ?
  }

  public ConceptDescriptor getConceptDescriptor(String fqName) {
    if (descriptors.containsKey(fqName)) {
      return descriptors.get(fqName);
    } else {
      ConceptDescriptor descriptor = conceptDescriptorProvider.getDescriptor(fqName);
      descriptors.put(fqName, descriptor);
      return descriptor;
    }
  }

  public ConceptDescriptor getConceptDescriptorForInstanceNode(SNode instanceNode) {
    return instanceNode != null ? getConceptDescriptor(instanceNode.getConceptFqName()) : NullNodeConceptDescriptor.INSTANCE;
  }

  public ConceptDescriptor getConceptDescriptor(SNode node) {
    return getConceptDescriptor(NameUtil.nodeFQName(node));
  }
}
