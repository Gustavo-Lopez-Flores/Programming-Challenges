import java.io.*;
import java.util.*;
import java.math.*;

public class jacaiu {
  public static int coposQuebrados(int[][] bandejas) {
    int totalQuebrados = 0;
    for (int[] bandeja : bandejas) {
      int latas = bandeja[0];
      int copos = bandeja[1];
      if (latas > copos) {
        totalQuebrados += copos;
      }
    }
    return totalQuebrados;
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[][] bandejas = new int[n][2];
    for (int i = 0; i < n; i++) {
      bandejas[i][0] = scanner.nextInt();
      bandejas[i][1] = scanner.nextInt();
    }

    System.out.println(coposQuebrados(bandejas));

    scanner.close();
  }
}