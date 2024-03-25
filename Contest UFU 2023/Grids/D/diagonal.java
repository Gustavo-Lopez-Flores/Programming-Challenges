import java.io.*;
import java.util.*;
import java.math.*;

public class diagonal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int mat[][] = new int[n][n];
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        mat[i][j] = scanner.nextInt();
      }
    }

    int somaDiagonalPrincipal = 0;
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if(i == j){
          somaDiagonalPrincipal += mat[i][j];
        }
      }
    }

    int somaDiagonalSecundaria = 0;
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if(i + j == n - 1){
          somaDiagonalSecundaria += mat[i][j];
        }
      }
    }

    System.out.println(Math.abs(somaDiagonalPrincipal - somaDiagonalSecundaria));
    scanner.close();
  }
}