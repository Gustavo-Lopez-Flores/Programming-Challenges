import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i, x = 0, y = 20, troca;
    int num[] = new int [20];
    for(i=0;i<20;i++){
      num[i] = ler.nextInt();
    }
    for(i=0;i<10;i++){
      troca = num[x];
      num[x] = num[y];
      num[y] = troca;
      x++;
      y--;
    }
    for(i=0;i<20;i++){
      System.out.printf("N[%d] = %d%n",i, num[i]);
    }
    ler.close();
  }
}