package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.quickfix.QuickFix_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.search.ClassifierVisibleMembersScope;
import jetbrains.mps.baseLanguage.search.ClassifierVisibleStaticMembersScope;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import java.util.List;
import jetbrains.mps.util.Condition;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.search.ClassifierAndSuperClassifiersScope;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.smodel.BaseAdapter;

public class ChooseAppropriateMethodDeclaration_QuickFix extends QuickFix_Runtime {

  public ChooseAppropriateMethodDeclaration_QuickFix() {
  }

  public String getDescription() {
    return "choose appropriate method declaration";
  }

  public void execute(SNode node) {
    if (SNodeOperations.isInstanceOf(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "jetbrains.mps.baseLanguage.structure.StaticMethodCall") || SNodeOperations.isInstanceOf(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall")) {
      SNode classConcept = (SNodeOperations.isInstanceOf(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "jetbrains.mps.baseLanguage.structure.StaticMethodCall") ?
        SLinkOperations.getTarget(SNodeOperations.cast(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "jetbrains.mps.baseLanguage.structure.StaticMethodCall"), "classConcept", false) :
        SNodeOperations.getAncestor(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false)
      );
      ClassifierVisibleMembersScope scope = new ClassifierVisibleStaticMembersScope(((ClassConcept)SNodeOperations.getAdapter(classConcept)), ((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), IClassifiersSearchScope.STATIC_METHOD);
      List<SNode> mDecls = ((List<SNode>)scope.getNodes(new Condition <SNode>() {

        public boolean met(SNode n) {
          String name = SPropertyOperations.getString(SLinkOperations.getTarget(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "baseMethodDeclaration", false), "name");
          if (name != null) {
            name.equals(n.getName());
          }
          return false;
        }
      }));
      for(SNode methodDecl : mDecls) {
        Iterable<SNode> parameterTypes = ListSequence.fromList(SLinkOperations.getTargets(methodDecl, "parameter", true)).select(new ISelector <SNode, SNode>() {

          public SNode select(SNode it) {
            return SLinkOperations.getTarget(it, "type", true);
          }
        });
        boolean good = ResolveUtil.goodArguments(parameterTypes, SLinkOperations.getTargets(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "actualArgument", true));
        if (good) {
          SLinkOperations.setTarget(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "baseMethodDeclaration", methodDecl, false);
          return;
        }
      }
      return;
    }
    if (SNodeOperations.isInstanceOf(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "jetbrains.mps.baseLanguage.structure.ClassCreator") && SNodeOperations.isInstanceOf(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("classifier")[0]), "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      SNode constructorCall = SNodeOperations.cast(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "jetbrains.mps.baseLanguage.structure.ClassCreator");
      SNode classConcept = SNodeOperations.cast(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("classifier")[0]), "jetbrains.mps.baseLanguage.structure.ClassConcept");
      List<SNode> list = SLinkOperations.getTargets(classConcept, "constructor", true);
      for(SNode constructorDeclaration : list) {
        List<SNode> parameterTypes = ResolveUtil.parameterTypes(constructorDeclaration, SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(constructorCall), "jetbrains.mps.baseLanguage.structure.ClassifierType"), ((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("classifier")[0]));
        boolean good = ResolveUtil.goodArguments(parameterTypes, SLinkOperations.getTargets(constructorCall, "actualArgument", true));
        if (good) {
          SLinkOperations.setTarget(constructorCall, "baseMethodDeclaration", constructorDeclaration, false);
          return;
        }
      }
    } else if (SNodeOperations.isInstanceOf(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "jetbrains.mps.baseLanguage.structure.ConstructorInvocationStatement") && SNodeOperations.isInstanceOf(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("classifier")[0]), "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      SNode classConcept = SNodeOperations.cast(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("classifier")[0]), "jetbrains.mps.baseLanguage.structure.ClassConcept");
      SNode constructorCall = SNodeOperations.cast(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "jetbrains.mps.baseLanguage.structure.ConstructorInvocationStatement");
      List<SNode> list = SLinkOperations.getTargets(classConcept, "constructor", true);
      for(SNode constructorDeclaration : list) {
        List<SNode> parameterTypes = ListSequence.fromList(new ArrayList<SNode>());
        for(SNode parameter : SLinkOperations.getTargets(constructorDeclaration, "parameter", true)) {
          ListSequence.fromList(parameterTypes).addElement(SNodeOperations.copyNode(SLinkOperations.getTarget(parameter, "type", true)));
        }
        boolean good = ResolveUtil.goodArguments(parameterTypes, SLinkOperations.getTargets(constructorCall, "actualArgument", true));
        if (good) {
          SLinkOperations.setTarget(constructorCall, "baseMethodDeclaration", constructorDeclaration, false);
          return;
        }
      }
    } else if (SNodeOperations.isInstanceOf(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration") && SNodeOperations.isInstanceOf(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("classifier")[0]), "jetbrains.mps.baseLanguage.structure.EnumClass")) {
      SNode constantDeclaration = SNodeOperations.cast(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration");
      SNode enumClass = SNodeOperations.cast(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("classifier")[0]), "jetbrains.mps.baseLanguage.structure.EnumClass");
      List<SNode> list = SLinkOperations.getTargets(enumClass, "constructor", true);
      for(SNode constructorDeclaration : list) {
        List<SNode> parameterTypes = ResolveUtil.parameterTypes(constructorDeclaration, SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(constantDeclaration), "jetbrains.mps.baseLanguage.structure.ClassifierType"), ((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("classifier")[0]));
        boolean good = ResolveUtil.goodArguments(parameterTypes, SLinkOperations.getTargets(constantDeclaration, "actualArgument", true));
        if (good) {
          SLinkOperations.setTarget(constantDeclaration, "baseMethodDeclaration", constructorDeclaration, false);
          return;
        }
      }
    } else if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0])), "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      SNode operandType = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0])), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true));
      if (!(SNodeOperations.isInstanceOf(operandType, "jetbrains.mps.baseLanguage.structure.ClassifierType"))) {
        return;
      }
      SNode instanceType = SNodeOperations.cast(operandType, "jetbrains.mps.baseLanguage.structure.ClassifierType");
      ClassifierAndSuperClassifiersScope scope = new ClassifierAndSuperClassifiersScope(((Classifier)SNodeOperations.getAdapter(SLinkOperations.getTarget(instanceType, "classifier", false))));
      List<SNode> mDecls = ((List<SNode>)BaseAdapter.toNodes(scope.getMethodsByName(SPropertyOperations.getString(SLinkOperations.getTarget(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "baseMethodDeclaration", false), "name"))));
      for(SNode methodDecl : mDecls) {
        List<SNode> parameterTypes = ResolveUtil.parameterTypes(methodDecl, instanceType, ((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("classifier")[0]));
        boolean good = ResolveUtil.goodArguments(parameterTypes, SLinkOperations.getTargets(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "actualArgument", true));
        if (good) {
          SLinkOperations.setTarget(((SNode)ChooseAppropriateMethodDeclaration_QuickFix.this.getField("methodCall")[0]), "baseMethodDeclaration", methodDecl, false);
          return;
        }
      }
    }
  }

}
