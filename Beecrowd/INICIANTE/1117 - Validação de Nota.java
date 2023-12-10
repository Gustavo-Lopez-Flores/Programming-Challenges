import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i = 1, j = 0;
    double test, sum = 0;
    while(i == 1){
      test = ler.nextDouble();
      if(test >= 0 && test <= 10){
      sum += test;
      j++;
        if(j == 2){
          System.out.printf("media = %.2f%n", sum/2);
          break;
        }
      }else{
        System.out.println("nota invalida");  
      }
    }
    ler.close();
  }
}