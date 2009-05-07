package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PropertyFileImport extends PropertiesImport {
  public static final String concept = "jetbrains.mps.build.packaging.structure.PropertyFileImport";
  public static final String FILE = "file";

  public PropertyFileImport(SNode node) {
    super(node);
  }

  public Path getFile() {
    return (Path)this.getChild(Path.class, PropertyFileImport.FILE);
  }

  public void setFile(Path node) {
    super.setChild(PropertyFileImport.FILE, node);
  }


  public static PropertyFileImport newInstance(SModel sm, boolean init) {
    return (PropertyFileImport)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.PropertyFileImport", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PropertyFileImport newInstance(SModel sm) {
    return PropertyFileImport.newInstance(sm, false);
  }

}
