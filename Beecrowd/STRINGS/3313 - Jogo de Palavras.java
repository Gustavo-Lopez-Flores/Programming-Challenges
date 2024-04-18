import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    Scanner ler = new Scanner(System.in);

    int caso = 1;
    String palavra;

    while (ler.hasNext()) {
      palavra = ler.next();
      if (palavra.equals("*")) {
        break;
      }

      int rotacoes = palavra.length();
      ArrayDeque<Character> rotaciona = new ArrayDeque<>();
      for (char c : palavra.toCharArray()) {
        rotaciona.add(c);
      }

      String maior = palavra, menor = palavra;
      for (int i = 0; i < rotacoes; i++) {
        char primeiro = rotaciona.pollFirst();
        rotaciona.addLast(primeiro);
        String substring = dequeToString(rotaciona);
        if (substring.compareTo(maior) > 0) {
          maior = substring;
        }
        if (substring.compareTo(menor) < 0) {
          menor = substring;
        }
      }

      sb.append(String.format("Caso %d: %s %s%n", caso, menor, maior));
      caso++;
    }

    if(!sb.isEmpty()){
      System.out.print(sb.toString());
    }

    ler.close();
  }
  private static String dequeToString(ArrayDeque<Character> deque) {
    StringBuilder sb = new StringBuilder();
    for (char c : deque) {
      sb.append(c);
    }
    return sb.toString();
  }
}