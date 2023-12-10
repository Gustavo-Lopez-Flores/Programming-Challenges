import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int l, c, p1, p2;
    l = ler.nextInt();
    c = ler.nextInt();
    p1 = (l+l-1)*(c-1)+l;
    p2 = ((l-1)*2) + ((c-1)*2);
    System.out.printf("%d%n%d%n",p1,p2);
    ler.close();
  }
}
