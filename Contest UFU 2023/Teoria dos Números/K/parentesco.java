import java.io.*;
import java.util.*;
import java.math.*;

public class parentesco {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int num = Integer.parseInt(br.readLine());
      System.out.println(quantidadeCoprimos(num));
    }
  }

  public static int quantidadeCoprimos(int fim) {
    int count = 0;

    for (int numero = 1; numero < fim; numero++) {
      if(euclides(numero, fim) == 1)
        count++;
    }
    
    return count;
  }
  public static int euclides(int a, int b) {
      while (b != 0) {
          int temp = b;
          b = a % b;
          a = temp;
      }
      return a;
  }
}