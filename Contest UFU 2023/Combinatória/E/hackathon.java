import java.io.*;
import java.util.*;
import java.math.*;

public class hackathon {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      StringBuilder sb = new StringBuilder();
      while(true){
        int arr[] = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        if(arr[0] == 0 && arr[1] == 0)
          break;
        sb.append(fat(arr[0]).divide(fat(arr[0]-arr[1]).multiply(fat(arr[1])))).append("\n");
      }
      if(!sb.isEmpty())
        System.out.print(sb.toString());
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