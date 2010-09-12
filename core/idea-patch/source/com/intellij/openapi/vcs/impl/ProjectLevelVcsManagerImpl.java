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
package com.intellij.openapi.vcs.impl;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.components.StorageScheme;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.EditorFactory;
import com.intellij.openapi.editor.EditorSettings;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.openapi.progress.ProcessCanceledException;
import com.intellij.openapi.project.DumbAwareRunnable;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.project.ProjectManagerAdapter;
import com.intellij.openapi.project.ex.ProjectEx;
import com.intellij.openapi.startup.StartupManager;
import com.intellij.openapi.util.*;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.util.registry.Registry;
import com.intellij.openapi.vcs.*;
import com.intellij.openapi.vcs.VcsShowConfirmationOption.Value;
import com.intellij.openapi.vcs.changes.ChangesUtil;
import com.intellij.openapi.vcs.checkin.CheckinHandlerFactory;
import com.intellij.openapi.vcs.checkout.CompositeCheckoutListener;
import com.intellij.openapi.vcs.ex.ProjectLevelVcsManagerEx;
import com.intellij.openapi.vcs.impl.projectlevelman.*;
import com.intellij.openapi.vcs.update.ActionInfo;
import com.intellij.openapi.vcs.update.UpdateInfoTree;
import com.intellij.openapi.vcs.update.UpdatedFiles;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowAnchor;
import com.intellij.openapi.wm.ToolWindowId;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.ui.content.ContentManager;
import com.intellij.util.ContentsUtil;
import com.intellij.util.EventDispatcher;
import com.intellij.util.Icons;
import com.intellij.util.Processor;
import com.intellij.util.containers.Convertor;
import com.intellij.util.ui.EditorAdapter;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.annotation.Patch;
import org.jdom.Element;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.*;

public class ProjectLevelVcsManagerImpl extends ProjectLevelVcsManagerEx implements ProjectComponent, JDOMExternalizable {
  //Patched by MPS
  @Patch
  private final Set<IBackgroundVcsOperationsListener> myBackgroundOperationListeners = new LinkedHashSet<IBackgroundVcsOperationsListener>();


  @Nullable
  @Patch
  public AbstractVcs getVcsFor(@NotNull VirtualFile file) {
    final String vcsName = myMappings.getVcsFor(file);
    if (vcsName == null || vcsName.length() == 0) {
      // The original code was:
      // return null;
      // I changed it to fix MPS-7221. File can be outside of any mappings,
      // but we still want to add it to VCS correctly
      // MPS Patch begin:
      if (file.getParent() == null) {
        return null;
      } else {
        return findVersioningVcs(file.getParent());
      }
      // MPS Patch end
    }
    return AllVcses.getInstance(myProject).getByName(vcsName);
  }

  @Nullable
  @Patch
  public AbstractVcs getVcsFor(final FilePath file) {
    return ApplicationManager.getApplication().runReadAction(new Computable<AbstractVcs>() {
      @Nullable
      public AbstractVcs compute() {
        if ((!ApplicationManager.getApplication().isUnitTestMode()) && (!myProject.isInitialized())) return null;
        if (myProject.isDisposed()) throw new ProcessCanceledException();
        VirtualFile vFile = ChangesUtil.findValidParent(file);
        if (vFile != null) {
          // the original code was return getVcsFor(vFile);
          // I changed it in order to fix MPS-6333 Exception after integrating change into branch
          // File can be outside of any mappings but we still want to commit it so we have to find vcs anyway
          // MPS Patch begin:
          AbstractVcs vcsFor = getVcsFor(vFile);
          if (vcsFor != null) {
            return vcsFor;
          } else {
            return findVersioningVcs(vFile.getParent());
          }
          // MPS Patch end
        }
        return null;
      }
    });
  }

  @Patch
  public void startBackgroundVcsOperation() {
    myBackgroundOperationCounter++;
    // MPS Patch begins:
    fireBackgroundOperationStarted();
    // MPS Patch ends
  }

  @Patch
  public void stopBackgroundVcsOperation() {
    // in fact, the condition is "should not be called under ApplicationManager.invokeLater() and similiar"
    assert !ApplicationManager.getApplication().isDispatchThread();
    LOG.assertTrue(myBackgroundOperationCounter > 0, "myBackgroundOperationCounter > 0");
    myBackgroundOperationCounter--;
    // MPS Patch begins:
    if (myBackgroundOperationCounter == 0) {
      fireAllBackgroundOperationsStopped();
    }
    // MPS Patch ends
  }

  /*
  Method added by MPS
   */
  @Patch
  public void addBackgroundOperationsListener(IBackgroundVcsOperationsListener listener) {
    myBackgroundOperationListeners.add(listener);
  }

  /*
  Method added by MPS
   */
  @Patch
  public void removeBackgroundOperationsListener(IBackgroundVcsOperationsListener listener) {
    myBackgroundOperationListeners.remove(listener);
  }

  /*
  Method added by MPS
   */
  @Patch
  private void fireBackgroundOperationStarted() {
    for (IBackgroundVcsOperationsListener l : myBackgroundOperationListeners) {
      l.backgroundOperationStarted();
    }
  }

  /*
  Method added by MPS
   */
  @Patch
  private void fireAllBackgroundOperationsStopped() {
    for (IBackgroundVcsOperationsListener l : myBackgroundOperationListeners) {
      l.allBackgroundOperationsStopped();
    }
  }

  //Patched by MPS
  @Patch
  public interface IBackgroundVcsOperationsListener {
    public void backgroundOperationStarted();

    public void allBackgroundOperationsStopped();
  }



  private static final Logger LOG = Logger.getInstance("#com.intellij.openapi.vcs.impl.ProjectLevelVcsManagerImpl");
  
  private final ProjectLevelVcsManagerSerialization mySerialization;
  private final OptionsAndConfirmations myOptionsAndConfirmations;

  private final NewMappings myMappings;
  private final Project myProject;
  private final MappingsToRoots myMappingsToRoots;

  private volatile boolean myIsDisposed = false;
  private final Object myDisposeLock = new Object();

  private ContentManager myContentManager;
  private EditorAdapter myEditorAdapter;

  private final VcsInitialization myInitialization;

  @NonNls
  private static final String ELEMENT_MAPPING = "mapping";
  @NonNls
  private static final String ATTRIBUTE_DIRECTORY = "directory";
  @NonNls
  private static final String ATTRIBUTE_VCS = "vcs";
  @NonNls
  private static final String ATTRIBUTE_DEFAULT_PROJECT = "defaultProject";
  @NonNls
  private static final String ELEMENT_ROOT_SETTINGS = "rootSettings";
  @NonNls
  private static final String ATTRIBUTE_CLASS = "class";

  private final List<CheckinHandlerFactory> myRegisteredBeforeCheckinHandlers = new ArrayList<CheckinHandlerFactory>();
  private final EventDispatcher<VcsListener> myEventDispatcher = EventDispatcher.create(VcsListener.class);
  
  private boolean myMappingsLoaded = false;
  private boolean myHaveLegacyVcsConfiguration = false;
  private boolean myCheckinHandlerFactoriesLoaded = false;
  private final DefaultVcsRootPolicy myDefaultVcsRootPolicy;

  private volatile int myBackgroundOperationCounter = 0;

  private final Map<VcsBackgroundableActions, BackgroundableActionEnabledHandler> myBackgroundableActionHandlerMap;

  private final List<Pair<String, TextAttributes>> myPendingOutput = new ArrayList<Pair<String, TextAttributes>>();

  public ProjectLevelVcsManagerImpl(Project project, final FileStatusManager manager) {
    myProject = project;
    mySerialization = new ProjectLevelVcsManagerSerialization();
    myOptionsAndConfirmations = new OptionsAndConfirmations();

    myDefaultVcsRootPolicy = DefaultVcsRootPolicy.getInstance(project);

    myBackgroundableActionHandlerMap = new HashMap<VcsBackgroundableActions, BackgroundableActionEnabledHandler>();
    myInitialization = new VcsInitialization(myProject);
    myMappings = new NewMappings(myProject, myEventDispatcher, this, manager);
    myMappingsToRoots = new MappingsToRoots(myMappings, myProject);

    ProjectManager.getInstance().addProjectManagerListener(myProject, new ProjectManagerAdapter() {
      @Override
      public void projectClosing(Project project) {
        onProjectClosing();
      }
    });
  }

  public void initComponent() {
    myOptionsAndConfirmations.init(new Convertor<String, Value>() {
      public VcsShowConfirmationOption.Value convert(String o) {
        return mySerialization.getInitOptionValue(o);
      }
    });
  }

  public void registerVcs(AbstractVcs vcs) {
    AllVcses.getInstance(myProject).registerManually(vcs);
  }

  @Nullable
  public AbstractVcs findVcsByName(String name) {
    if (name == null) return null;
    if (myProject.isDisposed()) return null;
    return AllVcses.getInstance(myProject).getByName(name);
  }

  @Nullable
  public VcsDescriptor getDescriptor(final String name) {
    if (name == null) return null;
    if (myProject.isDisposed()) return null;
    return AllVcses.getInstance(myProject).getDescriptor(name);
  }

  public VcsDescriptor[] getAllVcss() {
    return AllVcses.getInstance(myProject).getAll();
  }

  public boolean haveVcses() {
    return ! AllVcses.getInstance(myProject).isEmpty();
  }

  public void disposeComponent() {
    if (ApplicationManager.getApplication().isUnitTestMode()) {
      dispose();
    }
  }

  public void projectOpened() {
    final StartupManager manager = StartupManager.getInstance(myProject);
    manager.registerPostStartupActivity(new DumbAwareRunnable() {
      public void run() {
        ToolWindowManager toolWindowManager = ToolWindowManager.getInstance(myProject);
        if (toolWindowManager != null) { // Can be null in tests
          ToolWindow toolWindow =
            toolWindowManager.registerToolWindow(ToolWindowId.VCS, true, ToolWindowAnchor.BOTTOM, myProject, true);
          myContentManager = toolWindow.getContentManager();
          toolWindow.setIcon(Icons.VCS_SMALL_TAB);
          toolWindow.installWatcher(myContentManager);
        } else {
          myContentManager = ContentFactory.SERVICE.getInstance().createContentManager(true, myProject);
        }
      }
    });
  }

  public void projectClosed() {
    dispose();
  }

  @NotNull
  public String getComponentName() {
    return "ProjectLevelVcsManager";
  }

  public boolean checkAllFilesAreUnder(AbstractVcs abstractVcs, VirtualFile[] files) {
    if (files == null) return false;
    for (VirtualFile file : files) {
      if (getVcsFor(file) != abstractVcs) {
        return false;
      }
    }
    return true;
  }



  @Nullable
  public VirtualFile getVcsRootFor(final VirtualFile file) {
    final VcsDirectoryMapping mapping = myMappings.getMappingFor(file);
    if (mapping == null) {
      return null;
    }
    final String directory = mapping.getDirectory();
    if (directory.length() == 0) {
      return myDefaultVcsRootPolicy.getVcsRootFor(file);
    }
    return LocalFileSystem.getInstance().findFileByPath(directory);
  }

  @Nullable
  public VcsRoot getVcsRootObjectFor(final VirtualFile file) {
    final VcsDirectoryMapping mapping = myMappings.getMappingFor(file);
    if (mapping == null) {
      return null;
    }
    final String directory = mapping.getDirectory();
    final AbstractVcs vcs = findVcsByName(mapping.getVcs());
    if (directory.length() == 0) {
      return new VcsRoot(vcs, myDefaultVcsRootPolicy.getVcsRootFor(file));
    }
    return new VcsRoot(vcs, LocalFileSystem.getInstance().findFileByPath(directory));
  }

  @Nullable
  public VirtualFile getVcsRootFor(final FilePath file) {
    return ApplicationManager.getApplication().runReadAction(new Computable<VirtualFile>() {
      @Nullable
      public VirtualFile compute() {
        VirtualFile vFile = ChangesUtil.findValidParent(file);
        if (vFile != null) {
          return getVcsRootFor(vFile);
        }
        return null;
      }
    });
  }

  @Override
  public VcsRoot getVcsRootObjectFor(final FilePath file) {
    return ApplicationManager.getApplication().runReadAction(new Computable<VcsRoot>() {
      @Nullable
      public VcsRoot compute() {
        VirtualFile vFile = ChangesUtil.findValidParent(file);
        if (vFile != null) {
          return getVcsRootObjectFor(vFile);
        }
        return null;
      }
    });
  }

  private void onProjectClosing() {
    if (myEditorAdapter != null) {
      final Editor editor = myEditorAdapter.getEditor();
      if (! editor.isDisposed()) {
        EditorFactory.getInstance().releaseEditor(editor);
      }
    }
  }

  private void dispose() {
    // todo dispose lock is bad here..
    synchronized (myDisposeLock) {
      if (myIsDisposed) return;

      myMappings.disposeMe();
      try {
        myContentManager = null;

        ToolWindowManager toolWindowManager = ToolWindowManager.getInstance(myProject);
        if (toolWindowManager != null && toolWindowManager.getToolWindow(ToolWindowId.VCS) != null) {
          toolWindowManager.unregisterToolWindow(ToolWindowId.VCS);
        }
      }
      finally {
        myIsDisposed = true;
      }
    }
  }

  public void unregisterVcs(AbstractVcs vcs) {
    if ((! ApplicationManager.getApplication().isUnitTestMode()) && (myMappings.haveActiveVcs(vcs.getName()))) {
      // unlikely
      LOG.warn("Active vcs '" + vcs.getName() + "' is being unregistered. Remove from mappings first.");
    }
    myMappings.beingUnregistered(vcs.getName());
    AllVcses.getInstance(myProject).unregisterManually(vcs);
  }

  public ContentManager getContentManager() {
    return myContentManager;
  }

  public boolean checkVcsIsActive(AbstractVcs vcs) {
    return checkVcsIsActive(vcs.getName());
  }

  public boolean checkVcsIsActive(final String vcsName) {
    return myMappings.haveActiveVcs(vcsName);
  }

  public AbstractVcs[] getAllActiveVcss() {
    return myMappings.getActiveVcses();
  }

  public boolean hasActiveVcss() {
    return myMappings.hasActiveVcss();
  }

  public boolean hasAnyMappings() {
    return ! myMappings.isEmpty();
  }

public void addMessageToConsoleWindow(final String message, final TextAttributes attributes) {
    if (!Registry.is("vcs.showConsole")) return;

    ApplicationManager.getApplication().invokeLater(new Runnable() {
      public void run() {
        // for default and disposed projects the ContentManager is not available.
        if (myProject.isDisposed() || myProject.isDefault()) return;
        final ContentManager contentManager = getContentManager();
        if (contentManager == null) {
          myPendingOutput.add(new Pair<String, TextAttributes>(message, attributes));
        }
        else {
          getOrCreateConsoleContent(contentManager);
          myEditorAdapter.appendString(message, attributes);
        }
      }
    }, ModalityState.defaultModalityState());
  }

  private Content getOrCreateConsoleContent(final ContentManager contentManager) {
    final String displayName = VcsBundle.message("vcs.console.toolwindow.display.name");
    Content content = contentManager.findContent(displayName);
    if (content == null) {
      final EditorFactory editorFactory = EditorFactory.getInstance();
      final Editor editor = editorFactory.createViewer(editorFactory.createDocument(""), myProject);
      EditorSettings editorSettings = editor.getSettings();
      editorSettings.setLineMarkerAreaShown(false);
      editorSettings.setIndentGuidesShown(false);
      editorSettings.setLineNumbersShown(false);
      editorSettings.setFoldingOutlineShown(false);

      myEditorAdapter = new EditorAdapter(editor, myProject);
      final JPanel panel = new JPanel(new BorderLayout());
      panel.add(editor.getComponent(), BorderLayout.CENTER);

      content = ContentFactory.SERVICE.getInstance().createContent(panel, displayName, true);
      contentManager.addContent(content);

      for (Pair<String, TextAttributes> pair : myPendingOutput) {
        myEditorAdapter.appendString(pair.first, pair.second);
      }
      myPendingOutput.clear();
    }
    return content;
  }

  @NotNull
  public VcsShowSettingOption getOptions(VcsConfiguration.StandardOption option) {
    return myOptionsAndConfirmations.getOptions(option);
  }

  public List<VcsShowOptionsSettingImpl> getAllOptions() {
    return myOptionsAndConfirmations.getAllOptions();
  }

  @NotNull
  public VcsShowSettingOption getStandardOption(@NotNull VcsConfiguration.StandardOption option, @NotNull AbstractVcs vcs) {
    final VcsShowOptionsSettingImpl options = (VcsShowOptionsSettingImpl) getOptions(option);
    options.addApplicableVcs(vcs);
    return options;
  }

  @NotNull
  public VcsShowSettingOption getOrCreateCustomOption(@NotNull String vcsActionName, @NotNull AbstractVcs vcs) {
    return myOptionsAndConfirmations.getOrCreateCustomOption(vcsActionName, vcs);
  }

  public void showProjectOperationInfo(final UpdatedFiles updatedFiles, String displayActionName) {
    showUpdateProjectInfo(updatedFiles, displayActionName, ActionInfo.STATUS);
  }

  public UpdateInfoTree showUpdateProjectInfo(UpdatedFiles updatedFiles, String displayActionName, ActionInfo actionInfo) {
    synchronized (myDisposeLock) {
      if (myIsDisposed) return null;
      ContentManager contentManager = getContentManager();
      if (contentManager == null) {
        return null;  // content manager is made null during dispose; flag is set later
      }
      final UpdateInfoTree updateInfoTree = new UpdateInfoTree(contentManager, myProject, updatedFiles, displayActionName, actionInfo);
      Content content = ContentFactory.SERVICE.getInstance().createContent(updateInfoTree, VcsBundle.message(
        "toolwindow.title.update.action.info", displayActionName), true);
      Disposer.register(content, updateInfoTree);
      ContentsUtil.addContent(contentManager, content, true);
      ToolWindowManager.getInstance(myProject).getToolWindow(ToolWindowId.VCS).activate(null);
      updateInfoTree.expandRootChildren();
      return updateInfoTree;
    }
  }

  public void cleanupMappings() {
    myMappings.cleanupMappings();
  }

  public List<VcsDirectoryMapping> getDirectoryMappings() {
    return myMappings.getDirectoryMappings();
  }

  public List<VcsDirectoryMapping> getDirectoryMappings(final AbstractVcs vcs) {
    return myMappings.getDirectoryMappings(vcs.getName());
  }

  @Nullable
  public VcsDirectoryMapping getDirectoryMappingFor(final FilePath path) {
    return ApplicationManager.getApplication().runReadAction(new Computable<VcsDirectoryMapping>() {
      @Nullable
      public VcsDirectoryMapping compute() {
        VirtualFile vFile = ChangesUtil.findValidParent(path);
        if (vFile != null) {
          return myMappings.getMappingFor(vFile);
        }
        return null;
      }
    });
  }

  public boolean hasExplicitMapping(final FilePath f) {
    VirtualFile vFile = ChangesUtil.findValidParent(f);
    if (vFile == null) return false;
    return hasExplicitMapping(vFile);
  }

  public boolean hasExplicitMapping(final VirtualFile vFile) {
    final VcsDirectoryMapping mapping = myMappings.getMappingFor(vFile);
    return mapping != null && (! mapping.isDefaultMapping());
  }

  public void setDirectoryMapping(final String path, final String activeVcsName) {
    if (myMappingsLoaded) return;            // ignore per-module VCS settings if the mapping table was loaded from .ipr
    myHaveLegacyVcsConfiguration = true;
    myMappings.setMapping(FileUtil.toSystemIndependentName(path), activeVcsName);
  }

  public void setAutoDirectoryMapping(String path, String activeVcsName) {
    myMappings.setMapping(path, activeVcsName);
  }

  public void removeDirectoryMapping(VcsDirectoryMapping mapping) {
    myMappings.removeDirectoryMapping(mapping);
  }

  public void setDirectoryMappings(final List<VcsDirectoryMapping> items) {
    myMappings.setDirectoryMappings(items);
  }

  public void iterateVcsRoot(final VirtualFile root, final Processor<FilePath> iterator) {
    VcsRootIterator.iterateVcsRoot(myProject, root, iterator);
  }

  public void readExternal(Element element) throws InvalidDataException {
    mySerialization.readExternalUtil(element, myOptionsAndConfirmations);
  }

  public void writeExternal(Element element) throws WriteExternalException {
    mySerialization.writeExternalUtil(element, myOptionsAndConfirmations);
  }

  @NotNull
  public VcsShowConfirmationOption getStandardConfirmation(@NotNull VcsConfiguration.StandardConfirmation option,
                                                           @NotNull AbstractVcs vcs) {
    final VcsShowConfirmationOptionImpl result = getConfirmation(option);
    result.addApplicableVcs(vcs);
    return result;
  }

  public List<VcsShowConfirmationOptionImpl> getAllConfirmations() {
    return myOptionsAndConfirmations.getAllConfirmations();
  }

  @NotNull
  public VcsShowConfirmationOptionImpl getConfirmation(VcsConfiguration.StandardConfirmation option) {
    return myOptionsAndConfirmations.getConfirmation(option);
  }

  public List<CheckinHandlerFactory> getRegisteredCheckinHandlerFactories() {
    if (!myCheckinHandlerFactoriesLoaded) {
      myCheckinHandlerFactoriesLoaded = true;
      Collections.addAll(myRegisteredBeforeCheckinHandlers, Extensions.getExtensions(CheckinHandlerFactory.EP_NAME, myProject));
    }
    return Collections.unmodifiableList(myRegisteredBeforeCheckinHandlers);
  }

  public void registerCheckinHandlerFactory(CheckinHandlerFactory factory) {
    myRegisteredBeforeCheckinHandlers.add(factory);
  }

  public void unregisterCheckinHandlerFactory(CheckinHandlerFactory handler) {
    myRegisteredBeforeCheckinHandlers.remove(handler);
  }

  public void addVcsListener(VcsListener listener) {
    myEventDispatcher.addListener(listener);
  }

  public void removeVcsListener(VcsListener listener) {
    myEventDispatcher.removeListener(listener);
  }

  public boolean isBackgroundVcsOperationRunning() {
    return myBackgroundOperationCounter > 0;
  }

  public VirtualFile[] getRootsUnderVcs(AbstractVcs vcs) {
    return myMappingsToRoots.getRootsUnderVcs(vcs);
  }

  public VirtualFile[] getAllVersionedRoots() {
    List<VirtualFile> vFiles = new ArrayList<VirtualFile>();
    final AbstractVcs[] vcses = myMappings.getActiveVcses();
    for (AbstractVcs vcs : vcses) {
      Collections.addAll(vFiles, getRootsUnderVcs(vcs));
    }
    return VfsUtil.toVirtualFileArray(vFiles);
  }

  @NotNull
  public VcsRoot[] getAllVcsRoots() {
    List<VcsRoot> vcsRoots = new ArrayList<VcsRoot>();
    final AbstractVcs[] vcses = myMappings.getActiveVcses();
    for (AbstractVcs vcs : vcses) {
      final VirtualFile[] roots = getRootsUnderVcs(vcs);
      for(VirtualFile root: roots) {
        vcsRoots.add(new VcsRoot(vcs, root));
      }
    }
    return vcsRoots.toArray(new VcsRoot[vcsRoots.size()]);
  }

  public void updateActiveVcss() {
    // not needed
  }

  public void notifyDirectoryMappingChanged() {
    myEventDispatcher.getMulticaster().directoryMappingChanged();
  }


  public void writeDirectoryMappings(final Element element) {
    if (myProject.isDefault()) {
      element.setAttribute(ATTRIBUTE_DEFAULT_PROJECT, Boolean.TRUE.toString());
    }
    for(VcsDirectoryMapping mapping: getDirectoryMappings()) {
      Element child = new Element(ELEMENT_MAPPING);
      child.setAttribute(ATTRIBUTE_DIRECTORY, mapping.getDirectory());
      child.setAttribute(ATTRIBUTE_VCS, mapping.getVcs());
      final VcsRootSettings rootSettings = mapping.getRootSettings();
      if (rootSettings != null) {
        Element rootSettingsElement = new Element(ELEMENT_ROOT_SETTINGS);
        rootSettingsElement.setAttribute(ATTRIBUTE_CLASS, rootSettings.getClass().getName());
        try {
          rootSettings.writeExternal(rootSettingsElement);
          child.addContent(rootSettingsElement);
        }
        catch (WriteExternalException e) {
          // don't add element
        }
      }
      element.addContent(child);
    }
  }

  public boolean needAutodetectMappings() {
    return !myHaveLegacyVcsConfiguration && !myMappingsLoaded;
  }

  /**
   * Used to guess VCS for automatic mapping through a look into a working copy
   */
  @Nullable
  public AbstractVcs findVersioningVcs(VirtualFile file) {
    final VcsDescriptor[] vcsDescriptors = getAllVcss();
    VcsDescriptor probableVcs = null;
    for (VcsDescriptor vcsDescriptor : vcsDescriptors) {
      if (vcsDescriptor.probablyUnderVcs(file)) {
        if (probableVcs != null) {
          return null;
        }
        probableVcs = vcsDescriptor;
      }
    }
    return probableVcs == null ? null : findVcsByName(probableVcs.getName());
  }

  public CheckoutProvider.Listener getCompositeCheckoutListener() {
    return new CompositeCheckoutListener(myProject);
  }

  public void fireDirectoryMappingsChanged() {
    if (! myIsDisposed) {
      myMappings.mappingsChanged();
    }
  }

  public String haveDefaultMapping() {
    return myMappings.haveDefaultMapping();
  }

  public BackgroundableActionEnabledHandler getBackgroundableActionHandler(final VcsBackgroundableActions action) {
    ApplicationManager.getApplication().assertIsDispatchThread();

    BackgroundableActionEnabledHandler result = myBackgroundableActionHandlerMap.get(action);
    if (result == null) {
      result = new BackgroundableActionEnabledHandler();
      myBackgroundableActionHandlerMap.put(action, result);
    }
    return result;
  }

  public void addInitializationRequest(final VcsInitObject vcsInitObject, final Runnable runnable) {
    ApplicationManager.getApplication().runReadAction(new Runnable() {
      public void run() {
        myInitialization.add(vcsInitObject, runnable);
      }
    });
  }

  public boolean isFileInContent(final VirtualFile vf) {
    final ExcludedFileIndex excludedIndex = ExcludedFileIndex.getInstance(myProject);
    return (vf != null) && (excludedIndex.isInContent(vf) || isFileInBaseDir(vf) || vf.equals(myProject.getBaseDir()) ||
                            hasExplicitMapping(vf) || isInDirectoryBasedRoot(vf)) && (! excludedIndex.isExcludedFile(vf));
  }

  private boolean isInDirectoryBasedRoot(final VirtualFile file) {
    if (file == null) return false;
    final StorageScheme storageScheme = ((ProjectEx) myProject).getStateStore().getStorageScheme();
    if (StorageScheme.DIRECTORY_BASED.equals(storageScheme)) {
      final VirtualFile baseDir = myProject.getBaseDir();
      if (baseDir == null) return false;
      final VirtualFile ideaDir = baseDir.findChild(Project.DIRECTORY_STORE_FOLDER);
      return (ideaDir != null && ideaDir.isValid() && ideaDir.isDirectory() && VfsUtil.isAncestor(ideaDir, file, false));
    }
    return false;
  }

  private boolean isFileInBaseDir(final VirtualFile file) {
    VirtualFile parent = file.getParent();
    return !file.isDirectory() && parent != null && parent.equals(myProject.getBaseDir());
  }

  // inner roots disclosed
  public static List<VirtualFile> getRootsUnder(final List<VirtualFile> roots, final VirtualFile underWhat) {
    final List<VirtualFile> result = new ArrayList<VirtualFile>(roots.size());
    for (VirtualFile root : roots) {
      if (VfsUtil.isAncestor(underWhat, root, false)) {
        result.add(root);
      }
    }
    return result;
  }
}
