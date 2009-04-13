package jetbrains.mps.build.custommps.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.build.custommps.behavior.MPSBuild_Behavior;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.build.packaging.behavior.Module_Behavior;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_MPSModule_1237557396432(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return MPSBuild_Behavior.isInCustomMPSGenerator_1238403397946(operationContext);
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_MPSModule_1237542440695(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.<INodeSubstituteAction>fromArray();
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.build.custommps.structure.MPSModule");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            return Module_Behavior.getAllAvailableModules_1222444746697();
          }
        };
        Iterable<IModule> queryResult = (Iterable)calc.calculate();
        if (queryResult != null) {
          for(final IModule item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode newNode = SConceptOperations.createNewNode("jetbrains.mps.build.custommps.structure.MPSModule", null);
                SPropertyOperations.set(newNode, "id", (item).getModuleId().toString());
                SPropertyOperations.set(newNode, "name", Module_Behavior.extractModuleProperName_1235487584035((item)));
                return newNode;
              }
            });
          }
        }
      }
    }
    return result;
  }

}
