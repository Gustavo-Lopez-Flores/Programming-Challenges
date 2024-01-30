import java.io.*;
import java.util.*;
import java.util.stream.*;  

public class tamanho {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int qtd = Integer.parseInt(bf.readLine().trim());
    List<String> list = IntStream.range(0, qtd).mapToObj(i -> {
      try{
        return bf.readLine().replaceAll("\\s+$", "");  
      }catch(IOException e){
        throw new RuntimeException(e);
      }
    })
      .map(String::trim)
      .collect(Collectors.toList());

    Collections.sort(list, (primeira, segunda) -> {
      if(primeira.length() == segunda.length()) 
        return primeira.compareTo(segunda);
      else
        return Integer.compare(primeira.length(), segunda.length());
    });

    list.forEach(System.out::println);
    
    bf.close();
  }
}