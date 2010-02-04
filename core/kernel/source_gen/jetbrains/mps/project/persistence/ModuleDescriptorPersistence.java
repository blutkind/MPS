package jetbrains.mps.project.persistence;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.ModuleDescriptor;
import org.jdom.Element;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.xmlQuery.runtime.AttributeUtils;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.project.structure.modules.LanguageDescriptor;
import java.util.List;
import jetbrains.mps.project.structure.modules.Dependency;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.util.Macros;
import jetbrains.mps.project.structure.model.ModelRootManager;
import jetbrains.mps.project.structure.modules.StubModelsEntry;
import org.jdom.Document;
import jetbrains.mps.util.JDOMUtil;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.vfs.VFileSystem;

public class ModuleDescriptorPersistence {
  public static void loadDependencies(ModuleDescriptor descriptor, Element root) {
    ModuleDescriptor result_9364_0 = descriptor;
    result_9364_0.getDependencies().addAll(loadDependenciesList(ListSequence.fromList(AttributeUtils.elementChildren(root, "dependencies")).first()));

    descriptor.getUsedLanguages().addAll(ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(root, "usedLanguages")).first(), "usedLanguage")).select(new ISelector<Element, ModuleReference>() {
      public ModuleReference select(Element ul) {
        return ModuleReference.fromString(ul.getText());
      }
    }).toListSequence());

    // Left for compatibility. Change was between 1.0 and 1.1 
    descriptor.getUsedLanguages().addAll(ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(root, "usedLanguages")).first(), "usedLanguages")).select(new ISelector<Element, ModuleReference>() {
      public ModuleReference select(Element ul) {
        return ModuleReference.fromString(ul.getText());
      }
    }).toListSequence());

    descriptor.getUsedDevkits().addAll(ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(root, "usedDevKits")).first(), "usedDevKit")).select(new ISelector<Element, ModuleReference>() {
      public ModuleReference select(Element udk) {
        return ModuleReference.fromString(udk.getText());
      }
    }).toListSequence());

    if (descriptor instanceof LanguageDescriptor) {
      LanguageDescriptor ld = (LanguageDescriptor) descriptor;
      ld.getRuntimeModules().addAll(loadDependenciesList(ListSequence.fromList(AttributeUtils.elementChildren(root, "runtime")).first()));
    }
  }

  public static void saveDependencies(Element result, ModuleDescriptor descriptor) {
    Element result_9364_1 = result;
    if (!(descriptor.getDependencies().isEmpty())) {
      Element result_9364_2 = new Element("dependencies");
      saveDependencyList(result_9364_2, descriptor.getDependencies());
      result_9364_1.addContent(result_9364_2);
    }

    if (!(descriptor.getUsedLanguages().isEmpty())) {
      Element result_9364_3 = new Element("usedLanguages");
      for (ModuleReference langRef : ListSequence.fromList(descriptor.getUsedLanguages())) {
        Element result_9364_4 = new Element("usedLanguage");
        String result_9364_5 = langRef.toString();
        result_9364_4.setText(result_9364_5);
        result_9364_3.addContent(result_9364_4);
      }
      result_9364_1.addContent(result_9364_3);
    }

    if (!(descriptor.getUsedDevkits().isEmpty())) {
      Element result_9364_6 = new Element("usedDevKits");
      for (ModuleReference dkRef : ListSequence.fromList(descriptor.getUsedDevkits())) {
        Element result_9364_7 = new Element("usedDevKit");
        String result_9364_8 = dkRef.toString();
        result_9364_7.setText(result_9364_8);
        result_9364_6.addContent(result_9364_7);
      }
      result_9364_1.addContent(result_9364_6);
    }

    if (descriptor instanceof LanguageDescriptor) {
      LanguageDescriptor ld = (LanguageDescriptor) descriptor;
      if (!(ld.getRuntimeModules().isEmpty())) {
        Element result_9364_9 = new Element("runtime");
        saveDependencyList(result_9364_9, ld.getRuntimeModules());
        result_9364_1.addContent(result_9364_9);
      }
    }
  }

  private static List<Dependency> loadDependenciesList(Element depElement) {
    return ListSequence.fromList(AttributeUtils.elementChildren(depElement, "dependency")).select(new ISelector<Element, Dependency>() {
      public Dependency select(final Element d) {
        return new _FunctionTypes._return_P0_E0<Dependency>() {
          public Dependency invoke() {
            Dependency result_9364_10 = new Dependency();
            ModuleReference result_9364_11 = ModuleReference.fromString(d.getText());
            result_9364_10.setModuleRef(result_9364_11);
            boolean result_9364_12 = AttributeUtils.booleanWithDefault(d.getAttributeValue("reexport"), true);
            result_9364_10.setReexport(result_9364_12);
            return result_9364_10;
          }
        }.invoke();
      }
    }).toListSequence();
  }

  private static void saveDependencyList(Element depElement, List<Dependency> dependencies) {
    Element result_9364_13 = depElement;
    for (Dependency md : ListSequence.fromList(dependencies)) {
      Element result_9364_14 = new Element("dependency");
      String result_9364_15 = md.getModuleRef().toString();
      result_9364_14.setText(result_9364_15);
      boolean result_9364_16 = md.isReexport();
      result_9364_14.setAttribute("reexport", "" + result_9364_16);
      result_9364_13.addContent(result_9364_14);
    }
  }

  public static List<ModelRoot> loadModelRoots(List<Element> modelRootElements, final IFile file, final Macros macros) {
    return ListSequence.fromList(modelRootElements).select(new ISelector<Element, ModelRoot>() {
      public ModelRoot select(Element mre) {
        return loadModelRoot(mre, file, macros);
      }
    }).toListSequence();
  }

  private static ModelRoot loadModelRoot(final Element modelRootElement, final IFile file, final Macros macros) {
    return new _FunctionTypes._return_P0_E0<ModelRoot>() {
      public ModelRoot invoke() {
        ModelRoot result_9364_17 = new ModelRoot();
        String result_9364_18 = AttributeUtils.stringWithDefault(modelRootElement.getAttributeValue("namespacePrefix"), "");
        result_9364_17.setPrefix(result_9364_18);
        if (modelRootElement.getAttributeValue("persistenceHandler") != null) {
          String result_9364_19 = modelRootElement.getAttributeValue("persistenceHandler");
          result_9364_17.setHandlerClass(result_9364_19);
        }
        String pathName = modelRootElement.getAttributeValue("path");
        if (pathName == null) {
          // left for compatibility 
          pathName = AttributeUtils.stringWithDefault(modelRootElement.getAttributeValue("rootPath"), "");
        }
        String result_9364_20 = macros.expandPath(pathName, file);
        result_9364_17.setPath(result_9364_20);
        if (ListSequence.fromList(AttributeUtils.elementChildren(modelRootElement, "manager")).isNotEmpty()) {
          ModelRootManager result_9364_21 = new ModelRootManager();
          Element manager = ListSequence.fromList(AttributeUtils.elementChildren(modelRootElement, "manager")).first();
          String result_9364_22 = AttributeUtils.stringWithDefault(manager.getAttributeValue("moduleId"), "");
          result_9364_21.setModuleId(result_9364_22);
          String result_9364_23 = AttributeUtils.stringWithDefault(manager.getAttributeValue("className"), "");
          result_9364_21.setClassName(result_9364_23);
          result_9364_17.setManager(result_9364_21);
        }
        return result_9364_17;
      }
    }.invoke();
  }

  public static List<StubModelsEntry> loadStubModelEntries(List<Element> stubModelEntryElements, final IFile file, final Macros macros) {
    return ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(stubModelEntryElements).first(), "stubModelEntry")).select(new ISelector<Element, StubModelsEntry>() {
      public StubModelsEntry select(Element mre) {
        return loadModelEntry(mre, file, macros);
      }
    }).toListSequence();
  }

  private static StubModelsEntry loadModelEntry(final Element modelRootElement, final IFile file, final Macros macros) {
    return new _FunctionTypes._return_P0_E0<StubModelsEntry>() {
      public StubModelsEntry invoke() {
        StubModelsEntry result_9364_24 = new StubModelsEntry();
        String result_9364_25 = macros.expandPath(modelRootElement.getAttributeValue("path"), file);
        result_9364_24.setPath(result_9364_25);
        ModelRootManager result_9364_26 = new ModelRootManager();
        String result_9364_27 = AttributeUtils.stringWithDefault(ListSequence.fromList(AttributeUtils.elementChildren(modelRootElement, "manager")).first().getAttributeValue("moduleId"), "");
        result_9364_26.setModuleId(result_9364_27);
        String result_9364_28 = AttributeUtils.stringWithDefault(ListSequence.fromList(AttributeUtils.elementChildren(modelRootElement, "manager")).first().getAttributeValue("className"), "");
        result_9364_26.setClassName(result_9364_28);
        result_9364_24.setManager(result_9364_26);
        boolean result_9364_29 = AttributeUtils.booleanWithDefault(modelRootElement.getAttributeValue("include"), false);
        result_9364_24.setIncludedInVCS(result_9364_29);
        return result_9364_24;
      }
    }.invoke();
  }

  public static void saveModelRoots(Element modelsElement, List<ModelRoot> modelRoots, IFile file, Macros macros) {
    Element result_9364_30 = modelsElement;
    for (ModelRoot root : ListSequence.fromList(modelRoots)) {
      Element result_9364_31 = new Element("modelRoot");
      String result_9364_32 = macros.shrinkPath((root.getPath() == null ?
        "" :
        root.getPath()
      ), file);
      result_9364_31.setAttribute("path", "" + result_9364_32);
      String result_9364_33 = (root.getPrefix() == null ?
        "" :
        root.getPrefix()
      );
      result_9364_31.setAttribute("namespacePrefix", "" + result_9364_33);
      if (root.getHandlerClass() != null) {
        String result_9364_34 = root.getHandlerClass();
        result_9364_31.setAttribute("persistenceHandler", "" + result_9364_34);
      }
      if (root.getManager() != null) {
        Element result_9364_35 = new Element("manager");
        String result_9364_36 = root.getManager().getModuleId();
        result_9364_35.setAttribute("moduleId", "" + result_9364_36);
        String result_9364_37 = root.getManager().getClassName();
        result_9364_35.setAttribute("className", "" + result_9364_37);
        result_9364_31.addContent(result_9364_35);
      }
      result_9364_30.addContent(result_9364_31);
    }
  }

  public static void saveStubModelEntries(Element modelsElement, List<StubModelsEntry> modelRoots, IFile file, Macros macros) {
    Element result_9364_38 = modelsElement;
    for (StubModelsEntry root : ListSequence.fromList(modelRoots)) {
      Element result_9364_39 = new Element("stubModelEntry");
      String result_9364_40 = macros.shrinkPath((root.getPath() == null ?
        "" :
        root.getPath()
      ), file);
      result_9364_39.setAttribute("path", "" + result_9364_40);
      boolean result_9364_41 = root.isIncludedInVCS();
      result_9364_39.setAttribute("include", "" + result_9364_41);
      Element result_9364_42 = new Element("manager");
      String result_9364_43 = root.getManager().getModuleId();
      result_9364_42.setAttribute("moduleId", "" + result_9364_43);
      String result_9364_44 = root.getManager().getClassName();
      result_9364_42.setAttribute("className", "" + result_9364_44);
      result_9364_39.addContent(result_9364_42);
      result_9364_38.addContent(result_9364_39);
    }
  }

  public static String getLanguageNamespace(IFile file) {
    // This method has no usages, probably it can be removed 
    try {
      Document document = JDOMUtil.loadDocument(file);
      return ((Element) document.getRootElement()).getAttributeValue("namespace");
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static void setTimestamp(final ModuleDescriptor descriptor, final IFile file, final boolean refreshFile) {
    ModelAccess.instance().runCommandInEDT(new Runnable() {
      public void run() {
        descriptor.setTimestamp("" + file.lastModified());
        if (refreshFile) {
          VFileSystem.refreshFileAsynchronously(file);
        }
      }
    });
  }
}
