import java.io.*;
import java.util.*;
import java.util.stream.*;

public class historia {
  public static int historia(int a, int p){
    List<Integer> aliados = new ArrayList<>();
    for(int i = 1; i <= a; i++){
      aliados.add(i);
    }

    int index = 0;

    while(aliados.size() > 1){
      index = (index + p - 1) % aliados.size();
      aliados.remove(index);
    }
    
    return aliados.get(0);
  }
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String linha;
      while((linha = br.readLine()) != null){
        int[] dados = Stream.of(linha.split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        System.out.println(historia(dados[0], dados[1]));
      }      
    }
  }
}
