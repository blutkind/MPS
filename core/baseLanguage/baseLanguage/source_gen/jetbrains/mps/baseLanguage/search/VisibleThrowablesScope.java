package jetbrains.mps.baseLanguage.search;

/*Generated by MPS */

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.IScope;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.baseLanguage.structure.Classifier;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class VisibleThrowablesScope extends VisibleClassifiersScope {
  public VisibleThrowablesScope(SModel model, int constraint, IScope scope) {
    super(model, constraint, scope);
  }

  @NotNull
  public List<Classifier> getClassifiers() {
    List<Classifier> result = new ArrayList<Classifier>();
    ClassConcept throwable = SModelUtil_new.findNodeByFQName("java.lang.Throwable", ClassConcept.class, GlobalScope.getInstance());
    for (Classifier cls : super.getClassifiers()) {
      if (ClassifierAndSuperClassifiersCache.getInstance(cls).getClassifiers().contains(throwable)) {
        result.add(cls);
      }
    }
    return result;
  }
}
