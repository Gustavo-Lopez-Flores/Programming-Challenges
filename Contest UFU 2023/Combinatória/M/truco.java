import java.io.*;
import java.util.*;
import java.math.*;

public class truco {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int num = Integer.parseInt(br.readLine());
      BigInteger resultado = fat(num).divide(fat(num-2).multiply(BigInteger.TWO));
      System.out.println(resultado);
    }
  }
  static BigInteger fat(int n){
    BigInteger fat = BigInteger.ONE;
    for(int i = 1; i <= n; i++){
      fat = fat.multiply(BigInteger.valueOf(i));
    }
    return fat;
  }
}