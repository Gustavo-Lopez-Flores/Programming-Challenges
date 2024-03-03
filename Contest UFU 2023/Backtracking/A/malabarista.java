import java.io.*;
import java.util.*;
import java.math.*;

public class malabarista {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int arr[] = new int[3];
      arr[0] = Integer.parseInt(br.readLine());
      arr[1] = Integer.parseInt(br.readLine());
      arr[2] = Integer.parseInt(br.readLine());
      System.out.print(calcularMMC(arr));
    }
  }
  public static int calcularMMC(int a, int b) {
    return a * (b / calcularMDC(a, b));
  }
  public static int calcularMDC(int a, int b) {
      while (b != 0) {
          int temp = b;
          b = a % b;
          a = temp;
      }
      return a;
  }
  public static int calcularMMC(int[] arr) {
      int resultadoMMC = arr[0];
      for (int i = 1; i < arr.length; i++) {
        resultadoMMC = calcularMMC(resultadoMMC, arr[i]);
      }
      return resultadoMMC;
  }
}