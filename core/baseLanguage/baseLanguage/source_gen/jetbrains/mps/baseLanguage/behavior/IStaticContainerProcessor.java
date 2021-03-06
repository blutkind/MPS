package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;

public interface IStaticContainerProcessor {
  public SNode createNewMethod();
  public void addMethod(SNode method);
  public SNode createMethodCall(SNode methodDeclaration, List<SNode> parameteres);
}
