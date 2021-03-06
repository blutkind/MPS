package jetbrains.mps.xml.deprecated.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PublicId extends ExternalId {
  public static final String concept = "jetbrains.mps.xml.deprecated.structure.PublicId";
  public static final String PUBLIC_I_D = "publicID";
  public static final String SYSTEM_I_D = "systemID";

  public PublicId(SNode node) {
    super(node);
  }

  public String getPublicID() {
    return this.getProperty(PublicId.PUBLIC_I_D);
  }

  public void setPublicID(String value) {
    this.setProperty(PublicId.PUBLIC_I_D, value);
  }

  public String getSystemID() {
    return this.getProperty(PublicId.SYSTEM_I_D);
  }

  public void setSystemID(String value) {
    this.setProperty(PublicId.SYSTEM_I_D, value);
  }

  public static PublicId newInstance(SModel sm, boolean init) {
    return (PublicId) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xml.deprecated.structure.PublicId", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PublicId newInstance(SModel sm) {
    return PublicId.newInstance(sm, false);
  }
}
