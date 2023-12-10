import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int n, aux;
    String p, l;
    Scanner ler = new Scanner(System.in);
    while (ler.hasNext()) {
      p = ler.next();
      n = ler.nextInt();
      l = "";
      for (int i = 0; i < n; i++) {
          aux = ler.nextInt();
          l += p.charAt(aux - 1);
      }
      System.out.println(l);
    }
    ler.close();
  }
}