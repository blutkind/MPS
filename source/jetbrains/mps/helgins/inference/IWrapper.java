package jetbrains.mps.helgins.inference;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.EquationManager.ErrorInfo;
import jetbrains.mps.bootstrap.helgins.structure.RuntimeTypeVariable;

/**
 * Created by IntelliJ IDEA.
* User: Cyril.Konopko
* Date: 20.07.2007
* Time: 14:14:15
* To change this template use File | Settings | File Templates.
*/
public interface IWrapper extends IMatcher {
  public SNode getNode();
  public boolean isVariable();
  public boolean isConcrete();
  public RuntimeTypeVariable getVariable();
}
