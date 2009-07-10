/*
 * Copyright 2003-2009 JetBrains s.r.o.
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
package jetbrains.mps.lang.typesystem.runtime;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.util.MatchingUtil;
import jetbrains.mps.typesystem.inference.SubtypingManager;

/**
 * Created by IntelliJ IDEA.
 * User: User
 * Date: 03.03.2009
 * Time: 16:28:58
 * To change this template use File | Settings | File Templates.
 */
public abstract class OverloadedOperationsTypesProvider implements IOverloadedOpsTypesProvider {
  protected SNode myLeftOperandType;
  protected SNode myRightOperandType;
  protected String myOperationConceptFQName;

  protected boolean myLeftTypeIsExact = false;
  protected boolean myRightTypeIsExact = false;


  public String getApplicableConceptFQName() {
    return myOperationConceptFQName;
  }

  public boolean isApplicable(SubtypingManager subtypingManager, SNode leftOperandType, SNode rightOperandType) {
    if (myLeftTypeIsExact) {
      if (!MatchingUtil.matchNodes(leftOperandType, myLeftOperandType)) {
        return false;
      }
    } else {
      if (!subtypingManager.isSubtype(leftOperandType, myLeftOperandType)) {
        return false;
      }
    }
    if (myRightTypeIsExact) {
      if (!MatchingUtil.matchNodes(rightOperandType, myRightOperandType)) {
        return false;
      }
    } else {
      if (!subtypingManager.isSubtype(rightOperandType, myRightOperandType)) {
        return false;
      }
    }
    return true;
  }

  public int compareTo(IOverloadedOpsTypesProvider o) {
    if (o instanceof OverloadedOperationsTypesProvider) {
      OverloadedOperationsTypesProvider o2 = (OverloadedOperationsTypesProvider) o;
       int i1 = (this.myLeftTypeIsExact ? 1 : 0) + (this.myRightTypeIsExact ? 1 : 0);
       int i2 = (o2.myLeftTypeIsExact ? 1 : 0) + (o2.myRightTypeIsExact ? 1 : 0);
       return i2 - i1;
    }
    if (o instanceof OverloadedOpsProvider_OneTypeSpecified) {
      return -1;
    }
    return 0;
  }
}
