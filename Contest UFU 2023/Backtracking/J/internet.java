import java.io.*;
import java.util.*;
import java.math.*;

public class internet {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int cases = Integer.parseInt(br.readLine());
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < cases; i++){
        String linha = br.readLine();
        sb.append(Integer.parseInt(linha.substring(0,8), 2));
        sb.append(".");
        sb.append(Integer.parseInt(linha.substring(8,16), 2));
        sb.append(".");
        sb.append(Integer.parseInt(linha.substring(16,24), 2));
        sb.append(".");
        sb.append(Integer.parseInt(linha.substring(24,32), 2));
        sb.append("\n");
      }
      System.out.print(sb.toString());
    }
  }
}