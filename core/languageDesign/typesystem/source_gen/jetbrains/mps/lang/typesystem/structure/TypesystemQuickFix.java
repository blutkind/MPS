package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TypesystemQuickFix extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.TypesystemQuickFix";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EXECUTE_BLOCK = "executeBlock";
  public static final String DESCRIPTION_BLOCK = "descriptionBlock";
  public static final String SET_SELECTION_BLOCK = "setSelectionBlock";
  public static final String QUICK_FIX_ARGUMENT = "quickFixArgument";

  public TypesystemQuickFix(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(TypesystemQuickFix.NAME);
  }

  public void setName(String value) {
    this.setProperty(TypesystemQuickFix.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(TypesystemQuickFix.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TypesystemQuickFix.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TypesystemQuickFix.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TypesystemQuickFix.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TypesystemQuickFix.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TypesystemQuickFix.VIRTUAL_PACKAGE, value);
  }

  public QuickFixExecuteBlock getExecuteBlock() {
    return (QuickFixExecuteBlock) this.getChild(QuickFixExecuteBlock.class, TypesystemQuickFix.EXECUTE_BLOCK);
  }

  public void setExecuteBlock(QuickFixExecuteBlock node) {
    super.setChild(TypesystemQuickFix.EXECUTE_BLOCK, node);
  }

  public QuickFixDescriptionBlock getDescriptionBlock() {
    return (QuickFixDescriptionBlock) this.getChild(QuickFixDescriptionBlock.class, TypesystemQuickFix.DESCRIPTION_BLOCK);
  }

  public void setDescriptionBlock(QuickFixDescriptionBlock node) {
    super.setChild(TypesystemQuickFix.DESCRIPTION_BLOCK, node);
  }

  public QuickFixSetSelectionBlock getSetSelectionBlock() {
    return (QuickFixSetSelectionBlock) this.getChild(QuickFixSetSelectionBlock.class, TypesystemQuickFix.SET_SELECTION_BLOCK);
  }

  public void setSetSelectionBlock(QuickFixSetSelectionBlock node) {
    super.setChild(TypesystemQuickFix.SET_SELECTION_BLOCK, node);
  }

  public int getQuickFixArgumentsCount() {
    return this.getChildCount(TypesystemQuickFix.QUICK_FIX_ARGUMENT);
  }

  public Iterator<QuickFixArgument> quickFixArguments() {
    return this.children(QuickFixArgument.class, TypesystemQuickFix.QUICK_FIX_ARGUMENT);
  }

  public List<QuickFixArgument> getQuickFixArguments() {
    return this.getChildren(QuickFixArgument.class, TypesystemQuickFix.QUICK_FIX_ARGUMENT);
  }

  public void addQuickFixArgument(QuickFixArgument node) {
    this.addChild(TypesystemQuickFix.QUICK_FIX_ARGUMENT, node);
  }

  public void insertQuickFixArgument(QuickFixArgument prev, QuickFixArgument node) {
    this.insertChild(prev, TypesystemQuickFix.QUICK_FIX_ARGUMENT, node);
  }

  public static TypesystemQuickFix newInstance(SModel sm, boolean init) {
    return (TypesystemQuickFix) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.TypesystemQuickFix", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TypesystemQuickFix newInstance(SModel sm) {
    return TypesystemQuickFix.newInstance(sm, false);
  }
}
