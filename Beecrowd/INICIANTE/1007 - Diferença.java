import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int a = ler.nextInt();
    int b = ler.nextInt();
    int c = ler.nextInt();
    int d = ler.nextInt();
    int diferenca = (a*b) - (c*d);
    System.out.printf("DIFERENCA = %d\n", diferenca);
    ler.close();
  }
}