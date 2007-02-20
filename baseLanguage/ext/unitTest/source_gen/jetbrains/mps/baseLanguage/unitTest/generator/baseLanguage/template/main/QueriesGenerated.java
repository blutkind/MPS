package jetbrains.mps.baseLanguage.unitTest.generator.baseLanguage.template.main;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.generator.JavaModelUtil_new;
import junit.framework.TestCase;
import jetbrains.mps.baseLanguage.structure.ClassifierType;
import jetbrains.mps.smodel.BaseAdapter;

public class QueriesGenerated {

  public static String propertyMacro_GetPropertyValue_1171932074421(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "Test_" + SPropertyOperations.getString(node, "testCaseName");
  }
  public static String propertyMacro_GetPropertyValue_1171932074456(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "test_" + SPropertyOperations.getString(node, "methodName");
  }
  public static List sourceNodesQuery_1171932074411(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(node, "testMethodList", true), "testMethod", true);
  }
  public static SNode sourceNodeQuery_1171932074431(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode superclass = SLinkOperations.getTarget(node, "superclass", true);
    if(superclass == null) {
      Classifier classifier = JavaModelUtil_new.findClassifier(TestCase.class);
      ClassifierType classifierType = JavaModelUtil_new.createType(classifier, sourceModel);
      superclass = BaseAdapter.fromAdapter(classifierType);
    }
    return superclass;
  }
  public static SNode sourceNodeQuery_1171932074447(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "statementList", true);
  }
  public static SNode sourceNodeQuery_1171978925030(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "expected", true);
  }
  public static SNode sourceNodeQuery_1171978950203(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "actual", true);
  }
  public static SNode sourceNodeQuery_1171981176506(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "condition", true);
  }
}
