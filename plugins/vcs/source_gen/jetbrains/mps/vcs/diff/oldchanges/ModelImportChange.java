package jetbrains.mps.vcs.diff.oldchanges;

/*Generated by MPS */

import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.SModel;

@Deprecated
public class ModelImportChange extends OldChange {
  private final SModelReference mySModelReference;
  private final boolean myIsDeleted;

  @Deprecated
  public ModelImportChange(SModelReference sModelReference, boolean isDeleted) {
    mySModelReference = sModelReference;
    myIsDeleted = isDeleted;
  }

  public SNodeId getAffectedNodeId() {
    return null;
  }

  public boolean apply(SModel m) {
    if (myIsDeleted) {
      m.deleteModelImport(mySModelReference);
    } else {
      m.addModelImport(mySModelReference, false);
    }
    return false;
  }

  @Override
  public String toString() {
    String format;
    if (myIsDeleted) {
      format = "delete imported model %s";
    } else {
      format = "add imported model %s";
    }
    return String.format(format, mySModelReference.toString());
  }

  @Override
  public OldChangeType getChangeType() {
    return (myIsDeleted ?
      OldChangeType.DELETE :
      OldChangeType.ADD
    );
  }

  public boolean isOppositeTo(ModelImportChange that) {
    return this.mySModelReference.equals(that.mySModelReference) && this.myIsDeleted != that.myIsDeleted;
  }
}
