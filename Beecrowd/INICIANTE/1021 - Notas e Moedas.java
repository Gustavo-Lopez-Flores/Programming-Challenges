import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double valorMonetario;
    int valorCedula, valorMoeda,nCem, nCinquenta, nVinte, nDez, nCinco, nDois, nUm, mCinquenta, mVinteCinco, mDez, mCinco, mUm;
    valorMonetario = ler.nextDouble();
    valorCedula = (int)valorMonetario;
    valorMoeda = (int)((valorMonetario - valorCedula) * 100);
    nCem = valorCedula / 100;
    nCinquenta = (valorCedula % 100) / 50;
    nVinte = (((valorCedula % 100) % 50) / 20);
    nDez = (((valorCedula % 100) % 50) % 20) / 10;
    nCinco = ((((valorCedula % 100) % 50) % 20) % 10) / 5;
    nDois = (((((valorCedula % 100) % 50) % 20) % 10) % 5) / 2;
    System.out.printf("NOTAS:\n");
    System.out.printf("%d nota(s) de R$ 100.00\n", nCem);
    System.out.printf("%d nota(s) de R$ 50.00\n", nCinquenta);
    System.out.printf("%d nota(s) de R$ 20.00\n", nVinte);
    System.out.printf("%d nota(s) de R$ 10.00\n", nDez);
    System.out.printf("%d nota(s) de R$ 5.00\n", nCinco);
    System.out.printf("%d nota(s) de R$ 2.00\n", nDois);
    nUm = ((((((valorCedula % 100) % 50) % 20) % 10) % 5) % 2) / 1;
    mCinquenta = (valorMoeda / 50) == 1 ? 1 : 0;
    mVinteCinco = (valorMoeda - (mCinquenta * 50)) / 25 == 1? 1: 0;
    mDez = (valorMoeda - (mCinquenta * 50) - (mVinteCinco * 25)) / 10; 
    mCinco = (valorMoeda - (mCinquenta * 50) - (mVinteCinco * 25) - (mDez * 10)) / 5 == 1 ? 1 : 0;
    mUm = (valorMoeda - (mCinquenta * 50) - (mVinteCinco * 25) - (mDez * 10) - (mCinco * 5)) / 1;
    System.out.printf("MOEDAS:\n");
    System.out.printf("%d moeda(s) de R$ 1.00\n", nUm);
    System.out.printf("%d moeda(s) de R$ 0.50\n", mCinquenta);
    System.out.printf("%d moeda(s) de R$ 0.25\n", mVinteCinco);
    System.out.printf("%d moeda(s) de R$ 0.10\n", mDez);
    System.out.printf("%d moeda(s) de R$ 0.05\n", mCinco);
    System.out.printf("%d moeda(s) de R$ 0.01\n", mUm);
    ler.close();
  }
}