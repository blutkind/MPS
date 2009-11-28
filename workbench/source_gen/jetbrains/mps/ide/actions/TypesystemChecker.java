package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.typesystem.inference.NodeTypesComponentsRepository;
import jetbrains.mps.typesystem.inference.NodeTypesComponent;
import jetbrains.mps.util.Pair;
import java.util.List;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.nodeEditor.MessageStatus;

public class TypesystemChecker extends SpecificChecker {
  public TypesystemChecker(ModelChecker modelChecker) {
    super(modelChecker);
  }

  public void checkModel(SModel model) {
    TypeChecker tc = TypeChecker.getInstance();
    for (SNode rootNode : ListSequence.fromList(SModelOperations.getRoots(model, null))) {
      if (!(this.getModelChecker().checkAndUpdateIndicator("Checking " + SModelOperations.getModelName(model) + " for typesystem rules..."))) {
        return;
      }
      tc.checkRoot(rootNode);
      TypeCheckingContext typeCheckingContext = NodeTypesComponentsRepository.getInstance().getTypeCheckingContext(rootNode);
      NodeTypesComponent nodeTypesComponent = typeCheckingContext.getBaseNodeTypesComponent();
      for (Pair<SNode, List<IErrorReporter>> nodeErrorReporters : SetSequence.fromSet(nodeTypesComponent.getNodesWithErrors())) {
        SNode node = nodeErrorReporters.o1;
        for (IErrorReporter errorReporter : ListSequence.fromList(nodeErrorReporters.o2)) {
          this.addIssue(node, errorReporter.reportError(), getResultCategory(errorReporter.getMessageStatus()), null);
        }
      }
    }
  }

  private static String getResultCategory(MessageStatus messageStatus) {
    switch (messageStatus) {
      case ERROR:
        return ModelChecker.CATEGORY_ERROR;
      case WARNING:
        return ModelChecker.CATEGORY_WARNING;
      case OK:
        return ModelChecker.CATEGORY_INFO;
      default:
        return ModelChecker.CATEGORY_ERROR;
    }
  }
}
