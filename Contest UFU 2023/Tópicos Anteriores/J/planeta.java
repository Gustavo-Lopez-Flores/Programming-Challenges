import java.io.*;
import java.util.*;
import java.util.stream.*;

public class planeta {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();
    String str;
    while((str = br.readLine()) != null){
      if(str.equals("0")){
        break;
      }

      String[] nt = str.split("\\s+");
      int n = Integer.parseInt(nt[0]);
      int t = Integer.parseInt(nt[1]);
      Set<Integer> set = new HashSet<>();
      Stream<Integer> stream = Stream.of(br.readLine().split("\\s+")).map(Integer::parseInt);
      if(stream.anyMatch(num -> !set.add(num))){
        sb.append("1\n");
      }else{
        sb.append("0\n");
      }
    }

    if(sb.length() > 0){
      System.out.print(sb.toString());
    }
    
    br.close();
  }  
}
