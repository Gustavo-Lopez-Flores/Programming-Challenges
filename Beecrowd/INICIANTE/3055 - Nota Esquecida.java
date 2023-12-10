import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int m, a, b;
    a = ler.nextInt();
    m = ler.nextInt();
    b = (m*2)-a;
    System.out.println(b);
    ler.close();
  }
}
