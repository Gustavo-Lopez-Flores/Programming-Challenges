import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i = 1, amount, prev = 0, prevv = 1, current = 0;
    amount = ler.nextInt();
    for(i = 1; i <= amount-1; i++){
      System.out.printf("%d ", current);
      current = prevv + prev;
      prevv = prev;
      prev = current;
      if(i == amount -1){
        System.out.println(current);    
      }
    }  
    ler.close();
  }
}