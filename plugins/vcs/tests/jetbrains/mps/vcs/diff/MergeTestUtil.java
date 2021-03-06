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
package jetbrains.mps.vcs.diff;

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import jetbrains.mps.smodel.persistence.def.ModelReadException;
import jetbrains.mps.vcs.MergeBackupUtil;
import jetbrains.mps.vcs.ModelVersion;
import jetbrains.mps.vfs.FileSystem;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;

public class MergeTestUtil {

  public static SModel[] loadTestModels(File zipfile) throws IOException {
    try {
      return MergeBackupUtil.loadZippedModels(zipfile, TestVersion.values());
    } catch (ModelReadException e) {
      Assert.fail("Couldn't read model " + e.getMessage());
      e.printStackTrace();
      return null;
    }
  }

  public static void saveTestModel(final SModel model, final File file) {
    ModelPersistence.saveModel(model, FileSystem.getInstance().getFileByPath(file.getAbsolutePath()), model.getPersistenceVersion());
  }

  public static enum TestVersion implements ModelVersion {
    MINE("mine"),
    BASE("base"),
    REPO("repository"),
    EXPECTED("exp");

    private final String mySuffix;

    TestVersion(String suffix) {
      mySuffix = suffix;
    }

    public String getSuffix() {
      return mySuffix;
    }
  }
}
