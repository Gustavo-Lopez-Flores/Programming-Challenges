import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int q, h, m, n;
    String a;
    q = ler.nextInt();
    for (int i = 0; i < q; i++) {
      h = ler.nextInt();
      m = ler.nextInt();
      n = ler.nextInt();
      if (n == 1) {
          a = "A porta abriu";
      } else {
          a = "A porta fechou";
      }
      if (h < 10 && m < 10) {
          System.out.printf("0%d:0%d - %s!%n", h, m, a);
      } else if (h < 10) {
          System.out.printf("0%d:%d - %s!%n", h, m, a);
      } else if (m < 10) {
          System.out.printf("%d:0%d - %s!%n", h, m, a);
      } else {
          System.out.printf("%d:%d - %s!%n", h, m, a);
      }
    }
    ler.close();
  }
}