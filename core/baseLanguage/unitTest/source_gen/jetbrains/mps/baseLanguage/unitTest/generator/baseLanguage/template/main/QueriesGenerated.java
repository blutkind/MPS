package jetbrains.mps.baseLanguage.unitTest.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class QueriesGenerated {
  public static Object propertyMacro_GetPropertyValue_1171932074421(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1171932074456(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_5086493755336418407(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "abstractClass");
  }

  public static boolean ifMacro_Condition_7080278351417154660(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "message", true), "message", true) != null);
  }

  public static boolean ifMacro_Condition_7080278351417154698(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "message", true), "message", true) != null);
  }

  public static boolean ifMacro_Condition_7080278351417154720(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "message", true), "message", true) != null);
  }

  public static boolean ifMacro_Condition_7080278351417154742(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "message", true), "message", true) != null);
  }

  public static boolean ifMacro_Condition_7080278351417154766(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "message", true), "message", true) != null);
  }

  public static boolean ifMacro_Condition_7080278351417156131(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "message", true), "message", true) != null);
  }

  public static boolean ifMacro_Condition_7080278351417189481(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "message", true), "message", true) != null);
  }

  public static SNode sourceNodeQuery_1171932074431(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode superclass = SLinkOperations.getTarget(_context.getNode(), "superclass", true);
    if ((superclass == null)) {
      return new QueriesGenerated.QuotationClass_8087_l523emnela2q().createNode();
    }
    return superclass;
  }

  public static SNode sourceNodeQuery_1171932074447(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1171981176506(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "condition", true);
  }

  public static SNode sourceNodeQuery_1171983960883(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "condition", true);
  }

  public static SNode sourceNodeQuery_1171985891285(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expected", true);
  }

  public static SNode sourceNodeQuery_1171985905856(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "actual", true);
  }

  public static SNode sourceNodeQuery_1172028454624(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_1172078363990(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "statement", true);
  }

  public static SNode sourceNodeQuery_1172078364000(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "message", true);
  }

  public static SNode sourceNodeQuery_1172078364010(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "exceptionType", true);
  }

  public static SNode sourceNodeQuery_7080278351417106724(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_7080278351417153314(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expected", true);
  }

  public static SNode sourceNodeQuery_7080278351417153322(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "actual", true);
  }

  public static SNode sourceNodeQuery_7080278351417154681(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "message", true), "message", true);
  }

  public static SNode sourceNodeQuery_7080278351417154709(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "message", true), "message", true);
  }

  public static SNode sourceNodeQuery_7080278351417154731(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "message", true), "message", true);
  }

  public static SNode sourceNodeQuery_7080278351417154753(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "message", true), "message", true);
  }

  public static SNode sourceNodeQuery_7080278351417154777(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "message", true), "message", true);
  }

  public static SNode sourceNodeQuery_7080278351417156142(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "message", true), "message", true);
  }

  public static SNode sourceNodeQuery_7080278351417189478(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "message", true), "message", true);
  }

  public static Iterable sourceNodesQuery_1171932074411(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "testMethodList", true), "testMethod", true);
  }

  public static Iterable sourceNodesQuery_1171985035236(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "method", true);
  }

  public static Iterable sourceNodesQuery_1171986734537(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "staticField", true);
  }

  public static Iterable sourceNodesQuery_4326291070220018649(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "field", true);
  }

  public static Iterable sourceNodesQuery_9110034126561014534(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "annotation", true);
  }

  public static Iterable sourceNodesQuery_9110034126561076473(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "annotation", true);
  }

  public static class QuotationClass_8087_l523emnela2q {
    public QuotationClass_8087_l523emnela2q() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8087_l523emnel96t = null;
      {
        quotedNode_8087_l523emnel96t = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8087_l523emnel96t = quotedNode_8087_l523emnel96t;
        quotedNode1_8087_l523emnel96t.addReference(SReference.create("classifier", quotedNode1_8087_l523emnel96t, SModelReference.fromString("f:java_stub#junit.framework(junit.framework@java_stub)"), SNodeId.fromString("~TestCase")));
        result = quotedNode1_8087_l523emnel96t;
      }
      return result;
    }
  }
}
