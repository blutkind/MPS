package jetbrains.mps.ide.common;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.List;
import org.jdesktop.beansbinding.AutoBinding;
import java.util.ArrayList;
import java.awt.BorderLayout;
import org.jdesktop.beansbinding.Property;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Bindings;

public class PathField extends JPanel {

  public PathField myThis;
  private JTextField myComponent;
  private JButton myComponent1;
  private String myPath;
  public List<AutoBinding> myBindings = new ArrayList<AutoBinding>();

  public  PathField() {
    this.myThis = this;
    PathField component = this;
    component.setLayout(new BorderLayout());
    component.add(this.createComponent(), BorderLayout.CENTER);
    component.add(this.createComponent1(), BorderLayout.EAST);
  }

  public void addNotify() {
    super.addNotify();
    this.bind();
  }

  public void removeNotify() {
    this.unbind();
    super.removeNotify();
  }

  private void bind() {
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("path");
      Object targetObject = this.myComponent;
      Property targetProperty = BeanProperty.create("text");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      this.myBindings.add(binding);
    }
  }

  private void unbind() {
    for(AutoBinding binding : this.myBindings) {
      if(binding.isBound()) {
        binding.unbind();
      }
    }
  }

  private JTextField createComponent() {
    JTextField component = new JTextField();
    this.myComponent = component;
    component.setColumns(40);
    return component;
  }

  private JButton createComponent1() {
    JButton component = new JButton();
    this.myComponent1 = component;
    component.setText("...");
    return component;
  }

  public String getPath() {
    return this.myPath;
  }

  public void setPath(String newValue) {
    String oldValue = this.myPath;
    this.myPath = newValue;
    this.firePropertyChange("path", oldValue, newValue);
  }

}
