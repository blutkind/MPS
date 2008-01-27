package jetbrains.mps.helgins.inference;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.util.Condition;
import jetbrains.mps.helgins.inference.EquationManager.ErrorInfo;
import jetbrains.mps.bootstrap.helgins.structure.RuntimeTypeVariable;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 20.07.2007
 * Time: 14:19:18
 * To change this template use File | Settings | File Templates.
 */
public class WhenConcreteEntity {
  private Runnable myRunnable;
  private String myNodeModel;
  private String myNodeId;
  private Set<SNodePointer> myVariables;
  private IWrapper myWrapperToCheck;

  public WhenConcreteEntity(Runnable runnable) {
    myRunnable = runnable;
  }

  public WhenConcreteEntity(Runnable runnable, String nodeModel, String nodeId) {
    myRunnable = runnable;
    myNodeModel = nodeModel;
    myNodeId = nodeId;
  }

  public Runnable getRunnable() {
    return myRunnable;
  }

  public void run() {
    myRunnable.run();
  }

  public String getNodeModel() {
    return myNodeModel;
  }

  public String getNodeId() {
    return myNodeId;
  }
}
