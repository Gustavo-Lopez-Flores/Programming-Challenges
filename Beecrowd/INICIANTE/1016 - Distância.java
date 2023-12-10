import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int km = ler.nextInt();
    int minutos = km * 60 / 30;
    System.out.printf("%d minutos\n", minutos);
    ler.close();
  }
}