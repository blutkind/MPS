package jetbrains.mps.lang.textGen.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.textGen.structure.AbstractAppendPart;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AppendOperation extends Statement {
  public static final String concept = "jetbrains.mps.lang.textGen.structure.AppendOperation";
  public static final String PART = "part";

  public AppendOperation(SNode node) {
    super(node);
  }

  public int getPartsCount() {
    return this.getChildCount(AppendOperation.PART);
  }

  public Iterator<AbstractAppendPart> parts() {
    return this.children(AbstractAppendPart.class, AppendOperation.PART);
  }

  public List<AbstractAppendPart> getParts() {
    return this.getChildren(AbstractAppendPart.class, AppendOperation.PART);
  }

  public void addPart(AbstractAppendPart node) {
    this.addChild(AppendOperation.PART, node);
  }

  public void insertPart(AbstractAppendPart prev, AbstractAppendPart node) {
    this.insertChild(prev, AppendOperation.PART, node);
  }


  public static AppendOperation newInstance(SModel sm, boolean init) {
    return (AppendOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.textGen.structure.AppendOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AppendOperation newInstance(SModel sm) {
    return AppendOperation.newInstance(sm, false);
  }

}
