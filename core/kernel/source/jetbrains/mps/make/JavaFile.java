package jetbrains.mps.make;

import jetbrains.mps.vfs.IFile;
import jetbrains.mps.util.FileUtil;

import java.io.IOException;

public class JavaFile {
  private IFile myFile;
  private String myClassName;

  JavaFile(IFile file, String className) {
    myFile = file;
    myClassName = className;
  }

  IFile getFile() {
    return myFile;
  }

  String getClassName() {
    return myClassName;
  }

  String getContents() {
    try {
      return FileUtil.read(myFile.openReader());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public String toString() {
    return "JavaFile " + myClassName + " at " + myFile;
  }
}
