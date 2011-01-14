package jetbrains.mps.samples.matrixLanguage.sandbox;

/*Generated by MPS */

import jetbrains.mps.samples.matrixLanguage.runtime.Matrix;
import jetbrains.mps.samples.matrixLanguage.runtime.MatrixIterator;

public class ABC {
  public void abc() {
    int tmp = 10;
    double a = 1;
    Matrix<Double> abc = new Matrix<Double>(new Double[][]{{Double.valueOf(tmp) ,Double.valueOf(20)}, {Double.valueOf(233330) ,Double.valueOf(this.foo() * 2)}, {Double.valueOf(2) ,Double.valueOf(a) ,Double.valueOf(12)}}, new _FieldOperations.DoubleOperations());
    abc = abc.transpose();
    abc = abc.mult(abc.transpose());
    abc = abc.mult(new Double(10.0));
    Double sum = 0.0;
    for (MatrixIterator<Double> it1210246394575 = new MatrixIterator<Double>(abc); it1210246394575.hasNext();) {
      int i1 = it1210246394575.getRow();
      int j1 = it1210246394575.getColumnl();
      Double element1 = it1210246394575.getNext();
      for (MatrixIterator<Double> it1210250556671 = new MatrixIterator<Double>(abc); it1210250556671.hasNext();) {
        int i2 = it1210250556671.getRow();
        int j2 = it1210250556671.getColumnl();
        Double element2 = it1210250556671.getNext();
        sum = sum + (double) i2 + element2;
      }
    }
    abc.determinant();
  }

  public int foo() {
    return 1;
  }
}
