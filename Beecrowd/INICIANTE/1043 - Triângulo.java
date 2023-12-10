import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double p, area;
    double a = ler.nextDouble();
    double b = ler.nextDouble();
    double c = ler.nextDouble();
    if((c < (a + b)) && (a < (b + c)) && (b < (a + c))){
    p = a + b + c;
    System.out.printf("Perimetro = %.1f%n", p);
    }else{
    area = ((a + b) * c) / 2.0;
    System.out.printf("Area = %.1f%n", area);
    }
    ler.close();
  }
}