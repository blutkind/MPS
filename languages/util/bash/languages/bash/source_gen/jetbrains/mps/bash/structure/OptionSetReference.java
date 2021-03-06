package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OptionSetReference extends ExternalOptionReference {
  public static final String concept = "jetbrains.mps.bash.structure.OptionSetReference";
  public static final String REF_TO_OPTIONS = "refToOptions";

  public OptionSetReference(SNode node) {
    super(node);
  }

  public int getRefToOptionsesCount() {
    return this.getChildCount(OptionSetReference.REF_TO_OPTIONS);
  }

  public Iterator<OptionReference> refToOptionses() {
    return this.children(OptionReference.class, OptionSetReference.REF_TO_OPTIONS);
  }

  public List<OptionReference> getRefToOptionses() {
    return this.getChildren(OptionReference.class, OptionSetReference.REF_TO_OPTIONS);
  }

  public void addRefToOptions(OptionReference node) {
    this.addChild(OptionSetReference.REF_TO_OPTIONS, node);
  }

  public void insertRefToOptions(OptionReference prev, OptionReference node) {
    this.insertChild(prev, OptionSetReference.REF_TO_OPTIONS, node);
  }

  public static OptionSetReference newInstance(SModel sm, boolean init) {
    return (OptionSetReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.OptionSetReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OptionSetReference newInstance(SModel sm) {
    return OptionSetReference.newInstance(sm, false);
  }
}
