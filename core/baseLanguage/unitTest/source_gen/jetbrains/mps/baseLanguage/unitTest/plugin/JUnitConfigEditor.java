package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.JLabel;
import jetbrains.mps.uiLanguage.runtime.JbRadioButton;
import jetbrains.mps.baseLanguage.plugin.JavaConfigOptions;
import jetbrains.mps.project.MPSProject;
import javax.swing.ButtonGroup;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import org.jdesktop.beansbinding.AutoBinding;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.uiLanguage.runtime.events.Events;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.ide.DataManager;
import java.awt.GridBagLayout;
import jetbrains.mps.baseLanguage.plugin.LayoutUtil;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestMethod_Behavior;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.baseLanguage.plugin.ConfigRunParameters;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class JUnitConfigEditor extends JPanel {
  public JUnitConfigEditor myThis;
  private JPanel myComponent0;
  private JLabel myComponent1;
  private JbRadioButton myIsModule0;
  private JbRadioButton myIsModel0;
  private JbRadioButton myIsClass0;
  private JbRadioButton myIsMethod0;
  private JPanel myComponent2;
  private JPanel myModulePanel0;
  private JLabel myComponent3;
  private ModuleChooserComponent myModuleName0;
  private JPanel myModelPanel0;
  private JLabel myComponent4;
  private ModelChooserComponent myModelName0;
  private JPanel myTestPanel0;
  private JLabel myComponent5;
  private NodeChooserComponent myNodeName0;
  private JPanel myMethodPanel0;
  private JLabel myComponent6;
  private NodeChooserComponent myNodeNameWithMethod0;
  private JLabel myComponent7;
  private MethodChooserComponent myMethodName0;
  private JavaConfigOptions myJavaOptions0;
  private MPSProject myProject;
  private ButtonGroup myGroup;
  private SModel myModel;
  private IModule myModule;
  private SNode myNode;
  private SNode myMethod;
  public List<AutoBinding> myBindings = ListSequence.fromList(new ArrayList<AutoBinding>());
  private Events myEvents = new Events(null) {
    {
    }

    public void initialize() {
    }
  };

  public JUnitConfigEditor() {
    this.myThis = this;
    JUnitConfigEditor component = this;
    myThis.setProject(MPSDataKeys.MPS_PROJECT.getData(DataManager.getInstance().getDataContext()));
    myThis.setGroup(new ButtonGroup());
    component.setLayout(new GridBagLayout());
    component.add(this.createComponent0(), LayoutUtil.createFieldConstraints(0));
    component.add(this.createComponent6(), LayoutUtil.createPanelConstraints(1));
    component.add(this.createComponent21(), LayoutUtil.createPanelConstraints(2));
    this.myEvents.initialize();
    myThis.myJavaOptions0.setMakeBeforeRun(true);
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
  }

  private void unbind() {
    for (AutoBinding binding : this.myBindings) {
      if (binding.isBound()) {
        binding.unbind();
      }
    }
  }

  private JPanel createComponent0() {
    JPanel component = new JPanel();
    this.myComponent0 = component;
    component.setLayout(new FlowLayout(FlowLayout.LEFT));
    component.add(this.createComponent1());
    component.add(this.createComponent2());
    component.add(this.createComponent3());
    component.add(this.createComponent4());
    component.add(this.createComponent5());
    return component;
  }

  private JLabel createComponent1() {
    JLabel component = new JLabel();
    this.myComponent1 = component;
    component.setText("Test:");
    return component;
  }

  private JbRadioButton createComponent2() {
    JbRadioButton component = new JbRadioButton();
    this.myIsModule0 = component;
    component.setText("All in Module");
    component.setGroup(myThis.getGroup());
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onSelect();
      }
    });
    return component;
  }

  private JbRadioButton createComponent3() {
    JbRadioButton component = new JbRadioButton();
    this.myIsModel0 = component;
    component.setText("All in Model");
    component.setGroup(myThis.getGroup());
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onSelect();
      }
    });
    return component;
  }

  private JbRadioButton createComponent4() {
    JbRadioButton component = new JbRadioButton();
    this.myIsClass0 = component;
    component.setText("Class");
    component.setGroup(myThis.getGroup());
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onSelect();
      }
    });
    return component;
  }

  private JbRadioButton createComponent5() {
    JbRadioButton component = new JbRadioButton();
    this.myIsMethod0 = component;
    component.setText("Method");
    component.setGroup(myThis.getGroup());
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onSelect();
      }
    });
    return component;
  }

  private JPanel createComponent6() {
    JPanel component = new JPanel();
    this.myComponent2 = component;
    component.setBorder(new TitledBorder("Test"));
    component.setLayout(new GridBagLayout());
    component.add(this.createComponent7(), LayoutUtil.createPanelConstraints(0));
    component.add(this.createComponent10(), LayoutUtil.createPanelConstraints(0));
    component.add(this.createComponent13(), LayoutUtil.createPanelConstraints(0));
    component.add(this.createComponent16(), LayoutUtil.createPanelConstraints(0));
    return component;
  }

  private JPanel createComponent7() {
    JPanel component = new JPanel();
    this.myModulePanel0 = component;
    component.setLayout(new GridBagLayout());
    component.add(this.createComponent8(), LayoutUtil.createLabelConstraints(0));
    component.add(this.createComponent9(), LayoutUtil.createPanelConstraints(1));
    return component;
  }

  private JLabel createComponent8() {
    JLabel component = new JLabel();
    this.myComponent3 = component;
    component.setText("Module:");
    return component;
  }

  private ModuleChooserComponent createComponent9() {
    ModuleChooserComponent component = new ModuleChooserComponent();
    this.myModuleName0 = component;
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onModuleChange();
      }
    });
    return component;
  }

  private JPanel createComponent10() {
    JPanel component = new JPanel();
    this.myModelPanel0 = component;
    component.setLayout(new GridBagLayout());
    component.add(this.createComponent11(), LayoutUtil.createLabelConstraints(0));
    component.add(this.createComponent12(), LayoutUtil.createPanelConstraints(1));
    return component;
  }

  private JLabel createComponent11() {
    JLabel component = new JLabel();
    this.myComponent4 = component;
    component.setText("Model:");
    return component;
  }

  private ModelChooserComponent createComponent12() {
    ModelChooserComponent component = new ModelChooserComponent();
    this.myModelName0 = component;
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onModelChange();
      }
    });
    return component;
  }

  private JPanel createComponent13() {
    JPanel component = new JPanel();
    this.myTestPanel0 = component;
    component.setLayout(new GridBagLayout());
    component.add(this.createComponent14(), LayoutUtil.createLabelConstraints(0));
    component.add(this.createComponent15(), LayoutUtil.createPanelConstraints(1));
    return component;
  }

  private JLabel createComponent14() {
    JLabel component = new JLabel();
    this.myComponent5 = component;
    component.setText("Class:");
    return component;
  }

  private NodeChooserComponent createComponent15() {
    NodeChooserComponent component = new NodeChooserComponent();
    this.myNodeName0 = component;
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onNodeChange();
      }
    });
    return component;
  }

  private JPanel createComponent16() {
    JPanel component = new JPanel();
    this.myMethodPanel0 = component;
    component.setLayout(new GridBagLayout());
    component.add(this.createComponent17(), LayoutUtil.createLabelConstraints(0));
    component.add(this.createComponent18(), LayoutUtil.createPanelConstraints(1));
    component.add(this.createComponent19(), LayoutUtil.createLabelConstraints(2));
    component.add(this.createComponent20(), LayoutUtil.createPanelConstraints(3));
    return component;
  }

  private JLabel createComponent17() {
    JLabel component = new JLabel();
    this.myComponent6 = component;
    component.setText("Class:");
    return component;
  }

  private NodeChooserComponent createComponent18() {
    NodeChooserComponent component = new NodeChooserComponent();
    this.myNodeNameWithMethod0 = component;
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onMainNodeChange();
      }
    });
    return component;
  }

  private JLabel createComponent19() {
    JLabel component = new JLabel();
    this.myComponent7 = component;
    component.setText("Method");
    return component;
  }

  private MethodChooserComponent createComponent20() {
    MethodChooserComponent component = new MethodChooserComponent();
    this.myMethodName0 = component;
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onMethodChange();
      }
    });
    return component;
  }

  private JavaConfigOptions createComponent21() {
    JavaConfigOptions component = new JavaConfigOptions();
    this.myJavaOptions0 = component;
    return component;
  }

  public MPSProject getProject() {
    return this.myProject;
  }

  public ButtonGroup getGroup() {
    return this.myGroup;
  }

  public SModel getModel() {
    return this.myModel;
  }

  public IModule getModule() {
    return this.myModule;
  }

  public SNode getNode() {
    return this.myNode;
  }

  public SNode getMethod() {
    return this.myMethod;
  }

  public void setProject(MPSProject newValue) {
    MPSProject oldValue = this.myProject;
    this.myProject = newValue;
    this.firePropertyChange("project", oldValue, newValue);
  }

  public void setGroup(ButtonGroup newValue) {
    ButtonGroup oldValue = this.myGroup;
    this.myGroup = newValue;
    this.firePropertyChange("group", oldValue, newValue);
  }

  public void setModel(SModel newValue) {
    SModel oldValue = this.myModel;
    this.myModel = newValue;
    this.firePropertyChange("model", oldValue, newValue);
  }

  public void setModule(IModule newValue) {
    IModule oldValue = this.myModule;
    this.myModule = newValue;
    this.firePropertyChange("module", oldValue, newValue);
  }

  public void setNode(SNode newValue) {
    SNode oldValue = this.myNode;
    this.myNode = newValue;
    this.firePropertyChange("node", oldValue, newValue);
  }

  public void setMethod(SNode newValue) {
    SNode oldValue = this.myMethod;
    this.myMethod = newValue;
    this.firePropertyChange("method", oldValue, newValue);
  }

  private void setModuleValue(final String moduleName) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        myThis.setModule(TestRunUtil.getModule(moduleName));
      }
    });
  }

  private void setModelValue(final String modelName) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        myThis.setModel(TestRunUtil.getModel(modelName));
      }
    });
  }

  private void setNodeValue(final String nodeName) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        myThis.setNode(TestRunUtil.getTestNode(nodeName));
      }
    });
  }

  private void setMethodValue(final String nodeName, final String methodName) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        myThis.setMethod(TestRunUtil.getTestMethod(nodeName, methodName));
      }
    });
  }

  public void apply(final DefaultJUnit_Configuration config) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        config.getStateObject().method = ITestMethod_Behavior.call_getTestName_1216136419751(myThis.getMethod());
        config.getStateObject().node = INamedConcept_Behavior.call_getFqName_1213877404258(myThis.getNode());
        config.getStateObject().model = (myThis.getModel() != null ?
          config.getStateObject().model = myThis.getModel().getSModelFqName().toString() :
          null
        );
        if (myThis.getModule() != null) {
          config.getStateObject().module = myThis.getModule().getModuleFqName();
          config.getStateObject().compileInMPS = myThis.getModule().isCompileInMPS();
        } else {
          config.getStateObject().module = null;
        }
        JUnitRunTypes type = JUnitRunTypes.getType(myThis.myIsModule0.isSelected(), myThis.myIsModel0.isSelected(), myThis.myIsClass0.isSelected(), myThis.myIsMethod0.isSelected());
        if (type != null) {
          config.getStateObject().type = type;
        }
        if (config.getStateObject().myParams == null) {
          config.getStateObject().myParams = new ConfigRunParameters(config.getStateObject().compileInMPS);
        }
        myThis.myJavaOptions0.apply(config.getStateObject().myParams);
      }
    });
  }

  public void reset(final DefaultJUnit_Configuration config) {
    if (config.getStateObject().type != null) {
      switch (config.getStateObject().type) {
        case METHOD:
          myThis.myIsMethod0.setSelected(true);
          break;
        case NODE:
          myThis.myIsClass0.setSelected(true);
          break;
        case MODEL:
          myThis.myIsModel0.setSelected(true);
          break;
        case MODULE:
          myThis.myIsModule0.setSelected(true);
          break;
        default:
      }
    } else {
      myThis.myIsModule0.setSelected(true);
    }
    if (config.getStateObject().node != null) {
      myThis.setNodeValue(config.getStateObject().node);
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          String nodeFqName = config.getStateObject().node;
          myThis.myNodeName0.setText(nodeFqName);
          myThis.myNodeNameWithMethod0.setText(nodeFqName);
          myThis.myMethodName0.setTestCase(nodeFqName);
          if (myThis.getNode() != null && SNodeOperations.getModel(myThis.getNode()) != null) {
            String modelName = SNodeOperations.getModel(myThis.getNode()).getSModelFqName().toString();
            myThis.setModelValue(modelName);
            myThis.myModelName0.setText(modelName);
            if (SNodeOperations.getModel(myThis.getNode()).getModelDescriptor() != null && SNodeOperations.getModel(myThis.getNode()).getModelDescriptor().getModule() != null) {
              String moduleName = SNodeOperations.getModel(myThis.getNode()).getModelDescriptor().getModule().getModuleFqName();
              myThis.setModuleValue(moduleName);
              myThis.myModuleName0.setText(moduleName);
            }
          }
        }
      });
      if (config.getStateObject().method != null) {
        myThis.setMethodValue(config.getStateObject().node, config.getStateObject().method);
        myThis.myMethodName0.setText(config.getStateObject().method);
      }
    }
    if (config.getStateObject().model != null) {
      myThis.setModelValue(config.getStateObject().model);
      if (myThis.getModel() != null && myThis.getModel().getModelDescriptor() != null && myThis.getModel().getModelDescriptor().getModule() != null) {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            myThis.myModelName0.setText(config.getStateObject().model);
            String moduleName = myThis.getModel().getModelDescriptor().getModule().getModuleFqName();
            myThis.setModuleValue(moduleName);
            myThis.myModuleName0.setText(moduleName);
          }
        });
      }
    }
    if (config.getStateObject().module != null) {
      myThis.setModuleValue(config.getStateObject().module);
      myThis.myModuleName0.setText(config.getStateObject().module);
    }
    myThis.onSelect();
    myThis.myJavaOptions0.reset(config.getStateObject().myParams);
  }

  public void onSelect() {
    myThis.myModulePanel0.setVisible(false);
    myThis.myModelPanel0.setVisible(false);
    myThis.myTestPanel0.setVisible(false);
    myThis.myMethodPanel0.setVisible(false);
    if (myThis.myIsModule0.isSelected()) {
      myThis.myModulePanel0.setVisible(true);
    } else if (myThis.myIsModel0.isSelected()) {
      myThis.myModelPanel0.setVisible(true);
    } else if (myThis.myIsClass0.isSelected()) {
      myThis.myTestPanel0.setVisible(true);
    } else if (myThis.myIsMethod0.isSelected()) {
      myThis.myMethodPanel0.setVisible(true);
    }
  }

  public void setMethodOwner() {
    myThis.myMethodName0.setTestCase(myThis.myNodeNameWithMethod0.getText());
  }

  public void onModelChange() {
    myThis.setModelValue(myThis.myModelName0.getText());
  }

  public void onModuleChange() {
    myThis.setModuleValue(myThis.myModuleName0.getText());
  }

  public void onNodeChange() {
    myThis.setNodeValue(myThis.myNodeName0.getText());
  }

  public void onMainNodeChange() {
    myThis.setNodeValue(myThis.myNodeNameWithMethod0.getText());
    myThis.myMethodName0.setTestCase(myThis.myNodeNameWithMethod0.getText());
  }

  public void onMethodChange() {
    myThis.setMethodValue(myThis.myNodeNameWithMethod0.getText(), myThis.myMethodName0.getText());
  }
}
