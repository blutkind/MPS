package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FormPart extends BaseConcept {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.FormPart";
  public static final String LABEL = "label";
  public static final String CONTENT = "content";

  public FormPart(SNode node) {
    super(node);
  }

  public String getLabel() {
    return this.getProperty(FormPart.LABEL);
  }

  public void setLabel(String value) {
    this.setProperty(FormPart.LABEL, value);
  }

  public IComponentPart getContent() {
    return (IComponentPart)this.getChild(IComponentPart.class, FormPart.CONTENT);
  }

  public void setContent(IComponentPart node) {
    super.setChild(FormPart.CONTENT, node);
  }


  public static FormPart newInstance(SModel sm, boolean init) {
    return (FormPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.FormPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FormPart newInstance(SModel sm) {
    return FormPart.newInstance(sm, false);
  }

}
