package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration;

public class EventHandlerReference extends Expression {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.EventHandlerReference";
  public static String HANDLER = "handler";

  public EventHandlerReference(SNode node) {
    super(node);
  }

  public static EventHandlerReference newInstance(SModel sm, boolean init) {
    return (EventHandlerReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.EventHandlerReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EventHandlerReference newInstance(SModel sm) {
    return EventHandlerReference.newInstance(sm, false);
  }


  public DefaultClassifierMethodDeclaration getHandler() {
    return (DefaultClassifierMethodDeclaration) this.getReferent(EventHandlerReference.HANDLER);
  }

  public void setHandler(DefaultClassifierMethodDeclaration node) {
    super.setReferent(EventHandlerReference.HANDLER, node);
  }

}
