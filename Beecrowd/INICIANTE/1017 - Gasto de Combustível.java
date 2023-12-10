import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int tempoGastoNaViagem = ler.nextInt();
    int velocidadeMediaDaViagem = ler.nextInt();
    double quantidadeLitrosNecessariosPraViagem = (tempoGastoNaViagem * velocidadeMediaDaViagem) / 12.0; 
    System.out.printf("%.3f\n", quantidadeLitrosNecessariosPraViagem);
    ler.close();
  }
}