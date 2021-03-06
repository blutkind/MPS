package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SModelDescriptor;
import com.intellij.openapi.project.Project;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.project.Solution;
import java.util.List;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.Condition;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.project.SModelRoot;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class ModelStep extends TwoOptionsStep<SModelDescriptor> {
  public ModelStep(Project project, AbstractBuildGenerator buildGenerator, IErrorHandler handler) {
    super(project, buildGenerator, handler);
  }

  protected void setChecked(boolean checked) {
    this.myGenerator.setCreateModel(checked);
  }

  protected boolean getChecked() {
    return this.myGenerator.getCreateModel();
  }

  protected String getComboBoxName() {
    return "Use existing model:";
  }

  protected String getVariantName(final SModelDescriptor model) {
    return NameUtil.shortNameFromLongName(model.getLongName());
  }

  protected String getTextFieldText() {
    return this.myGenerator.getNewModelName();
  }

  protected void setTextFieldText(String text) {
    this.myGenerator.setNewModelName(text);
  }

  protected String getCheckBoxName() {
    return "Create new model";
  }

  protected void setVariant(SModelDescriptor m) {
    this.myGenerator.setModel(m);
  }

  protected String getTextFieldName() {
    return "New model name:";
  }

  protected SModelDescriptor[] getVariants() {
    final Solution solution = this.myGenerator.getSolution();
    if (solution == null) {
      return new SModelDescriptor[0];
    } else {
      final List<SModelDescriptor> modelDescriptors = SModelRepository.getInstance().getModelDescriptors(solution);
      List<SModelDescriptor> filteredDescriptors = ModelAccess.instance().runReadAction(new Computable<List<SModelDescriptor>>() {
        public List<SModelDescriptor> compute() {
          return CollectionUtil.filter(modelDescriptors, new Condition<SModelDescriptor>() {
            public boolean met(SModelDescriptor modelDescriptor) {
              if (!(modelDescriptor instanceof EditableSModelDescriptor)) {
                return false;
              }
              IFile modelFile = ((EditableSModelDescriptor) modelDescriptor).getModelFile();
              if (modelFile == null) {
                return false;
              }
              for (SModelRoot root : ListSequence.fromList(solution.getSModelRoots())) {
                if (modelFile.getPath().startsWith(root.getPath())) {
                  return true;
                }
              }
              return false;
            }
          });
        }
      });
      return ListSequence.fromList(filteredDescriptors).toGenericArray(SModelDescriptor.class);
    }
  }

  public String getDescription() {
    return "Build would be located in new model.";
  }

  protected boolean isCheckBoxEnabled() {
    return !(this.myGenerator.getCreateSolution());
  }

  protected boolean isValid(String text) {
    return this.myGenerator.isValidModelName(text);
  }

  protected String getWarningText(String text) {
    if (text.equals("")) {
      return "Empty model name not allowed.";
    }
    return "Model " + text + " already exists, choose another name.";
  }
}
