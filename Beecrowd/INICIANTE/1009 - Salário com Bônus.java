import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String nomeVendedor = ler.nextLine();
    double salarioFixo = ler.nextDouble();
    double vendasEfetuadas = ler.nextDouble();
    double recebimentoTotal = salarioFixo + (vendasEfetuadas * 0.15);
    System.out.printf("TOTAL = R$ %.2f\n", recebimentoTotal);
    ler.close();
  }
}