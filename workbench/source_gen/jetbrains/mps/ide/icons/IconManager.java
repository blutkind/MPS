package jetbrains.mps.ide.icons;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;

import java.awt.MediaTracker;
import java.util.Map;
import javax.swing.Icon;
import java.util.HashMap;
import java.awt.Component;
import java.awt.Graphics;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SNodeUtil;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.smodel.SNodeOperations;
import jetbrains.mps.ide.projectPane.Icons;

import java.lang.reflect.Method;

import jetbrains.mps.smodel.SModel;
import com.intellij.ui.LayeredIcon;
import com.intellij.ui.RowIcon;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;

import java.util.List;

import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.util.MacrosFactory;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.project.Solution;
import jetbrains.mps.project.DevKit;
import jetbrains.mps.smodel.MPSModuleOwner;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.vfs.IFile;

import javax.swing.ImageIcon;
import java.io.InputStream;
import java.io.IOException;

import jetbrains.mps.vfs.FileSystem;

public class IconManager {
  public static final Logger LOG = Logger.getLogger(IconManager.class);
  private static final int IMAGE_LOADED = ~((MediaTracker.ABORTED | MediaTracker.ERRORED | MediaTracker.LOADING));
  private static Map<String, Icon> ourPathsToIcons = new HashMap<String, Icon>();
  public static final Icon EMPTY_ICON = new Icon() {
    public void paintIcon(Component c, Graphics g, int x, int y) {
    }

    public int getIconWidth() {
      return 18;
    }

    public int getIconHeight() {
      return 18;
    }
  };

  public IconManager() {
  }

  public static boolean canUseAlternativeIcon(String conceptFqName) {
    SNode acd = SModelUtil.findConceptDeclaration(conceptFqName, GlobalScope.getInstance());
    if (acd == null || !((SNodeUtil.isInstanceOfConceptDeclaration(acd)))) {
      return false;
    }
    return ModelConstraintsManager.isAlternativeIcon(acd);
  }

  public static Icon getIconWithoutAdditionalPart(@NotNull final SNode node) {
    return getIconFor(node, true);
  }

  public static Icon getIconFor(@NotNull final SNode node) {
    return getIconFor(node, false);
  }

  public static Icon getIconFor(@NotNull final SNode node, final boolean withoutAdditional) {
    return ModelAccess.instance().runReadAction(new Computable<Icon>() {
      public Icon compute() {
        Icon mainIcon = null;
        if (SNodeOperations.isUnknown(node)) {
          return Icons.UNKNOWN_ICON;
        }
        SNode concept = jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations.getConceptDeclaration(node);
        if ((concept != null)) {
          Icon alternativeIcon = null;
          try {
            if (ModelConstraintsManager.isAlternativeIcon(concept)) {
              Object iconObject = ModelConstraintsManager.getAlternativeIcon(concept, node);
              if (iconObject != null) {
                String alternativeIconPath = (String) iconObject;
                alternativeIcon = IconManager.getIconForConcept(concept, alternativeIconPath);
              }
            }
          } catch (Throwable t) {
          }
          if (alternativeIcon != null) {
            mainIcon = alternativeIcon;
          } else {
            mainIcon = IconManager.getIconForConcept(concept);
          }
        }
        if (mainIcon == null) {
          if (node.isRoot()) {
            return Icons.DEFAULT_ROOT_ICON;
          } else {
            return Icons.DEFAULT_NODE_ICON;
          }
        }
        SModel model = jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations.getModel(node);
        if (model.isDisposed()) {
          return mainIcon;
        }
        if (model.isNotEditable()) {
          mainIcon = new LayeredIcon(mainIcon, com.intellij.util.Icons.LOCKED_ICON);
        }
        RowIcon result = new RowIcon(2);
        result.setIcon(mainIcon, 0);
        if (!(withoutAdditional)) {
          result.setIcon(BaseConcept_Behavior.call_getAdditionalIcon_5017341185733863694(node), 1);
        }
        List<Icon> markIcons = BaseConcept_Behavior.call_getMarkIcons_3923831204883340393(node);
        if (markIcons != null) {
          LayeredIcon layeredIcon = new LayeredIcon(markIcons.size() + 1);
          layeredIcon.setIcon(result, 0);
          for (int i = 0; i < markIcons.size(); i++) {
            layeredIcon.setIcon(markIcons.get(i), i + 1);
          }
          return layeredIcon;
        }
        return result;
      }
    });
  }

  private static Icon getIconForConcept(SNode conceptDeclaration) {
    while (conceptDeclaration != null) {
      Icon icon = getIconForConcept(conceptDeclaration, SPropertyOperations.getString(conceptDeclaration, "iconPath"));
      if (icon != null) {
        return icon;
      }
      conceptDeclaration = SLinkOperations.getTarget(conceptDeclaration, "extends", false);
    }
    return null;
  }

  private static Icon getIconForConcept(SNode conceptDeclaration, String path) {
    Language language = SModelUtil.getDeclaringLanguage(conceptDeclaration);
    if (language != null) {
      String iconPath = MacrosFactory.languageDescriptor().expandPath(path, language.getDescriptorFile());
      if (iconPath != null) {
        Icon icon = loadIcon(iconPath, true);
        if (icon != null) {
          return icon;
        }
      }
    }
    return null;
  }

  public static Icon getIconForConceptFQName(String conceptFQName) {
    SNode acd = SModelUtil.findConceptDeclaration(conceptFQName, GlobalScope.getInstance());
    SNode cd = null;
    Icon icon = null;
    if (SNodeUtil.isInstanceOfConceptDeclaration(acd)) {
      cd = jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations.cast(acd, "jetbrains.mps.lang.structure.structure.ConceptDeclaration");
      icon = getIconForConcept(cd);
    }
    if (icon == null) {
      if (cd != null && cd.isRoot()) {
        return Icons.DEFAULT_ROOT_ICON;
      } else {
        return Icons.DEFAULT_NODE_ICON;
      }
    }
    return icon;
  }

  public static Icon getIconForNamespace(String namespace) {
    String className = namespace + ".icons.Icons";
    try {
      Language language = MPSModuleRepository.getInstance().getLanguage(namespace);
      if (language == null) {
        LOG.error("Can't find a language " + namespace);
      } else {
        Class icons = language.getClass(className);
        if (icons != null) {
          Method method;
          try {
            method = icons.getMethod("getLanguageIcon");
          } catch (NoSuchMethodException e) {
            return EMPTY_ICON;
          }
          Icon icon = (Icon) method.invoke(null);
          if (icon != null) {
            return icon;
          }
        }
      }
    } catch (Exception e) {
      LOG.error(e);
    }
    return EMPTY_ICON;
  }

  public static Icon getIconFor(SModelDescriptor modelDescriptor) {
    if (modelDescriptor != null) {
      LanguageAspect aspect = Language.getModelAspect(modelDescriptor);
      if (aspect != null) {
        return getIconForAspect(aspect);
      } else if (SModelStereotype.isGeneratorModel(modelDescriptor)) {
        return Icons.TEMPLATES_MODEL_ICON;
      } else if (Language.isLanguageOwnedAccessoryModel(modelDescriptor)) {
        return Icons.ACCESSORY_MODEL_ICON;
      } else if (SModelStereotype.isTestModel(modelDescriptor)) {
        return Icons.TEST_MODEL_ICON;
      }
    }
    return Icons.MODEL_ICON;
  }

  public static Icon getIconFor(IModule module) {
    if (module instanceof Generator) {
      return Icons.GENERATOR_ICON;
    }
    if (module instanceof Language) {
      return Icons.PROJECT_LANGUAGE_ICON;
    }
    if (module instanceof Solution) {
      return Icons.SOLUTION_ICON;
    }
    if (module instanceof DevKit) {
      return Icons.DEVKIT_ICON;
    }
    return Icons.DEFAULT_ICON;
  }

  public static Icon getIconFor(MPSModuleOwner owner) {
    if (owner instanceof MPSProject) {
      return Icons.PROJECT_ICON;
    }
    if (owner instanceof IModule) {
      return getIconFor((IModule) owner);
    }
    return Icons.DEFAULT_ICON;
  }

  public static Icon getIconFor(IFile file) {
    ImageIcon icon = null;
    if (file.exists()) {
      byte[] image = new byte[(int) file.length()];
      InputStream is = null;
      try {
        is = file.openInputStream();
        int current = 0;
        while (true) {
          int result = is.read(image, current, image.length - current);
          if (result == -1 || result == 0) {
            break;
          } else {
            current += result;
          }
        }
      } catch (IOException e) {
        LOG.error(e);
      } finally {
        try {
          if (is != null) {
            is.close();
          }
        } catch (IOException e) {
          LOG.error(e);
        }
      }
      icon = new ImageIcon(image);
      if ((icon.getImageLoadStatus() & IMAGE_LOADED) == 0) {
        icon = null;
      }
    }
    return icon;
  }

  public static Icon loadIcon(String iconPath, boolean cache) {
    Icon icon = ourPathsToIcons.get(iconPath);
    if (icon == null) {
      IFile file = FileSystem.getInstance().getFileByPath(iconPath);
      icon = getIconFor(file);
      if (icon != null && cache) {
        ourPathsToIcons.put(iconPath, icon);
      }
    }
    return icon;
  }

  public static Icon getIconForAspect(LanguageAspect aspect) {
    if (LanguageAspect.ACTIONS.equals(aspect)) {
      return Icons.ACTIONS_MODEL_ICON;
    } else if (LanguageAspect.BEHAVIOR.equals(aspect)) {
      return Icons.BEHAVIOR_MODEL_ICON;
    } else if (LanguageAspect.CONSTRAINTS.equals(aspect)) {
      return Icons.CONSTRAINTS_MODEL_ICON;
    } else if (LanguageAspect.DATA_FLOW.equals(aspect)) {
      return Icons.DATA_FLOW_MODEL_ICON;
    } else if (LanguageAspect.EDITOR.equals(aspect)) {
      return Icons.EDITOR_MODEL_ICON;
    } else if (LanguageAspect.FIND_USAGES.equals(aspect)) {
      return Icons.FIND_USAGES_MODEL_ICON;
    } else if (LanguageAspect.INTENTIONS.equals(aspect)) {
      return Icons.INTENTIONS_MODEL_ICON;
    } else if (LanguageAspect.PLUGIN.equals(aspect)) {
      return Icons.PLUGIN_MODEL_ICON;
    } else if (LanguageAspect.REFACTORINGS.equals(aspect)) {
      return Icons.REFACTORINGS_MODEL_ICON;
    } else if (LanguageAspect.SCRIPTS.equals(aspect)) {
    } else if (LanguageAspect.STRUCTURE.equals(aspect)) {
      return Icons.STRUCTURE_MODEL_ICON;
    } else if (LanguageAspect.STUBS.equals(aspect)) {
      return Icons.STUBS_MODEL_ICON;
    } else if (LanguageAspect.TEST.equals(aspect)) {
      return Icons.TEST_MODEL_ICON;
    } else if (LanguageAspect.TEXT_GEN.equals(aspect)) {
      return Icons.TEXT_GEN_MODEL_ICON;
    } else if (LanguageAspect.TYPESYSTEM.equals(aspect)) {
      return Icons.TYPESYSTEM_MODEL_ICON;
    }
    return Icons.MODEL_ICON;
  }
}
