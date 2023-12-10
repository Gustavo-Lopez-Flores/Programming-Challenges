import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int l = ler.nextInt();
    int c = ler.nextInt();
    int[][] mat = new int[l+2][c+2]; 

    for (int i = 1; i <= l; i++) {
      for (int j = 1; j <= c; j++) {
        mat[i][j] = ler.nextInt();
      }
    }

    int x = 0, y = 0;
    for (int i = 1; i <= l; i++) {
    for (int j = 1; j <= c; j++) {
    if (mat[i][j] == 42) {
        if (mat[i-1][j-1] == 7 && mat[i-1][j] == 7 && mat[i-1][j+1] == 7 && 
          mat[i][j-1] == 7 && mat[i][j+1] == 7 && 
          mat[i+1][j-1] == 7 && mat[i+1][j] == 7 && mat[i+1][j+1] == 7) {
          x = i;
          y = j;
          break;
        }
      }
    }
    }
    System.out.println(x + " " + y);
    ler.close();
  }
}
