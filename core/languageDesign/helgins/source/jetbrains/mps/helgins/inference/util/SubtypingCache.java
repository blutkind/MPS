package jetbrains.mps.helgins.inference.util;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Pair;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.helgins.integration.HelginsPreferencesComponent;
import jetbrains.mps.lang.pattern.ConceptMatchingPattern;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: test
 * Date: Aug 30, 2008
 * Time: 12:04:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class SubtypingCache {
  private Map<CacheNodeHandler, Map<CacheNodeHandler, Boolean>> myCache = new HashMap<CacheNodeHandler, Map<CacheNodeHandler, Boolean>>();
  private Map<CacheNodeHandler, Map<String, SNode>> myCoerceToConceptsCache = new HashMap<CacheNodeHandler, Map<String, SNode>>();
  private Map<CacheNodeHandler, Map<Class, Pair<SNode, GeneratedMatchingPattern>>> myCoerceToPatternsCache
    = new HashMap<CacheNodeHandler, Map<Class, Pair<SNode, GeneratedMatchingPattern>>>();

  private Map<CacheNodeHandler, Map<CacheNodeHandler, Boolean>> myCacheWeak = new HashMap<CacheNodeHandler, Map<CacheNodeHandler, Boolean>>();
  private Map<CacheNodeHandler, Map<String, SNode>> myCoerceToConceptsCacheWeak = new HashMap<CacheNodeHandler, Map<String, SNode>>();
  private Map<CacheNodeHandler, Map<Class, Pair<SNode, GeneratedMatchingPattern>>> myCoerceToPatternsCacheWeak
    = new HashMap<CacheNodeHandler, Map<Class, Pair<SNode, GeneratedMatchingPattern>>>();

  private boolean myCoersionSimpleCached = HelginsPreferencesComponent.getInstance().isCoersionSimpleCached();
  private boolean myCoersionPatternCached = HelginsPreferencesComponent.getInstance().isCoersionPatternCached();
  private boolean mySubtypingCached = HelginsPreferencesComponent.getInstance().isSubtypingCached();

  public void addCacheEntry(SNode subtype, SNode supertype, boolean answer, boolean isWeak) {
    if (!mySubtypingCached) {
      return;
    }
    Map<CacheNodeHandler, Map<CacheNodeHandler, Boolean>> cache = myCache;
    CacheNodeHandler subtypeHandler = new CacheNodeHandler(subtype);
    Map<CacheNodeHandler, Boolean> supertypes = cache.get(subtypeHandler);
    if (supertypes == null) {
      supertypes = new HashMap<CacheNodeHandler, Boolean>();
      cache.put(subtypeHandler, supertypes);
    }
    supertypes.put(new CacheNodeHandler(supertype), answer);

    if (isWeak) {
      cache = myCacheWeak;
      CacheNodeHandler subtypeHandlerWeak = new CacheNodeHandler(subtype);
      Map<CacheNodeHandler, Boolean> supertypesWeak = cache.get(subtypeHandlerWeak);
      if (supertypesWeak == null) {
        supertypesWeak = new HashMap<CacheNodeHandler, Boolean>();
        cache.put(subtypeHandlerWeak, supertypesWeak);
      }
    }
  }

  public Boolean getAnswer(SNode subtype, SNode supertype, boolean isWeak) {
    if (!mySubtypingCached) {
      return null;
    }
    Map<CacheNodeHandler, Map<CacheNodeHandler, Boolean>> cache = isWeak ? myCacheWeak : myCache;
    Map<CacheNodeHandler, Boolean> supertypes = cache.get(new CacheNodeHandler(subtype));
    if (supertypes == null) return null;
    return supertypes.get(new CacheNodeHandler(supertype));
  }

  private Pair<Boolean, SNode> getCoerced(SNode subtype, String conceptFQName, boolean isWeak) {
    if (!myCoersionSimpleCached) {
      return new Pair<Boolean, SNode>(false, null);
    }

    Map<CacheNodeHandler, Map<String, SNode>> cache = isWeak ? myCoerceToConceptsCacheWeak : myCoerceToConceptsCache;
    Map<String, SNode> map = cache.get(new CacheNodeHandler(subtype));
    if (map != null && map.containsKey(conceptFQName)) {
      return new Pair<Boolean, SNode>(true, map.get(conceptFQName));
    } else {
      return new Pair<Boolean, SNode>(false, null);
    }
  }

  private Pair<Boolean, SNode> getCoerced(SNode subtype, Class c, GeneratedMatchingPattern pattern, boolean isWeak) {
    if (!myCoersionPatternCached) {
      return new Pair<Boolean, SNode>(false, null);
    }
    Map<CacheNodeHandler, Map<Class, Pair<SNode, GeneratedMatchingPattern>>> cache
      = isWeak ? myCoerceToPatternsCacheWeak : myCoerceToPatternsCache;
    Map<Class, Pair<SNode, GeneratedMatchingPattern>> map = cache.get(new CacheNodeHandler(subtype));
    if (map != null && map.containsKey(c)) {
      Pair<SNode, GeneratedMatchingPattern> patternPair = map.get(c);
      pattern.fillFieldValuesFrom(patternPair.o2);
      return new Pair<Boolean, SNode>(true, patternPair.o1);
    } else {
      return new Pair<Boolean, SNode>(false, null);
    }
  }

  private void addCacheEntry(SNode subtype, String conceptFQName, SNode result, boolean isWeak) {
    if (!myCoersionSimpleCached) {
      return;
    }
    Map<CacheNodeHandler, Map<String, SNode>> cache = myCoerceToConceptsCache;
    CacheNodeHandler subtypeHandler = new CacheNodeHandler(subtype);
    Map<String, SNode> map = cache.get(subtypeHandler);
    if (map == null) {
      map = new HashMap<String, SNode>();
      cache.put(subtypeHandler, map);
    }
    map.put(conceptFQName, result);

    if (isWeak) {
      cache = myCoerceToConceptsCacheWeak;
      CacheNodeHandler subtypeHandlerWeak = new CacheNodeHandler(subtype);
      Map<String, SNode> mapWeak = cache.get(subtypeHandlerWeak);
      if (mapWeak == null) {
        mapWeak = new HashMap<String, SNode>();
        cache.put(subtypeHandlerWeak, mapWeak);
      }
      mapWeak.put(conceptFQName, result);
    }
  }

  private void addCacheEntry(SNode subtype, Class c, SNode result, GeneratedMatchingPattern pattern, boolean isWeak) {
    if (!myCoersionPatternCached) {
      return;
    }
    Map<CacheNodeHandler, Map<Class, Pair<SNode, GeneratedMatchingPattern>>> cache = myCoerceToPatternsCache;
    CacheNodeHandler subtypeHandler = new CacheNodeHandler(subtype);
    Map<Class, Pair<SNode, GeneratedMatchingPattern>> map = cache.get(subtypeHandler);
    if (map == null) {
      map = new HashMap<Class, Pair<SNode, GeneratedMatchingPattern>>();
      cache.put(subtypeHandler, map);
    }
    map.put(c, new Pair<SNode, GeneratedMatchingPattern>(result, pattern));

    if (isWeak) {
      cache = myCoerceToPatternsCacheWeak;
      CacheNodeHandler subtypeHandlerWeak = new CacheNodeHandler(subtype);
      Map<Class, Pair<SNode, GeneratedMatchingPattern>> mapWeak = cache.get(subtypeHandlerWeak);
      if (mapWeak == null) {
        mapWeak = new HashMap<Class, Pair<SNode, GeneratedMatchingPattern>>();
        cache.put(subtypeHandlerWeak, mapWeak);
      }
      mapWeak.put(c, new Pair<SNode, GeneratedMatchingPattern>(result, pattern));
    }
  }

  public void addCacheEntry(SNode subtype, IMatchingPattern pattern, SNode result, boolean isWeak) {
    if (pattern instanceof ConceptMatchingPattern) {
      addCacheEntry(subtype, ((ConceptMatchingPattern)pattern).getConceptFQName(), result, isWeak);
      return;
    }
    if (pattern instanceof GeneratedMatchingPattern) {
      if (!((GeneratedMatchingPattern)pattern).hasAntiquotations()) {
        addCacheEntry(subtype, pattern.getClass(), result, (GeneratedMatchingPattern) pattern, isWeak);
        return;
      }
    }
  }

  public Pair<Boolean, SNode> getCoerced(SNode subtype, IMatchingPattern pattern, boolean isWeak) {
    if (pattern instanceof ConceptMatchingPattern) {
      return getCoerced(subtype, ((ConceptMatchingPattern)pattern).getConceptFQName(), isWeak);
    }
    if (pattern instanceof GeneratedMatchingPattern) {
      if (!((GeneratedMatchingPattern)pattern).hasAntiquotations()) {
        return getCoerced(subtype, pattern.getClass(), (GeneratedMatchingPattern) pattern, isWeak);
      }
    }
    return new Pair<Boolean, SNode>(false, null);
  }
}
