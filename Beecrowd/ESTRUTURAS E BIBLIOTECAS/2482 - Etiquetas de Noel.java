import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int numFelizNatal = ler.nextInt();
    ler.nextLine();
    Map<String, String> mapa = new HashMap<>();
    for(int i = 0; i < numFelizNatal; i++){
      String lingua = ler.nextLine();
      String felicitacao = ler.nextLine();
      mapa.put(lingua, felicitacao);
    }

    int numPresenteados = ler.nextInt();
    ler.nextLine();
    StringBuilder resultado = new StringBuilder();
    for(int i = 0; i < numPresenteados; i++){
      String nome = ler.nextLine();
      String lingua = ler.nextLine();
      resultado.append(String.format("%s%n%s%n%n", nome, mapa.get(lingua)));
    }

    System.out.print(resultado.toString());
    ler.close();
  }
}