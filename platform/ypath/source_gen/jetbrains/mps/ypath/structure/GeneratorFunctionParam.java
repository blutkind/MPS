package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GeneratorFunctionParam extends ConceptFunctionParameter implements IFunctionParam {
public    static final String concept = "jetbrains.mps.ypath.structure.GeneratorFunctionParam";
public    static final String SHORT_DESCRIPTION = "shortDescription";
public    static final String ALIAS = "alias";
public    static final String VIRTUAL_PACKAGE = "virtualPackage";

  public GeneratorFunctionParam(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(GeneratorFunctionParam.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(GeneratorFunctionParam.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(GeneratorFunctionParam.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(GeneratorFunctionParam.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(GeneratorFunctionParam.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(GeneratorFunctionParam.VIRTUAL_PACKAGE, value);
  }


  public static GeneratorFunctionParam newInstance(SModel sm, boolean init) {
    return (GeneratorFunctionParam)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.GeneratorFunctionParam", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GeneratorFunctionParam newInstance(SModel sm) {
    return GeneratorFunctionParam.newInstance(sm, false);
  }

}
