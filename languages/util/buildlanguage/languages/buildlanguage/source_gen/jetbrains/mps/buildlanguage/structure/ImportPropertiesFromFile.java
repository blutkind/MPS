package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ImportPropertiesFromFile extends AbstractImportProperties {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.ImportPropertiesFromFile";
  public static final String PROPERTY_FILE = "propertyFile";

  public ImportPropertiesFromFile(SNode node) {
    super(node);
  }

  public PropertyValueExpression getPropertyFile() {
    return (PropertyValueExpression) this.getChild(PropertyValueExpression.class, ImportPropertiesFromFile.PROPERTY_FILE);
  }

  public void setPropertyFile(PropertyValueExpression node) {
    super.setChild(ImportPropertiesFromFile.PROPERTY_FILE, node);
  }

  public static ImportPropertiesFromFile newInstance(SModel sm, boolean init) {
    return (ImportPropertiesFromFile) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.ImportPropertiesFromFile", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ImportPropertiesFromFile newInstance(SModel sm) {
    return ImportPropertiesFromFile.newInstance(sm, false);
  }
}
