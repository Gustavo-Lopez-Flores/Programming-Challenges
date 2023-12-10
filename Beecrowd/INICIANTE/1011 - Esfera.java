import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double raio, volume, pi = 3.14159;
    raio = ler.nextDouble();
    volume = (4.0/3) * pi * Math.pow(raio,3);
    System.out.printf("VOLUME = %.3f\n", volume);
    ler.close();
  }
}