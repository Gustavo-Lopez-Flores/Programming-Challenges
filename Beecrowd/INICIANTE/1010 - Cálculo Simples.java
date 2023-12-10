import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] codigoPeca = new int[2];
    int[] numeroPeca = new int[2];
    double[] valorPeca = new double[2];
    double valorTotal = 0;
    for(int i = 0; i < 2; i++){
      codigoPeca[i] = ler.nextInt();
      numeroPeca[i] = ler.nextInt();
      valorPeca[i] = ler.nextDouble();
      valorTotal += (valorPeca[i]*numeroPeca[i]); 
    }
    System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    ler.close();
  }
}