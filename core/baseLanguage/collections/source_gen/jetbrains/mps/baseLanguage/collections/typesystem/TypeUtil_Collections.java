package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class TypeUtil_Collections {

  public static SNode coerceTo_SequenceType(SNode type) {
    SNode sequenceType = TypeChecker.getInstance().getRuntimeSupport().coerce_(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.collections.structure.SequenceType"), true);
    if (sequenceType != null) {
      return sequenceType;
    }
    if (sequenceType == null) {
      return null;
    }
    // the following code is not reachable 
    if (type == null) {
      return null;
    }
    // ==========
    // TEMP FIX FOR DNQ 1
    if ("jetbrains.teamsys.dnq.structure.PListType".equals(type.getConceptFqName())) {
      SNode classifierType = SNodeOperations.cast(type.getChild("classifierType"), "jetbrains.mps.baseLanguage.structure.ClassifierType");
      return new _Quotations.QuotationClass_31().createNode(SNodeOperations.copyNode(classifierType));
    }
    // END TEMP FIX
    // ==========
    // ==========
    // TEMP FIX FOR DNQ
    // TODO: extract generics information
    if (type != null) {
      SModel model = TypeChecker.getInstance().getRuntimeTypesModel();
      GlobalScope scope = GlobalScope.getInstance();
      SNode entity = SNodeOperations.cast(SModelUtil.findNodeByFQName("com.jetbrains.teamsys.database.Entity", SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Classifier"), scope), "jetbrains.mps.baseLanguage.structure.Classifier");
      if (entity == null) {
        return null;
      }
      SNode entityType = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ClassifierType", null);
      SLinkOperations.setTarget(entityType, "classifier", entity, false);
      SNode javaIterable = SNodeOperations.cast(SModelUtil.findNodeByFQName("java.lang.Iterable", SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Classifier"), scope), "jetbrains.mps.baseLanguage.structure.Classifier");
      SNode javaIterableType = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ClassifierType", null);
      SLinkOperations.setTarget(javaIterableType, "classifier", javaIterable, false);
      SLinkOperations.addChild(javaIterableType, "parameter", entityType);
      if (TypeChecker.getInstance().getSubtypingManager().isSubtype(type, javaIterableType)) {
        return new _Quotations.QuotationClass_32().createNode(SNodeOperations.copyNode(entity));
      }
      // ==========
      SNode entityIterable = SNodeOperations.cast(SModelUtil.findNodeByFQName("com.jetbrains.teamsys.database.EntityIterable", SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Classifier"), scope), "jetbrains.mps.baseLanguage.structure.Classifier");
      SNode entityIterableType = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.ClassifierType", null);
      SLinkOperations.setTarget(entityIterableType, "classifier", entityIterable, false);
      if (TypeChecker.getInstance().getSubtypingManager().isSubtype(type, entityIterableType)) {
        return new _Quotations.QuotationClass_33().createNode(SNodeOperations.copyNode(entity));
      }
    }
    // END FIX
    // ==========
    return null;
  }

}
