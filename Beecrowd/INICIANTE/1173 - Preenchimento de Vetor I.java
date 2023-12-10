import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i, ant;
    int x[] = new int[10];
    x[0] = ler.nextInt();
    ant = x[0];
    for(i=1;i<10;i++){
      x[i] = ant * 2;
      ant = x[i];
    }
    for(i=0;i<10;i++){
      System.out.printf("N[%d] = %d%n", i, x[i]);
    }
    ler.close();
  }
}