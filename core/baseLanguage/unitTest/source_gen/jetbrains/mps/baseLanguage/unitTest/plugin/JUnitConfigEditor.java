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
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelReference;

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
  private MPSProject myMyProject;
  private ButtonGroup myMyButtonGroup;
  private SModel myMyModel;
  private IModule myMyModule;
  private SNode myMyNode;
  private SNode myMyMethod;
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
    myThis.setMyProject(MPSDataKeys.MPS_PROJECT.getData(DataManager.getInstance().getDataContext()));
    myThis.setMyButtonGroup(new ButtonGroup());
    component.setLayout(new GridBagLayout());
    component.add(this.createComponent8(), LayoutUtil.createFieldConstraints(0));
    component.add(this.createComponent14(), LayoutUtil.createPanelConstraints(1));
    component.add(this.createComponent29(), LayoutUtil.createPanelConstraints(2));
    this.myEvents.initialize();
    myThis.myIsModule0.setSelected(true);
    myThis.onSelect();
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
    component.setGroup(myThis.getMyButtonGroup());
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
    component.setGroup(myThis.getMyButtonGroup());
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
    component.setGroup(myThis.getMyButtonGroup());
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
    component.setGroup(myThis.getMyButtonGroup());
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
    return component;
  }

  private JavaConfigOptions createComponent29() {
    JavaConfigOptions component = new JavaConfigOptions();
    this.myJavaOptions0 = component;
    return component;
  }

  public MPSProject getMyProject() {
    return this.myMyProject;
  }

  public ButtonGroup getMyButtonGroup() {
    return this.myMyButtonGroup;
  }

  public SModel getMyModel() {
    return this.myMyModel;
  }

  public IModule getMyModule() {
    return this.myMyModule;
  }

  public SNode getMyNode() {
    return this.myMyNode;
  }

  public SNode getMyMethod() {
    return this.myMyMethod;
  }

  public void setMyProject(MPSProject newValue) {
    MPSProject oldValue = this.myMyProject;
    this.myMyProject = newValue;
    this.firePropertyChange("myProject", oldValue, newValue);
  }

  public void setMyButtonGroup(ButtonGroup newValue) {
    ButtonGroup oldValue = this.myMyButtonGroup;
    this.myMyButtonGroup = newValue;
    this.firePropertyChange("myButtonGroup", oldValue, newValue);
  }

  public void setMyModel(SModel newValue) {
    SModel oldValue = this.myMyModel;
    this.myMyModel = newValue;
    this.firePropertyChange("myModel", oldValue, newValue);
  }

  public void setMyModule(IModule newValue) {
    IModule oldValue = this.myMyModule;
    this.myMyModule = newValue;
    this.firePropertyChange("myModule", oldValue, newValue);
  }

  public void setMyNode(SNode newValue) {
    SNode oldValue = this.myMyNode;
    this.myMyNode = newValue;
    this.firePropertyChange("myNode", oldValue, newValue);
  }

  public void setMyMethod(SNode newValue) {
    SNode oldValue = this.myMyMethod;
    this.myMyMethod = newValue;
    this.firePropertyChange("myMethod", oldValue, newValue);
  }

  public void apply(final DefaultJUnit_Configuration config) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        config.getStateObject().method = ITestMethod_Behavior.call_getTestName_1216136419751(myThis.getMyMethod());
        config.getStateObject().node = INamedConcept_Behavior.call_getFqName_1213877404258(myThis.getMyNode());
        config.getStateObject().model = SModelOperations.getModelName(myThis.getMyModel());
        if (config.getStateObject().module != null) {
          config.getStateObject().module = myThis.getMyModule().getModuleFqName();
        }
      }
    });
  }

  public void reset(final DefaultJUnit_Configuration config) {
    final Wrappers._boolean needSelect = new Wrappers._boolean(true);
    if (config.getStateObject().node != null) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          myThis.setMyNode((SNode)SModelUtil.findNodeByFQName(config.getStateObject().node, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.unitTest.structure.BTestCase"), GlobalScope.getInstance()));
        }
      });
      if (config.getStateObject().method != null) {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            myThis.setMyMethod(((SNode)new SNodePointer(config.getStateObject().model, config.getStateObject().method).getNode()));
          }
        });
        myThis.myIsMethod0.setSelected(true);
        myThis.myMethodName0.setText(config.getStateObject().method);
        needSelect.value = false;
      }
      myThis.myIsClass0.setSelected(needSelect.value);
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          myThis.myNodeName0.setText(INamedConcept_Behavior.call_getFqName_1213877404258(myThis.getMyNode()));
          myThis.myNodeNameWithMethod0.setText(INamedConcept_Behavior.call_getFqName_1213877404258(myThis.getMyNode()));
          myThis.myMethodName0.setTestCase(INamedConcept_Behavior.call_getFqName_1213877404258(myThis.getMyNode()));
          myThis.myModelName0.setText(SModelOperations.getModelName(SNodeOperations.getModel(myThis.getMyNode())));
          myThis.myModuleName0.setText(SNodeOperations.getModel(myThis.getMyNode()).getModelDescriptor().getModule().getModuleFqName());
        }
      });
      needSelect.value = false;
    }
    if (config.getStateObject().model != null) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          SModelDescriptor descriptor = myThis.getMyProject().getScope().getModelDescriptor(SModelReference.fromString(config.getStateObject().model));
          myThis.setMyModel(descriptor.getSModel());
          myThis.myIsModel0.setSelected(needSelect.value);
          myThis.myModelName0.setText(config.getStateObject().model);
          myThis.myModuleName0.setText(myThis.getMyModel().getModelDescriptor().getModule().getModuleFqName());
        }
      });
      needSelect.value = false;
    }
    if (config.getStateObject().module != null) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          for (IModule module : myThis.getMyProject().getScope().getVisibleModules()) {
            if (module.getModuleFqName().equals(config.getStateObject().module)) {
              myThis.setMyModule(module);
              myThis.myIsModule0.setSelected(needSelect.value);
              myThis.myModuleName0.setText(config.getStateObject().module);
              break;
            }
          }
        }
      });
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
}
