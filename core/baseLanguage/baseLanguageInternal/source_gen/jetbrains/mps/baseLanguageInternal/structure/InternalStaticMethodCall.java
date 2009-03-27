package jetbrains.mps.baseLanguageInternal.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InternalStaticMethodCall extends jetbrains.mps.baseLanguage.structure.BaseMethodCall {
  public static final String concept = "jetbrains.mps.baseLanguageInternal.structure.InternalStaticMethodCall";
  public static final String FQ_CLASS_NAME = "fqClassName";
  public static final String METHOD_NAME = "methodName";
  public static final String RETURN_TYPE = "returnType";
  public static final String TYPE_PARAMETER = "typeParameter";

  public InternalStaticMethodCall(SNode node) {
    super(node);
  }

  public String getFqClassName() {
    return this.getProperty(InternalStaticMethodCall.FQ_CLASS_NAME);
  }

  public void setFqClassName(String value) {
    this.setProperty(InternalStaticMethodCall.FQ_CLASS_NAME, value);
  }

  public String getMethodName() {
    return this.getProperty(InternalStaticMethodCall.METHOD_NAME);
  }

  public void setMethodName(String value) {
    this.setProperty(InternalStaticMethodCall.METHOD_NAME, value);
  }

  public jetbrains.mps.baseLanguage.structure.Type getReturnType() {
    return (jetbrains.mps.baseLanguage.structure.Type)this.getChild(Type.class, InternalStaticMethodCall.RETURN_TYPE);
  }

  public void setReturnType(jetbrains.mps.baseLanguage.structure.Type node) {
    super.setChild(InternalStaticMethodCall.RETURN_TYPE, node);
  }

  public int getTypeParametersCount() {
    return this.getChildCount(InternalStaticMethodCall.TYPE_PARAMETER);
  }

  public Iterator<jetbrains.mps.baseLanguage.structure.Type> typeParameters() {
    return this.children(Type.class, InternalStaticMethodCall.TYPE_PARAMETER);
  }

  public List<jetbrains.mps.baseLanguage.structure.Type> getTypeParameters() {
    return this.getChildren(Type.class, InternalStaticMethodCall.TYPE_PARAMETER);
  }

  public void addTypeParameter(jetbrains.mps.baseLanguage.structure.Type node) {
    this.addChild(InternalStaticMethodCall.TYPE_PARAMETER, node);
  }

  public void insertTypeParameter(jetbrains.mps.baseLanguage.structure.Type prev, jetbrains.mps.baseLanguage.structure.Type node) {
    this.insertChild(prev, InternalStaticMethodCall.TYPE_PARAMETER, node);
  }


  public static InternalStaticMethodCall newInstance(SModel sm, boolean init) {
    return (InternalStaticMethodCall)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguageInternal.structure.InternalStaticMethodCall", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InternalStaticMethodCall newInstance(SModel sm) {
    return InternalStaticMethodCall.newInstance(sm, false);
  }

}
