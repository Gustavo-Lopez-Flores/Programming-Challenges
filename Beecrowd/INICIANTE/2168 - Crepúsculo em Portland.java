import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, j, n, s;
    n = ler.nextInt();
    int mat[][] = new int[n+2][n+2];
    for(i=0;i<n+1;i++){
      for(j=0;j<n+1;j++){
        mat[i][j] = ler.nextInt();
      }
    }
    for(i=1;i<n+1;i++){
      for(j=1;j<n+1;j++){
        s = mat[i-1][j-1] + mat[i-1][j] + mat[i][j-1] + mat[i][j];
        if(s >= 2){
          if(j==n){
            System.out.println("S"); 
          }else{
            System.out.printf("S"); 
          }
        }else{
          if(j==n){
            System.out.println("U"); 
          }else{
            System.out.printf("U"); 
          }
        }
        s = 0;
      }
    }
    ler.close();
  }
}
