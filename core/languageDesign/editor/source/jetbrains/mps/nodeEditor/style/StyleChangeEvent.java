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
package jetbrains.mps.nodeEditor.style;

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.Collection;

public class StyleChangeEvent {
  private Style myStyle;
  private Set<StyleAttribute> myChangedAttributes;

  public StyleChangeEvent(Style style, Set<StyleAttribute> changedAttributes) {
    myStyle = style;
    myChangedAttributes = changedAttributes;
  }

  public Style getStyle() {
    return myStyle;
  }

  public Set<StyleAttribute> getChangedAttributes() {
    return Collections.unmodifiableSet(myChangedAttributes);
  }
}
