package jetbrains.mps.smodel.search;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelReference;

public interface IReferenceInfoResolver {
  /**
   * * Finds node by referenceInfo and optional targetModelReference.
   */
  public SNode resolve(String referenceInfo, SModelReference targetModelReference);
}
