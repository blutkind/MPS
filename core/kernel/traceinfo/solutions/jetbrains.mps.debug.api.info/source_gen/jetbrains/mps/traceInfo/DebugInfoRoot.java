package jetbrains.mps.traceInfo;

/*Generated by MPS */

import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.TreeSet;
import org.jdom.Element;
import org.jdom.DataConversionException;
import java.util.List;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.smodel.SModelDescriptor;
import java.io.File;
import jetbrains.mps.vfs.FileSystem;

public class DebugInfoRoot {
  private static final String NODE_INFO = "nodeInfo";
  private static final String SCOPE_INFO = "scopeInfo";
  private static final String UNIT_INFO = "unitInfo";

  private String myRootId;
  private Set<TraceablePositionInfo> myPositions;
  private Set<ScopePositionInfo> myScopePositions;
  private Set<UnitPositionInfo> myUnitPositions;

  public DebugInfoRoot(String rootId) {
    myRootId = rootId;
  }

  public void addPosition(TraceablePositionInfo position) {
    if (myPositions == null) {
      myPositions = SetSequence.fromSet(new TreeSet<TraceablePositionInfo>());
    }
    SetSequence.fromSet(myPositions).addElement(position);
  }

  public void addScopePosition(ScopePositionInfo position) {
    if (myScopePositions == null) {
      myScopePositions = SetSequence.fromSet(new TreeSet<ScopePositionInfo>());
    }
    SetSequence.fromSet(myScopePositions).addElement(position);
  }

  public void addUnitPosition(UnitPositionInfo unitPosition) {
    if (myUnitPositions == null) {
      myUnitPositions = SetSequence.fromSet(new TreeSet<UnitPositionInfo>());
    }
    SetSequence.fromSet(myUnitPositions).addElement(unitPosition);
  }

  public String getRootId() {
    return myRootId;
  }

  public Set<TraceablePositionInfo> getPositions() {
    return myPositions;
  }

  public Set<ScopePositionInfo> getScopePositions() {
    return myScopePositions;
  }

  public Set<UnitPositionInfo> getUnitPositions() {
    return myUnitPositions;
  }

  public void toXml(Element container) {
    if (myPositions != null) {
      for (PositionInfo position : myPositions) {
        Element e = new Element(DebugInfoRoot.NODE_INFO);
        position.saveTo(e);
        container.addContent(e);
      }
    }
    if (myScopePositions != null) {
      for (ScopePositionInfo position : myScopePositions) {
        Element e = new Element(DebugInfoRoot.SCOPE_INFO);
        position.saveTo(e);
        container.addContent(e);
      }
    }
    if (myUnitPositions != null) {
      for (UnitPositionInfo position : myUnitPositions) {
        Element e = new Element(DebugInfoRoot.UNIT_INFO);
        position.saveTo(e);
        container.addContent(e);
      }
    }
  }

  public static DebugInfoRoot fromXml(Element element, String id) throws DataConversionException {
    Element root = element;
    DebugInfoRoot result = new DebugInfoRoot(id);
    for (Element e : ((List<Element>) root.getChildren(DebugInfoRoot.NODE_INFO))) {
      result.addPosition(new TraceablePositionInfo(e));
    }
    for (Element e : ((List<Element>) root.getChildren(DebugInfoRoot.SCOPE_INFO))) {
      result.addScopePosition(new ScopePositionInfo(e));
    }
    for (Element e : ((List<Element>) root.getChildren(DebugInfoRoot.UNIT_INFO))) {
      result.addUnitPosition(new UnitPositionInfo(e));
    }
    return result;
  }

  public static IFile getDebugFileOfModel(String outputDir, SModelDescriptor model) {
    String modelName = model.getLongName().replace(".", File.separator);
    String debugPath = modelName.substring(0, modelName.length()) + File.separator + ".debug";
    return FileSystem.getInstance().getFileByPath(outputDir + File.separator + debugPath);
  }
}
