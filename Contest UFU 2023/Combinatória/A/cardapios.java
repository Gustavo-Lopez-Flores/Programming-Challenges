import java.io.*;
import java.util.*;

public class cardapios {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int arr[] = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
      long product = arr[0] * arr[1] * arr[2];
      System.out.println(product);
    }
  }  
}