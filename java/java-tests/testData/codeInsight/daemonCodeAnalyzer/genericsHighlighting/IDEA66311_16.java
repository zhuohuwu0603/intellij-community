import java.util.*;

class ErasureTest {
  public static double[] toArrayDouble(List<? extends Number> v) {
    return null;
  }

  public static double[][] toArrayDouble(List<double[]> v) {
    return null;
  }
}

class ErasureTest1 {
  <error descr="'toArrayDouble(List<? extends Number>)' clashes with 'toArrayDouble(List)'; both methods have same erasure">public static double[] toArrayDouble(List<? extends Number> v)</error> {
    return null;
  }

  public static double[][] toArrayDouble(List v) {
    return null;
  }
}

class ErasureTest2 {
  <error descr="'toArrayDouble(List<? extends Number>)' clashes with 'toArrayDouble(List<String>)'; both methods have same erasure">public static double[] toArrayDouble(List<? extends Number> v)</error> {
    return null;
  }

  public static double[] toArrayDouble(List<String> v) {
    return null;
  }
}