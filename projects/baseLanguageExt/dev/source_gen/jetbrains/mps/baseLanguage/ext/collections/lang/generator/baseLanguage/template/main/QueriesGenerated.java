package jetbrains.mps.baseLanguage.ext.collections.lang.generator.baseLanguage.template.main;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.baseLanguage.ext.collections.lang.generator.baseLanguage.template.util.QueriesUtil;
import jetbrains.mps.baseLanguage.BaseLanguageUtil_new;
import jetbrains.mps.baseLanguage.structure.Expression;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1167777954975(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode creator = SLinkOperations.getTarget(node, "creator", true);
    return SNodeOperations.isInstanceOf(creator, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit");
  }
  public static boolean baseMappingRule_Condition_1167380888941(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "operation", true), "jetbrains.mps.baseLanguage.ext.collections.lang.structure.RemoveElementOperation");
  }
  public static boolean baseMappingRule_Condition_1171152299376(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    // todo: remove this condition when all operations
    // are reduced using new rules
    SNode op = SLinkOperations.getTarget(node, "operation", true);
    boolean b = true;
    b = b && SNodeOperations.isInstanceOf(op, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SortOperation");
    return b;
  }
  public static boolean baseMappingRule_Condition_1171063798184(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "creator", true), "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceCreatorWithSupplier");
  }
  public static boolean baseMappingRule_Condition_1171064114550(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode enclosingClosure = SNodeOperations.getParent(node, "jetbrains.mps.baseLanguage.structure.Closure", false, false);
    return SNodeOperations.isInstanceOf(enclosingClosure, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ValueSupplierBlock");
  }
  public static boolean baseMappingRule_Condition_1171064421647(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode enclosingClosure = SNodeOperations.getParent(node, "jetbrains.mps.baseLanguage.structure.Closure", false, false);
    return !(SNodeOperations.isInstanceOf(enclosingClosure, "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ValueSupplierBlock"));
  }
  public static boolean baseMappingRule_Condition_1170068093968(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getBoolean(SNodeOperations.getParent(node, null, false, false), "reverseOrder") == false;
  }
  public static boolean baseMappingRule_Condition_1170068164068(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getBoolean(SNodeOperations.getParent(node, null, false, false), "reverseOrder") == true;
  }
  public static String propertyMacro_GetPropertyValue_1170958681801(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zValueSupplier");
  }
  public static String propertyMacro_GetPropertyValue_1170976422667(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "defaultInputElement", true), "name");
  }
  public static String propertyMacro_GetPropertyValue_1170959003472(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zMapper");
  }
  public static String propertyMacro_GetPropertyValue_1170976734726(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "defaultInputElement", true), "name");
  }
  public static String propertyMacro_GetPropertyValue_1170976644359(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zForEach");
  }
  public static String propertyMacro_GetPropertyValue_1170977112610(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "defaultInputElement", true), "name");
  }
  public static String propertyMacro_GetPropertyValue_1170977055251(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zPredicate");
  }
  public static String propertyMacro_GetPropertyValue_1170977320810(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "defaultInputElement", true), "name");
  }
  public static String propertyMacro_GetPropertyValue_1170959486472(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zSelector");
  }
  public static String propertyMacro_GetPropertyValue_1167778587376(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("_zCursor");
  }
  public static String propertyMacro_GetPropertyValue_1168288151438(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "variable", true), "name");
  }
  public static String propertyMacro_GetPropertyValue_1168509021319(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zComparator");
  }
  public static String propertyMacro_GetPropertyValue_1168512329638(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode c = node;
    return SPropertyOperations.getString(SLinkOperations.getTarget(c, "defaultInputElement", true), "name");
  }
  public static String propertyMacro_GetPropertyValue_1170067391915(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode c = node;
    return SPropertyOperations.getString(SLinkOperations.getTarget(c, "defaultInputElement", true), "name");
  }
  public static String propertyMacro_GetPropertyValue_1170067652651(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("zComparator");
  }
  public static SNode referenceMacro_GetReferent_1170982686718(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return _QueriesUtil.resolve_ForEachVariableReference(((ForEachVariableReference)SNodeOperations.getAdapter(node)), templateNode, generator);
  }
  public static List sourceNodesQuery_1168281040871(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode creator = SLinkOperations.getTarget(node, "creator", true);
    return SLinkOperations.getTargets(creator, "initValue", true);
  }
  public static SNode sourceNodeQuery_1170982975543(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "elementType", true);
  }
  public static SNode sourceNodeQuery_1170985599591(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "elementType", true);
  }
  public static SNode sourceNodeQuery_1170984732283(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static SNode sourceNodeQuery_1170957296016(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1170985696959(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "value", true);
  }
  public static SNode sourceNodeQuery_1170981813019(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode creator = SLinkOperations.getTarget(node, "creator", true);
    return SLinkOperations.getTarget(creator, "supplier", true);
  }
  public static SNode sourceNodeQuery_1170959067752(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1170984709164(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static SNode sourceNodeQuery_1170985187980(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "mapper", true);
  }
  public static SNode sourceNodeQuery_1170976710748(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1170983576308(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static SNode sourceNodeQuery_1170984981400(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode op = SLinkOperations.getTarget(node, "operation", true);
    return SLinkOperations.getTarget(op, "forEachClosure", true);
  }
  public static SNode sourceNodeQuery_1170977120305(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1170984741354(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static SNode sourceNodeQuery_1170985400792(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "whereClosure", true);
  }
  public static SNode sourceNodeQuery_1170959592162(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1170984722931(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static SNode sourceNodeQuery_1170985357311(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "selector", true);
  }
  public static SNode sourceNodeQuery_1168287937464(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "inputSequence", true);
  }
  public static SNode sourceNodeQuery_1168288186650(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "body", true);
  }
  public static SNode sourceNodeQuery_1168280933571(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode creator = SLinkOperations.getTarget(node, "creator", true);
    return SLinkOperations.getTarget(creator, "elementType", true);
  }
  public static SNode sourceNodeQuery_1170983493873(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static SNode sourceNodeQuery_1170984931561(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode op = SLinkOperations.getTarget(node, "operation", true);
    return SLinkOperations.getTarget(op, "argument", true);
  }
  public static SNode sourceNodeQuery_1170983343379(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static SNode sourceNodeQuery_1170983373123(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode op = SLinkOperations.getTarget(node, "operation", true);
    return SLinkOperations.getTarget(op, "argument", true);
  }
  public static SNode sourceNodeQuery_1170984308010(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static SNode sourceNodeQuery_1170985145931(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "argument", true);
  }
  public static SNode sourceNodeQuery_1170984693960(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static SNode sourceNodeQuery_1170984324347(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static SNode sourceNodeQuery_1170984702547(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static SNode sourceNodeQuery_1170984684780(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static SNode sourceNodeQuery_1170984715204(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static SNode sourceNodeQuery_1170985228761(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(node, "operation", true), "argument", true);
  }
  public static SNode sourceNodeQuery_1168512350251(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode firstStatement = SequenceOperations.getFirst(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "body", true), "statement", true));
    return SLinkOperations.getTarget(firstStatement, "expression", true);
  }
  public static SNode sourceNodeQuery_1168511702747(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(SNodeOperations.getParent(node, null, false, false), "leftExpression", true);
  }
  public static SNode sourceNodeQuery_1168511753711(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "comparable", true);
  }
  public static SNode sourceNodeQuery_1170979555022(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode firstStatement = SequenceOperations.getFirst(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "body", true), "statement", true));
    return SLinkOperations.getTarget(firstStatement, "expression", true);
  }
  public static SNode sourceNodeQuery_1171152607288(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "operation", true);
  }
  public static SNode mapSrcMacro_mapper_1170957121880(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_Closure_returnedType(node, generator.getTargetModel(), generator.getTypeChecker());
  }
  public static SNode mapSrcMacro_mapper_1170957401571(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_Closure_returnedType(node, generator.getTargetModel(), generator.getTypeChecker());
  }
  public static SNode mapSrcMacro_mapper_1170980972538(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode creator = SLinkOperations.getTarget(node, "creator", true);
    SNode supplier = SLinkOperations.getTarget(creator, "supplier", true);
    SModel outputModel = generator.getTargetModel();
    SNode type = generator.getTypeChecker().getNodeTypeAsNode(supplier, outputModel);
    if(type != null) {
      return type;
    }
    return BaseLanguageUtil_new.createObjectClassType(outputModel, scope).getNode();
  }
  public static SNode mapSrcMacro_mapper_1170976176384(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170959249892(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_Closure_returnedType(node, generator.getTargetModel(), generator.getTypeChecker());
  }
  public static SNode mapSrcMacro_mapper_1170976265295(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170959169275(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_Closure_returnedType(node, generator.getTargetModel(), generator.getTypeChecker());
  }
  public static SNode mapSrcMacro_mapper_1170976692851(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170976677202(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170977090634(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170977083110(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170959580916(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_Closure_returnedType(node, generator.getTargetModel(), generator.getTypeChecker());
  }
  public static SNode mapSrcMacro_mapper_1170977291681(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170977281282(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170959570489(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_Closure_returnedType(node, generator.getTargetModel(), generator.getTypeChecker());
  }
  public static SNode mapSrcMacro_mapper_1170982071668(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode inputSequence = SLinkOperations.getTarget(node, "inputSequence", true);
    return _QueriesUtil.create_SequenceElementType(((Expression)SNodeOperations.getAdapter(inputSequence)), generator);
  }
  public static SNode mapSrcMacro_mapper_1170982198863(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode inputSequence = SLinkOperations.getTarget(node, "inputSequence", true);
    return _QueriesUtil.create_SequenceElementType(((Expression)SNodeOperations.getAdapter(inputSequence)), generator);
  }
  public static SNode mapSrcMacro_mapper_1170978063590(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170978105865(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170978114264(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170978123585(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170979514044(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170979519146(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170979528248(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
  public static SNode mapSrcMacro_mapper_1170979494535(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.create_ClosureWithInput_inputElementType(node, generator);
  }
}
