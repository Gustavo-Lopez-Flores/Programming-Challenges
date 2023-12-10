import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i = 0, n;
    String p;
    float tempo;
    n = ler.nextInt();
    while (i < n) {
      p = ler.next();
      tempo = (float) (p.length() * 0.01);
      System.out.printf("%.2f%n", tempo);
      i++;
    }
    ler.close();
  }
}