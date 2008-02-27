package jetbrains.mps.generator.template;

import jetbrains.mps.ide.messages.NodeWithContext;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;

import java.util.HashSet;

/**
 * Igor Alshannikov
 * Nov 30, 2007
 */
public class GeneratorLogger {
  private static final Logger LOG = Logger.getLogger(GeneratorLogger.class);

  private IOperationContext myOperationContext;
  private int myWarningsCount;
  private int myErrorsCount;
  private HashSet<SNode> myFailedRules = new HashSet<SNode>();

  public GeneratorLogger(IOperationContext operationContext) {
    myOperationContext = operationContext;
  }

  public void showInformationMessage(SNode node, String message) {
    LOG.info(message, new NodeWithContext(node, myOperationContext));
  }

  public void showWarningMessage(SNode node, String message) {
    myWarningsCount++;
    LOG.warning(message, new NodeWithContext(node, myOperationContext));
  }

  public void showErrorMessage(SNode node, String message) {
    myErrorsCount++;
    LOG.error(message, new NodeWithContext(node, myOperationContext));
  }

  public void showErrorMessage(SNode sourceNode, SNode templateNode, String message) {
    myErrorsCount++;
    showErrorMessage(sourceNode, templateNode, null, message);
  }

  public void showErrorMessage(SNode sourceNode, SNode templateNode, SNode ruleNode, String message) {
    myErrorsCount++;
    if (ruleNode != null) {
      if (myFailedRules.contains(ruleNode)) {
        // do not show duplicating messages
        return;
      }
      myFailedRules.add(ruleNode);
    }

    showErrorMessage((templateNode != null ? templateNode : ruleNode), message);
    if (sourceNode != null) {
      LOG.error("-- was source node: " + sourceNode.getDebugText(),
        new NodeWithContext(sourceNode, myOperationContext));
    }
    if (ruleNode != null) {
      LOG.error("-- was rule: " + ruleNode.getDebugText(),
        new NodeWithContext(ruleNode, myOperationContext));
    }
    if (templateNode != null) {
      LOG.error("-- was template: " + templateNode.getDebugText(),
        new NodeWithContext(templateNode, myOperationContext));
    }
  }

  public int getErrorCount() {
    return myErrorsCount;
  }

  public int getWarningCount() {
    return myWarningsCount;
  }

  public void clearErrorsAndWarnings() {
    myErrorsCount = 0;
    myWarningsCount = 0;
  }
}
