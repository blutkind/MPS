package jetbrains.mps.samples.xmlLiterals.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class TextMacro_Constraints {

  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    return (SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.samples.xmlLiterals.structure.XmlLiteral", true, false) != null);
  }

}
