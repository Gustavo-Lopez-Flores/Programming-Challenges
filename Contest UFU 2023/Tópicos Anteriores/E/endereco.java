import java.io.*;
import java.util.*;
import java.util.stream.*;

public class endereco {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    String bin[] = new String[n];

    for(int i = 0; i < n; i++){
      bin[i] = br.readLine();
    }

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < n; i++){
      sb.append(Integer.parseInt(bin[i].substring(0,8), 2)).append(".");
      sb.append(Integer.parseInt(bin[i].substring(8,16), 2)).append(".");
      sb.append(Integer.parseInt(bin[i].substring(16,24), 2)).append(".");
      sb.append(Integer.parseInt(bin[i].substring(24,32), 2)).append("\n");
    }

    System.out.print(sb.toString());

    
    br.close();
  }  
}