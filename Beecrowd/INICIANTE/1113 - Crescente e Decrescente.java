import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int aux = 1,num1 = 1, num2 = 1;
    while(aux == 1){
    num1 = ler.nextInt();
    num2 = ler.nextInt();
    if (num1 == num2){
    break;  
    }
    if (num1 > num2){
      System.out.println("Decrescente");
    }else{
      System.out.println("Crescente");    
    }
    }
    ler.close();
  }
}