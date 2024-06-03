import java.io.*;
import java.util.*;

public class matriz {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] mat = new int[m][n];
    
    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        mat[i][j] = sc.nextInt();
      }
    }

    int countOdd = 0, countEven = 0;
    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        if(mat[i][j] % 2 == 0){
          countEven++;
        }else{
          countOdd++;
        }
      }
    }

      System.out.print(String.format("%d%n%d%n", countEven, countOdd));
    sc.close();
  }  
}
