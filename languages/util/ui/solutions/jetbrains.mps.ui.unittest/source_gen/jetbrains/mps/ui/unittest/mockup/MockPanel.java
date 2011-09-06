package jetbrains.mps.ui.unittest.mockup;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;

public class MockPanel extends MockWidget {
  protected String type;
  private List<MockPanel.WidgetComp> widgets = ListSequence.fromList(new ArrayList<MockPanel.WidgetComp>());

  public MockPanel(String type) {
    this.type = type;
  }

  public MockPanel(MockPanel parent, String type) {
    this.type = type;
    parent.addChild(this);
  }

  public void addChild(MockWidget wdg) {
    this.addChild(wdg, "*default*");
  }

  public void addChild(MockWidget widg, String comp) {
    ListSequence.fromList(this.widgets).addElement(new MockPanel.WidgetComp(widg, comp));
  }

  @Override
  public StringBuilder appendXML(StringBuilder sb) {
    sb.append("<panel type=\"" + this.type + "\">");
    for (MockPanel.WidgetComp w : ListSequence.fromList(this.widgets)) {
      sb.append("<child comp=\"" + w.compartment() + "\">");
      w.widget().appendXML(sb);
      sb.append("</child>");
    }
    sb.append("</panel>");
    return sb;
  }

  public static class WidgetComp extends MultiTuple._2<MockWidget, String> {
    public WidgetComp() {
      super();
    }

    public WidgetComp(MockWidget widget, String compartment) {
      super(widget, compartment);
    }

    public MockWidget widget(MockWidget value) {
      return super._0(value);
    }

    public String compartment(String value) {
      return super._1(value);
    }

    public MockWidget widget() {
      return super._0();
    }

    public String compartment() {
      return super._1();
    }

    @SuppressWarnings(value = "unchecked")
    public MockPanel.WidgetComp assignFrom(Tuples._2<MockWidget, String> from) {
      return (MockPanel.WidgetComp) super.assign(from);
    }
  }
}
