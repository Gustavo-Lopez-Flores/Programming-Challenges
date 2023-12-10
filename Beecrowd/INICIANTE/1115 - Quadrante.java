import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
      int aux = 0, num1, num2;
      while(aux == 0){
        num1 = ler.nextInt();
        num2 = ler.nextInt();
        if(num1 == 0 || num2 == 0){
          break;
        }else{
          if(num1 > 0 && num2 > 0){
            System.out.println("primeiro");
          }else if (num1 < 0 && num2 > 0){
            System.out.println("segundo");        
          }else if (num1 < 0 && num2 < 0){
            System.out.println("terceiro");
          }else if (num1 > 0 && num2 < 0){
            System.out.println("quarto");        
          }
        }
      }
    ler.close();
  }
}