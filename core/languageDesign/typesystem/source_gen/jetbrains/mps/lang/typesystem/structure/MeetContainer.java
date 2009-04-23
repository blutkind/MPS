package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MeetContainer extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.MeetContainer";
  public static final String MEET_TYPE = "meetType";

  public MeetContainer(SNode node) {
    super(node);
  }

  public MeetType getMeetType() {
    return (MeetType)this.getChild(MeetType.class, MeetContainer.MEET_TYPE);
  }

  public void setMeetType(MeetType node) {
    super.setChild(MeetContainer.MEET_TYPE, node);
  }


  public static MeetContainer newInstance(SModel sm, boolean init) {
    return (MeetContainer)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.MeetContainer", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MeetContainer newInstance(SModel sm) {
    return MeetContainer.newInstance(sm, false);
  }

}
