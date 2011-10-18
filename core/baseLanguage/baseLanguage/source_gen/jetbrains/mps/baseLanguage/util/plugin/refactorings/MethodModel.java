package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import javax.swing.event.ChangeListener;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import javax.swing.event.ChangeEvent;
import jetbrains.mps.smodel.ModelAccess;

public class MethodModel {
  private SNode myType;
  private String myName = "";
  private List<ChangeListener> myListeners = ListSequence.fromList(new ArrayList<ChangeListener>());
  private Map<String, SNode> myTypesMap = MapSequence.fromMap(new HashMap<String, SNode>());
  private List<String> myExceptions = ListSequence.fromList(new ArrayList<String>());
  private boolean isStatic = false;

  public MethodModel() {
  }

  public String getName() {
    return this.myName;
  }

  public void setName(String name) {
    this.myName = name;
    this.fireChange();
  }

  public SNode getReturnType() {
    return this.myType;
  }

  public void setReturnType(SNode type) {
    this.myType = type;
    this.fireChange();
  }

  public void setStatic(boolean isStatic) {
    this.isStatic = isStatic;
    this.fireChange();
  }

  public boolean isStatic() {
    return this.isStatic;
  }

  public void fireChange() {
    for (ChangeListener listener : ListSequence.fromList(this.myListeners)) {
      listener.stateChanged(new ChangeEvent(this));
    }
  }

  public void addChangeListener(ChangeListener listener) {
    ListSequence.fromList(this.myListeners).addElement(listener);
  }

  public List<String> getThrowItems() {
    return this.myExceptions;
  }

  public void setException(int i, String exception) {
    ListSequence.fromList(this.myExceptions).setElement(i, exception);
    this.fireChange();
  }

  public List<String> getParametersNames() {
    return null;
  }

  public String getMethodText() {
    final StringBuffer text = new StringBuffer();
    if (this.isStatic) {
      text.append("static ");
    }

    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        text.append(MethodModel.this.getReturnType());
      }
    });
    text.append("");
    text.append(this.getName());
    text.append("(");
    if (ListSequence.fromList(this.getParametersNames()).count() > 0) {
      text.append("\n");
      boolean first = true;
      for (String parameter : ListSequence.fromList(this.getParametersNames())) {
        if (!(first)) {
          text.append(",\n");
        }
        text.append("  ").append(parameter);
        first = false;
      }
    }
    text.append(")");
    //  Add throw intems 
    if (ListSequence.fromList(this.getThrowItems()).count() > 0) {
      text.append("throws\n");
      boolean first = true;
      for (String exception : ListSequence.fromList(this.getThrowItems())) {
        if (!(first)) {
          text.append(",\n");
        }
        text.append(" ").append(exception);
        first = false;
      }
    }
    return text.toString();
  }
}
