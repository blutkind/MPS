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
package jetbrains.mps.smodel.search;

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Condition;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * author: Igor Alshannikov
 * Sep 20, 2006
 */
public class ModelNodesSearchScope extends AbstractSearchScope {
  private SModel myModel;

  public ModelNodesSearchScope(SModel model) {
    myModel = model;
  }

  @NotNull
  public List<SNode> getNodes(Condition<SNode> condition) {
    return myModel.allNodes(condition);
  }
}
