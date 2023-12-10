import java.util.Scanner;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    double a = ler.nextDouble();
    double b = ler.nextDouble();
    double resultado = (double)((((1.0 + a/100.00) * (1.0 + b/100.00)) - 1.0) * 100.0);
    System.out.printf("%.6f%n", resultado);

    ler.close();
  }
}