import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    int amount, i, t = 0;
    int vet[] = new int[1000]; 
    amount = ler.nextInt();
    for(i=0;i<1000;i++){
      if(i % amount == 0){   
        t = 0;
      }
      vet[i] = t;
      t++;
      System.out.printf("N[%d] = %d%n", i, vet[i]);
    }
    ler.close();
  }
}