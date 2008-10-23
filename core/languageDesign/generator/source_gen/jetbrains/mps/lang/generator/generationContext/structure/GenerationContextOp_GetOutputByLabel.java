package jetbrains.mps.lang.generator.generationContext.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.generator.structure.MappingLabelDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GenerationContextOp_GetOutputByLabel extends GenerationContextOp_Base {
  public static final String concept = "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetOutputByLabel";
  public static final String LABEL_NAME_INTERN = "labelName_intern";
  public static final String LABEL = "label";

  public GenerationContextOp_GetOutputByLabel(SNode node) {
    super(node);
  }

  public String getLabelName_intern() {
    return this.getProperty(GenerationContextOp_GetOutputByLabel.LABEL_NAME_INTERN);
  }

  public void setLabelName_intern(String value) {
    this.setProperty(GenerationContextOp_GetOutputByLabel.LABEL_NAME_INTERN, value);
  }

  public MappingLabelDeclaration getLabel() {
    return (MappingLabelDeclaration)this.getReferent(GenerationContextOp_GetOutputByLabel.LABEL);
  }

  public void setLabel(MappingLabelDeclaration node) {
    super.setReferent(GenerationContextOp_GetOutputByLabel.LABEL, node);
  }


  public static GenerationContextOp_GetOutputByLabel newInstance(SModel sm, boolean init) {
    return (GenerationContextOp_GetOutputByLabel)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetOutputByLabel", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GenerationContextOp_GetOutputByLabel newInstance(SModel sm) {
    return GenerationContextOp_GetOutputByLabel.newInstance(sm, false);
  }

}
