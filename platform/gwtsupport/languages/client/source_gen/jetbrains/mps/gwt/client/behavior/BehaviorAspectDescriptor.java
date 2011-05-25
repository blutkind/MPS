package jetbrains.mps.gwt.client.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case 2066284946:
        return new GWTModule_BehaviorDescriptor();
      case 82464764:
        return new EntryPoint_BehaviorDescriptor();
      case 36823574:
        return new Inherits_BehaviorDescriptor();
      case -1933198114:
        // interface or abstract concept behavior jetbrains.mps.gwt.client.structure.PatternHolder 
        return null;
      case -557407830:
        return new Include_BehaviorDescriptor();
      case 473836252:
        return new Exclude_BehaviorDescriptor();
      case -1995982166:
        // interface or abstract concept behavior jetbrains.mps.gwt.client.structure.PatternFilter 
        return null;
      case 1003894930:
        return new Pattern_BehaviorDescriptor();
      case -1340602781:
        return new Path_BehaviorDescriptor();
      case -1341031377:
        // interface or abstract concept behavior jetbrains.mps.gwt.client.structure.Attr 
        return null;
      case -908299716:
        return new DefaultExcludes_BehaviorDescriptor();
      case 549227720:
        return new CaseSensitive_BehaviorDescriptor();
      case -99773431:
        return new Includes_BehaviorDescriptor();
      case 1804022039:
        return new Excludes_BehaviorDescriptor();
      case 269775577:
        return new Source_BehaviorDescriptor();
      case 1715140472:
        return new SuperSource_BehaviorDescriptor();
      case 188857639:
        return new Public_BehaviorDescriptor();
      case 132148222:
        // interface or abstract concept behavior jetbrains.mps.gwt.client.structure.Element 
        return null;
      case -687424105:
        return new RenameTo_BehaviorDescriptor();
      default:
        return null;
    }
  }
}
