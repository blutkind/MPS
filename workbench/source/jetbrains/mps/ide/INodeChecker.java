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
package jetbrains.mps.ide;

import com.intellij.openapi.extensions.ExtensionPointName;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;

import java.util.Set;

public interface INodeChecker {
  public static ExtensionPointName<INodeChecker> CHECKERS = ExtensionPointName.create("com.intellij.mps.SpecificCheckers");

  public abstract Set<IErrorReporter> getErrors(SNode node, IOperationContext operationContext);
}
