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

package jetbrains.mps.idea.core.facet;

import com.intellij.facet.Facet;
import com.intellij.facet.FacetType;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.startup.StartupManager;
import jetbrains.mps.ide.messages.MessagesViewTool;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.idea.core.MPSBundle;
import jetbrains.mps.idea.core.project.SolutionIdea;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.project.Project;
import jetbrains.mps.project.Solution;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import org.jetbrains.annotations.NotNull;

/**
 * evgeny, 10/26/11
 */
public class MPSFacet extends Facet<MPSFacetConfiguration> {
    private Solution mySolution;

    public MPSFacet(@NotNull FacetType facetType, @NotNull Module module, @NotNull String name, @NotNull MPSFacetConfiguration configuration, Facet underlyingFacet) {
        super(facetType, module, name, configuration, underlyingFacet);
        configuration.setFacet(this);
    }

    @Override
    public void initFacet() {
        StartupManager.getInstance(getModule().getProject()).runWhenProjectIsInitialized(new Runnable() {
            @Override
            public void run() {
                ModelAccess.instance().runWriteAction(new Runnable() {
                    @Override
                    public void run() {
                        SolutionDescriptor solutionDescriptor = getConfiguration().getState().getSolutionDescriptor();
                        Solution solution = new SolutionIdea(getModule(), solutionDescriptor);
                        com.intellij.openapi.project.Project project = getModule().getProject();
                        Project mpsProject = ProjectHelper.toMPSProject(project);

                        MPSModuleRepository repository = MPSModuleRepository.getInstance();
                        if (repository.existsModule(solutionDescriptor.getModuleReference())) {
                            MessagesViewTool.log(project, MessageKind.ERROR, MPSBundle.message("facet.cannot.load.second.module", solutionDescriptor.getNamespace()));
                            return;
                        }

                        repository.addModule(mySolution = solution, mpsProject);
                        MessagesViewTool.log(project, MessageKind.INFORMATION, MPSBundle.message("facet.module.loaded", MPSFacet.this.mySolution.getModuleFqName()));
                    }
                });

            }
        });
    }

    @Override
    public void disposeFacet() {
        ModelAccess.instance().runWriteAction(new Runnable() {
            @Override
            public void run() {
                MessagesViewTool.log(getModule().getProject(), MessageKind.INFORMATION, MPSBundle.message("facet.module.unloaded", mySolution.getModuleFqName()));
                MPSModuleRepository.getInstance().removeModule(mySolution);
                mySolution = null;
            }
        });
    }

    public boolean wasInitialized() {
        return mySolution != null;
    }

    public void setConfiguration(final MPSConfigurationBean configurationBean) {
        if (wasInitialized()) {
            ModelAccess.instance().runWriteInEDT(new Runnable() {
                @Override
                public void run() {
                    mySolution.setSolutionDescriptor(configurationBean.getSolutionDescriptor(), false);
                }
            });
        }
    }

    public Solution getSolution() {
        return mySolution;
    }
}
