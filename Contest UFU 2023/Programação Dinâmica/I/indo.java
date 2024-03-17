import java.io.*;
import java.util.*;
import java.math.*;

public class indo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int q = scanner.nextInt();
    int v = scanner.nextInt();

    int[] moedas = new int[q];
    for (int i = 0; i < q; i++) {
      moedas[i] = scanner.nextInt();
    }

    boolean[] ehPossivel = new boolean[v + 1];
    ehPossivel[0] = true;

    for (int i = 0; i < q; i++) {
      int moeda = moedas[i];
      for (int j = v; j >= moeda; j--) {
        ehPossivel[j] |= ehPossivel[j - moeda];
      }
    }

    if (ehPossivel[v]) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}