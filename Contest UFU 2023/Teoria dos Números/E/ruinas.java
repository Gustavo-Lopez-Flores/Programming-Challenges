import java.io.*;
import java.util.*;
import java.math.*;

public class ruinas {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      StringBuilder sb = new StringBuilder();
      while(true){
        int arr[ ] = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        // 7 3 5
        
        if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
          break;

        sb.append(String.format("%d + %d mod %d = %d\n", arr[0], arr[1], arr[2], (arr[0] + arr[1]) % arr[2]));
        sb.append(String.format("%d - %d mod %d = %d\n", arr[0], arr[1], arr[2], (arr[0] - arr[1]) % arr[2]));
        sb.append(String.format("%d * %d mod %d = %d\n", arr[0], arr[1], arr[2], (arr[0] * arr[1]) % arr[2]));
        // 7 + 3 mod 5 = 0
        // 7 - 3 mod 5 = 4
        // 7 * 3 mod 5 = 1
      }
      System.out.print(sb.toString());
    }
  }
}