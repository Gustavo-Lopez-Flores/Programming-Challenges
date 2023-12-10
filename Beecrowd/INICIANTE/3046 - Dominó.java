import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    long n, qtd;
    n = ler.nextLong();
    qtd = ((n+1)*(n+2))/2;
    System.out.println(qtd);
    ler.close();
  }
}
