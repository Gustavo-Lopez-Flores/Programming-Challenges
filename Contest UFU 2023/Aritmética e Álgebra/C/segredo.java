import java.io.*;
import java.util.*;
import java.util.stream.*;

public class segredo {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int casos = Integer.parseInt(br.readLine());
      StringBuilder sb = new StringBuilder();
      IntStream.range(0, casos).forEach(qIr -> {
        try{
          String bin = br.readLine();
          sb.append(Integer.parseInt(bin,2)).append("\n");
        }catch(IOException e){
          throw new RuntimeException(e);
        }
      });
      System.out.print(sb.toString());
    }
  }
}
