/*
 * Copyright 2003-2011 JetBrains s.r.o.
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
package jetbrains.mps.typesystem.inference;

import gnu.trove.THashSet;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.lang.pattern.util.MatchingUtil;
import jetbrains.mps.newTypesystem.SubTypingManagerNew;
import jetbrains.mps.newTypesystem.TypesUtil;
import jetbrains.mps.newTypesystem.state.Equations;
import jetbrains.mps.newTypesystem.state.State;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.misc.hash.HashSet;

import java.util.List;
import java.util.Set;

public class InequalitySystem {
  private SNode myHoleType;
  private State myState;

  public InequalitySystem(SNode holeType, State state) {
    myHoleType = holeType;
    myState = state;
  }

  public SNode getHoleType() {
    return myHoleType;
  }

  private Set<SNode> myEquals = new THashSet<SNode>();
  private Set<SNode> mySubTypes = new THashSet<SNode>();
  private Set<SNode> myStrongSubTypes = new THashSet<SNode>();
  private Set<SNode> mySuperTypes = new THashSet<SNode>();
  private Set<SNode> myStrongSuperTypes = new THashSet<SNode>();
  private Set<SNode> myComparableTypes = new THashSet<SNode>();
  private Set<SNode> myStrongComparableTypes = new THashSet<SNode>();

  public void addEquation(SNode equalWrapper) {
    myEquals.add(equalWrapper);
  }

  public void addSupertype(SNode supertype, boolean isWeak) {
    if (isWeak) {
      mySuperTypes.add(supertype);
    } else {
      myStrongSuperTypes.add(supertype);
    }
  }

  public void addSubtype(SNode subtype, boolean isWeak) {
    if (isWeak) {
      mySubTypes.add(subtype);
    } else {
      myStrongSubTypes.add(subtype);
    }
  }

  public void addComparable(SNode comparable, boolean isWeak) {
    if (isWeak) {
      myComparableTypes.add(comparable);
    } else {
      myStrongComparableTypes.add(comparable);
    }
  }

  public boolean satisfies(SNode type) {
    SubtypingManager subtypingManager = TypeChecker.getInstance().getSubtypingManager();

    for (SNode w : myEquals) {
      if (!MatchingUtil.matchNodes(w, type)) {
        return false;
      }
    }
    for (SNode supertype : mySuperTypes) {
      if (!subtypingManager.isSubtype(type, supertype, true)) return false;
    }
    for (SNode supertype : myStrongSuperTypes) {
      if (!subtypingManager.isSubtype(type, supertype, false)) return false;
    }
    for (SNode subtype : mySubTypes) {
      if (!subtypingManager.isSubtype(subtype, type, true)) return false;
    }
    for (SNode subtype : myStrongSubTypes) {
      if (!subtypingManager.isSubtype(subtype, type, false)) return false;
    }
    for (SNode comparable : myComparableTypes) {
      if (!subtypingManager.isComparable(comparable, type, true)) return false;
    }
    for (SNode comparable : myStrongComparableTypes) {
      if (!subtypingManager.isComparable(comparable, type, false)) return false;
    }

    return true;
  }

  private Set<SNode> expandSet(Set<SNode> set, Equations equations) {
    if (set.isEmpty()) return set;
    Set<SNode> result = new HashSet<SNode>();
    for (SNode node : set) {
      SNode expanded = equations.expandNode(node, true);
      //if (!TypesUtil.isVariable(expanded)) {
        result.add(expanded);
      //}
    }

    return result;
  }

  public void expandAll(Equations equations) {
    myEquals = expandSet(myEquals, equations);
    mySubTypes = expandSet(mySubTypes, equations);
    myComparableTypes = expandSet(myComparableTypes, equations);
    mySuperTypes = expandSet(mySuperTypes, equations);
    myStrongSubTypes = expandSet(myStrongSubTypes, equations);
    myStrongSuperTypes = expandSet(myStrongSuperTypes, equations);
    myStrongComparableTypes = expandSet(myStrongComparableTypes, equations);
  }

  public boolean isEmpty() {
    return myEquals.isEmpty() && mySubTypes.isEmpty() && mySuperTypes.isEmpty()
      && myStrongSubTypes.isEmpty() && myStrongSuperTypes.isEmpty() && myComparableTypes.isEmpty() && myStrongComparableTypes.isEmpty();
  }

  public String[] getPresentation() {
    if (isEmpty()) {
      return new String[]{"empty"};
    }
    String[] result = new String[myEquals.size() + mySubTypes.size() + mySuperTypes.size() + myStrongSubTypes.size() + myStrongSuperTypes.size()];
    int i = 0;
    for (SNode wrapper : myEquals) {
      result[i++] = "* == " + wrapper.toString();
    }
    for (SNode wrapper : mySubTypes) {
      result[i++] = wrapper.toString() + " < *";
    }
    for (SNode wrapper : myStrongSubTypes) {
      result[i++] = wrapper.toString() + " << *";
    }
    for (SNode wrapper : mySuperTypes) {
      result[i++] = "* < " + wrapper.toString();
    }
    for (SNode wrapper : myStrongSuperTypes) {
      result[i++] = "* << " + wrapper.toString();
    }
    for (SNode wrapper : myComparableTypes) {
      result[i++] = " ~ " + wrapper.toString();
    }
    for (SNode wrapper : myStrongComparableTypes) {
      result[i++] = " *~ " + wrapper.toString();
    }
    return result;
  }

   public SNode getExpectedType() {
     if (isEmpty()) return null;
     SubTypingManagerNew subtypingManager = (SubTypingManagerNew)TypeChecker.getInstance().getSubtypingManager();
     List<SNode> superTypes = new LinkedList<SNode>();
     expandAll(myState.getEquations());
     superTypes.addAll(mySuperTypes);
     superTypes.addAll(myStrongSuperTypes);
     if (superTypes.isEmpty()) {
       superTypes.addAll(myComparableTypes);
       superTypes.addAll(myStrongComparableTypes);
     }
     return subtypingManager.createLCS(superTypes, myState.getTypeCheckingContext());
   }
}
