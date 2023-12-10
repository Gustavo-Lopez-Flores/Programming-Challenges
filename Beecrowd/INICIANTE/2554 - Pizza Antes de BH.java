import java.util.Scanner;

public class Main {
  private static final int MAX = 50;
  private static final int TAM = 12;
  
  static class Pizza {
    String data;
    int[] pessoas;
  
    public Pizza() {
      data = "";
      pessoas = new int[MAX];
    }
  }
  
  public static void main(String[] args) {
    int i, j, n, d, s = 0;
    Pizza[] p = new Pizza[MAX];
  
    Scanner ler = new Scanner(System.in);
    while (ler.hasNextInt()) {
        n = ler.nextInt();
        d = ler.nextInt();
        for (i = 0; i < d; i++) {
          p[i] = new Pizza();
          p[i].data = ler.next();
          for (j = 0; j < n; j++) {
            p[i].pessoas[j] = ler.nextInt();
          }
        }
        for (i = 0; i < d; i++) {
            s = 0;
            for (j = 0; j < n; j++) {
              if (p[i].pessoas[j] == 0) {
                s++;
                break;
              }
            }
            if (s == 0) {
              System.out.println(p[i].data);
              s = -1;
              break;
            }
        }
        if (s != -1) {
          System.out.println("Pizza antes de FdI");
        }
    }
  }
}