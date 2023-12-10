import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    long num = ler.nextLong();
    double min = num / Math.log(num);
    double max = 1.25506 * min;
    System.out.printf("%.1f %.1f%n", min, max);
    ler.close();
  }
}