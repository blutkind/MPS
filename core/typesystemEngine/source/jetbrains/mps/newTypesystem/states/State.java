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
package jetbrains.mps.newTypesystem.states;


import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.newTypesystem.TypeCheckingContextNew;
import jetbrains.mps.newTypesystem.differences.Difference;
import jetbrains.mps.newTypesystem.differences.HeadDifference;
import jetbrains.mps.newTypesystem.differences.StringDifference;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.*;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: Ilya.Lintsbakh
 * Date: Sep 10, 2010
 * Time: 6:09:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class State {
  private TypeCheckingContextNew myTypeCheckingContext;

  private Equations myEquations;
  private Inequalities myInequalities;
  private NodeMaps myNodeMaps;
  private NonConcrete myNonConcrete;

  private Stack<Difference> myDifferenceStack = new Stack<Difference>();
  private Difference myDifference = new HeadDifference();

  public State(TypeCheckingContextNew tcc) {
    myTypeCheckingContext = tcc;
    myEquations = new Equations(this);
    myInequalities = new Inequalities(this);
    myNonConcrete = new NonConcrete(this);
    myNodeMaps = new NodeMaps(this);
  }

  public Equations getEquations() {
    return myEquations;
  }

  public void addEquation(SNode left, SNode right, EquationInfo info) {
    myEquations.addEquation(left, right, info);
  }

  public void addInequality(SNode subType, SNode superType, boolean isWeak, boolean check, EquationInfo info) { 
    myInequalities.addInequality(subType, superType, isWeak, check, info);
  }

  public NodeMaps getNodeMaps() {
    return myNodeMaps;
  }

  public Inequalities getInequalities() {
    return myInequalities;
  }

  public TypeCheckingContextNew getTypeCheckingContext() {
    return myTypeCheckingContext;
  }

  public void addDifference(Difference difference, boolean push) {
    if (difference == null) {
      return;
    }
    if (!myDifferenceStack.empty()) {
      myDifferenceStack.peek().addChildDifference(difference);
    }
    if (push || myDifferenceStack.empty()) {
      myDifferenceStack.push(difference);
    }
  }

  public void popDifference() {
    myDifferenceStack.pop();
  }

  public boolean isConcrete(SNode wrapper) {
    return myNonConcrete.isConcrete(wrapper);
  }

  public void addError(SNode node, IErrorReporter error, EquationInfo info) {
    myNodeMaps.addNodeToError(node, error, info);
  }

  public NonConcrete getNonConcrete() {
    return myNonConcrete;
  }

  public SNode typeOf(SNode node, EquationInfo info) {
    return myNodeMaps.typeOf(node, info);
  }

  public void clear(boolean clearDiff) {
    myEquations.clear();
    myInequalities.clear();
    myNodeMaps.clear();
    myNonConcrete.clear();
    if (clearDiff) {
      myDifferenceStack.clear();
      myDifference = new HeadDifference();
      myDifferenceStack.push(myDifference);
    }
  }

  public void solveInequalities() {
    addDifference(new StringDifference("Solving inequalities"),true);
    myInequalities.solveInequalities();
    popDifference();
  }

  public Stack<Difference> getDifferenceStack() {
    return myDifferenceStack;
  }

  public Difference getDifference() {
    return myDifference;
  }

  public void addWhenConcrete(WhenConcreteEntry entity, SNode node, boolean shallow) {
    myNonConcrete.addNonConcrete(entity, node, shallow);
  }

  public void expandAll() {
    addDifference(new StringDifference("Types Expansion"), true);
    myNodeMaps.expandAll();
    popDifference();    
  }

  public boolean applyDifferenceBefore(Difference diff, Object toCompare) {
    diff.play();
    if (diff.equals(toCompare)) {
      return true;
    }
    if (diff.getChildren() == null) {
      return false;
    }
    for (Difference child : diff.getChildren()) {
      if (applyDifferenceBefore(child, toCompare)) {
        return true;
      }
    }
    return false;
  }

  public void reset() {
    clear(false);
    myDifference.playRecursively();
  }
}
