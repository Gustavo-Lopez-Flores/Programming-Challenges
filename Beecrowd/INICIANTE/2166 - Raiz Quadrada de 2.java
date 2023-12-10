import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n = ler.nextInt();
    double r = 1 + rec(n);
    System.out.printf("%.10f%n", r);
    ler.close();
  }
  public static double rec(int n) {
    if (n == 0) {
        return 0.0;
    } else {
        return 1 / (2 + rec(n - 1));
    }
  }
}
