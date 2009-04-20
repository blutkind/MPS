package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.generator.structure.MappingScript;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MappingScriptReference extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.generator.structure.MappingScriptReference";
  public static final String MAPPING_SCRIPT = "mappingScript";

  public MappingScriptReference(SNode node) {
    super(node);
  }

  public MappingScript getMappingScript() {
    return (MappingScript)this.getReferent(MappingScript.class, MappingScriptReference.MAPPING_SCRIPT);
  }

  public void setMappingScript(MappingScript node) {
    super.setReferent(MappingScriptReference.MAPPING_SCRIPT, node);
  }


  public static MappingScriptReference newInstance(SModel sm, boolean init) {
    return (MappingScriptReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.MappingScriptReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MappingScriptReference newInstance(SModel sm) {
    return MappingScriptReference.newInstance(sm, false);
  }

}
