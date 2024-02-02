import java.io.*;
import java.util.*;
import java.util.stream.*;

public class naipe {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      
      Map<Integer, String> cartas = new HashMap<>();
      for (int i = 1; i <= 10; i++) {
          cartas.put(i, String.valueOf(i));
      }
      cartas.put(11, "Valete");
      cartas.put(12, "Dama");
      cartas.put(13, "Rei");
      cartas.put(1, "Às");

      Map<Integer, String> naipes= new HashMap<>();
      naipes.put(0, "Paus");
      naipes.put(1, "Ouro");
      naipes.put(2, "Coração");
      naipes.put(3, "Espada");
      
      int[] dados = Arrays.stream(br.readLine().split("\\s+"))
                          .mapToInt(Integer::parseInt)
                          .toArray();

      System.out.println(String.format("%s de %s", cartas.get(dados[1]), naipes.get(dados[0])));
    }
  }
}
