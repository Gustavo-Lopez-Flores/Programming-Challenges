import java.io.*;
import java.util.*;
import java.util.stream.*;

public class gauss {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int g1, g2, r, n = Integer.parseInt(br.readLine());
    for(int i = 0; i < n; i++){
      String[] arr = br.readLine().split("\\s+");
      g1 = Integer.parseInt(arr[0]);
      g2 = Integer.parseInt(arr[1]);
      r = ((g1 + g2) * (((g2 + 1) - g1))) / 2;
      sb.append(r).append("\n");      
    }

    if(!sb.isEmpty())
      System.out.print(sb.toString());
    
    br.close();
  }  
}
