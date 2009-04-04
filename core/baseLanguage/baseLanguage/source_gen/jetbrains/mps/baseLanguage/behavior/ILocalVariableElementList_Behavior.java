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
package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ILocalVariableElementList_Behavior {
  private static Class[] PARAMETERS_1238805763253 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> call_getLocalVariableElements_1238805763253(SNode thisNode) {
    return (List<SNode>)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getLocalVariableElements_1238805763253", PARAMETERS_1238805763253);
  }

  public static List<SNode> callSuper_getLocalVariableElements_1238805763253(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getLocalVariableElements_1238805763253", PARAMETERS_1238805763253);
  }

}
