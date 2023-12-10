import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final int MAX = 100;
    int i, j, num;
    int[][] mat = new int[MAX][MAX];
    while (true) {
      num = input.nextInt();
      if (num == 0) {
        break;
      }
      for (i = 0; i < num; i++) {
        for (j = 0; j < num; j++) {
          if (j >= i && (j + i) <= num - 1) {
            mat[i][j] = i + 1;
            mat[j][i] = mat[i][j];
            mat[Math.abs((num - 1) - i)][j] = mat[i][j];
            mat[j][Math.abs((num - 1) - i)] = mat[i][j];
          }
          if (j != num - 1) {
            System.out.printf("%3d ", mat[i][j]);
          } else {
            System.out.printf("%3d", mat[i][j]);
          }
        }
        System.out.println();
      }
      System.out.println();
    }
    input.close();
  }
}
