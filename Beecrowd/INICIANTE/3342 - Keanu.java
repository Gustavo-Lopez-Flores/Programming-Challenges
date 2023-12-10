import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n, b, p;
    n = ler.nextInt();
    p = ((n*n)/2);
    b = p + ((n*n)%2);
    System.out.printf("%d casas brancas e %d casas pretas%n",b,p);
    ler.close();
  }
}
