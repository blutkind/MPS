package jetbrains.mps.buildlanguage.constraints;

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
      case -1437741888:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.Project"));
      case -1034589095:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.AbstractCall"));
      case 2107741200:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.TargetDeclaration"));
      case -48040052:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.PropertyDeclaration"));
      case -1893478405:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.PropertyValueExpression"));
      case 795347809:
        return new DataHolderConstraintsDescriptor(new TargetReference_Constraints());
      case 1302601181:
        return new DataHolderConstraintsDescriptor(new PropertyReference_Constraints());
      case 292862917:
        return new DataHolderConstraintsDescriptor(new StringLiteral_Constraints());
      case 8744785:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.IPropertyHolder"));
      case -937528352:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.BooleanLiteral"));
      case 1354428089:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.IntLiteral"));
      case -874024535:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.BooleanType"));
      case -1957708828:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.StringType"));
      case 1759841215:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.IntegerType"));
      case -1141023384:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.PropertyType"));
      case -201407219:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.BinaryOperation"));
      case 1029602644:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.PlusOperation"));
      case 1030147258:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.Enum"));
      case -1958166101:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.StringEnum"));
      case 1759383942:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.IntegerEnum"));
      case -1357350560:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.FileName"));
      case -1357148657:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.FileType"));
      case -822964908:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.IProjectComponent"));
      case -2133047883:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.ImportPropertyNode"));
      case 2128904270:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.CallReferenceType"));
      case 1204360948:
        return new DataHolderConstraintsDescriptor(new CallReference_Constraints());
      case 52503435:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.ISource"));
      case 965225934:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.ICommented"));
      case -136836173:
        return new DataHolderConstraintsDescriptor(new TargetReferencePropertyValueExpression_Constraints());
      case -1801755621:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.ImportProject"));
      case -94544411:
        return new DataHolderConstraintsDescriptor(new MultiLineString_Constraints());
      case -1950915903:
        return new DataHolderConstraintsDescriptor(new ExternalPropertyDeclaration_Constraints());
      case -2085874663:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.AbstractImportProject"));
      case 977945418:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.ITargetReference"));
      case 338764851:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.AbstractImportProperties"));
      case 483736663:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.ImportPropertiesFromFile"));
      case -286180318:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.IAntScript"));
      case 31612938:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.IDeclaration"));
      case 1059270922:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.buildlanguage.structure.AbstractPropertyDeclaration"));
      default:
        return null;
    }
  }
}
