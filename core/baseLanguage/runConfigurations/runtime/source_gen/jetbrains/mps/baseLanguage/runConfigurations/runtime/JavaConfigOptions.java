package jetbrains.mps.baseLanguage.runConfigurations.runtime;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.util.List;
import org.jdesktop.beansbinding.AutoBinding;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.uiLanguage.runtime.events.Events;
import java.awt.GridBagLayout;
import jetbrains.mps.ide.common.LayoutUtil;
import org.jdesktop.beansbinding.Property;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Bindings;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import jetbrains.mps.util.annotation.ToRemove;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.baseLanguage.util.plugin.run.ConfigRunParameters;

public class JavaConfigOptions extends JPanel {
  public JavaConfigOptions myThis;
  private JLabel myComponent_b0;
  private RawLineEditorComponent myVmParam_c0;
  private JLabel myComponent_d0;
  private RawLineEditorComponent myProgramParam_e0;
  private JLabel myComponent_f0;
  private FieldWithPathChooseDialog myWorkingDir_g0;
  private JCheckBox myComponent_h0;
  private FieldWithPathChooseDialog myJreHome_i0;
  private String myProgramParameters;
  private String myVmOptions;
  private String myWorkingDirectory;
  private String myJrePath;
  private boolean myUseAlternativeJRE;
  public List<AutoBinding> myBindings = ListSequence.fromList(new ArrayList<AutoBinding>());
  private Events myEvents = new Events(null) {
    {
    }

    public void initialize() {
    }
  };

  public JavaConfigOptions() {
    this.myThis = this;
    JavaConfigOptions component = this;
    component.setLayout(new GridBagLayout());
    component.add(this.createComponent_b0(), LayoutUtil.createLabelConstraints(0));
    component.add(this.createComponent_c0(), LayoutUtil.createPanelConstraints(1));
    component.add(this.createComponent_d0(), LayoutUtil.createLabelConstraints(2));
    component.add(this.createComponent_e0(), LayoutUtil.createPanelConstraints(3));
    component.add(this.createComponent_f0(), LayoutUtil.createLabelConstraints(4));
    component.add(this.createComponent_g0(), LayoutUtil.createPanelConstraints(5));
    component.add(this.createComponent_h0(), LayoutUtil.createLabelConstraints(9));
    component.add(this.createComponent_i0(), LayoutUtil.createPanelConstraints(10));
    this.myEvents.initialize();
  }

  public Events getEvents() {
    return this.myEvents;
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
      Property sourceProperty = BeanProperty.create("vmOptions");
      Object targetObject = this.myVmParam_c0;
      Property targetProperty = BeanProperty.create("text");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      ListSequence.fromList(this.myBindings).addElement(binding);
    }
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("programParameters");
      Object targetObject = this.myProgramParam_e0;
      Property targetProperty = BeanProperty.create("text");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      ListSequence.fromList(this.myBindings).addElement(binding);
    }
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("workingDirectory");
      Object targetObject = this.myWorkingDir_g0;
      Property targetProperty = BeanProperty.create("text");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      ListSequence.fromList(this.myBindings).addElement(binding);
    }
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("useAlternativeJRE");
      Object targetObject = this.myComponent_h0;
      Property targetProperty = BeanProperty.create("selected");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      ListSequence.fromList(this.myBindings).addElement(binding);
    }
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("jrePath");
      Object targetObject = this.myJreHome_i0;
      Property targetProperty = BeanProperty.create("text");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      ListSequence.fromList(this.myBindings).addElement(binding);
    }
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("useAlternativeJRE");
      Object targetObject = this.myJreHome_i0;
      Property targetProperty = BeanProperty.create("editable");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      ListSequence.fromList(this.myBindings).addElement(binding);
    }
  }

  private void unbind() {
    for (AutoBinding binding : this.myBindings) {
      if (binding.isBound()) {
        binding.unbind();
      }
    }
  }

  private JLabel createComponent_b0() {
    JLabel component = new JLabel();
    this.myComponent_b0 = component;
    component.setText("VM Parameters:");
    return component;
  }

  private RawLineEditorComponent createComponent_c0() {
    RawLineEditorComponent component = new RawLineEditorComponent();
    this.myVmParam_c0 = component;
    component.setDialogCaption("VM Parameters");
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onChangeVMParams();
      }
    });
    return component;
  }

  private JLabel createComponent_d0() {
    JLabel component = new JLabel();
    this.myComponent_d0 = component;
    component.setText("Program Parameters:");
    return component;
  }

  private RawLineEditorComponent createComponent_e0() {
    RawLineEditorComponent component = new RawLineEditorComponent();
    this.myProgramParam_e0 = component;
    component.setDialogCaption("Program Parameters");
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onChangeProgramParams();
      }
    });
    return component;
  }

  private JLabel createComponent_f0() {
    JLabel component = new JLabel();
    this.myComponent_f0 = component;
    component.setText("Working Directory:");
    return component;
  }

  private FieldWithPathChooseDialog createComponent_g0() {
    FieldWithPathChooseDialog component = new FieldWithPathChooseDialog();
    this.myWorkingDir_g0 = component;
    component.setTitle("Select Working Directory");
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onChangeWorkingDir();
      }
    });
    return component;
  }

  private JCheckBox createComponent_h0() {
    JCheckBox component = new JCheckBox();
    this.myComponent_h0 = component;
    component.setText("Use alternative JRE");
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onCheckUseAlternativeJRE();
      }
    });
    return component;
  }

  private FieldWithPathChooseDialog createComponent_i0() {
    FieldWithPathChooseDialog component = new FieldWithPathChooseDialog();
    this.myJreHome_i0 = component;
    component.setTitle("Select Alternative JRE home");
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onChangeAlternativeJRE();
      }
    });
    return component;
  }

  public String getProgramParameters() {
    return this.myProgramParameters;
  }

  public String getVmOptions() {
    return this.myVmOptions;
  }

  public String getWorkingDirectory() {
    return this.myWorkingDirectory;
  }

  public String getJrePath() {
    return this.myJrePath;
  }

  public boolean getUseAlternativeJRE() {
    return this.myUseAlternativeJRE;
  }

  public void setProgramParameters(String newValue) {
    String oldValue = this.myProgramParameters;
    this.myProgramParameters = newValue;
    this.firePropertyChange("programParameters", oldValue, newValue);
  }

  public void setVmOptions(String newValue) {
    String oldValue = this.myVmOptions;
    this.myVmOptions = newValue;
    this.firePropertyChange("vmOptions", oldValue, newValue);
  }

  public void setWorkingDirectory(String newValue) {
    String oldValue = this.myWorkingDirectory;
    this.myWorkingDirectory = newValue;
    this.firePropertyChange("workingDirectory", oldValue, newValue);
  }

  public void setJrePath(String newValue) {
    String oldValue = this.myJrePath;
    this.myJrePath = newValue;
    this.firePropertyChange("jrePath", oldValue, newValue);
  }

  public void setUseAlternativeJRE(boolean newValue) {
    boolean oldValue = this.myUseAlternativeJRE;
    this.myUseAlternativeJRE = newValue;
    this.firePropertyChange("useAlternativeJRE", oldValue, newValue);
  }

  @Deprecated
  @ToRemove(version = 2.0)
  public void reset(@Nullable ConfigRunParameters config) {
    if (config != null) {
      myThis.setProgramParameters(config.getProgramParameters());
      myThis.setVmOptions(config.getVMParameters());
      myThis.setWorkingDirectory(config.getWorkingDirectory());
      myThis.setJrePath(config.getAlternativeJRE());
      myThis.setUseAlternativeJRE(config.getUseAlternativeJRE());
    }
  }

  @Deprecated
  @ToRemove(version = 2.0)
  public void apply(@Nullable ConfigRunParameters config) {
    if (config != null) {
      config.setVMParameters(myThis.getVmOptions());
      config.setProgramParameters(myThis.getProgramParameters());
      config.setWorkingDirectory(myThis.getWorkingDirectory());
      config.setAlternativeJRE(myThis.getJrePath());
      config.setUseAlternativeJRE(myThis.getUseAlternativeJRE());
    }
  }

  public void reset(@Nullable JavaRunParameters javaOptions) {
    if (javaOptions == null) {
      return;
    }
    myThis.setProgramParameters(javaOptions.programParameters());
    myThis.setVmOptions(javaOptions.vmOptions());
    myThis.setWorkingDirectory(javaOptions.workingDirectory());
    myThis.setUseAlternativeJRE((boolean) javaOptions.useAlternativeJre());
    myThis.setJrePath(javaOptions.jrePath());
  }

  public void apply(@Nullable JavaRunParameters javaOptions) {
    if (javaOptions == null) {
      // todo can it really be null? 
      return;
    }
    javaOptions.programParameters(myThis.getProgramParameters());
    javaOptions.vmOptions(myThis.getVmOptions());
    javaOptions.workingDirectory(javaOptions.workingDirectory());
    javaOptions.useAlternativeJre((boolean) javaOptions.useAlternativeJre());
    javaOptions.jrePath(javaOptions.jrePath());
  }

  public void dispose() {
    myThis.myJreHome_i0.dispose();
    myThis.myWorkingDir_g0.dispose();
    myThis.myProgramParam_e0.dispose();
    myThis.myVmParam_c0.dispose();
  }

  public void onChangeAlternativeJRE() {
    myThis.setJrePath(myThis.myJreHome_i0.getText());
  }

  public void onCheckUseAlternativeJRE() {
    myThis.myJreHome_i0.setEditable(myThis.getUseAlternativeJRE());
  }

  public void onChangeWorkingDir() {
    myThis.setWorkingDirectory(myThis.myWorkingDir_g0.getText());
  }

  public void onChangeVMParams() {
    myThis.setVmOptions(myThis.myVmParam_c0.getText());
  }

  public void onChangeProgramParams() {
    myThis.setProgramParameters(myThis.myProgramParam_e0.getText());
  }
}
