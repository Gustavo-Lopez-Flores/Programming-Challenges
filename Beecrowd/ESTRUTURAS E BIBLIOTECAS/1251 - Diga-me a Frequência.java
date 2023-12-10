import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    boolean pulaLinha = false;

    while (ler.hasNext()) {
      StringBuilder novaLinha = new StringBuilder();
      novaLinha.append("");

      if (pulaLinha) {
        novaLinha.append("\n");
      }

      Map<Character, Integer> caracteres = new HashMap<>();
      String linha = ler.nextLine(); // Use nextLine() para ler a linha completa

      for (char chave : linha.toCharArray()) {
        if (caracteres.containsKey(chave)) {
          caracteres.put(chave, caracteres.get(chave) + 1);
        } else {
          caracteres.put(chave, 1);
        }
      }

      List<Map.Entry<Character, Integer>> list = new ArrayList<>(caracteres.entrySet());

      list.sort((a, b) -> {
        if (a.getValue().equals(b.getValue())) {
          return Character.compare(b.getKey(), a.getKey()); // Ordena por valor ASCII decrescente
        }
        return a.getValue().compareTo(b.getValue()); // Ordena por frequência crescente
      });

      for (Map.Entry<Character, Integer> entry : list) {
        int num = (int) entry.getKey();
        novaLinha.append(num + " " + entry.getValue() + "\n");
      }

      System.out.print(novaLinha.toString());

      pulaLinha = true;
    }

    ler.close();
  }
}
