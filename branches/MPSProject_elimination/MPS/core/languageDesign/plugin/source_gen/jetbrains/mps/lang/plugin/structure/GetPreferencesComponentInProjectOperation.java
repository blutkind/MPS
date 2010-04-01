package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GetPreferencesComponentInProjectOperation extends BaseProjectOperation {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.GetPreferencesComponentInProjectOperation";
  public static final String COMPONENT_DECLARATION = "componentDeclaration";

  public GetPreferencesComponentInProjectOperation(SNode node) {
    super(node);
  }

  public PreferencesComponentDeclaration getComponentDeclaration() {
    return (PreferencesComponentDeclaration) this.getReferent(PreferencesComponentDeclaration.class, GetPreferencesComponentInProjectOperation.COMPONENT_DECLARATION);
  }

  public void setComponentDeclaration(PreferencesComponentDeclaration node) {
    super.setReferent(GetPreferencesComponentInProjectOperation.COMPONENT_DECLARATION, node);
  }

  public static GetPreferencesComponentInProjectOperation newInstance(SModel sm, boolean init) {
    return (GetPreferencesComponentInProjectOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.GetPreferencesComponentInProjectOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GetPreferencesComponentInProjectOperation newInstance(SModel sm) {
    return GetPreferencesComponentInProjectOperation.newInstance(sm, false);
  }
}
