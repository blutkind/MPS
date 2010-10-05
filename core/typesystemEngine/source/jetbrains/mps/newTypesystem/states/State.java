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


import jetbrains.mps.newTypesystem.TypeCheckingContextNew;
import jetbrains.mps.newTypesystem.differences.Difference;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.IWrapper;

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

  public void addEquation(IWrapper left, IWrapper right, EquationInfo info) {
    myEquations.addEquation(left, right, info);
  }

  public void addInequality(IWrapper subType, IWrapper superType, boolean isWeak, boolean check, EquationInfo info) { 
    myInequalities.addInequality(subType, superType, isWeak, check, info);
  }

  public void addNonConcrete(IWrapper left, IWrapper right) {
    myNonConcrete.addNonConcrete(left, right);
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

  public void addDifference(Difference difference) {
    if (difference != null) {
      myTypeCheckingContext.addDifference(difference);
    }
  }


  ///DEBUG ----------------------------------

  public void print() {
    System.out.println("-----state---------");
    myEquations.print();
    myInequalities.print();
    myNonConcrete.print();
   
  }

  public NonConcrete getNonConcrete() {
    return myNonConcrete;
  }
}
