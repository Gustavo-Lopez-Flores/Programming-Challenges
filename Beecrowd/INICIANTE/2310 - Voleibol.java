import java.util.Scanner;

public class Main {
  private static final int MAX = 100;
  static class Jogador {
      int s, s1, b, b1, a, a1;
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Jogador[] j = new Jogador[MAX];
    int i, q, ss = 0, sb = 0, sa = 0, qs = 0, qb = 0, qa = 0;
    double ps, pb, pa;
    String nome;
    String acs = "%.";
    q = ler.nextInt();
    for (i = 0; i < q; i++) {
        nome = ler.next();
        j[i] = new Jogador();
        j[i].s = ler.nextInt();
        j[i].b = ler.nextInt();
        j[i].a = ler.nextInt();
        j[i].s1 = ler.nextInt();
        j[i].b1 = ler.nextInt();
        j[i].a1 = ler.nextInt();
    }
    for (i = 0; i < q; i++) {
        ss += j[i].s;
        sb += j[i].b;
        sa += j[i].a;
        qs += j[i].s1;
        qb += j[i].b1;
        qa += j[i].a1;
    }
    ps = (double) (qs * 100) / ss;
    pb = (double) (qb * 100) / sb;
    pa = (double) (qa * 100) / sa;
    System.out.printf("Pontos de Saque: %.2f %s%n", ps, acs);
    System.out.printf("Pontos de Bloqueio: %.2f %s%n", pb, acs);
    System.out.printf("Pontos de Ataque: %.2f %s%n", pa, acs);
    ler.close();
  }
}
