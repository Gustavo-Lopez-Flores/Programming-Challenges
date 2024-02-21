import java.io.*;
import java.util.*;
import java.math.*;

public class volei {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int num = Integer.parseInt(br.readLine());
      long resultado = calcularFormas(num);
      System.out.println(resultado);
    }
  }
  static long calcularFormas(int n){
    long formas = 1L;
    for(int i = 0; i < 3; i++){
      formas *= (n-i);
    }
    return formas;
  }
}