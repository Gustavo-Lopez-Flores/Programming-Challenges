import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i;
    int x[] = new int[10];
    for(i=0; i<10; i++){
      x[i] = ler.nextInt();
    }
    for(i=0;i<10;i++){
      if(x[i] <= 0){
        x[i] = 1;
      }
      System.out.printf("X[%d] = %d%n", i, x[i]);
    }
    ler.close();
  }
}