import java.io.*;
import java.util.*;
import java.math.*;

public class cientista {
  public static String solucaoSistemas(int a1, int b1, int r1, int a2, int b2, int r2) {
    if (a1 * b2 == a2 * b1) {
      return "sistema indeterminado";
    }

    double y = ((double) r2 - (a2 * r1) / a1) / (b2 - ((double) a2 * b1) / a1);
    double x = (r1 - b1 * y) / a1;

    return String.format("%.2f %.2f", x, y);
  }

  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int[] sUm = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
      int[] sDois = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
      String resultado = solucaoSistemas(sUm[0], sUm[1], sUm[2], sDois[0], sDois[1], sDois[2]);
      System.out.println(resultado);
    }
  }
}
