import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double a = ler.nextDouble();
    double b = ler.nextDouble();
    double media = (((3.5*a)+(7.5*b))/11);
    System.out.printf("MEDIA = %.5f\n", media);
    ler.close();
  }
}