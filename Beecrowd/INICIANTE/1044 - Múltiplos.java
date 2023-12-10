import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int a = ler.nextInt();
    int b = ler.nextInt(); 
    if((((b / a) * a) - b) == 0 || (((a / b) * b) - a) == 0){
    System.out.println("Sao Multiplos");    
    } else{
    System.out.println("Nao sao Multiplos");    
    }
    ler.close();
  }
}