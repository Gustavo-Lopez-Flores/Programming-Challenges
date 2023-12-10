import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i;
    double x[] = new double[100];
    for(i=0;i<100;i++){
      x[i] = ler.nextDouble();
    }
    for(i=0;i<100;i++){
      if(x[i]<=10){
        System.out.printf("A[%d] = %.1f%n", i, x[i]);  
      }
    }
    ler.close();
  }
}