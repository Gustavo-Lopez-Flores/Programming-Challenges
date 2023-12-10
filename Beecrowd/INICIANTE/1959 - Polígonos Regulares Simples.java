import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int l;
    long n, p;
    n = ler.nextLong();
    l = ler.nextInt();
    if ((n >= 3 && n <= 1000000) && (l >= 1 && l <= 4000)) {
        p = (n * l);
        System.out.println(p);
    }
    ler.close();
  }
}
