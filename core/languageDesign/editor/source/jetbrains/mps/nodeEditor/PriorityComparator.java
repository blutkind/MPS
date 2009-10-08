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
package jetbrains.mps.nodeEditor;

import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 21.07.2009
 * Time: 21:11:04
 * To change this template use File | Settings | File Templates.
 */
public class PriorityComparator implements Comparator<IEditorChecker> {
  public int compare(IEditorChecker o1, IEditorChecker o2) {
    if (o1.isEarlierThan(o2)) {
      return -1;
    }
    if (o1.isLaterThan(o2)) {
      return 1;
    }
    if (o2.isEarlierThan(o1)) {
      return 1;
    }
    if (o2.isLaterThan(o1)) {
      return -1;
    }
    return 0;
  }
}
