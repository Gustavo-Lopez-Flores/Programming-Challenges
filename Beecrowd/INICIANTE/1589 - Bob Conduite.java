import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    long i, r1, r2, raio, num;
    Scanner ler = new Scanner(System.in);
    num = ler.nextInt();
    for (i = 0; i < num; i++) {
      r1 = ler.nextInt();
      r2 = ler.nextInt();
      raio = (int) (((2 * r1) + (2 * r2)) / 2);
      System.out.println(raio);
    }
    ler.close();
  }
}
