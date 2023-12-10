import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    long a, b, r;
    a = ler.nextLong();
    b = ler.nextLong();
    r = a % b;
    System.out.println(r);
    ler.close();
  }
}
