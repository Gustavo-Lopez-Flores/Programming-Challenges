import java.io.*;
import java.util.*;
import java.math.*;

public class grilo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int casos = scanner.nextInt();
    int arr[] = new int[casos];
    for(int i = 0; i < casos; i++)
      arr[i] = scanner.nextInt();

    System.out.println(mmc(arr));
    
    scanner.close();
  }

  public static int mmc(int a, int b) {
      return a * (b / mdc(a, b));
  }

  public static int mdc(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  public static int mmc(int[] numeros) {
      int resultado = numeros[0];
      for (int i = 1; i < numeros.length; i++) {
        resultado = mmc(resultado, numeros[i]);
      }
      return resultado;
  }
}