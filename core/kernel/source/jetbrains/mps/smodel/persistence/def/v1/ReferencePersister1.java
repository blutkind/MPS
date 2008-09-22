package jetbrains.mps.smodel.persistence.def.v1;

import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import jetbrains.mps.smodel.persistence.def.VisibleModelElements;
import jetbrains.mps.smodel.persistence.def.IReferencePersister;
import org.jdom.Element;

public class ReferencePersister1 implements IReferencePersister {

  private static Logger LOG = Logger.getLogger(ReferencePersister1.class);

  protected SNode mySourceNode;
  protected String myRole;
  protected String myTargetId;
  protected String myResolveInfo;
  protected String myImportedModelInfo = "-1";
  protected boolean myUseUIDs;
  private boolean myNotImported;

  public void fillFields(Element linkElement, SNode sourceNode, boolean useUIDs) {
    String role = linkElement.getAttributeValue(ModelPersistence.ROLE);
    String resolveInfo = linkElement.getAttributeValue(ModelPersistence.RESOLVE_INFO);
    String attTargetNodeId = linkElement.getAttributeValue(ModelPersistence.TARGET_NODE_ID);

      this.myUseUIDs = useUIDs;
    this.mySourceNode = sourceNode;
    this.myRole = role;
    if (attTargetNodeId != null) {
      ReferenceTargetDescriptor targetDescriptor = parseAttTargetNodeId(attTargetNodeId, useUIDs);
      this.myTargetId = targetDescriptor.targetInfo;
      this.myImportedModelInfo = targetDescriptor.importedModelInfo;
      this.myNotImported = targetDescriptor.notImported;
    }
    this.myResolveInfo = resolveInfo;
  }

  private ReferenceTargetDescriptor parseAttTargetNodeId(String attTargetNodeId, boolean useUIDs) {
    ReferenceTargetDescriptor referenceTargetDescriptor = new ReferenceTargetDescriptor();
    int i;
    if (useUIDs) {
      i = attTargetNodeId.indexOf('#');
    } else {
      i = attTargetNodeId.indexOf('.');
    }
    if (i > 0) {
      referenceTargetDescriptor.importedModelInfo = attTargetNodeId.substring(0, i);
      String info = referenceTargetDescriptor.importedModelInfo;
      if (info.endsWith("v")) {
        referenceTargetDescriptor.notImported = true;
        referenceTargetDescriptor.importedModelInfo = info.substring(0, info.length() - 1);
      }
      referenceTargetDescriptor.targetInfo = attTargetNodeId.substring(i + 1);
    } else {
      referenceTargetDescriptor.importedModelInfo = "-1";
      referenceTargetDescriptor.targetInfo = attTargetNodeId;
    }
    return referenceTargetDescriptor;
  }

  public SNode getSourceNode() {
    return mySourceNode;
  }


  public String getRole() {
    return myRole;
  }

  public String getTargetId() {
    return myTargetId;
  }

  public String getResolveInfo() {
    return myResolveInfo;
  }

  public String getExtResolveInfo() {
    return null;
  }

  // -- create reference
  private SReference createReferenceInModelDoNotAddToSourceNode(SModel model, VisibleModelElements visibleModelElements) {
    SModelReference importedModelReference = model.getSModelReference();
    if (myUseUIDs) {
      if (!myImportedModelInfo.equals("-1")) {
        importedModelReference = SModelReference.fromString(myImportedModelInfo);
      }
    } else if (getImportIndex() > -1) {
      if (myNotImported) {
        importedModelReference = visibleModelElements.getModelUID(getImportIndex());
      } else {
        importedModelReference = model.getImportedModelUID(getImportIndex());
      }
      if (importedModelReference == null) {
        LOG.error("couldn't create reference '" + this.getRole() + "' from " + this.getSourceNode().getDebugText() + " : import for index [" + getImportIndex() + "] not found");
        return null;
      }
    }

    if (this.getTargetId() == null) {
      LOG.error("couldn't create reference '" + this.getRole() + "' from " + this.getSourceNode().getDebugText() + " : target node id is null");
      return null;
    }

    if (this.getTargetId().equals("^")) {
      return new DynamicReference(
        this.getRole(),
        this.getSourceNode(),
        importedModelReference,
        this.getResolveInfo());
    }
    return new StaticReference(
      this.getRole(),
      this.getSourceNode(),
      importedModelReference,
      SNodeId.fromString(this.getTargetId()),
      this.getResolveInfo());
  }

  public void createReferenceInModel(SModel model, VisibleModelElements visibleModelElements) {
    SReference reference = createReferenceInModelDoNotAddToSourceNode(model, visibleModelElements);
    if (reference != null) this.getSourceNode().addReference(reference);
  }

  //-- save reference

  public void saveReference(Element parentElement, SReference reference, boolean useUIDs, VisibleModelElements visibleModelElements) {
    assert useUIDs || visibleModelElements != null;
    SNode node = reference.getSourceNode();
    Element linkElement = new Element(ModelPersistence.LINK);
    parentElement.addContent(linkElement);
    linkElement.setAttribute(ModelPersistence.ROLE, reference.getRole());

    String targetModelInfo = "";
    if (reference.isExternal()) {
      if (useUIDs) {
        targetModelInfo = reference.getTargetSModelReference().toString() + "#";
      } else {
        SModelReference targetModelReference = reference.getTargetSModelReference();
        if (targetModelReference != null) {
          SModel.ImportElement importElement = node.getModel().getImportElement(targetModelReference);
          if (importElement != null) {
            int importIndex = importElement.getReferenceID();
            targetModelInfo = importIndex + ".";
          } else {
            int visibleIndex = visibleModelElements.getVisibleModelIndex(targetModelReference);
            targetModelInfo = visibleIndex + "v.";
          }
        } else {
          LOG.error("external reference '" + reference.getRole() + "' has no target model info", reference.getSourceNode());
          LOG.error("-- was reference " + reference + " in " + reference.getSourceNode().getDebugText());
        }
      }
    }

    String targetNodeId;
    if (reference instanceof StaticReference) {
      StaticReference staticReference = (StaticReference) reference;
      targetNodeId = String.valueOf(staticReference.getTargetNodeId());
    } else {
      targetNodeId = "^";
    }

    targetNodeId = targetModelInfo + targetNodeId;
    linkElement.setAttribute(ModelPersistence.TARGET_NODE_ID, targetNodeId);
    String resolveInfo = reference.getResolveInfo();
    if (resolveInfo != null) linkElement.setAttribute(ModelPersistence.RESOLVE_INFO, resolveInfo);
  }

  public int getImportIndex() {
    try {
      return Integer.parseInt(myImportedModelInfo);
    } catch (NumberFormatException e) {
      return -1;
    }
  }
  // --


  @SuppressWarnings({"InstanceVariableNamingConvention"})
  public static class ReferenceTargetDescriptor {
    public boolean notImported = false;
    public String targetInfo;
    public String importedModelInfo;
  }

  @SuppressWarnings({"InstanceVariableNamingConvention"})
  protected static class ReferenceDescriptor {
    public SNode sourceNode;
    public String role;
    public String resolveInfo;
    public String targetNodeId;
  }
}