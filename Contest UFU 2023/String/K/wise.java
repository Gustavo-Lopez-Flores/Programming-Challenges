import java.util.Scanner;

public class wise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String linha = sc.nextLine();
    String[] palavras = linha.split(" ");
    int letras = 0;

    for(String palavra : palavras){
      letras += palavra.length();
    }
    
    System.out.printf("%d%n%d%n", palavras.length, letras);

    sc.close();
  }
}
