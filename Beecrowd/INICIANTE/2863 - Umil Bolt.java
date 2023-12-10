import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static int compara(double a, double b) {
    if (a == b) {
        return 0;
    } else if (a < b) {
        return -1;
    } else {
        return 1;
    }
  }
  public static void main(String[] args) {
    final int MAX = 100;
    Scanner ler = new Scanner(System.in);
    double[] v = new double[MAX];
    while (ler.hasNextInt()) {
        int n = ler.nextInt();
        for (int i = 0; i < n; i++) {
            v[i] = ler.nextDouble();
        }
        Arrays.sort(v, 0, n);
        System.out.printf("%.2f%n", v[0]);
    }
    ler.close();
  }
}