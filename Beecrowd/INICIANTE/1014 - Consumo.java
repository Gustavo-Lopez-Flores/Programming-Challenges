import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int kmsPercorridos = ler.nextInt();
    double totalCombustivelGasto = ler.nextDouble();
    double consumoMedio = kmsPercorridos / totalCombustivelGasto;
    System.out.printf("%.3f km/l\n",consumoMedio);
    ler.close();
  }
}