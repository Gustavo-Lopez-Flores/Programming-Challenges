import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int h, p;
    double x;
    h = ler.nextInt();
    p = ler.nextInt();
    x = (double)h/p;
    System.out.printf("%.2lf%n", x);
    ler.close();
  }
}
