package jetbrains.mps.baseLanguage.helgins;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.helgins.inference.Interpretator;
import jetbrains.mps.helgins.inference.SubtypingManager;
import jetbrains.mps.helgins.RuntimeErrorType;
import jetbrains.mps.baseLanguage.*;
import jetbrains.mps.util.CollectionUtil;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 07.09.2006
 * Time: 15:21:17
 * To change this template use File | Settings | File Templates.
 */
public class Queries {
  public static Object CustomExpression_getBinaryOperationType(Object... args)  {
    SNode leftType = (SNode) args[0];
    SNode rightType = (SNode) args[1];
    SModel typesModel = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString("jetbrains.mps.baseLanguage.helgins")).getSModel();
    SModel runtimeTypesModel = Interpretator.getRuntimeTypesModel(typesModel);
    Set<? extends SNode> types = CollectionUtil.asSet(leftType, rightType);
    Set<SNode> lowestCommonSupertypes = SubtypingManager.lowestCommonSupertypes(types);
    if (lowestCommonSupertypes.isEmpty()) {
      RuntimeErrorType runtimeErrorType = new RuntimeErrorType(runtimeTypesModel);
      runtimeErrorType.setErrorText("incompatible types");
      return runtimeErrorType;
    }
    SNode type = lowestCommonSupertypes.iterator().next();
    return type;
  }
}
