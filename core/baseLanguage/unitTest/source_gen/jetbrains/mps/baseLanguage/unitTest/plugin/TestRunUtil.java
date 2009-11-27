package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestCase_Behavior;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestMethod_Behavior;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelReference;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.project.MPSProject;

public class TestRunUtil {
  public TestRunUtil() {
  }

  public static SNode getTestNode(String testNodeName) {
    if (testNodeName == null) {
      return null;
    }
    return (SNode)SModelUtil.findNodeByFQName(testNodeName, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"), GlobalScope.getInstance());
  }

  public static SNode getTestMethod(String testNodeName, String testMethodName) {
    if (testNodeName == null || testMethodName == null) {
      return null;
    }
    SNode test = getTestNode(testNodeName);
    if (test == null) {
      return null;
    }
    for (SNode method : ITestCase_Behavior.call_getTestMethods_2148145109766218395(test)) {
      if (ITestMethod_Behavior.call_getTestName_1216136419751(method).equals(testMethodName)) {
        return method;
      }
    }
    return null;
  }

  public static SModel getModel(String modelName) {
    if (modelName == null) {
      return null;
    }
    SModelDescriptor modelDescriptor = GlobalScope.getInstance().getModelDescriptor(SModelReference.fromString(modelName));
    if (modelDescriptor == null) {
      return null;
    }
    return modelDescriptor.getSModel();
  }

  public static List<SNode> getModelTests(SModel model) {
    List<SNode> tests = new ArrayList<SNode>();
    if (model == null) {
      return tests;
    }
    return SModelOperations.getRoots(model, "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase");
  }

  public static List<SNode> getModuleTests(IModule module) {
    List<SNode> tests = new ArrayList<SNode>();
    for (SModelDescriptor modelDescriptor : module.getOwnModelDescriptors()) {
      ListSequence.fromList(tests).addSequence(ListSequence.fromList(TestRunUtil.getModelTests(modelDescriptor.getSModel())));
    }
    return tests;
  }

  public static List<SNode> getModuleTests(String moduleName) {
    List<SNode> tests = new ArrayList<SNode>();
    if (moduleName == null) {
      return tests;
    }
    for (IModule module : GlobalScope.getInstance().getVisibleModules()) {
      if (module.getModuleFqName().equals(moduleName)) {
        for (SModelDescriptor modelDescriptor : module.getOwnModelDescriptors()) {
          ListSequence.fromList(tests).addSequence(ListSequence.fromList(TestRunUtil.getModelTests(modelDescriptor.getSModel())));
        }
      }
    }
    return tests;
  }

  public static boolean containsTest(MPSProject project) {
    for (IModule module : project.getModules()) {
      if (ListSequence.fromList(getModuleTests(module)).isNotEmpty()) {
        return true;
      }
    }
    return false;
  }

  public static IModule getModule(String moduleName) {
    if (moduleName == null) {
      return null;
    }
    for (IModule module : GlobalScope.getInstance().getVisibleModules()) {
      if (module.getModuleFqName().equals(moduleName)) {
        return module;
      }
    }
    return null;
  }

  public static List<String> getValues(String simple, List<String> collection) {
    List<String> result = ListSequence.fromList(new ArrayList<String>());
    if (simple != null) {
      ListSequence.fromList(result).addElement(simple);
    }
    if (collection != null) {
      ListSequence.fromList(result).addSequence(ListSequence.fromList(collection));
    }
    return result;
  }
}
