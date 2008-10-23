package jetbrains.mps.baseLanguageInternal.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InternalPartialInstanceMethodCall extends Expression implements IOperation {
  public static final String concept = "jetbrains.mps.baseLanguageInternal.structure.InternalPartialInstanceMethodCall";
  public static final String METHOD_NAME = "methodName";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String RETURN_TYPE = "returnType";
  public static final String INSTANCE = "instance";
  public static final String ACTUAL_ARGUMENT = "actualArgument";

  public InternalPartialInstanceMethodCall(SNode node) {
    super(node);
  }

  public String getMethodName() {
    return this.getProperty(InternalPartialInstanceMethodCall.METHOD_NAME);
  }

  public void setMethodName(String value) {
    this.setProperty(InternalPartialInstanceMethodCall.METHOD_NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(InternalPartialInstanceMethodCall.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InternalPartialInstanceMethodCall.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InternalPartialInstanceMethodCall.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InternalPartialInstanceMethodCall.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InternalPartialInstanceMethodCall.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InternalPartialInstanceMethodCall.VIRTUAL_PACKAGE, value);
  }

  public Type getReturnType() {
    return (Type)this.getChild(InternalPartialInstanceMethodCall.RETURN_TYPE);
  }

  public void setReturnType(Type node) {
    super.setChild(InternalPartialInstanceMethodCall.RETURN_TYPE, node);
  }

  public Expression getInstance() {
    return (Expression)this.getChild(InternalPartialInstanceMethodCall.INSTANCE);
  }

  public void setInstance(Expression node) {
    super.setChild(InternalPartialInstanceMethodCall.INSTANCE, node);
  }

  public int getActualArgumentsCount() {
    return this.getChildCount(InternalPartialInstanceMethodCall.ACTUAL_ARGUMENT);
  }

  public Iterator<Expression> actualArguments() {
    return this.children(InternalPartialInstanceMethodCall.ACTUAL_ARGUMENT);
  }

  public List<Expression> getActualArguments() {
    return this.getChildren(InternalPartialInstanceMethodCall.ACTUAL_ARGUMENT);
  }

  public void addActualArgument(Expression node) {
    this.addChild(InternalPartialInstanceMethodCall.ACTUAL_ARGUMENT, node);
  }

  public void insertActualArgument(Expression prev, Expression node) {
    this.insertChild(prev, InternalPartialInstanceMethodCall.ACTUAL_ARGUMENT, node);
  }


  public static InternalPartialInstanceMethodCall newInstance(SModel sm, boolean init) {
    return (InternalPartialInstanceMethodCall)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguageInternal.structure.InternalPartialInstanceMethodCall", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InternalPartialInstanceMethodCall newInstance(SModel sm) {
    return InternalPartialInstanceMethodCall.newInstance(sm, false);
  }

}
