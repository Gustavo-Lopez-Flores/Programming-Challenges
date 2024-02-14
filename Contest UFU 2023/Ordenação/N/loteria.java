import java.io.*;
import java.util.*;
import java.util.stream.*;

public class loteria{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
    int cases = Integer.parseInt(br.readLine());
    List<Integer> list = IntStream.range(0, cases).mapToObj(i -> {
      try{
        return Integer.parseInt(br.readLine());
      }catch(IOException e){
        throw new RuntimeException(e);
      }
    }).collect(Collectors.toList());
    
    Collections.sort(list);
    System.out.println(list.get(list.size()-1) - list.get(0));
  }
}
