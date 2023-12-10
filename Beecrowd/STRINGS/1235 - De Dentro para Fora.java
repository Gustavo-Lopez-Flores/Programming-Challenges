import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String cifra;
    int tam, n = ler.nextInt();
    ler.nextLine();
    for (int i = 0; i < n; i++) {
      StringBuilder temp = new StringBuilder();
      StringBuilder palavraDecifrada = new StringBuilder();
      cifra = ler.nextLine();
      tam = cifra.length();
      temp.append(cifra.substring(0,tam/2));
      palavraDecifrada.append(temp.reverse());
      temp.setLength(0);
      temp.append(cifra.substring(tam/2,tam));
      palavraDecifrada.append(temp.reverse());
      System.out.println(palavraDecifrada);
    }
    
    ler.close();
  }
}