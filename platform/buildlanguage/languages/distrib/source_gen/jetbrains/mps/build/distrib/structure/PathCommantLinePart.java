package jetbrains.mps.build.distrib.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.build.packaging.structure.Path;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PathCommantLinePart extends AbstractCommandLinePart {
  public static final String concept = "jetbrains.mps.build.distrib.structure.PathCommantLinePart";
  public static final String PATH = "path";

  public PathCommantLinePart(SNode node) {
    super(node);
  }

  public Path getPath() {
    return (Path)this.getChild(Path.class, PathCommantLinePart.PATH);
  }

  public void setPath(Path node) {
    super.setChild(PathCommantLinePart.PATH, node);
  }


  public static PathCommantLinePart newInstance(SModel sm, boolean init) {
    return (PathCommantLinePart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.distrib.structure.PathCommantLinePart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PathCommantLinePart newInstance(SModel sm) {
    return PathCommantLinePart.newInstance(sm, false);
  }

}
