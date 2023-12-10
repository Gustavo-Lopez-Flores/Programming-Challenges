import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int numFuncionario = ler.nextInt();
    int numHorasTrabalhadas = ler.nextInt();     
    double valorRecebidoPorHora = ler.nextDouble();
    double salarioFuncionario = numHorasTrabalhadas * valorRecebidoPorHora;
    System.out.printf("NUMBER = %d\n", numFuncionario);
    System.out.printf("SALARY = U$ %.2f\n", salarioFuncionario);
    ler.close();
  }
}