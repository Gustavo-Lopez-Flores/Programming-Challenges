import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 100;
    int i, j, n, m, c, x1 = 0, x2 = 0, y1 = 0, y2 = 0;
    int mat[][] = new int[MAX][MAX];
    while(ler.hasNext()){
      n = ler.nextInt();
      m = ler.nextInt();
      for(i=0;i<n;i++){
        for(j=0;j<m;j++){
          mat[i][j] = ler.nextInt();
        }
      }
      for(i=0;i<n;i++){
        for(j=0;j<m;j++){
          if(mat[i][j] == 2){
            x1 = i;
            y1 = j;
          }else if(mat[i][j] == 1){
            x2 = i;
            y2 = j;
          }
        }
      }
      c = Math.abs(x1-x2) + Math.abs(y1-y2);
      System.out.println(c);    
    }
    ler.close();
  }
}
