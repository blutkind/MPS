package jetbrains.mps.samples.secretCompartmentLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StateMachineTestMethod extends BaseConcept {
  public static final String concept = "jetbrains.mps.samples.secretCompartmentLanguage.structure.StateMachineTestMethod";
  public static final String METHOD_NAME = "methodName";
  public static final String FINAL_STATE = "finalState";
  public static final String HANDLE_EVENT = "handleEvent";

  public StateMachineTestMethod(SNode node) {
    super(node);
  }

  public String getMethodName() {
    return this.getProperty(StateMachineTestMethod.METHOD_NAME);
  }

  public void setMethodName(String value) {
    this.setProperty(StateMachineTestMethod.METHOD_NAME, value);
  }

  public State getFinalState() {
    return (State)this.getReferent(StateMachineTestMethod.FINAL_STATE);
  }

  public void setFinalState(State node) {
    super.setReferent(StateMachineTestMethod.FINAL_STATE, node);
  }

  public int getHandleEventsCount() {
    return this.getChildCount(StateMachineTestMethod.HANDLE_EVENT);
  }

  public Iterator<HandleEvent> handleEvents() {
    return this.children(StateMachineTestMethod.HANDLE_EVENT);
  }

  public List<HandleEvent> getHandleEvents() {
    return this.getChildren(StateMachineTestMethod.HANDLE_EVENT);
  }

  public void addHandleEvent(HandleEvent node) {
    this.addChild(StateMachineTestMethod.HANDLE_EVENT, node);
  }

  public void insertHandleEvent(HandleEvent prev, HandleEvent node) {
    this.insertChild(prev, StateMachineTestMethod.HANDLE_EVENT, node);
  }


  public static StateMachineTestMethod newInstance(SModel sm, boolean init) {
    return (StateMachineTestMethod)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.secretCompartmentLanguage.structure.StateMachineTestMethod", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StateMachineTestMethod newInstance(SModel sm) {
    return StateMachineTestMethod.newInstance(sm, false);
  }

}
