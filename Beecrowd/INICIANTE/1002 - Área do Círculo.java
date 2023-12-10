import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double n = 3.14159;
    double raio = ler.nextDouble();
    double area = n * Math.pow(raio,2);
    System.out.printf("A=%.4f\n", area);
    ler.close();
  }
}