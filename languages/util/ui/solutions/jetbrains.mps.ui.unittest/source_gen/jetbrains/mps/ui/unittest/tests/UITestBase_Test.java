package jetbrains.mps.ui.unittest.tests;

/*Generated by MPS */

import junit.framework.TestCase;
import org.junit.Ignore;
import jetbrains.mps.ui.unittest.mockup.MockWidget;
import jetbrains.mps.ui.unittest.mockup.MockEvent;

public abstract class UITestBase_Test extends TestCase {
  @Ignore
  public void test_dummy() throws Exception {
    //  this is not a test, just a placeholder
  }

  public String toString(MockWidget uio) {
    return ((Object) uio).toString();
  }

  public void setUIProperty(MockWidget uio, String prop, String value) {
    ((MockWidget) uio).setProp(prop, value);
  }

  public void triggerEvent(MockWidget uio, String eventKey, MockEvent event) {
    ((MockWidget) uio).triggerEvent(eventKey, event);
  }
}
