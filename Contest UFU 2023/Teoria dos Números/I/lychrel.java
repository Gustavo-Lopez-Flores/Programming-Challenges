import java.io.*;
import java.util.*;
import java.math.*;

public class lychrel {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      BigInteger num = new BigInteger(br.readLine());

      if (isLychrel(num)) {
        System.out.println("1");
      } else {
        System.out.println("0");
      }
    }
  }

  public static boolean isLychrel(BigInteger numero) {
    for (int i = 0; i < 20; i++) {
      String str = numero.toString();
      StringBuilder reverseStr = new StringBuilder(str).reverse();
      BigInteger reverseNumber = new BigInteger(reverseStr.toString());
      BigInteger sum = numero.add(reverseNumber);

      String sumStr = sum.toString();
      StringBuilder reverseSumStr = new StringBuilder(sumStr).reverse();

      if (sumStr.equals(reverseSumStr.toString())) {
        return false;
      }

      numero = sum;
    }
    return true;
  }
}