package jetbrains.mps.make.unittest;

/*Generated by MPS */

import org.junit.runner.RunWith;
import org.jmock.integration.junit4.JMock;
import jetbrains.mps.make.facet.IFacet;
import org.junit.Test;
import jetbrains.mps.make.script.ScriptBuilder;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.make.script.IScript;
import junit.framework.Assert;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.testbench.junit.ExpectLogEvent;
import org.apache.log4j.Priority;
import org.junit.After;
import jetbrains.mps.make.facet.FacetRegistry;
import org.junit.Before;
import org.jmock.Expectations;

@RunWith(JMock.class)
public class ScriptBuilder_Test extends MockTestCase {
  private IFacet[] facets;

  @Test
  public void test_make() throws Exception {
    ScriptBuilder scb = new ScriptBuilder();
    scb.withFacetNames(Sequence.fromIterable(Sequence.fromArray(facets)).<IFacet.Name>select(new ISelector<IFacet, IFacet.Name>() {
      public IFacet.Name select(IFacet f) {
        return f.getName();
      }
    }));
    scb.withFinalTarget(new ITarget.Name("make"));
    IScript sc = scb.toScript();
    Assert.assertNotNull(sc);
    Assert.assertTrue(sc.isValid());
    List<ITarget.Name> expected = ListSequence.fromListAndArray(new ArrayList<ITarget.Name>(), new ITarget.Name("cfg"), new ITarget.Name("gen"), new ITarget.Name("textgen"), new ITarget.Name("make"));
    Utils.assertSameSequence(expected, Sequence.fromIterable(sc.allTargets()).<ITarget.Name>select(new ISelector<ITarget, ITarget.Name>() {
      public ITarget.Name select(ITarget t) {
        return t.getName();
      }
    }));
  }

  @Test
  public void test_gen() throws Exception {
    ScriptBuilder scb = new ScriptBuilder();
    scb.withFacetNames(Sequence.fromIterable(Sequence.fromArray(facets)).<IFacet.Name>select(new ISelector<IFacet, IFacet.Name>() {
      public IFacet.Name select(IFacet f) {
        return f.getName();
      }
    }));
    scb.withFinalTarget(new ITarget.Name("make"));
    IScript sc = scb.toScript();
    Assert.assertNotNull(sc);
    Assert.assertTrue(sc.isValid());
    List<ITarget.Name> expected = ListSequence.fromListAndArray(new ArrayList<ITarget.Name>(), new ITarget.Name("cfg"), new ITarget.Name("gen"), new ITarget.Name("textgen"), new ITarget.Name("make"));
    Utils.assertSameSequence(expected, Sequence.fromIterable(sc.allTargets()).<ITarget.Name>select(new ISelector<ITarget, ITarget.Name>() {
      public ITarget.Name select(ITarget t) {
        return t.getName();
      }
    }));
  }

  @Test
  @ExpectLogEvent(text = "target not found: ITarget.Name[none]", level = Priority.ERROR_INT)
  public void test_none() throws Exception {
    ScriptBuilder scb = new ScriptBuilder();
    scb.withFacetNames(Sequence.fromIterable(Sequence.fromArray(facets)).<IFacet.Name>select(new ISelector<IFacet, IFacet.Name>() {
      public IFacet.Name select(IFacet f) {
        return f.getName();
      }
    }));
    scb.withAuxTarget(new ITarget.Name("none"));
    IScript sc = scb.toScript();
    Assert.assertNotNull(sc);
    Assert.assertFalse(sc.isValid());
  }

  @After
  public void tearDown() throws Exception {
    for (IFacet fn : Sequence.fromIterable(Sequence.fromArray(facets))) {
      FacetRegistry.getInstance().unregister(fn);
    }
    context.assertIsSatisfied();
  }

  @Before
  public void setUp() throws Exception {
    final IFacet fmake = Mockups.facet(context, "Make_");
    final ITarget tmake = Mockups.target(context, "make", new ITarget.Name("make"));
    final IFacet fgen = Mockups.facet(context, "Gen");
    final ITarget tgen = Mockups.target(context, "gen", new ITarget.Name("gen"));
    final ITarget tcfg = Mockups.target(context, "cfg", new ITarget.Name("cfg"));
    final IFacet ftextgen = Mockups.facet(context, "Textgen_");
    final ITarget ttextgen = Mockups.target(context, "textgen", new ITarget.Name("textgen"));
    context.checking(new Expectations() {
      {
        atLeast(1).of(fmake).targets();
        will(returnValue(Sequence.fromArray(new ITarget[]{tmake})));

        atLeast(1).of(fgen).required();
        will(returnValue(Sequence.fromArray(new IFacet.Name[]{fmake.getName()})));
        atLeast(1).of(fgen).targets();
        will(returnValue(Sequence.fromArray(new ITarget[]{tgen, tcfg})));

        allowing(tgen).before();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")})));
        allowing(tgen).after();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("cfg")})));

        atLeast(1).of(ftextgen).required();
        will(returnValue(Sequence.fromArray(new IFacet.Name[]{fmake.getName(), fgen.getName()})));
        atLeast(1).of(ftextgen).targets();
        will(returnValue(Sequence.fromArray(new ITarget[]{ttextgen})));

        allowing(ttextgen).before();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")})));
        allowing(ttextgen).after();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("gen")})));
      }
    });
    FacetRegistry.getInstance().register(fmake);
    FacetRegistry.getInstance().register(fgen);
    FacetRegistry.getInstance().register(ftextgen);
    Mockups.allowing(context, fmake);
    Mockups.allowing(context, fgen);
    Mockups.allowing(context, ftextgen);
    this.facets = new IFacet[]{fmake, fgen, ftextgen};
    Mockups.allowing(context, tmake);
    Mockups.allowing(context, tgen);
    Mockups.allowing(context, tcfg);
    Mockups.allowing(context, ttextgen);
  }
}
