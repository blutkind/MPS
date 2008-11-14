package jetbrains.mps.baseLanguage.dates.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.typesystem.inference.SubtypingManager;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.ide.progress.IAdaptiveProgressMonitor;
import jetbrains.mps.ide.progress.NullAdaptiveProgressMonitor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;

public class DateTypeUtil {
  private static SNode dateTimeType = new _Quotations.QuotationClass_0().createNode();
  private static SNode periodType = new _Quotations.QuotationClass_1().createNode();
  private static SNode intType = new _Quotations.QuotationClass_2().createNode();
  private static SNode javaDateType = new _Quotations.QuotationClass_3().createNode();
  private static SNode javaCalendarType = new _Quotations.QuotationClass_4().createNode();
  private static SNode jodaAbstractInstant = new _Quotations.QuotationClass_5().createNode();

  public static boolean isInstanceOfPeriod(SNode node) {
    return isInstanceOf(node, periodType);
  }

  public static boolean isInstanceOfPeriodCompare(SNode compareOperation) {
    return bothOperandsAreNotNull(compareOperation) && isInstanceOfPeriod(SLinkOperations.getTarget(compareOperation, "leftExpression", true));
  }

  public static boolean isInstanceOfDatetime(SNode node) {
    return isInstanceOf(node, dateTimeType);
  }

  public static boolean isInstanceOfInt(SNode node) {
    return isInstanceOf(node, intType);
  }

  public static boolean isInstanceOfJavaDatePresentation(SNode node) {
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.NullLiteral")) {
      return false;
    }
    TypeChecker tc = TypeChecker.getInstance();
    SubtypingManager sm = tc.getSubtypingManager();
    SNode actualType = tc.getTypeOf(node);
    return sm.isSubtype(actualType, javaDateType) || sm.isSubtype(actualType, javaCalendarType) || sm.isSubtype(actualType, jodaAbstractInstant);
  }

  public static boolean bothOperandsAreNotNull(SNode operation) {
    return !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(operation, "leftExpression", true), "jetbrains.mps.baseLanguage.structure.NullLiteral") || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(operation, "rightExpression", true), "jetbrains.mps.baseLanguage.structure.NullLiteral"));
  }

  public static boolean isInstanceOf(SNode node, SNode type) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(node), type, false);
  }

  public static List<SNode> findDateTimeProperties(IScope scope, SModel model) {
    IAdaptiveProgressMonitor pm = new NullAdaptiveProgressMonitor();
    return SModelOperations.getNodesIncludingImported(model, scope, "jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeProperty");
  }

}
