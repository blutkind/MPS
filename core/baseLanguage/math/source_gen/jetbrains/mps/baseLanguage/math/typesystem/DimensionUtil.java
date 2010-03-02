package jetbrains.mps.baseLanguage.math.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.dependencies.InferenceMethod;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.ArrayList;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class DimensionUtil {
  @InferenceMethod
  public static void checkDim(final TypeCheckingContext typeCheckingContext, final List<SNode> components, final int n, final List<SNode> types, final boolean row, final SNode node) {
    if (n == ListSequence.fromList(components).count()) {
      final SNode T_typevar_757772128652074250 = typeCheckingContext.createNewRuntimeTypesVariable();
      int s = 0;
      int f = 0;
      boolean cbd = true;
      boolean cbc = true;
      for (SNode type : ListSequence.fromList(types)) {
        do {
          SNode matchedNode_48zlf8_a0f0a0a = type;
          {
            boolean matches_48zlf8_a0a5a0a0 = false;
            {
              SNode matchingNode_48zlf8_a0a5a0a0 = type;
              if (matchingNode_48zlf8_a0a5a0a0 != null) {
                matches_48zlf8_a0a5a0a0 = SModelUtil_new.isAssignableConcept(matchingNode_48zlf8_a0a5a0a0.getConceptFqName(), "jetbrains.mps.baseLanguage.math.structure.MatrixType");
              }
            }
            if (matches_48zlf8_a0a5a0a0) {
              if (row) {
                if (SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "rows") == 0) {
                  cbd = false;
                }
                if (SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "columns") == 0) {
                  cbc = false;
                }
                if (cbd && f != 0 && f != SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "rows")) {
                  reportError(typeCheckingContext, node);
                }
                if (f == 0) {
                  f = SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "rows");
                }
                if (s == 0) {
                  s = SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "columns");
                } else {
                  s += SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "columns");
                }
              } else {
                if (SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "columns") == 0) {
                  cbd = false;
                }
                if (SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "rows") == 0) {
                  cbc = false;
                }
                if (cbd && f != 0 && f != SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "columns")) {
                  reportError(typeCheckingContext, node);
                }
                if (f == 0) {
                  f = SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "columns");
                }
                if (s == 0) {
                  s = SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "rows");
                } else {
                  s += SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "rows");
                }
              }
              {
                SNode _nodeToCheck_1029348928467 = null;
                BaseIntentionProvider intentionProvider = null;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "757772128652074322", 0, intentionProvider);
                _info_12389875345.setInequationGroup("default");
                typeCheckingContext.createLessThanInequation((SNode) SLinkOperations.getTarget(matchedNode_48zlf8_a0f0a0a, "elementType", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(T_typevar_757772128652074250), false, _info_12389875345);
              }
              break;
            }
          }
          {
            boolean matches_48zlf8_b0a5a0a0 = false;
            {
              SNode matchingNode_48zlf8_b0a5a0a0 = type;
              if (matchingNode_48zlf8_b0a5a0a0 != null) {
                matches_48zlf8_b0a5a0a0 = SModelUtil_new.isAssignableConcept(matchingNode_48zlf8_b0a5a0a0.getConceptFqName(), "jetbrains.mps.baseLanguage.math.structure.VectorType");
              }
            }
            if (matches_48zlf8_b0a5a0a0) {
              if (row) {
                if (SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "height") == 0) {
                  cbd = false;
                }
                if (cbd && f != 0 && f != SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "height")) {
                  reportError(typeCheckingContext, node);
                }
                if (f == 0) {
                  f = SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "height");
                }
                if (s == 0) {
                  s = 1;
                } else {
                  s += 1;
                }
              } else {
                if (SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "height") == 0) {
                  cbc = false;
                }
                if (cbd && f != 0 && f != 1) {
                  reportError(typeCheckingContext, node);
                }
                if (f == 0) {
                  f = 1;
                }
                if (s == 0) {
                  s = SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "height");
                } else {
                  s += SPropertyOperations.getInteger(matchedNode_48zlf8_a0f0a0a, "height");
                }
              }
              {
                SNode _nodeToCheck_1029348928467 = null;
                BaseIntentionProvider intentionProvider = null;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "757772128652075446", 0, intentionProvider);
                _info_12389875345.setInequationGroup("default");
                typeCheckingContext.createLessThanInequation((SNode) SLinkOperations.getTarget(matchedNode_48zlf8_a0f0a0a, "elementType", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(T_typevar_757772128652074250), false, _info_12389875345);
              }
              break;
            }
          }
          {
            SNode _nodeToCheck_1029348928467 = null;
            BaseIntentionProvider intentionProvider = null;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "757772128652104638", 0, intentionProvider);
            _info_12389875345.setInequationGroup("default");
            typeCheckingContext.createLessThanInequation((SNode) type, (SNode) typeCheckingContext.getEquationManager().getRepresentator(T_typevar_757772128652074250), false, _info_12389875345);
          }
          if (row) {
            if (cbd && f != 0 && f != 1) {
              reportError(typeCheckingContext, node);
            }
            if (f == 0) {
              f = 1;
            }
            if (s == 0) {
              s = 1;
            } else {
              s += 1;
            }
          } else {
            if (cbd && f != 0 && f != 1) {
              reportError(typeCheckingContext, node);
            }
            if (f == 0) {
              f = 1;
            }
            if (s == 0) {
              s = 1;
            } else {
              s += 1;
            }
          }
        } while(false);
      }
      SNode result = MathTypeUtil.qMatrix(typeCheckingContext.getEquationManager().getRepresentator(T_typevar_757772128652074250));
      if (row) {
        if (cbc) {
          SPropertyOperations.set(result, "columns", "" + s);
        }
        if (cbd) {
          SPropertyOperations.set(result, "rows", "" + f);
        }
      } else {
        if (cbc) {
          SPropertyOperations.set(result, "rows", "" + s);
        }
        if (cbd) {
          SPropertyOperations.set(result, "columns", "" + f);
        }
      }
      if (SPropertyOperations.getInteger(result, "columns") == 1) {
        {
          SNode _nodeToCheck_1029348928467 = node;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "6389121991274973498", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "6389121991274973494", true), (SNode) new DimensionUtil.QuotationClass_48zlf8_a0a0a8a0a0().createNode(typeCheckingContext.getEquationManager().getRepresentator(T_typevar_757772128652074250), "" + SPropertyOperations.getInteger(result, "rows"), typeCheckingContext), _info_12389875345);
        }
      } else {
        {
          SNode _nodeToCheck_1029348928467 = node;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "6389121991274973487", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "6389121991274973491", true), (SNode) result, _info_12389875345);
        }
      }
    } else {
      {
        final SNode t1 = typeCheckingContext.typeOf(ListSequence.fromList(components).getElement(n), "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "757772128652013457", true);
        typeCheckingContext.whenConcrete(t1, new Runnable() {
          public void run() {
            List<SNode> types2 = new ArrayList<SNode>();
            ListSequence.fromList(types2).addSequence(ListSequence.fromList(types));
            ListSequence.fromList(types2).addElement(typeCheckingContext.getEquationManager().getRepresentator(t1));
            checkDim(typeCheckingContext, components, n + 1, types2, row, node);
          }
        }, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "757772128651891776", false, false);
      }
    }
  }

  @InferenceMethod
  public static void reportError(final TypeCheckingContext typeCheckingContext, SNode n) {
    {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(n, "Invalid matrix dimensions", "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "7676695779583019339", intentionProvider, errorTarget);
    }
  }

  public static int dimr(SNode t) {
    do {
      SNode matchedNode_48zlf8_a0c = t;
      {
        boolean matches_48zlf8_a0a2 = false;
        {
          SNode matchingNode_48zlf8_a0a2 = t;
          if (matchingNode_48zlf8_a0a2 != null) {
            matches_48zlf8_a0a2 = SModelUtil_new.isAssignableConcept(matchingNode_48zlf8_a0a2.getConceptFqName(), "jetbrains.mps.baseLanguage.math.structure.MatrixType");
          }
        }
        if (matches_48zlf8_a0a2) {
          return SPropertyOperations.getInteger(matchedNode_48zlf8_a0c, "rows");
        }
      }
      {
        boolean matches_48zlf8_b0a2 = false;
        {
          SNode matchingNode_48zlf8_b0a2 = t;
          if (matchingNode_48zlf8_b0a2 != null) {
            matches_48zlf8_b0a2 = SModelUtil_new.isAssignableConcept(matchingNode_48zlf8_b0a2.getConceptFqName(), "jetbrains.mps.baseLanguage.math.structure.VectorType");
          }
        }
        if (matches_48zlf8_b0a2) {
          return SPropertyOperations.getInteger(matchedNode_48zlf8_a0c, "height");
        }
      }
      return 0;
    } while(false);
  }

  public static int dimc(SNode t) {
    do {
      SNode matchedNode_48zlf8_a0d = t;
      {
        boolean matches_48zlf8_a0a3 = false;
        {
          SNode matchingNode_48zlf8_a0a3 = t;
          if (matchingNode_48zlf8_a0a3 != null) {
            matches_48zlf8_a0a3 = SModelUtil_new.isAssignableConcept(matchingNode_48zlf8_a0a3.getConceptFqName(), "jetbrains.mps.baseLanguage.math.structure.MatrixType");
          }
        }
        if (matches_48zlf8_a0a3) {
          return SPropertyOperations.getInteger(matchedNode_48zlf8_a0d, "columns");
        }
      }
      {
        boolean matches_48zlf8_b0a3 = false;
        {
          SNode matchingNode_48zlf8_b0a3 = t;
          if (matchingNode_48zlf8_b0a3 != null) {
            matches_48zlf8_b0a3 = SModelUtil_new.isAssignableConcept(matchingNode_48zlf8_b0a3.getConceptFqName(), "jetbrains.mps.baseLanguage.math.structure.VectorType");
          }
        }
        if (matches_48zlf8_b0a3) {
          return 1;
        }
      }
      return 0;
    } while(false);
  }

  public static class QuotationClass_48zlf8_a0a0a8a0a0 {
    public QuotationClass_48zlf8_a0a0a8a0a0() {
    }

    public SNode createNode(Object parameter_5, Object parameter_6, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.VectorType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setProperty("height", (String) parameter_6);
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_4, typeCheckingContext));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }

    public SNode createNode(Object parameter_5, Object parameter_6) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.VectorType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setProperty("height", (String) parameter_6);
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
