import java.util.Scanner;

public class Main {
  static int contarAliteracoes(String linha) {
    int aliteracoes = 0;
    String[] palavras = linha.toLowerCase().split(" ");

    if (palavras.length <= 1) {
      return 0;
    }

    char letraAnterior = palavras[0].charAt(0);
    int qntd = 1;

    for (int i = 1; i < palavras.length; i++) {
      char primeiraLetra = palavras[i].charAt(0);

      if (primeiraLetra == letraAnterior) {
        qntd++;
        if (qntd == 2) {
          aliteracoes++;
        }
      } else {
        letraAnterior = primeiraLetra;
        qntd = 1;
      }
    }

    return aliteracoes;
  }

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while (ler.hasNext()) {
      String linha = ler.nextLine();
      System.out.println(contarAliteracoes(linha));
    }

    ler.close();
  }
}
