import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double a = ler.nextDouble();
    double b = ler.nextDouble();
    double c = ler.nextDouble();
    double media = (((2*a)+(3*b)+(5*c))/10);
    System.out.printf("MEDIA = %.1f\n", media);
    ler.close();
  }
}