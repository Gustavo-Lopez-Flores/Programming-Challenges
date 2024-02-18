import java.io.*;
import java.util.*;
import java.math.*;

public class bilhar{
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int num = Integer.parseInt(br.readLine().trim());
      
      int sum = 0;
      for(int i = 1; i <= num; i++){
        sum += i;
      }
      
      System.out.println(sum);
    }
  }
}