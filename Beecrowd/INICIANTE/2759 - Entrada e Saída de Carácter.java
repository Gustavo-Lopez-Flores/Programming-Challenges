import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    char a, b, c;
    while (ler.hasNext()) {
      a = ler.next().charAt(0);
      b = ler.next().charAt(0);
      c = ler.next().charAt(0);
      System.out.printf("A = %c, B = %c, C = %c%n",a,b,c);
      System.out.printf("A = %c, B = %c, C = %c%n",b,c,a);
      System.out.printf("A = %c, B = %c, C = %c%n",c,a,b);
    }
    ler.close();
  }
}