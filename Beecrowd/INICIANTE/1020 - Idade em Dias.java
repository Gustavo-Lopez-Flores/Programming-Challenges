import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int anos, meses, dias, idadeEmDias;
    idadeEmDias = ler.nextInt();
    anos = idadeEmDias / 365;
    meses = (idadeEmDias % 365) / 30;
    dias = (idadeEmDias % 365) % 30;
    System.out.printf("%d ano(s)\n", anos);
    System.out.printf("%d mes(es)\n",meses);
    System.out.printf("%d dia(s)\n",dias);
    ler.close();
  }
}