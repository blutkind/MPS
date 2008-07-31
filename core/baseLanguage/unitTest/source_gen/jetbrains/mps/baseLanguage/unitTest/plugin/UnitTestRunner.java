package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.BaseRunner;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.LinkedHashMap;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestRunParameters;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestable_Behavior;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.ModelAccess;
import java.util.concurrent.CyclicBarrier;
import jetbrains.mps.logging.Logger;

public class UnitTestRunner extends BaseRunner {

  private JUnitTestViewComponent component;
  private UnitTestPreferencesComponent unitTestPreferences;

  public UnitTestRunner(UnitTestPreferencesComponent unitTestPreferences, JUnitTestViewComponent component) {
    this.component = component;
    this.unitTestPreferences = unitTestPreferences;
  }

  public void run(List<SNode> tests) {
    final LinkedHashMap<TestRunParameters, ArrayList<SNode>> map = new LinkedHashMap<TestRunParameters, ArrayList<SNode>>();
    for(SNode test : tests) {
      TestRunParameters parameters = ITestable_Behavior.call_getTestRunParameters_1216045139515(test);
      if (MapSequence.fromMap(map).containsKey(parameters)) {
        map.get(parameters).add(test);
      } else
      {
        ArrayList<SNode> t = new ArrayList<SNode>();
        t.add(test);
        map.put(parameters, t);
      }
    }
    final UnitTestRunner runner = this;
    Thread thread = new Thread(new Runnable() {

      public void run() {
        for(Map.Entry<TestRunParameters, ArrayList<SNode>> entry : map.entrySet()) {
          runner.runTestWithParameters(entry.getKey(), entry.getValue());
        }
      }

    });
    thread.setDaemon(true);
    thread.start();
  }

  private void runTestWithParameters(final TestRunParameters parameters, final List<SNode> tests) {
    final List<String> params = ListSequence.<String>fromArray();
    this.addJavaCommand(params);
    if (this.unitTestPreferences.useDebug) {
      this.addDebug(params, this.unitTestPreferences.debugPort, false);
    }
    ListSequence.fromList(params).addSequence(ListSequence.fromList(parameters.getVmParameters()));
    this.addDebugParameters(params);
    ModelAccess.instance().runReadAction(new Runnable() {

      public void run() {
        UnitTestRunner.this.addClassPath(params, UnitTestRunner.this.getClasspathString(ListSequence.fromList(tests).first(), parameters.getCalssPath()));
      }

    });
    ListSequence.fromList(params).addElement(parameters.getTestRunner());
    ModelAccess.instance().runReadAction(new Runnable() {

      public void run() {
        for(SNode test : tests) {
          ListSequence.fromList(params).addSequence(ListSequence.fromList(ITestable_Behavior.call_getParametersPart_1215620460293(test)));
        }
      }

    });
    ProcessBuilder p = new ProcessBuilder(params);
    this.component.appendInternal(this.getCommandString(p) + "\n\n");
    try {
      Process pro = p.start();
      UnitTestRunOutputReader outReader = new UnitTestRunOutputReader(pro.getInputStream(), this.component, false);
      UnitTestRunOutputReader errReader = new UnitTestRunOutputReader(pro.getErrorStream(), this.component, true);
      CyclicBarrier barrier = new CyclicBarrier(2, outReader.getExecutor());
      outReader.setBarrier(barrier);
      errReader.setBarrier(barrier);
      outReader.start();
      errReader.start();
      pro.waitFor();
    } catch (Exception e) {
      Logger.getLogger(UnitTestRunner.class).error("Can't run tests", e);
    }
  }

  private void addDebugParameters(List<String> params) {
    ListSequence.fromList(params).addElement("-Xdebug");
    ListSequence.fromList(params).addElement("-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005");
  }

  public String getClasspathString(SNode node, List<String> addictionClassPath) {
    StringBuffer buff = new StringBuffer();
    buff.append(super.getClasspath(node));
    for(String path : addictionClassPath) {
      buff.append(path).append(BaseRunner.ps());
    }
    return buff.toString();
  }

}
