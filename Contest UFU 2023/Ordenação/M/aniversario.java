import java.io.*;
import java.util.*;
import java.util.stream.*;

public class aniversario {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int qtd = Integer.parseInt(bf.readLine().trim());
    List<String> list = new ArrayList<>();
    
    IntStream.range(0, qtd).forEach(qItr -> {
      try {
        String linha = bf.readLine();
        list.add(linha);
      } catch (IOException ex) {
          throw new RuntimeException(ex);
      }
    });

    Collections.sort(list);
    list.forEach(System.out::println);
    
    bf.close();
  }
}
