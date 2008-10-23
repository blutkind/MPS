package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MapRemoveOperation extends MapOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.MapRemoveOperation";
  public static final String KEY = "key";

  public MapRemoveOperation(SNode node) {
    super(node);
  }

  public Expression getKey() {
    return (Expression)this.getChild(MapRemoveOperation.KEY);
  }

  public void setKey(Expression node) {
    super.setChild(MapRemoveOperation.KEY, node);
  }


  public static MapRemoveOperation newInstance(SModel sm, boolean init) {
    return (MapRemoveOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MapRemoveOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MapRemoveOperation newInstance(SModel sm) {
    return MapRemoveOperation.newInstance(sm, false);
  }

}
