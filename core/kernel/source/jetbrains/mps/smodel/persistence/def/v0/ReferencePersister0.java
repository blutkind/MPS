package jetbrains.mps.smodel.persistence.def.v0;

import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import jetbrains.mps.smodel.persistence.def.VisibleModelElements;
import jetbrains.mps.smodel.persistence.def.IReferencePersister;
import jetbrains.mps.smodel.persistence.def.v0.externalResolve.ExternalResolver;
import org.jdom.Element;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 10.11.2005
 * Time: 20:54:31
 * To change this template use File | Settings | File Templates.
 */
/*package*/ class ReferencePersister0 implements IReferencePersister {

  private static Logger LOG = Logger.getLogger(ReferencePersister0.class);

  protected SNode mySourceNode;
  protected String myRole;
  protected String myTargetId;
  protected String myResolveInfo;
  protected String myExtResolveInfo;
  protected String myImportedModelInfo = "-1";
  protected boolean myUseUIDs;
  private boolean myNotImported;

  public void fillFields(Element linkElement, SNode sourceNode, boolean useUIDs) {
    String role = linkElement.getAttributeValue(ModelPersistence.ROLE);
    String resolveInfo = linkElement.getAttributeValue(ModelPersistence.RESOLVE_INFO);
    String attExtResolveInfo = linkElement.getAttributeValue(ModelPersistence.EXT_RESOLVE_INFO);
    String attTargetNodeId = linkElement.getAttributeValue(ModelPersistence.TARGET_NODE_ID);
    
    this.myUseUIDs = useUIDs;
    this.mySourceNode = sourceNode;
    this.myRole = role;
    if (attTargetNodeId != null) {
      ReferenceTargetDescriptor targetDescriptor = parseAttTargetNodeId(attTargetNodeId, useUIDs);
      this.myTargetId = targetDescriptor.myTargetInfo;
      this.myImportedModelInfo = targetDescriptor.myImportedModelInfo;
      this.myNotImported = targetDescriptor.myNotImported;
    }
    if (attExtResolveInfo != null) {
      ReferenceTargetDescriptor targetDescriptor = parseAttExtResolveInfo(attExtResolveInfo, useUIDs);
      this.myExtResolveInfo = targetDescriptor.myTargetInfo;
      this.myImportedModelInfo = targetDescriptor.myImportedModelInfo;
      this.myNotImported = targetDescriptor.myNotImported;
    }
    this.myResolveInfo = resolveInfo;
  }


  protected ReferenceTargetDescriptor parseAttExtResolveInfo(String attExtResolveInfo, boolean useUIDs) {
    return parseAttTargetNodeId(attExtResolveInfo, useUIDs); // same format of string
  }

  protected ReferenceTargetDescriptor parseAttTargetNodeId(String attTargetNodeId, boolean useUIDs) {
    ReferenceTargetDescriptor referenceTargetDescriptor = new ReferenceTargetDescriptor();
    int i;
    if (useUIDs) {
      i = attTargetNodeId.indexOf('#');
    } else {
      i = attTargetNodeId.indexOf('.');
    }
    if (i > 0) {
      referenceTargetDescriptor.myImportedModelInfo = attTargetNodeId.substring(0, i);
      String info = referenceTargetDescriptor.myImportedModelInfo;
      if (info.endsWith("v")) {
        referenceTargetDescriptor.myNotImported = true;
        referenceTargetDescriptor.myImportedModelInfo = info.substring(0, info.length() - 1);
      }
      referenceTargetDescriptor.myTargetInfo = attTargetNodeId.substring(i + 1);
    } else {
      referenceTargetDescriptor.myImportedModelInfo = "-1";
      referenceTargetDescriptor.myTargetInfo = attTargetNodeId;
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
    return myExtResolveInfo;
  }

  // -- create reference
  private SReference createReferenceInModelDoNotAddToSourceNode(SModel model, VisibleModelElements visibleModelElements) {
    SModelUID importedModelUID = model.getUID();
    if (myUseUIDs) {
      if (!myImportedModelInfo.equals("-1")) {
        importedModelUID = SModelUID.fromString(myImportedModelInfo);
      }
    } else if (getImportIndex() > -1) {
      if (myNotImported) {
        importedModelUID = visibleModelElements.getModelUID(getImportIndex());
      } else {
        importedModelUID = model.getImportedModelUID(getImportIndex());
      }
      if (importedModelUID == null) {
        LOG.error("Couldn't create reference from " + this.getSourceNode().getDebugText() + " : import for index [" + getImportIndex() + "] not found");
        return null;
      }
    }

    if (this.getExtResolveInfo() == null) {
      return new StaticReference(this.getRole(),
              this.getSourceNode(),
              importedModelUID,
              SNodeId.fromString(this.getTargetId()),
              this.getResolveInfo());
    }

    String extResolveInfo = this.getExtResolveInfo();
    String resolveInfo = ExternalResolver.getHumanFriendlyString(extResolveInfo);
    SNodeId targetId = ERI2IDConverter.convert(this.getSourceNode(), this.getRole(), extResolveInfo);
    if (targetId != null) {
      return new StaticReference(this.getRole(),
              this.getSourceNode(),
              importedModelUID,
              targetId,
              resolveInfo);
    }

    // couldn't convert
    if (resolveInfo == null) {
      resolveInfo = this.getResolveInfo();
    }
    return new StaticReference(this.getRole(),
            this.getSourceNode(),
            importedModelUID,
            null,
            resolveInfo);
  }

  public void createReferenceInModel(SModel model, VisibleModelElements visibleModelElements) {
    SReference reference = createReferenceInModelDoNotAddToSourceNode(model, visibleModelElements);
    if (reference != null) this.getSourceNode().addReference(reference);
  }

  public int getImportIndex() {
    try {
      return Integer.parseInt(myImportedModelInfo);
    } catch (NumberFormatException e) {
      return -1;
    }
  }
  // --


  public static class ReferenceTargetDescriptor {
    public ReferenceTargetDescriptor() {

    }

    public boolean myNotImported = false;
    public String myTargetInfo;
    public String myImportedModelInfo;
  }
}
