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
package jetbrains.mps.build;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.application.ApplicationInfo;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;
import com.intellij.openapi.util.BuildNumber;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task.Modal;
import com.intellij.openapi.ui.Messages;
import com.intellij.util.io.ZipUtil;
import com.intellij.util.messages.MessageBusConnection;
import com.intellij.util.messages.MessageBus;
import com.intellij.ide.AppLifecycleListener;
import com.intellij.ide.AppLifecycleListener.Adapter;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.ide.IdeMain.TestMode;
import jetbrains.mps.samples.SamplesInfo;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.build.SamplesExtractor.MyState;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.library.LibraryManager;
import jetbrains.mps.reloading.ClassLoaderManager;

import java.io.File;
import java.io.IOException;

@State(
  name = "LastBuildNumber",
  storages = {
    @Storage(
      id = "other",
      file = "$APP_CONFIG$/other.xml"
    )}
)
public class SamplesExtractor implements ApplicationComponent, PersistentStateComponent<MyState>, SamplesInfo {
  private static final Logger LOG = Logger.getLogger(SamplesExtractor.class);

  private static final String SAMPLES_IN_MPS_HOME_DIR = "samples";
  public static final String SAMPLES_IN_MPS_HOME_ZIP = "samples.zip";
  public static final String SAMPLES_IN_USER_HOME_DIR = "MPSSamples";
  private static final String MPS = "MPS";

  public static SamplesExtractor getInstance() {
    return ((SamplesExtractor) ApplicationManager.getApplication().getComponent(SamplesInfo.class));
  }

  private MyState myState;
  private final ApplicationInfo myApplicationInfo;
  private boolean myIsSamplesInMPSHome;

  public SamplesExtractor(ApplicationInfo applicationInfo) {
    myApplicationInfo = applicationInfo;
  }

  @NotNull
  public String getComponentName() {
    return "Samples Extractor";
  }

  public void initComponent() {
    if (myState == null) {
      myState = new MyState();
    }
    updateSamplesLocation();

    if (IdeMain.getTestMode() == TestMode.CORE_TEST) return;

    checkSamplesAndUpdateIfNeeded();
  }

  private void checkSamplesAndUpdateIfNeeded() {
    int currentBuildNumber = currentBuildNumberString();
    if (myState.myLastBuildNumber < currentBuildNumber) {

      if (!myIsSamplesInMPSHome) {
        extractSamples();
      }
    }
  }

  private int currentBuildNumberString() {
    BuildNumber buildNumber = myApplicationInfo.getBuild();
    String currentBuildNumberString = buildNumber.asString();
    if (currentBuildNumberString.matches(".*[^\\d\\.].*")) {
      // In "normal" build number only dots and digits allowed.
      // If build number looks like "11.snapshot", we consider it developers build and do not to extract samples.
      return MyState.DEFAULT;
    }
    return buildNumber.getBuildNumber();
  }

  private void updateSamplesLocation() {
    File samplesDirectory = new File(getSamplesPathInMPSHome());
    myIsSamplesInMPSHome = samplesDirectory.exists() && samplesDirectory.isDirectory();
  }

  public void disposeComponent() {
  }

  public MyState getState() {
    return myState;
  }

  public void loadState(MyState state) {
    myState = state;
  }

  public String getSamplesPath() {
    if (myIsSamplesInMPSHome) {
      return getSamplesPathInMPSHome();
    }
    return getSamplesPathInUserHome();
  }

  private String getSamplesPathInUserHome() {
    return PathManager.getUserHome() + File.separator + SAMPLES_IN_USER_HOME_DIR + "." + getSuffix();
  }

  private String getSuffix() {
    String versionName = myApplicationInfo.getVersionName();
    int i = versionName.indexOf(MPS);
    assert i >= 0;
    return versionName.substring(i + MPS.length()).replaceAll("\\s+", "");
  }

  private String getSamplesPathInMPSHome() {
    return PathManager.getHomePath() + File.separator + SAMPLES_IN_MPS_HOME_DIR;
  }

  public void extractSamples() {
    File samplesZipFile = new File(PathManager.getHomePath() + File.separator + SAMPLES_IN_MPS_HOME_ZIP);
    if (samplesZipFile.exists()) {
      File samplesDir = new File(getSamplesPathInUserHome());

      if (samplesDir.exists()) {
        int answer = Messages.showOkCancelDialog("Do you want to replace directory\n" + samplesDir + "\n with version " + currentBuildNumberString() + " (old directory contents will be deleted)?", "Replace MPS Samples?", Messages.getQuestionIcon());
        if (answer == 0) {
          FileUtil.delete(samplesDir);
          actuallyExtractSamples(samplesZipFile);
        }
      } else {
        actuallyExtractSamples(samplesZipFile);
      }
    }

    myState.myLastBuildNumber = currentBuildNumberString();
  }

  private void actuallyExtractSamples(File samplesZipFile) {
    try {
      File tmpDir = FileUtil.createTempDirectory("MPSSamples", "");
      ZipUtil.extract(samplesZipFile, tmpDir, null);
      FileUtil.moveDirWithContent(new File(tmpDir + File.separator + SAMPLES_IN_USER_HOME_DIR), new File(getSamplesPathInUserHome()));
      FileUtil.delete(tmpDir);
    } catch (IOException e) {
      LOG.error(e);
    }
  }

  public static class MyState {
    public int myLastBuildNumber = DEFAULT;
    private static final int DEFAULT = -1;
  }
}
