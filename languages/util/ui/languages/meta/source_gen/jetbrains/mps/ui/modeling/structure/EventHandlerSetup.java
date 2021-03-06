package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EventHandlerSetup extends ConceptFunction {
  public static final String concept = "jetbrains.mps.ui.modeling.structure.EventHandlerSetup";

  public EventHandlerSetup(SNode node) {
    super(node);
  }

  public static EventHandlerSetup newInstance(SModel sm, boolean init) {
    return (EventHandlerSetup) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.modeling.structure.EventHandlerSetup", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EventHandlerSetup newInstance(SModel sm) {
    return EventHandlerSetup.newInstance(sm, false);
  }
}
