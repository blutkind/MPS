package jetbrains.mps.transformationTest.matcher;

import org.junit.Test;
import jetbrains.mps.smodel.*;
import jetbrains.mps.TestMain;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.util.Macros;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.project.MPSProject;

import java.io.File;
import java.util.Arrays;
import java.lang.reflect.InvocationTargetException;

import junit.framework.Assert;

import javax.swing.SwingUtilities;

/**
 * Created by IntelliJ IDEA.
 */
public class TransformationTests {

  @Test
  public void equalNodeTest() throws Throwable {
    TestMain.configureMPS();
    MPSProject project = TestMain.loadProject(new File(Macros.mpsHomeMacros().expandPath("${mps_home}platform/transformationTest/transformationTest.mpr", ((IFile)null))));

    runCommand(new Runnable() {
      public void run() {
        SModel m = getModel();
        SNode s1 = m.getRootByName("c1");
        SNode s2 = m.getRootByName("c1");
        Assert.assertEquals(null, NodesMatcher.matchNodes(s1, s2));
      }
    }, project);
  }

  @Test
  public void conceptDiffernse() {
    TestMain.configureMPS();
    MPSProject project = TestMain.loadProject(new File(Macros.mpsHomeMacros().expandPath("${mps_home}platform/transformationTest/transformationTest.mpr", ((IFile)null))));

    runCommand(new Runnable() {
      public void run() {
        SModel m = getModel();
        SNode s1 = m.getRootByName("i1");
        SNode s2 = m.getRootByName("c2");
        NodeDifference d = difference("i1", new ConceptDifference("jetbrains.mps.baseLanguage.structure.Interface", "jetbrains.mps.baseLanguage.structure.ClassConcept"));
        Assert.assertEquals(d, NodesMatcher.matchNodes(s1, s2));
      }
    }, project);
  }

  @Test
  public void propertyDiffernce() {
    TestMain.configureMPS();
    MPSProject project = TestMain.loadProject(new File(Macros.mpsHomeMacros().expandPath("${mps_home}platform/transformationTest/transformationTest.mpr", ((IFile)null))));

    runCommand(new Runnable() {
      public void run() {
        SModel m = getModel();
        SNode s1 = m.getRootByName("c1");
        SNode s2 = m.getRootByName("c2");
        NodeDifference d = difference("c1", new PropertyDifferense("name"));
        Assert.assertEquals(d, NodesMatcher.matchNodes(s1, s2));
      }
    }, project);
  }

  private NodeDifference difference(String name, DifferanceItem ... items) {
    return new NodeDifference(name, Arrays.asList(items));
  }

  @Test
  public void childrenDiffernce() {
    MPSProject project = TestMain.loadProject(new File(Macros.mpsHomeMacros().expandPath("${mps_home}platform/transformationTest/transformationTest.mpr", ((IFile)null))));

    runCommand(new Runnable() {
      public void run() {
        final SModel m = getModel();
        SNode s1 = m.getRootByName("c1");
        SNode s2 = m.getRootByName("differentMethod");
        NodeDifference d = difference("c1",
                new PropertyDifferense("name"),
                new ChildrenCountDifference("field", 1, 2),
                difference("m():void",
                        new PropertyDifferense("name")));
        Assert.assertEquals(d, NodesMatcher.matchNodes(s1, s2));
      }
    }, project);
  }

  @Test
  public void referenceDiffernce() {
    TestMain.configureMPS();
    MPSProject project = TestMain.loadProject(new File(Macros.mpsHomeMacros().expandPath("${mps_home}platform/transformationTest/transformationTest.mpr", ((IFile)null))));

    runCommand(new Runnable() {
      public void run() {
        SModel m = getModel();
        SNode s1 = m.getRootByName("differentReference1");
        SNode s2 = m.getRootByName("differentReference2");
        NodeDifference d = difference("differentReference1",
                new PropertyDifferense("name"),
                difference("c1",
                        new ReferenceDifferense("classifier", true)),
                difference("m():void",
                        difference("StatementList",
                                difference("ExpressionStatement",
                                        difference("DotExpression",
                                                difference("f1",
                                                        new ReferenceDifferense("fieldDeclaration", true)))))));

        Assert.assertEquals(d, NodesMatcher.matchNodes(s1, s2));
      }
    }, project);
  }



  public SModel getModel() {
    TestMain.configureMPS();
    IdeMain.setTestMode(true);
    final SModelDescriptor sm = SModelRepository.getInstance().getModelDescriptor(SModelReference.fromString("jetbrains.mps.transformationTest.test"));
    return sm.getSModel();
  }

  public void runCommand(final Runnable command, MPSProject project) {
    try {
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          ModelAccess.instance().runWriteActionInCommand(command);
        }
      });
    } catch (InterruptedException e) {
      e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
    } catch (InvocationTargetException e) {
      e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
    } finally {
      if (project != null) {
        project.dispose();
      }
    }

  }
}
