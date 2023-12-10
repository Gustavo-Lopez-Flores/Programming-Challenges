import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n, x;
    double f;
    n = ler.nextInt();
    x = ler.nextInt();
    f = (double)x/(n+2);
    System.out.printf("%.2f%n",f);
    ler.close();
  }
}