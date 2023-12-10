import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double a, b, c, pi = 3.14159;
    double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
    a = ler.nextDouble();
    b = ler.nextDouble();
    c = ler.nextDouble();
    areaTriangulo = (a * c) / 2;
    areaCirculo = pi * Math.pow(c, 2);
    areaTrapezio = ((a + b)* c) / 2;
    areaQuadrado = Math.pow(b, 2);
    areaRetangulo = a * b;
    System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
    System.out.printf("CIRCULO: %.3f\n", areaCirculo);
    System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
    System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
    System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
    ler.close();
  }
}