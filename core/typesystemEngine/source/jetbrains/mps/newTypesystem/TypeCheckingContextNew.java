/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.newTypesystem;

import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.errors.QuickFixProvider;
import jetbrains.mps.newTypesystem.operation.AbstractOperation;
import jetbrains.mps.newTypesystem.state.State;
import jetbrains.mps.newTypesystem.state.WhenConcreteBlock;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.*;
import jetbrains.mps.util.Pair;

import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: Ilya.Lintsbakh
 * Date: Sep 10, 2010
 * Time: 4:32:55 PM
 */
public class TypeCheckingContextNew extends TypeCheckingContext {
  public static final String USE_NEW_TYPESYSTEM = "useNewTypeSystem";

  private State myState;
  private SNode myRootNode;
  private TypeChecker myTypeChecker;
  private SubTyping mySubTyping;
  private boolean myChecked = false;

  public TypeCheckingContextNew(SNode rootNode, TypeChecker typeChecker) {
    super(rootNode, typeChecker);
    myState = new State(this);
    myRootNode = rootNode;
    myNodeTypesComponent = new NodeTypesComponentNew(myRootNode, typeChecker, this);
    myTypeChecker = typeChecker;
    mySubTyping = new SubTyping(myState, typeChecker);
  }

  public TypeCheckingContextNew(SNode rootNode, TypeChecker typeChecker, boolean resolving) {
    super(rootNode, typeChecker, resolving);
    myState = new State(this);
    myRootNode = rootNode;
    myNodeTypesComponent = new NodeTypesComponentNew(myRootNode, typeChecker, this);
    myTypeChecker = typeChecker;
    mySubTyping = new SubTyping(myState, typeChecker);
  }

  public void rollBack() {
    if (getOperationStack().isEmpty()) {
      return;
    }
    jetbrains.mps.newTypesystem.operation.AbstractOperation operation = getOperationStack().pop();
    System.out.println("Rolled back (" + operation.getPresentation() + ")");
    operation.undo(myState);
  }

  @Override
  public void checkRoot() {
    if (!myChecked) {
      myChecked = true;
      checkRoot(true);
    }
    // myState.solveInequalities();
  }
     /*
  @Override
  public SNode getTypeOf(SNode node, TypeChecker typeChecker) {
    synchronized (TYPECHECKING_LOCK) {
      return myState.typeOf(node, null);
    }
  }
     */
  /*
@Override
public SNode getOverloadedOperationType(SNode operation, SNode leftOperandType, SNode rightOperandType) {
SNode left = myState.expand(leftOperandType);
SNode right = myState.expand(rightOperandType);
return myTypeChecker.getRulesManager().getOperationType(operation, left, right);
}
  */

  @Override
  public void checkRoot(final boolean refreshTypes) {
   // synchronized (TYPECHECKING_LOCK) {
      if (refreshTypes) {
        myState.clear(true);
        myNodeTypesComponent.computeTypes(refreshTypes);
        //((NodeTypesComponentNew)myNodeTypesComponent).checkNode(myRootNode, true);
        myNodeTypesComponent.setCheckedTypesystem();
      }
   // }


  }

  public void solveAndExpand() {
    myState.solveInequalities();
    myState.expandAll();
    myState.checkNonConcreteWhenConcretes();
  }

  @Override
  public void createLessThanInequation(SNode node1, SNode node2, boolean checkOnly, EquationInfo equationInfo) {
    myState.addInequality(node1, node2, true, checkOnly, equationInfo, true);
  }

  @Override
  public void createLessThanInequationStrong(SNode node1, SNode node2, boolean checkOnly, EquationInfo equationInfo) {
    myState.addInequality(node1, node2, false, checkOnly, equationInfo, true);
  }

  @Override
  public void createGreaterThanInequation(SNode node1, SNode node2, boolean checkOnly, EquationInfo equationInfo) {
    myState.addInequality(node2, node1, true, checkOnly, equationInfo, false);
  }

  @Override
  public void createGreaterThanInequationStrong(SNode node1, SNode node2, boolean checkOnly, EquationInfo equationInfo) {
    myState.addInequality(node2, node1, false, checkOnly, equationInfo, false);
  }

  @Override
  public void createEquation(SNode node1, SNode node2, EquationInfo equationInfo) {
    myState.addEquation(node1, node2, equationInfo);
  }

  public void createLessThanInequationStrong(SNode node1, SNode node2, SNode nodeToCheck,
                                             String errorString, String ruleModel, String ruleId, boolean checkOnly,
                                             int inequationPriority, QuickFixProvider intentionProvider) {
    myState.addInequality(node1, node2, false, checkOnly, new EquationInfo(nodeToCheck, errorString, ruleModel,
      ruleId, inequationPriority, intentionProvider), true);
  }

  @Override
  public void createGreaterThanInequation(SNode node1, SNode node2, SNode nodeToCheck, String errorString, String ruleModel, String ruleId, boolean checkOnly, int inequationPriority, QuickFixProvider intentionProvider) {
    myState.addInequality(node2, node1, false, checkOnly, new EquationInfo(nodeToCheck, errorString, ruleModel,
      ruleId, inequationPriority, intentionProvider), false);
  }


  @Override
  public SNode typeOf(SNode node, String ruleModel, String ruleId, boolean addDependency) {
    EquationInfo info = new EquationInfo(node, "typeOf", ruleModel, ruleId);
    if (node == null) return null;
    SNode type = null;
    NodeTypesComponent currentTypesComponent = getNodeTypesComponent();   //first, in current component
    if (currentTypesComponent != null) {
      //--- for incremental algorithm:
      currentTypesComponent.addNodeToFrontier(node);
      currentTypesComponent.typeOfNodeCalled(node);
      if (addDependency) {
        currentTypesComponent.addDependcyOnCurrent(node);
      }
      if (ruleModel != null && ruleId != null) {
        currentTypesComponent.markNodeAsAffectedByRule(node, ruleModel, ruleId);
        //todo wrap into "if (addDependency) {}" when sure that typeof works fine
      }
    }
    //((NodeTypesComponentNew)myNodeTypesComponent).checkIfNotChecked(node);
    return myState.typeOf(node, info);
  }

  @Override
  public Set<Pair<SNode, List<IErrorReporter>>> getNodesWithErrors() {
    return myState.getNodeMaps().getNodesWithErrors();
  }

  @Override
  public SNode getRepresentative(SNode node) {
    return myState.getRepresentative(node);
  }

  @Override
  public List<IErrorReporter> getTypeMessagesDontCheck(SNode node) {
    return myState.getNodeMaps().getNodeErrors(node);
  }

  @Override
  public void reportMessage(SNode nodeWithError, IErrorReporter errorReporter) {
    if (nodeWithError == null) {
      return;
    }
    if (!ErrorReportUtil.shouldReportError(nodeWithError)) return;
    myState.addError(nodeWithError, errorReporter, null);
  }

  @Override
  public SNode getTypeDontCheck(SNode node) {
    synchronized (TYPECHECKING_LOCK) {
      return myState.getNodeMaps().getType(node);
    }
  }

  @Override
  public void whenConcrete(SNode argument, Runnable r, String nodeModel, String nodeId) {
    myState.addBlock(new WhenConcreteBlock(myState, r, nodeModel, nodeId, argument, false));
  }

  @Override
  public void whenConcrete(SNode argument, Runnable r, String nodeModel, String nodeId, boolean isShallow, boolean skipError) {
    myState.addBlock(new WhenConcreteBlock(myState, r, nodeModel, nodeId, argument, isShallow));
  }

  public jetbrains.mps.newTypesystem.state.State getState() {
    return myState;
  }

  public TypeChecker getTypeChecker() {
    return myTypeChecker;
  }

  public SubTyping getSubTyping() {
    return mySubTyping;
  }

  public Stack<AbstractOperation> getOperationStack() {
    return myState.getOperationStack();
  }

  public AbstractOperation getOperation() {
    return myState.getOperation();
  }

  @Override
  public SNode createNewRuntimeTypesVariable() {
    return myState.createNewRuntimeTypesVariable();
  }

  @Override
  public void clear() {
    myState.clear(true);
    myChecked = false;
  }

  @Override
  public NodeTypesComponent getNodeTypesComponent() {
    return myNodeTypesComponent;
  }

  @Override
  public SNode getOverloadedOperationType(SNode operation, SNode leftOperandType, SNode rightOperandType) {
    SNode left = myState.expand(leftOperandType);
    SNode right = myState.expand(rightOperandType);
    return myTypeChecker.getRulesManager().getOperationType(operation, left, right);
  }

  @Override
  public EquationManager getEquationManager() {
    return null;
  }

  @Override
  public boolean isIncrementalMode() {
    return false;
  }
  /*
  @Override
  public SNode computeTypeInferenceMode(SNode node) {
    return super.computeTypeInferenceMode(node);    //To change body of overridden methods use File | Settings | File Templates.
  } */

  @Override
  public void createEquation(SNode node1, IWrapper wrapper2, EquationInfo equationInfo) {
    createEquation(node1, wrapper2.getNode(), equationInfo);
  }

  @Override
  public void createEquation(IWrapper wrapper1, SNode node2, EquationInfo equationInfo) {
    createEquation(wrapper1.getNode(), node2, equationInfo);
  }

  @Override
  public void createEquation(IWrapper wrapper1, IWrapper wrapper2, EquationInfo equationInfo) {
    createEquation(wrapper1.getNode(), wrapper2.getNode(), equationInfo);
  }

  @Override
  public void createComparableEquation(SNode node1, SNode node2, EquationInfo equationInfo) {
    myState.addComparable(node1, node2, true, equationInfo);
  }

  @Override
  public void createComparableEquationStrong(SNode node1, SNode node2, EquationInfo equationInfo) {
    myState.addComparable(node1, node2, false, equationInfo);
  }

  @Override
  public NodeTypesComponent getBaseNodeTypesComponent() {
    return myNodeTypesComponent;
  }

  @Override
  public SNode typeOf(SNode node) {
    return typeOf(node, null, null, true);
  }


  @Override
  public void addDependencyForCurrent(SNode node) {
    getNodeTypesComponent().addDependencyForCurrent(node);
  }

  @Override
  protected SNode getTypeOf_generationMode(SNode node) {
    try {
      return myNodeTypesComponent.computeTypesForNodeDuringGeneration(node);
    } finally {
      myNodeTypesComponent.dispose();
    }
  }

  @Override
  protected SNode getTypeOf_resolveMode(SNode node, TypeChecker typeChecker) {
    Pair<SNode, Boolean> pair = typeChecker.getTypeComputedForCompletion(node);
    if (pair.o2) {
      return pair.o1;
    }
    SNode resultType = myNodeTypesComponent.computeTypesForNodeDuringResolving(node);
    typeChecker.putTypeComputedForCompletion(node, resultType);
    return resultType;
  }

  @Override
  public SubtypingManager getSubtypingManager() {
    return null;
  }

  @Override
  public void dispose() {
    super.dispose();
    myState.clear(true);
  }

  @Override
  protected SNode getTypeOf_normalMode(SNode node) {
    return super.getTypeOf_normalMode(node);    //To change body of overridden methods use File | Settings | File Templates.
  }
}
