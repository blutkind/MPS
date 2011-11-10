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

import com.intellij.facet.FacetConfiguration;
import com.intellij.facet.ui.FacetEditorContext;
import com.intellij.facet.ui.FacetEditorTab;
import com.intellij.facet.ui.FacetValidatorsManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.WriteExternalException;
import com.intellij.util.xmlb.XmlSerializerUtil;
import jetbrains.mps.idea.core.icons.MPSIcons;
import org.jdom.Element;
import org.jetbrains.annotations.Nls;

import javax.swing.*;

/**
 * evgeny, 10/26/11
 */
public class MPSFacetConfiguration implements FacetConfiguration, PersistentStateComponent<MPSConfigurationBean> {

    private MPSConfigurationBean configurationBean = new MPSConfigurationBean();
    private MPSFacet myMpsFacet;

    public void readExternal(Element element) throws InvalidDataException {
        // ignore
    }

    public void writeExternal(Element element) throws WriteExternalException {
        // ignore
    }

    public MPSConfigurationBean getState() {
        return configurationBean;
    }

    public void loadState(MPSConfigurationBean state) {
        XmlSerializerUtil.copyBean(state, configurationBean);
    }

    public FacetEditorTab[] createEditorTabs(FacetEditorContext facetEditorContext, FacetValidatorsManager facetValidatorsManager) {
        return new FacetEditorTab[]{new MPSFacetCommonTab()};
    }

    public void setFacet(MPSFacet mpsFacet) {
        myMpsFacet = mpsFacet;
    }

    public MPSFacet getFacet() {
        return myMpsFacet;
    }

    public class MPSFacetCommonTab extends FacetEditorTab {

        private MPSFacetCommonTabUI form;

        @Override
        public Icon getIcon() {
            return MPSIcons.MPS_ICON;
        }

        @Nls
        public String getDisplayName() {
            return "Common";
        }

        public JComponent createComponent() {
            if (form == null) {
                form = new MPSFacetCommonTabUI(MPSFacetConfiguration.this);
            }
            return form.getRootPanel();
        }

        public boolean isModified() {
            return form != null && form.isModified(configurationBean);
        }

        @Override
        public void apply() throws ConfigurationException {
            if (form != null) {
                form.getData(configurationBean);
            }
        }

        public void reset() {
            if (form != null) {
                form.setData(configurationBean);
            }
        }

        public void disposeUIResources() {
            form = null;
        }
    }

}
