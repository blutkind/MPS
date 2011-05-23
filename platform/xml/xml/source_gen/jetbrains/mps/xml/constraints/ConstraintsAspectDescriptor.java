package jetbrains.mps.xml.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case -1742027599:
        return new DataHolderConstraintsDescriptor(new Content_Constraints());
      case -900767755:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.xml.structure.Text"));
      case 1986918965:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.xml.structure.ComplexText"));
      case 677537382:
        return new DataHolderConstraintsDescriptor(new BaseText_Constraints());
      case 1191913711:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.xml.structure.ContentList"));
      case -984849149:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.xml.structure.BaseAttribute"));
      case -61427916:
        return new DataHolderConstraintsDescriptor(new Element_Constraints());
      case 1368919252:
        return new DataHolderConstraintsDescriptor(new Attribute_Constraints());
      case 345637600:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.xml.structure.EntityReference"));
      case -2075048157:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.xml.structure.BaseElement"));
      case 2124233925:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.xml.structure.CDATA"));
      case -344428079:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.xml.structure.XmlRoot"));
      default:
        return null;
    }
  }
}
