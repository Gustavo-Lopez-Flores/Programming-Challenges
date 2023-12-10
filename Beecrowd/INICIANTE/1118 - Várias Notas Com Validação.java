import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int i = 1, j = 0, answer;
    double test, sum = 0;
    while(i == 1){
      test = ler.nextDouble();
      if(test >= 0 && test <= 10){
      sum += test;
      j++;
      
        if(j == 2){
          System.out.printf("media = %.2f%n", sum/2);
          System.out.println("novo calculo (1-sim 2-nao)");
          answer = ler.nextInt();
          while(answer < 1 || answer > 2){
            System.out.println("novo calculo (1-sim 2-nao)");
            answer = ler.nextInt();          
          }
          if(answer == 1){
            j = 0;
          }
          else if(answer == 2){
            break;
          }
          sum = 0;
          j = 0;
        }
      }else{
       System.out.println("nota invalida");        
      }
    }
    ler.close();
  }
}