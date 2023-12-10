import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n, x, y;
    double icm;
    n = ler.nextInt();
    x = ler.nextInt();
    y = ler.nextInt();
    icm = (double)n/(x+y);
    System.out.printf("%.2f%n",icm); 
    ler.close();
  }
}
