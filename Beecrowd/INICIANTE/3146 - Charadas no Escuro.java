import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double r, c, pi = 3.14;
    r = ler.nextDouble();
    c = (double)2*pi*r;
    System.out.printf("%.2f%n",c);
    ler.close();
  }
}