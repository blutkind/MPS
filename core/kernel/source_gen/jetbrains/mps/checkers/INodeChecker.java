package jetbrains.mps.checkers;

/*Generated by MPS */

import com.intellij.openapi.extensions.ExtensionPointName;
import java.util.Set;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;

public interface INodeChecker {
  public static final ExtensionPointName<INodeChecker> CHECKERS = ExtensionPointName.create("com.intellij.mps.SpecificCheckers");

  public Set<IErrorReporter> getErrors(SNode node, IOperationContext operationContext);
  public String getCategory();
}
