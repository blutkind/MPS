package jetbrains.mps.baseLanguage.classifiers.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.IOperation;

public interface IMemberOperation extends IOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation";
  public static final String MEMBER = "member";

  public IMember getMember();
  public void setMember(IMember node);
}
