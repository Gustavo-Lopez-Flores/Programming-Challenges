import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int TAM = 10;
    String[] f = new String[TAM];
    while (ler.hasNext()) {
      for (int i = 0; i < 10; i++) {
        f[i] = ler.next();
      }
      System.out.println(f[2]);
      System.out.println(f[6]);
      System.out.println(f[8]);
    }
    ler.close();
  }
}  