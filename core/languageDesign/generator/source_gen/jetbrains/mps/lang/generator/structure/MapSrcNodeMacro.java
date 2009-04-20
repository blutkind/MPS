package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.lang.generator.structure.SourceSubstituteMacro;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodeQuery;
import jetbrains.mps.lang.generator.structure.MapSrcMacro_MapperFunction;
import jetbrains.mps.lang.generator.structure.MapSrcMacro_PostMapperFunction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MapSrcNodeMacro extends SourceSubstituteMacro {
  public static final String concept = "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro";
  public static final String SOURCE_NODE_QUERY = "sourceNodeQuery";
  public static final String MAPPER_FUNCTION = "mapperFunction";
  public static final String POST_MAPPER_FUNCTION = "postMapperFunction";

  public MapSrcNodeMacro(SNode node) {
    super(node);
  }

  public SourceSubstituteMacro_SourceNodeQuery getSourceNodeQuery() {
    return (SourceSubstituteMacro_SourceNodeQuery)this.getChild(SourceSubstituteMacro_SourceNodeQuery.class, MapSrcNodeMacro.SOURCE_NODE_QUERY);
  }

  public void setSourceNodeQuery(SourceSubstituteMacro_SourceNodeQuery node) {
    super.setChild(MapSrcNodeMacro.SOURCE_NODE_QUERY, node);
  }

  public MapSrcMacro_MapperFunction getMapperFunction() {
    return (MapSrcMacro_MapperFunction)this.getChild(MapSrcMacro_MapperFunction.class, MapSrcNodeMacro.MAPPER_FUNCTION);
  }

  public void setMapperFunction(MapSrcMacro_MapperFunction node) {
    super.setChild(MapSrcNodeMacro.MAPPER_FUNCTION, node);
  }

  public MapSrcMacro_PostMapperFunction getPostMapperFunction() {
    return (MapSrcMacro_PostMapperFunction)this.getChild(MapSrcMacro_PostMapperFunction.class, MapSrcNodeMacro.POST_MAPPER_FUNCTION);
  }

  public void setPostMapperFunction(MapSrcMacro_PostMapperFunction node) {
    super.setChild(MapSrcNodeMacro.POST_MAPPER_FUNCTION, node);
  }


  public static MapSrcNodeMacro newInstance(SModel sm, boolean init) {
    return (MapSrcNodeMacro)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.MapSrcNodeMacro", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MapSrcNodeMacro newInstance(SModel sm) {
    return MapSrcNodeMacro.newInstance(sm, false);
  }

}
