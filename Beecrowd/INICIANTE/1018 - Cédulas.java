import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int valorMonetario, nCem, nCinquenta, nVinte, nDez, nCinco, nDois, nUm;
    double vCem, vCinquenta, vVinte, vDez, vCinco, vDois, vUm;
    valorMonetario = ler.nextInt();
    vCem = (valorMonetario / 100) * 100.00;
    nCem = (int)vCem / 100;
    vCinquenta = ((valorMonetario % 100) / 50) * 50.00;
    nCinquenta = (valorMonetario % 100) / 50;
    vVinte = (((valorMonetario % 100) % 50) / 20) * 20.00;
    nVinte = (((valorMonetario % 100) % 50) / 20);
    vDez = ((((valorMonetario % 100) % 50) % 20) / 10) * 10.00;
    nDez = (((valorMonetario % 100) % 50) % 20) / 10;
    vCinco = (((((valorMonetario % 100) % 50) % 20) % 10) / 5) * 5.00;
    nCinco = ((((valorMonetario % 100) % 50) % 20) % 10) / 5;
    vDois = ((((((valorMonetario % 100) % 50) % 20) % 10) % 5) / 2) * 2.00;
    nDois = (((((valorMonetario % 100) % 50) % 20) % 10) % 5) / 2;
    vUm = (((((((valorMonetario % 100) % 50) % 20) % 10) % 5) % 2) / 1) * 1.00;
    nUm = ((((((valorMonetario % 100) % 50) % 20) % 10) % 5) % 2) / 1;
    System.out.printf("%d\n",valorMonetario);
    System.out.printf("%d nota(s) de R$ 100,00\n", nCem);
    System.out.printf("%d nota(s) de R$ 50,00\n", nCinquenta);
    System.out.printf("%d nota(s) de R$ 20,00\n", nVinte);
    System.out.printf("%d nota(s) de R$ 10,00\n", nDez);
    System.out.printf("%d nota(s) de R$ 5,00\n", nCinco);
    System.out.printf("%d nota(s) de R$ 2,00\n", nDois);
    System.out.printf("%d nota(s) de R$ 1,00\n", nUm);
    ler.close();
  }
}