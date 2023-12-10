import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    double n, base = 2;
    Scanner ler = new Scanner(System.in);
    while(ler.hasNext()) {
      n = ler.nextDouble();
      n = Math.floor((Math.log(n + (Math.log(n) / Math.log(base)))) / Math.log(base));
      System.out.printf("%.0f%n", n);
    }
    ler.close();
  }
}