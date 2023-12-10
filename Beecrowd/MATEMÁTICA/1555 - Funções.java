import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void quemVenceu(int x, int y){
    int r = (int)Math.pow((3*x),2) + (int)Math.pow(y,2);
    int b = 2 * (int)Math.pow(x,2) + (int)Math.pow((5*y),2);
    int c = (-100*x) + (int)Math.pow(y,3);
    
    if(r > b && r > c){
      System.out.println("Rafael ganhou");    
    }else if(b > r && b > c){
      System.out.println("Beto ganhou");    
    }else{
      System.out.println("Carlos ganhou");
    }
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n = ler.nextInt();
  
    for(int i = 0; i < n; i++){
      int x = ler.nextInt();
      int y = ler.nextInt();

      quemVenceu(x,y);
    }
  
    ler.close();
  }
}