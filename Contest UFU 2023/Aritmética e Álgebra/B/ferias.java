import java.io.*;
import java.util.*;

public class ferias{
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int n = Integer.parseInt(br.readLine());
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < n; i++){
        int arr[] = Arrays.stream(br.readLine()
                          .split("\\s+"))
                          .mapToInt(Integer::parseInt)
                          .toArray();
        
        int amount = 1;
        int value = arr[1];
        int sum = value;
        
        while(sum < arr[0]){
          value+=arr[2];
          sum+=value;
          amount+=1;
        }
        
        sb.append(amount).append("\n");
      }
      if(!sb.isEmpty()){
        System.out.print(sb.toString());
      }
    } catch (IOException | NumberFormatException e) {
      e.printStackTrace();
    }
  }
}  