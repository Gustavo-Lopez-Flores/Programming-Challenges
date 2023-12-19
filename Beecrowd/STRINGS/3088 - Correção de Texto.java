import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while (ler.hasNextLine()) {
      String linha = ler.nextLine();
      linha = linha.replaceAll("\\s{1}(,|\\.)", "$1");
      System.out.println(linha);
    }

    ler.close();
  }
}
