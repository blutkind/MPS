package jetbrains.mps.smodel.persistence.def.v2;

import jetbrains.mps.smodel.persistence.def.*;
import jetbrains.mps.smodel.persistence.def.v1.ReferencePersister1;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.SModel.ImportElement;
import jetbrains.mps.refactoring.framework.RefactoringHistory;
import jetbrains.mps.project.ModuleReference;

import java.util.*;

import org.jdom.Document;
import org.jdom.Element;

/**
 * Created by IntelliJ IDEA.
 * User: User
 * Date: 10.09.2008
 * Time: 15:51:17
 * To change this template use File | Settings | File Templates.
 */
public class ModelWriter2 implements IModelWriter {
  protected IReferencePersister getReferencePersister() {
    return new ReferencePersister1();
  }

  protected int getModelPersistenceVersion() {
    return 2;
  }

  public Document saveModel(SModel sourceModel, boolean validate) {
    Element rootElement = new Element(ModelPersistence.MODEL);
    rootElement.setAttribute(ModelPersistence.NAME, sourceModel.getLongName());
    Element persistenceElement = new Element(ModelPersistence.PERSISTENCE);
    persistenceElement.setAttribute(ModelPersistence.PERSISTENCE_VERSION, getModelPersistenceVersion()+"");
    rootElement.addContent(persistenceElement);

    if (validate) {
      sourceModel.validateLanguagesAndImports();
    }

    RefactoringHistory history = sourceModel.getRefactoringHistory();
    rootElement.addContent(history.toElement());

    // languages
    Set<String> writtenAspects = new HashSet<String>();
    for (ModuleReference languageNamespace : sourceModel.getExplicitlyImportedLanguages()) {
      Element languageElem = new Element(ModelPersistence.LANGUAGE);
      languageElem.setAttribute(ModelPersistence.NAMESPACE, languageNamespace.toString());
      rootElement.addContent(languageElem);
    }
    for (ImportElement aspectElement : sourceModel.getLanguageAspectModelElements()) {
      SModelReference modelReference = aspectElement.getModelReference();
      if (!writtenAspects.contains(modelReference.toString())) {
        writtenAspects.add(modelReference.toString());
        writeAspect(sourceModel, rootElement, modelReference);
      }
    }

    // languages engaged on generation
    for (ModuleReference languageNamespace : sourceModel.getEngagedOnGenerationLanguages()) {
      Element languageElem = new Element(ModelPersistence.LANGUAGE_ENGAGED_ON_GENERATION);
      languageElem.setAttribute(ModelPersistence.NAMESPACE, languageNamespace.toString());
      rootElement.addContent(languageElem);
    }

    //devkits
    for (ModuleReference devkitNamespace : sourceModel.getDevKitRefs()) {
      Element devkitElem = new Element(ModelPersistence.DEVKIT);
      devkitElem.setAttribute(ModelPersistence.NAMESPACE, devkitNamespace.toString());
      rootElement.addContent(devkitElem);
    }

    // imports
    Element maxRefID = new Element(ModelPersistence.MAX_IMPORT_INDEX);
    maxRefID.setAttribute(ModelPersistence.VALUE, "" + sourceModel.getMaxImportIndex());
    rootElement.addContent(maxRefID);

    Iterator<ImportElement> imports = sourceModel.importElements();
    while (imports.hasNext()) {
      ImportElement importElement = imports.next();
      Element importElem = new Element(ModelPersistence.IMPORT_ELEMENT);
      importElem.setAttribute(ModelPersistence.MODEL_IMPORT_INDEX, "" + importElement.getReferenceID());
      SModelReference modelReference = importElement.getModelReference();
      importElem.setAttribute(ModelPersistence.MODEL_UID, modelReference.toString());
      importElem.setAttribute(ModelPersistence.VERSION, "" + importElement.getUsedVersion());

      int version = -1;
      SModelDescriptor importedModelDescriptor = SModelRepository.getInstance().getModelDescriptor(modelReference);
      if (importedModelDescriptor != null) {
        version = importedModelDescriptor.getVersion();
      }
      if (version > -1) {
        importElem.setAttribute(ModelPersistence.VERSION, version + "");
      }
      rootElement.addContent(importElem);
    }

    VisibleModelElements visibleModelElements = new VisibleModelElements(rootElement);
    SNode log = sourceModel.getLog();
    if (log != null) {
      saveNode(rootElement, ModelPersistence.REFACTORING_LOG, log, false, visibleModelElements);
    }

    Iterator<SNode> iterator = sourceModel.roots();
    while (iterator.hasNext()) {
      SNode semanticNode = iterator.next();
      saveNode(rootElement, semanticNode, visibleModelElements);
    }

    Document document = new Document();
    document.setRootElement(rootElement);
    return document;
  }

  private void writeAspect(SModel sourceModel, Element parent, SModelReference aspectReference) {
    int modelVersion = sourceModel.getLanguageAspectModelVersion(aspectReference);
    if (modelVersion > -1) {
      Element aspectModelElement = new Element(ModelPersistence.LANGUAGE_ASPECT);
      aspectModelElement.setAttribute(ModelPersistence.MODEL_UID, aspectReference.toString());
      aspectModelElement.setAttribute(ModelPersistence.VERSION, "" + modelVersion);
      parent.addContent(aspectModelElement);
    }
  }

  public void saveNode(Element container, SNode node) {
    saveNode(container, null, node, true, null);
  }

  private void saveNode(Element parentElement, SNode node, VisibleModelElements visibleModelElements) {
    saveNode(parentElement, null, node, false, visibleModelElements);
  }

  private void saveNode(Element parentElement, String elementName, SNode node, boolean useUIDs, VisibleModelElements visibleModelElements) {
    String theElementName = elementName;
    if (theElementName == null) {
      theElementName = ModelPersistence.NODE;
    }
    Element element = new Element(theElementName);
    DocUtil.setNotNullAttribute(element, ModelPersistence.ROLE, node.getRole_());
    element.setAttribute(ModelPersistence.TYPE, node.getConceptFqName());
    element.setAttribute(ModelPersistence.ID, node.getId());

    // properties ...
    Map<String, String> properties = node.getProperties();
    Set<String> keys = properties.keySet();
    for (String propertyName : keys) {
      Element propertyElement = new Element(ModelPersistence.PROPERTY);
      element.addContent(propertyElement);
      propertyElement.setAttribute(ModelPersistence.NAME, propertyName);
      DocUtil.setNotNullAttribute(propertyElement, ModelPersistence.VALUE, node.getPersistentProperty(propertyName));
    }

    // references ...
    List<SReference> references = node.getReferences();
    IReferencePersister referencePersister = getReferencePersister();
    for (SReference reference : references) {
      referencePersister.saveReference(element, reference, useUIDs, visibleModelElements);
    }

    // children ...
    List<SNode> children = node.getChildren();
    for (SNode childNode : children) {
      saveNode(element, null, childNode, useUIDs, visibleModelElements);
    }

    parentElement.addContent(element);
  }
}
