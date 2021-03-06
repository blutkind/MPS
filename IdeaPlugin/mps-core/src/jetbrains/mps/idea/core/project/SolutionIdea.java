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

package jetbrains.mps.idea.core.project;

import com.intellij.ProjectTopics;
import com.intellij.facet.Facet;
import com.intellij.facet.FacetManager;
import com.intellij.facet.FacetManagerAdapter;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.roots.ModuleRootEvent;
import com.intellij.openapi.roots.ModuleRootListener;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.util.messages.MessageBusConnection;
import jetbrains.mps.idea.core.facet.MPSFacet;
import jetbrains.mps.idea.core.facet.MPSFacetType;
import jetbrains.mps.project.Solution;
import jetbrains.mps.project.structure.modules.Dependency;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: shatalin
 * Date: 11/18/11
 * Time: 1:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class SolutionIdea extends Solution {

    @NotNull
    private Module myModule;
    private List<Dependency> myDependencies;
    private MessageBusConnection myConnection;

    public SolutionIdea(@NotNull Module module, SolutionDescriptor descriptor) {
        myModule = module;
        // TODO: simply set solution descriptor local variable?
        setSolutionDescriptor(descriptor, false);
        myConnection = myModule.getProject().getMessageBus().connect();
        myConnection.subscribe(ProjectTopics.PROJECT_ROOTS, new ModuleRootListener() {
            @Override
            public void beforeRootsChange(ModuleRootEvent event) {
            }

            @Override
            public void rootsChanged(ModuleRootEvent event) {
                if (myModule.getProject().equals(event.getSource())) {
                    ModelAccess.instance().runWriteInEDT(new Runnable() {
                        @Override
                        public void run() {
                            setModuleDescriptor(getModuleDescriptor(), false);
                        }
                    });
                }
            }
        });
        myConnection.subscribe(FacetManager.FACETS_TOPIC, new FacetManagerAdapter() {
            @Override
            public void facetAdded(@NotNull Facet facet) {
                handleFacetChanged(facet);
            }

            @Override
            public void facetRemoved(@NotNull Facet facet) {
                handleFacetChanged(facet);
            }
        });
    }

    @Override
    public void setSolutionDescriptor(SolutionDescriptor newDescriptor, boolean reloadClasses) {
        newDescriptor.setNamespace(myModule.getName());
        super.setSolutionDescriptor(newDescriptor, reloadClasses);
    }

    @Override
    public boolean needReloading() {
        return false;
    }

    @Override
    public void dispose() {
        super.dispose();
        myConnection.disconnect();
    }

    @Override
    protected SolutionDescriptor loadDescriptor() {
        return getModuleDescriptor();
    }

    @Override
    public List<Dependency> getDependencies() {
        if (myDependencies == null) {
            // TODO: move to Solution descriptor & try to use common Solution implementation here?
            myDependencies = new ArrayList<Dependency>();
            Module[] usedModules = ModuleRootManager.getInstance(myModule).getDependencies();
            for (Module usedModule : usedModules) {
                MPSFacet usedModuleMPSFacet = FacetManager.getInstance(usedModule).getFacetByType(MPSFacetType.ID);
                if (usedModuleMPSFacet != null && usedModuleMPSFacet.wasInitialized()) {
                    Dependency dep = new Dependency();
                    dep.setModuleRef(usedModuleMPSFacet.getSolution().getModuleReference());
                    dep.setReexport(false);
                    myDependencies.add(dep);
                }
            }
        }
        return myDependencies;
    }

    @Override
    public void addDependency(@NotNull ModuleReference moduleRef, boolean reexport) {
        throw new UnsupportedOperationException("addDependency method is not supported by SolutionIdea implementation");
    }

    @Override
    protected void invalidateDependencies() {
        super.invalidateDependencies();
        myDependencies = null;
    }

    @Override
    public void save() {
        // TODO: implement saving functionality here.
//        super.save();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public IFile getDescriptorFile() {
        return FileSystem.getInstance().getFileByPath(myModule.getModuleFilePath());
    }

    private void handleFacetChanged(Facet facet) {
        if (skipFacetNotification(facet)) {
            return;
        }
        ModelAccess.instance().runWriteInEDT(new Runnable() {
            @Override
            public void run() {
                setModuleDescriptor(getModuleDescriptor(), false);
            }
        });
    }

    private boolean skipFacetNotification(Facet facet) {
        if (!myModule.getProject().equals(facet.getModule().getProject())) {
            return true;
        }
        Module[] dependencies = ModuleRootManager.getInstance(myModule).getDependencies();
        Module facetModule = facet.getModule();
        for (Module dependency : dependencies) {
            if (dependency.equals(facetModule)) {
                return false;
            }
        }
        return true;
    }
}
