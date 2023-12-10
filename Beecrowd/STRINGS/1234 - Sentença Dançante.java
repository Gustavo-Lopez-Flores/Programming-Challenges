import java.util.Scanner;

public class Main {
  static void sentencaDancante(String linha) {
    int letras = 0, tamLinha = linha.length();
    StringBuilder novaLinha = new StringBuilder();

    for (int i = 0; i < tamLinha; i++) {
      char letra = linha.charAt(i);
      if (Character.isLetter(letra)) {
        if (letras % 2 == 0) {
          letra = Character.toUpperCase(letra);
        } else {
          letra = Character.toLowerCase(letra);
        }
        novaLinha.append(letra);
        letras++;
      } else {
        novaLinha.append(" ");
      }
    }

    System.out.println(novaLinha);
  }

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while (ler.hasNext()) {
      String linha = ler.nextLine();
      sentencaDancante(linha);
    }

    ler.close();
  }
}
