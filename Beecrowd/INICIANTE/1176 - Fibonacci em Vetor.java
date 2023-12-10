import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int amount, i, j, num; 
    long ant, antt, atual;
    amount = ler.nextInt();
    for(i=1;i<=amount;i++){
      num = ler.nextInt();
      antt = 0;
      ant = 1;
      atual = 0;
      for(j=1;j<=num;j++){      
        antt = ant;
        ant = atual;    
        atual = antt + ant;
      }
      System.out.printf("Fib(%d) = %d%n", num, atual);
    }
    ler.close();
  }
}