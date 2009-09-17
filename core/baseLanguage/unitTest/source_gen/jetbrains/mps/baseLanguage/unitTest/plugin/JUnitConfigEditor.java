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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.project.GlobalScope;

public class JUnitConfigEditor extends JPanel {
  public JUnitConfigEditor myThis;
  private JPanel myComponent7;
  private JLabel myComponent8;
  private JbRadioButton myIsModule0;
  private JbRadioButton myIsModel0;
  private JbRadioButton myIsClass0;
  private JbRadioButton myIsMethod0;
  private JPanel myComponent9;
  private JPanel myModulePanel0;
  private JLabel myComponent10;
  private ModuleChooserComponent myModuleName0;
  private JPanel myModelPanel0;
  private JLabel myComponent11;
  private ModelChooserComponent myModelName0;
  private JPanel myTestPanel0;
  private JLabel myComponent12;
  private NodeChooserComponent myNodeName0;
  private JPanel myMethodPanel0;
  private JLabel myComponent13;
  private NodeChooserComponent myNodeNameWithMethod0;
  private JLabel myComponent14;
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
    component.add(this.createComponent8(), LayoutUtil.createFieldConstraints(0));
    component.add(this.createComponent14(), LayoutUtil.createPanelConstraints(1));
    component.add(this.createComponent29(), LayoutUtil.createPanelConstraints(2));
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
  }

  private void unbind() {
    for (AutoBinding binding : this.myBindings) {
      if (binding.isBound()) {
        binding.unbind();
      }
    }
  }

  private JPanel createComponent8() {
    JPanel component = new JPanel();
    this.myComponent7 = component;
    component.setLayout(new FlowLayout(FlowLayout.LEFT));
    component.add(this.createComponent9());
    component.add(this.createComponent10());
    component.add(this.createComponent11());
    component.add(this.createComponent12());
    component.add(this.createComponent13());
    return component;
  }

  private JLabel createComponent9() {
    JLabel component = new JLabel();
    this.myComponent8 = component;
    component.setText("Test:");
    return component;
  }

  private JbRadioButton createComponent10() {
    JbRadioButton component = new JbRadioButton();
    this.myIsModule0 = component;
    component.setText("All in Module");
    component.setSelected(true);
    component.setGroup(myThis.getGroup());
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onSelect();
      }
    });
    return component;
  }

  private JbRadioButton createComponent11() {
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

  private JbRadioButton createComponent12() {
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

  private JbRadioButton createComponent13() {
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

  private JPanel createComponent14() {
    JPanel component = new JPanel();
    this.myComponent9 = component;
    component.setBorder(new TitledBorder("Test"));
    component.setLayout(new GridBagLayout());
    component.add(this.createComponent15(), LayoutUtil.createPanelConstraints(0));
    component.add(this.createComponent18(), LayoutUtil.createPanelConstraints(0));
    component.add(this.createComponent21(), LayoutUtil.createPanelConstraints(0));
    component.add(this.createComponent24(), LayoutUtil.createPanelConstraints(0));
    return component;
  }

  private JPanel createComponent15() {
    JPanel component = new JPanel();
    this.myModulePanel0 = component;
    component.setLayout(new GridBagLayout());
    component.add(this.createComponent16(), LayoutUtil.createLabelConstraints(0));
    component.add(this.createComponent17(), LayoutUtil.createPanelConstraints(1));
    return component;
  }

  private JLabel createComponent16() {
    JLabel component = new JLabel();
    this.myComponent10 = component;
    component.setText("Module:");
    return component;
  }

  private ModuleChooserComponent createComponent17() {
    ModuleChooserComponent component = new ModuleChooserComponent();
    this.myModuleName0 = component;
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onModuleChange();
      }
    });
    return component;
  }

  private JPanel createComponent18() {
    JPanel component = new JPanel();
    this.myModelPanel0 = component;
    component.setLayout(new GridBagLayout());
    component.add(this.createComponent19(), LayoutUtil.createLabelConstraints(0));
    component.add(this.createComponent20(), LayoutUtil.createPanelConstraints(1));
    return component;
  }

  private JLabel createComponent19() {
    JLabel component = new JLabel();
    this.myComponent11 = component;
    component.setText("Model:");
    return component;
  }

  private ModelChooserComponent createComponent20() {
    ModelChooserComponent component = new ModelChooserComponent();
    this.myModelName0 = component;
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onModelChange();
      }
    });
    return component;
  }

  private JPanel createComponent21() {
    JPanel component = new JPanel();
    this.myTestPanel0 = component;
    component.setLayout(new GridBagLayout());
    component.add(this.createComponent22(), LayoutUtil.createLabelConstraints(0));
    component.add(this.createComponent23(), LayoutUtil.createPanelConstraints(1));
    return component;
  }

  private JLabel createComponent22() {
    JLabel component = new JLabel();
    this.myComponent12 = component;
    component.setText("Class:");
    return component;
  }

  private NodeChooserComponent createComponent23() {
    NodeChooserComponent component = new NodeChooserComponent();
    this.myNodeName0 = component;
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onNodeChange();
      }
    });
    return component;
  }

  private JPanel createComponent24() {
    JPanel component = new JPanel();
    this.myMethodPanel0 = component;
    component.setLayout(new GridBagLayout());
    component.add(this.createComponent25(), LayoutUtil.createLabelConstraints(0));
    component.add(this.createComponent26(), LayoutUtil.createPanelConstraints(1));
    component.add(this.createComponent27(), LayoutUtil.createLabelConstraints(2));
    component.add(this.createComponent28(), LayoutUtil.createPanelConstraints(3));
    return component;
  }

  private JLabel createComponent25() {
    JLabel component = new JLabel();
    this.myComponent13 = component;
    component.setText("Class:");
    return component;
  }

  private NodeChooserComponent createComponent26() {
    NodeChooserComponent component = new NodeChooserComponent();
    this.myNodeNameWithMethod0 = component;
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onMethodChange();
      }
    });
    return component;
  }

  private JLabel createComponent27() {
    JLabel component = new JLabel();
    this.myComponent14 = component;
    component.setText("Method");
    return component;
  }

  private MethodChooserComponent createComponent28() {
    MethodChooserComponent component = new MethodChooserComponent();
    this.myMethodName0 = component;
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.onMethodChange();
      }
    });
    return component;
  }

  private JavaConfigOptions createComponent29() {
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

  public void apply(final DefaultJUnit_Configuration config) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        config.getStateObject().method = ITestMethod_Behavior.call_getTestName_1216136419751(myThis.getMethod());
        config.getStateObject().node = INamedConcept_Behavior.call_getFqName_1213877404258(myThis.getNode());
        config.getStateObject().model = SModelOperations.getModelName(myThis.getModel());
        if (config.getStateObject().module != null) {
          config.getStateObject().module = myThis.getModule().getModuleFqName();
        }
        JUnitRunTypes type;
        if (myThis.myIsModule0.isSelected()) {
          type = JUnitRunTypes.MODULE;
        } else if (myThis.myIsModel0.isSelected()) {
          type = JUnitRunTypes.MODEL;
        } else if (myThis.myIsClass0.isSelected()) {
          type = JUnitRunTypes.TESTCLASS;
        } else {
          type = JUnitRunTypes.METHOD;
        }
        config.getStateObject().type = type;
      }
    });
  }

  public void reset(final DefaultJUnit_Configuration config) {
    if (config.getStateObject().type != null) {
      switch (config.getStateObject().type) {
        case METHOD:
          myThis.myIsMethod0.setSelected(true);
        case TESTCLASS:
          myThis.myIsClass0.setSelected(true);
        case MODEL:
          myThis.myIsModel0.setSelected(true);
        case MODULE:
          myThis.myIsModule0.setSelected(true);
        default:
      }
    } else {
      myThis.myIsModule0.setSelected(true);
    }
    if (config.getStateObject().node != null) {
      myThis.setNode(config.getStateObject().node);
      if (config.getStateObject().method != null) {
        myThis.setMethod(config.getStateObject().node, config.getStateObject().method);
        myThis.myMethodName0.setText(config.getStateObject().method);
      }
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          myThis.myNodeName0.setText(INamedConcept_Behavior.call_getFqName_1213877404258(myThis.getNode()));
          myThis.myNodeNameWithMethod0.setText(INamedConcept_Behavior.call_getFqName_1213877404258(myThis.getNode()));
          myThis.myMethodName0.setTestCase(INamedConcept_Behavior.call_getFqName_1213877404258(myThis.getNode()));
          myThis.myModelName0.setText(SModelOperations.getModelName(SNodeOperations.getModel(myThis.getNode())));
          myThis.myModuleName0.setText(SNodeOperations.getModel(myThis.getNode()).getModelDescriptor().getModule().getModuleFqName());
        }
      });
    }
    if (config.getStateObject().model != null) {
      myThis.setModel(config.getStateObject().model);
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          myThis.myModelName0.setText(config.getStateObject().model);
          myThis.myModuleName0.setText(myThis.getModel().getModelDescriptor().getModule().getModuleFqName());
        }
      });
    }
    if (config.getStateObject().module != null) {
      myThis.setModule(config.getStateObject().module);
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
    myThis.setModel(myThis.myModelName0.getText());
  }

  public void onModuleChange() {
    myThis.setModule(myThis.myModuleName0.getText());
  }

  public void onNodeChange() {
    myThis.setNode(myThis.myNodeName0.getText());
  }

  public void onMethodChange() {
    myThis.setMethod(myThis.myNodeName0.getText(), myThis.myMethodName0.getText());
  }

  private void setModule(final String m) {
    if (m == null) {
      return;
    }
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (IModule module : myThis.getProject().getScope().getVisibleModules()) {
          if (module.getModuleFqName().equals(m)) {
            myThis.setModule(module);
            break;
          }
        }
      }
    });
  }

  private void setModel(final String m) {
    if (m == null) {
      return;
    }
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        SModelDescriptor descriptor = myThis.getProject().getScope().getModelDescriptor(SModelReference.fromString(m));
        myThis.setModel(descriptor.getSModel());
      }
    });
  }

  private void setNode(final String n) {
    if (n == null) {
      return;
    }
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        myThis.setNode((SNode)SModelUtil.findNodeByFQName(n, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.unitTest.structure.BTestCase"), GlobalScope.getInstance()));
      }
    });
  }

  private void setMethod(String m, final String n) {
    myThis.setNode(n);
    if (m == null) {
      return;
    }
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        myThis.setMethod((SNode)SModelUtil.findNodeByFQName(n, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod"), GlobalScope.getInstance()));
      }
    });
  }
}
