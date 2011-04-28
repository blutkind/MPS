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
package jetbrains.mps.newTypesystem.state.blocks;

import com.intellij.openapi.util.Pair;
import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InequationReplacementRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.IsApplicable2Status;
import jetbrains.mps.newTypesystem.SubTypingManagerNew;
import jetbrains.mps.newTypesystem.TypesUtil;
import jetbrains.mps.newTypesystem.operation.CheckSubTypeOperation;
import jetbrains.mps.newTypesystem.operation.ProcessReplacementRuleOperation;
import jetbrains.mps.newTypesystem.state.ConditionKind;
import jetbrains.mps.newTypesystem.state.State;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.util.CollectionUtil;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Ilya.Lintsbakh
 * Date: Dec 9, 2010
 * Time: 12:11:13 PM
 */
public class InequalityBlock extends RelationBlock {
  private boolean lessThan;

  public SNode getOutput() {
    if (lessThan) {
      return myLeftNode;
    } else {
      return myRightNode;
    }
  }

  public SNode getInput() {
    if (isCheckOnly()) {
      return null;
    }
    if (lessThan) {
      return myRightNode;
    } else {
      return myLeftNode;
    }
  }

  @Override
  public List<Pair<SNode, SNode>> getInputsAndOutputs() {
    List<Pair<SNode, SNode>> result = new LinkedList<Pair<SNode, SNode>>();
    result.add(new Pair<SNode, SNode>(getInput(), getOutput()));
    return result;
  }

  public InequalityBlock(State state, SNode left, SNode right, boolean lessThen, RelationKind kind, EquationInfo equationInfo) {
    super(state, left, right, kind, equationInfo);
    this.lessThan = lessThen;
  }

  @Override
  public void performAction() {
    SNode left = getResolvedInput(myLeftNode);
    SNode right = getResolvedInput(myRightNode);
    processInequality(left, right);
  }

  private boolean processReplacementRules(final SNode subType, final SNode superType) {
    TypeChecker typeChecker = myState.getTypeCheckingContext().getTypeChecker();
    for (jetbrains.mps.util.Pair<InequationReplacementRule_Runtime, IsApplicable2Status> inequalityReplacementRule : typeChecker.getRulesManager().getReplacementRules(subType, superType)) {
      final InequationReplacementRule_Runtime rule = inequalityReplacementRule.o1;

      final IsApplicable2Status status = inequalityReplacementRule.o2;
      myState.executeOperation(new ProcessReplacementRuleOperation(subType, superType, new Runnable() {
        public void run() {
          ((AbstractInequationReplacementRule_Runtime) rule).processInequation(subType, superType, myEquationInfo, myState.getTypeCheckingContext(), status, myRelationKind.isWeak(), lessThan);
        }
      }));
      return true;
    }
    return false;
  }

  public void processInequality(final SNode subType, final SNode superType) {
    if (subType == null || superType == null || subType == superType) {
      return;
    }
    if (TypesUtil.isVariable(subType) && TypesUtil.isVariable(superType)) {
      // for final solving
      return;
    }
    if (processReplacementRules(subType, superType)) {
      return;
    }
    final SubTypingManagerNew subTyping = myState.getTypeCheckingContext().getSubTyping();
    myState.executeOperation(new CheckSubTypeOperation(subType, superType, new Runnable() {
      public void run() {
        if (!subTyping.isSubType(subType, superType, myEquationInfo, myState, myRelationKind.isWeak())) {
          myState.getNodeMaps().reportSubTypeError(subType, superType, myEquationInfo, myRelationKind.isWeak());
        }
      }
    }));
  }

  @Override
  public Set<Pair<SNode, ConditionKind>> getInitialInputs() {
    if (isCheckOnly()) {
      return CollectionUtil.set(new Pair<SNode, ConditionKind>(myLeftNode, ConditionKind.CONCRETE),
        new Pair<SNode, ConditionKind>(myRightNode, ConditionKind.CONCRETE));
    } else {
      //todo create a counterpart for "solve only concrete"
      return CollectionUtil.set(new Pair<SNode, ConditionKind>(myLeftNode, ConditionKind.CONCRETE),
        new Pair<SNode, ConditionKind>(myRightNode, ConditionKind.SHALLOW));
    }
  }

  @Override
  public BlockKind getBlockKind() {
    return BlockKind.INEQUALITY;
  }

  private String getPresentationInternal(SNode left, SNode right) {
    String sign = myRelationKind.getRelationSign();
    if (lessThan) {
      sign = ":" + sign;
    } else {
      sign = sign + ":";
    }
    return left + sign + right;
  }

  @Override
  public String getShortPresentation() {
    return getPresentationInternal(myLeftNode, myRightNode);
  }


  @Override
  public String getExpandedPresentation(State state) {
    return getPresentationInternal(state.expand(myLeftNode), state.expand(myRightNode));
  }
}
