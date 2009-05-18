package jetbrains.mps.lang.test.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestRunParameters;
import com.intellij.util.lang.UrlClassLoader;
import java.net.URL;
import jetbrains.mps.lang.test.runtime.TransformationTestRuner;

public class NodesTestCase_Behavior {

  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getTestSet_1216130724401(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    for(SNode method : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "testMethods", true))) {
      ListSequence.fromList(result).addElement(method);
    }
    for(SNode operation : ListSequence.fromList(SNodeOperations.getDescendants(thisNode, "jetbrains.mps.lang.test.structure.NodeOperation", false))) {
      ListSequence.fromList(result).addElement(operation);
    }
    return result;
  }

  public static TestRunParameters virtual_getTestRunParameters_1216045139515(SNode thisNode) {
    return NodesTestCase_Behavior.getTestRunParameters_1217424543047();
  }

  public static boolean isIntentionApplicable_1217250498008(SNode node) {
    SNode test = SNodeOperations.getAncestor(node, "jetbrains.mps.lang.test.structure.TestNode", true, false);
    return test != null;
  }

  public static List<String> getIdeaClassPath_1217424542979() {
    List<String> result = ListSequence.fromList(new ArrayList<String>());
    ClassLoader classLoader = UrlClassLoader.class.getClassLoader();
    Class cls = classLoader.getClass();
    try {
      List<URL> urls = ((List<URL>)cls.getMethod("getUrls", new Class[0]).invoke(classLoader, new Object[0]));
      for(URL url : urls) {
        ListSequence.fromList(result).addElement(url.getFile());
      }
    } catch (Throwable e) {
    }
    return result;
  }

  public static TestRunParameters getTestRunParameters_1217424543047() {
    TestRunParameters result = new TestRunParameters();
    result.setClassPath(NodesTestCase_Behavior.getIdeaClassPath_1217424542979());
    List<String> vmParams = ListSequence.fromList(new ArrayList<String>());
    ListSequence.fromList(vmParams).addElement("-Xmx1024m");
    result.setVmParameters(vmParams);
    result.setTestRunner(TransformationTestRuner.class.getName());
    return result;
  }

  public static String getTestBodyName_1224602741295() {
    return "TestBody";
  }

}
