import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 1000;
    int i, n, m2 = 0, m3 = 0, m4 = 0, m5 = 0;
    int vet[] = new int[MAX];
    n = ler.nextInt();
    for(i=0;i<n;i++){
      vet[i] = ler.nextInt();
      m2 = vet[i] % 2 == 0 ? m2 + 1: m2 + 0;
      m3 = vet[i] % 3 == 0 ? m3 + 1: m3 + 0;
      m4 = vet[i] % 4 == 0 ? m4 + 1: m4 + 0;
      m5 = vet[i] % 5 == 0 ? m5 + 1: m5 + 0;
    }
    System.out.printf("%d Multiplo(s) de 2%n",m2);
    System.out.printf("%d Multiplo(s) de 3%n",m3);
    System.out.printf("%d Multiplo(s) de 4%n",m4);
    System.out.printf("%d Multiplo(s) de 5%n",m5);
    ler.close();
  }
}
