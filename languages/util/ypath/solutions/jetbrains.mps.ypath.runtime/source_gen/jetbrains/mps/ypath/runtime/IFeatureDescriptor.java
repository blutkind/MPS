package jetbrains.mps.ypath.runtime;

/*Generated by MPS */

import java.util.Collection;

public interface IFeatureDescriptor<T> {
  @Deprecated
  public Collection<T> getFeature(T t);
  public Iterable<T> getContents(T t);
  public String getName();
  @Deprecated
  public IFeatureDescriptor.Type getType();
  public boolean isDefault();
  public boolean isAscending();
  public String getOpposite();
  public static   enum Type {
    SEQUENCE("sequence"),
    LIST("list");

    private String id;

    Type(String id) {
      this.id = id;
    }

    public String toString() {
      return id;
    }

    public static IFeatureDescriptor.Type fromString(String name) {
      if (IFeatureDescriptor.Type.SEQUENCE.id.equals(name)) {
        return IFeatureDescriptor.Type.SEQUENCE;
      }
      if (IFeatureDescriptor.Type.LIST.id.equals(name)) {
        return IFeatureDescriptor.Type.LIST;
      }
      throw new IllegalArgumentException("No such type");
    }
  }

  public static class Stub<T> implements IFeatureDescriptor<T> {
    public Stub() {
    }

    public Collection<T> getFeature(T t) {
      return null;
    }

    public Iterable<T> getContents(T t) {
      return getFeature(t);
    }

    public String getName() {
      return null;
    }

    public String getOpposite() {
      return null;
    }

    public IFeatureDescriptor.Type getType() {
      return null;
    }

    public boolean isDefault() {
      return false;
    }

    public boolean isAscending() {
      return true;
    }
  }

}
