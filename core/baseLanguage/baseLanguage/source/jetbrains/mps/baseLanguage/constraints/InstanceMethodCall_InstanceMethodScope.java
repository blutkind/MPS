package jetbrains.mps.baseLanguage.constraints;

import jetbrains.mps.smodel.search.IReferenceInfoResolver;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.baseLanguage.search.VisibleClassifierMembersScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import jetbrains.mps.baseLanguage.structure.*;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;

/**
 * Igor Alshannikov
 * Sep 18, 2007
 */
public class InstanceMethodCall_InstanceMethodScope extends VisibleClassifierMembersScope {
  private ClassifierType myInstanceType;
  private BaseMethodCall myMethodCall;

  public InstanceMethodCall_InstanceMethodScope(ClassifierType instanceType, InstanceMethodCall methodCall) {
    super(instanceType.getClassifier(), methodCall.getNode(), IClassifiersSearchScope.INSTANCE_METHOD);
    myInstanceType = instanceType;
    myMethodCall = methodCall;
  }

  public InstanceMethodCall_InstanceMethodScope(ClassifierType instanceType, DotExpression methodCallDotExpression) {
    super(instanceType.getClassifier(), methodCallDotExpression.getNode(), IClassifiersSearchScope.INSTANCE_METHOD);
    myInstanceType = instanceType;
    myMethodCall = (BaseMethodCall) methodCallDotExpression.getOperation();
  }

  public IReferenceInfoResolver getReferenceInfoResolver(AbstractConceptDeclaration concept) {
    if (SModelUtil_new.isAssignableConcept(concept, InstanceMethodDeclaration.concept) && myMethodCall != null) {
      return createInstanceMethodReferenceInfoResolver(myInstanceType, myMethodCall.getActualArguments());
    }
    return super.getReferenceInfoResolver(concept);
  }
}
