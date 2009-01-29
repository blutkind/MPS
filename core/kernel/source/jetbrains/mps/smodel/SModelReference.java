/*
 * Copyright 2003-2008 JetBrains s.r.o.
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
package jetbrains.mps.smodel;

import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.util.EqualUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jetbrains.annotations.Nullable;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 21.07.2005
 * Time: 14:07:53
 * To change this template use File | Settings | File Templates.
 */
public class SModelReference {
  private static final Pattern MODEL_UID_PATTERN = Pattern.compile("(.*?)\\((.*?)\\)");

  public static SModelReference fromString(String s) {
    if (s == null) return null;
    Matcher matcher = MODEL_UID_PATTERN.matcher(s);
    if (matcher.matches()) {
      return new SModelReference(SModelFqName.fromString(matcher.group(2)), SModelId.fromString(matcher.group(1)));
    }

    return new SModelReference(SModelFqName.fromString(s), null);
  }

  private SModelId myModelId;
  private SModelFqName myModelFqName;

  public SModelReference(String longName, String stereotype) {
    this(new SModelFqName(longName, stereotype), null);
  }

  public SModelReference(SModelFqName fqName, SModelId modelId) {
    myModelFqName = fqName;
    myModelId = modelId;
  }

  public SModelId getSModelId() {
    return myModelId;
  }

  public SModelFqName getSModelFqName() {
    return myModelFqName;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof SModelReference)) return false;
    SModelReference otherReference = (SModelReference) o;

    if (otherReference.myModelId != null && myModelId != null) {
      return otherReference.myModelId.equals(myModelId);
    }

    if (otherReference.myModelId == null && myModelId != null) {
      return false;
    }

    if (otherReference.myModelId != null && myModelId == null) {
      return false;
    }

    return otherReference.myModelFqName.equals(myModelFqName);
  }

  public int hashCode() {
    if (myModelId != null) {
      return myModelId.hashCode();
    }
    return myModelFqName.hashCode();
  }

  public String toString() {
    if (myModelId != null) {
      return myModelId + "(" + myModelFqName + ")";
    }
    return myModelFqName.toString();
  }

  public String getLongName() {
    return myModelFqName.getLongName();
  }

  public String getCompactPresentation() {
    return myModelFqName.getCompactPresentation();
  }

  public String getNamespace() {
    return myModelFqName.getNamespace();
  }

  public String getShortName() {
    return myModelFqName.getShortName();
  }

  public String getStereotype() {
    return myModelFqName.getStereotype();
  }

  public boolean hasStereotype() {
    return myModelFqName.hasStereotype();
  }

  public boolean update() {
    SModelDescriptor sm;
    if (myModelId != null) {
      sm = GlobalScope.getInstance().getModelDescriptor(myModelId);
    } else {
      sm = GlobalScope.getInstance().getModelDescriptor(myModelFqName);
    }
    if (sm == null) return false;
    SModelReference newRef = sm.getSModelReference();

    myModelFqName = newRef.myModelFqName;
    myModelId = newRef.myModelId;

    return differs(newRef);
  }

  protected boolean differs(SModelReference ref) {
    return !(EqualUtil.equals(myModelId, ref.myModelId) && EqualUtil.equals(myModelFqName, ref.myModelFqName));
  }

  public SModelReference getCopy() {
    SModelFqName modelFqName = myModelFqName==null?null:myModelFqName.getCopy();
    SModelId modelId = myModelId==null?null:myModelId.getCopy();
    return new SModelReference(modelFqName, modelId);
  }
}
