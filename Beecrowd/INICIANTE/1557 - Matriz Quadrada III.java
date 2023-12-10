import java.util.Scanner;

public class Main {
  public static int conta(int num){
    int qntd = 0;
    while(num != 0){
      qntd += 1;
      num /= 10;
    }
    return qntd;
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 15;
    int i, j, t, num;
    int mat[][] = new int[MAX][MAX]; 
    while(true){
      num = ler.nextInt();
      if(num == 0){
        break;
      }
      t = (int) Math.pow(4,num-1);
      t = conta(t);
      for(i = 0; i < num; i++){
        for(j = 0; j < num; j++){
          if(i == 0){
            if(j == 0){
              mat[0][0] = 1;
            }else{
              mat[i][j] = mat[i][j-1] * 2;   
            }
          }else{
            if(j == 0){
              mat[i][j] = mat[i-1][j+1];
            }else{
              mat[i][j] = mat[i][j-1] * 2;   
            }
          }
          if(j != num-1){
            System.out.printf("%" + t + "d ", mat[i][j]);          
          }else{
            System.out.printf("%" + t + "d", mat[i][j]);          
          }
        }
        System.out.println();
      }
      System.out.println();
    }
    ler.close();
  }
}
