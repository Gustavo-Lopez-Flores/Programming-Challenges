import java.io.*;
import java.util.*;
import java.math.*;

public class tribonacci{
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      BigInteger first = BigInteger.ONE;
      BigInteger second = BigInteger.ONE;
      BigInteger third = BigInteger.ONE;

      int num = Integer.parseInt(br.readLine().trim());

      if(num == 1 || num == 2 || num == 3){
        System.out.println("1");
        return;
      }

      for (int i = 4; i <= num; i++) {
        BigInteger next = first.add(second).add(third);
        first = second;
        second = third;
        third = next;
      }

      System.out.println(third);
    }
  }
}