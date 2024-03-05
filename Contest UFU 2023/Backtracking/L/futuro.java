import java.io.*;
import java.util.*;
import java.math.*;

public class futuro {
  public static void main(String[] args) throws IOException{
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
      int arr[] = Arrays.stream(br.readLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      Map<Integer, Integer> idades = new TreeMap<>();
      for(int num : arr)
        idades.put(num, idades.getOrDefault(num, 0) + 1);

      StringBuilder sb = new StringBuilder();
      for(Map.Entry<Integer, Integer> entry : idades.entrySet())
        sb.append(String.format("%d %d\n", entry.getKey(), entry.getValue()));
    
      if(!sb.isEmpty())
        System.out.print(sb.toString());
    }
  }
}