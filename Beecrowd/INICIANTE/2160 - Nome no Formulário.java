import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String l = ler.nextLine();
    if (l.length() > 80) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }
    ler.close();
  }
}