package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.dependencies.CheckingMethod;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.lang.typesystem.dependencies.InferenceMethod;

public class RulesFunctions_Collections {

  @CheckingMethod()
  public static SNode getInput(final TypeCheckingContext typeCheckingContext, SNode op) {
    SNode input = null;
    SNode parent = SNodeOperations.getParent(op);
    if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      input = SLinkOperations.getTarget(SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
    } else
    {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(op, "not expected here", "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184783963366", intentionProvider, errorTarget);
      }
    }
    return input;
  }

  public static SNode getOutput(SNode op) {
    SNode output = null;
    SNode parent = SNodeOperations.getParent(op);
    if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      output = SNodeOperations.as(SLinkOperations.getTarget(SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true), "jetbrains.mps.baseLanguage.collections.structure.SequenceOperation");
      return output;
    } else
    {
      return null;
    }
  }

  @InferenceMethod()
  public static void setInputSequenceType(final TypeCheckingContext typeCheckingContext, SNode op, SNode target) {
    // 1. Take input expression
    // 2. Assert that it is coerceable to sequence
    // 3. Assign the sequence type to the target
    SNode input = getInput(typeCheckingContext, op);
    if ((input != null)) {
      final SNode elementType_typevar_1184784638219 = typeCheckingContext.createNewRuntimeTypesVariable();
      {
        SNode _nodeToCheck_1029348928467 = null;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(input, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184843134901", true), (SNode)new _Quotations.QuotationClass_0().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1184784638219), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184843140648", false, 0, intentionProvider);
      }
      {
        SNode _nodeToCheck_1029348928467 = null;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(target, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184844094867", true), (SNode)new _Quotations.QuotationClass_1().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1184784638219), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184844101686", intentionProvider);
      }
    }
  }

  @InferenceMethod()
  public static void setInputElementType(final TypeCheckingContext typeCheckingContext, SNode op, SNode target) {
    // 1. Take input expression
    // 2. Assert that it is coerceable to sequence
    // 3. Assign the sequence element type to the target
    SNode input = getInput(typeCheckingContext, op);
    if ((input != null)) {
      final SNode elementType_typevar_1184844804662 = typeCheckingContext.createNewRuntimeTypesVariable();
      {
        SNode _nodeToCheck_1029348928467 = null;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(input, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184844804669", true), (SNode)new _Quotations.QuotationClass_2().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1184844804662), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184844804663", false, 0, intentionProvider);
      }
      {
        SNode _nodeToCheck_1029348928467 = null;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(target, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184844804677", true), (SNode)typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1184844804662), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184844804671", intentionProvider);
      }
    }
  }

  @InferenceMethod()
  public static void isInputElementType(final TypeCheckingContext typeCheckingContext, SNode op, SNode target) {
    // 1. Take input expression
    // 2. Assert that it is coerceable to sequence
    // 3. Assert that target has sequence element type
    SNode input = getInput(typeCheckingContext, op);
    if ((input != null)) {
      final SNode elementType_typevar_1184850451264 = typeCheckingContext.createNewRuntimeTypesVariable();
      {
        SNode _nodeToCheck_1029348928467 = null;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(input, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184850451271", true), (SNode)new _Quotations.QuotationClass_3().createNode(typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1184850451264), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184850451265", false, 0, intentionProvider);
      }
      {
        SNode _nodeToCheck_1029348928467 = target;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(target, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184850492037", true), (SNode)typeCheckingContext.getEquationManager().getRepresentator(elementType_typevar_1184850451264), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1184850492036", false, 0, intentionProvider);
      }
    }
  }

}
