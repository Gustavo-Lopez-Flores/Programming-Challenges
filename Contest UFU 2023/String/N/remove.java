import java.util.Scanner;

public class remove {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String palavra = sc.nextLine();
    StringBuilder resultado = new StringBuilder();
    resultado.append("");

    if (palavra.length() > 0) {
      resultado.append(palavra.charAt(0));

      for (int i = 1; i < palavra.length(); i++) {
        if (palavra.charAt(i) != palavra.charAt(i - 1)) {
          resultado.append(palavra.charAt(i));
        }
      }

      System.out.println(resultado);
    } else {
      System.out.println("");
    }

    sc.close();
  }
}
