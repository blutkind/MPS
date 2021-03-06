package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AspectParameterRef extends Expression {
  public static final String concept = "jetbrains.mps.ui.modeling.structure.AspectParameterRef";
  public static final String PARAMETER_DECL = "parameterDecl";

  public AspectParameterRef(SNode node) {
    super(node);
  }

  public AspectParameterDecl getParameterDecl() {
    return (AspectParameterDecl) this.getReferent(AspectParameterDecl.class, AspectParameterRef.PARAMETER_DECL);
  }

  public void setParameterDecl(AspectParameterDecl node) {
    super.setReferent(AspectParameterRef.PARAMETER_DECL, node);
  }

  public static AspectParameterRef newInstance(SModel sm, boolean init) {
    return (AspectParameterRef) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.modeling.structure.AspectParameterRef", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AspectParameterRef newInstance(SModel sm) {
    return AspectParameterRef.newInstance(sm, false);
  }
}
