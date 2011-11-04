package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.dataFlow.framework.AnalysisResult;
import jetbrains.mps.lang.dataFlow.framework.VarSet;
import java.util.Set;
import jetbrains.mps.lang.dataFlow.framework.instructions.WriteInstruction;
import jetbrains.mps.baseLanguage.behavior.IExtractMethodRefactoringProcessor;
import jetbrains.mps.lang.dataFlow.DataFlowManager;
import jetbrains.mps.lang.dataFlow.framework.analyzers.ReachabilityAnalyzer;
import jetbrains.mps.lang.dataFlow.framework.analyzers.LivenessAnalyzer;
import jetbrains.mps.lang.dataFlow.framework.analyzers.ReachingDefinitionsAnalyzer;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.LinkedHashSet;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import jetbrains.mps.lang.pattern.util.MatchingUtil;
import jetbrains.mps.lang.dataFlow.framework.instructions.EndInstruction;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.LinkedHashMap;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.baseLanguage.behavior.IParameter_Behavior;
import jetbrains.mps.baseLanguage.behavior.IExtractMethodAvailable_Behavior;
import jetbrains.mps.baseLanguage.behavior.AbstractExtractMethodRefactoringProcessor;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.dataFlow.framework.instructions.ReadInstruction;
import jetbrains.mps.baseLanguage.behavior.VariableDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ExtractMethodRefactoringAnalyzer {
  private List<SNode> myPartToExtract;
  private Program myProgram;
  private List<SNode> myInternalExitPoints;
  private AnalysisResult<Boolean> myReachability;
  private AnalysisResult<VarSet> myLiveVariables;
  private AnalysisResult<Set<WriteInstruction>> myReachingDefinitions;
  private IExtractMethodRefactoringProcessor myProcessor;
  private boolean shouldBeStatic;
  private boolean canBeStatic;
  private boolean shouldChooseOuterContainer;

  public ExtractMethodRefactoringAnalyzer(List<SNode> nodes) {
    this.myPartToExtract = nodes;
    this.findExtractMethodRefactoringProcessor();
    this.myProgram = DataFlowManager.getInstance().buildProgramFor(this.myProcessor.getContainerMethod());
    this.myReachability = this.myProgram.analyze(new ReachabilityAnalyzer());
    this.myInternalExitPoints = this.calculateInternalExitPoints();
    this.myLiveVariables = this.myProgram.analyze(new LivenessAnalyzer());
    this.myReachingDefinitions = this.myProgram.analyze(new ReachingDefinitionsAnalyzer());
    this.shouldBeStatic = this.findIfShouldBeStatic();
    this.canBeStatic = this.findIfCanBeStatic();
  }

  /*package*/ boolean hasExitPoints() {
    return ListSequence.fromList(this.myInternalExitPoints).count() > 0;
  }

  private boolean isInside(SNode node) {
    SNode current = node;
    while (current != null) {
      if (ListSequence.fromList(this.myPartToExtract).contains(current)) {
        return true;
      }
      current = SNodeOperations.getParent(current);
    }
    return false;
  }

  public boolean shouldBeStatic() {
    return shouldBeStatic;
  }

  public boolean canBeStatic() {
    return canBeStatic;
  }

  public boolean shouldChooseOuterContainer() {
    return shouldChooseOuterContainer;
  }

  private boolean findIfShouldBeStatic() {
    if (shouldChooseOuterContainer) {
      return true;
    }
    SNode containerMethod = this.myProcessor.getContainerMethod();
    if (SNodeOperations.isInstanceOf(containerMethod, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration") || SNodeOperations.isInstanceOf(containerMethod, "jetbrains.mps.lang.behavior.structure.StaticConceptMethodDeclaration")) {
      return true;
    } else {
      return false;
    }
  }

  private boolean findIfCanBeStatic() {
    for (SNode node : ListSequence.fromList(this.myPartToExtract)) {
      if (ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference", false, new String[]{})).isNotEmpty() || ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.baseLanguage.structure.IThisExpression", false, new String[]{})).isNotEmpty() || ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall", false, new String[]{})).isNotEmpty() || ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.baseLanguage.structure.SuperMethodCall", false, new String[]{})).isNotEmpty()) {
        return false;
      }
    }
    return true;
  }

  private List<SNode> calculateInternalExitPoints() {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode node : ListSequence.fromList(this.myPartToExtract)) {
      List<SNode> returns = SNodeOperations.getDescendants(node, "jetbrains.mps.baseLanguage.structure.ReturnStatement", true, new String[]{});
      for (SNode ret : ListSequence.fromList(returns)) {
        SNode a1 = SNodeOperations.getAncestor(ret, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false);
        SNode a2 = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false);
        if (a1 == a2) {
          ListSequence.fromList(result).addElement(ret);
        }
      }
      List<SNode> statements = new ArrayList<SNode>();
      ListSequence.fromList(statements).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.baseLanguage.structure.BreakStatement", false, new String[]{})));
      ListSequence.fromList(statements).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.baseLanguage.structure.ContinueStatement", false, new String[]{})));
      for (SNode st : ListSequence.fromList(statements)) {
        SNode a1 = SNodeOperations.getAncestor(st, "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement", false, false);
        SNode a2 = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement", false, false);
        if (a1 == a2) {
          ListSequence.fromList(result).addElement(st);
        }
      }
    }
    return result;
  }

  /*package*/ List<SNode> getIntenalExitPoints() {
    return this.myInternalExitPoints;
  }

  /*package*/ List<SNode> getOutputVariables() {
    Set<SNode> result = SetSequence.fromSet(new HashSet<SNode>());
    SetSequence.fromSet(result).addSequence(SetSequence.fromSet(this.getVarableLiveAtExitPoints()));
    Iterable<SNode> t = SetSequence.fromSet(result).intersect(SetSequence.fromSet(this.getModificationsReachingExitPoints(true)));
    return ListSequence.fromListWithValues(new ArrayList<SNode>(), Sequence.fromIterable(t).toListSequence());
  }

  private Set<SNode> getModificationsReachingExitPoints(boolean internal) {
    Set<SNode> result = SetSequence.fromSet(new LinkedHashSet<SNode>());
    for (Instruction preExit : SetSequence.fromSet(this.getPreExitPoints())) {
      for (WriteInstruction writeInstruction : SetSequence.fromSet(((Set<WriteInstruction>) this.myReachingDefinitions.get(preExit)))) {
        if (internal == this.isInside(((SNode) writeInstruction.getSource()))) {
          SetSequence.fromSet(result).addElement(((SNode) writeInstruction.getVariable()));
        }
      }
    }
    return result;
  }

  private Set<SNode> getVarableLiveAtExitPoints() {
    Set<SNode> result = SetSequence.fromSet(new LinkedHashSet<SNode>());
    for (Instruction exitPoint : SetSequence.fromSet(this.getExitPoints())) {
      for (Object variable : SetSequence.fromSet(this.myLiveVariables.get(exitPoint))) {
        SetSequence.fromSet(result).addElement(((SNode) variable));
      }
    }
    return result;
  }

  private Set<Instruction> getExitPoints() {
    Set<Instruction> result = SetSequence.fromSet(new LinkedHashSet<Instruction>());
    Set<Instruction> instructions = this.getInstructions();
    for (Instruction instruction : SetSequence.fromSet(instructions)) {
      SetSequence.fromSet(result).addSequence(SetSequence.fromSet(instruction.succ()));
    }
    SetSequence.fromSet(result).removeSequence(SetSequence.fromSet(instructions));
    return result;
  }

  private Set<Instruction> getPreExitPoints() {
    Set<Instruction> result = SetSequence.fromSet(new LinkedHashSet<Instruction>());
    Set<Instruction> exitPoints = this.getExitPoints();
    for (Instruction exitPoint : SetSequence.fromSet(exitPoints)) {
      SetSequence.fromSet(result).addSequence(SetSequence.fromSet(exitPoint.pred()));
    }
    Set<Instruction> tmp = SetSequence.fromSet(new HashSet<Instruction>());
    SetSequence.fromSet(tmp).addSequence(SetSequence.fromSet(result).intersect(SetSequence.fromSet(this.getInstructions())));
    return tmp;
  }

  /*package*/ boolean isExitPointsDifferent() {
    List<SNode> exits = this.myInternalExitPoints;
    for (int i = 1; i < ListSequence.fromList(exits).count(); i++) {
      if (!(MatchingUtil.matchNodes(ListSequence.fromList(exits).getElement(i - 1), ListSequence.fromList(exits).getElement(i)))) {
        return true;
      }
    }
    return false;
  }

  /*package*/ boolean isAlwaysReturns() {
    for (Instruction instruction : SetSequence.fromSet(this.getInstructions())) {
      if (this.myReachability.get(instruction)) {
        for (Instruction next : SetSequence.fromSet(instruction.succ())) {
          SNode nextNode = (SNode) next.getSource();
          if (!(next instanceof EndInstruction)) {
            if (next.getSource() == null || !(this.isInside(nextNode))) {
              if (!(SNodeOperations.isInstanceOf(SNodeOperations.getParent(nextNode), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration") || SNodeOperations.isInstanceOf(SNodeOperations.getParent(nextNode), "jetbrains.mps.baseLanguage.structure.ConceptFunction"))) {
                return false;
              }
            }
          }
        }
      }
    }
    return true;
  }

  /*package*/ Set<Instruction> getInstructions() {
    Set<Instruction> result = SetSequence.fromSet(new LinkedHashSet<Instruction>());
    for (SNode node : ListSequence.fromList(this.myPartToExtract)) {
      SetSequence.fromSet(result).addSequence(ListSequence.fromList(this.myProgram.getInstructionsFor(node)));
    }
    return result;
  }

  /*package*/ boolean isReturnExpressionsNotChangedInStatements() {
    List<SNode> returns = this.calculateInternalExitPoints();
    for (SNode ret : ListSequence.fromList(returns)) {
      for (Instruction instruction : ListSequence.fromList(this.myProgram.getInstructionsFor(ret))) {
        for (WriteInstruction writeInstruction : SetSequence.fromSet(this.myReachingDefinitions.get(instruction))) {
          if (this.isInside(((SNode) writeInstruction.getSource()))) {
            return false;
          }
        }
      }
    }
    return true;
  }

  public List<MethodParameter> getInputVariables() {
    Map<SNode, MethodParameter> result = MapSequence.fromMap(new LinkedHashMap<SNode, MethodParameter>(16, (float) 0.75, false));
    this.addDataflowParameters(result);
    // added to fix problems with closures 
    addExternalParameters(result);
    for (SNode node : ListSequence.fromList(this.myPartToExtract)) {
      for (SNode parameter : ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.baseLanguage.structure.IParameter", true, new String[]{}))) {
        SNode expressionType = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(parameter), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.Type"), true);
        MapSequence.fromMap(result).put(IParameter_Behavior.call_getDeclaration_1225282371351(parameter), new MethodParameter(IParameter_Behavior.call_getDeclaration_1225282371351(parameter), expressionType, IParameter_Behavior.call_getParameterName_1225280611056(parameter), parameter));
      }
    }
    return ListSequence.fromListWithValues(new ArrayList<MethodParameter>(), MapSequence.fromMap(result).values());
  }

  /*package*/ SNode getClassifier() {
    return SNodeOperations.getAncestor(ListSequence.fromList(this.myPartToExtract).first(), "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
  }

  public IExtractMethodRefactoringProcessor getExtractMethodReafactoringProcessor() {
    return this.myProcessor;
  }

  private void findExtractMethodRefactoringProcessor() {
    shouldChooseOuterContainer = false;
    SNode first = ListSequence.fromList(this.myPartToExtract).first();
    SNode classConcept = SNodeOperations.getAncestor(first, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    if (classConcept != null) {
      this.myProcessor = new ClassExtractMethodRefactoringProcessor(classConcept, this.myPartToExtract);
    } else if (SNodeOperations.getAncestor(first, "jetbrains.mps.baseLanguage.structure.IExtractMethodAvailable", false, false) != null) {
      SNode extractable = SNodeOperations.getAncestor(first, "jetbrains.mps.baseLanguage.structure.IExtractMethodAvailable", false, false);
      this.myProcessor = IExtractMethodAvailable_Behavior.call_getExtractMethodRefactoringProcessor_1221393367929(extractable, this.myPartToExtract);
    } else {
      this.myProcessor = new AbstractExtractMethodRefactoringProcessor(null, this.myPartToExtract);
      shouldChooseOuterContainer = true;
    }
  }

  private void addExternalParameters(Map<SNode, MethodParameter> result) {
    SNode list = SNodeOperations.getAncestor(ListSequence.fromList(myPartToExtract).getElement(0), "jetbrains.mps.baseLanguage.structure.StatementList", false, false);
    while (SNodeOperations.isInstanceOf(SNodeOperations.getParent(list), "jetbrains.mps.baseLanguage.structure.Statement")) {
      list = SNodeOperations.getAncestor(list, "jetbrains.mps.baseLanguage.structure.StatementList", false, false);
    }
    Program program = DataFlowManager.getInstance().buildProgramFor(list);
    Set<Instruction> nodeInstructions = SetSequence.fromSet(new HashSet<Instruction>());
    for (SNode node : ListSequence.fromList(myPartToExtract)) {
      SetSequence.fromSet(nodeInstructions).addSequence(ListSequence.fromList(program.getInstructionsFor(node)));
    }
    AnalysisResult<Set<WriteInstruction>> reachability = program.analyze(new ReachingDefinitionsAnalyzer());
    for (Instruction instruction : SetSequence.fromSet(nodeInstructions).where(new IWhereFilter<Instruction>() {
      public boolean accept(Instruction it) {
        return it instanceof ReadInstruction;
      }
    })) {
      final ReadInstruction read = (ReadInstruction) instruction;
      Set<WriteInstruction> writes = reachability.get(read);
      if (SetSequence.fromSet(writes).where(new IWhereFilter<WriteInstruction>() {
        public boolean accept(WriteInstruction it) {
          return it.getVariable() == read.getVariable();
        }
      }).isEmpty()) {
        SNode declaration = ((SNode) read.getVariable());
        if (MapSequence.fromMap(result).containsKey(declaration)) {
          continue;
        }
        if (SNodeOperations.isInstanceOf(declaration, "jetbrains.mps.baseLanguage.structure.FieldDeclaration") || SNodeOperations.isInstanceOf(declaration, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")) {
          continue;
        }
        SNode type = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(declaration), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.Type"), true);
        SNode reference;
        if (SNodeOperations.isInstanceOf(declaration, "jetbrains.mps.baseLanguage.structure.VariableDeclaration")) {
          reference = VariableDeclaration_Behavior.call_createReference_1213877517482(SNodeOperations.cast(declaration, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"));
        } else {
          reference = ((SNode) read.getSource());
        }
        if (SNodeOperations.isInstanceOf(reference, "jetbrains.mps.baseLanguage.structure.Expression")) {
          MapSequence.fromMap(result).put(declaration, new MethodParameter(declaration, type, SPropertyOperations.getString(declaration, "name"), reference));
        }
      }
    }
  }

  private void addDataflowParameters(Map<SNode, MethodParameter> result) {
    for (Instruction instruction : SetSequence.fromSet(this.getInstructions())) {
      if ((instruction instanceof ReadInstruction)) {
        ReadInstruction read = (ReadInstruction) instruction;
        Set<WriteInstruction> writes = this.myReachingDefinitions.get(read);
        for (WriteInstruction write : SetSequence.fromSet(writes)) {
          if (write.getVariable() == read.getVariable()) {
            if (!(this.isInside(((SNode) write.getSource())))) {
              SNode declaration = ((SNode) read.getVariable());
              if (!(MapSequence.fromMap(result).containsKey(declaration))) {
                SNode type = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(declaration), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.Type"), true);
                SNode reference;
                if (SNodeOperations.isInstanceOf(declaration, "jetbrains.mps.baseLanguage.structure.VariableDeclaration")) {
                  reference = VariableDeclaration_Behavior.call_createReference_1213877517482(SNodeOperations.cast(declaration, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"));
                } else {
                  reference = ((SNode) read.getSource());
                }
                if (SNodeOperations.isInstanceOf(reference, "jetbrains.mps.baseLanguage.structure.Expression")) {
                  MapSequence.fromMap(result).put(declaration, new MethodParameter(declaration, type, SPropertyOperations.getString(declaration, "name"), reference));
                }
              }
            }
          }
        }
      }
    }
  }

  public static boolean isStatements(List<SNode> nodes) {
    return SNodeOperations.isInstanceOf(ListSequence.fromList(nodes).first(), "jetbrains.mps.baseLanguage.structure.Statement");
  }
}
