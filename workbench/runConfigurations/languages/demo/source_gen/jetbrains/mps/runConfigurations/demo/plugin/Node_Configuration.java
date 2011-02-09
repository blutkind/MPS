package jetbrains.mps.runConfigurations.demo.plugin;

/*Generated by MPS */

import jetbrains.mps.runConfigurations.runtime.IPersistentConfiguration;
import jetbrains.mps.logging.Logger;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import org.jdom.Element;
import com.intellij.openapi.util.WriteExternalException;
import com.intellij.util.xmlb.XmlSerializer;
import com.intellij.openapi.util.InvalidDataException;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.SNodePointer;

public class Node_Configuration implements IPersistentConfiguration {
  private static final Logger LOG = Logger.getLogger(Node_Configuration.class);

  @NotNull
  private Node_Configuration.MyState myState = new Node_Configuration.MyState();
  private final SNode myConcept;
  private final _FunctionTypes._return_P1_E0<? extends Boolean, ? super SNode> myIsValid;

  public Node_Configuration(SNode concept, _FunctionTypes._return_P1_E0<? extends Boolean, ? super SNode> isValid) {
    myConcept = concept;
    myIsValid = isValid;
  }

  public void checkConfiguration() throws RuntimeConfigurationException {
    {
      final SNode node = this.getNode();
      if (node == null) {
        throw new RuntimeConfigurationException("Node is not specified.");
      }
      final Wrappers._boolean accept = new Wrappers._boolean();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          accept.value = myIsValid.invoke(node);
        }
      });
      if (!(accept.value)) {
        throw new RuntimeConfigurationException("Node is not valid.");
      }
    }
  }

  @Override
  public void writeExternal(Element element) throws WriteExternalException {
    element.addContent(XmlSerializer.serialize(myState));
  }

  @Override
  public void readExternal(Element element) throws InvalidDataException {
    XmlSerializer.deserializeInto(myState, (Element) element.getChildren().get(0));
  }

  public String getNodeId() {
    return myState.myNodeId;
  }

  public String getModelId() {
    return myState.myModelId;
  }

  public void setNodeId(String value) {
    myState.myNodeId = value;
  }

  public void setModelId(String value) {
    myState.myModelId = value;
  }

  @Nullable
  public SNode getNode() {
    if (this.getModelId() == null || this.getNodeId() == null) {
      return null;
    }
    final Wrappers._T<SNode> node = new Wrappers._T<SNode>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        node.value = new SNodePointer(Node_Configuration.this.getModelId(), Node_Configuration.this.getNodeId()).getNode();
      }
    });
    return node.value;
  }

  public void setNode(@Nullable final SNode node) {
    if (node == null) {
      this.setModelId(null);
      this.setNodeId(null);
    } else {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          Node_Configuration.this.setModelId(node.getModel().getModelDescriptor().getSModelReference().toString());
          Node_Configuration.this.setNodeId(node.getId());
        }
      });
    }
  }

  @Override
  public Node_Configuration clone() {
    Node_Configuration clone = null;
    try {
      clone = createCloneTemplate();
      clone.myState = (Node_Configuration.MyState) myState.clone();
      return clone;
    } catch (CloneNotSupportedException ex) {
      LOG.error(ex);
    }
    return clone;
  }

  public Node_Configuration createCloneTemplate() {
    return new Node_Configuration(myConcept, myIsValid);
  }

  public Node_Configuration_Editor getEditor() {
    return new Node_Configuration_Editor(myConcept, myIsValid);
  }

  public class MyState {
    public String myNodeId;
    public String myModelId;

    public MyState() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      Node_Configuration.MyState state = new Node_Configuration.MyState();
      state.myNodeId = myNodeId;
      state.myModelId = myModelId;
      return state;
    }
  }
}
