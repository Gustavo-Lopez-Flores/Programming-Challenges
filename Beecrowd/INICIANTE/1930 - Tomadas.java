import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int a, b, c, d;
    a = ler.nextInt();
    b = ler.nextInt();
    c = ler.nextInt();
    d = ler.nextInt();
    a = a + (b-1) + (c-1) + (d-1);
    System.out.println(a);   
    ler.close();
  }
}